package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.TreeMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class iz0 implements Runnable {
    public final byte a = 2;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public iz0(xz0 xz0Var, int i, vz0 vz0Var, int i2, nz0 nz0Var, oz0 oz0Var) {
        this.d = xz0Var;
        this.b = i;
        this.e = vz0Var;
        this.c = i2;
        this.f = nz0Var;
        this.h = oz0Var;
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
                xz0 xz0Var = (xz0) obj4;
                vz0 vz0Var = (vz0) obj3;
                nz0 nz0Var = (nz0) obj2;
                oz0 oz0Var = (oz0) obj;
                if (i4 == xz0Var.b) {
                    int i5 = vz0Var.f;
                    String str4 = vz0Var.a;
                    if (i5 == i3) {
                        TreeMap treeMap = xz0Var.d;
                        long j = nz0Var.a;
                        if (treeMap.get(Long.valueOf(j)) == nz0Var && nz0Var.k.get(str4) == vz0Var && vz0Var.d != null) {
                            mz0 mz0Var = xz0Var.a;
                            long h = mz0Var.h();
                            vz0Var.d = null;
                            xz0Var.v--;
                            byte b2 = oz0Var.a;
                            if (b2 != 0) {
                                if (b2 != 1) {
                                    if (b2 != 2) {
                                        if (b2 == 3) {
                                            mz0Var.c("rejoin needed at video " + j);
                                            xz0Var.e(false);
                                            xz0Var.c = (byte) 3;
                                            xz0Var.o = h;
                                            mz0Var.f();
                                            return;
                                        }
                                        return;
                                    }
                                    StringBuilder o = ik8.o(j, "resync at video ", " ch ");
                                    o.append(vz0Var.b);
                                    mz0Var.c(o.toString());
                                    xz0Var.z(oz0Var.d);
                                    return;
                                }
                                xz0Var.A(vz0Var.g, h, vz0Var.h);
                                vz0Var.e = mz0Var.j(new tu0(xz0Var, nz0Var, vz0Var, (byte) 5), 100L);
                                return;
                            }
                            vz0Var.i = oz0Var.b;
                            int i6 = oz0Var.c;
                            vz0Var.j = i6;
                            nz0Var.l += i6;
                            xz0Var.x(vz0Var.c, i6);
                            xz0Var.J.put(str4, Integer.valueOf(vz0Var.c));
                            xz0Var.i(nz0Var, h);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                x22 x22Var = (x22) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                x22Var.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    x22Var.h = -1;
                    hl.c3(new gp6(x22Var, x22Var.h, new ArrayList(), new ArrayList(), (byte) 14));
                    return;
                }
                String S0 = ob6.D0().S0(lowerCase, true, false);
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
                    iv2 iv2Var = (iv2) arrayList.get(i8);
                    x22 x22Var2 = x22Var;
                    String lowerCase2 = lv2.m(r7, iv2Var.i, iv2Var.j).toLowerCase();
                    ArrayList arrayList5 = arrayList;
                    String S02 = ob6.D0().S0(lowerCase2, true, r7);
                    TLRPC.User user = iv2Var.m;
                    String[] strArr2 = strArr;
                    if (user != null) {
                        String lowerCase3 = lv2.m(r7, user.first_name, user.last_name).toLowerCase();
                        str2 = ob6.D0().S0(lowerCase2, true, r7);
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
                        if ((str != null && (str.startsWith(str5) || uh9.t(" ", str5, str))) || (str2 != null && (str2.startsWith(str5) || uh9.t(" ", str5, str2)))) {
                            str3 = str;
                            c = 1;
                        } else {
                            str3 = str;
                            TLRPC.User user2 = iv2Var.m;
                            if (user2 != null && (p = lbc.p(user2)) != null && p.startsWith(str5)) {
                                c = 2;
                            } else if (!lowerCase2.startsWith(str5) && !uh9.t(" ", str5, lowerCase2) && (S02 == null || (!S02.startsWith(str5) && !uh9.t(" ", str5, S02)))) {
                                c = c2;
                            } else {
                                c = 3;
                            }
                        }
                        String str6 = lowerCase2;
                        if (c != 0 && (!iv2Var.e.isEmpty() || !iv2Var.g.isEmpty())) {
                            if (c == 3) {
                                arrayList4.add(hl.r0(iv2Var.i, iv2Var.j, str5));
                            } else {
                                TLRPC.User user3 = iv2Var.m;
                                if (c == 1) {
                                    arrayList4.add(hl.r0(user3.first_name, user3.last_name, str5));
                                } else {
                                    arrayList4.add(hl.r0("@" + lbc.p(user3), null, "@" + str5));
                                }
                            }
                            TLRPC.User user4 = iv2Var.m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.id, 1);
                            }
                            arrayList3.add(iv2Var);
                            i8++;
                            x22Var = x22Var2;
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
                    x22Var = x22Var2;
                    arrayList = arrayList5;
                    strArr = strArr2;
                    r7 = 0;
                }
                x22 x22Var3 = x22Var;
                String[] strArr3 = strArr;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i11);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                        TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = lv2.m(0, X1.first_name, X1.last_name).toLowerCase();
                        String S03 = ob6.D0().S0(lowerCase4, true, false);
                        if (lowerCase4.equals(S03)) {
                            S03 = null;
                        }
                        int i12 = 0;
                        char c3 = 0;
                        while (i12 < i7) {
                            String str7 = strArr3[i12];
                            if (!lowerCase4.startsWith(str7) && !uh9.t(" ", str7, lowerCase4) && (S03 == null || (!S03.startsWith(str7) && !uh9.t(" ", str7, S03)))) {
                                i2 = i11;
                                String p2 = lbc.p(X1);
                                if (p2 != null && p2.startsWith(str7)) {
                                    c3 = 2;
                                }
                            } else {
                                i2 = i11;
                                c3 = 1;
                            }
                            if (c3 != 0 && X1.phone != null) {
                                if (c3 == 1) {
                                    arrayList4.add(hl.r0(X1.first_name, X1.last_name, str7));
                                } else {
                                    arrayList4.add(hl.r0("@" + lbc.p(X1), null, "@" + str7));
                                }
                                arrayList3.add(X1);
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
                hl.c3(new gp6(x22Var3, this.c, arrayList3, arrayList4, (byte) 14));
                return;
            case 2:
                ms7 ms7Var = (ms7) obj;
                vs7.e(this.b, this.c, ms7Var.j(), new is7(ms7Var, (byte) 3), (vnb) obj2, (Context) obj4, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3);
                return;
            default:
                dg9 dg9Var = (dg9) obj3;
                amb ambVar = (amb) obj2;
                hf9 hf9Var = (hf9) obj;
                if9 if9Var = (if9) ((um4) obj4).c;
                if (dg9Var.length() >= i4 && dg9Var.getSelectionStart() != dg9Var.getSelectionEnd() && ambVar.i0(hf9Var.S0(), 0, i3, i4)) {
                    if9Var.d = true;
                    dg9Var.setSelection(i4);
                    if9Var.d = false;
                    return;
                }
                return;
        }
    }

    public iz0(x22 x22Var, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.d = x22Var;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i;
        this.c = i2;
    }

    public iz0(um4 um4Var, dg9 dg9Var, int i, amb ambVar, hf9 hf9Var, int i2) {
        this.d = um4Var;
        this.e = dg9Var;
        this.b = i;
        this.f = ambVar;
        this.h = hf9Var;
        this.c = i2;
    }

    public iz0(Context context, int i, int i2, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, vnb vnbVar, ms7 ms7Var) {
        this.d = context;
        this.b = i;
        this.c = i2;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = vnbVar;
        this.h = ms7Var;
    }
}
