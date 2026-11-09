package l2;

import a8.ia;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
public final class x0 {
    public final Object f18072a;
    public final Object f18073b;
    public final x2.c1[] f18074c;
    public boolean d;
    public boolean f18075e;
    public boolean f18076f;
    public y0 f18077g;
    public boolean h;
    public final boolean[] f18078i;
    public final b[] f18079j;
    public final a3.x f18080k;
    public final j1 f18081l;
    public x0 f18082m;
    public x2.q1 f18083n;
    public a3.y f18084o;
    public long f18085p;

    public x0(b[] bVarArr, long j3, a3.x xVar, h6.m mVar, j1 j1Var, y0 y0Var, a3.y yVar) {
        this.f18079j = bVarArr;
        this.f18085p = j3;
        this.f18080k = xVar;
        this.f18081l = j1Var;
        x2.g0 g0Var = y0Var.f18088a;
        this.f18073b = g0Var.f58339a;
        this.f18077g = y0Var;
        this.f18083n = x2.q1.d;
        this.f18084o = yVar;
        this.f18074c = new x2.c1[bVarArr.length];
        this.f18078i = new boolean[bVarArr.length];
        long j10 = y0Var.f18089b;
        long j11 = y0Var.f18091e;
        boolean z9 = y0Var.f18093g;
        j1Var.getClass();
        Object obj = g0Var.f58339a;
        int i7 = a.f17737g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        x2.g0 a10 = g0Var.a(pair.second);
        i1 i1Var = (i1) j1Var.d.get(obj2);
        i1Var.getClass();
        j1Var.f17905g.add(i1Var);
        h1 h1Var = (h1) j1Var.f17904f.get(i1Var);
        if (h1Var != null) {
            h1Var.f17842a.f(h1Var.f17843b);
        }
        i1Var.f17893c.add(a10);
        x2.y c10 = i1Var.f17891a.c(a10, mVar, j10);
        j1Var.f17902c.put(c10, i1Var);
        j1Var.c();
        if (j11 != -9223372036854775807L) {
            c10 = new x2.d(c10, !z9, 0L, j11, 0);
        }
        this.f18072a = c10;
    }

    public final long a(a3.y yVar, long j3, boolean z9, boolean[] zArr) {
        b[] bVarArr;
        Object[] objArr;
        boolean z10;
        int i7 = 0;
        while (true) {
            boolean z11 = true;
            if (i7 >= yVar.f143a) {
                break;
            }
            if (z9 || !yVar.a(this.f18084o, i7)) {
                z11 = false;
            }
            this.f18078i[i7] = z11;
            i7++;
        }
        int i10 = 0;
        while (true) {
            bVarArr = this.f18079j;
            int length = bVarArr.length;
            objArr = this.f18074c;
            if (i10 >= length) {
                break;
            }
            if (bVarArr[i10].f17758b == -2) {
                objArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f18084o = yVar;
        c();
        long b10 = this.f18072a.b(yVar.f145c, this.f18078i, this.f18074c, zArr, j3);
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].f17758b == -2 && this.f18084o.b(i11)) {
                objArr[i11] = new Object();
            }
        }
        this.f18076f = false;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] != null) {
                ia.p(yVar.b(i12));
                if (bVarArr[i12].f17758b != -2) {
                    this.f18076f = true;
                }
            } else {
                if (yVar.f145c[i12] == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ia.p(z10);
            }
        }
        return b10;
    }

    public final void b() {
        if (this.f18082m == null) {
            int i7 = 0;
            while (true) {
                a3.y yVar = this.f18084o;
                if (i7 < yVar.f143a) {
                    boolean b10 = yVar.b(i7);
                    a3.u uVar = this.f18084o.f145c[i7];
                    if (b10 && uVar != null) {
                        uVar.l();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f18082m == null) {
            int i7 = 0;
            while (true) {
                a3.y yVar = this.f18084o;
                if (i7 < yVar.f143a) {
                    boolean b10 = yVar.b(i7);
                    a3.u uVar = this.f18084o.f145c[i7];
                    if (b10 && uVar != null) {
                        uVar.h();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j3;
        if (!this.f18075e) {
            return this.f18077g.f18089b;
        }
        if (this.f18076f) {
            j3 = this.f18072a.p();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f18077g.f18092f;
        }
        return j3;
    }

    public final long e() {
        return this.f18077g.f18089b + this.f18085p;
    }

    public final void f(float f10, e2.l1 l1Var, boolean z9) {
        this.f18075e = true;
        this.f18083n = this.f18072a.o();
        a3.y j3 = j(f10, l1Var, z9);
        y0 y0Var = this.f18077g;
        long j10 = y0Var.f18089b;
        long j11 = y0Var.f18092f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(j3, j10, false, new boolean[this.f18079j.length]);
        long j12 = this.f18085p;
        y0 y0Var2 = this.f18077g;
        this.f18085p = (y0Var2.f18089b - a10) + j12;
        this.f18077g = y0Var2.b(a10, y0Var2.f18090c);
    }

    public final boolean g() {
        if (this.f18075e) {
            if (!this.f18076f || this.f18072a.p() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.f18075e) {
            if (g() || d() - this.f18077g.f18089b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f18072a;
        try {
            boolean z9 = r02 instanceof x2.d;
            j1 j1Var = this.f18081l;
            if (z9) {
                j1Var.f(((x2.d) r02).f58321a);
            } else {
                j1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            h2.a.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final a3.y j(float f10, e2.l1 l1Var, boolean z9) {
        a3.n nVar;
        a3.s sVar;
        a3.n nVar2;
        String str;
        a3.s sVar2;
        String str2;
        a3.n nVar3;
        int i7;
        int[] iArr;
        x2.q1[] q1VarArr;
        int[][][] iArr2;
        boolean z10;
        boolean z11;
        x2.q1[] q1VarArr2;
        int i10;
        a3.u[] uVarArr;
        boolean z12;
        boolean z13;
        boolean z14;
        h9.t1 t1Var;
        int i11;
        boolean z15;
        q1 q1Var;
        a3.d bVar;
        h9.t1 f11;
        b3.d dVar;
        int i12;
        int[] iArr3;
        double d;
        long j3;
        String str3;
        Pair p10;
        CaptioningManager captioningManager;
        Locale locale;
        Point point;
        Pair p11;
        Pair p12;
        boolean z16;
        Context context;
        int i13;
        int[] iArr4;
        int i14;
        a3.x xVar = this.f18080k;
        b[] bVarArr = this.f18079j;
        x2.q1 q1Var2 = this.f18083n;
        xVar.getClass();
        int i15 = 1;
        int[] iArr5 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        e2.m1[][] m1VarArr = new e2.m1[length];
        int[][][] iArr6 = new int[bVarArr.length + 1][];
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = q1Var2.f58458a;
            m1VarArr[i16] = new e2.m1[i17];
            iArr6[i16] = new int[i17];
        }
        int length2 = bVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i18 = 0; i18 < length2; i18++) {
            iArr7[i18] = bVarArr[i18].D();
        }
        int i19 = 0;
        while (i19 < q1Var2.f58458a) {
            e2.m1 a10 = q1Var2.a(i19);
            if (a10.f10375c == 5) {
                i13 = i15;
            } else {
                i13 = 0;
            }
            int length3 = bVarArr.length;
            int i20 = i15;
            int i21 = i20;
            int i22 = 0;
            int i23 = 0;
            while (i22 < bVarArr.length) {
                b bVar2 = bVarArr[i22];
                a3.x xVar2 = xVar;
                x2.q1 q1Var3 = q1Var2;
                int i24 = 0;
                for (int i25 = 0; i25 < a10.f10373a; i25++) {
                    i24 = Math.max(i24, bVar2.C(a10.d[i25]) & 7);
                }
                if (iArr5[i22] == 0) {
                    i14 = i20;
                } else {
                    i14 = 0;
                }
                if (i24 > i23 || (i24 == i23 && i13 != 0 && i21 == 0 && i14 != 0)) {
                    i23 = i24;
                    i21 = i14;
                    length3 = i22;
                }
                i22++;
                xVar = xVar2;
                q1Var2 = q1Var3;
            }
            a3.x xVar3 = xVar;
            x2.q1 q1Var4 = q1Var2;
            if (length3 == bVarArr.length) {
                iArr4 = new int[a10.f10373a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr8 = new int[a10.f10373a];
                for (int i26 = 0; i26 < a10.f10373a; i26++) {
                    iArr8[i26] = bVar3.C(a10.d[i26]);
                }
                iArr4 = iArr8;
            }
            int i27 = iArr5[length3];
            m1VarArr[length3][i27] = a10;
            iArr6[length3][i27] = iArr4;
            iArr5[length3] = i27 + 1;
            i19++;
            i15 = i20;
            xVar = xVar3;
            q1Var2 = q1Var4;
        }
        a3.x xVar4 = xVar;
        int i28 = i15;
        x2.q1[] q1VarArr3 = new x2.q1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr9 = new int[bVarArr.length];
        for (int i29 = 0; i29 < bVarArr.length; i29++) {
            int i30 = iArr5[i29];
            q1VarArr3[i29] = new x2.q1((e2.m1[]) h2.m0.U(i30, m1VarArr[i29]));
            iArr6[i29] = (int[][]) h2.m0.U(i30, iArr6[i29]);
            strArr[i29] = bVarArr[i29].i();
            iArr9[i29] = bVarArr[i29].f17758b;
        }
        a3.w wVar = new a3.w(iArr9, q1VarArr3, iArr7, iArr6, new x2.q1((e2.m1[]) h2.m0.U(iArr5[bVarArr.length], m1VarArr[bVarArr.length])));
        a3.s sVar3 = (a3.s) xVar4;
        synchronized (sVar3.d) {
            sVar3.h = Thread.currentThread();
            nVar = sVar3.f129g;
        }
        if (sVar3.f132k == null && (context = sVar3.f127e) != null) {
            sVar3.f132k = Boolean.valueOf(h2.m0.P(context));
        }
        if (nVar.A0 && Build.VERSION.SDK_INT >= 32 && sVar3.f130i == null) {
            sVar3.f130i = new c3.d(sVar3.f127e, new a3.f(sVar3, 0), sVar3.f132k);
        }
        int i31 = wVar.f135a;
        a3.t[] tVarArr = new a3.t[i31];
        a3.s.f(wVar, nVar, tVarArr);
        a3.s.d(wVar, nVar, tVarArr);
        a3.s.e(wVar, nVar, tVarArr);
        Context context2 = sVar3.f127e;
        int i32 = wVar.f135a;
        Pair h = a3.s.h(tVarArr, i28);
        if (h == null) {
            int i33 = 0;
            while (true) {
                if (i33 < i32) {
                    if (2 == iArr9[i33] && q1VarArr3[i33].f58458a > 0) {
                        z16 = true;
                        break;
                    }
                    i33++;
                } else {
                    z16 = false;
                    break;
                }
            }
            sVar = sVar3;
            nVar2 = nVar;
            h = a3.s.p(1, wVar, iArr6, new a3.g(sVar, nVar, z16, iArr7, 0), new a3.c(4));
            if (h != null) {
                tVarArr[((Integer) h.second).intValue()] = (a3.t) h.first;
            }
        } else {
            sVar = sVar3;
            nVar2 = nVar;
        }
        if (h == null) {
            str = null;
        } else {
            a3.t tVar = (a3.t) h.first;
            str = tVar.f133a.d[tVar.f134b[0]].d;
        }
        Pair h7 = a3.s.h(tVarArr, 2);
        Pair h10 = a3.s.h(tVarArr, 4);
        if (h7 == null && h10 == null) {
            if (nVar2.f10526w.f10453a == 2) {
                sVar2 = sVar;
                str2 = str;
                p11 = null;
                nVar3 = nVar2;
            } else {
                if (nVar2.f10515k && context2 != null) {
                    point = h2.m0.y(context2);
                } else {
                    point = null;
                }
                sVar2 = sVar;
                nVar3 = nVar2;
                a1.d dVar2 = new a1.d(nVar3, str, iArr7, point, 1);
                str2 = str;
                p11 = a3.s.p(2, wVar, iArr6, dVar2, new a3.c(3));
            }
            if ((!nVar3.E && p11 != null) || nVar3.f10526w.f10453a == 2) {
                p12 = null;
            } else {
                p12 = a3.s.p(4, wVar, iArr6, new a1.c(nVar3, 1), new a3.c(2));
            }
            if (p12 != null) {
                tVarArr[((Integer) p12.second).intValue()] = (a3.t) p12.first;
            } else if (p11 != null) {
                tVarArr[((Integer) p11.second).intValue()] = (a3.t) p11.first;
            }
            i7 = 3;
        } else {
            sVar2 = sVar;
            str2 = str;
            nVar3 = nVar2;
            i7 = 3;
        }
        if (a3.s.h(tVarArr, i7) == null) {
            if (nVar3.f10526w.f10453a == 2) {
                p10 = null;
            } else {
                if (nVar3.B && context2 != null && (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
                    String str4 = h2.m0.f14112a;
                    str3 = locale.toLanguageTag();
                } else {
                    str3 = null;
                }
                p10 = a3.s.p(3, wVar, iArr6, new a3.h((Object) nVar3, (Object) str2, (Object) str3, 0), new a3.c(5));
            }
            if (p10 != null) {
                tVarArr[((Integer) p10.second).intValue()] = (a3.t) p10.first;
            }
        }
        int b10 = jg.g.b(0, 0, 0, 0);
        if (nVar3.f10526w.f10453a == 2) {
            iArr = iArr9;
            q1VarArr = q1VarArr3;
            iArr2 = iArr6;
        } else {
            int i34 = h9.t0.f14395c;
            ?? b0Var = new h9.b0(4);
            int i35 = 0;
            while (i35 < i31) {
                a3.t tVar2 = tVarArr[i35];
                if (tVar2 != null) {
                    e2.m1 m1Var = tVar2.f133a;
                    if (!nVar3.E0.get(i35)) {
                        i10 = i35;
                        if (!nVar3.I.contains(Integer.valueOf(m1Var.f10375c))) {
                            b0Var.f(m1Var.f10374b);
                            int i36 = 0;
                            while (true) {
                                int[] iArr10 = tVar2.f134b;
                                a3.t tVar3 = tVar2;
                                if (i36 < iArr10.length) {
                                    String str5 = m1Var.d[iArr10[i36]].f10609m;
                                    if (str5 != null) {
                                        b0Var.c(str5);
                                    }
                                    i36++;
                                    tVar2 = tVar3;
                                }
                            }
                        }
                        i35 = i10 + 1;
                    }
                }
                i10 = i35;
                i35 = i10 + 1;
            }
            h9.t0 g10 = b0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i37 = 0;
            while (i37 < i32) {
                int[] iArr11 = iArr9;
                if (iArr9[i37] != 5) {
                    q1VarArr2 = q1VarArr3;
                } else {
                    x2.q1 q1Var5 = q1VarArr3[i37];
                    q1VarArr2 = q1VarArr3;
                    int i38 = 0;
                    while (i38 < q1Var5.f58458a) {
                        e2.m1 a11 = q1Var5.a(i38);
                        arrayList.add(a11);
                        x2.q1 q1Var6 = q1Var5;
                        int[] iArr12 = (int[]) iArr6[i37][i38].clone();
                        int i39 = i37;
                        int[][][] iArr13 = iArr6;
                        for (int i40 = 0; i40 < iArr12.length; i40++) {
                            String str6 = a11.d[i40].f10609m;
                            if (str6 != null && !g10.contains(str6)) {
                                iArr12[i40] = b10;
                            }
                        }
                        arrayList2.add(iArr12);
                        i38++;
                        i37 = i39;
                        q1Var5 = q1Var6;
                        iArr6 = iArr13;
                    }
                }
                i37++;
                iArr9 = iArr11;
                q1VarArr3 = q1VarArr2;
                iArr6 = iArr6;
            }
            iArr = iArr9;
            q1VarArr = q1VarArr3;
            iArr2 = iArr6;
            int size = arrayList.size();
            e2.m1[] m1VarArr2 = new e2.m1[size];
            if (arrayList.size() == size) {
                z10 = true;
            } else {
                z10 = false;
            }
            ia.p(z10);
            arrayList.toArray(m1VarArr2);
            x2.q1 q1Var7 = new x2.q1(m1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2];
            if (arrayList2.size() == size2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ia.p(z11);
            arrayList2.toArray(iArr14);
            for (int i41 = 0; i41 < i32; i41++) {
                if (iArr[i41] == 5) {
                    a3.t o4 = a3.s.o(q1Var7, iArr14, nVar3);
                    tVarArr[i41] = o4;
                    if (o4 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[q1Var7.b(o4.f133a)], b10);
                }
            }
        }
        for (int i42 = 0; i42 < i32; i42++) {
            int i43 = iArr[i42];
            if (i43 != 2 && i43 != 1) {
                if (i43 != 3 && i43 != 4 && i43 != 5 && tVarArr[i42] == null) {
                    tVarArr[i42] = a3.s.o(q1VarArr[i42], iArr2[i42], nVar3);
                }
            }
        }
        a3.s.f(wVar, nVar3, tVarArr);
        a3.s.d(wVar, nVar3, tVarArr);
        a3.s.e(wVar, nVar3, tVarArr);
        nb.a aVar = sVar2.f128f;
        b3.d dVar3 = sVar2.f141b;
        dVar3.getClass();
        aVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (a3.t tVar4 : tVarArr) {
            if (tVar4 != null && tVar4.f134b.length > 1) {
                h9.f0 p13 = h9.i0.p();
                p13.c(new a3.a(0L, 0L));
                arrayList3.add(p13);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = tVarArr.length;
        long[][] jArr = new long[length4];
        for (int i44 = 0; i44 < tVarArr.length; i44++) {
            a3.t tVar5 = tVarArr[i44];
            if (tVar5 == null) {
                jArr[i44] = new long[0];
            } else {
                int[] iArr15 = tVar5.f134b;
                jArr[i44] = new long[iArr15.length];
                for (int i45 = 0; i45 < iArr15.length; i45++) {
                    long j10 = tVar5.f133a.d[iArr15[i45]].f10606j;
                    long[] jArr2 = jArr[i44];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i45] = j10;
                }
                Arrays.sort(jArr[i44]);
            }
        }
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i46 = 0; i46 < length4; i46++) {
            long[] jArr4 = jArr[i46];
            if (jArr4.length == 0) {
                j3 = 0;
            } else {
                j3 = jArr4[0];
            }
            jArr3[i46] = j3;
        }
        a3.b.v(arrayList3, jArr3);
        h9.o.g(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(h9.o1.f14359b);
        h9.k1 k1Var = new h9.k1();
        h9.l1 l1Var2 = new h9.l1(treeMap);
        l1Var2.h = k1Var;
        int i47 = 0;
        while (i47 < length4) {
            long[] jArr5 = jArr[i47];
            if (jArr5.length <= 1) {
                dVar = dVar3;
                i12 = length4;
                iArr3 = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                dVar = dVar3;
                int i48 = 0;
                while (true) {
                    long[] jArr6 = jArr[i47];
                    i12 = length4;
                    double d2 = 0.0d;
                    if (i48 >= jArr6.length) {
                        break;
                    }
                    int[] iArr17 = iArr16;
                    long j11 = jArr6[i48];
                    if (j11 != -1) {
                        d2 = Math.log(j11);
                    }
                    dArr[i48] = d2;
                    i48++;
                    length4 = i12;
                    iArr16 = iArr17;
                }
                iArr3 = iArr16;
                int i49 = length5 - 1;
                double d10 = dArr[i49] - dArr[0];
                int i50 = 0;
                while (i50 < i49) {
                    double d11 = dArr[i50];
                    int i51 = i50 + 1;
                    double d12 = (d11 + dArr[i51]) * 0.5d;
                    if (d10 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d12 - dArr[0]) / d10;
                    }
                    Double valueOf = Double.valueOf(d);
                    Integer valueOf2 = Integer.valueOf(i47);
                    double d13 = d10;
                    Map map = l1Var2.f14345e;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h11 = l1Var2.h();
                        if (h11.add(valueOf2)) {
                            l1Var2.f14346f++;
                            map.put(valueOf, h11);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        l1Var2.f14346f++;
                    }
                    i50 = i51;
                    d10 = d13;
                }
                continue;
            }
            i47++;
            length4 = i12;
            iArr16 = iArr3;
            dVar3 = dVar;
        }
        b3.d dVar4 = dVar3;
        int[] iArr18 = iArr16;
        Collection collection2 = l1Var2.f14341c;
        if (collection2 == null) {
            collection2 = new a8.n(l1Var2, 5);
            l1Var2.f14341c = collection2;
        }
        h9.i0 q10 = h9.i0.q(collection2);
        for (int i52 = 0; i52 < q10.size(); i52++) {
            int intValue = ((Integer) q10.get(i52)).intValue();
            int i53 = iArr18[intValue] + 1;
            iArr18[intValue] = i53;
            jArr3[intValue] = jArr[intValue][i53];
            a3.b.v(arrayList3, jArr3);
        }
        for (int i54 = 0; i54 < tVarArr.length; i54++) {
            if (arrayList3.get(i54) != null) {
                jArr3[i54] = jArr3[i54] * 2;
            }
        }
        a3.b.v(arrayList3, jArr3);
        h9.f0 p14 = h9.i0.p();
        for (int i55 = 0; i55 < arrayList3.size(); i55++) {
            h9.f0 f0Var = (h9.f0) arrayList3.get(i55);
            if (f0Var == null) {
                f11 = h9.t1.f14397e;
            } else {
                f11 = f0Var.f();
            }
            p14.c(f11);
        }
        h9.t1 f12 = p14.f();
        a3.u[] uVarArr2 = new a3.u[tVarArr.length];
        for (int i56 = 0; i56 < tVarArr.length; i56++) {
            a3.t tVar6 = tVarArr[i56];
            if (tVar6 != null) {
                int[] iArr19 = tVar6.f134b;
                if (iArr19.length != 0) {
                    if (iArr19.length == 1) {
                        bVar = new a3.d(tVar6.f133a, new int[]{iArr19[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new a3.b(tVar6.f133a, iArr19, dVar4, 10000, j12, j12, (h9.i0) f12.get(i56));
                    }
                    uVarArr2[i56] = bVar;
                }
            }
        }
        q1[] q1VarArr4 = new q1[i31];
        for (int i57 = 0; i57 < i31; i57++) {
            int i58 = wVar.f136b[i57];
            if (!nVar3.E0.get(i57) && !nVar3.I.contains(Integer.valueOf(i58)) && (wVar.f136b[i57] == -2 || uVarArr2[i57] != null)) {
                q1Var = q1.f17997c;
            } else {
                q1Var = null;
            }
            q1VarArr4[i57] = q1Var;
        }
        if (nVar3.f10526w.f10453a != 0) {
            int i59 = 0;
            int i60 = 0;
            int i61 = -1;
            while (true) {
                if (i60 < wVar.f135a) {
                    int i62 = wVar.f136b[i60];
                    a3.u uVar = uVarArr2[i60];
                    if (i62 != 1 && uVar != null) {
                        break;
                    }
                    if (i62 == 1 && uVar != null && uVar.length() == 1) {
                        if (a3.s.n(nVar3, iArr2[i60][wVar.f137c[i60].b(uVar.c())][uVar.i(0)], uVar.n())) {
                            i59++;
                            i61 = i60;
                        }
                    }
                    i60++;
                } else if (i59 == 1) {
                    if (nVar3.f10526w.f10454b) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                    q1 q1Var8 = q1VarArr4[i61];
                    if (q1Var8 != null && q1Var8.f17999b) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    q1VarArr4[i61] = new q1(i11, z15);
                }
            }
        }
        Pair create = Pair.create(q1VarArr4, uVarArr2);
        a3.u[] uVarArr3 = (a3.u[]) create.second;
        int length6 = uVarArr3.length;
        List[] listArr = new List[length6];
        for (int i63 = 0; i63 < uVarArr3.length; i63++) {
            a3.u uVar2 = uVarArr3[i63];
            if (uVar2 != null) {
                t1Var = h9.i0.u(uVar2);
            } else {
                h9.g0 g0Var = h9.i0.f14329b;
                t1Var = h9.t1.f14397e;
            }
            listArr[i63] = t1Var;
        }
        ?? b0Var2 = new h9.b0(4);
        int i64 = 0;
        while (true) {
            int i65 = wVar.f135a;
            x2.q1[] q1VarArr5 = wVar.f137c;
            if (i64 >= i65) {
                break;
            }
            x2.q1 q1Var9 = q1VarArr5[i64];
            int i66 = 0;
            while (i66 < q1Var9.f58458a) {
                e2.m1 a12 = q1Var9.a(i66);
                int i67 = q1VarArr5[i64].a(i66).f10373a;
                int[] iArr20 = new int[i67];
                int i68 = 0;
                int i69 = 0;
                while (i69 < i67) {
                    List[] listArr2 = listArr;
                    if ((wVar.f138e[i64][i66][i69] & 7) == 4) {
                        iArr20[i68] = i69;
                        i68++;
                    }
                    i69++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr20, i68);
                int i70 = 16;
                int i71 = i64;
                String str7 = null;
                int i72 = 0;
                boolean z17 = false;
                int i73 = 0;
                while (i72 < copyOf.length) {
                    int[] iArr21 = copyOf;
                    String str8 = q1VarArr5[i71].a(i66).d[copyOf[i72]].f10615s;
                    int i74 = i73 + 1;
                    if (i73 == 0) {
                        str7 = str8;
                    } else {
                        z17 = (!Objects.equals(str7, str8)) | z17;
                    }
                    i70 = Math.min(i70, wVar.f138e[i71][i66][i72] & 24);
                    i72++;
                    i73 = i74;
                    copyOf = iArr21;
                }
                if (z17) {
                    i70 = Math.min(i70, wVar.d[i71]);
                }
                if (i70 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i75 = a12.f10373a;
                int[] iArr22 = new int[i75];
                boolean[] zArr = new boolean[i75];
                int i76 = 0;
                while (i76 < a12.f10373a) {
                    iArr22[i76] = wVar.f138e[i71][i66][i76] & 7;
                    int i77 = 0;
                    boolean z18 = false;
                    while (i77 < length6) {
                        List list = listArr3[i77];
                        int i78 = length6;
                        x2.q1 q1Var10 = q1Var9;
                        int i79 = 0;
                        while (true) {
                            if (i79 < list.size()) {
                                a3.u uVar3 = (a3.u) list.get(i79);
                                int i80 = i79;
                                if (uVar3.c().equals(a12) && uVar3.u(i76) != -1) {
                                    z18 = true;
                                    break;
                                }
                                i79 = i80 + 1;
                            }
                        }
                        i77++;
                        q1Var9 = q1Var10;
                        length6 = i78;
                    }
                    zArr[i76] = z18;
                    i76++;
                    q1Var9 = q1Var9;
                }
                b0Var2.c(new e2.r1(a12, z14, iArr22, zArr));
                i66++;
                q1Var9 = q1Var9;
                listArr = listArr3;
                i64 = i71;
                length6 = length6;
            }
            i64++;
        }
        x2.q1 q1Var11 = wVar.f139f;
        for (int i81 = 0; i81 < q1Var11.f58458a; i81++) {
            e2.m1 a13 = q1Var11.a(i81);
            int[] iArr23 = new int[a13.f10373a];
            Arrays.fill(iArr23, 0);
            b0Var2.c(new e2.r1(a13, false, iArr23, new boolean[a13.f10373a]));
        }
        a3.y yVar = new a3.y((q1[]) create.first, (a3.u[]) create.second, new e2.s1(b0Var2.f()), wVar);
        for (int i82 = 0; i82 < yVar.f143a; i82++) {
            if (yVar.b(i82)) {
                if (yVar.f145c[i82] == null && this.f18079j[i82].f17758b != -2) {
                    z13 = false;
                    ia.p(z13);
                }
                z13 = true;
                ia.p(z13);
            } else {
                if (yVar.f145c[i82] == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ia.p(z12);
            }
        }
        for (a3.u uVar4 : yVar.f145c) {
            if (uVar4 != null) {
                uVar4.q(f10);
                uVar4.f(z9);
            }
        }
        return yVar;
    }

    public final void k() {
        Object obj = this.f18072a;
        if (obj instanceof x2.d) {
            long j3 = this.f18077g.f18091e;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            x2.d dVar = (x2.d) obj;
            dVar.f58325f = 0L;
            dVar.h = j3;
        }
    }
}
