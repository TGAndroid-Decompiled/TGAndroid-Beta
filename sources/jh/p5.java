package jh;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class p5 implements RequestDelegate {

    public final int f13823a;

    public final s6 f13824b;

    public p5(s6 s6Var, int i10) {
        this.f13823a = i10;
        this.f13824b = s6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        switch (this.f13823a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    s6 s6Var = this.f13824b;
                    MessagesController.getInstance(s6Var.f13955a).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new v5(s6Var, 1));
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new j3.m(this.f13824b, tLObject, tL_error, 5));
                break;
            case 2:
                final int i10 = 1;
                final s6 s6Var2 = this.f13824b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                s6 s6Var3 = s6Var2;
                                HashSet hashSet = s6Var3.L;
                                int i11 = s6Var3.f13955a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i11).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i11).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    s6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    s6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i11).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i11).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i13);
                                        i13++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    s6Var3.N = tL_contacts_blockedSlice.count;
                                    s6Var3.O = hashSet.size() >= s6Var3.N;
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                s6Var3.P = false;
                                s6Var3.Q = System.currentTimeMillis();
                                break;
                            default:
                                s6 s6Var4 = s6Var2;
                                int i14 = s6Var4.f13955a;
                                ArrayList arrayList3 = s6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i14).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i15);
                                        i15++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                s6Var4.U = false;
                                s6Var4.V = true;
                                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i11 = 0;
                final s6 s6Var3 = this.f13824b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                s6 s6Var4 = s6Var3;
                                HashSet hashSet = s6Var4.L;
                                int i12 = s6Var4.f13955a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i12).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i12).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i13);
                                        i13++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    s6Var4.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    s6Var4.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i12).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i12).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    while (i14 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i14);
                                        i14++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    s6Var4.N = tL_contacts_blockedSlice.count;
                                    s6Var4.O = hashSet.size() >= s6Var4.N;
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                s6Var4.P = false;
                                s6Var4.Q = System.currentTimeMillis();
                                break;
                            default:
                                s6 s6Var5 = s6Var3;
                                int i15 = s6Var5.f13955a;
                                ArrayList arrayList3 = s6Var5.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i15).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i16 = 0;
                                    while (i16 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i16);
                                        i16++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                s6Var5.U = false;
                                s6Var5.V = true;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 4:
                s6 s6Var4 = this.f13824b;
                s6Var4.getClass();
                AndroidUtilities.runOnUIThread(new v5(s6Var4, 0));
                break;
            default:
                s6 s6Var5 = this.f13824b;
                s6Var5.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new v5(s6Var5, 0));
                }
                break;
        }
    }
}
