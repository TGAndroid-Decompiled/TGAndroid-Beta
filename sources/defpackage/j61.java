package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class j61 implements Runnable {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public j61(ls6 ls6Var, ArrayList arrayList, long j, boolean z) {
        this.a = (byte) 3;
        this.d = ls6Var;
        this.e = arrayList;
        this.b = j;
        this.c = z;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        int i;
        TLRPC.GroupCallParticipant groupCallParticipant = null;
        switch (this.a) {
            case 0:
                ((z61) this.d).p0(this.c, this.b, (p61) this.e);
                return;
            case 1:
                k35 k35Var = (k35) this.d;
                long j = this.b;
                boolean z = this.c;
                zj3 zj3Var = (zj3) this.e;
                k35Var.getClass();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    try {
                        k35Var.f = null;
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        for (c35 c35Var : linkedHashMap.values()) {
                            c35Var.close();
                        }
                        k35Var.e(arrayList);
                        throw th2;
                    }
                } catch (Exception e) {
                    k35Var.m(e);
                    if (e instanceof i35) {
                        str = e.getMessage();
                    } else {
                        str = "STORAGE_BROKEN";
                    }
                    groupCallParticipant = str;
                    for (c35 c35Var2 : linkedHashMap.values()) {
                        c35Var2.close();
                    }
                }
                synchronized (k35.g) {
                    try {
                        k35Var.c(j);
                        j35 s = k35Var.s();
                        if (s.b != z || ((LinkedHashMap) s.e).isEmpty()) {
                            if (z && !k35.i(k35Var.a)) {
                                throw new Exception("AUTH_UNAVAILABLE");
                            }
                            if (!((LinkedHashMap) s.e).isEmpty()) {
                                k35Var.b(j, false);
                                for (String str3 : ((LinkedHashMap) s.e).keySet()) {
                                    linkedHashMap.put(str3, k35Var.h(s, str3, j));
                                }
                            }
                            s.b = z;
                            ((LinkedHashMap) s.e).clear();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                ((LinkedHashMap) s.e).put((String) entry.getKey(), k35Var.j(s, (String) entry.getKey(), (c35) entry.getValue(), arrayList, j));
                            }
                            s.c = false;
                            synchronized (k35.g) {
                                k35Var.c(j);
                                k35Var.w(s, linkedHashMap);
                                k35Var.d(s);
                            }
                        }
                        for (c35 c35Var3 : linkedHashMap.values()) {
                            c35Var3.close();
                        }
                        k35Var.e(arrayList);
                        hl.c3(new ba7(k35Var, zj3Var, j, groupCallParticipant, (byte) 9));
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            case 2:
                t86 t86Var = (t86) this.d;
                long j2 = this.b;
                String str4 = (String) this.e;
                boolean z2 = this.c;
                if (t86Var.x.d) {
                    p75 p75Var = t86Var.x.a;
                    int i2 = t86Var.a;
                    j95 j95Var = p75Var.a;
                    if (i2 == 0) {
                        TLRPC.Peer peer = j95Var.u2;
                        if (peer != null) {
                            j95Var.k3.a(j95Var.n1.a, r47.B1(peer), j2, str4, z2);
                            return;
                        }
                        return;
                    }
                    vc2 vc2Var = j95Var.T2;
                    if (vc2Var != null) {
                        groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.p.get(i2);
                    }
                    if (groupCallParticipant != null) {
                        j95Var.k3.a(j95Var.n1.a, r47.B1(groupCallParticipant.peer), j2, str4, z2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ls6 ls6Var = (ls6) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                long j3 = this.b;
                boolean z3 = this.c;
                if (arrayList2 != null && j3 != 0) {
                    ls6Var.q0[z3 ? 1 : 0] = j3;
                }
                ls6Var.x0[z3 ? 1 : 0] = false;
                ls6Var.M0(z3, false);
                return;
            case 4:
                ls6 ls6Var2 = (ls6) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z4 = this.c;
                long j4 = this.b;
                if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    ls6Var2.u1(z4, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    hl.c3(new zp6(ls6Var2, z4, currentTimeMillis, (byte) 1));
                    ls6Var2.J1(z4, null, null, currentTimeMillis, j4, false);
                    return;
                } else {
                    ls6Var2.u1(z4, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j4);
                    return;
                }
            case 5:
                uc7 uc7Var = (uc7) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z5 = this.c;
                long j5 = this.b;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList3 = ((TLRPC.messages_Chats) tLObject2).chats;
                    uc7Var.c4(arrayList3, false);
                    wb7 wb7Var = new wb7();
                    wb7Var.a = z5;
                    wb7Var.b.addAll(arrayList3);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        wb7Var.c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList3.size());
                    } else if (!uc7Var.getUserConfig().p()) {
                        boolean z6 = f11.a;
                    }
                    uc7Var.N4.put(Long.valueOf(j5), wb7Var);
                    uc7Var.getNotificationCenter().k(204, Long.valueOf(j5));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList4 = ((TLRPC.Users) tLObject2).users;
                    uc7Var.j4(arrayList4, false);
                    wb7 wb7Var2 = new wb7();
                    wb7Var2.a = z5;
                    wb7Var2.b.addAll(arrayList4);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        wb7Var2.c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList4.size());
                    } else if (!uc7Var.getUserConfig().p()) {
                        boolean z7 = f11.a;
                    }
                    uc7Var.N4.put(Long.valueOf(j5), wb7Var2);
                    uc7Var.getNotificationCenter().k(204, Long.valueOf(j5));
                    return;
                } else {
                    return;
                }
            case 6:
                uc7 uc7Var2 = (uc7) this.d;
                long j6 = this.b;
                boolean z8 = this.c;
                uc7Var2.q1.k(j6, (zh6) this.e);
                if (z8) {
                    uc7Var2.r1.delete(j6);
                    uc7Var2.b3(j6, false);
                    uc7Var2.getNotificationCenter().k(110, Long.valueOf(j6));
                    return;
                }
                return;
            case 7:
                uc7 uc7Var3 = (uc7) this.d;
                boolean z9 = this.c;
                long j7 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                if (z9) {
                    uc7Var3.getNotificationCenter().k(2, 64);
                }
                uc7Var3.z5(0, j7, arrayList5);
                uc7Var3.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                ((jf7) this.d).getMessagesController().L4(null, (unb) this.e, this.c, this.b);
                return;
            case 9:
                lm7 lm7Var = (lm7) this.d;
                long j8 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                boolean z10 = this.c;
                TLRPC.Chat M0 = lm7Var.getMessagesController().M0(Long.valueOf(j8));
                if (M0 != null) {
                    str2 = M0.title;
                } else {
                    str2 = chat.title;
                }
                d31 b0 = d31.b0(lm7Var);
                if (z10) {
                    i = 2131752496;
                } else {
                    i = 2131752498;
                }
                c00.v(ob6.a0(null, null, i, str2), b0, 2131623990, 36);
                return;
            case 10:
                lm7 lm7Var2 = (lm7) this.d;
                long j9 = this.b;
                boolean z11 = this.c;
                j61 j61Var = (j61) this.e;
                TLRPC.Chat M02 = lm7Var2.getMessagesController().M0(Long.valueOf(j9));
                if (z11 && M02 != null && !M02.in_news) {
                    TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews = new TLRPC.TL_channels_editChannelNews();
                    tL_channels_editChannelNews.channel = lm7Var2.getMessagesController().h1(j9);
                    tL_channels_editChannelNews.news = true;
                    lm7Var2.getConnectionsManager().sendRequest(tL_channels_editChannelNews, new rs0((Object) lm7Var2, j9, true, (Object) tL_channels_editChannelNews, (Runnable) j61Var, (byte) 4));
                    return;
                }
                j61Var.run();
                return;
            case 11:
                long j10 = this.b;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z12 = this.c;
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) this.d).getMessagesController().O1().r0(j10, arrayList6, z12, null);
                return;
            default:
                ((VideoPlayerHolderBase) this.d).lambda$seekTo$12(this.b, this.c, (Runnable) this.e);
                return;
        }
    }

    public j61(rf0 rf0Var, Object obj, boolean z, long j, byte b) {
        this.a = b;
        this.d = rf0Var;
        this.e = obj;
        this.c = z;
        this.b = j;
    }

    public j61(byte b, long j, fn7 fn7Var, Object obj, boolean z) {
        this.a = b;
        this.d = fn7Var;
        this.c = z;
        this.b = j;
        this.e = obj;
    }

    public j61(Object obj, long j, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.c = z;
    }

    public j61(Object obj, long j, boolean z, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = z;
        this.e = obj2;
    }
}
