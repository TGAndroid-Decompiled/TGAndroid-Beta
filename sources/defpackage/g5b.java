package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g5b implements RequestDelegate {
    public final byte a;
    public final c6b b;

    public g5b(c6b c6bVar, byte b) {
        this.a = b;
        this.b = c6bVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final c6b c6bVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        boolean z = true;
                        TLObject tLObject2 = tLObject;
                        c6b c6bVar2 = c6bVar;
                        switch (b2) {
                            case 0:
                                HashSet hashSet = c6bVar2.L;
                                int i = c6bVar2.a;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    uc7.s1(i).j4(tL_contacts_blocked.users, false);
                                    uc7.s1(i).c4(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i2);
                                        i2++;
                                        hashSet.add(Long.valueOf(wf3.n(tL_peerBlocked.peer_id)));
                                    }
                                    c6bVar2.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    c6bVar2.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    uc7.s1(i).j4(tL_contacts_blockedSlice.users, false);
                                    uc7.s1(i).c4(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i3);
                                        i3++;
                                        hashSet.add(Long.valueOf(wf3.n(tL_peerBlocked2.peer_id)));
                                    }
                                    c6bVar2.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < c6bVar2.N) {
                                        z = false;
                                    }
                                    c6bVar2.O = z;
                                } else {
                                    return;
                                }
                                jn7.f(i).k(199, new Object[0]);
                                c6bVar2.P = false;
                                c6bVar2.Q = System.currentTimeMillis();
                                return;
                            default:
                                int i4 = c6bVar2.a;
                                ArrayList arrayList3 = c6bVar2.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject2).chats;
                                    uc7.s1(i4).c4(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i5);
                                        i5++;
                                        arrayList3.add(uc7.l1(chat));
                                    }
                                }
                                c6bVar2.U = false;
                                c6bVar2.V = true;
                                jn7.f(i4).k(201, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        boolean z = true;
                        TLObject tLObject2 = tLObject;
                        c6b c6bVar2 = c6bVar;
                        switch (b2) {
                            case 0:
                                HashSet hashSet = c6bVar2.L;
                                int i = c6bVar2.a;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    uc7.s1(i).j4(tL_contacts_blocked.users, false);
                                    uc7.s1(i).c4(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i2);
                                        i2++;
                                        hashSet.add(Long.valueOf(wf3.n(tL_peerBlocked.peer_id)));
                                    }
                                    c6bVar2.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    c6bVar2.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    uc7.s1(i).j4(tL_contacts_blockedSlice.users, false);
                                    uc7.s1(i).c4(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i3);
                                        i3++;
                                        hashSet.add(Long.valueOf(wf3.n(tL_peerBlocked2.peer_id)));
                                    }
                                    c6bVar2.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < c6bVar2.N) {
                                        z = false;
                                    }
                                    c6bVar2.O = z;
                                } else {
                                    return;
                                }
                                jn7.f(i).k(199, new Object[0]);
                                c6bVar2.P = false;
                                c6bVar2.Q = System.currentTimeMillis();
                                return;
                            default:
                                int i4 = c6bVar2.a;
                                ArrayList arrayList3 = c6bVar2.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject2).chats;
                                    uc7.s1(i4).c4(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i5);
                                        i5++;
                                        arrayList3.add(uc7.l1(chat));
                                    }
                                }
                                c6bVar2.U = false;
                                c6bVar2.V = true;
                                jn7.f(i4).k(201, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 2:
                c6bVar.getClass();
                hl.c3(new f5b(c6bVar, (byte) 1));
                return;
            case 3:
                c6bVar.getClass();
                if (tL_error == null) {
                    hl.c3(new f5b(c6bVar, (byte) 1));
                    return;
                }
                return;
            case 4:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    uc7.s1(c6bVar.a).X3(updates.updates, updates.users, updates.chats, false, updates.date);
                    hl.c3(new f5b(c6bVar, (byte) 0));
                    return;
                }
                return;
            default:
                hl.c3(new pwa(c6bVar, tLObject, tL_error, (byte) 8));
                return;
        }
    }
}
