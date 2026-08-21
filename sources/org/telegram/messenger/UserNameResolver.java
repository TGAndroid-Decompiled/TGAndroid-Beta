package org.telegram.messenger;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;

public class UserNameResolver {
    private static final long CACHE_TIME = 3600000;
    private final int currentAccount;
    android.util.LruCache<String, CachedPeer> resolvedCache = new android.util.LruCache<>(100);
    HashMap<String, ArrayList<Consumer>> resolvingConsumers = new HashMap<>();

    UserNameResolver(int i) {
        this.currentAccount = i;
    }

    public Runnable resolve(String str, Consumer consumer) {
        return resolve(str, null, consumer);
    }

    public Runnable resolve(String str, String str2, Consumer consumer) {
        return resolve(str, str2, false, consumer);
    }

    public Runnable resolve(final String str, String str2, boolean z, Consumer consumer) {
        TLObject tLObject;
        CachedPeer cachedPeer;
        if (TextUtils.isEmpty(str2) && !z && (cachedPeer = this.resolvedCache.get(str)) != null) {
            if (System.currentTimeMillis() - cachedPeer.time < 3600000) {
                consumer.accept(Long.valueOf(cachedPeer.peerId));
                FileLog.d("resolve username from cache " + str + " " + cachedPeer.peerId);
                return null;
            }
            this.resolvedCache.remove(str);
        }
        ArrayList<Consumer> arrayList = this.resolvingConsumers.get(str);
        if (arrayList != null) {
            arrayList.add(consumer);
            return null;
        }
        ArrayList<Consumer> arrayList2 = new ArrayList<>();
        arrayList2.add(consumer);
        this.resolvingConsumers.put(str, arrayList2);
        if (AndroidUtilities.isNumeric(str)) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = str;
            tLObject = tL_contacts_resolvePhone;
        } else {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            if (!TextUtils.isEmpty(str2)) {
                tL_contacts_resolveUsername.flags |= 1;
                tL_contacts_resolveUsername.referer = str2;
            }
            tLObject = tL_contacts_resolveUsername;
        }
        final int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                UserNameResolver.m1095$r8$lambda$1Yk5ZpB3LxtubF9sBJ2DTAOZIo(this.f$0, str, tLObject2, tL_error);
            }
        });
        return new Runnable() {
            @Override
            public final void run() {
                UserNameResolver.$r8$lambda$SwNCHeKztFg6UdM4dVAQNfxrqnM(this.f$0, str, iSendRequest);
            }
        };
    }

    public static void m1095$r8$lambda$1Yk5ZpB3LxtubF9sBJ2DTAOZIo(final UserNameResolver userNameResolver, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        userNameResolver.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserNameResolver.m1096$r8$lambda$N_TP1RdEDy8CFh9lbHlZ7xPnqw(this.f$0, str, tL_error, tLObject);
            }
        }, 2L);
    }

    public static void m1096$r8$lambda$N_TP1RdEDy8CFh9lbHlZ7xPnqw(UserNameResolver userNameResolver, String str, TLRPC.TL_error tL_error, TLObject tLObject) {
        BaseFragment lastFragment;
        ArrayList<Consumer> arrayListRemove = userNameResolver.resolvingConsumers.remove(str);
        if (arrayListRemove == null) {
            return;
        }
        int i = 0;
        if (tL_error != null) {
            String str2 = tL_error.text;
            if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                while (i < arrayListRemove.size()) {
                    arrayListRemove.get(i).accept(Long.MAX_VALUE);
                    i++;
                }
                return;
            }
            while (i < arrayListRemove.size()) {
                arrayListRemove.get(i).accept(null);
                i++;
            }
            String str3 = tL_error.text;
            if (str3 == null || !str3.contains("FLOOD_WAIT") || (lastFragment = LaunchActivity.getLastFragment()) == null) {
                return;
            }
            BulletinFactory.of(lastFragment).createErrorBulletin(LocaleController.getString(R.string.FloodWait)).show();
            return;
        }
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(userNameResolver.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(userNameResolver.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(userNameResolver.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
        long peerId = MessageObject.getPeerId(tL_contacts_resolvedPeer.peer);
        userNameResolver.resolvedCache.put(str, userNameResolver.new CachedPeer(peerId));
        while (i < arrayListRemove.size()) {
            arrayListRemove.get(i).accept(Long.valueOf(peerId));
            i++;
        }
    }

    public static void $r8$lambda$SwNCHeKztFg6UdM4dVAQNfxrqnM(UserNameResolver userNameResolver, String str, int i) {
        userNameResolver.resolvingConsumers.remove(str);
        ConnectionsManager.getInstance(userNameResolver.currentAccount).cancelRequest(i, true);
    }

    public void update(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user == null || user2 == null || (str = user.username) == null || TextUtils.equals(str, user2.username)) {
            return;
        }
        this.resolvedCache.remove(user.username);
        String str2 = user2.username;
        if (str2 != null) {
            this.resolvedCache.put(str2, new CachedPeer(user2.id));
        }
    }

    public void update(TLRPC.Chat chat, TLRPC.Chat chat2) {
        String str;
        if (chat == null || chat2 == null || (str = chat.username) == null || TextUtils.equals(str, chat2.username)) {
            return;
        }
        this.resolvedCache.remove(chat.username);
        String str2 = chat2.username;
        if (str2 != null) {
            this.resolvedCache.put(str2, new CachedPeer(-chat2.id));
        }
    }

    class CachedPeer {
        final long peerId;
        final long time = System.currentTimeMillis();

        public CachedPeer(long j) {
            this.peerId = j;
        }
    }
}
