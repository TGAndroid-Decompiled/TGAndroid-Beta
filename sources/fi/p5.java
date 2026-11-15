package fi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p5 implements RequestDelegate {
    public final int f12175a;
    public final s6 f12176b;

    public p5(s6 s6Var, int i7) {
        this.f12175a = i7;
        this.f12176b = s6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12175a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    s6 s6Var = this.f12176b;
                    np.s1(s6Var.f12319a).N3(updates.updates, updates.users, updates.chats, false, updates.date);
                    org.telegram.messenger.g0.h3(new x5(s6Var, 1));
                    return;
                }
                return;
            case 1:
                final s6 s6Var2 = this.f12176b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s6 s6Var3 = s6Var2;
                                HashSet hashSet = s6Var3.L;
                                int i7 = s6Var3.f12319a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    np.s1(i7).Y3(tL_contacts_blocked.users, false);
                                    np.s1(i7).S3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked.peer_id)));
                                    }
                                    s6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    s6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    np.s1(i7).Y3(tL_contacts_blockedSlice.users, false);
                                    np.s1(i7).S3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    s6Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < s6Var3.N) {
                                        z10 = false;
                                    }
                                    s6Var3.O = z10;
                                } else {
                                    return;
                                }
                                ns.f(i7).k(196, new Object[0]);
                                s6Var3.P = false;
                                s6Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                s6 s6Var4 = s6Var2;
                                int i12 = s6Var4.f12319a;
                                ArrayList arrayList3 = s6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    np.s1(i12).S3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(np.l1(chat));
                                    }
                                }
                                s6Var4.U = false;
                                s6Var4.V = true;
                                ns.f(i12).k(198, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final s6 s6Var3 = this.f12176b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s6 s6Var32 = s6Var3;
                                HashSet hashSet = s6Var32.L;
                                int i7 = s6Var32.f12319a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    np.s1(i7).Y3(tL_contacts_blocked.users, false);
                                    np.s1(i7).S3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i10);
                                        i10++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked.peer_id)));
                                    }
                                    s6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    s6Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    np.s1(i7).Y3(tL_contacts_blockedSlice.users, false);
                                    np.s1(i7).S3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    s6Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < s6Var32.N) {
                                        z10 = false;
                                    }
                                    s6Var32.O = z10;
                                } else {
                                    return;
                                }
                                ns.f(i7).k(196, new Object[0]);
                                s6Var32.P = false;
                                s6Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                s6 s6Var4 = s6Var3;
                                int i12 = s6Var4.f12319a;
                                ArrayList arrayList3 = s6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    np.s1(i12).S3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i13);
                                        i13++;
                                        arrayList3.add(np.l1(chat));
                                    }
                                }
                                s6Var4.U = false;
                                s6Var4.V = true;
                                ns.f(i12).k(198, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                s6 s6Var4 = this.f12176b;
                s6Var4.getClass();
                org.telegram.messenger.g0.h3(new x5(s6Var4, 0));
                return;
            case 4:
                s6 s6Var5 = this.f12176b;
                s6Var5.getClass();
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new x5(s6Var5, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new s5((Object) this.f12176b, (Object) tLObject, (Object) tL_error, 0));
                return;
        }
    }
}
