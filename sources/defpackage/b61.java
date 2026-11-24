package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class b61 implements Runnable {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public b61(hq6 hq6Var, ArrayList arrayList, long j, boolean z) {
        this.a = (byte) 3;
        this.d = hq6Var;
        this.e = arrayList;
        this.b = j;
        this.c = z;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.GroupCallParticipant groupCallParticipant = null;
        switch (this.a) {
            case 0:
                ((r61) this.d).p0(this.c, this.b, (h61) this.e);
                return;
            case 1:
                g15 g15Var = (g15) this.d;
                long j = this.b;
                boolean z = this.c;
                hj3 hj3Var = (hj3) this.e;
                g15Var.getClass();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                        g15Var.f = null;
                    } catch (Exception e) {
                        g15Var.m(e);
                        if (e instanceof e15) {
                            str = e.getMessage();
                        } else {
                            str = "STORAGE_BROKEN";
                        }
                        groupCallParticipant = str;
                        for (y05 y05Var : linkedHashMap.values()) {
                            y05Var.close();
                        }
                    }
                    try {
                        synchronized (g15.g) {
                            try {
                                g15Var.c(j);
                                f15 s = g15Var.s();
                                if (s.b != z || ((LinkedHashMap) s.e).isEmpty()) {
                                    if (z && !g15.i(g15Var.a)) {
                                        throw new Exception("AUTH_UNAVAILABLE");
                                    }
                                    if (!((LinkedHashMap) s.e).isEmpty()) {
                                        g15Var.b(j, false);
                                        for (String str2 : ((LinkedHashMap) s.e).keySet()) {
                                            linkedHashMap.put(str2, g15Var.h(s, str2, j));
                                        }
                                    }
                                    s.b = z;
                                    ((LinkedHashMap) s.e).clear();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        ((LinkedHashMap) s.e).put((String) entry.getKey(), g15Var.j(s, (String) entry.getKey(), (y05) entry.getValue(), arrayList, j));
                                    }
                                    s.c = false;
                                    synchronized (g15.g) {
                                        g15Var.c(j);
                                        g15Var.w(s, linkedHashMap);
                                        g15Var.d(s);
                                    }
                                }
                                for (y05 y05Var2 : linkedHashMap.values()) {
                                    y05Var2.close();
                                }
                                g15Var.e(arrayList);
                                gl.c3(new m77(g15Var, hj3Var, j, groupCallParticipant, (byte) 9));
                                return;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    for (y05 y05Var3 : linkedHashMap.values()) {
                        y05Var3.close();
                    }
                    g15Var.e(arrayList);
                    throw th3;
                }
                break;
            case 2:
                p66 p66Var = (p66) this.d;
                long j2 = this.b;
                String str3 = (String) this.e;
                boolean z2 = this.c;
                if (p66Var.x.d) {
                    n55 n55Var = p66Var.x.a;
                    int i = p66Var.a;
                    h75 h75Var = n55Var.a;
                    if (i == 0) {
                        TLRPC.Peer peer = h75Var.u2;
                        if (peer != null) {
                            h75Var.k3.a(h75Var.n1.a, k27.B1(peer), j2, str3, z2);
                            return;
                        }
                        return;
                    }
                    fc2 fc2Var = h75Var.T2;
                    if (fc2Var != null) {
                        groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.p.get(i);
                    }
                    if (groupCallParticipant != null) {
                        h75Var.k3.a(h75Var.n1.a, k27.B1(groupCallParticipant.peer), j2, str3, z2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hq6 hq6Var = (hq6) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                long j3 = this.b;
                boolean z3 = this.c;
                if (arrayList2 != null && j3 != 0) {
                    hq6Var.q0[z3 ? 1 : 0] = j3;
                }
                hq6Var.x0[z3 ? 1 : 0] = false;
                hq6Var.M0(z3, false);
                return;
            case 4:
                hq6 hq6Var2 = (hq6) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z4 = this.c;
                long j4 = this.b;
                if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    hq6Var2.u1(z4, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    gl.c3(new gn6(hq6Var2, z4, currentTimeMillis, (byte) 0));
                    hq6Var2.J1(z4, null, null, currentTimeMillis, j4, false);
                    return;
                } else {
                    hq6Var2.u1(z4, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j4);
                    return;
                }
            case 5:
                na7 na7Var = (na7) this.d;
                long j5 = this.b;
                boolean z5 = this.c;
                na7Var.q1.k((vf6) this.e, j5);
                if (z5) {
                    na7Var.r1.delete(j5);
                    na7Var.V2(j5, false);
                    na7Var.getNotificationCenter().k(109, Long.valueOf(j5));
                    return;
                }
                return;
            case 6:
                na7 na7Var2 = (na7) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z6 = this.c;
                long j6 = this.b;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList3 = ((TLRPC.messages_Chats) tLObject2).chats;
                    na7Var2.V3(arrayList3, false);
                    p97 p97Var = new p97();
                    p97Var.a = z6;
                    p97Var.b.addAll(arrayList3);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        p97Var.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList3.size());
                    } else if (!na7Var2.getUserConfig().p()) {
                        boolean z7 = w01.a;
                    }
                    na7Var2.M4.put(Long.valueOf(j6), p97Var);
                    na7Var2.getNotificationCenter().k(203, Long.valueOf(j6));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList4 = ((TLRPC.Users) tLObject2).users;
                    na7Var2.b4(arrayList4, false);
                    p97 p97Var2 = new p97();
                    p97Var2.a = z6;
                    p97Var2.b.addAll(arrayList4);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        p97Var2.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList4.size());
                    } else if (!na7Var2.getUserConfig().p()) {
                        boolean z8 = w01.a;
                    }
                    na7Var2.M4.put(Long.valueOf(j6), p97Var2);
                    na7Var2.getNotificationCenter().k(203, Long.valueOf(j6));
                    return;
                } else {
                    return;
                }
            case 7:
                na7 na7Var3 = (na7) this.d;
                boolean z9 = this.c;
                long j7 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                if (z9) {
                    na7Var3.getNotificationCenter().k(2, 64);
                }
                na7Var3.r5(0, j7, arrayList5);
                na7Var3.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                ((ad7) this.d).getMessagesController().D4(null, (vjb) this.e, this.c, this.b);
                return;
            case 9:
                long j8 = this.b;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z10 = this.c;
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) this.d).getMessagesController().M1().r0(j8, arrayList6, z10, null);
                return;
            default:
                ((VideoPlayerHolderBase) this.d).lambda$seekTo$12(this.b, this.c, (Runnable) this.e);
                return;
        }
    }

    public b61(pf0 pf0Var, Object obj, boolean z, long j, byte b) {
        this.a = b;
        this.d = pf0Var;
        this.e = obj;
        this.c = z;
        this.b = j;
    }

    public b61(byte b, long j, gk7 gk7Var, Object obj, boolean z) {
        this.a = b;
        this.d = gk7Var;
        this.c = z;
        this.b = j;
        this.e = obj;
    }

    public b61(Object obj, long j, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.c = z;
    }

    public b61(Object obj, long j, boolean z, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = z;
        this.e = obj2;
    }
}
