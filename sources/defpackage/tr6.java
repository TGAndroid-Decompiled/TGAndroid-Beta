package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
public final class tr6 {
    public final ej6 a;
    public final Object b;
    public final ip9[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ur6 g;
    public final boolean[] h;
    public final boolean[] i;
    public final ug0[] j;
    public final sc3 k;
    public final ey6 l;
    public tr6 m;
    public txb n;
    public cyb o;
    public long p;

    public tr6(ug0[] ug0VarArr, long j, sc3 sc3Var, mv6 mv6Var, ey6 ey6Var, ur6 ur6Var, cyb cybVar) {
        this.j = ug0VarArr;
        this.p = j;
        this.k = sc3Var;
        this.l = ey6Var;
        rx6 rx6Var = ur6Var.a;
        Object obj = rx6Var.a;
        this.b = obj;
        this.g = ur6Var;
        this.n = txb.d;
        this.o = cybVar;
        this.c = new ip9[ug0VarArr.length];
        this.h = new boolean[ug0VarArr.length];
        this.i = new boolean[ug0VarArr.length];
        long j2 = ur6Var.b;
        ey6Var.getClass();
        int i = dd8.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        rx6 a = rx6Var.a(pair.second);
        dy6 dy6Var = (dy6) ey6Var.e.get(obj2);
        dy6Var.getClass();
        ey6Var.h.add(dy6Var);
        cy6 cy6Var = (cy6) ey6Var.g.get(dy6Var);
        if (cy6Var != null) {
            cy6Var.a.f(cy6Var.b);
        }
        dy6Var.c.add(a);
        ej6 c = dy6Var.a.c(a, mv6Var, j2);
        ey6Var.d.put(c, dy6Var);
        ey6Var.c();
        this.a = c;
    }

    public final long a(cyb cybVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        ug0[] ug0VarArr;
        boolean[] zArr3;
        ip9[] ip9VarArr;
        boolean z2;
        k64[] k64VarArr = (k64[]) cybVar.d;
        int i = 0;
        while (true) {
            int i2 = cybVar.b;
            zArr2 = this.i;
            boolean z3 = true;
            if (i >= i2) {
                break;
            }
            if (z || !cybVar.p(this.o, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        int i3 = 0;
        while (true) {
            ug0VarArr = this.j;
            int length = ug0VarArr.length;
            zArr3 = zArr2;
            ip9VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (ug0VarArr[i3].b == -2) {
                ip9VarArr[i3] = 0;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = cybVar;
        c();
        long e = this.a.e(k64VarArr, zArr3, ip9VarArr, zArr, j);
        for (int i4 = 0; i4 < ug0VarArr.length; i4++) {
            if (ug0VarArr[i4].b == -2 && this.o.q(i4)) {
                ip9VarArr[i4] = new Object();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < ip9VarArr.length; i5++) {
            if (ip9VarArr[i5] != 0) {
                gre.p(cybVar.q(i5));
                if (ug0VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                if (k64VarArr[i5] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                gre.p(z2);
            }
        }
        return e;
    }

    public final void b() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                cyb cybVar = this.o;
                if (i < cybVar.b) {
                    boolean q = cybVar.q(i);
                    k64 k64Var = ((k64[]) this.o.d)[i];
                    if (q && k64Var != null) {
                        k64Var.m();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                cyb cybVar = this.o;
                if (i < cybVar.b) {
                    boolean q = cybVar.q(i);
                    k64 k64Var = ((k64[]) this.o.d)[i];
                    if (q && k64Var != null) {
                        k64Var.j();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j;
        if (!this.e) {
            return this.g.b;
        }
        if (this.f) {
            j = this.a.s();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.g.e;
        }
        return j;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, aob aobVar, boolean z) {
        this.e = true;
        this.n = this.a.q();
        cyb j = j(f, aobVar, z);
        ur6 ur6Var = this.g;
        long j2 = ur6Var.b;
        long j3 = ur6Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        ur6 ur6Var2 = this.g;
        this.p = (ur6Var2.b - a) + j4;
        this.g = ur6Var2.b(a, ur6Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f || this.a.s() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.g.b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ey6 ey6Var = this.l;
        ej6 ej6Var = this.a;
        try {
            IdentityHashMap identityHashMap = ey6Var.d;
            dy6 dy6Var = (dy6) identityHashMap.remove(ej6Var);
            dy6Var.getClass();
            dy6Var.a.o(ej6Var);
            dy6Var.c.remove(ej6Var.a);
            if (!identityHashMap.isEmpty()) {
                ey6Var.c();
            }
            ey6Var.d(dy6Var);
        } catch (RuntimeException e) {
            lad.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final cyb j(float f, aob aobVar, boolean z) {
        int i;
        nc3 nc3Var;
        int i2;
        boolean z2;
        int[] iArr;
        Context context;
        String str;
        nc3 nc3Var2;
        int i3;
        j64[] j64VarArr;
        String str2;
        int[] iArr2;
        txb[] txbVarArr;
        int[][][] iArr3;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int[] iArr4;
        s93 s93Var;
        w59 f2;
        w59 f3;
        k64[] k64VarArr;
        boolean z5;
        boolean z6;
        boolean z7;
        w59 w59Var;
        int i6;
        boolean z8;
        d79 d79Var;
        vg0 maVar;
        int i7;
        int[] iArr5;
        long[][] jArr;
        double d;
        long j;
        String str3;
        Pair l;
        CaptioningManager captioningManager;
        Locale locale;
        Point point;
        Pair l2;
        Pair l3;
        int i8;
        boolean z9;
        Context context2;
        int i9;
        int[] iArr6;
        int i10;
        sc3 sc3Var = this.k;
        ug0[] ug0VarArr = this.j;
        txb txbVar = this.n;
        sc3Var.getClass();
        int i11 = 1;
        int[] iArr7 = new int[ug0VarArr.length + 1];
        int length = ug0VarArr.length + 1;
        sxb[][] sxbVarArr = new sxb[length];
        int[][][] iArr8 = new int[ug0VarArr.length + 1][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = txbVar.a;
            sxbVarArr[i12] = new sxb[i13];
            iArr8[i12] = new int[i13];
        }
        int length2 = ug0VarArr.length;
        int[] iArr9 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            iArr9[i14] = ug0VarArr[i14].H();
        }
        int i15 = 0;
        while (i15 < txbVar.a) {
            sxb a = txbVar.a(i15);
            if (a.c == 5) {
                i9 = i11;
            } else {
                i9 = 0;
            }
            int length3 = ug0VarArr.length;
            int i16 = i11;
            int i17 = 0;
            int i18 = 0;
            while (i18 < ug0VarArr.length) {
                ug0 ug0Var = ug0VarArr[i18];
                txb txbVar2 = txbVar;
                int[] iArr10 = iArr7;
                int i19 = i11;
                int i20 = 0;
                for (int i21 = 0; i21 < a.a; i21++) {
                    i20 = Math.max(i20, ug0Var.G(a.d[i21]) & 7);
                }
                if (iArr10[i18] == 0) {
                    i10 = i19;
                } else {
                    i10 = 0;
                }
                if (i20 > i17 || (i20 == i17 && i9 != 0 && i16 == 0 && i10 != 0)) {
                    i17 = i20;
                    i16 = i10;
                    length3 = i18;
                }
                i18++;
                txbVar = txbVar2;
                iArr7 = iArr10;
                i11 = i19;
            }
            txb txbVar3 = txbVar;
            int[] iArr11 = iArr7;
            int i22 = i11;
            if (length3 == ug0VarArr.length) {
                iArr6 = new int[a.a];
            } else {
                ug0 ug0Var2 = ug0VarArr[length3];
                int[] iArr12 = new int[a.a];
                for (int i23 = 0; i23 < a.a; i23++) {
                    iArr12[i23] = ug0Var2.G(a.d[i23]);
                }
                iArr6 = iArr12;
            }
            int i24 = iArr11[length3];
            sxbVarArr[length3][i24] = a;
            iArr8[length3][i24] = iArr6;
            iArr11[length3] = i24 + 1;
            i15++;
            txbVar = txbVar3;
            iArr7 = iArr11;
            i11 = i22;
        }
        int[] iArr13 = iArr7;
        int i25 = i11;
        txb[] txbVarArr2 = new txb[ug0VarArr.length];
        String[] strArr = new String[ug0VarArr.length];
        int[] iArr14 = new int[ug0VarArr.length];
        for (int i26 = 0; i26 < ug0VarArr.length; i26++) {
            int i27 = iArr13[i26];
            txbVarArr2[i26] = new txb((sxb[]) g8c.V(i27, sxbVarArr[i26]));
            iArr8[i26] = (int[][]) g8c.V(i27, iArr8[i26]);
            strArr[i26] = ug0VarArr[i26].l();
            iArr14[i26] = ug0VarArr[i26].b;
        }
        int[] iArr15 = iArr14;
        ko koVar = new ko(iArr15, txbVarArr2, iArr9, iArr8, new txb((sxb[]) g8c.V(iArr13[ug0VarArr.length], sxbVarArr[ug0VarArr.length])));
        sc3Var.h = Thread.currentThread();
        Boolean bool = sc3Var.k;
        if (bool == null && (context2 = sc3Var.d) != null) {
            bool = Boolean.valueOf(g8c.Q(context2));
            sc3Var.k = bool;
        }
        if (sc3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && sc3Var.i == null) {
            sc3Var.i = new ska(sc3Var.d, new mk2(sc3Var, (byte) 22), bool);
        }
        int i28 = koVar.a;
        j64[] j64VarArr2 = new j64[i28];
        sc3.c(koVar, sc3Var.g, j64VarArr2);
        sc3.a(koVar, sc3Var.g, j64VarArr2);
        sc3.b(koVar, sc3Var.g, j64VarArr2);
        nc3 nc3Var3 = sc3Var.g;
        Context context3 = sc3Var.d;
        int i29 = koVar.a;
        Pair e = sc3.e(j64VarArr2, i25);
        if (e == null) {
            int i30 = 0;
            while (true) {
                if (i30 < i29) {
                    if (2 == iArr15[i30] && txbVarArr2[i30].a > 0) {
                        i8 = 2;
                        z9 = true;
                        break;
                    }
                    i30++;
                } else {
                    i8 = 2;
                    z9 = false;
                    break;
                }
            }
            i = i29;
            nc3Var = nc3Var3;
            i2 = i8;
            context = context3;
            xf xfVar = new xf(sc3Var, nc3Var, z9, iArr9, (byte) 3);
            z2 = true;
            iArr = iArr9;
            e = sc3.l(1, koVar, iArr8, xfVar, new mz2((byte) 7));
            if (e != null) {
                j64VarArr2[((Integer) e.second).intValue()] = (j64) e.first;
            }
        } else {
            i = i29;
            nc3Var = nc3Var3;
            i2 = 2;
            z2 = true;
            iArr = iArr9;
            context = context3;
        }
        if (e == null) {
            str = null;
        } else {
            j64 j64Var = (j64) e.first;
            str = j64Var.a.d[j64Var.b[0]].d;
        }
        Pair e2 = sc3.e(j64VarArr2, i2);
        Pair e3 = sc3.e(j64VarArr2, 4);
        if (e2 == null && e3 == null) {
            if (nc3Var.w.a == i2) {
                int i31 = i;
                nc3Var2 = nc3Var;
                i3 = i31;
                j64VarArr = j64VarArr2;
                str2 = str;
                l2 = null;
            } else {
                if (nc3Var.k && context != null) {
                    point = g8c.y(context);
                } else {
                    point = null;
                }
                j64VarArr = j64VarArr2;
                int i32 = i;
                nc3Var2 = nc3Var;
                i3 = i32;
                str2 = str;
                l2 = sc3.l(i2, koVar, iArr8, new lt(nc3Var2, str, iArr, point, (byte) 11), new mz2((byte) 6));
            }
            if ((!nc3Var2.E && l2 != null) || nc3Var2.w.a == i2) {
                l3 = null;
            } else {
                l3 = sc3.l(4, koVar, iArr8, new vu2(nc3Var2, (byte) 18), new mz2((byte) 5));
            }
            if (l3 != null) {
                j64VarArr[((Integer) l3.second).intValue()] = (j64) l3.first;
            } else if (l2 != null) {
                j64VarArr[((Integer) l2.second).intValue()] = (j64) l2.first;
            }
        } else {
            int i33 = i;
            nc3Var2 = nc3Var;
            i3 = i33;
            j64VarArr = j64VarArr2;
            str2 = str;
        }
        if (sc3.e(j64VarArr, 3) == null) {
            if (nc3Var2.w.a == 2) {
                l = null;
            } else {
                if (nc3Var2.B && context != null && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
                    String str4 = g8c.a;
                    str3 = locale.toLanguageTag();
                } else {
                    str3 = null;
                }
                l = sc3.l(3, koVar, iArr8, new lt2(nc3Var2, str2, str3, (byte) 5), new mz2((byte) 8));
            }
            if (l != null) {
                j64VarArr[((Integer) l.second).intValue()] = (j64) l.first;
            }
        }
        int a2 = ls6.a(0, 0, 0, 0);
        if (nc3Var2.w.a == 2) {
            iArr2 = iArr15;
            txbVarArr = txbVarArr2;
            iArr3 = iArr8;
        } else {
            int i34 = ym5.c;
            ?? em5Var = new em5(4);
            int i35 = 0;
            while (i35 < i28) {
                j64 j64Var2 = j64VarArr[i35];
                if (j64Var2 != null) {
                    sxb sxbVar = j64Var2.a;
                    if (!nc3Var2.E0.get(i35)) {
                        i5 = i35;
                        if (!nc3Var2.I.contains(Integer.valueOf(sxbVar.c))) {
                            em5Var.f(sxbVar.b);
                            int i36 = 0;
                            while (true) {
                                int[] iArr16 = j64Var2.b;
                                iArr4 = iArr15;
                                if (i36 < iArr16.length) {
                                    String str5 = sxbVar.d[iArr16[i36]].n;
                                    if (str5 != null) {
                                        em5Var.c(str5);
                                    }
                                    i36++;
                                    iArr15 = iArr4;
                                }
                            }
                            i35 = i5 + 1;
                            iArr15 = iArr4;
                        }
                        iArr4 = iArr15;
                        i35 = i5 + 1;
                        iArr15 = iArr4;
                    }
                }
                i5 = i35;
                iArr4 = iArr15;
                i35 = i5 + 1;
                iArr15 = iArr4;
            }
            iArr2 = iArr15;
            ym5 g = em5Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i37 = 0;
            while (i37 < i3) {
                if (iArr2[i37] != 5) {
                    i4 = i37;
                } else {
                    txb txbVar4 = txbVarArr2[i37];
                    i4 = i37;
                    int i38 = 0;
                    while (i38 < txbVar4.a) {
                        sxb a3 = txbVar4.a(i38);
                        arrayList.add(a3);
                        txb[] txbVarArr3 = txbVarArr2;
                        int[] iArr17 = (int[]) iArr8[i4][i38].clone();
                        txb txbVar5 = txbVar4;
                        int[][][] iArr18 = iArr8;
                        for (int i39 = 0; i39 < iArr17.length; i39++) {
                            String str6 = a3.d[i39].n;
                            if (str6 != null && !g.contains(str6)) {
                                iArr17[i39] = a2;
                            }
                        }
                        arrayList2.add(iArr17);
                        i38++;
                        txbVar4 = txbVar5;
                        txbVarArr2 = txbVarArr3;
                        iArr8 = iArr18;
                    }
                }
                i37 = i4 + 1;
                txbVarArr2 = txbVarArr2;
                iArr8 = iArr8;
            }
            txbVarArr = txbVarArr2;
            iArr3 = iArr8;
            int size = arrayList.size();
            sxb[] sxbVarArr2 = new sxb[size];
            if (arrayList.size() == size) {
                z3 = true;
            } else {
                z3 = false;
            }
            gre.p(z3);
            arrayList.toArray(sxbVarArr2);
            txb txbVar6 = new txb(sxbVarArr2);
            int size2 = arrayList2.size();
            int[][] iArr19 = new int[size2];
            if (arrayList2.size() == size2) {
                z4 = true;
            } else {
                z4 = false;
            }
            gre.p(z4);
            arrayList2.toArray(iArr19);
            for (int i40 = 0; i40 < i3; i40++) {
                if (iArr2[i40] == 5) {
                    j64 k = sc3.k(txbVar6, iArr19, nc3Var2);
                    j64VarArr[i40] = k;
                    if (k == null) {
                        break;
                    }
                    Arrays.fill(iArr19[txbVar6.b(k.a)], a2);
                }
            }
        }
        for (int i41 = 0; i41 < i3; i41++) {
            int i42 = iArr2[i41];
            if (i42 != 2 && i42 != 1 && i42 != 3 && i42 != 4 && i42 != 5 && j64VarArr[i41] == null) {
                j64VarArr[i41] = sc3.k(txbVarArr[i41], iArr3[i41], nc3Var2);
            }
        }
        sc3.c(koVar, sc3Var.g, j64VarArr);
        sc3.a(koVar, sc3Var.g, j64VarArr);
        sc3.b(koVar, sc3Var.g, j64VarArr);
        o5f o5fVar = sc3Var.e;
        s93 s93Var2 = sc3Var.b;
        s93Var2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (j64 j64Var3 : j64VarArr) {
            if (j64Var3 != null && j64Var3.b.length > 1) {
                jm5 p = mm5.p();
                p.c(new la(0L, 0L));
                arrayList3.add(p);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = j64VarArr.length;
        long[][] jArr2 = new long[length4];
        for (int i43 = 0; i43 < j64VarArr.length; i43++) {
            j64 j64Var4 = j64VarArr[i43];
            if (j64Var4 == null) {
                jArr2[i43] = new long[0];
            } else {
                int[] iArr20 = j64Var4.b;
                jArr2[i43] = new long[iArr20.length];
                for (int i44 = 0; i44 < iArr20.length; i44++) {
                    long j2 = j64Var4.a.d[iArr20[i44]].k;
                    long[] jArr3 = jArr2[i43];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr3[i44] = j2;
                }
                Arrays.sort(jArr2[i43]);
            }
        }
        int[] iArr21 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i45 = 0; i45 < length4; i45++) {
            long[] jArr5 = jArr2[i45];
            if (jArr5.length == 0) {
                j = 0;
            } else {
                j = jArr5[0];
            }
            jArr4[i45] = j;
        }
        ma.w(arrayList3, jArr4);
        krd.b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(hi7.b);
        ?? obj = new Object();
        krd.b(2, "expectedValuesPerKey");
        wg7 wg7Var = new wg7(treeMap);
        wg7Var.h = obj;
        int i46 = 0;
        loop13: while (true) {
            if (i46 < length4) {
                long[] jArr6 = jArr2[i46];
                if (jArr6.length <= 1) {
                    s93Var = s93Var2;
                    i7 = length4;
                    iArr5 = iArr21;
                    jArr = jArr2;
                } else {
                    int length5 = jArr6.length;
                    double[] dArr = new double[length5];
                    s93Var = s93Var2;
                    int i47 = 0;
                    while (true) {
                        long[] jArr7 = jArr2[i46];
                        i7 = length4;
                        double d2 = 0.0d;
                        iArr5 = iArr21;
                        if (i47 >= jArr7.length) {
                            break;
                        }
                        long[][] jArr8 = jArr2;
                        long j3 = jArr7[i47];
                        if (j3 != -1) {
                            d2 = Math.log(j3);
                        }
                        dArr[i47] = d2;
                        i47++;
                        jArr2 = jArr8;
                        length4 = i7;
                        iArr21 = iArr5;
                    }
                    long[][] jArr9 = jArr2;
                    int i48 = length5 - 1;
                    double d3 = dArr[i48] - dArr[0];
                    int i49 = 0;
                    while (i49 < i48) {
                        double d4 = dArr[i49];
                        int i50 = i49 + 1;
                        double d5 = (d4 + dArr[i50]) * 0.5d;
                        if (d3 == 0.0d) {
                            d = 1.0d;
                        } else {
                            d = (d5 - dArr[0]) / d3;
                        }
                        Double valueOf = Double.valueOf(d);
                        Integer valueOf2 = Integer.valueOf(i46);
                        long[][] jArr10 = jArr9;
                        Map map = wg7Var.e;
                        double d6 = d3;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            Collection m = wg7Var.m();
                            if (m.add(valueOf2)) {
                                wg7Var.f++;
                                map.put(valueOf, m);
                            } else {
                                fi7.g("New Collection violated the Collection spec");
                                f2 = null;
                                break loop13;
                            }
                        } else if (collection.add(valueOf2)) {
                            wg7Var.f++;
                        }
                        i49 = i50;
                        jArr9 = jArr10;
                        d3 = d6;
                    }
                    jArr = jArr9;
                }
                i46++;
                length4 = i7;
                iArr21 = iArr5;
                jArr2 = jArr;
                s93Var2 = s93Var;
            } else {
                s93Var = s93Var2;
                int[] iArr22 = iArr21;
                long[][] jArr11 = jArr2;
                Collection collection2 = wg7Var.c;
                if (collection2 == null) {
                    collection2 = new p3(wg7Var, (byte) 1);
                    wg7Var.c = collection2;
                }
                mm5 q = mm5.q(collection2);
                for (int i51 = 0; i51 < q.size(); i51++) {
                    int intValue = ((Integer) q.get(i51)).intValue();
                    int i52 = iArr22[intValue] + 1;
                    iArr22[intValue] = i52;
                    jArr4[intValue] = jArr11[intValue][i52];
                    ma.w(arrayList3, jArr4);
                }
                for (int i53 = 0; i53 < j64VarArr.length; i53++) {
                    if (arrayList3.get(i53) != null) {
                        jArr4[i53] = jArr4[i53] << 1;
                    }
                }
                ma.w(arrayList3, jArr4);
                jm5 p2 = mm5.p();
                for (int i54 = 0; i54 < arrayList3.size(); i54++) {
                    jm5 jm5Var = (jm5) arrayList3.get(i54);
                    if (jm5Var == null) {
                        f3 = w59.e;
                    } else {
                        f3 = jm5Var.f();
                    }
                    p2.c(f3);
                }
                f2 = p2.f();
            }
        }
        k64[] k64VarArr2 = new k64[j64VarArr.length];
        for (int i55 = 0; i55 < j64VarArr.length; i55++) {
            j64 j64Var5 = j64VarArr[i55];
            if (j64Var5 != null) {
                int[] iArr23 = j64Var5.b;
                if (iArr23.length != 0) {
                    int length6 = iArr23.length;
                    sxb sxbVar2 = j64Var5.a;
                    if (length6 == 1) {
                        maVar = new vg0(0, sxbVar2, new int[]{iArr23[0]});
                    } else {
                        maVar = new ma(sxbVar2, iArr23, s93Var, 10000L, 25000L, 25000L, (mm5) f2.get(i55));
                    }
                    k64VarArr2[i55] = maVar;
                }
            }
        }
        d79[] d79VarArr = new d79[i28];
        for (int i56 = 0; i56 < i28; i56++) {
            int i57 = ((int[]) koVar.b)[i56];
            if (!sc3Var.g.E0.get(i56) && !sc3Var.g.I.contains(Integer.valueOf(i57)) && (((int[]) koVar.b)[i56] == -2 || k64VarArr2[i56] != null)) {
                d79Var = d79.c;
            } else {
                d79Var = null;
            }
            d79VarArr[i56] = d79Var;
        }
        sc3Var.g.getClass();
        nc3 nc3Var4 = sc3Var.g;
        if (nc3Var4.w.a != 0) {
            int i58 = 0;
            int i59 = 0;
            int i60 = -1;
            while (true) {
                if (i58 < koVar.a) {
                    int i61 = ((int[]) koVar.b)[i58];
                    k64 k64Var = k64VarArr2[i58];
                    if (i61 != 1) {
                        if (k64Var != null) {
                            break;
                        }
                    } else if (k64Var != null && k64Var.length() == 1) {
                        if (sc3.j(nc3Var4, iArr3[i58][((txb[]) koVar.c)[i58].b(k64Var.c())][k64Var.k(0)], k64Var.o())) {
                            i59++;
                            i60 = i58;
                        }
                    }
                    i58++;
                } else if (i59 == 1) {
                    if (nc3Var4.w.b) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    d79 d79Var2 = d79VarArr[i60];
                    if (d79Var2 != null && d79Var2.b) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    d79VarArr[i60] = new d79(i6, z8);
                }
            }
        }
        Pair create = Pair.create(d79VarArr, k64VarArr2);
        k64[] k64VarArr3 = (k64[]) create.second;
        int length7 = k64VarArr3.length;
        List[] listArr = new List[length7];
        for (int i62 = 0; i62 < k64VarArr3.length; i62++) {
            k64 k64Var2 = k64VarArr3[i62];
            if (k64Var2 != null) {
                w59Var = mm5.u(k64Var2);
            } else {
                km5 km5Var = mm5.b;
                w59Var = w59.e;
            }
            listArr[i62] = w59Var;
        }
        ?? em5Var2 = new em5(4);
        int i63 = 0;
        while (true) {
            int i64 = koVar.a;
            txb[] txbVarArr4 = (txb[]) koVar.c;
            if (i63 >= i64) {
                break;
            }
            txb txbVar7 = txbVarArr4[i63];
            int i65 = 0;
            while (i65 < txbVar7.a) {
                sxb a4 = txbVar7.a(i65);
                int i66 = txbVarArr4[i63].a(i65).a;
                int[] iArr24 = new int[i66];
                int i67 = 0;
                int i68 = 0;
                while (i68 < i66) {
                    List[] listArr2 = listArr;
                    if ((((int[][][]) koVar.e)[i63][i65][i68] & 7) == 4) {
                        iArr24[i67] = i68;
                        i67++;
                    }
                    i68++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr24, i67);
                int i69 = 16;
                int i70 = i63;
                String str7 = null;
                int i71 = 0;
                boolean z10 = false;
                int i72 = 0;
                while (i71 < copyOf.length) {
                    int[] iArr25 = copyOf;
                    String str8 = txbVarArr4[i70].a(i65).d[copyOf[i71]].t;
                    int i73 = i72 + 1;
                    if (i72 == 0) {
                        str7 = str8;
                    } else {
                        z10 |= !Objects.equals(str7, str8);
                    }
                    i69 = Math.min(i69, ((int[][][]) koVar.e)[i70][i65][i71] & 24);
                    i71++;
                    i72 = i73;
                    copyOf = iArr25;
                }
                if (z10) {
                    i69 = Math.min(i69, ((int[]) koVar.d)[i70]);
                }
                if (i69 != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int i74 = a4.a;
                int[] iArr26 = new int[i74];
                boolean[] zArr = new boolean[i74];
                int i75 = 0;
                while (i75 < a4.a) {
                    iArr26[i75] = ((int[][][]) koVar.e)[i70][i65][i75] & 7;
                    int i76 = 0;
                    boolean z11 = false;
                    while (i76 < length7) {
                        List list = listArr3[i76];
                        int i77 = length7;
                        txb txbVar8 = txbVar7;
                        int i78 = 0;
                        while (true) {
                            if (i78 < list.size()) {
                                k64 k64Var3 = (k64) list.get(i78);
                                int i79 = i78;
                                if (k64Var3.c().equals(a4) && k64Var3.v(i75) != -1) {
                                    z11 = true;
                                    break;
                                }
                                i78 = i79 + 1;
                            }
                        }
                        i76++;
                        length7 = i77;
                        txbVar7 = txbVar8;
                    }
                    zArr[i75] = z11;
                    i75++;
                    txbVar7 = txbVar7;
                }
                em5Var2.c(new dyb(a4, z7, iArr26, zArr));
                i65++;
                listArr = listArr3;
                i63 = i70;
                length7 = length7;
                txbVar7 = txbVar7;
            }
            i63++;
        }
        txb txbVar9 = (txb) koVar.f;
        for (int i80 = 0; i80 < txbVar9.a; i80++) {
            sxb a5 = txbVar9.a(i80);
            int[] iArr27 = new int[a5.a];
            Arrays.fill(iArr27, 0);
            em5Var2.c(new dyb(a5, false, iArr27, new boolean[a5.a]));
        }
        cyb cybVar = new cyb((d79[]) create.first, (k64[]) create.second, new eyb(em5Var2.f()), koVar);
        for (int i81 = 0; i81 < cybVar.b; i81++) {
            boolean q2 = cybVar.q(i81);
            k64[] k64VarArr4 = (k64[]) cybVar.d;
            if (q2) {
                if (k64VarArr4[i81] == null && this.j[i81].b != -2) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                gre.p(z6);
            } else {
                if (k64VarArr4[i81] == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                gre.p(z5);
            }
        }
        for (k64 k64Var4 : (k64[]) cybVar.d) {
            if (k64Var4 != null) {
                k64Var4.r(f);
                k64Var4.h(z);
            }
        }
        return cybVar;
    }
}
