package fi;

import di.ga;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n5 implements RequestDelegate {
    public final int f12301a;
    public final p6 f12302b;

    public n5(p6 p6Var, int i7) {
        this.f12301a = i7;
        this.f12302b = p6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12301a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    p6 p6Var = this.f12302b;
                    mp.u1(p6Var.f12382a).U3(updates.updates, updates.users, updates.chats, false, updates.date);
                    org.telegram.messenger.g0.g3(new u5(p6Var, 1));
                    return;
                }
                return;
            case 1:
                final p6 p6Var2 = this.f12302b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                p6 p6Var3 = p6Var2;
                                HashSet hashSet = p6Var3.L;
                                int i7 = p6Var3.f12382a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    mp.u1(i7).f4(tL_contacts_blocked.users, false);
                                    mp.u1(i7).Z3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked.peer_id)));
                                    }
                                    p6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    p6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    mp.u1(i7).f4(tL_contacts_blockedSlice.users, false);
                                    mp.u1(i7).Z3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    p6Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < p6Var3.N) {
                                        z10 = false;
                                    }
                                    p6Var3.O = z10;
                                } else {
                                    return;
                                }
                                ks.f(i7).k(198, new Object[0]);
                                p6Var3.P = false;
                                p6Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                p6 p6Var4 = p6Var2;
                                int i12 = p6Var4.f12382a;
                                ArrayList arrayList3 = p6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    mp.u1(i12).Z3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(mp.n1(chat));
                                    }
                                }
                                p6Var4.U = false;
                                p6Var4.V = true;
                                ks.f(i12).k(200, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final p6 p6Var3 = this.f12302b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                p6 p6Var32 = p6Var3;
                                HashSet hashSet = p6Var32.L;
                                int i7 = p6Var32.f12382a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    mp.u1(i7).f4(tL_contacts_blocked.users, false);
                                    mp.u1(i7).Z3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked.peer_id)));
                                    }
                                    p6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    p6Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    mp.u1(i7).f4(tL_contacts_blockedSlice.users, false);
                                    mp.u1(i7).Z3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    p6Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < p6Var32.N) {
                                        z10 = false;
                                    }
                                    p6Var32.O = z10;
                                } else {
                                    return;
                                }
                                ks.f(i7).k(198, new Object[0]);
                                p6Var32.P = false;
                                p6Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                p6 p6Var4 = p6Var3;
                                int i12 = p6Var4.f12382a;
                                ArrayList arrayList3 = p6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    mp.u1(i12).Z3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(mp.n1(chat));
                                    }
                                }
                                p6Var4.U = false;
                                p6Var4.V = true;
                                ks.f(i12).k(200, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                p6 p6Var4 = this.f12302b;
                p6Var4.getClass();
                org.telegram.messenger.g0.g3(new u5(p6Var4, 0));
                return;
            case 4:
                p6 p6Var5 = this.f12302b;
                p6Var5.getClass();
                if (tL_error == null) {
                    org.telegram.messenger.g0.g3(new u5(p6Var5, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new ga(this.f12302b, tLObject, tL_error, 4));
                return;
        }
    }
}
