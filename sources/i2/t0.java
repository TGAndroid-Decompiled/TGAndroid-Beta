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
import org.telegram.ui.Components.s50;
import org.telegram.ui.f11;
import rg.p2;
import v7.x7;
public final class t0 {
    public final Object f11759a;
    public final Object f11760b;
    public final u2.b1[] f11761c;
    public boolean d;
    public boolean f11762e;
    public boolean f11763f;
    public u0 f11764g;
    public boolean h;
    public final boolean[] f11765i;
    public final f[] f11766j;
    public final x2.u f11767k;
    public final f1 f11768l;
    public t0 f11769m;
    public u2.o1 f11770n;
    public x2.v f11771o;
    public long f11772p;

    public t0(f[] fVarArr, long j3, x2.u uVar, y2.d dVar, f1 f1Var, u0 u0Var, x2.v vVar) {
        this.f11766j = fVarArr;
        this.f11772p = j3;
        this.f11767k = uVar;
        this.f11768l = f1Var;
        u2.f0 f0Var = u0Var.f11775a;
        this.f11760b = f0Var.f46695a;
        this.f11764g = u0Var;
        this.f11770n = u2.o1.d;
        this.f11771o = vVar;
        this.f11761c = new u2.b1[fVarArr.length];
        this.f11765i = new boolean[fVarArr.length];
        long j10 = u0Var.f11776b;
        long j11 = u0Var.d;
        boolean z10 = u0Var.f11779f;
        f1Var.getClass();
        Object obj = f0Var.f46695a;
        int i10 = a.f11475g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.f0 a2 = f0Var.a(pair.second);
        e1 e1Var = (e1) f1Var.d.get(obj2);
        e1Var.getClass();
        f1Var.f11571g.add(e1Var);
        d1 d1Var = (d1) f1Var.f11570f.get(e1Var);
        if (d1Var != null) {
            d1Var.f11504a.f(d1Var.f11505b);
        }
        e1Var.f11518c.add(a2);
        u2.x c10 = e1Var.f11516a.c(a2, dVar, j10);
        f1Var.f11568c.put(c10, e1Var);
        f1Var.c();
        this.f11759a = j11 != -9223372036854775807L ? new u2.d(c10, !z10, 0L, j11) : c10;
    }

    public final long a(x2.v vVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= vVar.f48798a) {
                break;
            }
            if (z10 || !vVar.a(this.f11771o, i10)) {
                z12 = false;
            }
            this.f11765i[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            fVarArr = this.f11766j;
            int length = fVarArr.length;
            objArr = this.f11761c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].f11521b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f11771o = vVar;
        c();
        long q6 = this.f11759a.q(vVar.f48800c, this.f11765i, this.f11761c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].f11521b == -2 && this.f11771o.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f11763f = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                e2.d.g(vVar.b(i13));
                if (fVarArr[i13].f11521b != -2) {
                    this.f11763f = true;
                }
            } else {
                if (vVar.f48800c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.g(z11);
            }
        }
        return q6;
    }

    public final void b() {
        if (this.f11769m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f11771o;
                if (i10 < vVar.f48798a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f11771o.f48800c[i10];
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
        if (this.f11769m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f11771o;
                if (i10 < vVar.f48798a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f11771o.f48800c[i10];
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
        if (!this.f11762e) {
            return this.f11764g.f11776b;
        }
        if (this.f11763f) {
            j3 = this.f11759a.s();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f11764g.f11778e;
        }
        return j3;
    }

    public final long e() {
        return this.f11764g.f11776b + this.f11772p;
    }

    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.f11762e = true;
        this.f11770n = this.f11759a.r();
        x2.v j3 = j(f7, k1Var, z10);
        u0 u0Var = this.f11764g;
        long j10 = u0Var.f11776b;
        long j11 = u0Var.f11778e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.f11766j.length]);
        long j12 = this.f11772p;
        u0 u0Var2 = this.f11764g;
        this.f11772p = (u0Var2.f11776b - a2) + j12;
        this.f11764g = u0Var2.b(a2);
    }

    public final boolean g() {
        if (this.f11762e) {
            if (!this.f11763f || this.f11759a.s() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.f11762e) {
            if (g() || d() - this.f11764g.f11776b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f11759a;
        try {
            boolean z10 = r02 instanceof u2.d;
            f1 f1Var = this.f11768l;
            if (z10) {
                f1Var.f(((u2.d) r02).f46678a);
            } else {
                f1Var.f(r02);
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
        x2.u uVar = this.f11767k;
        f[] fVarArr = this.f11766j;
        u2.o1 o1Var2 = this.f11770n;
        uVar.getClass();
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length];
        int[][][] iArr5 = new int[fVarArr.length + 1][];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = o1Var2.f46801a;
            l1VarArr[i15] = new b2.l1[i16];
            iArr5[i15] = new int[i16];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            iArr6[i17] = fVarArr[i17].B();
        }
        int i18 = 0;
        while (i18 < o1Var2.f46801a) {
            b2.l1 a2 = o1Var2.a(i18);
            boolean z14 = a2.f2171c == 5;
            int length3 = fVarArr.length;
            int i19 = 0;
            int i20 = 0;
            boolean z15 = true;
            while (i19 < fVarArr.length) {
                f fVar = fVarArr[i19];
                x2.u uVar2 = uVar;
                u2.o1 o1Var3 = o1Var2;
                int i21 = 0;
                for (int i22 = 0; i22 < a2.f2169a; i22++) {
                    i21 = Math.max(i21, fVar.A(a2.d[i22]) & 7);
                }
                boolean z16 = iArr4[i19] == 0;
                if (i21 > i20 || (i21 == i20 && z14 && !z15 && z16)) {
                    i20 = i21;
                    z15 = z16;
                    length3 = i19;
                }
                i19++;
                uVar = uVar2;
                o1Var2 = o1Var3;
            }
            x2.u uVar3 = uVar;
            u2.o1 o1Var4 = o1Var2;
            if (length3 == fVarArr.length) {
                iArr3 = new int[a2.f2169a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr7 = new int[a2.f2169a];
                for (int i23 = 0; i23 < a2.f2169a; i23++) {
                    iArr7[i23] = fVar2.A(a2.d[i23]);
                }
                iArr3 = iArr7;
            }
            int i24 = iArr4[length3];
            l1VarArr[length3][i24] = a2;
            iArr5[length3][i24] = iArr3;
            iArr4[length3] = i24 + 1;
            i18++;
            uVar = uVar3;
            o1Var2 = o1Var4;
        }
        x2.u uVar4 = uVar;
        u2.o1[] o1VarArr = new u2.o1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i25 = 0; i25 < fVarArr.length; i25++) {
            int i26 = iArr4[i25];
            o1VarArr[i25] = new u2.o1((b2.l1[]) e2.d0.S(i26, l1VarArr[i25]));
            iArr5[i25] = (int[][]) e2.d0.S(i26, iArr5[i25]);
            strArr[i25] = fVarArr[i25].j();
            iArr8[i25] = fVarArr[i25].f11521b;
        }
        x2.t tVar2 = new x2.t(iArr8, o1VarArr, iArr6, iArr5, new u2.o1((b2.l1[]) e2.d0.S(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.p pVar = (x2.p) uVar4;
        synchronized (pVar.d) {
            pVar.h = Thread.currentThread();
            iVar = pVar.f48784g;
        }
        if (pVar.f48787k == null && (context = pVar.f48782e) != null) {
            pVar.f48787k = Boolean.valueOf(e2.d0.N(context));
        }
        if (iVar.f48754s0 && Build.VERSION.SDK_INT >= 32 && pVar.f48785i == null) {
            pVar.f48785i = new x2.k(pVar.f48782e, pVar, pVar.f48787k);
        }
        int i27 = tVar2.f48790a;
        Context context2 = pVar.f48782e;
        x2.q[] qVarArr = new x2.q[i27];
        int i28 = 0;
        while (true) {
            if (i28 >= tVar2.f48790a) {
                z11 = false;
                break;
            } else if (2 == iArr8[i28] && o1VarArr[i28].f46801a > 0) {
                z11 = true;
                break;
            } else {
                i28++;
            }
        }
        Pair j10 = x2.p.j(1, tVar2, iArr5, new ca.b(pVar, iVar, z11, iArr6, 7), new f11(16));
        if (j10 != null) {
            qVarArr[((Integer) j10.second).intValue()] = (x2.q) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.q qVar2 = (x2.q) j10.first;
            str = qVar2.f48788a.d[qVar2.f48789b[0]].d;
        }
        b2.o1 o1Var5 = iVar.f2320u;
        if (o1Var5.f2255a == 2) {
            str2 = str;
            j3 = null;
            obj = null;
        } else {
            a1.d dVar = new a1.d(iVar, str, iArr6, (!iVar.f2310k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            obj = null;
            j3 = x2.p.j(2, tVar2, iArr5, dVar, new f11(15));
        }
        int i29 = 4;
        if ((iVar.A || j3 == null) && o1Var5.f2255a != 2) {
            iArr = iArr8;
            pair = x2.p.j(4, tVar2, iArr5, new p2(iVar, 12), new f11(14));
        } else {
            iArr = iArr8;
            pair = obj;
        }
        if (pair != 0) {
            qVarArr[((Integer) pair.second).intValue()] = (x2.q) pair.first;
        } else if (j3 != null) {
            qVarArr[((Integer) j3.second).intValue()] = (x2.q) j3.first;
        }
        int i30 = 3;
        if (o1Var5.f2255a == 2) {
            pair2 = obj;
        } else {
            if (!iVar.f2322x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = obj;
            } else {
                String str4 = e2.d0.f8765a;
                str3 = locale.toLanguageTag();
            }
            pair2 = x2.p.j(3, tVar2, iArr5, new s50(iVar, str2, str3, 10), new f11(17));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i31 = 0;
        while (i31 < i27) {
            int i32 = iArr[i31];
            if (i32 == 2 || i32 == 1 || i32 == i30 || i32 == i29) {
                i12 = i31;
                o1Var = o1Var5;
            } else {
                u2.o1 o1Var6 = o1VarArr[i31];
                int[][] iArr9 = iArr5[i31];
                if (o1Var5.f2255a == 2) {
                    i12 = i31;
                    o1Var = o1Var5;
                } else {
                    b2.l1 l1Var2 = obj;
                    b2.l1 l1Var3 = l1Var2;
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < o1Var6.f46801a) {
                        b2.l1 a10 = o1Var6.a(i33);
                        int[] iArr10 = iArr9[i33];
                        int i35 = i31;
                        b2.o1 o1Var7 = o1Var5;
                        x2.g gVar = l1Var3;
                        int i36 = i34;
                        b2.l1 l1Var4 = l1Var2;
                        int i37 = 0;
                        while (i37 < a10.f2169a) {
                            u2.o1 o1Var8 = o1Var6;
                            if (g.d(iArr10[i37], iVar.f48755t0)) {
                                i13 = i37;
                                x2.g gVar2 = new x2.g(a10.d[i37], iArr10[i13]);
                                if (gVar != 0) {
                                    i14 = i33;
                                    if (e9.z.f9053a.c(gVar2.f48746b, gVar.f48746b).c(gVar2.f48745a, gVar.f48745a).e() <= 0) {
                                    }
                                } else {
                                    i14 = i33;
                                }
                                gVar = gVar2;
                                l1Var4 = a10;
                                i36 = i13;
                            } else {
                                i13 = i37;
                                i14 = i33;
                            }
                            i37 = i13 + 1;
                            o1Var6 = o1Var8;
                            i33 = i14;
                            gVar = gVar;
                        }
                        i33++;
                        l1Var2 = l1Var4;
                        i34 = i36;
                        o1Var5 = o1Var7;
                        l1Var3 = gVar;
                        i31 = i35;
                    }
                    i12 = i31;
                    o1Var = o1Var5;
                    if (l1Var2 != null) {
                        qVar = new x2.q(l1Var2, i34);
                        qVarArr[i12] = qVar;
                    }
                }
                qVar = obj;
                qVarArr[i12] = qVar;
            }
            i31 = i12 + 1;
            o1Var5 = o1Var;
            i30 = 3;
            i29 = 4;
        }
        int i38 = tVar2.f48790a;
        u2.o1[] o1VarArr2 = tVar2.f48792c;
        HashMap hashMap = new HashMap();
        for (int i39 = 0; i39 < i38; i39++) {
            x2.p.c(o1VarArr2[i39], iVar, hashMap);
        }
        x2.p.c(tVar2.f48794f, iVar, hashMap);
        for (int i40 = 0; i40 < i38; i40++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.f48791b[i40]));
            if (m1Var != null) {
                b2.l1 l1Var5 = m1Var.f2198a;
                e9.i0 i0Var = m1Var.f2199b;
                qVarArr[i40] = (i0Var.isEmpty() || o1VarArr2[i40].b(l1Var5) == -1) ? obj : new x2.q(l1Var5, x7.f(i0Var));
            }
        }
        int i41 = tVar2.f48790a;
        for (int i42 = 0; i42 < i41; i42++) {
            u2.o1 o1Var9 = tVar2.f48792c[i42];
            Map map = (Map) iVar.f48757v0.get(i42);
            if (map != null && map.containsKey(o1Var9)) {
                Map map2 = (Map) iVar.f48757v0.get(i42);
                if (map2 != null && map2.get(o1Var9) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i42] = obj;
            }
        }
        for (int i43 = 0; i43 < i27; i43++) {
            int i44 = tVar2.f48791b[i43];
            if (iVar.f48758w0.get(i43) || iVar.E.contains(Integer.valueOf(i44))) {
                qVarArr[i43] = obj;
            }
        }
        rb.a aVar = pVar.f48783f;
        y2.c cVar2 = pVar.f48796b;
        e2.d.h(cVar2);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i45 = 0;
        b2.l1 l1Var6 = obj;
        while (i45 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i45];
            if (qVar3 != 0 && qVar3.f48789b.length > 1) {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var = l1Var6;
            } else {
                l1Var = l1Var6;
                arrayList.add(l1Var);
            }
            i45++;
            l1Var6 = l1Var;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4];
        int i46 = 0;
        while (i46 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i46];
            if (qVar4 == 0) {
                jArr[i46] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr11 = qVar4.f48789b;
                jArr[i46] = new long[iArr11.length];
                int i47 = 0;
                while (i47 < iArr11.length) {
                    x2.t tVar3 = tVar2;
                    long j11 = qVar4.f48788a.d[iArr11[i47]].f2389j;
                    long[] jArr2 = jArr[i46];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i47] = j11;
                    i47++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i46]);
            }
            i46++;
            tVar2 = tVar;
        }
        x2.t tVar4 = tVar2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i48 = 0; i48 < length4; i48++) {
            long[] jArr4 = jArr[i48];
            jArr3[i48] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.f9050b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f9048f = u0Var;
        int i49 = 0;
        while (i49 < length4) {
            long[] jArr5 = jArr[i49];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i11 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i50 = 0;
                while (true) {
                    long[] jArr6 = jArr[i49];
                    i11 = length4;
                    double d = 0.0d;
                    if (i50 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr6[i50];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i50] = d;
                    i50++;
                    length4 = i11;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i51 = length5 - 1;
                double d10 = dArr[i51] - dArr[0];
                int i52 = 0;
                while (i52 < i51) {
                    double d11 = dArr[i52];
                    int i53 = i52 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i53]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i49);
                    double d12 = d10;
                    Map map3 = v0Var.d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        Collection c10 = v0Var.c();
                        if (c10.add(valueOf2)) {
                            v0Var.f9047e++;
                            map3.put(valueOf, c10);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        v0Var.f9047e++;
                    }
                    i52 = i53;
                    d10 = d12;
                }
                continue;
            }
            i49++;
            length4 = i11;
            cVar2 = cVar;
            iArr12 = iArr2;
        }
        y2.c cVar3 = cVar2;
        int[] iArr14 = iArr12;
        e9.n nVar = v0Var.f9013b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.f9013b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i54 = 0; i54 < v.size(); i54++) {
            int intValue = ((Integer) v.get(i54)).intValue();
            int i55 = iArr14[intValue] + 1;
            iArr14[intValue] = i55;
            jArr3[intValue] = jArr[intValue][i55];
            x2.b.v(arrayList, jArr3);
        }
        for (int i56 = 0; i56 < qVarArr.length; i56++) {
            if (arrayList.get(i56) != null) {
                jArr3[i56] = jArr3[i56] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i57 = 0; i57 < arrayList.size(); i57++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i57);
            if (f0Var == null) {
                i10 = e9.a1.f8948e;
            } else {
                i10 = f0Var.i();
            }
            u11.b(i10);
        }
        e9.a1 i58 = u11.i();
        x2.r[] rVarArr2 = new x2.r[qVarArr.length];
        for (int i59 = 0; i59 < qVarArr.length; i59++) {
            x2.q qVar5 = qVarArr[i59];
            if (qVar5 != 0) {
                int[] iArr15 = qVar5.f48789b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.c(qVar5.f48788a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.f48788a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i58.get(i59));
                    }
                    rVarArr2[i59] = bVar;
                }
            }
        }
        m1[] m1VarArr = new m1[i27];
        int i60 = 0;
        while (i60 < i27) {
            x2.t tVar5 = tVar4;
            m1VarArr[i60] = (iVar.f48758w0.get(i60) || iVar.E.contains(Integer.valueOf(tVar5.f48791b[i60])) || (tVar5.f48791b[i60] != -2 && rVarArr2[i60] == null)) ? null : m1.f11668c;
            i60++;
            tVar4 = tVar5;
        }
        x2.t tVar6 = tVar4;
        if (iVar.f2320u.f2255a != 0) {
            int i61 = 0;
            int i62 = -1;
            int i63 = 0;
            while (true) {
                if (i63 < tVar6.f48790a) {
                    int i64 = tVar6.f48791b[i63];
                    x2.r rVar = rVarArr2[i63];
                    if (i64 != 1 && rVar != null) {
                        break;
                    }
                    if (i64 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr5[i63][tVar6.f48792c[i63].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i61++;
                            i62 = i63;
                        }
                    }
                    i63++;
                } else if (i61 == 1) {
                    int i65 = iVar.f2320u.f2256b ? 1 : 2;
                    m1 m1Var2 = m1VarArr[i62];
                    m1VarArr[i62] = new m1(i65, m1Var2 != null && m1Var2.f11670b);
                }
            }
        }
        Pair create = Pair.create(m1VarArr, rVarArr2);
        x2.r[] rVarArr3 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr3.length];
        for (int i66 = 0; i66 < rVarArr3.length; i66++) {
            x2.r rVar2 = rVarArr3[i66];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.f8985b;
                a1Var = e9.a1.f8948e;
            }
            listArr[i66] = a1Var;
        }
        ?? wVar = new com.google.android.gms.common.api.internal.w(4);
        int i67 = 0;
        while (true) {
            int i68 = tVar6.f48790a;
            u2.o1[] o1VarArr3 = tVar6.f48792c;
            if (i67 >= i68) {
                break;
            }
            u2.o1 o1Var10 = o1VarArr3[i67];
            List list = listArr[i67];
            int i69 = 0;
            while (i69 < o1Var10.f46801a) {
                b2.l1 a11 = o1Var10.a(i69);
                int i70 = o1VarArr3[i67].a(i69).f2169a;
                int[] iArr16 = new int[i70];
                int i71 = 0;
                int i72 = 0;
                while (i71 < i70) {
                    List[] listArr2 = listArr;
                    if ((tVar6.f48793e[i67][i69][i71] & 7) == 4) {
                        iArr16[i72] = i71;
                        i72++;
                    }
                    i71++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i72);
                u2.o1 o1Var11 = o1Var10;
                String str5 = null;
                int i73 = 0;
                boolean z17 = false;
                int i74 = 0;
                int i75 = 16;
                while (i73 < copyOf.length) {
                    String str6 = o1VarArr3[i67].a(i69).d[copyOf[i73]].f2397r;
                    int i76 = i74 + 1;
                    if (i74 == 0) {
                        str5 = str6;
                    } else {
                        z17 = (!Objects.equals(str5, str6)) | z17;
                    }
                    i75 = Math.min(i75, tVar6.f48793e[i67][i69][i73] & 24);
                    i73++;
                    i74 = i76;
                }
                if (z17) {
                    i75 = Math.min(i75, tVar6.d[i67]);
                }
                boolean z18 = i75 != 0;
                int i77 = a11.f2169a;
                int[] iArr17 = new int[i77];
                boolean[] zArr = new boolean[i77];
                for (int i78 = 0; i78 < a11.f2169a; i78++) {
                    iArr17[i78] = tVar6.f48793e[i67][i69][i78] & 7;
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
                i69++;
                listArr = listArr3;
                o1Var10 = o1Var11;
            }
            i67++;
        }
        u2.o1 o1Var12 = tVar6.f48794f;
        for (int i80 = 0; i80 < o1Var12.f46801a; i80++) {
            b2.l1 a12 = o1Var12.a(i80);
            int[] iArr18 = new int[a12.f2169a];
            Arrays.fill(iArr18, 0);
            wVar.b(new r1(a12, false, iArr18, new boolean[a12.f2169a]));
        }
        x2.v vVar = new x2.v((m1[]) create.first, (x2.r[]) create.second, new s1(wVar.i()), tVar6);
        for (int i81 = 0; i81 < vVar.f48798a; i81++) {
            if (vVar.b(i81)) {
                if (vVar.f48800c[i81] == null && this.f11766j[i81].f11521b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.f48800c[i81] == null);
            }
        }
        for (x2.r rVar4 : vVar.f48800c) {
            if (rVar4 != null) {
                rVar4.p(f7);
                rVar4.e(z10);
            }
        }
        return vVar;
    }

    public final void k() {
        Object obj = this.f11759a;
        if (obj instanceof u2.d) {
            long j3 = this.f11764g.d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.f46681e = 0L;
            dVar.f46682f = j3;
        }
    }
}
