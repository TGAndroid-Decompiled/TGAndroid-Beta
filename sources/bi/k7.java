package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k7 implements RequestDelegate {
    public final int f3249a;
    public final x8 f3250b;

    public k7(x8 x8Var, int i10) {
        this.f3249a = i10;
        this.f3250b = x8Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3249a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    x8 x8Var = this.f3250b;
                    MessagesController.getInstance(x8Var.f3966a).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new v7(x8Var, 1));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.l0(this.f3250b, tLObject, tL_error, 7));
                return;
            case 2:
                final x8 x8Var2 = this.f3250b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x8 x8Var3 = x8Var2;
                                HashSet hashSet = x8Var3.L;
                                int i10 = x8Var3.f3966a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i10).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i10).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    x8Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    x8Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i10).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i10).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    x8Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < x8Var3.N) {
                                        z10 = false;
                                    }
                                    x8Var3.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                x8Var3.P = false;
                                x8Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                x8 x8Var4 = x8Var2;
                                int i13 = x8Var4.f3966a;
                                ArrayList arrayList3 = x8Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i13).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                x8Var4.U = false;
                                x8Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                final x8 x8Var3 = this.f3250b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                x8 x8Var32 = x8Var3;
                                HashSet hashSet = x8Var32.L;
                                int i10 = x8Var32.f3966a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i10).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i10).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    x8Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    x8Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i10).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i10).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    x8Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < x8Var32.N) {
                                        z10 = false;
                                    }
                                    x8Var32.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                x8Var32.P = false;
                                x8Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                x8 x8Var4 = x8Var3;
                                int i13 = x8Var4.f3966a;
                                ArrayList arrayList3 = x8Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i13).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                x8Var4.U = false;
                                x8Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 4:
                x8 x8Var4 = this.f3250b;
                x8Var4.getClass();
                AndroidUtilities.runOnUIThread(new v7(x8Var4, 0));
                return;
            default:
                x8 x8Var5 = this.f3250b;
                x8Var5.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new v7(x8Var5, 0));
                    return;
                }
                return;
        }
    }
}
