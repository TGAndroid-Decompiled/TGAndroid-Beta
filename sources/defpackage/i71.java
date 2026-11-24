package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class i71 implements Runnable {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public i71(hs6 hs6Var, ArrayList arrayList, long j, boolean z) {
        this.a = (byte) 3;
        this.d = hs6Var;
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
                ((y71) this.d).q0(this.c, this.b, (o71) this.e);
                return;
            case 1:
                g35 g35Var = (g35) this.d;
                long j = this.b;
                boolean z = this.c;
                sk3 sk3Var = (sk3) this.e;
                g35Var.getClass();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                        g35Var.f = null;
                    } catch (Exception e) {
                        g35Var.m(e);
                        if (e instanceof e35) {
                            str = e.getMessage();
                        } else {
                            str = "STORAGE_BROKEN";
                        }
                        groupCallParticipant = str;
                        for (y25 y25Var : linkedHashMap.values()) {
                            y25Var.close();
                        }
                    }
                    try {
                        synchronized (g35.g) {
                            try {
                                g35Var.c(j);
                                f35 s = g35Var.s();
                                if (s.b != z || ((LinkedHashMap) s.e).isEmpty()) {
                                    if (z && !g35.i(g35Var.a)) {
                                        throw new Exception("AUTH_UNAVAILABLE");
                                    }
                                    if (!((LinkedHashMap) s.e).isEmpty()) {
                                        g35Var.b(j, false);
                                        for (String str2 : ((LinkedHashMap) s.e).keySet()) {
                                            linkedHashMap.put(str2, g35Var.h(s, str2, j));
                                        }
                                    }
                                    s.b = z;
                                    ((LinkedHashMap) s.e).clear();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        ((LinkedHashMap) s.e).put((String) entry.getKey(), g35Var.j(s, (String) entry.getKey(), (y25) entry.getValue(), arrayList, j));
                                    }
                                    s.c = false;
                                    synchronized (g35.g) {
                                        g35Var.c(j);
                                        g35Var.w(s, linkedHashMap);
                                        g35Var.d(s);
                                    }
                                }
                                for (y25 y25Var2 : linkedHashMap.values()) {
                                    y25Var2.close();
                                }
                                g35Var.e(arrayList);
                                gm.c3(new p97(g35Var, sk3Var, j, groupCallParticipant, (byte) 9));
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
                    for (y25 y25Var3 : linkedHashMap.values()) {
                        y25Var3.close();
                    }
                    g35Var.e(arrayList);
                    throw th3;
                }
                break;
            case 2:
                p86 p86Var = (p86) this.d;
                long j2 = this.b;
                String str3 = (String) this.e;
                boolean z2 = this.c;
                if (p86Var.x.d) {
                    l75 l75Var = p86Var.x.a;
                    int i = p86Var.a;
                    g95 g95Var = l75Var.a;
                    if (i == 0) {
                        TLRPC.Peer peer = g95Var.u2;
                        if (peer != null) {
                            g95Var.k3.a(g95Var.n1.a, k47.B1(peer), j2, str3, z2);
                            return;
                        }
                        return;
                    }
                    qd2 qd2Var = g95Var.T2;
                    if (qd2Var != null) {
                        groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.p.get(i);
                    }
                    if (groupCallParticipant != null) {
                        g95Var.k3.a(g95Var.n1.a, k47.B1(groupCallParticipant.peer), j2, str3, z2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hs6 hs6Var = (hs6) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                long j3 = this.b;
                boolean z3 = this.c;
                if (arrayList2 != null && j3 != 0) {
                    hs6Var.q0[z3 ? 1 : 0] = j3;
                }
                hs6Var.x0[z3 ? 1 : 0] = false;
                hs6Var.M0(z3, false);
                return;
            case 4:
                hs6 hs6Var2 = (hs6) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z4 = this.c;
                long j4 = this.b;
                if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    hs6Var2.u1(z4, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    gm.c3(new hp6(hs6Var2, z4, currentTimeMillis, (byte) 0));
                    hs6Var2.J1(z4, null, null, currentTimeMillis, j4, false);
                    return;
                } else {
                    hs6Var2.u1(z4, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j4);
                    return;
                }
            case 5:
                oc7 oc7Var = (oc7) this.d;
                long j5 = this.b;
                boolean z5 = this.c;
                oc7Var.q1.k((vh6) this.e, j5);
                if (z5) {
                    oc7Var.r1.delete(j5);
                    oc7Var.X2(j5, false);
                    oc7Var.getNotificationCenter().k(110, Long.valueOf(j5));
                    return;
                }
                return;
            case 6:
                oc7 oc7Var2 = (oc7) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z6 = this.c;
                long j6 = this.b;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList3 = ((TLRPC.messages_Chats) tLObject2).chats;
                    oc7Var2.X3(arrayList3, false);
                    qb7 qb7Var = new qb7();
                    qb7Var.a = z6;
                    qb7Var.b.addAll(arrayList3);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        qb7Var.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList3.size());
                    } else if (!oc7Var2.getUserConfig().p()) {
                        boolean z7 = e21.a;
                    }
                    oc7Var2.O4.put(Long.valueOf(j6), qb7Var);
                    oc7Var2.getNotificationCenter().k(204, Long.valueOf(j6));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList4 = ((TLRPC.Users) tLObject2).users;
                    oc7Var2.d4(arrayList4, false);
                    qb7 qb7Var2 = new qb7();
                    qb7Var2.a = z6;
                    qb7Var2.b.addAll(arrayList4);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        qb7Var2.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList4.size());
                    } else if (!oc7Var2.getUserConfig().p()) {
                        boolean z8 = e21.a;
                    }
                    oc7Var2.O4.put(Long.valueOf(j6), qb7Var2);
                    oc7Var2.getNotificationCenter().k(204, Long.valueOf(j6));
                    return;
                } else {
                    return;
                }
            case 7:
                oc7 oc7Var3 = (oc7) this.d;
                boolean z9 = this.c;
                long j7 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                if (z9) {
                    oc7Var3.getNotificationCenter().k(2, 64);
                }
                oc7Var3.t5(0, j7, arrayList5);
                oc7Var3.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                ((cf7) this.d).getMessagesController().F4(null, (xlb) this.e, this.c, this.b);
                return;
            case 9:
                long j8 = this.b;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z10 = this.c;
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) this.d).getMessagesController().N1().r0(j8, arrayList6, z10, null);
                return;
            default:
                ((VideoPlayerHolderBase) this.d).lambda$seekTo$12(this.b, this.c, (Runnable) this.e);
                return;
        }
    }

    public i71(pg0 pg0Var, Object obj, boolean z, long j, byte b) {
        this.a = b;
        this.d = pg0Var;
        this.e = obj;
        this.c = z;
        this.b = j;
    }

    public i71(byte b, long j, jm7 jm7Var, Object obj, boolean z) {
        this.a = b;
        this.d = jm7Var;
        this.c = z;
        this.b = j;
        this.e = obj;
    }

    public i71(Object obj, long j, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.c = z;
    }

    public i71(Object obj, long j, boolean z, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = z;
        this.e = obj2;
    }
}
