package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y5 implements RequestDelegate {
    public final int f9956a;
    public final z6 f9957b;

    public y5(z6 z6Var, int i7) {
        this.f9956a = i7;
        this.f9957b = z6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9956a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    z6 z6Var = this.f9957b;
                    qp.s1(z6Var.f9992a).N3(updates.updates, updates.users, updates.chats, false, updates.date);
                    org.telegram.messenger.g0.h3(new f6(z6Var, 1));
                    return;
                }
                return;
            case 1:
                final z6 z6Var2 = this.f9957b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                z6 z6Var3 = z6Var2;
                                HashSet hashSet = z6Var3.L;
                                int i7 = z6Var3.f9992a;
                                TLObject tLObject2 = tLObject;
                                boolean z9 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    qp.s1(i7).Y3(tL_contacts_blocked.users, false);
                                    qp.s1(i7).S3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked.peer_id)));
                                    }
                                    z6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    z6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    qp.s1(i7).Y3(tL_contacts_blockedSlice.users, false);
                                    qp.s1(i7).S3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    z6Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < z6Var3.N) {
                                        z9 = false;
                                    }
                                    z6Var3.O = z9;
                                } else {
                                    return;
                                }
                                qs.f(i7).k(196, new Object[0]);
                                z6Var3.P = false;
                                z6Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                z6 z6Var4 = z6Var2;
                                int i12 = z6Var4.f9992a;
                                ArrayList arrayList3 = z6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    qp.s1(i12).S3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(qp.l1(chat));
                                    }
                                }
                                z6Var4.U = false;
                                z6Var4.V = true;
                                qs.f(i12).k(198, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final z6 z6Var3 = this.f9957b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                z6 z6Var32 = z6Var3;
                                HashSet hashSet = z6Var32.L;
                                int i7 = z6Var32.f9992a;
                                TLObject tLObject2 = tLObject;
                                boolean z9 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    qp.s1(i7).Y3(tL_contacts_blocked.users, false);
                                    qp.s1(i7).S3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked.peer_id)));
                                    }
                                    z6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    z6Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    qp.s1(i7).Y3(tL_contacts_blockedSlice.users, false);
                                    qp.s1(i7).S3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    z6Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < z6Var32.N) {
                                        z9 = false;
                                    }
                                    z6Var32.O = z9;
                                } else {
                                    return;
                                }
                                qs.f(i7).k(196, new Object[0]);
                                z6Var32.P = false;
                                z6Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                z6 z6Var4 = z6Var3;
                                int i12 = z6Var4.f9992a;
                                ArrayList arrayList3 = z6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    qp.s1(i12).S3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(qp.l1(chat));
                                    }
                                }
                                z6Var4.U = false;
                                z6Var4.V = true;
                                qs.f(i12).k(198, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                z6 z6Var4 = this.f9957b;
                z6Var4.getClass();
                org.telegram.messenger.g0.h3(new f6(z6Var4, 0));
                return;
            case 4:
                z6 z6Var5 = this.f9957b;
                z6Var5.getClass();
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new f6(z6Var5, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new aa.s(this.f9957b, tLObject, tL_error, 25));
                return;
        }
    }
}
