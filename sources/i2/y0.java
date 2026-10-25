package i2;

import a8.yb;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.v1;
import b2.w1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.qy;
import org.telegram.ui.bv;
public final class y0 {
    public final Object f13790a;
    public final Object f13791b;
    public final u2.d1[] f13792c;
    public boolean d;
    public boolean e;
    public boolean f13793f;
    public z0 f13794g;
    public boolean h;
    public final boolean[] f13795i;
    public final b[] f13796j;
    public final x2.t f13797k;
    public final j1 f13798l;
    public y0 f13799m;
    public u2.r1 f13800n;
    public x2.u f13801o;
    public long f13802p;

    public y0(b[] bVarArr, long j10, x2.t tVar, a8.h0 h0Var, j1 j1Var, z0 z0Var, x2.u uVar) {
        this.f13796j = bVarArr;
        this.f13802p = j10;
        this.f13797k = tVar;
        this.f13798l = j1Var;
        u2.g0 g0Var = z0Var.f13806a;
        this.f13791b = g0Var.f49294a;
        this.f13794g = z0Var;
        this.f13800n = u2.r1.d;
        this.f13801o = uVar;
        this.f13792c = new u2.d1[bVarArr.length];
        this.f13795i = new boolean[bVarArr.length];
        long j11 = z0Var.f13807b;
        long j12 = z0Var.e;
        boolean z10 = z0Var.f13810g;
        j1Var.getClass();
        Object obj = g0Var.f49294a;
        int i10 = a.f13472g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.g0 a2 = g0Var.a(pair.second);
        i1 i1Var = (i1) j1Var.d.get(obj2);
        i1Var.getClass();
        j1Var.f13627g.add(i1Var);
        h1 h1Var = (h1) j1Var.f13626f.get(i1Var);
        if (h1Var != null) {
            h1Var.f13555a.f(h1Var.f13556b);
        }
        i1Var.f13578c.add(a2);
        u2.y c10 = i1Var.f13576a.c(a2, h0Var, j11);
        j1Var.f13625c.put(c10, i1Var);
        j1Var.c();
        if (j12 != -9223372036854775807L) {
            c10 = new u2.d(c10, !z10, 0L, j12, 0);
        }
        this.f13790a = c10;
    }

    public final long a(x2.u uVar, long j10, boolean z10, boolean[] zArr) {
        b[] bVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= uVar.f51358a) {
                break;
            }
            if (z10 || !uVar.a(this.f13801o, i10)) {
                z12 = false;
            }
            this.f13795i[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            bVarArr = this.f13796j;
            int length = bVarArr.length;
            objArr = this.f13792c;
            if (i11 >= length) {
                break;
            }
            if (bVarArr[i11].f13491b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f13801o = uVar;
        c();
        long o10 = this.f13790a.o(uVar.f51360c, this.f13795i, this.f13792c, zArr, j10);
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            if (bVarArr[i12].f13491b == -2 && this.f13801o.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f13793f = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                yb.p(uVar.b(i13));
                if (bVarArr[i13].f13491b != -2) {
                    this.f13793f = true;
                }
            } else {
                if (uVar.f51360c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yb.p(z11);
            }
        }
        return o10;
    }

    public final void b() {
        if (this.f13799m == null) {
            int i10 = 0;
            while (true) {
                x2.u uVar = this.f13801o;
                if (i10 < uVar.f51358a) {
                    boolean b10 = uVar.b(i10);
                    x2.q qVar = this.f13801o.f51360c[i10];
                    if (b10 && qVar != null) {
                        qVar.j();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f13799m == null) {
            int i10 = 0;
            while (true) {
                x2.u uVar = this.f13801o;
                if (i10 < uVar.f51358a) {
                    boolean b10 = uVar.b(i10);
                    x2.q qVar = this.f13801o.f51360c[i10];
                    if (b10 && qVar != null) {
                        qVar.g();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j10;
        if (!this.e) {
            return this.f13794g.f13807b;
        }
        if (this.f13793f) {
            j10 = this.f13790a.q();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f13794g.f13809f;
        }
        return j10;
    }

    public final long e() {
        return this.f13794g.f13807b + this.f13802p;
    }

    public final void f(float f7, b2.p1 p1Var, boolean z10) {
        this.e = true;
        this.f13800n = this.f13790a.p();
        x2.u j10 = j(f7, p1Var, z10);
        z0 z0Var = this.f13794g;
        long j11 = z0Var.f13807b;
        long j12 = z0Var.f13809f;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long a2 = a(j10, j11, false, new boolean[this.f13796j.length]);
        long j13 = this.f13802p;
        z0 z0Var2 = this.f13794g;
        this.f13802p = (z0Var2.f13807b - a2) + j13;
        this.f13794g = z0Var2.b(a2, z0Var2.f13808c);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f13793f || this.f13790a.q() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.f13794g.f13807b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f13790a;
        try {
            boolean z10 = r02 instanceof u2.d;
            j1 j1Var = this.f13798l;
            if (z10) {
                j1Var.f(((u2.d) r02).f49281a);
            } else {
                j1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.u j(float f7, b2.p1 p1Var, boolean z10) {
        x2.j jVar;
        x2.j jVar2;
        x2.o oVar;
        String str;
        String str2;
        int[] iArr;
        u2.r1[] r1VarArr;
        int[][][] iArr2;
        int i10;
        int i11;
        int[] iArr3;
        x2.q[] qVarArr;
        boolean z11;
        f9.s1 s1Var;
        x2.c bVar;
        f9.s1 f10;
        y2.c cVar;
        int i12;
        int[] iArr4;
        String str3;
        Pair p10;
        CaptioningManager captioningManager;
        Locale locale;
        Pair p11;
        boolean z12;
        Context context;
        int[] iArr5;
        x2.t tVar = this.f13797k;
        b[] bVarArr = this.f13796j;
        u2.r1 r1Var = this.f13800n;
        tVar.getClass();
        int i13 = 1;
        int[] iArr6 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        b2.q1[][] q1VarArr = new b2.q1[length];
        int[][][] iArr7 = new int[bVarArr.length + 1][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = r1Var.f49412a;
            q1VarArr[i14] = new b2.q1[i15];
            iArr7[i14] = new int[i15];
        }
        int length2 = bVarArr.length;
        int[] iArr8 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr8[i16] = bVarArr[i16].D();
        }
        int i17 = 0;
        while (i17 < r1Var.f49412a) {
            b2.q1 a2 = r1Var.a(i17);
            int i18 = a2.f3360c == 5 ? i13 : 0;
            int length3 = bVarArr.length;
            int i19 = i13;
            int i20 = 0;
            int i21 = 0;
            while (i20 < bVarArr.length) {
                b bVar2 = bVarArr[i20];
                x2.t tVar2 = tVar;
                u2.r1 r1Var2 = r1Var;
                int i22 = i13;
                int i23 = 0;
                for (int i24 = 0; i24 < a2.f3358a; i24++) {
                    i23 = Math.max(i23, bVar2.C(a2.d[i24]) & 7);
                }
                int i25 = iArr6[i20] == 0 ? i22 : 0;
                if (i23 > i21 || (i23 == i21 && i18 != 0 && i19 == 0 && i25 != 0)) {
                    i21 = i23;
                    i19 = i25;
                    length3 = i20;
                }
                i20++;
                tVar = tVar2;
                r1Var = r1Var2;
                i13 = i22;
            }
            x2.t tVar3 = tVar;
            u2.r1 r1Var3 = r1Var;
            int i26 = i13;
            if (length3 == bVarArr.length) {
                iArr5 = new int[a2.f3358a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr9 = new int[a2.f3358a];
                for (int i27 = 0; i27 < a2.f3358a; i27++) {
                    iArr9[i27] = bVar3.C(a2.d[i27]);
                }
                iArr5 = iArr9;
            }
            int i28 = iArr6[length3];
            q1VarArr[length3][i28] = a2;
            iArr7[length3][i28] = iArr5;
            iArr6[length3] = i28 + 1;
            i17++;
            tVar = tVar3;
            r1Var = r1Var3;
            i13 = i26;
        }
        x2.t tVar4 = tVar;
        int i29 = i13;
        u2.r1[] r1VarArr2 = new u2.r1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr10 = new int[bVarArr.length];
        for (int i30 = 0; i30 < bVarArr.length; i30++) {
            int i31 = iArr6[i30];
            r1VarArr2[i30] = new u2.r1((b2.q1[]) e2.n0.U(i31, q1VarArr[i30]));
            iArr7[i30] = (int[][]) e2.n0.U(i31, iArr7[i30]);
            strArr[i30] = bVarArr[i30].j();
            iArr10[i30] = bVarArr[i30].f13491b;
        }
        x2.s sVar = new x2.s(iArr10, r1VarArr2, iArr8, iArr7, new u2.r1((b2.q1[]) e2.n0.U(iArr6[bVarArr.length], q1VarArr[bVarArr.length])));
        x2.o oVar2 = (x2.o) tVar4;
        synchronized (oVar2.d) {
            oVar2.h = Thread.currentThread();
            jVar = oVar2.f51345g;
        }
        if (oVar2.f51348k == null && (context = oVar2.e) != null) {
            oVar2.f51348k = Boolean.valueOf(e2.n0.P(context));
        }
        if (jVar.A0 && Build.VERSION.SDK_INT >= 32 && oVar2.f51346i == null) {
            oVar2.f51346i = new z2.d(oVar2.e, new ti.g(oVar2, 14), oVar2.f51348k);
        }
        int i32 = sVar.f51351a;
        x2.p[] pVarArr = new x2.p[i32];
        x2.o.f(sVar, jVar, pVarArr);
        x2.o.d(sVar, jVar, pVarArr);
        x2.o.e(sVar, jVar, pVarArr);
        Context context2 = oVar2.e;
        int i33 = sVar.f51351a;
        Pair h = x2.o.h(pVarArr, i29);
        if (h == null) {
            int i34 = 0;
            while (true) {
                if (i34 >= i33) {
                    z12 = false;
                    break;
                } else if (2 == iArr10[i34] && r1VarArr2[i34].f49412a > 0) {
                    z12 = true;
                    break;
                } else {
                    i34++;
                }
            }
            ea.b bVar4 = new ea.b(oVar2, jVar, z12, iArr8, 7);
            oVar = oVar2;
            jVar2 = jVar;
            h = x2.o.p(1, sVar, iArr7, bVar4, new bv(25));
            if (h != null) {
                pVarArr[((Integer) h.second).intValue()] = (x2.p) h.first;
            }
        } else {
            jVar2 = jVar;
            oVar = oVar2;
        }
        if (h == null) {
            str = null;
        } else {
            x2.p pVar = (x2.p) h.first;
            str = pVar.f51349a.d[pVar.f51350b[0]].d;
        }
        Pair h10 = x2.o.h(pVarArr, 2);
        Pair h11 = x2.o.h(pVarArr, 4);
        if (h10 == null && h11 == null) {
            if (jVar2.f3506w.f3434a == 2) {
                str2 = str;
                p11 = null;
            } else {
                a1.d dVar = new a1.d(jVar2, str, iArr8, (!jVar2.f3495k || context2 == null) ? null : e2.n0.y(context2), 22);
                str2 = str;
                p11 = x2.o.p(2, sVar, iArr7, dVar, new bv(24));
            }
            Pair p12 = ((jVar2.E || p11 == null) && jVar2.f3506w.f3434a != 2) ? x2.o.p(4, sVar, iArr7, new x2.e(jVar2, 0), new bv(23)) : null;
            if (p12 != null) {
                pVarArr[((Integer) p12.second).intValue()] = (x2.p) p12.first;
            } else if (p11 != null) {
                pVarArr[((Integer) p11.second).intValue()] = (x2.p) p11.first;
            }
        } else {
            str2 = str;
        }
        if (x2.o.h(pVarArr, 3) == null) {
            if (jVar2.f3506w.f3434a == 2) {
                p10 = null;
            } else {
                if (!jVar2.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = e2.n0.f9692a;
                    str3 = locale.toLanguageTag();
                }
                p10 = x2.o.p(3, sVar, iArr7, new qy(jVar2, str2, str3, 13), new bv(26));
            }
            if (p10 != null) {
                pVarArr[((Integer) p10.second).intValue()] = (x2.p) p10.first;
            }
        }
        int c10 = c3.h0.c(0, 0, 0, 0);
        if (jVar2.f3506w.f3434a == 2) {
            iArr = iArr10;
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
        } else {
            int i35 = f9.t0.f10344c;
            ?? b0Var = new f9.b0(4);
            int i36 = 0;
            while (i36 < i32) {
                x2.p pVar2 = pVarArr[i36];
                if (pVar2 != null) {
                    b2.q1 q1Var = pVar2.f51349a;
                    if (!jVar2.E0.get(i36)) {
                        i11 = i36;
                        if (!jVar2.I.contains(Integer.valueOf(q1Var.f3360c))) {
                            b0Var.f(q1Var.f3359b);
                            int i37 = 0;
                            while (true) {
                                int[] iArr11 = pVar2.f51350b;
                                iArr3 = iArr10;
                                if (i37 < iArr11.length) {
                                    String str5 = q1Var.d[iArr11[i37]].f3580m;
                                    if (str5 != null) {
                                        b0Var.c(str5);
                                    }
                                    i37++;
                                    iArr10 = iArr3;
                                }
                            }
                            i36 = i11 + 1;
                            iArr10 = iArr3;
                        }
                        iArr3 = iArr10;
                        i36 = i11 + 1;
                        iArr10 = iArr3;
                    }
                }
                i11 = i36;
                iArr3 = iArr10;
                i36 = i11 + 1;
                iArr10 = iArr3;
            }
            iArr = iArr10;
            f9.t0 g7 = b0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i38 = 0;
            while (i38 < i33) {
                if (iArr[i38] != 5) {
                    i10 = i38;
                } else {
                    u2.r1 r1Var4 = r1VarArr2[i38];
                    i10 = i38;
                    int i39 = 0;
                    while (i39 < r1Var4.f49412a) {
                        b2.q1 a10 = r1Var4.a(i39);
                        arrayList.add(a10);
                        u2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr12 = (int[]) iArr7[i10][i39].clone();
                        u2.r1 r1Var5 = r1Var4;
                        int[][][] iArr13 = iArr7;
                        for (int i40 = 0; i40 < iArr12.length; i40++) {
                            String str6 = a10.d[i40].f3580m;
                            if (str6 != null && !g7.contains(str6)) {
                                iArr12[i40] = c10;
                            }
                        }
                        arrayList2.add(iArr12);
                        i39++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr7 = iArr13;
                    }
                }
                i38 = i10 + 1;
                r1VarArr2 = r1VarArr2;
                iArr7 = iArr7;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
            int size = arrayList.size();
            b2.q1[] q1VarArr2 = new b2.q1[size];
            yb.p(arrayList.size() == size);
            arrayList.toArray(q1VarArr2);
            u2.r1 r1Var6 = new u2.r1(q1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2];
            yb.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i41 = 0; i41 < i33; i41++) {
                if (iArr[i41] == 5) {
                    x2.p o10 = x2.o.o(r1Var6, iArr14, jVar2);
                    pVarArr[i41] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[r1Var6.b(o10.f51349a)], c10);
                }
            }
        }
        for (int i42 = 0; i42 < i33; i42++) {
            int i43 = iArr[i42];
            if (i43 != 2 && i43 != 1 && i43 != 3 && i43 != 4) {
                if (i43 != 5 && pVarArr[i42] == null) {
                    pVarArr[i42] = x2.o.o(r1VarArr[i42], iArr2[i42], jVar2);
                }
            }
        }
        x2.o.f(sVar, jVar2, pVarArr);
        x2.o.d(sVar, jVar2, pVarArr);
        x2.o.e(sVar, jVar2, pVarArr);
        qb.a aVar = oVar.f51344f;
        y2.c cVar2 = oVar.f51356b;
        cVar2.getClass();
        aVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (x2.p pVar3 : pVarArr) {
            if (pVar3 != null && pVar3.f51350b.length > 1) {
                f9.f0 t10 = f9.i0.t();
                t10.c(new x2.a(0L, 0L));
                arrayList3.add(t10);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = pVarArr.length;
        long[][] jArr = new long[length4];
        for (int i44 = 0; i44 < pVarArr.length; i44++) {
            x2.p pVar4 = pVarArr[i44];
            if (pVar4 == null) {
                jArr[i44] = new long[0];
            } else {
                int[] iArr15 = pVar4.f51350b;
                jArr[i44] = new long[iArr15.length];
                for (int i45 = 0; i45 < iArr15.length; i45++) {
                    long j10 = pVar4.f51349a.d[iArr15[i45]].f3577j;
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
            jArr3[i46] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList3, jArr3);
        f9.o.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(f9.n1.f10307b);
        f9.j1 j1Var = new f9.j1();
        f9.k1 k1Var = new f9.k1(treeMap);
        k1Var.h = j1Var;
        int i47 = 0;
        while (i47 < length4) {
            long[] jArr5 = jArr[i47];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i12 = length4;
                iArr4 = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i48 = 0;
                while (true) {
                    long[] jArr6 = jArr[i47];
                    i12 = length4;
                    double d = 0.0d;
                    if (i48 >= jArr6.length) {
                        break;
                    }
                    int[] iArr17 = iArr16;
                    long j11 = jArr6[i48];
                    if (j11 != -1) {
                        d = Math.log(j11);
                    }
                    dArr[i48] = d;
                    i48++;
                    length4 = i12;
                    iArr16 = iArr17;
                }
                iArr4 = iArr16;
                int i49 = length5 - 1;
                double d10 = dArr[i49] - dArr[0];
                int i50 = 0;
                while (i50 < i49) {
                    double d11 = dArr[i50];
                    int i51 = i50 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i51]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i47);
                    double d12 = d10;
                    Map map = k1Var.e;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h12 = k1Var.h();
                        if (h12.add(valueOf2)) {
                            k1Var.f10293f++;
                            map.put(valueOf, h12);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        k1Var.f10293f++;
                    }
                    i50 = i51;
                    d10 = d12;
                }
                continue;
            }
            i47++;
            length4 = i12;
            iArr16 = iArr4;
            cVar2 = cVar;
        }
        y2.c cVar3 = cVar2;
        int[] iArr18 = iArr16;
        Collection collection2 = k1Var.f10296c;
        if (collection2 == null) {
            collection2 = new a8.f(k1Var, 3);
            k1Var.f10296c = collection2;
        }
        f9.i0 u10 = f9.i0.u(collection2);
        for (int i52 = 0; i52 < u10.size(); i52++) {
            int intValue = ((Integer) u10.get(i52)).intValue();
            int i53 = iArr18[intValue] + 1;
            iArr18[intValue] = i53;
            jArr3[intValue] = jArr[intValue][i53];
            x2.b.v(arrayList3, jArr3);
        }
        for (int i54 = 0; i54 < pVarArr.length; i54++) {
            if (arrayList3.get(i54) != null) {
                jArr3[i54] = jArr3[i54] * 2;
            }
        }
        x2.b.v(arrayList3, jArr3);
        f9.f0 t11 = f9.i0.t();
        for (int i55 = 0; i55 < arrayList3.size(); i55++) {
            f9.f0 f0Var = (f9.f0) arrayList3.get(i55);
            if (f0Var == null) {
                f10 = f9.s1.e;
            } else {
                f10 = f0Var.f();
            }
            t11.c(f10);
        }
        f9.s1 f11 = t11.f();
        x2.q[] qVarArr2 = new x2.q[pVarArr.length];
        for (int i56 = 0; i56 < pVarArr.length; i56++) {
            x2.p pVar5 = pVarArr[i56];
            if (pVar5 != null) {
                int[] iArr19 = pVar5.f51350b;
                if (iArr19.length != 0) {
                    if (iArr19.length == 1) {
                        bVar = new x2.c(pVar5.f51349a, new int[]{iArr19[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new x2.b(pVar5.f51349a, iArr19, cVar3, 10000, j12, j12, (f9.i0) f11.get(i56));
                    }
                    qVarArr2[i56] = bVar;
                }
            }
        }
        q1[] q1VarArr3 = new q1[i32];
        for (int i57 = 0; i57 < i32; i57++) {
            q1VarArr3[i57] = (jVar2.E0.get(i57) || jVar2.I.contains(Integer.valueOf(sVar.f51352b[i57])) || (sVar.f51352b[i57] != -2 && qVarArr2[i57] == null)) ? null : q1.f13713c;
        }
        if (jVar2.f3506w.f3434a != 0) {
            int i58 = 0;
            int i59 = 0;
            int i60 = -1;
            while (true) {
                if (i58 < sVar.f51351a) {
                    int i61 = sVar.f51352b[i58];
                    x2.q qVar = qVarArr2[i58];
                    if (i61 != 1 && qVar != null) {
                        break;
                    }
                    if (i61 == 1 && qVar != null && qVar.length() == 1) {
                        if (x2.o.n(jVar2, iArr2[i58][sVar.f51353c[i58].b(qVar.b())][qVar.h(0)], qVar.m())) {
                            i59++;
                            i60 = i58;
                        }
                    }
                    i58++;
                } else if (i59 == 1) {
                    int i62 = jVar2.f3506w.f3435b ? 1 : 2;
                    q1 q1Var2 = q1VarArr3[i60];
                    q1VarArr3[i60] = new q1(i62, q1Var2 != null && q1Var2.f13715b);
                }
            }
        }
        Pair create = Pair.create(q1VarArr3, qVarArr2);
        x2.q[] qVarArr3 = (x2.q[]) create.second;
        int length6 = qVarArr3.length;
        List[] listArr = new List[length6];
        for (int i63 = 0; i63 < qVarArr3.length; i63++) {
            x2.q qVar2 = qVarArr3[i63];
            if (qVar2 != null) {
                s1Var = f9.i0.y(qVar2);
            } else {
                f9.g0 g0Var = f9.i0.f10287b;
                s1Var = f9.s1.e;
            }
            listArr[i63] = s1Var;
        }
        ?? b0Var2 = new f9.b0(4);
        int i64 = 0;
        while (true) {
            int i65 = sVar.f51351a;
            u2.r1[] r1VarArr4 = sVar.f51353c;
            if (i64 >= i65) {
                break;
            }
            u2.r1 r1Var7 = r1VarArr4[i64];
            int i66 = 0;
            while (i66 < r1Var7.f49412a) {
                b2.q1 a11 = r1Var7.a(i66);
                int i67 = r1VarArr4[i64].a(i66).f3358a;
                int[] iArr20 = new int[i67];
                int i68 = 0;
                int i69 = 0;
                while (i69 < i67) {
                    List[] listArr2 = listArr;
                    if ((sVar.e[i64][i66][i69] & 7) == 4) {
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
                int i72 = 0;
                String str7 = null;
                boolean z13 = false;
                int i73 = 0;
                while (i72 < copyOf.length) {
                    int[] iArr21 = copyOf;
                    String str8 = r1VarArr4[i71].a(i66).d[copyOf[i72]].f3586s;
                    int i74 = i73 + 1;
                    if (i73 == 0) {
                        str7 = str8;
                    } else {
                        z13 = (!Objects.equals(str7, str8)) | z13;
                    }
                    i70 = Math.min(i70, sVar.e[i71][i66][i72] & 24);
                    i72++;
                    i73 = i74;
                    copyOf = iArr21;
                }
                if (z13) {
                    i70 = Math.min(i70, sVar.d[i71]);
                }
                boolean z14 = i70 != 0;
                int i75 = a11.f3358a;
                int[] iArr22 = new int[i75];
                boolean[] zArr = new boolean[i75];
                int i76 = 0;
                while (i76 < a11.f3358a) {
                    iArr22[i76] = sVar.e[i71][i66][i76] & 7;
                    int i77 = 0;
                    boolean z15 = false;
                    while (i77 < length6) {
                        List list = listArr3[i77];
                        int i78 = length6;
                        u2.r1 r1Var8 = r1Var7;
                        int i79 = 0;
                        while (true) {
                            if (i79 < list.size()) {
                                x2.q qVar3 = (x2.q) list.get(i79);
                                int i80 = i79;
                                if (qVar3.b().equals(a11) && qVar3.u(i76) != -1) {
                                    z15 = true;
                                    break;
                                }
                                i79 = i80 + 1;
                            }
                        }
                        i77++;
                        length6 = i78;
                        r1Var7 = r1Var8;
                    }
                    zArr[i76] = z15;
                    i76++;
                    r1Var7 = r1Var7;
                }
                b0Var2.c(new v1(a11, z14, iArr22, zArr));
                i66++;
                listArr = listArr3;
                i64 = i71;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i64++;
        }
        u2.r1 r1Var9 = sVar.f51354f;
        for (int i81 = 0; i81 < r1Var9.f49412a; i81++) {
            b2.q1 a12 = r1Var9.a(i81);
            int[] iArr23 = new int[a12.f3358a];
            Arrays.fill(iArr23, 0);
            b0Var2.c(new v1(a12, false, iArr23, new boolean[a12.f3358a]));
        }
        x2.u uVar = new x2.u((q1[]) create.first, (x2.q[]) create.second, new w1(b0Var2.f()), sVar);
        for (int i82 = 0; i82 < uVar.f51358a; i82++) {
            if (uVar.b(i82)) {
                if (uVar.f51360c[i82] == null && this.f13796j[i82].f13491b != -2) {
                    z11 = false;
                    yb.p(z11);
                }
                z11 = true;
                yb.p(z11);
            } else {
                yb.p(uVar.f51360c[i82] == null);
            }
        }
        for (x2.q qVar4 : uVar.f51360c) {
            if (qVar4 != null) {
                qVar4.p(f7);
                qVar4.e(z10);
            }
        }
        return uVar;
    }

    public final void k() {
        Object obj = this.f13790a;
        if (obj instanceof u2.d) {
            long j10 = this.f13794g.e;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.f49284f = 0L;
            dVar.h = j10;
        }
    }
}
