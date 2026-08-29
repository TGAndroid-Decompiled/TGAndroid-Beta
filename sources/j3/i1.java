package j3;

import android.os.Looper;
import android.util.Pair;
import i7.p7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public final class i1 {
    public final Object f10528a;
    public final Object f10529b;
    public final l4.c1[] f10530c;
    public boolean d;
    public boolean f10531e;
    public j1 f10532f;
    public boolean f10533g;
    public final boolean[] h;
    public final h2[] f10534i;
    public final d5.u f10535j;
    public final s1 f10536k;
    public i1 f10537l;
    public l4.k1 f10538m;
    public d5.y f10539n;
    public long f10540o;

    public i1(h2[] h2VarArr, long j10, d5.u uVar, com.google.android.exoplayer2.upstream.r rVar, s1 s1Var, j1 j1Var, d5.y yVar) {
        this.f10534i = h2VarArr;
        this.f10540o = j10;
        this.f10535j = uVar;
        this.f10536k = s1Var;
        l4.c0 c0Var = j1Var.f10552a;
        this.f10529b = c0Var.f14262a;
        this.f10532f = j1Var;
        this.f10538m = l4.k1.d;
        this.f10539n = yVar;
        this.f10530c = new l4.c1[h2VarArr.length];
        this.h = new boolean[h2VarArr.length];
        long j11 = j1Var.f10553b;
        long j12 = j1Var.d;
        s1Var.getClass();
        Object obj = c0Var.f14262a;
        int i10 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        l4.c0 b10 = c0Var.b(pair.second);
        r1 r1Var = (r1) s1Var.d.get(obj2);
        r1Var.getClass();
        s1Var.f10758g.add(r1Var);
        q1 q1Var = (q1) s1Var.f10757f.get(r1Var);
        if (q1Var != null) {
            q1Var.f10692a.e(q1Var.f10693b);
        }
        r1Var.f10727c.add(b10);
        l4.t b11 = r1Var.f10725a.b(b10, rVar, j11);
        s1Var.f10755c.put(b11, r1Var);
        s1Var.c();
        this.f10528a = j12 != -9223372036854775807L ? new l4.d(b11, true, 0L, j12) : b11;
    }

    public final long a(d5.y yVar, long j10, boolean z10, boolean[] zArr) {
        h2[] h2VarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= yVar.f5417a) {
                break;
            }
            if (z10 || !yVar.a(this.f10539n, i10)) {
                z12 = false;
            }
            this.h[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            h2VarArr = this.f10534i;
            int length = h2VarArr.length;
            objArr = this.f10530c;
            if (i11 >= length) {
                break;
            }
            if (h2VarArr[i11].getTrackType() == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f10539n = yVar;
        c();
        long A = this.f10528a.A(yVar.f5419c, this.h, this.f10530c, zArr, j10);
        for (int i12 = 0; i12 < h2VarArr.length; i12++) {
            if (h2VarArr[i12].getTrackType() == -2 && this.f10539n.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f10531e = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                f5.a.i(yVar.b(i13));
                if (h2VarArr[i13].getTrackType() != -2) {
                    this.f10531e = true;
                }
            } else {
                if (yVar.f5419c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f5.a.i(z11);
            }
        }
        return A;
    }

    public final void b() {
        if (this.f10537l == null) {
            int i10 = 0;
            while (true) {
                d5.y yVar = this.f10539n;
                if (i10 < yVar.f5417a) {
                    boolean b10 = yVar.b(i10);
                    d5.r rVar = this.f10539n.f5419c[i10];
                    if (b10 && rVar != null) {
                        rVar.k();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f10537l == null) {
            int i10 = 0;
            while (true) {
                d5.y yVar = this.f10539n;
                if (i10 < yVar.f5417a) {
                    boolean b10 = yVar.b(i10);
                    d5.r rVar = this.f10539n.f5419c[i10];
                    if (b10 && rVar != null) {
                        rVar.h();
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
            return this.f10532f.f10553b;
        }
        if (this.f10531e) {
            j10 = this.f10528a.L();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f10532f.f10555e;
        }
        return j10;
    }

    public final long e() {
        return this.f10532f.f10553b + this.f10540o;
    }

    public final void f() {
        b();
        ?? r02 = this.f10528a;
        try {
            boolean z10 = r02 instanceof l4.d;
            s1 s1Var = this.f10536k;
            if (z10) {
                s1Var.f(((l4.d) r02).f14292a);
            } else {
                s1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            f5.a.p("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final d5.y g(float f9, r2 r2Var) {
        d5.h hVar;
        boolean z10;
        String str;
        long j10;
        d5.r[] rVarArr;
        boolean z11;
        boolean z12;
        q8.l0 l0Var;
        int i10;
        boolean z13;
        boolean z14;
        i2 i2Var;
        d5.c bVar;
        q8.l0 c3;
        long j11;
        com.google.android.exoplayer2.upstream.f fVar;
        int[] iArr;
        int i11;
        double d;
        long j12;
        d5.t tVar;
        Object obj;
        d5.q qVar;
        int i12;
        d5.q qVar2;
        l4.j1 j1Var;
        int i13;
        d5.k kVar;
        boolean z15;
        int[] iArr2;
        boolean z16;
        d5.u uVar = this.f10535j;
        h2[] h2VarArr = this.f10534i;
        l4.k1 k1Var = this.f10538m;
        uVar.getClass();
        int[] iArr3 = new int[h2VarArr.length + 1];
        int length = h2VarArr.length + 1;
        l4.j1[][] j1VarArr = new l4.j1[length];
        int[][][] iArr4 = new int[h2VarArr.length + 1][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = k1Var.f14357a;
            j1VarArr[i14] = new l4.j1[i15];
            iArr4[i14] = new int[i15];
        }
        int length2 = h2VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr5[i16] = h2VarArr[i16].supportsMixedMimeTypeAdaptation();
        }
        int i17 = 0;
        while (i17 < k1Var.f14357a) {
            l4.j1 a2 = k1Var.a(i17);
            if (a2.f14349c == 5) {
                z15 = true;
            } else {
                z15 = false;
            }
            int length3 = h2VarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z17 = true;
            while (i19 < h2VarArr.length) {
                h2 h2Var = h2VarArr[i19];
                d5.u uVar2 = uVar;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.f14347a; i21++) {
                    i20 = Math.max(i20, h2Var.supportsFormat(a2.d[i21]) & 7);
                }
                if (iArr3[i19] == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i20 > i18 || (i20 == i18 && z15 && !z17 && z16)) {
                    i18 = i20;
                    z17 = z16;
                    length3 = i19;
                }
                i19++;
                uVar = uVar2;
            }
            d5.u uVar3 = uVar;
            if (length3 == h2VarArr.length) {
                iArr2 = new int[a2.f14347a];
            } else {
                h2 h2Var2 = h2VarArr[length3];
                int[] iArr6 = new int[a2.f14347a];
                for (int i22 = 0; i22 < a2.f14347a; i22++) {
                    iArr6[i22] = h2Var2.supportsFormat(a2.d[i22]);
                }
                iArr2 = iArr6;
            }
            int i23 = iArr3[length3];
            j1VarArr[length3][i23] = a2;
            iArr4[length3][i23] = iArr2;
            iArr3[length3] = i23 + 1;
            i17++;
            uVar = uVar3;
        }
        d5.u uVar4 = uVar;
        l4.k1[] k1VarArr = new l4.k1[h2VarArr.length];
        String[] strArr = new String[h2VarArr.length];
        int[] iArr7 = new int[h2VarArr.length];
        for (int i24 = 0; i24 < h2VarArr.length; i24++) {
            int i25 = iArr3[i24];
            k1VarArr[i24] = new l4.k1((l4.j1[]) f5.d0.J(i25, j1VarArr[i24]));
            iArr4[i24] = (int[][]) f5.d0.J(i25, iArr4[i24]);
            strArr[i24] = h2VarArr[i24].getName();
            iArr7[i24] = h2VarArr[i24].getTrackType();
        }
        d5.t tVar2 = new d5.t(iArr7, k1VarArr, iArr5, iArr4, new l4.k1((l4.j1[]) f5.d0.J(iArr3[h2VarArr.length], j1VarArr[h2VarArr.length])));
        d5.p pVar = (d5.p) uVar4;
        synchronized (pVar.d) {
            try {
                hVar = pVar.h;
                if (hVar.V && f5.d0.f6579a >= 32 && (kVar = pVar.f5368i) != null) {
                    Looper myLooper = Looper.myLooper();
                    f5.a.j(myLooper);
                    kVar.b(pVar, myLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i26 = tVar2.f5372a;
        d5.q[] qVarArr = new d5.q[i26];
        int i27 = 2;
        Pair i28 = d5.p.i(2, tVar2, iArr4, new a9.s(7, hVar, iArr5), new c5.e(8));
        if (i28 != null) {
            qVarArr[((Integer) i28.second).intValue()] = (d5.q) i28.first;
        }
        int i29 = 0;
        while (true) {
            if (i29 < tVar2.f5372a) {
                if (2 == iArr7[i29] && k1VarArr[i29].f14357a > 0) {
                    z10 = true;
                    break;
                }
                i29++;
            } else {
                z10 = false;
                break;
            }
        }
        Pair i30 = d5.p.i(1, tVar2, iArr4, new com.google.firebase.messaging.i(pVar, hVar, z10, 1), new c5.e(9));
        if (i30 != null) {
            qVarArr[((Integer) i30.second).intValue()] = (d5.q) i30.first;
        }
        if (i30 == null) {
            str = null;
        } else {
            d5.q qVar3 = (d5.q) i30.first;
            str = qVar3.f5370a.d[qVar3.f5371b[0]].f10799c;
        }
        int i31 = 3;
        Pair i32 = d5.p.i(3, tVar2, iArr4, new a9.s(8, hVar, str), new c5.e(10));
        if (i32 != null) {
            qVarArr[((Integer) i32.second).intValue()] = (d5.q) i32.first;
        }
        int i33 = 0;
        while (i33 < i26) {
            int i34 = iArr7[i33];
            if (i34 != i27 && i34 != 1 && i34 != i31) {
                l4.k1 k1Var2 = k1VarArr[i33];
                int[][] iArr8 = iArr4[i33];
                l4.j1 j1Var2 = null;
                int i35 = 0;
                int i36 = 0;
                d5.f fVar2 = null;
                while (i35 < k1Var2.f14357a) {
                    l4.j1 a10 = k1Var2.a(i35);
                    int[] iArr9 = iArr8[i35];
                    d5.f fVar3 = fVar2;
                    int i37 = i36;
                    l4.j1 j1Var3 = j1Var2;
                    int i38 = 0;
                    while (i38 < a10.f14347a) {
                        int i39 = i33;
                        if (d5.p.f(iArr9[i38], hVar.W)) {
                            j1Var = a10;
                            d5.f fVar4 = new d5.f(a10.d[i38], iArr9[i38]);
                            if (fVar3 != null) {
                                i13 = i38;
                                if (q8.t.f46493a.c(fVar4.f5338b, fVar3.f5338b).c(fVar4.f5337a, fVar3.f5337a).e() <= 0) {
                                }
                            } else {
                                i13 = i38;
                            }
                            fVar3 = fVar4;
                            j1Var3 = j1Var;
                            i37 = i13;
                        } else {
                            j1Var = a10;
                            i13 = i38;
                        }
                        i38 = i13 + 1;
                        i33 = i39;
                        a10 = j1Var;
                    }
                    i35++;
                    j1Var2 = j1Var3;
                    i36 = i37;
                    fVar2 = fVar3;
                }
                i12 = i33;
                if (j1Var2 == null) {
                    qVar2 = null;
                } else {
                    qVar2 = new d5.q(0, j1Var2, new int[]{i36});
                }
                qVarArr[i12] = qVar2;
            } else {
                i12 = i33;
            }
            i33 = i12 + 1;
            i31 = 3;
            i27 = 2;
        }
        Object obj2 = null;
        int i40 = tVar2.f5372a;
        l4.k1[] k1VarArr2 = tVar2.f5374c;
        HashMap hashMap = new HashMap();
        for (int i41 = 0; i41 < i40; i41++) {
            d5.p.c(k1VarArr2[i41], hVar, hashMap);
        }
        d5.p.c(tVar2.f5376f, hVar, hashMap);
        for (int i42 = 0; i42 < i40; i42++) {
            d5.v vVar = (d5.v) hashMap.get(Integer.valueOf(tVar2.f5373b[i42]));
            if (vVar != null) {
                l4.j1 j1Var4 = vVar.f5381a;
                q8.z zVar = vVar.f5382b;
                if (!zVar.isEmpty() && k1VarArr2[i42].b(j1Var4) != -1) {
                    qVar = new d5.q(0, j1Var4, p7.e(zVar));
                } else {
                    qVar = null;
                }
                qVarArr[i42] = qVar;
            }
        }
        int i43 = tVar2.f5372a;
        for (int i44 = 0; i44 < i43; i44++) {
            l4.k1 k1Var3 = tVar2.f5374c[i44];
            Map map = (Map) hVar.Z.get(i44);
            if (map != null && map.containsKey(k1Var3)) {
                Map map2 = (Map) hVar.Z.get(i44);
                if (map2 != null) {
                    d5.i iVar = (d5.i) map2.get(k1Var3);
                }
                qVarArr[i44] = null;
            }
        }
        for (int i45 = 0; i45 < i26; i45++) {
            int i46 = tVar2.f5373b[i45];
            if (hVar.f5340a0.get(i45) || hVar.L.contains(Integer.valueOf(i46))) {
                qVarArr[i45] = null;
            }
        }
        ab.b bVar2 = pVar.f5366f;
        com.google.android.exoplayer2.upstream.f fVar5 = pVar.f5378b;
        f5.a.j(fVar5);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i47 = 0;
        while (i47 < qVarArr.length) {
            d5.q qVar4 = qVarArr[i47];
            if (qVar4 != null && qVar4.f5371b.length > 1) {
                q8.x xVar = q8.z.f46511b;
                q8.w wVar = new q8.w();
                wVar.a(new d5.a(0L, 0L));
                arrayList.add(wVar);
                obj = obj2;
            } else {
                obj = obj2;
                arrayList.add(obj);
            }
            i47++;
            obj2 = obj;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4];
        int i48 = 0;
        while (true) {
            j10 = -1;
            if (i48 >= qVarArr.length) {
                break;
            }
            d5.q qVar5 = qVarArr[i48];
            if (qVar5 == null) {
                jArr[i48] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr10 = qVar5.f5371b;
                jArr[i48] = new long[iArr10.length];
                int i49 = 0;
                while (i49 < iArr10.length) {
                    d5.t tVar3 = tVar2;
                    long j13 = qVar5.f5370a.d[iArr10[i49]].f10802n;
                    long[] jArr2 = jArr[i48];
                    if (j13 == -1) {
                        j13 = 0;
                    }
                    jArr2[i49] = j13;
                    i49++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i48]);
            }
            i48++;
            tVar2 = tVar;
        }
        d5.t tVar4 = tVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i50 = 0; i50 < length4; i50++) {
            long[] jArr4 = jArr[i50];
            if (jArr4.length == 0) {
                j12 = 0;
            } else {
                j12 = jArr4[0];
            }
            jArr3[i50] = j12;
        }
        d5.b.v(arrayList, jArr3);
        q8.l.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(q8.j0.f46456b);
        q8.g0 g0Var = new q8.g0();
        ?? obj3 = new Object();
        if (treeMap.isEmpty()) {
            obj3.d = treeMap;
            obj3.f46454f = g0Var;
            int i51 = 0;
            while (i51 < length4) {
                long[] jArr5 = jArr[i51];
                if (jArr5.length <= 1) {
                    fVar = fVar5;
                    i11 = length4;
                    j11 = j10;
                    iArr = iArr11;
                } else {
                    int length5 = jArr5.length;
                    double[] dArr = new double[length5];
                    j11 = j10;
                    int i52 = 0;
                    while (true) {
                        long[] jArr6 = jArr[i51];
                        fVar = fVar5;
                        double d10 = 0.0d;
                        if (i52 >= jArr6.length) {
                            break;
                        }
                        int i53 = length4;
                        int[] iArr12 = iArr11;
                        long j14 = jArr6[i52];
                        if (j14 != j11) {
                            d10 = Math.log(j14);
                        }
                        dArr[i52] = d10;
                        i52++;
                        length4 = i53;
                        iArr11 = iArr12;
                        fVar5 = fVar;
                    }
                    int i54 = length4;
                    iArr = iArr11;
                    int i55 = length5 - 1;
                    double d11 = dArr[i55] - dArr[0];
                    int i56 = 0;
                    while (i56 < i55) {
                        double d12 = dArr[i56];
                        i56++;
                        double d13 = (d12 + dArr[i56]) * 0.5d;
                        if (d11 == 0.0d) {
                            d = 1.0d;
                        } else {
                            d = (d13 - dArr[0]) / d11;
                        }
                        Double valueOf = Double.valueOf(d);
                        int i57 = i54;
                        Integer valueOf2 = Integer.valueOf(i51);
                        double d14 = d11;
                        Map map3 = obj3.d;
                        Collection collection = (Collection) map3.get(valueOf);
                        if (collection == null) {
                            List list = (List) obj3.f46454f.get();
                            if (list.add(valueOf2)) {
                                obj3.f46453e++;
                                map3.put(valueOf, list);
                            } else {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                        } else if (collection.add(valueOf2)) {
                            obj3.f46453e++;
                        }
                        i54 = i57;
                        d11 = d14;
                    }
                    i11 = i54;
                }
                i51++;
                iArr11 = iArr;
                j10 = j11;
                length4 = i11;
                fVar5 = fVar;
            }
            com.google.android.exoplayer2.upstream.f fVar6 = fVar5;
            int[] iArr13 = iArr11;
            j7.m mVar = obj3.f46460b;
            int i58 = 4;
            if (mVar == null) {
                mVar = new j7.m(4, (Serializable) obj3);
                obj3.f46460b = mVar;
            }
            q8.z u10 = q8.z.u(mVar);
            for (int i59 = 0; i59 < u10.size(); i59++) {
                int intValue = ((Integer) u10.get(i59)).intValue();
                int i60 = iArr13[intValue] + 1;
                iArr13[intValue] = i60;
                jArr3[intValue] = jArr[intValue][i60];
                d5.b.v(arrayList, jArr3);
            }
            for (int i61 = 0; i61 < qVarArr.length; i61++) {
                if (arrayList.get(i61) != null) {
                    jArr3[i61] = jArr3[i61] * 2;
                }
            }
            d5.b.v(arrayList, jArr3);
            q8.l.a(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i62 = 0;
            int i63 = 0;
            while (i62 < arrayList.size()) {
                q8.w wVar2 = (q8.w) arrayList.get(i62);
                if (wVar2 == null) {
                    c3 = q8.l0.f46462e;
                } else {
                    c3 = wVar2.c();
                }
                c3.getClass();
                int i64 = i63 + 1;
                if (objArr.length < i64) {
                    objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i64));
                }
                objArr[i63] = c3;
                i62++;
                i63 = i64;
            }
            q8.l0 s10 = q8.z.s(i63, objArr);
            d5.r[] rVarArr2 = new d5.r[qVarArr.length];
            for (int i65 = 0; i65 < qVarArr.length; i65++) {
                d5.q qVar6 = qVarArr[i65];
                if (qVar6 != null) {
                    int[] iArr14 = qVar6.f5371b;
                    if (iArr14.length != 0) {
                        if (iArr14.length == 1) {
                            bVar = new d5.c(qVar6.f5370a, new int[]{iArr14[0]});
                        } else {
                            long j15 = 25000;
                            bVar = new d5.b(qVar6.f5370a, iArr14, fVar6, 10000, j15, j15, (q8.z) s10.get(i65));
                        }
                        rVarArr2[i65] = bVar;
                    }
                }
            }
            i2[] i2VarArr = new i2[i26];
            int i66 = 0;
            while (i66 < i26) {
                d5.t tVar5 = tVar4;
                int i67 = tVar5.f5373b[i66];
                if (!hVar.f5340a0.get(i66) && !hVar.L.contains(Integer.valueOf(i67)) && (tVar5.f5373b[i66] == -2 || rVarArr2[i66] != null)) {
                    i2Var = i2.f10541b;
                } else {
                    i2Var = null;
                }
                i2VarArr[i66] = i2Var;
                i66++;
                tVar4 = tVar5;
            }
            d5.t tVar6 = tVar4;
            if (hVar.X) {
                int i68 = -1;
                int i69 = -1;
                for (int i70 = 0; i70 < tVar6.f5372a; i70++) {
                    int i71 = tVar6.f5373b[i70];
                    d5.r rVar = rVarArr2[i70];
                    if ((i71 == 1 || i71 == 2) && rVar != null) {
                        int[][] iArr15 = iArr4[i70];
                        int b10 = tVar6.f5374c[i70].b(rVar.a());
                        int i72 = 0;
                        while (true) {
                            if (i72 < rVar.length()) {
                                if ((iArr15[b10][rVar.i(i72)] & 32) != 32) {
                                    break;
                                }
                                i72++;
                            } else if (i71 == 1) {
                                i10 = -1;
                                if (i69 != -1) {
                                    z13 = false;
                                    break;
                                }
                                i69 = i70;
                            } else {
                                i10 = -1;
                                if (i68 != -1) {
                                    z13 = false;
                                    break;
                                }
                                i68 = i70;
                            }
                        }
                    }
                }
                i10 = -1;
                z13 = true;
                if (i69 != i10 && i68 != i10) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 & z13) {
                    i2 i2Var2 = new i2(true);
                    i2VarArr[i69] = i2Var2;
                    i2VarArr[i68] = i2Var2;
                }
            }
            Pair create = Pair.create(i2VarArr, rVarArr2);
            d5.r[] rVarArr3 = (d5.r[]) create.second;
            List[] listArr = new List[rVarArr3.length];
            for (int i73 = 0; i73 < rVarArr3.length; i73++) {
                d5.r rVar2 = rVarArr3[i73];
                if (rVar2 != null) {
                    l0Var = q8.z.y(rVar2);
                } else {
                    q8.x xVar2 = q8.z.f46511b;
                    l0Var = q8.l0.f46462e;
                }
                listArr[i73] = l0Var;
            }
            q8.w wVar3 = new q8.w();
            int i74 = 0;
            while (true) {
                int i75 = tVar6.f5372a;
                l4.k1[] k1VarArr3 = tVar6.f5374c;
                if (i74 >= i75) {
                    break;
                }
                l4.k1 k1Var4 = k1VarArr3[i74];
                List list2 = listArr[i74];
                int i76 = 0;
                while (i76 < k1Var4.f14357a) {
                    l4.j1 a11 = k1Var4.a(i76);
                    int i77 = k1VarArr3[i74].a(i76).f14347a;
                    int[] iArr16 = new int[i77];
                    int i78 = 0;
                    for (int i79 = 0; i79 < i77; i79++) {
                        if ((tVar6.f5375e[i74][i76][i79] & 7) == i58) {
                            iArr16[i78] = i79;
                            i78++;
                        }
                    }
                    int[] copyOf = Arrays.copyOf(iArr16, i78);
                    List[] listArr2 = listArr;
                    String str2 = null;
                    int i80 = 0;
                    boolean z18 = false;
                    int i81 = 0;
                    int i82 = 16;
                    while (i80 < copyOf.length) {
                        String str3 = k1VarArr3[i74].a(i76).d[copyOf[i80]].B;
                        int i83 = i81 + 1;
                        if (i81 == 0) {
                            str2 = str3;
                        } else {
                            z18 = (!f5.d0.a(str2, str3)) | z18;
                        }
                        i82 = Math.min(i82, tVar6.f5375e[i74][i76][i80] & 24);
                        i80++;
                        i81 = i83;
                    }
                    if (z18) {
                        i82 = Math.min(i82, tVar6.d[i74]);
                    }
                    if (i82 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i84 = a11.f14347a;
                    int[] iArr17 = new int[i84];
                    boolean[] zArr = new boolean[i84];
                    for (int i85 = 0; i85 < a11.f14347a; i85++) {
                        iArr17[i85] = tVar6.f5375e[i74][i76][i85] & 7;
                        int i86 = 0;
                        while (true) {
                            if (i86 < list2.size()) {
                                d5.r rVar3 = (d5.r) list2.get(i86);
                                if (rVar3.a().equals(a11) && rVar3.u(i85) != -1) {
                                    z12 = true;
                                    break;
                                }
                                i86++;
                            } else {
                                z12 = false;
                                break;
                            }
                        }
                        zArr[i85] = z12;
                    }
                    wVar3.a(new s2(a11, z11, iArr17, zArr));
                    i76++;
                    listArr = listArr2;
                    i58 = 4;
                }
                i74++;
                i58 = 4;
            }
            l4.k1 k1Var5 = tVar6.f5376f;
            for (int i87 = 0; i87 < k1Var5.f14357a; i87++) {
                l4.j1 a12 = k1Var5.a(i87);
                int[] iArr18 = new int[a12.f14347a];
                Arrays.fill(iArr18, 0);
                wVar3.a(new s2(a12, false, iArr18, new boolean[a12.f14347a]));
            }
            d5.y yVar = new d5.y((i2[]) create.first, (d5.r[]) create.second, new t2(wVar3.c()), tVar6);
            for (d5.r rVar4 : yVar.f5419c) {
                if (rVar4 != null) {
                    rVar4.q(f9);
                }
            }
            return yVar;
        }
        throw new IllegalArgumentException();
    }
}
