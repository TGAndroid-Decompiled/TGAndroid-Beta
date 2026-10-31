package i2;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import bi.o4;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.ex0;
import v7.t6;
public final class y0 {
    public final Object f8117a;
    public final Object f8118b;
    public final u2.d1[] f8119c;
    public boolean d;
    public boolean e;
    public boolean f8120f;
    public z0 f8121g;
    public boolean h;
    public final boolean[] f8122i;
    public final b[] f8123j;
    public final x2.t f8124k;
    public final l1 f8125l;
    public y0 f8126m;
    public u2.r1 f8127n;
    public x2.u f8128o;
    public long f8129p;

    public y0(b[] bVarArr, long j10, x2.t tVar, android.support.v4.media.session.a0 a0Var, l1 l1Var, z0 z0Var, x2.u uVar) {
        this.f8123j = bVarArr;
        this.f8129p = j10;
        this.f8124k = tVar;
        this.f8125l = l1Var;
        u2.g0 g0Var = z0Var.f8132a;
        this.f8118b = g0Var.f49875a;
        this.f8121g = z0Var;
        this.f8127n = u2.r1.d;
        this.f8128o = uVar;
        this.f8119c = new u2.d1[bVarArr.length];
        this.f8122i = new boolean[bVarArr.length];
        long j11 = z0Var.f8133b;
        long j12 = z0Var.e;
        boolean z10 = z0Var.f8136g;
        l1Var.getClass();
        Object obj = g0Var.f49875a;
        int i10 = a.f7788g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.g0 a2 = g0Var.a(pair.second);
        k1 k1Var = (k1) l1Var.d.get(obj2);
        k1Var.getClass();
        l1Var.f7961g.add(k1Var);
        j1 j1Var = (j1) l1Var.f7960f.get(k1Var);
        if (j1Var != null) {
            j1Var.f7944a.f(j1Var.f7945b);
        }
        k1Var.f7951c.add(a2);
        u2.y c10 = k1Var.f7949a.c(a2, a0Var, j11);
        l1Var.f7959c.put(c10, k1Var);
        l1Var.c();
        if (j12 != -9223372036854775807L) {
            c10 = new u2.d(c10, !z10, 0L, j12, 0);
        }
        this.f8117a = c10;
    }

    public final long a(x2.u uVar, long j10, boolean z10, boolean[] zArr) {
        b[] bVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= uVar.f52956a) {
                break;
            }
            if (z10 || !uVar.a(this.f8128o, i10)) {
                z12 = false;
            }
            this.f8122i[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            bVarArr = this.f8123j;
            int length = bVarArr.length;
            objArr = this.f8119c;
            if (i11 >= length) {
                break;
            }
            if (bVarArr[i11].f7808b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f8128o = uVar;
        c();
        long p5 = this.f8117a.p(uVar.f52958c, this.f8122i, this.f8119c, zArr, j10);
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            if (bVarArr[i12].f7808b == -2 && this.f8128o.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f8120f = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                t6.p(uVar.b(i13));
                if (bVarArr[i13].f7808b != -2) {
                    this.f8120f = true;
                }
            } else {
                if (uVar.f52958c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t6.p(z11);
            }
        }
        return p5;
    }

    public final void b() {
        if (this.f8126m == null) {
            int i10 = 0;
            while (true) {
                x2.u uVar = this.f8128o;
                if (i10 < uVar.f52956a) {
                    boolean b10 = uVar.b(i10);
                    x2.q qVar = this.f8128o.f52958c[i10];
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
        if (this.f8126m == null) {
            int i10 = 0;
            while (true) {
                x2.u uVar = this.f8128o;
                if (i10 < uVar.f52956a) {
                    boolean b10 = uVar.b(i10);
                    x2.q qVar = this.f8128o.f52958c[i10];
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
            return this.f8121g.f8133b;
        }
        if (this.f8120f) {
            j10 = this.f8117a.s();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f8121g.f8135f;
        }
        return j10;
    }

    public final long e() {
        return this.f8121g.f8133b + this.f8129p;
    }

    public final void f(float f7, b2.o1 o1Var, boolean z10) {
        this.e = true;
        this.f8127n = this.f8117a.q();
        x2.u j10 = j(f7, o1Var, z10);
        z0 z0Var = this.f8121g;
        long j11 = z0Var.f8133b;
        long j12 = z0Var.f8135f;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long a2 = a(j10, j11, false, new boolean[this.f8123j.length]);
        long j13 = this.f8129p;
        z0 z0Var2 = this.f8121g;
        this.f8129p = (z0Var2.f8133b - a2) + j13;
        this.f8121g = z0Var2.b(a2, z0Var2.f8134c);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f8120f || this.f8117a.s() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.f8121g.f8133b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f8117a;
        try {
            boolean z10 = r02 instanceof u2.d;
            l1 l1Var = this.f8125l;
            if (z10) {
                l1Var.f(((u2.d) r02).f49862a);
            } else {
                l1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.u j(float f7, b2.o1 o1Var, boolean z10) {
        x2.j jVar;
        x2.j jVar2;
        x2.o oVar;
        String str;
        String str2;
        int[] iArr;
        u2.r1[] r1VarArr;
        int[][][] iArr2;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int[] iArr3;
        x2.q[] qVarArr;
        boolean z13;
        boolean z14;
        boolean z15;
        x1 x1Var;
        int i12;
        boolean z16;
        s1 s1Var;
        x2.c bVar;
        x1 f10;
        y2.c cVar;
        int i13;
        long[][] jArr;
        double d;
        long j10;
        String str3;
        Pair p5;
        CaptioningManager captioningManager;
        Locale locale;
        Point point;
        Pair p9;
        Pair p10;
        boolean z17;
        Context context;
        int i14;
        int[] iArr4;
        int i15;
        x2.t tVar = this.f8124k;
        b[] bVarArr = this.f8123j;
        u2.r1 r1Var = this.f8127n;
        tVar.getClass();
        int i16 = 1;
        int[] iArr5 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        b2.p1[][] p1VarArr = new b2.p1[length];
        int[][][] iArr6 = new int[bVarArr.length + 1][];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = r1Var.f49993a;
            p1VarArr[i17] = new b2.p1[i18];
            iArr6[i17] = new int[i18];
        }
        int length2 = bVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i19 = 0; i19 < length2; i19++) {
            iArr7[i19] = bVarArr[i19].D();
        }
        int i20 = 0;
        while (i20 < r1Var.f49993a) {
            b2.p1 a2 = r1Var.a(i20);
            if (a2.f2189c == 5) {
                i14 = i16;
            } else {
                i14 = 0;
            }
            int length3 = bVarArr.length;
            int i21 = i16;
            int i22 = 0;
            int i23 = 0;
            while (i22 < bVarArr.length) {
                b bVar2 = bVarArr[i22];
                x2.t tVar2 = tVar;
                u2.r1 r1Var2 = r1Var;
                int i24 = i16;
                int i25 = 0;
                for (int i26 = 0; i26 < a2.f2187a; i26++) {
                    i25 = Math.max(i25, bVar2.C(a2.d[i26]) & 7);
                }
                if (iArr5[i22] == 0) {
                    i15 = i24;
                } else {
                    i15 = 0;
                }
                if (i25 > i23 || (i25 == i23 && i14 != 0 && i21 == 0 && i15 != 0)) {
                    i23 = i25;
                    i21 = i15;
                    length3 = i22;
                }
                i22++;
                tVar = tVar2;
                r1Var = r1Var2;
                i16 = i24;
            }
            x2.t tVar3 = tVar;
            u2.r1 r1Var3 = r1Var;
            int i27 = i16;
            if (length3 == bVarArr.length) {
                iArr4 = new int[a2.f2187a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr8 = new int[a2.f2187a];
                for (int i28 = 0; i28 < a2.f2187a; i28++) {
                    iArr8[i28] = bVar3.C(a2.d[i28]);
                }
                iArr4 = iArr8;
            }
            int i29 = iArr5[length3];
            p1VarArr[length3][i29] = a2;
            iArr6[length3][i29] = iArr4;
            iArr5[length3] = i29 + 1;
            i20++;
            tVar = tVar3;
            r1Var = r1Var3;
            i16 = i27;
        }
        x2.t tVar4 = tVar;
        int i30 = i16;
        u2.r1[] r1VarArr2 = new u2.r1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr9 = new int[bVarArr.length];
        for (int i31 = 0; i31 < bVarArr.length; i31++) {
            int i32 = iArr5[i31];
            r1VarArr2[i31] = new u2.r1((b2.p1[]) e2.l0.U(i32, p1VarArr[i31]));
            iArr6[i31] = (int[][]) e2.l0.U(i32, iArr6[i31]);
            strArr[i31] = bVarArr[i31].j();
            iArr9[i31] = bVarArr[i31].f7808b;
        }
        x2.s sVar = new x2.s(iArr9, r1VarArr2, iArr7, iArr6, new u2.r1((b2.p1[]) e2.l0.U(iArr5[bVarArr.length], p1VarArr[bVarArr.length])));
        x2.o oVar2 = (x2.o) tVar4;
        synchronized (oVar2.d) {
            oVar2.h = Thread.currentThread();
            jVar = oVar2.f52943g;
        }
        if (oVar2.f52946k == null && (context = oVar2.e) != null) {
            oVar2.f52946k = Boolean.valueOf(e2.l0.P(context));
        }
        char c10 = 24;
        if (jVar.A0 && Build.VERSION.SDK_INT >= 32 && oVar2.f52944i == null) {
            oVar2.f52944i = new z2.d(oVar2.e, new vh.d0(oVar2, 24), oVar2.f52946k);
        }
        int i33 = sVar.f52949a;
        x2.p[] pVarArr = new x2.p[i33];
        x2.o.f(sVar, jVar, pVarArr);
        x2.o.d(sVar, jVar, pVarArr);
        x2.o.e(sVar, jVar, pVarArr);
        Context context2 = oVar2.e;
        int i34 = sVar.f52949a;
        Pair h = x2.o.h(pVarArr, i30);
        if (h == null) {
            int i35 = 0;
            while (true) {
                char c11 = c10;
                if (i35 < i34) {
                    if (2 == iArr9[i35] && r1VarArr2[i35].f49993a > 0) {
                        z17 = true;
                        break;
                    }
                    i35++;
                    c10 = c11;
                } else {
                    z17 = false;
                    break;
                }
            }
            o4 o4Var = new o4(oVar2, jVar, z17, iArr7, 6);
            oVar = oVar2;
            jVar2 = jVar;
            h = x2.o.p(1, sVar, iArr6, o4Var, new x2.e(1));
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
            str = pVar.f52947a.d[pVar.f52948b[0]].d;
        }
        Pair h10 = x2.o.h(pVarArr, 2);
        Pair h11 = x2.o.h(pVarArr, 4);
        if (h10 == null && h11 == null) {
            if (jVar2.f2343w.f2271a == 2) {
                str2 = str;
                p9 = null;
            } else {
                if (jVar2.f2332k && context2 != null) {
                    point = e2.l0.y(context2);
                } else {
                    point = null;
                }
                a1.d dVar = new a1.d(jVar2, str, iArr7, point, 21);
                str2 = str;
                p9 = x2.o.p(2, sVar, iArr6, dVar, new x2.e(0));
            }
            if ((!jVar2.E && p9 != null) || jVar2.f2343w.f2271a == 2) {
                p10 = null;
            } else {
                p10 = x2.o.p(4, sVar, iArr6, new wh.b(jVar2, 1), new ex0(29));
            }
            if (p10 != null) {
                pVarArr[((Integer) p10.second).intValue()] = (x2.p) p10.first;
            } else if (p9 != null) {
                pVarArr[((Integer) p9.second).intValue()] = (x2.p) p9.first;
            }
        } else {
            str2 = str;
        }
        if (x2.o.h(pVarArr, 3) == null) {
            if (jVar2.f2343w.f2271a == 2) {
                p5 = null;
            } else {
                if (jVar2.B && context2 != null && (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
                    String str4 = e2.l0.f6165a;
                    str3 = locale.toLanguageTag();
                } else {
                    str3 = null;
                }
                p5 = x2.o.p(3, sVar, iArr6, new q5.a(jVar2, str2, str3, 10), new x2.e(2));
            }
            if (p5 != null) {
                pVarArr[((Integer) p5.second).intValue()] = (x2.p) p5.first;
            }
        }
        int a10 = i0.a.a(0, 0, 0, 0);
        if (jVar2.f2343w.f2271a == 2) {
            iArr = iArr9;
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
        } else {
            int i36 = e9.y0.f6452c;
            ?? g0Var = new e9.g0(4);
            int i37 = 0;
            while (i37 < i33) {
                x2.p pVar2 = pVarArr[i37];
                if (pVar2 != null) {
                    b2.p1 p1Var = pVar2.f52947a;
                    if (!jVar2.E0.get(i37)) {
                        i11 = i37;
                        if (!jVar2.I.contains(Integer.valueOf(p1Var.f2189c))) {
                            g0Var.f(p1Var.f2188b);
                            int i38 = 0;
                            while (true) {
                                int[] iArr10 = pVar2.f52948b;
                                iArr3 = iArr9;
                                if (i38 < iArr10.length) {
                                    String str5 = p1Var.d[iArr10[i38]].f2417m;
                                    if (str5 != null) {
                                        g0Var.c(str5);
                                    }
                                    i38++;
                                    iArr9 = iArr3;
                                }
                            }
                            i37 = i11 + 1;
                            iArr9 = iArr3;
                        }
                        iArr3 = iArr9;
                        i37 = i11 + 1;
                        iArr9 = iArr3;
                    }
                }
                i11 = i37;
                iArr3 = iArr9;
                i37 = i11 + 1;
                iArr9 = iArr3;
            }
            iArr = iArr9;
            e9.y0 g10 = g0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i39 = 0;
            while (i39 < i34) {
                if (iArr[i39] != 5) {
                    i10 = i39;
                } else {
                    u2.r1 r1Var4 = r1VarArr2[i39];
                    i10 = i39;
                    int i40 = 0;
                    while (i40 < r1Var4.f49993a) {
                        b2.p1 a11 = r1Var4.a(i40);
                        arrayList.add(a11);
                        u2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr11 = (int[]) iArr6[i10][i40].clone();
                        u2.r1 r1Var5 = r1Var4;
                        int[][][] iArr12 = iArr6;
                        for (int i41 = 0; i41 < iArr11.length; i41++) {
                            String str6 = a11.d[i41].f2417m;
                            if (str6 != null && !g10.contains(str6)) {
                                iArr11[i41] = a10;
                            }
                        }
                        arrayList2.add(iArr11);
                        i40++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr6 = iArr12;
                    }
                }
                i39 = i10 + 1;
                r1VarArr2 = r1VarArr2;
                iArr6 = iArr6;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
            int size = arrayList.size();
            b2.p1[] p1VarArr2 = new b2.p1[size];
            if (arrayList.size() == size) {
                z11 = true;
            } else {
                z11 = false;
            }
            t6.p(z11);
            arrayList.toArray(p1VarArr2);
            u2.r1 r1Var6 = new u2.r1(p1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr13 = new int[size2];
            if (arrayList2.size() == size2) {
                z12 = true;
            } else {
                z12 = false;
            }
            t6.p(z12);
            arrayList2.toArray(iArr13);
            for (int i42 = 0; i42 < i34; i42++) {
                if (iArr[i42] == 5) {
                    x2.p o10 = x2.o.o(r1Var6, iArr13, jVar2);
                    pVarArr[i42] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr13[r1Var6.b(o10.f52947a)], a10);
                }
            }
        }
        for (int i43 = 0; i43 < i34; i43++) {
            int i44 = iArr[i43];
            if (i44 != 2 && i44 != 1) {
                if (i44 != 3 && i44 != 4) {
                    if (i44 != 5 && pVarArr[i43] == null) {
                        pVarArr[i43] = x2.o.o(r1VarArr[i43], iArr2[i43], jVar2);
                    }
                }
            }
        }
        x2.o.f(sVar, jVar2, pVarArr);
        x2.o.d(sVar, jVar2, pVarArr);
        x2.o.e(sVar, jVar2, pVarArr);
        t7.u uVar = oVar.f52942f;
        y2.c cVar2 = oVar.f52954b;
        cVar2.getClass();
        uVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (x2.p pVar3 : pVarArr) {
            if (pVar3 != null && pVar3.f52948b.length > 1) {
                e9.k0 t10 = e9.n0.t();
                t10.c(new x2.a(0L, 0L));
                arrayList3.add(t10);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = pVarArr.length;
        long[][] jArr2 = new long[length4];
        for (int i45 = 0; i45 < pVarArr.length; i45++) {
            x2.p pVar4 = pVarArr[i45];
            if (pVar4 == null) {
                jArr2[i45] = new long[0];
            } else {
                int[] iArr14 = pVar4.f52948b;
                jArr2[i45] = new long[iArr14.length];
                for (int i46 = 0; i46 < iArr14.length; i46++) {
                    long j11 = pVar4.f52947a.d[iArr14[i46]].f2414j;
                    long[] jArr3 = jArr2[i45];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr3[i46] = j11;
                }
                Arrays.sort(jArr2[i45]);
            }
        }
        int[] iArr15 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr5 = jArr2[i47];
            if (jArr5.length == 0) {
                j10 = 0;
            } else {
                j10 = jArr5[0];
            }
            jArr4[i47] = j10;
        }
        x2.b.v(arrayList3, jArr4);
        e9.s.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.s1.f6413b);
        e9.o1 o1Var2 = new e9.o1();
        e9.p1 p1Var2 = new e9.p1(treeMap);
        p1Var2.h = o1Var2;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr6 = jArr2[i48];
            if (jArr6.length <= 1) {
                cVar = cVar2;
                i13 = length4;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i49 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i48];
                    i13 = length4;
                    double d10 = 0.0d;
                    if (i49 >= jArr7.length) {
                        break;
                    }
                    long[][] jArr8 = jArr2;
                    int i50 = length5;
                    long j12 = jArr7[i49];
                    if (j12 != -1) {
                        d10 = Math.log(j12);
                    }
                    dArr[i49] = d10;
                    i49++;
                    jArr2 = jArr8;
                    length4 = i13;
                    length5 = i50;
                }
                long[][] jArr9 = jArr2;
                int i51 = length5 - 1;
                double d11 = dArr[i51] - dArr[0];
                int i52 = 0;
                while (i52 < i51) {
                    double d12 = dArr[i52];
                    int i53 = i52 + 1;
                    double d13 = (d12 + dArr[i53]) * 0.5d;
                    if (d11 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d13 - dArr[0]) / d11;
                    }
                    Double valueOf = Double.valueOf(d);
                    Integer valueOf2 = Integer.valueOf(i48);
                    Map map = p1Var2.e;
                    long[][] jArr10 = jArr9;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h12 = p1Var2.h();
                        if (h12.add(valueOf2)) {
                            p1Var2.f6401f++;
                            map.put(valueOf, h12);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        p1Var2.f6401f++;
                    }
                    i52 = i53;
                    jArr9 = jArr10;
                }
                jArr = jArr9;
            }
            i48++;
            length4 = i13;
            cVar2 = cVar;
            jArr2 = jArr;
        }
        y2.c cVar3 = cVar2;
        long[][] jArr11 = jArr2;
        Collection collection2 = p1Var2.f6397c;
        if (collection2 == null) {
            collection2 = new e9.o(p1Var2, 1);
            p1Var2.f6397c = collection2;
        }
        e9.n0 u10 = e9.n0.u(collection2);
        for (int i54 = 0; i54 < u10.size(); i54++) {
            int intValue = ((Integer) u10.get(i54)).intValue();
            int i55 = iArr15[intValue] + 1;
            iArr15[intValue] = i55;
            jArr4[intValue] = jArr11[intValue][i55];
            x2.b.v(arrayList3, jArr4);
        }
        for (int i56 = 0; i56 < pVarArr.length; i56++) {
            if (arrayList3.get(i56) != null) {
                jArr4[i56] = jArr4[i56] * 2;
            }
        }
        x2.b.v(arrayList3, jArr4);
        e9.k0 t11 = e9.n0.t();
        for (int i57 = 0; i57 < arrayList3.size(); i57++) {
            e9.k0 k0Var = (e9.k0) arrayList3.get(i57);
            if (k0Var == null) {
                f10 = x1.e;
            } else {
                f10 = k0Var.f();
            }
            t11.c(f10);
        }
        x1 f11 = t11.f();
        x2.q[] qVarArr2 = new x2.q[pVarArr.length];
        for (int i58 = 0; i58 < pVarArr.length; i58++) {
            x2.p pVar5 = pVarArr[i58];
            if (pVar5 != null) {
                int[] iArr16 = pVar5.f52948b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        bVar = new x2.c(pVar5.f52947a, new int[]{iArr16[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(pVar5.f52947a, iArr16, cVar3, 10000, j13, j13, (e9.n0) f11.get(i58));
                    }
                    qVarArr2[i58] = bVar;
                }
            }
        }
        s1[] s1VarArr = new s1[i33];
        for (int i59 = 0; i59 < i33; i59++) {
            int i60 = sVar.f52950b[i59];
            if (!jVar2.E0.get(i59) && !jVar2.I.contains(Integer.valueOf(i60)) && (sVar.f52950b[i59] == -2 || qVarArr2[i59] != null)) {
                s1Var = s1.f8078c;
            } else {
                s1Var = null;
            }
            s1VarArr[i59] = s1Var;
        }
        if (jVar2.f2343w.f2271a != 0) {
            int i61 = 0;
            int i62 = 0;
            int i63 = -1;
            while (true) {
                if (i61 < sVar.f52949a) {
                    int i64 = sVar.f52950b[i61];
                    x2.q qVar = qVarArr2[i61];
                    if (i64 != 1 && qVar != null) {
                        break;
                    }
                    if (i64 == 1 && qVar != null && qVar.length() == 1) {
                        if (x2.o.n(jVar2, iArr2[i61][sVar.f52951c[i61].b(qVar.b())][qVar.h(0)], qVar.m())) {
                            i62++;
                            i63 = i61;
                        }
                    }
                    i61++;
                } else if (i62 == 1) {
                    if (jVar2.f2343w.f2272b) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                    s1 s1Var2 = s1VarArr[i63];
                    if (s1Var2 != null && s1Var2.f8080b) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    s1VarArr[i63] = new s1(i12, z16);
                }
            }
        }
        Pair create = Pair.create(s1VarArr, qVarArr2);
        x2.q[] qVarArr3 = (x2.q[]) create.second;
        int length6 = qVarArr3.length;
        List[] listArr = new List[length6];
        for (int i65 = 0; i65 < qVarArr3.length; i65++) {
            x2.q qVar2 = qVarArr3[i65];
            if (qVar2 != null) {
                x1Var = e9.n0.y(qVar2);
            } else {
                e9.l0 l0Var = e9.n0.f6390b;
                x1Var = x1.e;
            }
            listArr[i65] = x1Var;
        }
        ?? g0Var2 = new e9.g0(4);
        int i66 = 0;
        while (true) {
            int i67 = sVar.f52949a;
            u2.r1[] r1VarArr4 = sVar.f52951c;
            if (i66 >= i67) {
                break;
            }
            u2.r1 r1Var7 = r1VarArr4[i66];
            int i68 = 0;
            while (i68 < r1Var7.f49993a) {
                b2.p1 a12 = r1Var7.a(i68);
                int i69 = r1VarArr4[i66].a(i68).f2187a;
                int[] iArr17 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i71 < i69) {
                    List[] listArr2 = listArr;
                    if ((sVar.e[i66][i68][i71] & 7) == 4) {
                        iArr17[i70] = i71;
                        i70++;
                    }
                    i71++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr17, i70);
                int i72 = 16;
                int i73 = i66;
                int i74 = 0;
                String str7 = null;
                boolean z18 = false;
                int i75 = 0;
                while (i74 < copyOf.length) {
                    int[] iArr18 = copyOf;
                    String str8 = r1VarArr4[i73].a(i68).d[copyOf[i74]].f2423s;
                    int i76 = i75 + 1;
                    if (i75 == 0) {
                        str7 = str8;
                    } else {
                        z18 = (!Objects.equals(str7, str8)) | z18;
                    }
                    i72 = Math.min(i72, sVar.e[i73][i68][i74] & 24);
                    i74++;
                    i75 = i76;
                    copyOf = iArr18;
                }
                if (z18) {
                    i72 = Math.min(i72, sVar.d[i73]);
                }
                if (i72 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                int i77 = a12.f2187a;
                int[] iArr19 = new int[i77];
                boolean[] zArr = new boolean[i77];
                int i78 = 0;
                while (i78 < a12.f2187a) {
                    iArr19[i78] = sVar.e[i73][i68][i78] & 7;
                    int i79 = 0;
                    boolean z19 = false;
                    while (i79 < length6) {
                        List list = listArr3[i79];
                        int i80 = length6;
                        u2.r1 r1Var8 = r1Var7;
                        int i81 = 0;
                        while (true) {
                            if (i81 < list.size()) {
                                x2.q qVar3 = (x2.q) list.get(i81);
                                int i82 = i81;
                                if (qVar3.b().equals(a12) && qVar3.u(i78) != -1) {
                                    z19 = true;
                                    break;
                                }
                                i81 = i82 + 1;
                            }
                        }
                        i79++;
                        length6 = i80;
                        r1Var7 = r1Var8;
                    }
                    zArr[i78] = z19;
                    i78++;
                    r1Var7 = r1Var7;
                }
                g0Var2.c(new b2.v1(a12, z15, iArr19, zArr));
                i68++;
                listArr = listArr3;
                i66 = i73;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i66++;
        }
        u2.r1 r1Var9 = sVar.f52952f;
        for (int i83 = 0; i83 < r1Var9.f49993a; i83++) {
            b2.p1 a13 = r1Var9.a(i83);
            int[] iArr20 = new int[a13.f2187a];
            Arrays.fill(iArr20, 0);
            g0Var2.c(new b2.v1(a13, false, iArr20, new boolean[a13.f2187a]));
        }
        x2.u uVar2 = new x2.u((s1[]) create.first, (x2.q[]) create.second, new b2.w1(g0Var2.f()), sVar);
        for (int i84 = 0; i84 < uVar2.f52956a; i84++) {
            if (uVar2.b(i84)) {
                if (uVar2.f52958c[i84] == null && this.f8123j[i84].f7808b != -2) {
                    z14 = false;
                    t6.p(z14);
                }
                z14 = true;
                t6.p(z14);
            } else {
                if (uVar2.f52958c[i84] == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                t6.p(z13);
            }
        }
        for (x2.q qVar4 : uVar2.f52958c) {
            if (qVar4 != null) {
                qVar4.p(f7);
                qVar4.e(z10);
            }
        }
        return uVar2;
    }

    public final void k() {
        Object obj = this.f8117a;
        if (obj instanceof u2.d) {
            long j10 = this.f8121g.e;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.f49865f = 0L;
            dVar.h = j10;
        }
    }
}
