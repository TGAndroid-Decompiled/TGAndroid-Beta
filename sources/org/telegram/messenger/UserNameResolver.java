package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class UserNameResolver {
    private static final long CACHE_TIME = 3600000;
    private final int currentAccount;
    android.util.LruCache<String, CachedPeer> resolvedCache = new android.util.LruCache<>(100);
    HashMap<String, ArrayList<Utilities.Callback<Long>>> resolvingConsumers = new HashMap<>();

    public class CachedPeer {
        final long peerId;
        final long time = System.currentTimeMillis();

        public CachedPeer(long j3) {
            UserNameResolver.this = r1;
            this.peerId = j3;
        }
    }

    public UserNameResolver(int i10) {
        this.currentAccount = i10;
    }

    public void lambda$resolve$0(String str, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.ActionBar.n2 R;
        ArrayList<Utilities.Callback<Long>> remove = this.resolvingConsumers.remove(str);
        if (remove != null) {
            int i10 = 0;
            if (tL_error != null) {
                String str2 = tL_error.text;
                if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                    while (i10 < remove.size()) {
                        remove.get(i10).run(Long.MAX_VALUE);
                        i10++;
                    }
                    return;
                }
                while (i10 < remove.size()) {
                    remove.get(i10).run(null);
                    i10++;
                }
                String str3 = tL_error.text;
                if (str3 != null && str3.contains("FLOOD_WAIT") && (R = LaunchActivity.R()) != null) {
                    z0.p(R.string.FloodWait, org.telegram.ui.Components.xc.a0(R), null);
                    return;
                }
                return;
            }
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
            long peerId = MessageObject.getPeerId(tL_contacts_resolvedPeer.peer);
            this.resolvedCache.put(str, new CachedPeer(peerId));
            while (i10 < remove.size()) {
                remove.get(i10).run(Long.valueOf(peerId));
                i10++;
            }
        }
    }

    public void lambda$resolve$1(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new zh(str, this, tLObject, tL_error), 2L);
    }

    public void lambda$resolve$2(String str, int i10) {
        this.resolvingConsumers.remove(str);
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i10, true);
    }

    public Runnable resolve(String str, Utilities.Callback<Long> callback) {
        return resolve(str, null, callback);
    }

    public void update(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user == null || user2 == null || (str = user.username) == null || TextUtils.equals(str, user2.username)) {
            return;
        }
        this.resolvedCache.remove(user.username);
        String str2 = user2.username;
        if (str2 != null) {
            this.resolvedCache.put(str2, new CachedPeer(user2.f18230id));
        }
    }

    public Runnable resolve(String str, String str2, Utilities.Callback<Long> callback) {
        return resolve(str, str2, false, callback);
    }

    public Runnable resolve(String str, String str2, boolean z10, Utilities.Callback<Long> callback) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        CachedPeer cachedPeer;
        if (TextUtils.isEmpty(str2) && !z10 && (cachedPeer = this.resolvedCache.get(str)) != null) {
            if (System.currentTimeMillis() - cachedPeer.time < 3600000) {
                callback.run(Long.valueOf(cachedPeer.peerId));
                StringBuilder sb2 = new StringBuilder("resolve username from cache ");
                sb2.append(str);
                sb2.append(" ");
                hg.c.w(sb2, cachedPeer.peerId);
                return null;
            }
            this.resolvedCache.remove(str);
        }
        ArrayList<Utilities.Callback<Long>> arrayList = this.resolvingConsumers.get(str);
        if (arrayList != null) {
            arrayList.add(callback);
            return null;
        }
        ArrayList<Utilities.Callback<Long>> arrayList2 = new ArrayList<>();
        arrayList2.add(callback);
        this.resolvingConsumers.put(str, arrayList2);
        if (AndroidUtilities.isNumeric(str)) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = str;
            tL_contacts_resolveUsername = tL_contacts_resolvePhone;
        } else {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername2 = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername2.username = str;
            if (!TextUtils.isEmpty(str2)) {
                tL_contacts_resolveUsername2.flags |= 1;
                tL_contacts_resolveUsername2.referer = str2;
            }
            tL_contacts_resolveUsername = tL_contacts_resolveUsername2;
        }
        return new q4(this, str, ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new t1(11, this, str)), 23);
    }

    public void update(TLRPC.Chat chat, TLRPC.Chat chat2) {
        String str;
        if (chat == null || chat2 == null || (str = chat.username) == null || TextUtils.equals(str, chat2.username)) {
            return;
        }
        this.resolvedCache.remove(chat.username);
        String str2 = chat2.username;
        if (str2 != null) {
            this.resolvedCache.put(str2, new CachedPeer(-chat2.f18083id));
        }
    }
}
