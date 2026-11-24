package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i1b implements RequestDelegate {
    public final byte a;
    public final g2b b;

    public i1b(g2b g2bVar, byte b) {
        this.a = b;
        this.b = g2bVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final g2b g2bVar = this.b;
        switch (b) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    na7.q1(g2bVar.a).P3(updates.updates, updates.users, updates.chats, false, updates.date);
                    gl.d3(new m1b(g2bVar, (byte) 1));
                    return;
                }
                return;
            case 1:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        boolean z = true;
                        TLObject tLObject2 = tLObject;
                        g2b g2bVar2 = g2bVar;
                        switch (b2) {
                            case 0:
                                HashSet hashSet = g2bVar2.L;
                                int i = g2bVar2.a;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    na7.q1(i).a4(tL_contacts_blocked.users, false);
                                    na7.q1(i).U3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i2);
                                        i2++;
                                        hashSet.add(Long.valueOf(cf3.n(tL_peerBlocked.peer_id)));
                                    }
                                    g2bVar2.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    g2bVar2.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    na7.q1(i).a4(tL_contacts_blockedSlice.users, false);
                                    na7.q1(i).U3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i3);
                                        i3++;
                                        hashSet.add(Long.valueOf(cf3.n(tL_peerBlocked2.peer_id)));
                                    }
                                    g2bVar2.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < g2bVar2.N) {
                                        z = false;
                                    }
                                    g2bVar2.O = z;
                                } else {
                                    return;
                                }
                                kk7.f(i).k(198, new Object[0]);
                                g2bVar2.P = false;
                                g2bVar2.Q = System.currentTimeMillis();
                                return;
                            default:
                                int i4 = g2bVar2.a;
                                ArrayList arrayList3 = g2bVar2.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject2).chats;
                                    na7.q1(i4).U3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i5);
                                        i5++;
                                        arrayList3.add(na7.j1(chat));
                                    }
                                }
                                g2bVar2.U = false;
                                g2bVar2.V = true;
                                kk7.f(i4).k(200, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 2:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        boolean z = true;
                        TLObject tLObject2 = tLObject;
                        g2b g2bVar2 = g2bVar;
                        switch (b2) {
                            case 0:
                                HashSet hashSet = g2bVar2.L;
                                int i = g2bVar2.a;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    na7.q1(i).a4(tL_contacts_blocked.users, false);
                                    na7.q1(i).U3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i2);
                                        i2++;
                                        hashSet.add(Long.valueOf(cf3.n(tL_peerBlocked.peer_id)));
                                    }
                                    g2bVar2.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    g2bVar2.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    na7.q1(i).a4(tL_contacts_blockedSlice.users, false);
                                    na7.q1(i).U3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i3);
                                        i3++;
                                        hashSet.add(Long.valueOf(cf3.n(tL_peerBlocked2.peer_id)));
                                    }
                                    g2bVar2.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < g2bVar2.N) {
                                        z = false;
                                    }
                                    g2bVar2.O = z;
                                } else {
                                    return;
                                }
                                kk7.f(i).k(198, new Object[0]);
                                g2bVar2.P = false;
                                g2bVar2.Q = System.currentTimeMillis();
                                return;
                            default:
                                int i4 = g2bVar2.a;
                                ArrayList arrayList3 = g2bVar2.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject2).chats;
                                    na7.q1(i4).U3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i5);
                                        i5++;
                                        arrayList3.add(na7.j1(chat));
                                    }
                                }
                                g2bVar2.U = false;
                                g2bVar2.V = true;
                                kk7.f(i4).k(200, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                g2bVar.getClass();
                gl.d3(new m1b(g2bVar, (byte) 0));
                return;
            case 4:
                g2bVar.getClass();
                if (tL_error == null) {
                    gl.d3(new m1b(g2bVar, (byte) 0));
                    return;
                }
                return;
            default:
                gl.d3(new q3a(g2bVar, tLObject, tL_error, (byte) 29));
                return;
        }
    }
}
