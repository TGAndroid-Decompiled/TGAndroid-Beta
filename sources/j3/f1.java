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
    public final Object f9137a;
    public final Object f9138b;
    public final o4.l0[] f9139c;
    public boolean d;
    public boolean f9140e;
    public g1 f9141f;
    public boolean f9142g;
    public final boolean[] h;
    public final e[] f9143i;
    public final f5.t f9144j;
    public final q1 f9145k;
    public f1 f9146l;
    public o4.t0 f9147m;
    public f5.y f9148n;
    public long f9149o;

    public f1(e[] eVarArr, long j10, f5.t tVar, g5.q qVar, q1 q1Var, g1 g1Var, f5.y yVar) {
        this.f9143i = eVarArr;
        this.f9149o = j10;
        this.f9144j = tVar;
        this.f9145k = q1Var;
        o4.v vVar = g1Var.f9153a;
        this.f9138b = vVar.f16579a;
        this.f9141f = g1Var;
        this.f9147m = o4.t0.d;
        this.f9148n = yVar;
        this.f9139c = new o4.l0[eVarArr.length];
        this.h = new boolean[eVarArr.length];
        long j11 = g1Var.f9154b;
        long j12 = g1Var.d;
        q1Var.getClass();
        Object obj = vVar.f16579a;
        int i10 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        o4.v b10 = vVar.b(pair.second);
        p1 p1Var = (p1) q1Var.d.get(obj2);
        p1Var.getClass();
        q1Var.f9388g.add(p1Var);
        o1 o1Var = (o1) q1Var.f9387f.get(p1Var);
        if (o1Var != null) {
            o1Var.f9350a.e(o1Var.f9351b);
        }
        p1Var.f9373c.add(b10);
        o4.n b11 = p1Var.f9371a.b(b10, qVar, j11);
        q1Var.f9385c.put(b11, p1Var);
        q1Var.c();
        this.f9137a = j12 != -9223372036854775807L ? new o4.d(b11, true, 0L, j12) : b11;
    }

    public final long a(f5.y yVar, long j10, boolean z4, boolean[] zArr) {
        e[] eVarArr;
        Object[] objArr;
        boolean z10;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= yVar.f6107a) {
                break;
            }
            if (z4 || !yVar.a(this.f9148n, i10)) {
                z11 = false;
            }
            this.h[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            eVarArr = this.f9143i;
            int length = eVarArr.length;
            objArr = this.f9139c;
            if (i11 >= length) {
                break;
            }
            if (eVarArr[i11].f9052b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f9148n = yVar;
        c();
        long g10 = this.f9137a.g(yVar.f6109c, this.h, this.f9139c, zArr, j10);
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (eVarArr[i12].f9052b == -2 && this.f9148n.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f9140e = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                h5.a.i(yVar.b(i13));
                if (eVarArr[i13].f9052b != -2) {
                    this.f9140e = true;
                }
            } else {
                if (yVar.f6109c[i13] == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h5.a.i(z10);
            }
        }
        return g10;
    }

    public final void b() {
        if (this.f9146l == null) {
            int i10 = 0;
            while (true) {
                f5.y yVar = this.f9148n;
                if (i10 < yVar.f6107a) {
                    boolean b10 = yVar.b(i10);
                    f5.c cVar = this.f9148n.f6109c[i10];
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
        if (this.f9146l == null) {
            int i10 = 0;
            while (true) {
                f5.y yVar = this.f9148n;
                if (i10 < yVar.f6107a) {
                    boolean b10 = yVar.b(i10);
                    f5.c cVar = this.f9148n.f6109c[i10];
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
            return this.f9141f.f9154b;
        }
        if (this.f9140e) {
            j10 = this.f9137a.r();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f9141f.f9156e;
        }
        return j10;
    }

    public final long e() {
        return this.f9141f.f9154b + this.f9149o;
    }

    public final void f() {
        b();
        ?? r02 = this.f9137a;
        try {
            boolean z4 = r02 instanceof o4.d;
            q1 q1Var = this.f9145k;
            if (z4) {
                q1Var.f(((o4.d) r02).f16451a);
            } else {
                q1Var.f(r02);
            }
        } catch (RuntimeException e6) {
            h5.a.p("MediaPeriodHolder", "Period release failed.", e6);
        }
    }

    public final f5.y g(float f10, o2 o2Var) {
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
        int i14;
        f5.k kVar;
        boolean z14;
        int[] iArr2;
        boolean z15;
        f5.t tVar = this.f9144j;
        e[] eVarArr = this.f9143i;
        o4.t0 t0Var = this.f9147m;
        tVar.getClass();
        int[] iArr3 = new int[eVarArr.length + 1];
        int length = eVarArr.length + 1;
        o4.s0[][] s0VarArr = new o4.s0[length];
        int[][][] iArr4 = new int[eVarArr.length + 1][];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = t0Var.f16576a;
            s0VarArr[i15] = new o4.s0[i16];
            iArr4[i15] = new int[i16];
        }
        int length2 = eVarArr.length;
        int[] iArr5 = new int[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            iArr5[i17] = eVarArr[i17].y();
        }
        int i18 = 0;
        while (i18 < t0Var.f16576a) {
            o4.s0 a2 = t0Var.a(i18);
            if (a2.f16573c == 5) {
                z14 = true;
            } else {
                z14 = false;
            }
            int length3 = eVarArr.length;
            int i19 = 0;
            int i20 = 0;
            boolean z16 = true;
            while (i20 < eVarArr.length) {
                e eVar = eVarArr[i20];
                f5.t tVar2 = tVar;
                int i21 = 0;
                for (int i22 = 0; i22 < a2.f16571a; i22++) {
                    i21 = Math.max(i21, eVar.x(a2.d[i22]) & 7);
                }
                if (iArr3[i20] == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i21 > i19 || (i21 == i19 && z14 && !z16 && z15)) {
                    i19 = i21;
                    z16 = z15;
                    length3 = i20;
                }
                i20++;
                tVar = tVar2;
            }
            f5.t tVar3 = tVar;
            if (length3 == eVarArr.length) {
                iArr2 = new int[a2.f16571a];
            } else {
                e eVar2 = eVarArr[length3];
                int[] iArr6 = new int[a2.f16571a];
                for (int i23 = 0; i23 < a2.f16571a; i23++) {
                    iArr6[i23] = eVar2.x(a2.d[i23]);
                }
                iArr2 = iArr6;
            }
            int i24 = iArr3[length3];
            s0VarArr[length3][i24] = a2;
            iArr4[length3][i24] = iArr2;
            iArr3[length3] = i24 + 1;
            i18++;
            tVar = tVar3;
        }
        f5.t tVar4 = tVar;
        o4.t0[] t0VarArr = new o4.t0[eVarArr.length];
        String[] strArr = new String[eVarArr.length];
        int[] iArr7 = new int[eVarArr.length];
        for (int i25 = 0; i25 < eVarArr.length; i25++) {
            int i26 = iArr3[i25];
            t0VarArr[i25] = new o4.t0((o4.s0[]) h5.d0.I(i26, s0VarArr[i25]));
            iArr4[i25] = (int[][]) h5.d0.I(i26, iArr4[i25]);
            strArr[i25] = eVarArr[i25].g();
            iArr7[i25] = eVarArr[i25].f9052b;
        }
        f5.s sVar2 = new f5.s(iArr7, t0VarArr, iArr5, iArr4, new o4.t0((o4.s0[]) h5.d0.I(iArr3[eVarArr.length], s0VarArr[eVarArr.length])));
        f5.p pVar = (f5.p) tVar4;
        synchronized (pVar.d) {
            try {
                hVar = pVar.h;
                if (hVar.W && h5.d0.f7237a >= 32 && (kVar = pVar.f6057i) != null) {
                    Looper myLooper = Looper.myLooper();
                    h5.a.j(myLooper);
                    kVar.b(pVar, myLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i27 = sVar2.f6061a;
        f5.q[] qVarArr = new f5.q[i27];
        int i28 = 2;
        Pair j13 = f5.p.j(2, sVar2, iArr4, new c1.b(9, hVar, iArr5), new e5.f(5));
        if (j13 != null) {
            qVarArr[((Integer) j13.second).intValue()] = (f5.q) j13.first;
        }
        int i29 = 0;
        while (true) {
            if (i29 < sVar2.f6061a) {
                if (2 == iArr7[i29] && t0VarArr[i29].f16576a > 0) {
                    z4 = true;
                    break;
                }
                i29++;
            } else {
                z4 = false;
                break;
            }
        }
        Pair j14 = f5.p.j(1, sVar2, iArr4, new com.google.firebase.messaging.i(pVar, hVar, z4, 1), new e5.f(6));
        if (j14 != null) {
            qVarArr[((Integer) j14.second).intValue()] = (f5.q) j14.first;
        }
        if (j14 == null) {
            str = null;
        } else {
            f5.q qVar3 = (f5.q) j14.first;
            str = qVar3.f6059a.d[qVar3.f6060b[0]].f9320c;
        }
        int i30 = 3;
        Pair j15 = f5.p.j(3, sVar2, iArr4, new c1.b(10, hVar, str), new e5.f(7));
        if (j15 != null) {
            qVarArr[((Integer) j15.second).intValue()] = (f5.q) j15.first;
        }
        int i31 = 0;
        while (i31 < i27) {
            int i32 = iArr7[i31];
            if (i32 != i28 && i32 != 1 && i32 != i30) {
                o4.t0 t0Var2 = t0VarArr[i31];
                int[][] iArr8 = iArr4[i31];
                int i33 = 0;
                o4.s0 s0Var2 = null;
                int i34 = 0;
                f5.f fVar2 = null;
                while (i33 < t0Var2.f16576a) {
                    o4.s0 a10 = t0Var2.a(i33);
                    int[] iArr9 = iArr8[i33];
                    int i35 = i33;
                    f5.f fVar3 = fVar2;
                    int i36 = 0;
                    while (i36 < a10.f16571a) {
                        int i37 = i31;
                        if (f5.p.f(iArr9[i36], hVar.X)) {
                            s0Var = a10;
                            f5.f fVar4 = new f5.f(a10.d[i36], iArr9[i36]);
                            if (fVar3 != null) {
                                i14 = i36;
                                if (s8.p.f47127a.c(fVar4.f6025b, fVar3.f6025b).c(fVar4.f6024a, fVar3.f6024a).e() <= 0) {
                                }
                            } else {
                                i14 = i36;
                            }
                            fVar3 = fVar4;
                            s0Var2 = s0Var;
                            i34 = i14;
                        } else {
                            s0Var = a10;
                            i14 = i36;
                        }
                        i36 = i14 + 1;
                        i31 = i37;
                        a10 = s0Var;
                    }
                    i33 = i35 + 1;
                    fVar2 = fVar3;
                }
                i13 = i31;
                if (s0Var2 == null) {
                    qVar2 = null;
                } else {
                    qVar2 = new f5.q(0, s0Var2, new int[]{i34});
                }
                qVarArr[i13] = qVar2;
            } else {
                i13 = i31;
            }
            i31 = i13 + 1;
            i28 = 2;
            i30 = 3;
        }
        Object obj2 = null;
        int i38 = sVar2.f6061a;
        o4.t0[] t0VarArr2 = sVar2.f6063c;
        HashMap hashMap = new HashMap();
        for (int i39 = 0; i39 < i38; i39++) {
            f5.p.c(t0VarArr2[i39], hVar, hashMap);
        }
        f5.p.c(sVar2.f6065f, hVar, hashMap);
        for (int i40 = 0; i40 < i38; i40++) {
            f5.v vVar = (f5.v) hashMap.get(Integer.valueOf(sVar2.f6062b[i40]));
            if (vVar != null) {
                o4.s0 s0Var3 = vVar.f6071a;
                s8.v vVar2 = vVar.f6072b;
                if (!vVar2.isEmpty() && t0VarArr2[i40].b(s0Var3) != -1) {
                    qVar = new f5.q(0, s0Var3, y7.d(vVar2));
                } else {
                    qVar = null;
                }
                qVarArr[i40] = qVar;
            }
        }
        int i41 = sVar2.f6061a;
        for (int i42 = 0; i42 < i41; i42++) {
            o4.t0 t0Var3 = sVar2.f6063c[i42];
            Map map = (Map) hVar.f6028b0.get(i42);
            if (map != null && map.containsKey(t0Var3)) {
                Map map2 = (Map) hVar.f6028b0.get(i42);
                if (map2 != null) {
                    f5.i iVar = (f5.i) map2.get(t0Var3);
                }
                qVarArr[i42] = null;
            }
        }
        for (int i43 = 0; i43 < i27; i43++) {
            int i44 = sVar2.f6062b[i43];
            if (hVar.f6029c0.get(i43) || hVar.M.contains(Integer.valueOf(i44))) {
                qVarArr[i43] = null;
            }
        }
        db.a aVar = pVar.f6055f;
        g5.f fVar5 = pVar.f6067b;
        h5.a.j(fVar5);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i45 = 0;
        while (i45 < qVarArr.length) {
            f5.q qVar4 = qVarArr[i45];
            if (qVar4 != null && qVar4.f6060b.length > 1) {
                s8.t tVar5 = s8.v.f47143b;
                com.google.android.gms.common.api.internal.w wVar = new com.google.android.gms.common.api.internal.w();
                wVar.b(new f5.a(0L, 0L));
                arrayList.add(wVar);
                obj = obj2;
            } else {
                obj = obj2;
                arrayList.add(obj);
            }
            i45++;
            obj2 = obj;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4];
        int i46 = 0;
        while (true) {
            j10 = -1;
            if (i46 >= qVarArr.length) {
                break;
            }
            f5.q qVar5 = qVarArr[i46];
            if (qVar5 == null) {
                jArr[i46] = new long[0];
                sVar = sVar2;
            } else {
                int[] iArr10 = qVar5.f6060b;
                jArr[i46] = new long[iArr10.length];
                int i47 = 0;
                while (i47 < iArr10.length) {
                    f5.s sVar3 = sVar2;
                    long j16 = qVar5.f6059a.d[iArr10[i47]].f9323n;
                    long[] jArr2 = jArr[i46];
                    if (j16 == -1) {
                        j16 = 0;
                    }
                    jArr2[i47] = j16;
                    i47++;
                    sVar2 = sVar3;
                }
                sVar = sVar2;
                Arrays.sort(jArr[i46]);
            }
            i46++;
            sVar2 = sVar;
        }
        f5.s sVar4 = sVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i48 = 0; i48 < length4; i48++) {
            long[] jArr4 = jArr[i48];
            if (jArr4.length == 0) {
                j12 = 0;
            } else {
                j12 = jArr4[0];
            }
            jArr3[i48] = j12;
        }
        f5.b.w(arrayList, jArr3);
        s8.l.c(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(s8.g0.f47104b);
        s8.d0 d0Var = new s8.d0();
        ?? obj3 = new Object();
        if (treeMap.isEmpty()) {
            obj3.d = treeMap;
            obj3.f47102f = d0Var;
            int i49 = 0;
            while (i49 < length4) {
                long[] jArr5 = jArr[i49];
                if (jArr5.length <= 1) {
                    fVar = fVar5;
                    i12 = length4;
                    j11 = j10;
                    iArr = iArr11;
                } else {
                    int length5 = jArr5.length;
                    double[] dArr = new double[length5];
                    j11 = j10;
                    int i50 = 0;
                    while (true) {
                        long[] jArr6 = jArr[i49];
                        fVar = fVar5;
                        double d10 = 0.0d;
                        if (i50 >= jArr6.length) {
                            break;
                        }
                        int i51 = length4;
                        int[] iArr12 = iArr11;
                        long j17 = jArr6[i50];
                        if (j17 != j11) {
                            d10 = Math.log(j17);
                        }
                        dArr[i50] = d10;
                        i50++;
                        length4 = i51;
                        iArr11 = iArr12;
                        fVar5 = fVar;
                    }
                    int i52 = length4;
                    iArr = iArr11;
                    int i53 = length5 - 1;
                    double d11 = dArr[i53] - dArr[0];
                    int i54 = 0;
                    while (i54 < i53) {
                        double d12 = dArr[i54];
                        i54++;
                        double d13 = (d12 + dArr[i54]) * 0.5d;
                        if (d11 == 0.0d) {
                            d = 1.0d;
                        } else {
                            d = (d13 - dArr[0]) / d11;
                        }
                        Double valueOf = Double.valueOf(d);
                        int i55 = i52;
                        Integer valueOf2 = Integer.valueOf(i49);
                        double d14 = d11;
                        Map map3 = obj3.d;
                        Collection collection = (Collection) map3.get(valueOf);
                        if (collection == null) {
                            List list = (List) obj3.f47102f.get();
                            if (list.add(valueOf2)) {
                                obj3.f47101e++;
                                map3.put(valueOf, list);
                            } else {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                        } else if (collection.add(valueOf2)) {
                            obj3.f47101e++;
                        }
                        i52 = i55;
                        d11 = d14;
                    }
                    i12 = i52;
                }
                i49++;
                iArr11 = iArr;
                j10 = j11;
                length4 = i12;
                fVar5 = fVar;
            }
            g5.f fVar6 = fVar5;
            int[] iArr13 = iArr11;
            l7.m mVar = obj3.f47112b;
            int i56 = 4;
            if (mVar == null) {
                mVar = new l7.m(4, (Serializable) obj3);
                obj3.f47112b = mVar;
            }
            s8.v t6 = s8.v.t(mVar);
            for (int i57 = 0; i57 < t6.size(); i57++) {
                int intValue = ((Integer) t6.get(i57)).intValue();
                int i58 = iArr13[intValue] + 1;
                iArr13[intValue] = i58;
                jArr3[intValue] = jArr[intValue][i58];
                f5.b.w(arrayList, jArr3);
            }
            for (int i59 = 0; i59 < qVarArr.length; i59++) {
                if (arrayList.get(i59) != null) {
                    jArr3[i59] = jArr3[i59] * 2;
                }
            }
            f5.b.w(arrayList, jArr3);
            s8.l.c(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i60 = 0;
            int i61 = 0;
            boolean z17 = false;
            while (i60 < arrayList.size()) {
                s8.s sVar5 = (s8.s) arrayList.get(i60);
                if (sVar5 == null) {
                    i11 = s8.i0.f47108e;
                } else {
                    i11 = sVar5.i();
                }
                i11.getClass();
                int i62 = i61 + 1;
                if (objArr.length < i62) {
                    objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i62));
                } else if (z17) {
                    objArr = (Object[]) objArr.clone();
                } else {
                    objArr[i61] = i11;
                    i60++;
                    i61++;
                }
                z17 = false;
                objArr[i61] = i11;
                i60++;
                i61++;
            }
            s8.i0 s6 = s8.v.s(i61, objArr);
            f5.c[] cVarArr2 = new f5.c[qVarArr.length];
            for (int i63 = 0; i63 < qVarArr.length; i63++) {
                f5.q qVar6 = qVarArr[i63];
                if (qVar6 != null) {
                    int[] iArr14 = qVar6.f6060b;
                    if (iArr14.length != 0) {
                        if (iArr14.length == 1) {
                            bVar = new f5.c(qVar6.f6059a, new int[]{iArr14[0]});
                        } else {
                            long j18 = 25000;
                            bVar = new f5.b(qVar6.f6059a, iArr14, fVar6, 10000, j18, j18, (s8.v) s6.get(i63));
                        }
                        cVarArr2[i63] = bVar;
                    }
                }
            }
            g2[] g2VarArr = new g2[i27];
            int i64 = 0;
            while (i64 < i27) {
                f5.s sVar6 = sVar4;
                int i65 = sVar6.f6062b[i64];
                if (!hVar.f6029c0.get(i64) && !hVar.M.contains(Integer.valueOf(i65)) && (sVar6.f6062b[i64] == -2 || cVarArr2[i64] != null)) {
                    g2Var = g2.f9160b;
                } else {
                    g2Var = null;
                }
                g2VarArr[i64] = g2Var;
                i64++;
                sVar4 = sVar6;
            }
            f5.s sVar7 = sVar4;
            if (hVar.Y) {
                int i66 = -1;
                int i67 = -1;
                for (int i68 = 0; i68 < sVar7.f6061a; i68++) {
                    int i69 = sVar7.f6062b[i68];
                    f5.c cVar = cVarArr2[i68];
                    if ((i69 == 1 || i69 == 2) && cVar != null) {
                        int[][] iArr15 = iArr4[i68];
                        int b10 = sVar7.f6063c[i68].b(cVar.l());
                        int i70 = 0;
                        while (true) {
                            if (i70 < cVar.p()) {
                                if ((iArr15[b10][cVar.f(i70)] & 32) != 32) {
                                    break;
                                }
                                i70++;
                            } else if (i69 == 1) {
                                i10 = -1;
                                if (i67 != -1) {
                                    z12 = false;
                                    break;
                                }
                                i67 = i68;
                            } else {
                                i10 = -1;
                                if (i66 != -1) {
                                    z12 = false;
                                    break;
                                }
                                i66 = i68;
                            }
                        }
                    }
                }
                i10 = -1;
                z12 = true;
                if (i67 != i10 && i66 != i10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 & z12) {
                    g2 g2Var2 = new g2(true);
                    g2VarArr[i67] = g2Var2;
                    g2VarArr[i66] = g2Var2;
                }
            }
            Pair create = Pair.create(g2VarArr, cVarArr2);
            f5.c[] cVarArr3 = (f5.c[]) create.second;
            List[] listArr = new List[cVarArr3.length];
            for (int i71 = 0; i71 < cVarArr3.length; i71++) {
                f5.c cVar2 = cVarArr3[i71];
                if (cVar2 != null) {
                    i0Var = s8.v.x(cVar2);
                } else {
                    s8.t tVar6 = s8.v.f47143b;
                    i0Var = s8.i0.f47108e;
                }
                listArr[i71] = i0Var;
            }
            ?? wVar2 = new com.google.android.gms.common.api.internal.w();
            int i72 = 0;
            while (true) {
                int i73 = sVar7.f6061a;
                o4.t0[] t0VarArr3 = sVar7.f6063c;
                if (i72 >= i73) {
                    break;
                }
                o4.t0 t0Var4 = t0VarArr3[i72];
                List list2 = listArr[i72];
                int i74 = 0;
                while (i74 < t0Var4.f16576a) {
                    o4.s0 a11 = t0Var4.a(i74);
                    int i75 = t0VarArr3[i72].a(i74).f16571a;
                    int[] iArr16 = new int[i75];
                    int i76 = 0;
                    for (int i77 = 0; i77 < i75; i77++) {
                        if ((sVar7.f6064e[i72][i74][i77] & 7) == i56) {
                            iArr16[i76] = i77;
                            i76++;
                        }
                    }
                    int[] copyOf = Arrays.copyOf(iArr16, i76);
                    List[] listArr2 = listArr;
                    String str2 = null;
                    int i78 = 0;
                    boolean z18 = false;
                    int i79 = 0;
                    int i80 = 16;
                    while (i78 < copyOf.length) {
                        String str3 = t0VarArr3[i72].a(i74).d[copyOf[i78]].C;
                        int i81 = i79 + 1;
                        if (i79 == 0) {
                            str2 = str3;
                        } else {
                            z18 = (!h5.d0.a(str2, str3)) | z18;
                        }
                        i80 = Math.min(i80, sVar7.f6064e[i72][i74][i78] & 24);
                        i78++;
                        i79 = i81;
                    }
                    if (z18) {
                        i80 = Math.min(i80, sVar7.d[i72]);
                    }
                    if (i80 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i82 = a11.f16571a;
                    int[] iArr17 = new int[i82];
                    boolean[] zArr = new boolean[i82];
                    for (int i83 = 0; i83 < a11.f16571a; i83++) {
                        iArr17[i83] = sVar7.f6064e[i72][i74][i83] & 7;
                        int i84 = 0;
                        while (true) {
                            if (i84 < list2.size()) {
                                f5.c cVar3 = (f5.c) list2.get(i84);
                                if (cVar3.l().equals(a11) && cVar3.m(i83) != -1) {
                                    z11 = true;
                                    break;
                                }
                                i84++;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        zArr[i83] = z11;
                    }
                    wVar2.b(new p2(a11, z10, iArr17, zArr));
                    i74++;
                    listArr = listArr2;
                    i56 = 4;
                }
                i72++;
                i56 = 4;
            }
            o4.t0 t0Var5 = sVar7.f6065f;
            for (int i85 = 0; i85 < t0Var5.f16576a; i85++) {
                o4.s0 a12 = t0Var5.a(i85);
                int[] iArr18 = new int[a12.f16571a];
                Arrays.fill(iArr18, 0);
                wVar2.b(new p2(a12, false, iArr18, new boolean[a12.f16571a]));
            }
            f5.y yVar = new f5.y((g2[]) create.first, (f5.c[]) create.second, new q2(wVar2.i()), sVar7);
            for (f5.c cVar4 : yVar.f6109c) {
                if (cVar4 != null) {
                    cVar4.s(f10);
                }
            }
            return yVar;
        }
        throw new IllegalArgumentException();
    }
}
