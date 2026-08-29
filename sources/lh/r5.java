package lh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r5 implements RequestDelegate {
    public final int f16165a;
    public final s6 f16166b;

    public r5(s6 s6Var, int i10) {
        this.f16165a = i10;
        this.f16166b = s6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16165a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    s6 s6Var = this.f16166b;
                    MessagesController.getInstance(s6Var.f16218a).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new w5(s6Var, 1));
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new l3.m(this.f16166b, tLObject, tL_error, 5));
                return;
            case 2:
                final s6 s6Var2 = this.f16166b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s6 s6Var3 = s6Var2;
                                HashSet hashSet = s6Var3.L;
                                int i10 = s6Var3.f16218a;
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
                                    s6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    s6Var3.O = true;
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
                                    s6Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < s6Var3.N) {
                                        z10 = false;
                                    }
                                    s6Var3.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                s6Var3.P = false;
                                s6Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                s6 s6Var4 = s6Var2;
                                int i13 = s6Var4.f16218a;
                                ArrayList arrayList3 = s6Var4.T;
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
                                s6Var4.U = false;
                                s6Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                final s6 s6Var3 = this.f16166b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s6 s6Var32 = s6Var3;
                                HashSet hashSet = s6Var32.L;
                                int i10 = s6Var32.f16218a;
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
                                    s6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    s6Var32.O = true;
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
                                    s6Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < s6Var32.N) {
                                        z10 = false;
                                    }
                                    s6Var32.O = z10;
                                } else {
                                    return;
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                s6Var32.P = false;
                                s6Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                s6 s6Var4 = s6Var3;
                                int i13 = s6Var4.f16218a;
                                ArrayList arrayList3 = s6Var4.T;
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
                                s6Var4.U = false;
                                s6Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 4:
                s6 s6Var4 = this.f16166b;
                s6Var4.getClass();
                AndroidUtilities.runOnUIThread(new w5(s6Var4, 0));
                return;
            default:
                s6 s6Var5 = this.f16166b;
                s6Var5.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new w5(s6Var5, 0));
                    return;
                }
                return;
        }
    }
}
