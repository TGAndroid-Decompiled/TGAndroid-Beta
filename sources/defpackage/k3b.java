package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k3b implements RequestDelegate {
    public final byte a;
    public final h4b b;

    public k3b(h4b h4bVar, byte b) {
        this.a = b;
        this.b = h4bVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final h4b h4bVar = this.b;
        switch (b) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    oc7.r1(h4bVar.a).S3(updates.updates, updates.users, updates.chats, false, updates.date);
                    gm.c3(new o3b(h4bVar, (byte) 1));
                    return;
                }
                return;
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        boolean z = true;
                        TLObject tLObject2 = tLObject;
                        h4b h4bVar2 = h4bVar;
                        switch (b2) {
                            case 0:
                                HashSet hashSet = h4bVar2.L;
                                int i = h4bVar2.a;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    oc7.r1(i).d4(tL_contacts_blocked.users, false);
                                    oc7.r1(i).X3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i2);
                                        i2++;
                                        hashSet.add(Long.valueOf(pg3.n(tL_peerBlocked.peer_id)));
                                    }
                                    h4bVar2.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    h4bVar2.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    oc7.r1(i).d4(tL_contacts_blockedSlice.users, false);
                                    oc7.r1(i).X3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i3);
                                        i3++;
                                        hashSet.add(Long.valueOf(pg3.n(tL_peerBlocked2.peer_id)));
                                    }
                                    h4bVar2.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < h4bVar2.N) {
                                        z = false;
                                    }
                                    h4bVar2.O = z;
                                } else {
                                    return;
                                }
                                nm7.f(i).k(199, new Object[0]);
                                h4bVar2.P = false;
                                h4bVar2.Q = System.currentTimeMillis();
                                return;
                            default:
                                int i4 = h4bVar2.a;
                                ArrayList arrayList3 = h4bVar2.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject2).chats;
                                    oc7.r1(i4).X3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i5);
                                        i5++;
                                        arrayList3.add(oc7.k1(chat));
                                    }
                                }
                                h4bVar2.U = false;
                                h4bVar2.V = true;
                                nm7.f(i4).k(201, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 2:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        boolean z = true;
                        TLObject tLObject2 = tLObject;
                        h4b h4bVar2 = h4bVar;
                        switch (b2) {
                            case 0:
                                HashSet hashSet = h4bVar2.L;
                                int i = h4bVar2.a;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    oc7.r1(i).d4(tL_contacts_blocked.users, false);
                                    oc7.r1(i).X3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i2);
                                        i2++;
                                        hashSet.add(Long.valueOf(pg3.n(tL_peerBlocked.peer_id)));
                                    }
                                    h4bVar2.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    h4bVar2.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    oc7.r1(i).d4(tL_contacts_blockedSlice.users, false);
                                    oc7.r1(i).X3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i3);
                                        i3++;
                                        hashSet.add(Long.valueOf(pg3.n(tL_peerBlocked2.peer_id)));
                                    }
                                    h4bVar2.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < h4bVar2.N) {
                                        z = false;
                                    }
                                    h4bVar2.O = z;
                                } else {
                                    return;
                                }
                                nm7.f(i).k(199, new Object[0]);
                                h4bVar2.P = false;
                                h4bVar2.Q = System.currentTimeMillis();
                                return;
                            default:
                                int i4 = h4bVar2.a;
                                ArrayList arrayList3 = h4bVar2.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject2).chats;
                                    oc7.r1(i4).X3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i5);
                                        i5++;
                                        arrayList3.add(oc7.k1(chat));
                                    }
                                }
                                h4bVar2.U = false;
                                h4bVar2.V = true;
                                nm7.f(i4).k(201, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                h4bVar.getClass();
                gm.c3(new o3b(h4bVar, (byte) 0));
                return;
            case 4:
                h4bVar.getClass();
                if (tL_error == null) {
                    gm.c3(new o3b(h4bVar, (byte) 0));
                    return;
                }
                return;
            default:
                gm.c3(new j2b(h4bVar, tLObject, tL_error, (byte) 2));
                return;
        }
    }
}
