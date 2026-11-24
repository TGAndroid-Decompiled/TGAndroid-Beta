package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.TreeMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class az0 implements Runnable {
    public final byte a = 2;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public az0(pz0 pz0Var, int i, nz0 nz0Var, int i2, fz0 fz0Var, gz0 gz0Var) {
        this.d = pz0Var;
        this.b = i;
        this.e = nz0Var;
        this.c = i2;
        this.f = fz0Var;
        this.h = gz0Var;
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
                pz0 pz0Var = (pz0) obj4;
                nz0 nz0Var = (nz0) obj3;
                fz0 fz0Var = (fz0) obj2;
                gz0 gz0Var = (gz0) obj;
                if (i4 == pz0Var.b) {
                    int i5 = nz0Var.f;
                    String str4 = nz0Var.a;
                    if (i5 == i3) {
                        TreeMap treeMap = pz0Var.d;
                        long j = fz0Var.a;
                        if (treeMap.get(Long.valueOf(j)) == fz0Var && fz0Var.k.get(str4) == nz0Var && nz0Var.d != null) {
                            ez0 ez0Var = pz0Var.a;
                            long h = ez0Var.h();
                            nz0Var.d = null;
                            pz0Var.v--;
                            byte b2 = gz0Var.a;
                            if (b2 != 0) {
                                if (b2 != 1) {
                                    if (b2 != 2) {
                                        if (b2 == 3) {
                                            ez0Var.d("rejoin needed at video " + j);
                                            pz0Var.e(false);
                                            pz0Var.c = (byte) 3;
                                            pz0Var.o = h;
                                            ez0Var.f();
                                            return;
                                        }
                                        return;
                                    }
                                    StringBuilder o = ug8.o(j, "resync at video ", " ch ");
                                    o.append(nz0Var.b);
                                    ez0Var.d(o.toString());
                                    pz0Var.z(gz0Var.d);
                                    return;
                                }
                                pz0Var.A(nz0Var.g, h, nz0Var.h);
                                nz0Var.e = ez0Var.j(new fv0(pz0Var, fz0Var, nz0Var, (byte) 4), 100L);
                                return;
                            }
                            nz0Var.i = gz0Var.b;
                            int i6 = gz0Var.c;
                            nz0Var.j = i6;
                            fz0Var.l += i6;
                            pz0Var.x(nz0Var.c, i6);
                            pz0Var.J.put(str4, Integer.valueOf(nz0Var.c));
                            pz0Var.i(fz0Var, h);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g22 g22Var = (g22) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                g22Var.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    g22Var.h = -1;
                    gl.c3(new tn6(g22Var, g22Var.h, new ArrayList(), new ArrayList(), (byte) 14));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase, true, false);
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
                    nu2 nu2Var = (nu2) arrayList.get(i8);
                    g22 g22Var2 = g22Var;
                    String lowerCase2 = qu2.m(r7, nu2Var.i, nu2Var.j).toLowerCase();
                    ArrayList arrayList5 = arrayList;
                    String S02 = k96.D0().S0(lowerCase2, true, r7);
                    TLRPC.User user = nu2Var.m;
                    String[] strArr2 = strArr;
                    if (user != null) {
                        String lowerCase3 = qu2.m(r7, user.first_name, user.last_name).toLowerCase();
                        str2 = k96.D0().S0(lowerCase2, true, r7);
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
                        if ((str != null && (str.startsWith(str5) || de9.t(" ", str5, str))) || (str2 != null && (str2.startsWith(str5) || de9.t(" ", str5, str2)))) {
                            str3 = str;
                            c = 1;
                        } else {
                            str3 = str;
                            TLRPC.User user2 = nu2Var.m;
                            if (user2 != null && (p = l7c.p(user2)) != null && p.startsWith(str5)) {
                                c = 2;
                            } else if (!lowerCase2.startsWith(str5) && !de9.t(" ", str5, lowerCase2) && (S02 == null || (!S02.startsWith(str5) && !de9.t(" ", str5, S02)))) {
                                c = c2;
                            } else {
                                c = 3;
                            }
                        }
                        String str6 = lowerCase2;
                        if (c != 0 && (!nu2Var.e.isEmpty() || !nu2Var.g.isEmpty())) {
                            if (c == 3) {
                                arrayList4.add(gl.r0(nu2Var.i, nu2Var.j, str5));
                            } else {
                                TLRPC.User user3 = nu2Var.m;
                                if (c == 1) {
                                    arrayList4.add(gl.r0(user3.first_name, user3.last_name, str5));
                                } else {
                                    arrayList4.add(gl.r0("@" + l7c.p(user3), null, "@" + str5));
                                }
                            }
                            TLRPC.User user4 = nu2Var.m;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.id, 1);
                            }
                            arrayList3.add(nu2Var);
                            i8++;
                            g22Var = g22Var2;
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
                    g22Var = g22Var2;
                    arrayList = arrayList5;
                    strArr = strArr2;
                    r7 = 0;
                }
                g22 g22Var3 = g22Var;
                String[] strArr3 = strArr;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i11);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                        TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(tL_contact.user_id));
                        String lowerCase4 = qu2.m(0, V1.first_name, V1.last_name).toLowerCase();
                        String S03 = k96.D0().S0(lowerCase4, true, false);
                        if (lowerCase4.equals(S03)) {
                            S03 = null;
                        }
                        int i12 = 0;
                        char c3 = 0;
                        while (i12 < i7) {
                            String str7 = strArr3[i12];
                            if (!lowerCase4.startsWith(str7) && !de9.t(" ", str7, lowerCase4) && (S03 == null || (!S03.startsWith(str7) && !de9.t(" ", str7, S03)))) {
                                i2 = i11;
                                String p2 = l7c.p(V1);
                                if (p2 != null && p2.startsWith(str7)) {
                                    c3 = 2;
                                }
                            } else {
                                i2 = i11;
                                c3 = 1;
                            }
                            if (c3 != 0 && V1.phone != null) {
                                if (c3 == 1) {
                                    arrayList4.add(gl.r0(V1.first_name, V1.last_name, str7));
                                } else {
                                    arrayList4.add(gl.r0("@" + l7c.p(V1), null, "@" + str7));
                                }
                                arrayList3.add(V1);
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
                gl.c3(new tn6(g22Var3, this.c, arrayList3, arrayList4, (byte) 14));
                return;
            case 2:
                mp7 mp7Var = (mp7) obj;
                vp7.e(this.b, this.c, mp7Var.j(), new ip7(mp7Var, (byte) 3), (wjb) obj2, (Context) obj4, (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3);
                return;
            default:
                mc9 mc9Var = (mc9) obj3;
                fib fibVar = (fib) obj2;
                rb9 rb9Var = (rb9) obj;
                sb9 sb9Var = (sb9) ((wk4) obj4).c;
                if (mc9Var.length() >= i4 && mc9Var.getSelectionStart() != mc9Var.getSelectionEnd() && fibVar.i0(rb9Var.G0(), 0, i3, i4)) {
                    sb9Var.d = true;
                    mc9Var.setSelection(i4);
                    sb9Var.d = false;
                    return;
                }
                return;
        }
    }

    public az0(g22 g22Var, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.d = g22Var;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i;
        this.c = i2;
    }

    public az0(wk4 wk4Var, mc9 mc9Var, int i, fib fibVar, rb9 rb9Var, int i2) {
        this.d = wk4Var;
        this.e = mc9Var;
        this.b = i;
        this.f = fibVar;
        this.h = rb9Var;
        this.c = i2;
    }

    public az0(Context context, int i, int i2, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, wjb wjbVar, mp7 mp7Var) {
        this.d = context;
        this.b = i;
        this.c = i2;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = wjbVar;
        this.h = mp7Var;
    }
}
