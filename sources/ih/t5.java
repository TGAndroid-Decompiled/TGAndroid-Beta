package ih;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t5 implements RequestDelegate {
    public final int f12165a;
    public final v6 f12166b;

    public t5(v6 v6Var, int i9) {
        this.f12165a = i9;
        this.f12166b = v6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12165a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    v6 v6Var = this.f12166b;
                    MessagesController.getInstance(v6Var.f12236a).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new z5(v6Var, 1));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h3(this.f12166b, tLObject, tL_error, 3));
                return;
            case 2:
                final v6 v6Var2 = this.f12166b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v6 v6Var3 = v6Var2;
                                HashSet hashSet = v6Var3.L;
                                int i9 = v6Var3.f12236a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i9).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i9).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    v6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    v6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i9).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i9).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    v6Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < v6Var3.N) {
                                        z10 = false;
                                    }
                                    v6Var3.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                v6Var3.P = false;
                                v6Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                v6 v6Var4 = v6Var2;
                                int i12 = v6Var4.f12236a;
                                ArrayList arrayList3 = v6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i12).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                v6Var4.U = false;
                                v6Var4.V = true;
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                final v6 v6Var3 = this.f12166b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v6 v6Var32 = v6Var3;
                                HashSet hashSet = v6Var32.L;
                                int i9 = v6Var32.f12236a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i9).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i9).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    v6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    v6Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i9).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i9).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    v6Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < v6Var32.N) {
                                        z10 = false;
                                    }
                                    v6Var32.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                v6Var32.P = false;
                                v6Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                v6 v6Var4 = v6Var3;
                                int i12 = v6Var4.f12236a;
                                ArrayList arrayList3 = v6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i12).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                v6Var4.U = false;
                                v6Var4.V = true;
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 4:
                v6 v6Var4 = this.f12166b;
                v6Var4.getClass();
                AndroidUtilities.runOnUIThread(new z5(v6Var4, 0));
                return;
            default:
                v6 v6Var5 = this.f12166b;
                v6Var5.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new z5(v6Var5, 0));
                    return;
                }
                return;
        }
    }
}
