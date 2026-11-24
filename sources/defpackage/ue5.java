package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
public final class ue5 implements sr6, mf5 {
    public final boolean E;
    public final uc8 F;
    public final gi3 G = new gi3(this);
    public rr6 H;
    public int I;
    public txb J;
    public tf5[] K;
    public tf5[] L;
    public int M;
    public lq2 N;
    public final long O;
    public final pa3 a;
    public final ta3 b;
    public final l69 c;
    public final vyb d;
    public final yq3 e;
    public final vq3 f;
    public final i2f h;
    public final kp n;
    public final mv6 r;
    public final IdentityHashMap s;
    public final g29 w;
    public final ie7 x;
    public final boolean y;

    public ue5(pa3 pa3Var, ta3 ta3Var, l69 l69Var, vyb vybVar, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, mv6 mv6Var, ie7 ie7Var, boolean z, int i, uc8 uc8Var) {
        this.a = pa3Var;
        this.b = ta3Var;
        this.c = l69Var;
        this.d = vybVar;
        this.e = yq3Var;
        this.f = vq3Var;
        this.h = i2fVar;
        this.n = kpVar;
        this.r = mv6Var;
        this.x = ie7Var;
        this.y = z;
        this.E = i;
        this.F = uc8Var;
        ie7Var.getClass();
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.N = new lq2(w59Var, w59Var);
        this.s = new IdentityHashMap();
        this.w = new g29((byte) 18);
        this.K = new tf5[0];
        this.L = new tf5[0];
        this.O = Long.MIN_VALUE;
    }

    public static fm4 h(fm4 fm4Var, fm4 fm4Var2, boolean z) {
        ld7 ld7Var;
        int i;
        String str;
        String str2;
        mm5 mm5Var;
        int i2;
        int i3;
        String str3;
        int i4;
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        int i5 = -1;
        if (fm4Var2 != null) {
            str2 = fm4Var2.l;
            ld7Var = fm4Var2.m;
            i2 = fm4Var2.N;
            i = fm4Var2.e;
            i3 = fm4Var2.f;
            str = fm4Var2.d;
            str3 = fm4Var2.b;
            mm5Var = fm4Var2.c;
        } else {
            String w = g8c.w(1, fm4Var.l);
            ld7Var = fm4Var.m;
            if (z) {
                i2 = fm4Var.N;
                i = fm4Var.e;
                i3 = fm4Var.f;
                str = fm4Var.d;
                str3 = fm4Var.b;
                str2 = w;
                mm5Var = fm4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                mm5Var = w59Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String d = ud7.d(str2);
        if (z) {
            int i6 = fm4Var.i;
            i5 = fm4Var.j;
            i4 = i6;
        } else {
            i4 = -1;
        }
        em4 em4Var = new em4();
        em4Var.a = fm4Var.a;
        em4Var.b = str3;
        em4Var.c = mm5.q(mm5Var);
        em4Var.r = ud7.n(fm4Var.s);
        em4Var.s = ud7.n(d);
        em4Var.k = str2;
        em4Var.l = ld7Var;
        em4Var.i = i4;
        em4Var.j = i5;
        em4Var.M = i2;
        em4Var.e = i;
        em4Var.f = i3;
        em4Var.d = str;
        return new fm4(em4Var);
    }

    @Override
    public final void a() {
        tf5[] tf5VarArr;
        mm5 mm5Var;
        long j;
        for (tf5 tf5Var : this.K) {
            mv6 mv6Var = tf5Var.s;
            re5 re5Var = tf5Var.d;
            ArrayList arrayList = tf5Var.E;
            if (!arrayList.isEmpty()) {
                te5 te5Var = (te5) jle.b(arrayList);
                int c = re5Var.c(te5Var);
                int i = te5Var.F;
                boolean z = true;
                if (c == 1) {
                    if (!te5Var.h()) {
                        if (i == -1) {
                            z = false;
                        }
                        gre.p(z);
                        df5 b = re5Var.g.b(te5Var.y, false);
                        b.getClass();
                        mm5 mm5Var2 = b.r;
                        int i2 = (int) (te5Var.s - b.k);
                        if (i2 < 0) {
                            j = 0;
                        } else {
                            if (i2 < mm5Var2.size()) {
                                mm5Var = ((af5) mm5Var2.get(i2)).y;
                            } else {
                                mm5Var = b.s;
                            }
                            j = ((ye5) mm5Var.get(i)).c;
                        }
                        te5Var.b0 = j;
                    }
                } else if (c == 0) {
                    tf5Var.I.post(new hb5(tf5Var, te5Var, (byte) 4));
                } else if (c == 2 && !tf5Var.k0 && mv6Var.W()) {
                    mv6Var.p();
                }
            }
        }
        this.H.b(this);
    }

    @Override
    public final boolean b(Uri uri, dd ddVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        of5 of5Var;
        d86 d86Var;
        int v;
        boolean z4;
        of5 of5Var2;
        tf5[] tf5VarArr = this.K;
        int length = tf5VarArr.length;
        int i2 = 0;
        boolean z5 = false;
        while (i2 < length) {
            tf5 tf5Var = tf5VarArr[i2];
            re5 re5Var = tf5Var.d;
            of5[] of5VarArr = re5Var.e;
            HashMap hashMap = re5Var.g.d;
            int length2 = of5VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                of5 of5Var3 = of5VarArr[i3];
                sa3 sa3Var = (sa3) hashMap.get(uri);
                if (sa3Var != null) {
                    of5Var = sa3Var.a;
                } else {
                    of5Var = null;
                }
                if (of5Var3.equals(of5Var)) {
                    if (!z) {
                        c86 a = re5Var.a(uri);
                        tf5Var.r.getClass();
                        d86Var = i2f.u3(a, ddVar);
                    } else {
                        d86Var = null;
                    }
                    re5Var.p = uri;
                    if (d86Var != null) {
                        byte b = d86Var.a;
                        se5 se5Var = re5Var.h;
                        if (se5Var == null || !se5Var.k) {
                            se5Var = null;
                        }
                        i = i2;
                        boolean z6 = false;
                        long j = d86Var.b;
                        if (b != 1) {
                            if (b == 2) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < of5VarArr.length) {
                                        of5 of5Var4 = of5VarArr[i4];
                                        z2 = z6;
                                        sa3 sa3Var2 = (sa3) hashMap.get(uri);
                                        if (sa3Var2 != null) {
                                            of5Var2 = sa3Var2.a;
                                        } else {
                                            of5Var2 = null;
                                        }
                                        if (of5Var4.equals(of5Var2)) {
                                            break;
                                        }
                                        i4++;
                                        z6 = z2;
                                    } else {
                                        z2 = z6;
                                        i4 = -1;
                                        break;
                                    }
                                }
                                if (i4 != -1 && (v = re5Var.s.v(i4)) != -1 && re5Var.s.q(v, j)) {
                                    sa3 sa3Var3 = (sa3) hashMap.get(uri);
                                    if (sa3Var3 != null) {
                                        z4 = sa3Var3.a(j, uri, null);
                                    } else {
                                        z4 = z2;
                                    }
                                    if (z4) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                sc8.j(de9.k(b, "Invalid fallback selection type: "));
                                return false;
                            }
                        } else {
                            z2 = false;
                            if (se5Var != null) {
                                re5Var.s.f();
                                z3 = se5Var.a(j);
                            } else {
                                sa3 sa3Var4 = (sa3) hashMap.get(uri);
                                if (sa3Var4 != null) {
                                    z3 = sa3Var4.a(j, uri, null);
                                }
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            i = i2;
            z2 = false;
            z3 = z2;
            z5 |= z3;
            i2 = i + 1;
        }
        this.H.b(this);
        return z5;
    }

    public final defpackage.tf5 c(java.lang.String r18, int r19, defpackage.of5[] r20, defpackage.fm4[] r21, defpackage.fm4 r22, java.util.List r23, java.util.Map r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue5.c(java.lang.String, int, of5[], fm4[], fm4, java.util.List, java.util.Map, long):tf5");
    }

    @Override
    public final boolean d() {
        return this.N.d();
    }

    @Override
    public final long e(defpackage.k64[] r41, boolean[] r42, defpackage.ip9[] r43, boolean[] r44, long r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue5.e(k64[], boolean[], ip9[], boolean[], long):long");
    }

    @Override
    public final long g() {
        return this.N.g();
    }

    @Override
    public final long i(long j, gv9 gv9Var) {
        df5 df5Var;
        long j2;
        tf5[] tf5VarArr = this.L;
        int length = tf5VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            tf5 tf5Var = tf5VarArr[i];
            if (tf5Var.R == 2) {
                re5 re5Var = tf5Var.d;
                ta3 ta3Var = re5Var.g;
                int d = re5Var.s.d();
                of5[] of5VarArr = re5Var.e;
                if (d < of5VarArr.length && d != -1) {
                    df5Var = ta3Var.b(of5VarArr[re5Var.s.n()].b(), true);
                } else {
                    df5Var = null;
                }
                if (df5Var != null) {
                    mm5 mm5Var = df5Var.r;
                    if (!mm5Var.isEmpty()) {
                        long j3 = df5Var.h - ta3Var.M;
                        long j4 = j - j3;
                        int d2 = g8c.d(mm5Var, Long.valueOf(j4), true);
                        long j5 = ((af5) mm5Var.get(d2)).e;
                        if (df5Var.c && d2 != mm5Var.size() - 1) {
                            j2 = ((af5) mm5Var.get(d2 + 1)).e;
                        } else {
                            j2 = j5;
                        }
                        return gv9Var.a(j4, j5, j2) + j3;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override
    public final void k() {
        tf5[] tf5VarArr;
        for (tf5 tf5Var : this.K) {
            tf5Var.C();
            if (tf5Var.k0 && !tf5Var.U) {
                throw av7.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long l(long j) {
        tf5[] tf5VarArr = this.L;
        if (tf5VarArr.length > 0) {
            boolean F = tf5VarArr[0].F(j, false);
            int i = 1;
            while (true) {
                tf5[] tf5VarArr2 = this.L;
                if (i >= tf5VarArr2.length) {
                    break;
                }
                tf5VarArr2[i].F(j, F);
                i++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j;
    }

    @Override
    public final void m(long j) {
        tf5[] tf5VarArr;
        for (tf5 tf5Var : this.L) {
            if (tf5Var.T && !tf5Var.z()) {
                int length = tf5Var.M.length;
                for (int i = 0; i < length; i++) {
                    tf5Var.M[i].k(j, tf5Var.e0[i]);
                }
            }
        }
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final void p(rr6 rr6Var, long j) {
        String str;
        pa3 pa3Var;
        boolean z;
        Map map;
        tf5[] tf5VarArr;
        int i;
        ArrayList arrayList;
        int i2;
        mm5 mm5Var;
        Map map2;
        ArrayList arrayList2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        List list;
        this.H = rr6Var;
        ta3 ta3Var = this.b;
        ta3Var.e.add(this);
        hf5 hf5Var = ta3Var.w;
        hf5Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        mm5 c = ta3Var.c(0);
        c.getClass();
        mm5 c2 = ta3Var.c(2);
        c2.getClass();
        mm5 c3 = ta3Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        pa3 pa3Var2 = this.a;
        boolean z6 = this.y;
        if (isEmpty) {
            str = "ID3";
            pa3Var = pa3Var2;
            z = z6;
            map = map3;
        } else {
            fm4 fm4Var = hf5Var.j;
            List list2 = hf5Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                fm4 fm4Var2 = ((of5) c.get(i6)).a.a;
                int i7 = fm4Var2.B;
                String str2 = fm4Var2.l;
                if (i7 <= 0 && g8c.w(2, str2) == null) {
                    if (g8c.w(1, str2) != null) {
                        iArr[i6] = 1;
                        i5++;
                    } else {
                        iArr[i6] = -1;
                    }
                } else {
                    iArr[i6] = 2;
                    i4++;
                    i5 = i5;
                }
            }
            int i8 = i5;
            if (i4 > 0) {
                z4 = false;
                i3 = i4;
                z3 = true;
            } else if (i8 < size) {
                int i9 = size - i8;
                z3 = false;
                i3 = i9;
                z4 = true;
            } else {
                z3 = false;
                z4 = false;
                i3 = size;
            }
            of5[] of5VarArr = new of5[i3];
            fm4[] fm4VarArr = new fm4[i3];
            int i10 = 0;
            boolean z7 = z3;
            int i11 = 0;
            while (i11 < c.size()) {
                if (z7) {
                    list = list2;
                    if (iArr[i11] != 2) {
                        i11++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z4 || iArr[i11] != 1) {
                    of5 of5Var = (of5) c.get(i11);
                    of5VarArr[i10] = of5Var;
                    fm4VarArr[i10] = of5Var.a.a;
                    i10++;
                }
                i11++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = fm4VarArr[0].l;
            int v = g8c.v(2, str3);
            int i12 = 1;
            int v2 = g8c.v(1, str3);
            if ((v2 == 1 || (v2 == 0 && c2.isEmpty())) && v <= 1 && v2 + v > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            z = z6;
            tf5 c4 = c("main", (z7 || v2 <= 0) ? 0 : 0, of5VarArr, fm4VarArr, fm4Var, list3, map3, j);
            arrayList3.add(c4);
            if (z && z5) {
                ArrayList arrayList4 = new ArrayList();
                if (v > 0) {
                    fm4[] fm4VarArr2 = new fm4[i3];
                    int i13 = 0;
                    while (i13 < i3) {
                        fm4 fm4Var3 = fm4VarArr[i13];
                        fm4[] fm4VarArr3 = fm4VarArr;
                        String w = g8c.w(2, fm4Var3.l);
                        String d = ud7.d(w);
                        em4 em4Var = new em4();
                        em4Var.a = fm4Var3.a;
                        em4Var.b = fm4Var3.b;
                        em4Var.c = mm5.q(fm4Var3.c);
                        em4Var.r = ud7.n(fm4Var3.s);
                        em4Var.s = ud7.n(d);
                        em4Var.k = w;
                        em4Var.l = fm4Var3.m;
                        em4Var.i = fm4Var3.i;
                        em4Var.j = fm4Var3.j;
                        em4Var.z = fm4Var3.A;
                        em4Var.A = fm4Var3.B;
                        em4Var.a(fm4Var3.F);
                        em4Var.e = fm4Var3.e;
                        em4Var.f = fm4Var3.f;
                        em4Var.K = fm4Var3.L;
                        fm4VarArr2[i13] = new fm4(em4Var);
                        i13++;
                        fm4VarArr = fm4VarArr3;
                        map3 = map3;
                    }
                    fm4[] fm4VarArr4 = fm4VarArr;
                    map = map3;
                    arrayList4.add(new sxb("main", fm4VarArr2));
                    if (v2 > 0 && (fm4Var != null || c2.isEmpty())) {
                        em4 a = h(fm4VarArr4[0], fm4Var, false).a();
                        a.m = "main";
                        arrayList4.add(new sxb("main:audio", new fm4(a)));
                    }
                    if (list3 != null) {
                        for (int i14 = 0; i14 < list3.size(); i14++) {
                            String k = de9.k(i14, "main:cc:");
                            em4 a2 = pa3Var2.e((fm4) list3.get(i14)).a();
                            a2.m = "main";
                            arrayList4.add(new sxb(k, new fm4(a2)));
                        }
                    }
                    pa3Var = pa3Var2;
                } else {
                    map = map3;
                    pa3Var = pa3Var2;
                    fm4[] fm4VarArr5 = new fm4[i3];
                    for (int i15 = 0; i15 < i3; i15++) {
                        fm4VarArr5[i15] = h(fm4VarArr[i15], fm4Var, true);
                    }
                    arrayList4.add(new sxb("main", fm4VarArr5));
                }
                em4 em4Var2 = new em4();
                str = "ID3";
                em4Var2.a = str;
                em4Var2.s = ud7.n("application/id3");
                em4Var2.m = "main";
                sxb sxbVar = new sxb("main:id3", new fm4(em4Var2));
                arrayList4.add(sxbVar);
                c4.D((sxb[]) arrayList4.toArray(new sxb[0]), arrayList4.indexOf(sxbVar));
            } else {
                map = map3;
                str = "ID3";
                pa3Var = pa3Var2;
            }
        }
        ArrayList arrayList5 = new ArrayList(c2.size());
        ArrayList arrayList6 = new ArrayList(c2.size());
        HashSet hashSet2 = new HashSet();
        int i16 = 0;
        while (i16 < c2.size()) {
            String str4 = ((of5) c2.get(i16)).a.c;
            str4.getClass();
            if (!hashSet2.add(str4)) {
                arrayList = arrayList5;
                i2 = i16;
                mm5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
            } else {
                arrayList5.clear();
                arrayList6.clear();
                boolean z8 = true;
                for (int i17 = 0; i17 < c2.size(); i17++) {
                    if (str4.equals(((of5) c2.get(i17)).a.c)) {
                        of5 of5Var2 = (of5) c2.get(i17);
                        fm4 fm4Var4 = of5Var2.a.a;
                        arrayList5.add(of5Var2);
                        arrayList6.add(fm4Var4);
                        if (g8c.v(1, fm4Var4.l) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z8 &= z2;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = g8c.a;
                arrayList = arrayList5;
                i2 = i16;
                mm5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
                tf5 c5 = c(concat, 1, (of5[]) arrayList5.toArray(new of5[0]), (fm4[]) arrayList6.toArray(new fm4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(c5);
                if (z && z8) {
                    String concat2 = concat.concat(":id3");
                    em4 em4Var3 = new em4();
                    em4Var3.a = str;
                    em4Var3.s = ud7.n("application/id3");
                    em4Var3.m = concat;
                    c5.D(new sxb[]{new sxb(concat, (fm4[]) arrayList2.toArray(new fm4[0])), new sxb(concat2, new fm4(em4Var3))}, 1);
                }
            }
            i16 = i2 + 1;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
            c2 = mm5Var;
            hashSet2 = hashSet;
            map = map2;
        }
        Map map4 = map;
        this.M = arrayList3.size();
        ArrayList arrayList7 = new ArrayList(c3.size());
        ArrayList arrayList8 = new ArrayList(c3.size());
        HashSet hashSet3 = new HashSet();
        int i18 = 0;
        while (i18 < c3.size()) {
            String str6 = ((of5) c3.get(i18)).a.c;
            str6.getClass();
            if (!hashSet3.add(str6)) {
                i = i18;
            } else {
                arrayList7.clear();
                arrayList8.clear();
                for (int i19 = 0; i19 < c3.size(); i19++) {
                    if (str6.equals(((of5) c3.get(i19)).a.c)) {
                        of5 of5Var3 = (of5) c3.get(i19);
                        arrayList7.add(of5Var3);
                        arrayList8.add(of5Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                fm4[] fm4VarArr6 = (fm4[]) arrayList8.toArray(new fm4[0]);
                String str7 = g8c.a;
                km5 km5Var = mm5.b;
                i = i18;
                tf5 c6 = c(concat3, 3, (of5[]) arrayList7.toArray(new of5[0]), fm4VarArr6, null, w59.e, map4, j);
                arrayList3.add(c6);
                int length = fm4VarArr6.length;
                fm4[] fm4VarArr7 = new fm4[length];
                for (int i20 = 0; i20 < length; i20++) {
                    fm4VarArr7[i20] = pa3Var.e(fm4VarArr6[i20]);
                }
                c6.D(new sxb[]{new sxb(concat3, fm4VarArr7)}, new int[0]);
            }
            i18 = i + 1;
        }
        tf5[] tf5VarArr2 = (tf5[]) arrayList3.toArray(new tf5[0]);
        this.K = tf5VarArr2;
        this.I = tf5VarArr2.length;
        int i21 = 0;
        while (true) {
            int i22 = this.M;
            tf5VarArr = this.K;
            if (i21 >= i22) {
                break;
            }
            tf5VarArr[i21].d.m = true;
            i21++;
        }
        for (tf5 tf5Var : tf5VarArr) {
            if (!tf5Var.U) {
                s86 s86Var = new s86();
                s86Var.a = tf5Var.g0;
                tf5Var.r(new t86(s86Var));
            }
        }
        this.L = this.K;
    }

    @Override
    public final txb q() {
        txb txbVar = this.J;
        txbVar.getClass();
        return txbVar;
    }

    @Override
    public final boolean r(t86 t86Var) {
        tf5[] tf5VarArr;
        if (this.J == null) {
            for (tf5 tf5Var : this.K) {
                if (!tf5Var.U) {
                    s86 s86Var = new s86();
                    s86Var.a = tf5Var.g0;
                    tf5Var.r(new t86(s86Var));
                }
            }
            return false;
        }
        return this.N.r(t86Var);
    }

    @Override
    public final long s() {
        return this.N.s();
    }

    @Override
    public final void t(long j) {
        this.N.t(j);
    }

    @Override
    public final void f() {
    }
}
