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
public final class yt6 {
    public final jl6 a;
    public final Object b;
    public final at9[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public zt6 g;
    public final boolean[] h;
    public final boolean[] i;
    public final vg0[] j;
    public final ld3 k;
    public final i07 l;
    public yt6 m;
    public u1c n;
    public d2c o;
    public long p;

    public yt6(vg0[] vg0VarArr, long j, ld3 ld3Var, rx6 rx6Var, i07 i07Var, zt6 zt6Var, d2c d2cVar) {
        this.j = vg0VarArr;
        this.p = j;
        this.k = ld3Var;
        this.l = i07Var;
        vz6 vz6Var = zt6Var.a;
        Object obj = vz6Var.a;
        this.b = obj;
        this.g = zt6Var;
        this.n = u1c.d;
        this.o = d2cVar;
        this.c = new at9[vg0VarArr.length];
        this.h = new boolean[vg0VarArr.length];
        this.i = new boolean[vg0VarArr.length];
        long j2 = zt6Var.b;
        i07Var.getClass();
        int i = rg8.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        vz6 a = vz6Var.a(pair.second);
        h07 h07Var = (h07) i07Var.e.get(obj2);
        h07Var.getClass();
        i07Var.h.add(h07Var);
        g07 g07Var = (g07) i07Var.g.get(h07Var);
        if (g07Var != null) {
            g07Var.a.f(g07Var.b);
        }
        h07Var.c.add(a);
        jl6 c = h07Var.a.c(a, rx6Var, j2);
        i07Var.d.put(c, h07Var);
        i07Var.c();
        this.a = c;
    }

    public final long a(d2c d2cVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        vg0[] vg0VarArr;
        boolean[] zArr3;
        at9[] at9VarArr;
        boolean z2;
        e74[] e74VarArr = (e74[]) d2cVar.d;
        int i = 0;
        while (true) {
            int i2 = d2cVar.b;
            zArr2 = this.i;
            boolean z3 = true;
            if (i >= i2) {
                break;
            }
            if (z || !d2cVar.p(this.o, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        int i3 = 0;
        while (true) {
            vg0VarArr = this.j;
            int length = vg0VarArr.length;
            zArr3 = zArr2;
            at9VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (vg0VarArr[i3].b == -2) {
                at9VarArr[i3] = 0;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = d2cVar;
        c();
        long c = this.a.c(e74VarArr, zArr3, at9VarArr, zArr, j);
        for (int i4 = 0; i4 < vg0VarArr.length; i4++) {
            if (vg0VarArr[i4].b == -2 && this.o.q(i4)) {
                at9VarArr[i4] = new Object();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < at9VarArr.length; i5++) {
            if (at9VarArr[i5] != 0) {
                yve.p(d2cVar.q(i5));
                if (vg0VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                if (e74VarArr[i5] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                yve.p(z2);
            }
        }
        return c;
    }

    public final void b() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                d2c d2cVar = this.o;
                if (i < d2cVar.b) {
                    boolean q = d2cVar.q(i);
                    e74 e74Var = ((e74[]) this.o.d)[i];
                    if (q && e74Var != null) {
                        e74Var.l();
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
                d2c d2cVar = this.o;
                if (i < d2cVar.b) {
                    boolean q = d2cVar.q(i);
                    e74 e74Var = ((e74[]) this.o.d)[i];
                    if (q && e74Var != null) {
                        e74Var.enable();
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
            j = this.a.t();
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

    public final void f(float f, asb asbVar, boolean z) {
        this.e = true;
        this.n = this.a.r();
        d2c j = j(f, asbVar, z);
        zt6 zt6Var = this.g;
        long j2 = zt6Var.b;
        long j3 = zt6Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        zt6 zt6Var2 = this.g;
        this.p = (zt6Var2.b - a) + j4;
        this.g = zt6Var2.b(a, zt6Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f || this.a.t() == Long.MIN_VALUE) {
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
        i07 i07Var = this.l;
        jl6 jl6Var = this.a;
        try {
            IdentityHashMap identityHashMap = i07Var.d;
            h07 h07Var = (h07) identityHashMap.remove(jl6Var);
            h07Var.getClass();
            h07Var.a.o(jl6Var);
            h07Var.c.remove(jl6Var.a);
            if (!identityHashMap.isEmpty()) {
                i07Var.c();
            }
            i07Var.d(h07Var);
        } catch (RuntimeException e) {
            efd.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final d2c j(float f, asb asbVar, boolean z) {
        int i;
        gd3 gd3Var;
        int i2;
        boolean z2;
        int[] iArr;
        Context context;
        String str;
        gd3 gd3Var2;
        int i3;
        d74[] d74VarArr;
        String str2;
        int[] iArr2;
        u1c[] u1cVarArr;
        int[][][] iArr3;
        int i4;
        int i5;
        int[] iArr4;
        la3 la3Var;
        j99 f2;
        j99 f3;
        e74[] e74VarArr;
        j99 j99Var;
        wg0 naVar;
        int i6;
        int[] iArr5;
        long[][] jArr;
        String str3;
        Pair l;
        CaptioningManager captioningManager;
        Locale locale;
        Pair l2;
        int i7;
        boolean z3;
        Context context2;
        int[] iArr6;
        ld3 ld3Var = this.k;
        vg0[] vg0VarArr = this.j;
        u1c u1cVar = this.n;
        ld3Var.getClass();
        int i8 = 1;
        int[] iArr7 = new int[vg0VarArr.length + 1];
        int length = vg0VarArr.length + 1;
        t1c[][] t1cVarArr = new t1c[length];
        int[][][] iArr8 = new int[vg0VarArr.length + 1][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = u1cVar.a;
            t1cVarArr[i9] = new t1c[i10];
            iArr8[i9] = new int[i10];
        }
        int length2 = vg0VarArr.length;
        int[] iArr9 = new int[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            iArr9[i11] = vg0VarArr[i11].H();
        }
        int i12 = 0;
        while (i12 < u1cVar.a) {
            t1c a = u1cVar.a(i12);
            int i13 = a.c == 5 ? i8 : 0;
            int length3 = vg0VarArr.length;
            int i14 = i8;
            int i15 = 0;
            int i16 = 0;
            while (i16 < vg0VarArr.length) {
                vg0 vg0Var = vg0VarArr[i16];
                u1c u1cVar2 = u1cVar;
                int[] iArr10 = iArr7;
                int i17 = i8;
                int i18 = 0;
                for (int i19 = 0; i19 < a.a; i19++) {
                    i18 = Math.max(i18, vg0Var.G(a.d[i19]) & 7);
                }
                int i20 = iArr10[i16] == 0 ? i17 : 0;
                if (i18 > i15 || (i18 == i15 && i13 != 0 && i14 == 0 && i20 != 0)) {
                    i15 = i18;
                    i14 = i20;
                    length3 = i16;
                }
                i16++;
                u1cVar = u1cVar2;
                iArr7 = iArr10;
                i8 = i17;
            }
            u1c u1cVar3 = u1cVar;
            int[] iArr11 = iArr7;
            int i21 = i8;
            if (length3 == vg0VarArr.length) {
                iArr6 = new int[a.a];
            } else {
                vg0 vg0Var2 = vg0VarArr[length3];
                int[] iArr12 = new int[a.a];
                for (int i22 = 0; i22 < a.a; i22++) {
                    iArr12[i22] = vg0Var2.G(a.d[i22]);
                }
                iArr6 = iArr12;
            }
            int i23 = iArr11[length3];
            t1cVarArr[length3][i23] = a;
            iArr8[length3][i23] = iArr6;
            iArr11[length3] = i23 + 1;
            i12++;
            u1cVar = u1cVar3;
            iArr7 = iArr11;
            i8 = i21;
        }
        int[] iArr13 = iArr7;
        int i24 = i8;
        u1c[] u1cVarArr2 = new u1c[vg0VarArr.length];
        String[] strArr = new String[vg0VarArr.length];
        int[] iArr14 = new int[vg0VarArr.length];
        for (int i25 = 0; i25 < vg0VarArr.length; i25++) {
            int i26 = iArr13[i25];
            u1cVarArr2[i25] = new u1c((t1c[]) gcc.V(i26, t1cVarArr[i25]));
            iArr8[i25] = (int[][]) gcc.V(i26, iArr8[i25]);
            strArr[i25] = vg0VarArr[i25].l();
            iArr14[i25] = vg0VarArr[i25].b;
        }
        int[] iArr15 = iArr14;
        lo loVar = new lo(iArr15, u1cVarArr2, iArr9, iArr8, new u1c((t1c[]) gcc.V(iArr13[vg0VarArr.length], t1cVarArr[vg0VarArr.length])));
        ld3Var.h = Thread.currentThread();
        Boolean bool = ld3Var.k;
        if (bool == null && (context2 = ld3Var.d) != null) {
            bool = Boolean.valueOf(gcc.Q(context2));
            ld3Var.k = bool;
        }
        if (ld3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && ld3Var.i == null) {
            ld3Var.i = new moa(ld3Var.d, new vd2(ld3Var, (byte) 28), bool);
        }
        int i27 = loVar.a;
        d74[] d74VarArr2 = new d74[i27];
        ld3.c(loVar, ld3Var.g, d74VarArr2);
        ld3.a(loVar, ld3Var.g, d74VarArr2);
        ld3.b(loVar, ld3Var.g, d74VarArr2);
        gd3 gd3Var3 = ld3Var.g;
        Context context3 = ld3Var.d;
        int i28 = loVar.a;
        Pair e = ld3.e(d74VarArr2, i24);
        if (e == null) {
            int i29 = 0;
            while (true) {
                if (i29 >= i28) {
                    i7 = 2;
                    z3 = false;
                    break;
                } else if (2 == iArr15[i29] && u1cVarArr2[i29].a > 0) {
                    i7 = 2;
                    z3 = true;
                    break;
                } else {
                    i29++;
                }
            }
            i = i28;
            gd3Var = gd3Var3;
            i2 = i7;
            context = context3;
            ag agVar = new ag(ld3Var, gd3Var, z3, iArr9, (byte) 3);
            z2 = true;
            iArr = iArr9;
            e = ld3.l(1, loVar, iArr8, agVar, new f03((byte) 7));
            if (e != null) {
                d74VarArr2[((Integer) e.second).intValue()] = (d74) e.first;
            }
        } else {
            i = i28;
            gd3Var = gd3Var3;
            i2 = 2;
            z2 = true;
            iArr = iArr9;
            context = context3;
        }
        if (e == null) {
            str = null;
        } else {
            d74 d74Var = (d74) e.first;
            str = d74Var.a.d[d74Var.b[0]].d;
        }
        Pair e2 = ld3.e(d74VarArr2, i2);
        Pair e3 = ld3.e(d74VarArr2, 4);
        if (e2 == null && e3 == null) {
            if (gd3Var.w.a == i2) {
                int i30 = i;
                gd3Var2 = gd3Var;
                i3 = i30;
                d74VarArr = d74VarArr2;
                str2 = str;
                l2 = null;
            } else {
                Point y = (!gd3Var.k || context == null) ? null : gcc.y(context);
                d74VarArr = d74VarArr2;
                int i31 = i;
                gd3Var2 = gd3Var;
                i3 = i31;
                str2 = str;
                l2 = ld3.l(i2, loVar, iArr8, new pt(gd3Var2, str, iArr, y, (byte) 11), new f03((byte) 6));
            }
            Pair l3 = ((gd3Var2.E || l2 == null) && gd3Var2.w.a != i2) ? ld3.l(4, loVar, iArr8, new ht2(gd3Var2, (byte) 20), new f03((byte) 5)) : null;
            if (l3 != null) {
                d74VarArr[((Integer) l3.second).intValue()] = (d74) l3.first;
            } else if (l2 != null) {
                d74VarArr[((Integer) l2.second).intValue()] = (d74) l2.first;
            }
        } else {
            int i32 = i;
            gd3Var2 = gd3Var;
            i3 = i32;
            d74VarArr = d74VarArr2;
            str2 = str;
        }
        if (ld3.e(d74VarArr, 3) == null) {
            if (gd3Var2.w.a == 2) {
                l = null;
            } else {
                if (!gd3Var2.B || context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = gcc.a;
                    str3 = locale.toLanguageTag();
                }
                l = ld3.l(3, loVar, iArr8, new fu2(gd3Var2, str2, str3, (byte) 5), new f03((byte) 8));
            }
            if (l != null) {
                d74VarArr[((Integer) l.second).intValue()] = (d74) l.first;
            }
        }
        int a2 = qu6.a(0, 0, 0, 0);
        if (gd3Var2.w.a == 2) {
            iArr2 = iArr15;
            u1cVarArr = u1cVarArr2;
            iArr3 = iArr8;
        } else {
            int i33 = bp5.c;
            ?? ho5Var = new ho5(4);
            int i34 = 0;
            while (i34 < i27) {
                d74 d74Var2 = d74VarArr[i34];
                if (d74Var2 != null) {
                    t1c t1cVar = d74Var2.a;
                    if (!gd3Var2.E0.get(i34)) {
                        i5 = i34;
                        if (!gd3Var2.I.contains(Integer.valueOf(t1cVar.c))) {
                            ho5Var.f(t1cVar.b);
                            int i35 = 0;
                            while (true) {
                                int[] iArr16 = d74Var2.b;
                                iArr4 = iArr15;
                                if (i35 < iArr16.length) {
                                    String str5 = t1cVar.d[iArr16[i35]].n;
                                    if (str5 != null) {
                                        ho5Var.c(str5);
                                    }
                                    i35++;
                                    iArr15 = iArr4;
                                }
                            }
                            i34 = i5 + 1;
                            iArr15 = iArr4;
                        }
                        iArr4 = iArr15;
                        i34 = i5 + 1;
                        iArr15 = iArr4;
                    }
                }
                i5 = i34;
                iArr4 = iArr15;
                i34 = i5 + 1;
                iArr15 = iArr4;
            }
            iArr2 = iArr15;
            bp5 g = ho5Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i36 = 0;
            while (i36 < i3) {
                if (iArr2[i36] != 5) {
                    i4 = i36;
                } else {
                    u1c u1cVar4 = u1cVarArr2[i36];
                    i4 = i36;
                    int i37 = 0;
                    while (i37 < u1cVar4.a) {
                        t1c a3 = u1cVar4.a(i37);
                        arrayList.add(a3);
                        u1c[] u1cVarArr3 = u1cVarArr2;
                        int[] iArr17 = (int[]) iArr8[i4][i37].clone();
                        u1c u1cVar5 = u1cVar4;
                        int[][][] iArr18 = iArr8;
                        for (int i38 = 0; i38 < iArr17.length; i38++) {
                            String str6 = a3.d[i38].n;
                            if (str6 != null && !g.contains(str6)) {
                                iArr17[i38] = a2;
                            }
                        }
                        arrayList2.add(iArr17);
                        i37++;
                        u1cVar4 = u1cVar5;
                        u1cVarArr2 = u1cVarArr3;
                        iArr8 = iArr18;
                    }
                }
                i36 = i4 + 1;
                u1cVarArr2 = u1cVarArr2;
                iArr8 = iArr8;
            }
            u1cVarArr = u1cVarArr2;
            iArr3 = iArr8;
            int size = arrayList.size();
            t1c[] t1cVarArr2 = new t1c[size];
            yve.p(arrayList.size() == size);
            arrayList.toArray(t1cVarArr2);
            u1c u1cVar6 = new u1c(t1cVarArr2);
            int size2 = arrayList2.size();
            int[][] iArr19 = new int[size2];
            yve.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr19);
            for (int i39 = 0; i39 < i3; i39++) {
                if (iArr2[i39] == 5) {
                    d74 k = ld3.k(u1cVar6, iArr19, gd3Var2);
                    d74VarArr[i39] = k;
                    if (k == null) {
                        break;
                    }
                    Arrays.fill(iArr19[u1cVar6.b(k.a)], a2);
                }
            }
        }
        for (int i40 = 0; i40 < i3; i40++) {
            int i41 = iArr2[i40];
            if (i41 != 2 && i41 != 1 && i41 != 3 && i41 != 4 && i41 != 5 && d74VarArr[i40] == null) {
                d74VarArr[i40] = ld3.k(u1cVarArr[i40], iArr3[i40], gd3Var2);
            }
        }
        ld3.c(loVar, ld3Var.g, d74VarArr);
        ld3.a(loVar, ld3Var.g, d74VarArr);
        ld3.b(loVar, ld3Var.g, d74VarArr);
        faf fafVar = ld3Var.e;
        la3 la3Var2 = ld3Var.b;
        la3Var2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (d74 d74Var3 : d74VarArr) {
            if (d74Var3 != null && d74Var3.b.length > 1) {
                mo5 p = po5.p();
                p.c(new ma(0L, 0L));
                arrayList3.add(p);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = d74VarArr.length;
        long[][] jArr2 = new long[length4];
        for (int i42 = 0; i42 < d74VarArr.length; i42++) {
            d74 d74Var4 = d74VarArr[i42];
            if (d74Var4 == null) {
                jArr2[i42] = new long[0];
            } else {
                int[] iArr20 = d74Var4.b;
                jArr2[i42] = new long[iArr20.length];
                for (int i43 = 0; i43 < iArr20.length; i43++) {
                    long j = d74Var4.a.d[iArr20[i43]].k;
                    long[] jArr3 = jArr2[i42];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i43] = j;
                }
                Arrays.sort(jArr2[i42]);
            }
        }
        int[] iArr21 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i44 = 0; i44 < length4; i44++) {
            long[] jArr5 = jArr2[i44];
            jArr4[i44] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        na.v(arrayList3, jArr4);
        awd.b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(pk7.b);
        ?? obj = new Object();
        awd.b(2, "expectedValuesPerKey");
        fj7 fj7Var = new fj7(treeMap);
        fj7Var.h = obj;
        int i45 = 0;
        loop13: while (true) {
            if (i45 < length4) {
                long[] jArr6 = jArr2[i45];
                if (jArr6.length <= 1) {
                    la3Var = la3Var2;
                    i6 = length4;
                    iArr5 = iArr21;
                    jArr = jArr2;
                } else {
                    int length5 = jArr6.length;
                    double[] dArr = new double[length5];
                    la3Var = la3Var2;
                    int i46 = 0;
                    while (true) {
                        long[] jArr7 = jArr2[i45];
                        i6 = length4;
                        double d = 0.0d;
                        iArr5 = iArr21;
                        if (i46 >= jArr7.length) {
                            break;
                        }
                        long[][] jArr8 = jArr2;
                        long j2 = jArr7[i46];
                        if (j2 != -1) {
                            d = Math.log(j2);
                        }
                        dArr[i46] = d;
                        i46++;
                        jArr2 = jArr8;
                        length4 = i6;
                        iArr21 = iArr5;
                    }
                    long[][] jArr9 = jArr2;
                    int i47 = length5 - 1;
                    double d2 = dArr[i47] - dArr[0];
                    int i48 = 0;
                    while (i48 < i47) {
                        double d3 = dArr[i48];
                        int i49 = i48 + 1;
                        Double valueOf = Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i49]) * 0.5d) - dArr[0]) / d2);
                        Integer valueOf2 = Integer.valueOf(i45);
                        long[][] jArr10 = jArr9;
                        Map map = fj7Var.e;
                        double d4 = d2;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            Collection m = fj7Var.m();
                            if (m.add(valueOf2)) {
                                fj7Var.f++;
                                map.put(valueOf, m);
                            } else {
                                hz6.e("New Collection violated the Collection spec");
                                f2 = null;
                                break loop13;
                            }
                        } else if (collection.add(valueOf2)) {
                            fj7Var.f++;
                        }
                        i48 = i49;
                        jArr9 = jArr10;
                        d2 = d4;
                    }
                    jArr = jArr9;
                }
                i45++;
                length4 = i6;
                iArr21 = iArr5;
                jArr2 = jArr;
                la3Var2 = la3Var;
            } else {
                la3Var = la3Var2;
                int[] iArr22 = iArr21;
                long[][] jArr11 = jArr2;
                Collection collection2 = fj7Var.c;
                if (collection2 == null) {
                    collection2 = new q3(fj7Var, (byte) 1);
                    fj7Var.c = collection2;
                }
                po5 q = po5.q(collection2);
                for (int i50 = 0; i50 < q.size(); i50++) {
                    int intValue = ((Integer) q.get(i50)).intValue();
                    int i51 = iArr22[intValue] + 1;
                    iArr22[intValue] = i51;
                    jArr4[intValue] = jArr11[intValue][i51];
                    na.v(arrayList3, jArr4);
                }
                for (int i52 = 0; i52 < d74VarArr.length; i52++) {
                    if (arrayList3.get(i52) != null) {
                        jArr4[i52] = jArr4[i52] << 1;
                    }
                }
                na.v(arrayList3, jArr4);
                mo5 p2 = po5.p();
                for (int i53 = 0; i53 < arrayList3.size(); i53++) {
                    mo5 mo5Var = (mo5) arrayList3.get(i53);
                    if (mo5Var == null) {
                        f3 = j99.e;
                    } else {
                        f3 = mo5Var.f();
                    }
                    p2.c(f3);
                }
                f2 = p2.f();
            }
        }
        e74[] e74VarArr2 = new e74[d74VarArr.length];
        for (int i54 = 0; i54 < d74VarArr.length; i54++) {
            d74 d74Var5 = d74VarArr[i54];
            if (d74Var5 != null) {
                int[] iArr23 = d74Var5.b;
                if (iArr23.length != 0) {
                    int length6 = iArr23.length;
                    t1c t1cVar2 = d74Var5.a;
                    if (length6 == 1) {
                        naVar = new wg0(0, t1cVar2, new int[]{iArr23[0]});
                    } else {
                        naVar = new na(t1cVar2, iArr23, la3Var, 10000L, 25000L, 25000L, (po5) f2.get(i54));
                    }
                    e74VarArr2[i54] = naVar;
                }
            }
        }
        qa9[] qa9VarArr = new qa9[i27];
        for (int i55 = 0; i55 < i27; i55++) {
            qa9VarArr[i55] = (ld3Var.g.E0.get(i55) || ld3Var.g.I.contains(Integer.valueOf(((int[]) loVar.b)[i55])) || (((int[]) loVar.b)[i55] != -2 && e74VarArr2[i55] == null)) ? null : qa9.c;
        }
        ld3Var.g.getClass();
        gd3 gd3Var4 = ld3Var.g;
        if (gd3Var4.w.a != 0) {
            int i56 = 0;
            int i57 = 0;
            int i58 = -1;
            while (true) {
                if (i56 < loVar.a) {
                    int i59 = ((int[]) loVar.b)[i56];
                    e74 e74Var = e74VarArr2[i56];
                    if (i59 != 1) {
                        if (e74Var != null) {
                            break;
                        }
                    } else if (e74Var != null && e74Var.length() == 1) {
                        if (ld3.j(gd3Var4, iArr3[i56][((u1c[]) loVar.c)[i56].b(e74Var.c())][e74Var.j(0)], e74Var.n())) {
                            i57++;
                            i58 = i56;
                        }
                    }
                    i56++;
                } else if (i57 == 1) {
                    int i60 = gd3Var4.w.b ? 1 : 2;
                    qa9 qa9Var = qa9VarArr[i58];
                    qa9VarArr[i58] = new qa9(i60, qa9Var != null && qa9Var.b);
                }
            }
        }
        Pair create = Pair.create(qa9VarArr, e74VarArr2);
        e74[] e74VarArr3 = (e74[]) create.second;
        int length7 = e74VarArr3.length;
        List[] listArr = new List[length7];
        for (int i61 = 0; i61 < e74VarArr3.length; i61++) {
            e74 e74Var2 = e74VarArr3[i61];
            if (e74Var2 != null) {
                j99Var = po5.u(e74Var2);
            } else {
                no5 no5Var = po5.b;
                j99Var = j99.e;
            }
            listArr[i61] = j99Var;
        }
        ?? ho5Var2 = new ho5(4);
        int i62 = 0;
        while (true) {
            int i63 = loVar.a;
            u1c[] u1cVarArr4 = (u1c[]) loVar.c;
            if (i62 >= i63) {
                break;
            }
            u1c u1cVar7 = u1cVarArr4[i62];
            int i64 = 0;
            while (i64 < u1cVar7.a) {
                t1c a4 = u1cVar7.a(i64);
                int i65 = u1cVarArr4[i62].a(i64).a;
                int[] iArr24 = new int[i65];
                int i66 = 0;
                int i67 = 0;
                while (i67 < i65) {
                    List[] listArr2 = listArr;
                    if ((((int[][][]) loVar.e)[i62][i64][i67] & 7) == 4) {
                        iArr24[i66] = i67;
                        i66++;
                    }
                    i67++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr24, i66);
                int i68 = 16;
                int i69 = i62;
                String str7 = null;
                int i70 = 0;
                boolean z4 = false;
                int i71 = 0;
                while (i70 < copyOf.length) {
                    int[] iArr25 = copyOf;
                    String str8 = u1cVarArr4[i69].a(i64).d[copyOf[i70]].t;
                    int i72 = i71 + 1;
                    if (i71 == 0) {
                        str7 = str8;
                    } else {
                        z4 |= !Objects.equals(str7, str8);
                    }
                    i68 = Math.min(i68, ((int[][][]) loVar.e)[i69][i64][i70] & 24);
                    i70++;
                    i71 = i72;
                    copyOf = iArr25;
                }
                if (z4) {
                    i68 = Math.min(i68, ((int[]) loVar.d)[i69]);
                }
                boolean z5 = i68 != 0;
                int i73 = a4.a;
                int[] iArr26 = new int[i73];
                boolean[] zArr = new boolean[i73];
                int i74 = 0;
                while (i74 < a4.a) {
                    iArr26[i74] = ((int[][][]) loVar.e)[i69][i64][i74] & 7;
                    int i75 = 0;
                    boolean z6 = false;
                    while (i75 < length7) {
                        List list = listArr3[i75];
                        int i76 = length7;
                        u1c u1cVar8 = u1cVar7;
                        int i77 = 0;
                        while (true) {
                            if (i77 < list.size()) {
                                e74 e74Var3 = (e74) list.get(i77);
                                int i78 = i77;
                                if (e74Var3.c().equals(a4) && e74Var3.u(i74) != -1) {
                                    z6 = true;
                                    break;
                                }
                                i77 = i78 + 1;
                            }
                        }
                        i75++;
                        length7 = i76;
                        u1cVar7 = u1cVar8;
                    }
                    zArr[i74] = z6;
                    i74++;
                    u1cVar7 = u1cVar7;
                }
                ho5Var2.c(new e2c(a4, z5, iArr26, zArr));
                i64++;
                listArr = listArr3;
                i62 = i69;
                length7 = length7;
                u1cVar7 = u1cVar7;
            }
            i62++;
        }
        u1c u1cVar9 = (u1c) loVar.f;
        for (int i79 = 0; i79 < u1cVar9.a; i79++) {
            t1c a5 = u1cVar9.a(i79);
            int[] iArr27 = new int[a5.a];
            Arrays.fill(iArr27, 0);
            ho5Var2.c(new e2c(a5, false, iArr27, new boolean[a5.a]));
        }
        d2c d2cVar = new d2c((qa9[]) create.first, (e74[]) create.second, new f2c(ho5Var2.f()), loVar);
        for (int i80 = 0; i80 < d2cVar.b; i80++) {
            boolean q2 = d2cVar.q(i80);
            e74[] e74VarArr4 = (e74[]) d2cVar.d;
            if (q2) {
                yve.p(e74VarArr4[i80] != null || this.j[i80].b == -2);
            } else {
                yve.p(e74VarArr4[i80] == null);
            }
        }
        for (e74 e74Var4 : (e74[]) d2cVar.d) {
            if (e74Var4 != null) {
                e74Var4.q(f);
                e74Var4.h(z);
            }
        }
        return d2cVar;
    }
}
