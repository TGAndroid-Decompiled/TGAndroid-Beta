package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.TreeMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class h01 implements Runnable {
    public final byte a = 2;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public h01(w01 w01Var, int i, u01 u01Var, int i2, m01 m01Var, n01 n01Var) {
        this.d = w01Var;
        this.b = i;
        this.e = u01Var;
        this.c = i2;
        this.f = m01Var;
        this.h = n01Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        char c;
        String p;
        byte b = this.a;
        int i3 = this.c;
        ?? r7 = 0;
        int i4 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                w01 w01Var = (w01) obj4;
                u01 u01Var = (u01) obj3;
                m01 m01Var = (m01) obj2;
                n01 n01Var = (n01) obj;
                if (i4 == w01Var.b) {
                    int i5 = u01Var.f;
                    String str4 = u01Var.a;
                    if (i5 == i3) {
                        TreeMap treeMap = w01Var.d;
                        long j = m01Var.a;
                        if (treeMap.get(Long.valueOf(j)) == m01Var && m01Var.k.get(str4) == u01Var && u01Var.d != null) {
                            l01 l01Var = w01Var.a;
                            long h = l01Var.h();
                            u01Var.d = null;
                            w01Var.v--;
                            byte b2 = n01Var.a;
                            if (b2 != 0) {
                                if (b2 != 1) {
                                    if (b2 != 2) {
                                        if (b2 == 3) {
                                            l01Var.d("rejoin needed at video " + j);
                                            w01Var.e(false);
                                            w01Var.c = (byte) 3;
                                            w01Var.o = h;
                                            l01Var.f();
                                            return;
                                        }
                                        return;
                                    }
                                    StringBuilder o = wi8.o(j, "resync at video ", " ch ");
                                    o.append(u01Var.b);
                                    l01Var.d(o.toString());
                                    w01Var.z(n01Var.d);
                                    return;
                                }
                                w01Var.A(u01Var.g, h, u01Var.h);
                                u01Var.e = l01Var.j(new tv0(w01Var, m01Var, u01Var, (byte) 5), 100L);
                                return;
                            }
                            u01Var.i = n01Var.b;
                            int i6 = n01Var.c;
                            u01Var.j = i6;
                            m01Var.l += i6;
                            w01Var.x(u01Var.c, i6);
                            w01Var.J.put(str4, Integer.valueOf(u01Var.c));
                            w01Var.i(m01Var, h);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                s32 s32Var = (s32) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                s32Var.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    s32Var.h = -1;
                    gm.c3(new up6(s32Var, s32Var.h, new ArrayList(), new ArrayList(), (byte) 14));
                    return;
                }
                String S0 = jb6.D0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i7 = i + 1;
                String[] strArr = new String[i7];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    yv2 yv2Var = (yv2) arrayList.get(i8);
                    s32 s32Var2 = s32Var;
                    String lowerCase2 = bw2.m(r7, yv2Var.i, yv2Var.j).toLowerCase();
                    ArrayList arrayList5 = arrayList;
                    String S02 = jb6.D0().S0(lowerCase2, true, r7);
                    TLRPC.User user = yv2Var.m;
                    String[] strArr2 = strArr;
                    if (user != null) {
                        String lowerCase3 = bw2.m(r7, user.first_name, user.last_name).toLowerCase();
                        str2 = jb6.D0().S0(lowerCase2, true, r7);
                        str = lowerCase3;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    char c2 = r7;
                    int i9 = r7;
                    while (i9 < i7) {
                        int i10 = i9;
                        String str5 = strArr2[i10];
                        if ((str != null && (str.startsWith(str5) || hg9.s(" ", str5, str))) || (str2 != null && (str2.startsWith(str5) || hg9.s(" ", str5, str2)))) {
                            str3 = str;
                            c = 1;
                        } else {
                            str3 = str;
                            TLRPC.User user2 = yv2Var.m;
                            if (user2 != null && (p = m9c.p(user2)) != null && p.startsWith(str5)) {
                                c = 2;
                            } else if (!lowerCase2.startsWith(str5) && !hg9.s(" ", str5, lowerCase2) && (S02 == null || (!S02.startsWith(str5) && !hg9.s(" ", str5, S02)))) {
                                c = c2;
                            } else {
                                c = 3;
                            }
                        }
                        String str6 = lowerCase2;
                        if (c != 0 && (!yv2Var.e.isEmpty() || !yv2Var.g.isEmpty())) {
                            if (c == 3) {
                                arrayList4.add(gm.r0(yv2Var.i, yv2Var.j, str5));
                            } else {
                                TLRPC.User user3 = yv2Var.m;
                                if (c == 1) {
                                    arrayList4.add(gm.r0(user3.first_name, user3.last_name, str5));
                                } else {
                                    arrayList4.add(gm.r0("@" + m9c.p(user3), null, "@" + str5));
                                }
                            }
                            TLRPC.User user4 = yv2Var.m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.id, 1);
                            }
                            arrayList3.add(yv2Var);
                            i8++;
                            s32Var = s32Var2;
                            arrayList = arrayList5;
                            strArr = strArr2;
                            r7 = 0;
                        } else {
                            lowerCase2 = str6;
                            c2 = c;
                            str = str3;
                            i9 = i10 + 1;
                        }
                    }
                    i8++;
                    s32Var = s32Var2;
                    arrayList = arrayList5;
                    strArr = strArr2;
                    r7 = 0;
                }
                s32 s32Var3 = s32Var;
                String[] strArr3 = strArr;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i11);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                        TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = bw2.m(0, W1.first_name, W1.last_name).toLowerCase();
                        String S03 = jb6.D0().S0(lowerCase4, true, false);
                        if (lowerCase4.equals(S03)) {
                            S03 = null;
                        }
                        int i12 = 0;
                        char c3 = 0;
                        while (i12 < i7) {
                            String str7 = strArr3[i12];
                            if (!lowerCase4.startsWith(str7) && !hg9.s(" ", str7, lowerCase4) && (S03 == null || (!S03.startsWith(str7) && !hg9.s(" ", str7, S03)))) {
                                i2 = i11;
                                String p2 = m9c.p(W1);
                                if (p2 != null && p2.startsWith(str7)) {
                                    c3 = 2;
                                }
                            } else {
                                i2 = i11;
                                c3 = 1;
                            }
                            if (c3 != 0 && W1.phone != null) {
                                if (c3 == 1) {
                                    arrayList4.add(gm.r0(W1.first_name, W1.last_name, str7));
                                } else {
                                    arrayList4.add(gm.r0("@" + m9c.p(W1), null, "@" + str7));
                                }
                                arrayList3.add(W1);
                                i11 = i2 + 1;
                            } else {
                                i12++;
                                i11 = i2;
                            }
                        }
                    }
                    i2 = i11;
                    i11 = i2 + 1;
                }
                gm.c3(new up6(s32Var3, this.c, arrayList3, arrayList4, (byte) 14));
                return;
            case 2:
                pr7 pr7Var = (pr7) obj;
                yr7.e(this.b, this.c, pr7Var.j(), new lr7(pr7Var, (byte) 3), (ylb) obj2, (Context) obj4, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3);
                return;
            default:
                ne9 ne9Var = (ne9) obj3;
                gkb gkbVar = (gkb) obj2;
                rd9 rd9Var = (rd9) obj;
                sd9 sd9Var = (sd9) ((wm4) obj4).c;
                if (ne9Var.length() >= i4 && ne9Var.getSelectionStart() != ne9Var.getSelectionEnd() && gkbVar.i0(rd9Var.Y0(), 0, i3, i4)) {
                    sd9Var.d = true;
                    ne9Var.setSelection(i4);
                    sd9Var.d = false;
                    return;
                }
                return;
        }
    }

    public h01(s32 s32Var, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.d = s32Var;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i;
        this.c = i2;
    }

    public h01(wm4 wm4Var, ne9 ne9Var, int i, gkb gkbVar, rd9 rd9Var, int i2) {
        this.d = wm4Var;
        this.e = ne9Var;
        this.b = i;
        this.f = gkbVar;
        this.h = rd9Var;
        this.c = i2;
    }

    public h01(Context context, int i, int i2, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, ylb ylbVar, pr7 pr7Var) {
        this.d = context;
        this.b = i;
        this.c = i2;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = ylbVar;
        this.h = pr7Var;
    }
}
