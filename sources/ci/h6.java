package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h6 implements RequestDelegate {
    public final int f5464a;
    public final i7 f5465b;

    public h6(i7 i7Var, int i10) {
        this.f5464a = i10;
        this.f5465b = i7Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5464a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    i7 i7Var = this.f5465b;
                    MessagesController.getInstance(i7Var.f5491a).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new n6(i7Var, 1));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.l0(this.f5465b, tLObject, tL_error, 22));
                return;
            case 2:
                final i7 i7Var2 = this.f5465b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i7 i7Var3 = i7Var2;
                                HashSet hashSet = i7Var3.L;
                                int i10 = i7Var3.f5491a;
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
                                    i7Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    i7Var3.O = true;
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
                                    i7Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < i7Var3.N) {
                                        z10 = false;
                                    }
                                    i7Var3.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                i7Var3.P = false;
                                i7Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                i7 i7Var4 = i7Var2;
                                int i13 = i7Var4.f5491a;
                                ArrayList arrayList3 = i7Var4.T;
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
                                i7Var4.U = false;
                                i7Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                final i7 i7Var3 = this.f5465b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i7 i7Var32 = i7Var3;
                                HashSet hashSet = i7Var32.L;
                                int i10 = i7Var32.f5491a;
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
                                    i7Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    i7Var32.O = true;
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
                                    i7Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < i7Var32.N) {
                                        z10 = false;
                                    }
                                    i7Var32.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                i7Var32.P = false;
                                i7Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                i7 i7Var4 = i7Var3;
                                int i13 = i7Var4.f5491a;
                                ArrayList arrayList3 = i7Var4.T;
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
                                i7Var4.U = false;
                                i7Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 4:
                i7 i7Var4 = this.f5465b;
                i7Var4.getClass();
                AndroidUtilities.runOnUIThread(new n6(i7Var4, 0));
                return;
            default:
                i7 i7Var5 = this.f5465b;
                i7Var5.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new n6(i7Var5, 0));
                    return;
                }
                return;
        }
    }
}
