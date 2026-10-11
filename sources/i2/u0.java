package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
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
import org.telegram.ui.Components.sz;
import org.telegram.ui.lb1;
import v7.v7;
public final class u0 {
    public final Object f11891a;
    public final Object f11892b;
    public final u2.a1[] f11893c;
    public boolean d;
    public boolean f11894e;
    public boolean f11895f;
    public v0 f11896g;
    public boolean h;
    public final boolean[] f11897i;
    public final f[] f11898j;
    public final x2.u f11899k;
    public final g1 f11900l;
    public u0 f11901m;
    public u2.n1 f11902n;
    public x2.v f11903o;
    public long f11904p;

    public u0(f[] fVarArr, long j3, x2.u uVar, y2.d dVar, g1 g1Var, v0 v0Var, x2.v vVar) {
        this.f11898j = fVarArr;
        this.f11904p = j3;
        this.f11899k = uVar;
        this.f11900l = g1Var;
        u2.f0 f0Var = v0Var.f11907a;
        this.f11892b = f0Var.f48674a;
        this.f11896g = v0Var;
        this.f11902n = u2.n1.d;
        this.f11903o = vVar;
        this.f11893c = new u2.a1[fVarArr.length];
        this.f11897i = new boolean[fVarArr.length];
        long j10 = v0Var.f11908b;
        long j11 = v0Var.d;
        boolean z10 = v0Var.f11911f;
        g1Var.getClass();
        Object obj = f0Var.f48674a;
        int i10 = a.f11599g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.f0 a2 = f0Var.a(pair.second);
        f1 f1Var = (f1) g1Var.d.get(obj2);
        f1Var.getClass();
        g1Var.f11711g.add(f1Var);
        e1 e1Var = (e1) g1Var.f11710f.get(f1Var);
        if (e1Var != null) {
            e1Var.f11640a.f(e1Var.f11641b);
        }
        f1Var.f11691c.add(a2);
        u2.x c10 = f1Var.f11689a.c(a2, dVar, j10);
        g1Var.f11708c.put(c10, f1Var);
        g1Var.c();
        this.f11891a = j11 != -9223372036854775807L ? new u2.d(c10, !z10, 0L, j11) : c10;
    }

    public final long a(x2.v vVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= vVar.f50666a) {
                break;
            }
            if (z10 || !vVar.a(this.f11903o, i10)) {
                z12 = false;
            }
            this.f11897i[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            fVarArr = this.f11898j;
            int length = fVarArr.length;
            objArr = this.f11893c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].f11644b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f11903o = vVar;
        c();
        long o9 = this.f11891a.o(vVar.f50668c, this.f11897i, this.f11893c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].f11644b == -2 && this.f11903o.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f11895f = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                e2.d.g(vVar.b(i13));
                if (fVarArr[i13].f11644b != -2) {
                    this.f11895f = true;
                }
            } else {
                if (vVar.f50668c[i13] == null) {
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
        if (this.f11901m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f11903o;
                if (i10 < vVar.f50666a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f11903o.f50668c[i10];
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
        if (this.f11901m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f11903o;
                if (i10 < vVar.f50666a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f11903o.f50668c[i10];
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
        if (!this.f11894e) {
            return this.f11896g.f11908b;
        }
        if (this.f11895f) {
            j3 = this.f11891a.q();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f11896g.f11910e;
        }
        return j3;
    }

    public final long e() {
        return this.f11896g.f11908b + this.f11904p;
    }

    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.f11894e = true;
        this.f11902n = this.f11891a.p();
        x2.v j3 = j(f7, k1Var, z10);
        v0 v0Var = this.f11896g;
        long j10 = v0Var.f11908b;
        long j11 = v0Var.f11910e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.f11898j.length]);
        long j12 = this.f11904p;
        v0 v0Var2 = this.f11896g;
        this.f11904p = (v0Var2.f11908b - a2) + j12;
        this.f11896g = v0Var2.b(a2);
    }

    public final boolean g() {
        if (this.f11894e) {
            if (!this.f11895f || this.f11891a.q() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.f11894e) {
            if (g() || d() - this.f11896g.f11908b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f11891a;
        try {
            boolean z10 = r02 instanceof u2.d;
            g1 g1Var = this.f11900l;
            if (z10) {
                g1Var.f(((u2.d) r02).f48656a);
            } else {
                g1Var.f(r02);
            }
        } catch (RuntimeException e7) {
            e2.a.f("MediaPeriodHolder", "Period release failed.", e7);
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
        int i14;
        Context context;
        int[] iArr3;
        x2.u uVar = this.f11899k;
        f[] fVarArr = this.f11898j;
        u2.n1 n1Var = this.f11902n;
        uVar.getClass();
        int i15 = 1;
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length];
        int[][][] iArr5 = new int[fVarArr.length + 1][];
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = n1Var.f48772a;
            l1VarArr[i16] = new b2.l1[i17];
            iArr5[i16] = new int[i17];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i18 = 0; i18 < length2; i18++) {
            iArr6[i18] = fVarArr[i18].B();
        }
        int i19 = 0;
        while (i19 < n1Var.f48772a) {
            b2.l1 a2 = n1Var.a(i19);
            int i20 = a2.f3417c == 5 ? i15 : 0;
            int length3 = fVarArr.length;
            int i21 = i15;
            int i22 = 0;
            int i23 = 0;
            while (i22 < fVarArr.length) {
                f fVar = fVarArr[i22];
                x2.u uVar2 = uVar;
                u2.n1 n1Var2 = n1Var;
                int i24 = i15;
                int i25 = 0;
                for (int i26 = 0; i26 < a2.f3415a; i26++) {
                    i25 = Math.max(i25, fVar.A(a2.d[i26]) & 7);
                }
                int i27 = iArr4[i22] == 0 ? i24 : 0;
                if (i25 > i23 || (i25 == i23 && i20 != 0 && i21 == 0 && i27 != 0)) {
                    i23 = i25;
                    i21 = i27;
                    length3 = i22;
                }
                i22++;
                uVar = uVar2;
                n1Var = n1Var2;
                i15 = i24;
            }
            x2.u uVar3 = uVar;
            u2.n1 n1Var3 = n1Var;
            int i28 = i15;
            if (length3 == fVarArr.length) {
                iArr3 = new int[a2.f3415a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr7 = new int[a2.f3415a];
                for (int i29 = 0; i29 < a2.f3415a; i29++) {
                    iArr7[i29] = fVar2.A(a2.d[i29]);
                }
                iArr3 = iArr7;
            }
            int i30 = iArr4[length3];
            l1VarArr[length3][i30] = a2;
            iArr5[length3][i30] = iArr3;
            iArr4[length3] = i30 + 1;
            i19++;
            uVar = uVar3;
            n1Var = n1Var3;
            i15 = i28;
        }
        x2.u uVar4 = uVar;
        int i31 = i15;
        int i32 = 0;
        u2.n1[] n1VarArr = new u2.n1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i33 = 0; i33 < fVarArr.length; i33++) {
            int i34 = iArr4[i33];
            n1VarArr[i33] = new u2.n1((b2.l1[]) e2.d0.R(i34, l1VarArr[i33]));
            iArr5[i33] = (int[][]) e2.d0.R(i34, iArr5[i33]);
            strArr[i33] = fVarArr[i33].j();
            iArr8[i33] = fVarArr[i33].f11644b;
        }
        x2.t tVar2 = new x2.t(iArr8, n1VarArr, iArr6, iArr5, new u2.n1((b2.l1[]) e2.d0.R(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.p pVar = (x2.p) uVar4;
        synchronized (pVar.d) {
            pVar.h = Thread.currentThread();
            iVar = pVar.f50652g;
        }
        if (pVar.f50655k == null && (context = pVar.f50650e) != null) {
            pVar.f50655k = Boolean.valueOf(e2.d0.M(context));
        }
        if (iVar.f50622s0 && Build.VERSION.SDK_INT >= 32 && pVar.f50653i == null) {
            pVar.f50653i = new x2.k(pVar.f50650e, pVar, pVar.f50655k);
        }
        int i35 = tVar2.f50658a;
        Context context2 = pVar.f50650e;
        x2.q[] qVarArr = new x2.q[i35];
        int i36 = 0;
        while (true) {
            if (i36 >= tVar2.f50658a) {
                z11 = 0;
                break;
            } else if (2 == iArr8[i36] && n1VarArr[i36].f48772a > 0) {
                z11 = i31;
                break;
            } else {
                i36++;
            }
        }
        Pair j10 = x2.p.j(i31, tVar2, iArr5, new ca.b(pVar, iVar, z11, iArr6, 7), new lb1(16));
        if (j10 != null) {
            qVarArr[((Integer) j10.second).intValue()] = (x2.q) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.q qVar2 = (x2.q) j10.first;
            str = qVar2.f50656a.d[qVar2.f50657b[0]].d;
        }
        b2.o1 o1Var2 = iVar.f3566u;
        if (o1Var2.f3501a == 2) {
            str2 = str;
            j3 = null;
            obj = null;
        } else {
            a1.d dVar = new a1.d(iVar, str, iArr6, (!iVar.f3556k || context2 == null) ? null : e2.d0.v(context2), 20);
            str2 = str;
            obj = null;
            j3 = x2.p.j(2, tVar2, iArr5, dVar, new lb1(15));
        }
        int i37 = 4;
        if ((iVar.A || j3 == null) && o1Var2.f3501a != 2) {
            iArr = iArr8;
            pair = x2.p.j(4, tVar2, iArr5, new r5.d(iVar, 13), new lb1(14));
        } else {
            iArr = iArr8;
            pair = obj;
        }
        if (pair != 0) {
            qVarArr[((Integer) pair.second).intValue()] = (x2.q) pair.first;
        } else if (j3 != null) {
            qVarArr[((Integer) j3.second).intValue()] = (x2.q) j3.first;
        }
        int i38 = 3;
        if (o1Var2.f3501a == 2) {
            pair2 = obj;
        } else {
            if (!iVar.f3568x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = obj;
            } else {
                String str4 = e2.d0.f8531a;
                str3 = locale.toLanguageTag();
            }
            pair2 = x2.p.j(3, tVar2, iArr5, new sz(iVar, str2, str3, 12), new lb1(17));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i39 = 0;
        while (i39 < i35) {
            int i40 = iArr[i39];
            if (i40 == 2 || i40 == 1 || i40 == i38 || i40 == i37) {
                i12 = i39;
                o1Var = o1Var2;
            } else {
                u2.n1 n1Var4 = n1VarArr[i39];
                int[][] iArr9 = iArr5[i39];
                if (o1Var2.f3501a == 2) {
                    i12 = i39;
                    o1Var = o1Var2;
                } else {
                    int i41 = 0;
                    int i42 = 0;
                    b2.l1 l1Var2 = obj;
                    b2.l1 l1Var3 = l1Var2;
                    while (i41 < n1Var4.f48772a) {
                        b2.l1 a10 = n1Var4.a(i41);
                        int[] iArr10 = iArr9[i41];
                        int i43 = i39;
                        b2.o1 o1Var3 = o1Var2;
                        x2.g gVar = l1Var3;
                        int i44 = i42;
                        b2.l1 l1Var4 = l1Var2;
                        int i45 = 0;
                        while (i45 < a10.f3415a) {
                            u2.n1 n1Var5 = n1Var4;
                            if (hg.c.d(iArr10[i45], iVar.f50623t0)) {
                                i13 = i45;
                                x2.g gVar2 = new x2.g(a10.d[i45], iArr10[i13]);
                                if (gVar != 0) {
                                    i14 = i41;
                                    if (e9.z.f8819a.c(gVar2.f50614b, gVar.f50614b).c(gVar2.f50613a, gVar.f50613a).e() <= 0) {
                                    }
                                } else {
                                    i14 = i41;
                                }
                                gVar = gVar2;
                                l1Var4 = a10;
                                i44 = i13;
                            } else {
                                i13 = i45;
                                i14 = i41;
                            }
                            i45 = i13 + 1;
                            n1Var4 = n1Var5;
                            i41 = i14;
                            gVar = gVar;
                        }
                        i41++;
                        l1Var2 = l1Var4;
                        i42 = i44;
                        o1Var2 = o1Var3;
                        l1Var3 = gVar;
                        i39 = i43;
                    }
                    i12 = i39;
                    o1Var = o1Var2;
                    if (l1Var2 != null) {
                        qVar = new x2.q(l1Var2, i42);
                        qVarArr[i12] = qVar;
                    }
                }
                qVar = obj;
                qVarArr[i12] = qVar;
            }
            i39 = i12 + 1;
            o1Var2 = o1Var;
            i38 = 3;
            i37 = 4;
        }
        int i46 = tVar2.f50658a;
        u2.n1[] n1VarArr2 = tVar2.f50660c;
        HashMap hashMap = new HashMap();
        for (int i47 = 0; i47 < i46; i47++) {
            x2.p.c(n1VarArr2[i47], iVar, hashMap);
        }
        x2.p.c(tVar2.f50662f, iVar, hashMap);
        for (int i48 = 0; i48 < i46; i48++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.f50659b[i48]));
            if (m1Var != null) {
                b2.l1 l1Var5 = m1Var.f3444a;
                e9.i0 i0Var = m1Var.f3445b;
                qVarArr[i48] = (i0Var.isEmpty() || n1VarArr2[i48].b(l1Var5) == -1) ? obj : new x2.q(l1Var5, v7.f(i0Var));
            }
        }
        int i49 = tVar2.f50658a;
        for (int i50 = 0; i50 < i49; i50++) {
            u2.n1 n1Var6 = tVar2.f50660c[i50];
            Map map = (Map) iVar.f50625v0.get(i50);
            if (map != null && map.containsKey(n1Var6)) {
                Map map2 = (Map) iVar.f50625v0.get(i50);
                if (map2 != null && map2.get(n1Var6) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i50] = obj;
            }
        }
        for (int i51 = 0; i51 < i35; i51++) {
            int i52 = tVar2.f50659b[i51];
            if (iVar.f50626w0.get(i51) || iVar.E.contains(Integer.valueOf(i52))) {
                qVarArr[i51] = obj;
            }
        }
        t7.t tVar3 = pVar.f50651f;
        y2.c cVar2 = pVar.f50664b;
        e2.d.h(cVar2);
        tVar3.getClass();
        ArrayList arrayList = new ArrayList();
        int i53 = 0;
        b2.l1 l1Var6 = obj;
        while (i53 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i53];
            if (qVar3 != 0 && qVar3.f50657b.length > 1) {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var = l1Var6;
            } else {
                l1Var = l1Var6;
                arrayList.add(l1Var);
            }
            i53++;
            l1Var6 = l1Var;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4];
        int i54 = 0;
        while (i54 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i54];
            if (qVar4 == 0) {
                jArr[i54] = new long[i32];
                tVar = tVar2;
            } else {
                int[] iArr11 = qVar4.f50657b;
                jArr[i54] = new long[iArr11.length];
                int i55 = 0;
                while (i55 < iArr11.length) {
                    x2.t tVar4 = tVar2;
                    long j11 = qVar4.f50656a.d[iArr11[i55]].f3635j;
                    long[] jArr2 = jArr[i54];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i55] = j11;
                    i55++;
                    tVar2 = tVar4;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i54]);
            }
            i54++;
            tVar2 = tVar;
            i32 = 0;
        }
        x2.t tVar5 = tVar2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i56 = 0; i56 < length4; i56++) {
            long[] jArr4 = jArr[i56];
            jArr3[i56] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.f8816b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f8814f = u0Var;
        int i57 = 0;
        while (i57 < length4) {
            long[] jArr5 = jArr[i57];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i11 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i58 = 0;
                while (true) {
                    long[] jArr6 = jArr[i57];
                    i11 = length4;
                    double d = 0.0d;
                    if (i58 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr6[i58];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i58] = d;
                    i58++;
                    length4 = i11;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i59 = length5 - 1;
                double d10 = dArr[i59] - dArr[0];
                int i60 = 0;
                while (i60 < i59) {
                    double d11 = dArr[i60];
                    int i61 = i60 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i61]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i57);
                    double d12 = d10;
                    Map map3 = v0Var.d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        Collection c10 = v0Var.c();
                        if (c10.add(valueOf2)) {
                            v0Var.f8813e++;
                            map3.put(valueOf, c10);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        v0Var.f8813e++;
                    }
                    i60 = i61;
                    d10 = d12;
                }
                continue;
            }
            i57++;
            length4 = i11;
            cVar2 = cVar;
            iArr12 = iArr2;
        }
        y2.c cVar3 = cVar2;
        int[] iArr14 = iArr12;
        e9.n nVar = v0Var.f8779b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.f8779b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i62 = 0; i62 < v.size(); i62++) {
            int intValue = ((Integer) v.get(i62)).intValue();
            int i63 = iArr14[intValue] + 1;
            iArr14[intValue] = i63;
            jArr3[intValue] = jArr[intValue][i63];
            x2.b.v(arrayList, jArr3);
        }
        for (int i64 = 0; i64 < qVarArr.length; i64++) {
            if (arrayList.get(i64) != null) {
                jArr3[i64] = jArr3[i64] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i65 = 0; i65 < arrayList.size(); i65++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i65);
            if (f0Var == null) {
                i10 = e9.a1.f8714e;
            } else {
                i10 = f0Var.i();
            }
            u11.b(i10);
        }
        e9.a1 i66 = u11.i();
        x2.r[] rVarArr2 = new x2.r[qVarArr.length];
        for (int i67 = 0; i67 < qVarArr.length; i67++) {
            x2.q qVar5 = qVarArr[i67];
            if (qVar5 != 0) {
                int[] iArr15 = qVar5.f50657b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.c(qVar5.f50656a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.f50656a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i66.get(i67));
                    }
                    rVarArr2[i67] = bVar;
                }
            }
        }
        n1[] n1VarArr3 = new n1[i35];
        int i68 = 0;
        while (i68 < i35) {
            x2.t tVar6 = tVar5;
            n1VarArr3[i68] = (iVar.f50626w0.get(i68) || iVar.E.contains(Integer.valueOf(tVar6.f50659b[i68])) || (tVar6.f50659b[i68] != -2 && rVarArr2[i68] == null)) ? null : n1.f11801c;
            i68++;
            tVar5 = tVar6;
        }
        x2.t tVar7 = tVar5;
        if (iVar.f3566u.f3501a != 0) {
            int i69 = 0;
            int i70 = -1;
            int i71 = 0;
            while (true) {
                if (i71 < tVar7.f50658a) {
                    int i72 = tVar7.f50659b[i71];
                    x2.r rVar = rVarArr2[i71];
                    if (i72 != 1 && rVar != null) {
                        break;
                    }
                    if (i72 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr5[i71][tVar7.f50660c[i71].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i69++;
                            i70 = i71;
                        }
                    }
                    i71++;
                } else if (i69 == 1) {
                    int i73 = iVar.f3566u.f3502b ? 1 : 2;
                    n1 n1Var7 = n1VarArr3[i70];
                    n1VarArr3[i70] = new n1(i73, n1Var7 != null && n1Var7.f11803b);
                }
            }
        }
        Pair create = Pair.create(n1VarArr3, rVarArr2);
        x2.r[] rVarArr3 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr3.length];
        for (int i74 = 0; i74 < rVarArr3.length; i74++) {
            x2.r rVar2 = rVarArr3[i74];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.f8751b;
                a1Var = e9.a1.f8714e;
            }
            listArr[i74] = a1Var;
        }
        ?? wVar = new com.google.android.gms.common.api.internal.w(4);
        int i75 = 0;
        while (true) {
            int i76 = tVar7.f50658a;
            u2.n1[] n1VarArr4 = tVar7.f50660c;
            if (i75 >= i76) {
                break;
            }
            u2.n1 n1Var8 = n1VarArr4[i75];
            List list = listArr[i75];
            int i77 = 0;
            while (i77 < n1Var8.f48772a) {
                b2.l1 a11 = n1Var8.a(i77);
                int i78 = n1VarArr4[i75].a(i77).f3415a;
                int[] iArr16 = new int[i78];
                int i79 = 0;
                int i80 = 0;
                while (i79 < i78) {
                    List[] listArr2 = listArr;
                    if ((tVar7.f50661e[i75][i77][i79] & 7) == 4) {
                        iArr16[i80] = i79;
                        i80++;
                    }
                    i79++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i80);
                u2.n1 n1Var9 = n1Var8;
                String str5 = null;
                int i81 = 0;
                boolean z14 = false;
                int i82 = 0;
                int i83 = 16;
                while (i81 < copyOf.length) {
                    String str6 = n1VarArr4[i75].a(i77).d[copyOf[i81]].f3643r;
                    int i84 = i82 + 1;
                    if (i82 == 0) {
                        str5 = str6;
                    } else {
                        z14 = (!Objects.equals(str5, str6)) | z14;
                    }
                    i83 = Math.min(i83, tVar7.f50661e[i75][i77][i81] & 24);
                    i81++;
                    i82 = i84;
                }
                if (z14) {
                    i83 = Math.min(i83, tVar7.d[i75]);
                }
                boolean z15 = i83 != 0;
                int i85 = a11.f3415a;
                int[] iArr17 = new int[i85];
                boolean[] zArr = new boolean[i85];
                for (int i86 = 0; i86 < a11.f3415a; i86++) {
                    iArr17[i86] = tVar7.f50661e[i75][i77][i86] & 7;
                    int i87 = 0;
                    while (true) {
                        if (i87 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.r rVar3 = (x2.r) list.get(i87);
                        if (rVar3.b().equals(a11) && rVar3.u(i86) != -1) {
                            z13 = true;
                            break;
                        }
                        i87++;
                    }
                    zArr[i86] = z13;
                }
                wVar.b(new b2.r1(a11, z15, iArr17, zArr));
                i77++;
                listArr = listArr3;
                n1Var8 = n1Var9;
            }
            i75++;
        }
        u2.n1 n1Var10 = tVar7.f50662f;
        for (int i88 = 0; i88 < n1Var10.f48772a; i88++) {
            b2.l1 a12 = n1Var10.a(i88);
            int[] iArr18 = new int[a12.f3415a];
            Arrays.fill(iArr18, 0);
            wVar.b(new b2.r1(a12, false, iArr18, new boolean[a12.f3415a]));
        }
        x2.v vVar = new x2.v((n1[]) create.first, (x2.r[]) create.second, new s1(wVar.i()), tVar7);
        for (int i89 = 0; i89 < vVar.f50666a; i89++) {
            if (vVar.b(i89)) {
                if (vVar.f50668c[i89] == null && this.f11898j[i89].f11644b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.f50668c[i89] == null);
            }
        }
        for (x2.r rVar4 : vVar.f50668c) {
            if (rVar4 != null) {
                rVar4.p(f7);
                rVar4.e(z10);
            }
        }
        return vVar;
    }

    public final void k() {
        Object obj = this.f11891a;
        if (obj instanceof u2.d) {
            long j3 = this.f11896g.d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.f48659e = 0L;
            dVar.f48660f = j3;
        }
    }
}
