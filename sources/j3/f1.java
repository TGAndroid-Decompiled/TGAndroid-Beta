package j3;

import android.os.Looper;
import android.util.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k7.y7;
public final class f1 {
    public final Object f8570a;
    public final Object f8571b;
    public final o4.l0[] f8572c;
    public boolean d;
    public boolean e;
    public g1 f8573f;
    public boolean f8574g;
    public final boolean[] h;
    public final e[] f8575i;
    public final f5.t f8576j;
    public final q1 f8577k;
    public f1 f8578l;
    public o4.t0 f8579m;
    public f5.x f8580n;
    public long f8581o;

    public f1(e[] eVarArr, long j10, f5.t tVar, g5.q qVar, q1 q1Var, g1 g1Var, f5.x xVar) {
        this.f8575i = eVarArr;
        this.f8581o = j10;
        this.f8576j = tVar;
        this.f8577k = q1Var;
        o4.v vVar = g1Var.f8585a;
        this.f8571b = vVar.f16424a;
        this.f8573f = g1Var;
        this.f8579m = o4.t0.d;
        this.f8580n = xVar;
        this.f8572c = new o4.l0[eVarArr.length];
        this.h = new boolean[eVarArr.length];
        long j11 = g1Var.f8586b;
        long j12 = g1Var.d;
        q1Var.getClass();
        Object obj = vVar.f16424a;
        int i10 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        o4.v b10 = vVar.b(pair.second);
        p1 p1Var = (p1) q1Var.d.get(obj2);
        p1Var.getClass();
        q1Var.f8797g.add(p1Var);
        o1 o1Var = (o1) q1Var.f8796f.get(p1Var);
        if (o1Var != null) {
            o1Var.f8763a.e(o1Var.f8764b);
        }
        p1Var.f8785c.add(b10);
        o4.n b11 = p1Var.f8783a.b(b10, qVar, j11);
        q1Var.f8795c.put(b11, p1Var);
        q1Var.c();
        this.f8570a = j12 != -9223372036854775807L ? new o4.d(b11, true, 0L, j12) : b11;
    }

    public final long a(f5.x xVar, long j10, boolean z4, boolean[] zArr) {
        e[] eVarArr;
        Object[] objArr;
        boolean z10;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xVar.f6000a) {
                break;
            }
            if (z4 || !xVar.a(this.f8580n, i10)) {
                z11 = false;
            }
            this.h[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            eVarArr = this.f8575i;
            int length = eVarArr.length;
            objArr = this.f8572c;
            if (i11 >= length) {
                break;
            }
            if (eVarArr[i11].f8489b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f8580n = xVar;
        c();
        long v = this.f8570a.v(xVar.f6002c, this.h, this.f8572c, zArr, j10);
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (eVarArr[i12].f8489b == -2 && this.f8580n.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.e = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                h5.a.i(xVar.b(i13));
                if (eVarArr[i13].f8489b != -2) {
                    this.e = true;
                }
            } else {
                if (xVar.f6002c[i13] == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h5.a.i(z10);
            }
        }
        return v;
    }

    public final void b() {
        if (this.f8578l == null) {
            int i10 = 0;
            while (true) {
                f5.x xVar = this.f8580n;
                if (i10 < xVar.f6000a) {
                    boolean b10 = xVar.b(i10);
                    f5.c cVar = this.f8580n.f6002c[i10];
                    if (b10 && cVar != null) {
                        cVar.a();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f8578l == null) {
            int i10 = 0;
            while (true) {
                f5.x xVar = this.f8580n;
                if (i10 < xVar.f6000a) {
                    boolean b10 = xVar.b(i10);
                    f5.c cVar = this.f8580n.f6002c[i10];
                    if (b10 && cVar != null) {
                        cVar.b();
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
        if (!this.d) {
            return this.f8573f.f8586b;
        }
        if (this.e) {
            j10 = this.f8570a.X();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f8573f.e;
        }
        return j10;
    }

    public final long e() {
        return this.f8573f.f8586b + this.f8581o;
    }

    public final void f() {
        b();
        ?? r02 = this.f8570a;
        try {
            boolean z4 = r02 instanceof o4.d;
            q1 q1Var = this.f8577k;
            if (z4) {
                q1Var.f(((o4.d) r02).f16308a);
            } else {
                q1Var.f(r02);
            }
        } catch (RuntimeException e) {
            h5.a.p("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final f5.x g(float f10, o2 o2Var) {
        f5.h hVar;
        boolean z4;
        String str;
        long j10;
        f5.c[] cVarArr;
        boolean z10;
        boolean z11;
        s8.i0 i0Var;
        int i10;
        boolean z12;
        boolean z13;
        g2 g2Var;
        f5.c bVar;
        s8.i0 i11;
        Object[] objArr;
        long j11;
        g5.f fVar;
        int[] iArr;
        int i12;
        double d;
        long j12;
        f5.s sVar;
        Object obj;
        f5.q qVar;
        int i13;
        f5.q qVar2;
        o4.s0 s0Var;
        o4.t0 t0Var;
        f5.k kVar;
        boolean z14;
        int[] iArr2;
        boolean z15;
        f5.t tVar = this.f8576j;
        e[] eVarArr = this.f8575i;
        o4.t0 t0Var2 = this.f8579m;
        tVar.getClass();
        int[] iArr3 = new int[eVarArr.length + 1];
        int length = eVarArr.length + 1;
        o4.s0[][] s0VarArr = new o4.s0[length];
        int[][][] iArr4 = new int[eVarArr.length + 1][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = t0Var2.f16421a;
            s0VarArr[i14] = new o4.s0[i15];
            iArr4[i14] = new int[i15];
        }
        int length2 = eVarArr.length;
        int[] iArr5 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr5[i16] = eVarArr[i16].y();
        }
        int i17 = 0;
        while (i17 < t0Var2.f16421a) {
            o4.s0 a2 = t0Var2.a(i17);
            if (a2.f16420c == 5) {
                z14 = true;
            } else {
                z14 = false;
            }
            int length3 = eVarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z16 = true;
            while (i19 < eVarArr.length) {
                e eVar = eVarArr[i19];
                f5.t tVar2 = tVar;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.f16418a; i21++) {
                    i20 = Math.max(i20, eVar.x(a2.d[i21]) & 7);
                }
                if (iArr3[i19] == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i20 > i18 || (i20 == i18 && z14 && !z16 && z15)) {
                    i18 = i20;
                    z16 = z15;
                    length3 = i19;
                }
                i19++;
                tVar = tVar2;
            }
            f5.t tVar3 = tVar;
            if (length3 == eVarArr.length) {
                iArr2 = new int[a2.f16418a];
            } else {
                e eVar2 = eVarArr[length3];
                int[] iArr6 = new int[a2.f16418a];
                for (int i22 = 0; i22 < a2.f16418a; i22++) {
                    iArr6[i22] = eVar2.x(a2.d[i22]);
                }
                iArr2 = iArr6;
            }
            int i23 = iArr3[length3];
            s0VarArr[length3][i23] = a2;
            iArr4[length3][i23] = iArr2;
            iArr3[length3] = i23 + 1;
            i17++;
            tVar = tVar3;
        }
        f5.t tVar4 = tVar;
        o4.t0[] t0VarArr = new o4.t0[eVarArr.length];
        String[] strArr = new String[eVarArr.length];
        int[] iArr7 = new int[eVarArr.length];
        for (int i24 = 0; i24 < eVarArr.length; i24++) {
            int i25 = iArr3[i24];
            t0VarArr[i24] = new o4.t0((o4.s0[]) h5.d0.I(i25, s0VarArr[i24]));
            iArr4[i24] = (int[][]) h5.d0.I(i25, iArr4[i24]);
            strArr[i24] = eVarArr[i24].g();
            iArr7[i24] = eVarArr[i24].f8489b;
        }
        f5.s sVar2 = new f5.s(iArr7, t0VarArr, iArr5, iArr4, new o4.t0((o4.s0[]) h5.d0.I(iArr3[eVarArr.length], s0VarArr[eVarArr.length])));
        f5.p pVar = (f5.p) tVar4;
        synchronized (pVar.d) {
            try {
                hVar = pVar.h;
                if (hVar.W && h5.d0.f6937a >= 32 && (kVar = pVar.f5954i) != null) {
                    Looper myLooper = Looper.myLooper();
                    h5.a.j(myLooper);
                    kVar.b(pVar, myLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i26 = sVar2.f5958a;
        f5.q[] qVarArr = new f5.q[i26];
        int i27 = 2;
        Pair j13 = f5.p.j(2, sVar2, iArr4, new c1.b(10, hVar, iArr5), new e5.f(6));
        if (j13 != null) {
            qVarArr[((Integer) j13.second).intValue()] = (f5.q) j13.first;
        }
        int i28 = 0;
        while (true) {
            if (i28 < sVar2.f5958a) {
                if (2 == iArr7[i28] && t0VarArr[i28].f16421a > 0) {
                    z4 = true;
                    break;
                }
                i28++;
            } else {
                z4 = false;
                break;
            }
        }
        Pair j14 = f5.p.j(1, sVar2, iArr4, new com.google.firebase.messaging.i(pVar, hVar, z4, 1), new e5.f(7));
        if (j14 != null) {
            qVarArr[((Integer) j14.second).intValue()] = (f5.q) j14.first;
        }
        if (j14 == null) {
            str = null;
        } else {
            f5.q qVar3 = (f5.q) j14.first;
            str = qVar3.f5956a.d[qVar3.f5957b[0]].f8737c;
        }
        int i29 = 3;
        Pair j15 = f5.p.j(3, sVar2, iArr4, new c1.b(11, hVar, str), new e5.f(8));
        if (j15 != null) {
            qVarArr[((Integer) j15.second).intValue()] = (f5.q) j15.first;
        }
        int i30 = 0;
        while (i30 < i26) {
            int i31 = iArr7[i30];
            if (i31 != i27 && i31 != 1 && i31 != i29) {
                o4.t0 t0Var3 = t0VarArr[i30];
                int[][] iArr8 = iArr4[i30];
                o4.s0 s0Var2 = null;
                int i32 = 0;
                int i33 = 0;
                f5.f fVar2 = null;
                while (i32 < t0Var3.f16421a) {
                    o4.s0 a10 = t0Var3.a(i32);
                    int[] iArr9 = iArr8[i32];
                    f5.f fVar3 = fVar2;
                    int i34 = i33;
                    o4.s0 s0Var3 = s0Var2;
                    int i35 = 0;
                    while (i35 < a10.f16418a) {
                        int i36 = i30;
                        if (f5.p.f(iArr9[i35], hVar.X)) {
                            s0Var = a10;
                            f5.f fVar4 = new f5.f(a10.d[i35], iArr9[i35]);
                            if (fVar3 != null) {
                                t0Var = t0Var3;
                                if (s8.p.f44142a.c(fVar4.f5925b, fVar3.f5925b).c(fVar4.f5924a, fVar3.f5924a).e() <= 0) {
                                }
                            } else {
                                t0Var = t0Var3;
                            }
                            fVar3 = fVar4;
                            i34 = i35;
                            s0Var3 = s0Var;
                        } else {
                            s0Var = a10;
                            t0Var = t0Var3;
                        }
                        i35++;
                        i30 = i36;
                        a10 = s0Var;
                        t0Var3 = t0Var;
                    }
                    i32++;
                    s0Var2 = s0Var3;
                    i33 = i34;
                    fVar2 = fVar3;
                }
                i13 = i30;
                if (s0Var2 == null) {
                    qVar2 = null;
                } else {
                    qVar2 = new f5.q(0, s0Var2, new int[]{i33});
                }
                qVarArr[i13] = qVar2;
            } else {
                i13 = i30;
            }
            i30 = i13 + 1;
            i27 = 2;
            i29 = 3;
        }
        Object obj2 = null;
        int i37 = sVar2.f5958a;
        o4.t0[] t0VarArr2 = sVar2.f5960c;
        HashMap hashMap = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            f5.p.c(t0VarArr2[i38], hVar, hashMap);
        }
        f5.p.c(sVar2.f5961f, hVar, hashMap);
        for (int i39 = 0; i39 < i37; i39++) {
            f5.u uVar = (f5.u) hashMap.get(Integer.valueOf(sVar2.f5959b[i39]));
            if (uVar != null) {
                o4.s0 s0Var4 = uVar.f5966a;
                s8.v vVar = uVar.f5967b;
                if (!vVar.isEmpty() && t0VarArr2[i39].b(s0Var4) != -1) {
                    qVar = new f5.q(0, s0Var4, y7.d(vVar));
                } else {
                    qVar = null;
                }
                qVarArr[i39] = qVar;
            }
        }
        int i40 = sVar2.f5958a;
        for (int i41 = 0; i41 < i40; i41++) {
            o4.t0 t0Var4 = sVar2.f5960c[i41];
            Map map = (Map) hVar.f5928b0.get(i41);
            if (map != null && map.containsKey(t0Var4)) {
                Map map2 = (Map) hVar.f5928b0.get(i41);
                if (map2 != null) {
                    f5.i iVar = (f5.i) map2.get(t0Var4);
                }
                qVarArr[i41] = null;
            }
        }
        for (int i42 = 0; i42 < i26; i42++) {
            int i43 = sVar2.f5959b[i42];
            if (hVar.f5929c0.get(i42) || hVar.M.contains(Integer.valueOf(i43))) {
                qVarArr[i42] = null;
            }
        }
        db.a aVar = pVar.f5952f;
        g5.f fVar5 = pVar.f5963b;
        h5.a.j(fVar5);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i44 = 0;
        while (i44 < qVarArr.length) {
            f5.q qVar4 = qVarArr[i44];
            if (qVar4 != null && qVar4.f5957b.length > 1) {
                s8.t tVar5 = s8.v.f44157b;
                com.google.android.gms.common.api.internal.w wVar = new com.google.android.gms.common.api.internal.w();
                wVar.b(new f5.a(0L, 0L));
                arrayList.add(wVar);
                obj = obj2;
            } else {
                obj = obj2;
                arrayList.add(obj);
            }
            i44++;
            obj2 = obj;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4];
        int i45 = 0;
        while (true) {
            j10 = -1;
            if (i45 >= qVarArr.length) {
                break;
            }
            f5.q qVar5 = qVarArr[i45];
            if (qVar5 == null) {
                jArr[i45] = new long[0];
                sVar = sVar2;
            } else {
                int[] iArr10 = qVar5.f5957b;
                jArr[i45] = new long[iArr10.length];
                int i46 = 0;
                while (i46 < iArr10.length) {
                    f5.s sVar3 = sVar2;
                    long j16 = qVar5.f5956a.d[iArr10[i46]].f8739n;
                    long[] jArr2 = jArr[i45];
                    if (j16 == -1) {
                        j16 = 0;
                    }
                    jArr2[i46] = j16;
                    i46++;
                    sVar2 = sVar3;
                }
                sVar = sVar2;
                Arrays.sort(jArr[i45]);
            }
            i45++;
            sVar2 = sVar;
        }
        f5.s sVar4 = sVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            if (jArr4.length == 0) {
                j12 = 0;
            } else {
                j12 = jArr4[0];
            }
            jArr3[i47] = j12;
        }
        f5.b.w(arrayList, jArr3);
        s8.l.c(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(s8.g0.f44126b);
        s8.d0 d0Var = new s8.d0();
        ?? obj3 = new Object();
        if (treeMap.isEmpty()) {
            obj3.d = treeMap;
            obj3.f44124f = d0Var;
            int i48 = 0;
            while (i48 < length4) {
                long[] jArr5 = jArr[i48];
                if (jArr5.length <= 1) {
                    fVar = fVar5;
                    i12 = length4;
                    j11 = j10;
                    iArr = iArr11;
                } else {
                    int length5 = jArr5.length;
                    double[] dArr = new double[length5];
                    j11 = j10;
                    int i49 = 0;
                    while (true) {
                        long[] jArr6 = jArr[i48];
                        fVar = fVar5;
                        double d10 = 0.0d;
                        if (i49 >= jArr6.length) {
                            break;
                        }
                        int i50 = length4;
                        int[] iArr12 = iArr11;
                        long j17 = jArr6[i49];
                        if (j17 != j11) {
                            d10 = Math.log(j17);
                        }
                        dArr[i49] = d10;
                        i49++;
                        length4 = i50;
                        iArr11 = iArr12;
                        fVar5 = fVar;
                    }
                    int i51 = length4;
                    iArr = iArr11;
                    int i52 = length5 - 1;
                    double d11 = dArr[i52] - dArr[0];
                    int i53 = 0;
                    while (i53 < i52) {
                        double d12 = dArr[i53];
                        i53++;
                        double d13 = (d12 + dArr[i53]) * 0.5d;
                        if (d11 == 0.0d) {
                            d = 1.0d;
                        } else {
                            d = (d13 - dArr[0]) / d11;
                        }
                        Double valueOf = Double.valueOf(d);
                        int i54 = i51;
                        Integer valueOf2 = Integer.valueOf(i48);
                        double d14 = d11;
                        Map map3 = obj3.d;
                        Collection collection = (Collection) map3.get(valueOf);
                        if (collection == null) {
                            List list = (List) obj3.f44124f.get();
                            if (list.add(valueOf2)) {
                                obj3.e++;
                                map3.put(valueOf, list);
                            } else {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                        } else if (collection.add(valueOf2)) {
                            obj3.e++;
                        }
                        i51 = i54;
                        d11 = d14;
                    }
                    i12 = i51;
                }
                i48++;
                iArr11 = iArr;
                j10 = j11;
                length4 = i12;
                fVar5 = fVar;
            }
            g5.f fVar6 = fVar5;
            int[] iArr13 = iArr11;
            l7.m mVar = obj3.f44132b;
            int i55 = 4;
            if (mVar == null) {
                mVar = new l7.m(4, (Serializable) obj3);
                obj3.f44132b = mVar;
            }
            s8.v t6 = s8.v.t(mVar);
            for (int i56 = 0; i56 < t6.size(); i56++) {
                int intValue = ((Integer) t6.get(i56)).intValue();
                int i57 = iArr13[intValue] + 1;
                iArr13[intValue] = i57;
                jArr3[intValue] = jArr[intValue][i57];
                f5.b.w(arrayList, jArr3);
            }
            for (int i58 = 0; i58 < qVarArr.length; i58++) {
                if (arrayList.get(i58) != null) {
                    jArr3[i58] = jArr3[i58] * 2;
                }
            }
            f5.b.w(arrayList, jArr3);
            s8.l.c(4, "initialCapacity");
            Object[] objArr2 = new Object[4];
            int i59 = 0;
            int i60 = 0;
            boolean z17 = false;
            while (i59 < arrayList.size()) {
                s8.s sVar5 = (s8.s) arrayList.get(i59);
                if (sVar5 == null) {
                    i11 = s8.i0.e;
                } else {
                    i11 = sVar5.i();
                }
                i11.getClass();
                int i61 = i60 + 1;
                if (objArr2.length < i61) {
                    objArr = Arrays.copyOf(objArr2, com.google.android.gms.common.api.internal.w.g(objArr2.length, i61));
                } else if (z17) {
                    objArr = (Object[]) objArr2.clone();
                } else {
                    objArr2[i60] = i11;
                    i59++;
                    i60++;
                }
                objArr2 = objArr;
                z17 = false;
                objArr2[i60] = i11;
                i59++;
                i60++;
            }
            s8.i0 s6 = s8.v.s(i60, objArr2);
            f5.c[] cVarArr2 = new f5.c[qVarArr.length];
            for (int i62 = 0; i62 < qVarArr.length; i62++) {
                f5.q qVar6 = qVarArr[i62];
                if (qVar6 != null) {
                    int[] iArr14 = qVar6.f5957b;
                    if (iArr14.length != 0) {
                        if (iArr14.length == 1) {
                            bVar = new f5.c(qVar6.f5956a, new int[]{iArr14[0]});
                        } else {
                            long j18 = 25000;
                            bVar = new f5.b(qVar6.f5956a, iArr14, fVar6, 10000, j18, j18, (s8.v) s6.get(i62));
                        }
                        cVarArr2[i62] = bVar;
                    }
                }
            }
            g2[] g2VarArr = new g2[i26];
            int i63 = 0;
            while (i63 < i26) {
                f5.s sVar6 = sVar4;
                int i64 = sVar6.f5959b[i63];
                if (!hVar.f5929c0.get(i63) && !hVar.M.contains(Integer.valueOf(i64)) && (sVar6.f5959b[i63] == -2 || cVarArr2[i63] != null)) {
                    g2Var = g2.f8591b;
                } else {
                    g2Var = null;
                }
                g2VarArr[i63] = g2Var;
                i63++;
                sVar4 = sVar6;
            }
            f5.s sVar7 = sVar4;
            if (hVar.Y) {
                int i65 = -1;
                int i66 = -1;
                for (int i67 = 0; i67 < sVar7.f5958a; i67++) {
                    int i68 = sVar7.f5959b[i67];
                    f5.c cVar = cVarArr2[i67];
                    if ((i68 == 1 || i68 == 2) && cVar != null) {
                        int[][] iArr15 = iArr4[i67];
                        int b10 = sVar7.f5960c[i67].b(cVar.l());
                        int i69 = 0;
                        while (true) {
                            if (i69 < cVar.p()) {
                                if ((iArr15[b10][cVar.f(i69)] & 32) != 32) {
                                    break;
                                }
                                i69++;
                            } else if (i68 == 1) {
                                i10 = -1;
                                if (i66 != -1) {
                                    z12 = false;
                                    break;
                                }
                                i66 = i67;
                            } else {
                                i10 = -1;
                                if (i65 != -1) {
                                    z12 = false;
                                    break;
                                }
                                i65 = i67;
                            }
                        }
                    }
                }
                i10 = -1;
                z12 = true;
                if (i66 != i10 && i65 != i10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 & z12) {
                    g2 g2Var2 = new g2(true);
                    g2VarArr[i66] = g2Var2;
                    g2VarArr[i65] = g2Var2;
                }
            }
            Pair create = Pair.create(g2VarArr, cVarArr2);
            f5.c[] cVarArr3 = (f5.c[]) create.second;
            List[] listArr = new List[cVarArr3.length];
            for (int i70 = 0; i70 < cVarArr3.length; i70++) {
                f5.c cVar2 = cVarArr3[i70];
                if (cVar2 != null) {
                    i0Var = s8.v.x(cVar2);
                } else {
                    s8.t tVar6 = s8.v.f44157b;
                    i0Var = s8.i0.e;
                }
                listArr[i70] = i0Var;
            }
            ?? wVar2 = new com.google.android.gms.common.api.internal.w();
            int i71 = 0;
            while (true) {
                int i72 = sVar7.f5958a;
                o4.t0[] t0VarArr3 = sVar7.f5960c;
                if (i71 >= i72) {
                    break;
                }
                o4.t0 t0Var5 = t0VarArr3[i71];
                List list2 = listArr[i71];
                int i73 = 0;
                while (i73 < t0Var5.f16421a) {
                    o4.s0 a11 = t0Var5.a(i73);
                    int i74 = t0VarArr3[i71].a(i73).f16418a;
                    int[] iArr16 = new int[i74];
                    int i75 = 0;
                    for (int i76 = 0; i76 < i74; i76++) {
                        if ((sVar7.e[i71][i73][i76] & 7) == i55) {
                            iArr16[i75] = i76;
                            i75++;
                        }
                    }
                    int[] copyOf = Arrays.copyOf(iArr16, i75);
                    List[] listArr2 = listArr;
                    String str2 = null;
                    int i77 = 0;
                    boolean z18 = false;
                    int i78 = 0;
                    int i79 = 16;
                    while (i77 < copyOf.length) {
                        String str3 = t0VarArr3[i71].a(i73).d[copyOf[i77]].C;
                        int i80 = i78 + 1;
                        if (i78 == 0) {
                            str2 = str3;
                        } else {
                            z18 = (!h5.d0.a(str2, str3)) | z18;
                        }
                        i79 = Math.min(i79, sVar7.e[i71][i73][i77] & 24);
                        i77++;
                        i78 = i80;
                    }
                    if (z18) {
                        i79 = Math.min(i79, sVar7.d[i71]);
                    }
                    if (i79 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i81 = a11.f16418a;
                    int[] iArr17 = new int[i81];
                    boolean[] zArr = new boolean[i81];
                    for (int i82 = 0; i82 < a11.f16418a; i82++) {
                        iArr17[i82] = sVar7.e[i71][i73][i82] & 7;
                        int i83 = 0;
                        while (true) {
                            if (i83 < list2.size()) {
                                f5.c cVar3 = (f5.c) list2.get(i83);
                                if (cVar3.l().equals(a11) && cVar3.m(i82) != -1) {
                                    z11 = true;
                                    break;
                                }
                                i83++;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        zArr[i82] = z11;
                    }
                    wVar2.b(new p2(a11, z10, iArr17, zArr));
                    i73++;
                    listArr = listArr2;
                    i55 = 4;
                }
                i71++;
                i55 = 4;
            }
            o4.t0 t0Var6 = sVar7.f5961f;
            for (int i84 = 0; i84 < t0Var6.f16421a; i84++) {
                o4.s0 a12 = t0Var6.a(i84);
                int[] iArr18 = new int[a12.f16418a];
                Arrays.fill(iArr18, 0);
                wVar2.b(new p2(a12, false, iArr18, new boolean[a12.f16418a]));
            }
            f5.x xVar = new f5.x((g2[]) create.first, (f5.c[]) create.second, new q2(wVar2.i()), sVar7);
            for (f5.c cVar4 : xVar.f6002c) {
                if (cVar4 != null) {
                    cVar4.s(f10);
                }
            }
            return xVar;
        }
        throw new IllegalArgumentException();
    }
}
