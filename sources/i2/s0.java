package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.r1;
import b2.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.f21;
import u2.q1;
import v7.y7;
public final class s0 {
    public final Object f10353a;
    public final Object f10354b;
    public final u2.d1[] f10355c;
    public boolean d;
    public boolean e;
    public boolean f10356f;
    public t0 f10357g;
    public boolean h;
    public final boolean[] f10358i;
    public final f[] f10359j;
    public final x2.u f10360k;
    public final e1 f10361l;
    public s0 f10362m;
    public q1 f10363n;
    public x2.v f10364o;
    public long f10365p;

    public s0(f[] fVarArr, long j3, x2.u uVar, y2.d dVar, e1 e1Var, t0 t0Var, x2.v vVar) {
        this.f10359j = fVarArr;
        this.f10365p = j3;
        this.f10360k = uVar;
        this.f10361l = e1Var;
        u2.g0 g0Var = t0Var.f10368a;
        this.f10354b = g0Var.f42324a;
        this.f10357g = t0Var;
        this.f10363n = q1.d;
        this.f10364o = vVar;
        this.f10355c = new u2.d1[fVarArr.length];
        this.f10358i = new boolean[fVarArr.length];
        long j10 = t0Var.f10369b;
        long j11 = t0Var.d;
        boolean z10 = t0Var.f10371f;
        e1Var.getClass();
        Object obj = g0Var.f42324a;
        int i10 = a.f10097g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.g0 a2 = g0Var.a(pair.second);
        d1 d1Var = (d1) e1Var.d.get(obj2);
        d1Var.getClass();
        e1Var.f10168g.add(d1Var);
        c1 c1Var = (c1) e1Var.f10167f.get(d1Var);
        if (c1Var != null) {
            c1Var.f10114a.f(c1Var.f10115b);
        }
        d1Var.f10124c.add(a2);
        u2.y c10 = d1Var.f10122a.c(a2, dVar, j10);
        e1Var.f10166c.put(c10, d1Var);
        e1Var.c();
        this.f10353a = j11 != -9223372036854775807L ? new u2.e(c10, !z10, 0L, j11) : c10;
    }

    public final long a(x2.v vVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= vVar.f44558a) {
                break;
            }
            if (z10 || !vVar.a(this.f10364o, i10)) {
                z12 = false;
            }
            this.f10358i[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            fVarArr = this.f10359j;
            int length = fVarArr.length;
            objArr = this.f10355c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].f10174b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f10364o = vVar;
        c();
        long o9 = this.f10353a.o(vVar.f44560c, this.f10358i, this.f10355c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].f10174b == -2 && this.f10364o.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f10356f = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                e2.d.g(vVar.b(i13));
                if (fVarArr[i13].f10174b != -2) {
                    this.f10356f = true;
                }
            } else {
                if (vVar.f44560c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.g(z11);
            }
        }
        return o9;
    }

    public final void b() {
        if (this.f10362m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f10364o;
                if (i10 < vVar.f44558a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f10364o.f44560c[i10];
                    if (b10 && rVar != null) {
                        rVar.j();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f10362m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f10364o;
                if (i10 < vVar.f44558a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f10364o.f44560c[i10];
                    if (b10 && rVar != null) {
                        rVar.g();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j3;
        if (!this.e) {
            return this.f10357g.f10369b;
        }
        if (this.f10356f) {
            j3 = this.f10353a.r();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f10357g.e;
        }
        return j3;
    }

    public final long e() {
        return this.f10357g.f10369b + this.f10365p;
    }

    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.e = true;
        this.f10363n = this.f10353a.q();
        x2.v j3 = j(f7, k1Var, z10);
        t0 t0Var = this.f10357g;
        long j10 = t0Var.f10369b;
        long j11 = t0Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.f10359j.length]);
        long j12 = this.f10365p;
        t0 t0Var2 = this.f10357g;
        this.f10365p = (t0Var2.f10369b - a2) + j12;
        this.f10357g = t0Var2.b(a2);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f10356f || this.f10353a.r() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.f10357g.f10369b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f10353a;
        try {
            boolean z10 = r02 instanceof u2.e;
            e1 e1Var = this.f10361l;
            if (z10) {
                e1Var.f(((u2.e) r02).f42312a);
            } else {
                e1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.f("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.v j(float f7, b2.k1 k1Var, boolean z10) {
        x2.i iVar;
        boolean z11;
        String str;
        String str2;
        Object obj;
        Pair j3;
        int[] iArr;
        Pair pair;
        String str3;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pair2;
        x2.r[] rVarArr;
        boolean z12;
        boolean z13;
        e9.a1 a1Var;
        x2.c bVar;
        e9.a1 i10;
        y2.c cVar;
        int i11;
        int[] iArr2;
        x2.t tVar;
        b2.l1 l1Var;
        int i12;
        b2.o1 o1Var;
        Object qVar;
        int i13;
        b2.o1 o1Var2;
        Context context;
        int[] iArr3;
        x2.u uVar = this.f10360k;
        f[] fVarArr = this.f10359j;
        q1 q1Var = this.f10363n;
        uVar.getClass();
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length];
        int[][][] iArr5 = new int[fVarArr.length + 1][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = q1Var.f42436a;
            l1VarArr[i14] = new b2.l1[i15];
            iArr5[i14] = new int[i15];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr6[i16] = fVarArr[i16].B();
        }
        int i17 = 0;
        while (i17 < q1Var.f42436a) {
            b2.l1 a2 = q1Var.a(i17);
            boolean z14 = a2.f1786c == 5;
            int length3 = fVarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z15 = true;
            while (i19 < fVarArr.length) {
                f fVar = fVarArr[i19];
                x2.u uVar2 = uVar;
                q1 q1Var2 = q1Var;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.f1784a; i21++) {
                    i20 = Math.max(i20, fVar.A(a2.d[i21]) & 7);
                }
                boolean z16 = iArr4[i19] == 0;
                if (i20 > i18 || (i20 == i18 && z14 && !z15 && z16)) {
                    i18 = i20;
                    z15 = z16;
                    length3 = i19;
                }
                i19++;
                uVar = uVar2;
                q1Var = q1Var2;
            }
            x2.u uVar3 = uVar;
            q1 q1Var3 = q1Var;
            if (length3 == fVarArr.length) {
                iArr3 = new int[a2.f1784a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr7 = new int[a2.f1784a];
                for (int i22 = 0; i22 < a2.f1784a; i22++) {
                    iArr7[i22] = fVar2.A(a2.d[i22]);
                }
                iArr3 = iArr7;
            }
            int i23 = iArr4[length3];
            l1VarArr[length3][i23] = a2;
            iArr5[length3][i23] = iArr3;
            iArr4[length3] = i23 + 1;
            i17++;
            uVar = uVar3;
            q1Var = q1Var3;
        }
        x2.u uVar4 = uVar;
        q1[] q1VarArr = new q1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i24 = 0; i24 < fVarArr.length; i24++) {
            int i25 = iArr4[i24];
            q1VarArr[i24] = new q1((b2.l1[]) e2.d0.S(i25, l1VarArr[i24]));
            iArr5[i24] = (int[][]) e2.d0.S(i25, iArr5[i24]);
            strArr[i24] = fVarArr[i24].j();
            iArr8[i24] = fVarArr[i24].f10174b;
        }
        x2.t tVar2 = new x2.t(iArr8, q1VarArr, iArr6, iArr5, new q1((b2.l1[]) e2.d0.S(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.p pVar = (x2.p) uVar4;
        synchronized (pVar.d) {
            pVar.h = Thread.currentThread();
            iVar = pVar.f44545g;
        }
        if (pVar.f44548k == null && (context = pVar.e) != null) {
            pVar.f44548k = Boolean.valueOf(e2.d0.N(context));
        }
        if (iVar.f44518s0 && Build.VERSION.SDK_INT >= 32 && pVar.f44546i == null) {
            pVar.f44546i = new x2.k(pVar.e, pVar, pVar.f44548k);
        }
        int i26 = tVar2.f44551a;
        Context context2 = pVar.e;
        x2.q[] qVarArr = new x2.q[i26];
        int i27 = 0;
        while (true) {
            if (i27 >= tVar2.f44551a) {
                z11 = false;
                break;
            } else if (2 == iArr8[i27] && q1VarArr[i27].f42436a > 0) {
                z11 = true;
                break;
            } else {
                i27++;
            }
        }
        Pair j10 = x2.p.j(1, tVar2, iArr5, new ca.b(pVar, iVar, z11, iArr6, 7), new sg.p(7));
        if (j10 != null) {
            qVarArr[((Integer) j10.second).intValue()] = (x2.q) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.q qVar2 = (x2.q) j10.first;
            str = qVar2.f44549a.d[qVar2.f44550b[0]].d;
        }
        b2.o1 o1Var3 = iVar.f1928u;
        if (o1Var3.f1865a == 2) {
            str2 = str;
            j3 = null;
            obj = null;
        } else {
            a1.d dVar = new a1.d(iVar, str, iArr6, (!iVar.f1918k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            obj = null;
            j3 = x2.p.j(2, tVar2, iArr5, dVar, new sg.p(6));
        }
        int i28 = 4;
        if ((iVar.A || j3 == null) && o1Var3.f1865a != 2) {
            iArr = iArr8;
            pair = x2.p.j(4, tVar2, iArr5, new th.e(iVar, 7), new sg.p(5));
        } else {
            iArr = iArr8;
            pair = obj;
        }
        if (pair != 0) {
            qVarArr[((Integer) pair.second).intValue()] = (x2.q) pair.first;
        } else if (j3 != null) {
            qVarArr[((Integer) j3.second).intValue()] = (x2.q) j3.first;
        }
        int i29 = 3;
        if (o1Var3.f1865a == 2) {
            pair2 = obj;
        } else {
            if (!iVar.f1930x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = obj;
            } else {
                String str4 = e2.d0.f7188a;
                str3 = locale.toLanguageTag();
            }
            pair2 = x2.p.j(3, tVar2, iArr5, new f21(iVar, str2, str3, 8), new sg.p(8));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i30 = 0;
        while (i30 < i26) {
            int i31 = iArr[i30];
            if (i31 == 2 || i31 == 1 || i31 == i29 || i31 == i28) {
                i12 = i30;
                o1Var = o1Var3;
            } else {
                q1 q1Var4 = q1VarArr[i30];
                int[][] iArr9 = iArr5[i30];
                if (o1Var3.f1865a == 2) {
                    i12 = i30;
                    o1Var = o1Var3;
                } else {
                    b2.l1 l1Var2 = obj;
                    b2.l1 l1Var3 = l1Var2;
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < q1Var4.f42436a) {
                        b2.l1 a10 = q1Var4.a(i32);
                        int[] iArr10 = iArr9[i32];
                        b2.l1 l1Var4 = l1Var2;
                        q1 q1Var5 = q1Var4;
                        x2.g gVar = l1Var3;
                        int i34 = i30;
                        int i35 = 0;
                        while (i35 < a10.f1784a) {
                            int i36 = i35;
                            if (hc.b.e(iArr10[i35], iVar.f44519t0)) {
                                i13 = i32;
                                x2.g gVar2 = new x2.g(a10.d[i36], iArr10[i36]);
                                if (gVar != 0) {
                                    o1Var2 = o1Var3;
                                    if (e9.z.f7446a.c(gVar2.f44510b, gVar.f44510b).c(gVar2.f44509a, gVar.f44509a).e() <= 0) {
                                    }
                                } else {
                                    o1Var2 = o1Var3;
                                }
                                gVar = gVar2;
                                l1Var4 = a10;
                                i33 = i36;
                            } else {
                                i13 = i32;
                                o1Var2 = o1Var3;
                            }
                            i35 = i36 + 1;
                            i32 = i13;
                            o1Var3 = o1Var2;
                            gVar = gVar;
                        }
                        i32++;
                        i30 = i34;
                        q1Var4 = q1Var5;
                        l1Var3 = gVar;
                        l1Var2 = l1Var4;
                    }
                    i12 = i30;
                    o1Var = o1Var3;
                    if (l1Var2 != null) {
                        qVar = new x2.q(l1Var2, i33);
                        qVarArr[i12] = qVar;
                    }
                }
                qVar = obj;
                qVarArr[i12] = qVar;
            }
            i30 = i12 + 1;
            o1Var3 = o1Var;
            i29 = 3;
            i28 = 4;
        }
        int i37 = tVar2.f44551a;
        q1[] q1VarArr2 = tVar2.f44553c;
        HashMap hashMap = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            x2.p.c(q1VarArr2[i38], iVar, hashMap);
        }
        x2.p.c(tVar2.f44554f, iVar, hashMap);
        for (int i39 = 0; i39 < i37; i39++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.f44552b[i39]));
            if (m1Var != null) {
                b2.l1 l1Var5 = m1Var.f1811a;
                e9.i0 i0Var = m1Var.f1812b;
                qVarArr[i39] = (i0Var.isEmpty() || q1VarArr2[i39].b(l1Var5) == -1) ? obj : new x2.q(l1Var5, y7.f(i0Var));
            }
        }
        int i40 = tVar2.f44551a;
        for (int i41 = 0; i41 < i40; i41++) {
            q1 q1Var6 = tVar2.f44553c[i41];
            Map map = (Map) iVar.f44521v0.get(i41);
            if (map != null && map.containsKey(q1Var6)) {
                Map map2 = (Map) iVar.f44521v0.get(i41);
                if (map2 != null && map2.get(q1Var6) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i41] = obj;
            }
        }
        for (int i42 = 0; i42 < i26; i42++) {
            int i43 = tVar2.f44552b[i42];
            if (iVar.f44522w0.get(i42) || iVar.E.contains(Integer.valueOf(i43))) {
                qVarArr[i42] = obj;
            }
        }
        t7.u uVar5 = pVar.f44544f;
        y2.c cVar2 = pVar.f44556b;
        e2.d.h(cVar2);
        uVar5.getClass();
        ArrayList arrayList = new ArrayList();
        int i44 = 0;
        b2.l1 l1Var6 = obj;
        while (i44 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i44];
            if (qVar3 != 0 && qVar3.f44550b.length > 1) {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var = l1Var6;
            } else {
                l1Var = l1Var6;
                arrayList.add(l1Var);
            }
            i44++;
            l1Var6 = l1Var;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4];
        int i45 = 0;
        while (i45 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i45];
            if (qVar4 == 0) {
                jArr[i45] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr11 = qVar4.f44550b;
                jArr[i45] = new long[iArr11.length];
                int i46 = 0;
                while (i46 < iArr11.length) {
                    x2.t tVar3 = tVar2;
                    long j11 = qVar4.f44549a.d[iArr11[i46]].f1994j;
                    long[] jArr2 = jArr[i45];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i46] = j11;
                    i46++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i45]);
            }
            i45++;
            tVar2 = tVar;
        }
        x2.t tVar4 = tVar2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.f7443b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f7441f = u0Var;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr5 = jArr[i48];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i11 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i49 = 0;
                while (true) {
                    long[] jArr6 = jArr[i48];
                    i11 = length4;
                    double d = 0.0d;
                    if (i49 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr6[i49];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i49] = d;
                    i49++;
                    length4 = i11;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i50 = length5 - 1;
                double d10 = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d11 = dArr[i51];
                    int i52 = i51 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i52]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i48);
                    double d12 = d10;
                    Map map3 = v0Var.d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        Collection c10 = v0Var.c();
                        if (c10.add(valueOf2)) {
                            v0Var.e++;
                            map3.put(valueOf, c10);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        v0Var.e++;
                    }
                    i51 = i52;
                    d10 = d12;
                }
                continue;
            }
            i48++;
            length4 = i11;
            iArr12 = iArr2;
            cVar2 = cVar;
        }
        y2.c cVar3 = cVar2;
        int[] iArr14 = iArr12;
        e9.n nVar = v0Var.f7409b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.f7409b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i53 = 0; i53 < v.size(); i53++) {
            int intValue = ((Integer) v.get(i53)).intValue();
            int i54 = iArr14[intValue] + 1;
            iArr14[intValue] = i54;
            jArr3[intValue] = jArr[intValue][i54];
            x2.b.v(arrayList, jArr3);
        }
        for (int i55 = 0; i55 < qVarArr.length; i55++) {
            if (arrayList.get(i55) != null) {
                jArr3[i55] = jArr3[i55] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i56 = 0; i56 < arrayList.size(); i56++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i56);
            if (f0Var == null) {
                i10 = e9.a1.e;
            } else {
                i10 = f0Var.i();
            }
            u11.b(i10);
        }
        e9.a1 i57 = u11.i();
        x2.r[] rVarArr2 = new x2.r[qVarArr.length];
        for (int i58 = 0; i58 < qVarArr.length; i58++) {
            x2.q qVar5 = qVarArr[i58];
            if (qVar5 != 0) {
                int[] iArr15 = qVar5.f44550b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.c(qVar5.f44549a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.f44549a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i57.get(i58));
                    }
                    rVarArr2[i58] = bVar;
                }
            }
        }
        l1[] l1VarArr2 = new l1[i26];
        int i59 = 0;
        while (i59 < i26) {
            x2.t tVar5 = tVar4;
            l1VarArr2[i59] = (iVar.f44522w0.get(i59) || iVar.E.contains(Integer.valueOf(tVar5.f44552b[i59])) || (tVar5.f44552b[i59] != -2 && rVarArr2[i59] == null)) ? null : l1.f10267c;
            i59++;
            tVar4 = tVar5;
        }
        x2.t tVar6 = tVar4;
        if (iVar.f1928u.f1865a != 0) {
            int i60 = 0;
            int i61 = 0;
            int i62 = -1;
            while (true) {
                if (i60 < tVar6.f44551a) {
                    int i63 = tVar6.f44552b[i60];
                    x2.r rVar = rVarArr2[i60];
                    if (i63 != 1 && rVar != null) {
                        break;
                    }
                    if (i63 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr5[i60][tVar6.f44553c[i60].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i61++;
                            i62 = i60;
                        }
                    }
                    i60++;
                } else if (i61 == 1) {
                    int i64 = iVar.f1928u.f1866b ? 1 : 2;
                    l1 l1Var7 = l1VarArr2[i62];
                    l1VarArr2[i62] = new l1(i64, l1Var7 != null && l1Var7.f10269b);
                }
            }
        }
        Pair create = Pair.create(l1VarArr2, rVarArr2);
        x2.r[] rVarArr3 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr3.length];
        for (int i65 = 0; i65 < rVarArr3.length; i65++) {
            x2.r rVar2 = rVarArr3[i65];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.f7384b;
                a1Var = e9.a1.e;
            }
            listArr[i65] = a1Var;
        }
        ?? wVar = new com.google.android.gms.common.api.internal.w(4);
        int i66 = 0;
        while (true) {
            int i67 = tVar6.f44551a;
            q1[] q1VarArr3 = tVar6.f44553c;
            if (i66 >= i67) {
                break;
            }
            q1 q1Var7 = q1VarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < q1Var7.f42436a) {
                b2.l1 a11 = q1Var7.a(i68);
                int i69 = q1VarArr3[i66].a(i68).f1784a;
                int[] iArr16 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((tVar6.e[i66][i68][i70] & 7) == 4) {
                        iArr16[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i71);
                int i72 = i66;
                String str5 = null;
                int i73 = 0;
                boolean z17 = false;
                int i74 = 0;
                int i75 = 16;
                while (i73 < copyOf.length) {
                    String str6 = q1VarArr3[i72].a(i68).d[copyOf[i73]].f2002r;
                    int i76 = i74 + 1;
                    if (i74 == 0) {
                        str5 = str6;
                    } else {
                        z17 = (!Objects.equals(str5, str6)) | z17;
                    }
                    i75 = Math.min(i75, tVar6.e[i72][i68][i73] & 24);
                    i73++;
                    i74 = i76;
                }
                if (z17) {
                    i75 = Math.min(i75, tVar6.d[i72]);
                }
                boolean z18 = i75 != 0;
                int i77 = a11.f1784a;
                int[] iArr17 = new int[i77];
                boolean[] zArr = new boolean[i77];
                for (int i78 = 0; i78 < a11.f1784a; i78++) {
                    iArr17[i78] = tVar6.e[i72][i68][i78] & 7;
                    int i79 = 0;
                    while (true) {
                        if (i79 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.r rVar3 = (x2.r) list.get(i79);
                        if (rVar3.b().equals(a11) && rVar3.u(i78) != -1) {
                            z13 = true;
                            break;
                        }
                        i79++;
                    }
                    zArr[i78] = z13;
                }
                wVar.b(new r1(a11, z18, iArr17, zArr));
                i68++;
                listArr = listArr3;
                i66 = i72;
            }
            i66++;
        }
        q1 q1Var8 = tVar6.f44554f;
        for (int i80 = 0; i80 < q1Var8.f42436a; i80++) {
            b2.l1 a12 = q1Var8.a(i80);
            int[] iArr18 = new int[a12.f1784a];
            Arrays.fill(iArr18, 0);
            wVar.b(new r1(a12, false, iArr18, new boolean[a12.f1784a]));
        }
        x2.v vVar = new x2.v((l1[]) create.first, (x2.r[]) create.second, new s1(wVar.i()), tVar6);
        for (int i81 = 0; i81 < vVar.f44558a; i81++) {
            if (vVar.b(i81)) {
                if (vVar.f44560c[i81] == null && this.f10359j[i81].f10174b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.f44560c[i81] == null);
            }
        }
        for (x2.r rVar4 : vVar.f44560c) {
            if (rVar4 != null) {
                rVar4.p(f7);
                rVar4.e(z10);
            }
        }
        return vVar;
    }

    public final void k() {
        Object obj = this.f10353a;
        if (obj instanceof u2.e) {
            long j3 = this.f10357g.d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            u2.e eVar = (u2.e) obj;
            eVar.e = 0L;
            eVar.f42315f = j3;
        }
    }
}
