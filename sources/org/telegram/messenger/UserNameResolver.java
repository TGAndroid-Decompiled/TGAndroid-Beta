package org.telegram.messenger;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvePhone;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;

public class UserNameResolver {
    private static final long CACHE_TIME = 3600000;
    private final int currentAccount;
    android.util.LruCache<String, CachedPeer> resolvedCache = new android.util.LruCache<>(100);
    HashMap<String, ArrayList<Consumer>> resolvingConsumers = new HashMap<>();

    public class CachedPeer {
        final long peerId;
        final long time = System.currentTimeMillis();

        public CachedPeer(long j) {
            this.peerId = j;
        }
    }

    public UserNameResolver(int i) {
        this.currentAccount = i;
    }

    public void lambda$resolve$0(String str, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        BaseFragment lastFragment;
        ArrayList<Consumer> remove = this.resolvingConsumers.remove(str);
        if (remove == null) {
            return;
        }
        int i = 0;
        if (tLRPC$TL_error != null) {
            while (i < remove.size()) {
                remove.get(i).accept(null);
                i++;
            }
            String str2 = tLRPC$TL_error.text;
            if (str2 == null || !str2.contains("FLOOD_WAIT") || (lastFragment = LaunchActivity.getLastFragment()) == null) {
                return;
            }
            BulletinFactory.of(lastFragment).createErrorBulletin(LocaleController.getString(R.string.FloodWait)).show();
            return;
        }
        TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
        long peerId = MessageObject.getPeerId(tLRPC$TL_contacts_resolvedPeer.peer);
        this.resolvedCache.put(str, new CachedPeer(peerId));
        while (i < remove.size()) {
            remove.get(i).accept(Long.valueOf(peerId));
            i++;
        }
    }

    public void lambda$resolve$1(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserNameResolver.this.lambda$resolve$0(str, tLRPC$TL_error, tLObject);
            }
        }, 2L);
    }

    public void resolve(final String str, Consumer consumer) {
        TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername;
        CachedPeer cachedPeer = this.resolvedCache.get(str);
        if (cachedPeer != null) {
            if (System.currentTimeMillis() - cachedPeer.time < 3600000) {
                consumer.accept(Long.valueOf(cachedPeer.peerId));
                FileLog.d("resolve username from cache " + str + " " + cachedPeer.peerId);
                return;
            }
            this.resolvedCache.remove(str);
        }
        ArrayList<Consumer> arrayList = this.resolvingConsumers.get(str);
        if (arrayList != null) {
            arrayList.add(consumer);
            return;
        }
        ArrayList<Consumer> arrayList2 = new ArrayList<>();
        arrayList2.add(consumer);
        this.resolvingConsumers.put(str, arrayList2);
        if (AndroidUtilities.isNumeric(str)) {
            TLRPC$TL_contacts_resolvePhone tLRPC$TL_contacts_resolvePhone = new TLRPC$TL_contacts_resolvePhone();
            tLRPC$TL_contacts_resolvePhone.phone = str;
            tLRPC$TL_contacts_resolveUsername = tLRPC$TL_contacts_resolvePhone;
        } else {
            TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername2 = new TLRPC$TL_contacts_resolveUsername();
            tLRPC$TL_contacts_resolveUsername2.username = str;
            tLRPC$TL_contacts_resolveUsername = tLRPC$TL_contacts_resolveUsername2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                UserNameResolver.this.lambda$resolve$1(str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void update(TLRPC$Chat tLRPC$Chat, TLRPC$Chat tLRPC$Chat2) {
        String str;
        if (tLRPC$Chat == null || tLRPC$Chat2 == null || (str = tLRPC$Chat.username) == null || TextUtils.equals(str, tLRPC$Chat2.username)) {
            return;
        }
        this.resolvedCache.remove(tLRPC$Chat.username);
        String str2 = tLRPC$Chat2.username;
        if (str2 != null) {
            this.resolvedCache.put(str2, new CachedPeer(-tLRPC$Chat2.id));
        }
    }

    public void update(TLRPC$User tLRPC$User, TLRPC$User tLRPC$User2) {
        String str;
        if (tLRPC$User == null || tLRPC$User2 == null || (str = tLRPC$User.username) == null || TextUtils.equals(str, tLRPC$User2.username)) {
            return;
        }
        this.resolvedCache.remove(tLRPC$User.username);
        String str2 = tLRPC$User2.username;
        if (str2 != null) {
            this.resolvedCache.put(str2, new CachedPeer(tLRPC$User2.id));
        }
    }
}
