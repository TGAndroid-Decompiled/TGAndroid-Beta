package h3;

import android.os.Looper;
import android.util.Pair;
import g7.r6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public final class i1 {
    public final Object f9491a;
    public final Object f9492b;
    public final j4.b1[] f9493c;
    public boolean d;
    public boolean f9494e;
    public j1 f9495f;
    public boolean f9496g;
    public final boolean[] h;
    public final h2[] f9497i;
    public final b5.w f9498j;
    public final s1 f9499k;
    public i1 f9500l;
    public j4.j1 f9501m;
    public b5.a0 f9502n;
    public long f9503o;

    public i1(h2[] h2VarArr, long j10, b5.w wVar, com.google.android.exoplayer2.upstream.r rVar, s1 s1Var, j1 j1Var, b5.a0 a0Var) {
        this.f9497i = h2VarArr;
        this.f9503o = j10;
        this.f9498j = wVar;
        this.f9499k = s1Var;
        j4.d0 d0Var = j1Var.f9515a;
        this.f9492b = d0Var.f13426a;
        this.f9495f = j1Var;
        this.f9501m = j4.j1.d;
        this.f9502n = a0Var;
        this.f9493c = new j4.b1[h2VarArr.length];
        this.h = new boolean[h2VarArr.length];
        long j11 = j1Var.f9516b;
        long j12 = j1Var.d;
        s1Var.getClass();
        Object obj = d0Var.f13426a;
        int i9 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        j4.d0 b10 = d0Var.b(pair.second);
        r1 r1Var = (r1) s1Var.d.get(obj2);
        r1Var.getClass();
        s1Var.f9721g.add(r1Var);
        q1 q1Var = (q1) s1Var.f9720f.get(r1Var);
        if (q1Var != null) {
            q1Var.f9655a.e(q1Var.f9656b);
        }
        r1Var.f9690c.add(b10);
        j4.u b11 = r1Var.f9688a.b(b10, rVar, j11);
        s1Var.f9718c.put(b11, r1Var);
        s1Var.c();
        this.f9491a = j12 != -9223372036854775807L ? new j4.e(b11, true, 0L, j12) : b11;
    }

    public final long a(b5.a0 a0Var, long j10, boolean z10, boolean[] zArr) {
        h2[] h2VarArr;
        Object[] objArr;
        boolean z11;
        int i9 = 0;
        while (true) {
            boolean z12 = true;
            if (i9 >= a0Var.f1425a) {
                break;
            }
            if (z10 || !a0Var.a(this.f9502n, i9)) {
                z12 = false;
            }
            this.h[i9] = z12;
            i9++;
        }
        int i10 = 0;
        while (true) {
            h2VarArr = this.f9497i;
            int length = h2VarArr.length;
            objArr = this.f9493c;
            if (i10 >= length) {
                break;
            }
            if (h2VarArr[i10].getTrackType() == -2) {
                objArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f9502n = a0Var;
        c();
        long x10 = this.f9491a.x(a0Var.f1427c, this.h, this.f9493c, zArr, j10);
        for (int i11 = 0; i11 < h2VarArr.length; i11++) {
            if (h2VarArr[i11].getTrackType() == -2 && this.f9502n.b(i11)) {
                objArr[i11] = new Object();
            }
        }
        this.f9494e = false;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] != null) {
                d5.a.i(a0Var.b(i12));
                if (h2VarArr[i12].getTrackType() != -2) {
                    this.f9494e = true;
                }
            } else {
                if (a0Var.f1427c[i12] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d5.a.i(z11);
            }
        }
        return x10;
    }

    public final void b() {
        if (this.f9500l == null) {
            int i9 = 0;
            while (true) {
                b5.a0 a0Var = this.f9502n;
                if (i9 < a0Var.f1425a) {
                    boolean b10 = a0Var.b(i9);
                    b5.t tVar = this.f9502n.f1427c[i9];
                    if (b10 && tVar != null) {
                        tVar.l();
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f9500l == null) {
            int i9 = 0;
            while (true) {
                b5.a0 a0Var = this.f9502n;
                if (i9 < a0Var.f1425a) {
                    boolean b10 = a0Var.b(i9);
                    b5.t tVar = this.f9502n.f1427c[i9];
                    if (b10 && tVar != null) {
                        tVar.i();
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j10;
        if (!this.d) {
            return this.f9495f.f9516b;
        }
        if (this.f9494e) {
            j10 = this.f9491a.v();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f9495f.f9518e;
        }
        return j10;
    }

    public final long e() {
        return this.f9495f.f9516b + this.f9503o;
    }

    public final void f() {
        b();
        ?? r02 = this.f9491a;
        try {
            boolean z10 = r02 instanceof j4.e;
            s1 s1Var = this.f9499k;
            if (z10) {
                s1Var.f(((j4.e) r02).f13436a);
            } else {
                s1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            d5.a.p("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final b5.a0 g(float f10, r2 r2Var) {
        b5.j jVar;
        boolean z10;
        String str;
        long j10;
        b5.t[] tVarArr;
        boolean z11;
        boolean z12;
        o8.l0 l0Var;
        int i9;
        boolean z13;
        boolean z14;
        i2 i2Var;
        b5.c bVar;
        o8.l0 c10;
        long j11;
        com.google.android.exoplayer2.upstream.f fVar;
        int[] iArr;
        int i10;
        double d;
        long j12;
        b5.v vVar;
        Object obj;
        b5.s sVar;
        int i11;
        b5.s sVar2;
        j4.i1 i1Var;
        int i12;
        b5.m mVar;
        boolean z15;
        int[] iArr2;
        boolean z16;
        b5.w wVar = this.f9498j;
        h2[] h2VarArr = this.f9497i;
        j4.j1 j1Var = this.f9501m;
        wVar.getClass();
        int[] iArr3 = new int[h2VarArr.length + 1];
        int length = h2VarArr.length + 1;
        j4.i1[][] i1VarArr = new j4.i1[length];
        int[][][] iArr4 = new int[h2VarArr.length + 1][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = j1Var.f13491a;
            i1VarArr[i13] = new j4.i1[i14];
            iArr4[i13] = new int[i14];
        }
        int length2 = h2VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr5[i15] = h2VarArr[i15].supportsMixedMimeTypeAdaptation();
        }
        int i16 = 0;
        while (i16 < j1Var.f13491a) {
            j4.i1 a2 = j1Var.a(i16);
            if (a2.f13483c == 5) {
                z15 = true;
            } else {
                z15 = false;
            }
            int length3 = h2VarArr.length;
            int i17 = 0;
            int i18 = 0;
            boolean z17 = true;
            while (i18 < h2VarArr.length) {
                h2 h2Var = h2VarArr[i18];
                b5.w wVar2 = wVar;
                int i19 = 0;
                for (int i20 = 0; i20 < a2.f13481a; i20++) {
                    i19 = Math.max(i19, h2Var.supportsFormat(a2.d[i20]) & 7);
                }
                if (iArr3[i18] == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i19 > i17 || (i19 == i17 && z15 && !z17 && z16)) {
                    i17 = i19;
                    z17 = z16;
                    length3 = i18;
                }
                i18++;
                wVar = wVar2;
            }
            b5.w wVar3 = wVar;
            if (length3 == h2VarArr.length) {
                iArr2 = new int[a2.f13481a];
            } else {
                h2 h2Var2 = h2VarArr[length3];
                int[] iArr6 = new int[a2.f13481a];
                for (int i21 = 0; i21 < a2.f13481a; i21++) {
                    iArr6[i21] = h2Var2.supportsFormat(a2.d[i21]);
                }
                iArr2 = iArr6;
            }
            int i22 = iArr3[length3];
            i1VarArr[length3][i22] = a2;
            iArr4[length3][i22] = iArr2;
            iArr3[length3] = i22 + 1;
            i16++;
            wVar = wVar3;
        }
        b5.w wVar4 = wVar;
        j4.j1[] j1VarArr = new j4.j1[h2VarArr.length];
        String[] strArr = new String[h2VarArr.length];
        int[] iArr7 = new int[h2VarArr.length];
        for (int i23 = 0; i23 < h2VarArr.length; i23++) {
            int i24 = iArr3[i23];
            j1VarArr[i23] = new j4.j1((j4.i1[]) d5.f0.J(i24, i1VarArr[i23]));
            iArr4[i23] = (int[][]) d5.f0.J(i24, iArr4[i23]);
            strArr[i23] = h2VarArr[i23].getName();
            iArr7[i23] = h2VarArr[i23].getTrackType();
        }
        b5.v vVar2 = new b5.v(iArr7, j1VarArr, iArr5, iArr4, new j4.j1((j4.i1[]) d5.f0.J(iArr3[h2VarArr.length], i1VarArr[h2VarArr.length])));
        b5.r rVar = (b5.r) wVar4;
        synchronized (rVar.d) {
            try {
                jVar = rVar.h;
                if (jVar.V && d5.f0.f4349a >= 32 && (mVar = rVar.f1494i) != null) {
                    Looper myLooper = Looper.myLooper();
                    d5.a.j(myLooper);
                    mVar.b(rVar, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i25 = vVar2.f1498a;
        b5.s[] sVarArr = new b5.s[i25];
        int i26 = 2;
        Pair i27 = b5.r.i(2, vVar2, iArr4, new b5.d(0, jVar, iArr5), new a5.e(5));
        if (i27 != null) {
            sVarArr[((Integer) i27.second).intValue()] = (b5.s) i27.first;
        }
        int i28 = 0;
        while (true) {
            if (i28 < vVar2.f1498a) {
                if (2 == iArr7[i28] && j1VarArr[i28].f13491a > 0) {
                    z10 = true;
                    break;
                }
                i28++;
            } else {
                z10 = false;
                break;
            }
        }
        Pair i29 = b5.r.i(1, vVar2, iArr4, new b5.e(rVar, jVar, z10, 0), new a5.e(6));
        if (i29 != null) {
            sVarArr[((Integer) i29.second).intValue()] = (b5.s) i29.first;
        }
        if (i29 == null) {
            str = null;
        } else {
            b5.s sVar3 = (b5.s) i29.first;
            str = sVar3.f1496a.d[sVar3.f1497b[0]].f9762c;
        }
        int i30 = 3;
        Pair i31 = b5.r.i(3, vVar2, iArr4, new b5.d(1, jVar, str), new a5.e(7));
        if (i31 != null) {
            sVarArr[((Integer) i31.second).intValue()] = (b5.s) i31.first;
        }
        int i32 = 0;
        while (i32 < i25) {
            int i33 = iArr7[i32];
            if (i33 != i26 && i33 != 1 && i33 != i30) {
                j4.j1 j1Var2 = j1VarArr[i32];
                int[][] iArr8 = iArr4[i32];
                int i34 = 0;
                j4.i1 i1Var2 = null;
                int i35 = 0;
                b5.h hVar = null;
                while (i34 < j1Var2.f13491a) {
                    j4.i1 a3 = j1Var2.a(i34);
                    int[] iArr9 = iArr8[i34];
                    int i36 = i34;
                    b5.h hVar2 = hVar;
                    int i37 = 0;
                    while (i37 < a3.f13481a) {
                        int i38 = i32;
                        if (b5.r.f(iArr9[i37], jVar.W)) {
                            i1Var = a3;
                            b5.h hVar3 = new b5.h(a3.d[i37], iArr9[i37]);
                            if (hVar2 != null) {
                                i12 = i37;
                                if (o8.t.f19087a.c(hVar3.f1464b, hVar2.f1464b).c(hVar3.f1463a, hVar2.f1463a).e() <= 0) {
                                }
                            } else {
                                i12 = i37;
                            }
                            hVar2 = hVar3;
                            i1Var2 = i1Var;
                            i35 = i12;
                        } else {
                            i1Var = a3;
                            i12 = i37;
                        }
                        i37 = i12 + 1;
                        i32 = i38;
                        a3 = i1Var;
                    }
                    i34 = i36 + 1;
                    hVar = hVar2;
                }
                i11 = i32;
                if (i1Var2 == null) {
                    sVar2 = null;
                } else {
                    sVar2 = new b5.s(0, i1Var2, new int[]{i35});
                }
                sVarArr[i11] = sVar2;
            } else {
                i11 = i32;
            }
            i32 = i11 + 1;
            i26 = 2;
            i30 = 3;
        }
        Object obj2 = null;
        int i39 = vVar2.f1498a;
        j4.j1[] j1VarArr2 = vVar2.f1500c;
        HashMap hashMap = new HashMap();
        for (int i40 = 0; i40 < i39; i40++) {
            b5.r.c(j1VarArr2[i40], jVar, hashMap);
        }
        b5.r.c(vVar2.f1502f, jVar, hashMap);
        for (int i41 = 0; i41 < i39; i41++) {
            b5.x xVar = (b5.x) hashMap.get(Integer.valueOf(vVar2.f1499b[i41]));
            if (xVar != null) {
                j4.i1 i1Var3 = xVar.f1507a;
                o8.z zVar = xVar.f1508b;
                if (!zVar.isEmpty() && j1VarArr2[i41].b(i1Var3) != -1) {
                    sVar = new b5.s(0, i1Var3, r6.e(zVar));
                } else {
                    sVar = null;
                }
                sVarArr[i41] = sVar;
            }
        }
        int i42 = vVar2.f1498a;
        for (int i43 = 0; i43 < i42; i43++) {
            j4.j1 j1Var3 = vVar2.f1500c[i43];
            Map map = (Map) jVar.Z.get(i43);
            if (map != null && map.containsKey(j1Var3)) {
                Map map2 = (Map) jVar.Z.get(i43);
                if (map2 != null) {
                    b5.k kVar = (b5.k) map2.get(j1Var3);
                }
                sVarArr[i43] = null;
            }
        }
        for (int i44 = 0; i44 < i25; i44++) {
            int i45 = vVar2.f1499b[i44];
            if (jVar.f1466a0.get(i44) || jVar.L.contains(Integer.valueOf(i45))) {
                sVarArr[i44] = null;
            }
        }
        wa.a aVar = rVar.f1492f;
        com.google.android.exoplayer2.upstream.f fVar2 = rVar.f1504b;
        d5.a.j(fVar2);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i46 = 0;
        while (i46 < sVarArr.length) {
            b5.s sVar4 = sVarArr[i46];
            if (sVar4 != null && sVar4.f1497b.length > 1) {
                o8.x xVar2 = o8.z.f19105b;
                o8.w wVar5 = new o8.w();
                wVar5.a(new b5.a(0L, 0L));
                arrayList.add(wVar5);
                obj = obj2;
            } else {
                obj = obj2;
                arrayList.add(obj);
            }
            i46++;
            obj2 = obj;
        }
        int length4 = sVarArr.length;
        long[][] jArr = new long[length4];
        int i47 = 0;
        while (true) {
            j10 = -1;
            if (i47 >= sVarArr.length) {
                break;
            }
            b5.s sVar5 = sVarArr[i47];
            if (sVar5 == null) {
                jArr[i47] = new long[0];
                vVar = vVar2;
            } else {
                int[] iArr10 = sVar5.f1497b;
                jArr[i47] = new long[iArr10.length];
                int i48 = 0;
                while (i48 < iArr10.length) {
                    b5.v vVar3 = vVar2;
                    long j13 = sVar5.f1496a.d[iArr10[i48]].f9765n;
                    long[] jArr2 = jArr[i47];
                    if (j13 == -1) {
                        j13 = 0;
                    }
                    jArr2[i48] = j13;
                    i48++;
                    vVar2 = vVar3;
                }
                vVar = vVar2;
                Arrays.sort(jArr[i47]);
            }
            i47++;
            vVar2 = vVar;
        }
        b5.v vVar4 = vVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i49 = 0; i49 < length4; i49++) {
            long[] jArr4 = jArr[i49];
            if (jArr4.length == 0) {
                j12 = 0;
            } else {
                j12 = jArr4[0];
            }
            jArr3[i49] = j12;
        }
        b5.b.v(arrayList, jArr3);
        o8.l.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(o8.j0.f19050b);
        o8.g0 g0Var = new o8.g0();
        ?? obj3 = new Object();
        if (treeMap.isEmpty()) {
            obj3.d = treeMap;
            obj3.f19048f = g0Var;
            int i50 = 0;
            while (i50 < length4) {
                long[] jArr5 = jArr[i50];
                if (jArr5.length <= 1) {
                    fVar = fVar2;
                    i10 = length4;
                    j11 = j10;
                    iArr = iArr11;
                } else {
                    int length5 = jArr5.length;
                    double[] dArr = new double[length5];
                    j11 = j10;
                    int i51 = 0;
                    while (true) {
                        long[] jArr6 = jArr[i50];
                        fVar = fVar2;
                        double d9 = 0.0d;
                        if (i51 >= jArr6.length) {
                            break;
                        }
                        int i52 = length4;
                        int[] iArr12 = iArr11;
                        long j14 = jArr6[i51];
                        if (j14 != j11) {
                            d9 = Math.log(j14);
                        }
                        dArr[i51] = d9;
                        i51++;
                        length4 = i52;
                        iArr11 = iArr12;
                        fVar2 = fVar;
                    }
                    int i53 = length4;
                    iArr = iArr11;
                    int i54 = length5 - 1;
                    double d10 = dArr[i54] - dArr[0];
                    int i55 = 0;
                    while (i55 < i54) {
                        double d11 = dArr[i55];
                        i55++;
                        double d12 = (d11 + dArr[i55]) * 0.5d;
                        if (d10 == 0.0d) {
                            d = 1.0d;
                        } else {
                            d = (d12 - dArr[0]) / d10;
                        }
                        Double valueOf = Double.valueOf(d);
                        int i56 = i53;
                        Integer valueOf2 = Integer.valueOf(i50);
                        double d13 = d10;
                        Map map3 = obj3.d;
                        Collection collection = (Collection) map3.get(valueOf);
                        if (collection == null) {
                            List list = (List) obj3.f19048f.get();
                            if (list.add(valueOf2)) {
                                obj3.f19047e++;
                                map3.put(valueOf, list);
                            } else {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                        } else if (collection.add(valueOf2)) {
                            obj3.f19047e++;
                        }
                        i53 = i56;
                        d10 = d13;
                    }
                    i10 = i53;
                }
                i50++;
                iArr11 = iArr;
                j10 = j11;
                length4 = i10;
                fVar2 = fVar;
            }
            com.google.android.exoplayer2.upstream.f fVar3 = fVar2;
            int[] iArr13 = iArr11;
            h7.m mVar2 = obj3.f19054b;
            int i57 = 4;
            if (mVar2 == null) {
                mVar2 = new h7.m(4, (Serializable) obj3);
                obj3.f19054b = mVar2;
            }
            o8.z u10 = o8.z.u(mVar2);
            for (int i58 = 0; i58 < u10.size(); i58++) {
                int intValue = ((Integer) u10.get(i58)).intValue();
                int i59 = iArr13[intValue] + 1;
                iArr13[intValue] = i59;
                jArr3[intValue] = jArr[intValue][i59];
                b5.b.v(arrayList, jArr3);
            }
            for (int i60 = 0; i60 < sVarArr.length; i60++) {
                if (arrayList.get(i60) != null) {
                    jArr3[i60] = jArr3[i60] * 2;
                }
            }
            b5.b.v(arrayList, jArr3);
            o8.l.a(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i61 = 0;
            int i62 = 0;
            while (i61 < arrayList.size()) {
                o8.w wVar6 = (o8.w) arrayList.get(i61);
                if (wVar6 == null) {
                    c10 = o8.l0.f19056e;
                } else {
                    c10 = wVar6.c();
                }
                c10.getClass();
                int i63 = i62 + 1;
                if (objArr.length < i63) {
                    objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i63));
                }
                objArr[i62] = c10;
                i61++;
                i62 = i63;
            }
            o8.l0 s10 = o8.z.s(i62, objArr);
            b5.t[] tVarArr2 = new b5.t[sVarArr.length];
            for (int i64 = 0; i64 < sVarArr.length; i64++) {
                b5.s sVar6 = sVarArr[i64];
                if (sVar6 != null) {
                    int[] iArr14 = sVar6.f1497b;
                    if (iArr14.length != 0) {
                        if (iArr14.length == 1) {
                            bVar = new b5.c(sVar6.f1496a, new int[]{iArr14[0]});
                        } else {
                            long j15 = 25000;
                            bVar = new b5.b(sVar6.f1496a, iArr14, fVar3, 10000, j15, j15, (o8.z) s10.get(i64));
                        }
                        tVarArr2[i64] = bVar;
                    }
                }
            }
            i2[] i2VarArr = new i2[i25];
            int i65 = 0;
            while (i65 < i25) {
                b5.v vVar5 = vVar4;
                int i66 = vVar5.f1499b[i65];
                if (!jVar.f1466a0.get(i65) && !jVar.L.contains(Integer.valueOf(i66)) && (vVar5.f1499b[i65] == -2 || tVarArr2[i65] != null)) {
                    i2Var = i2.f9504b;
                } else {
                    i2Var = null;
                }
                i2VarArr[i65] = i2Var;
                i65++;
                vVar4 = vVar5;
            }
            b5.v vVar6 = vVar4;
            if (jVar.X) {
                int i67 = -1;
                int i68 = -1;
                for (int i69 = 0; i69 < vVar6.f1498a; i69++) {
                    int i70 = vVar6.f1499b[i69];
                    b5.t tVar = tVarArr2[i69];
                    if ((i70 == 1 || i70 == 2) && tVar != null) {
                        int[][] iArr15 = iArr4[i69];
                        int b10 = vVar6.f1500c[i69].b(tVar.b());
                        int i71 = 0;
                        while (true) {
                            if (i71 < tVar.length()) {
                                if ((iArr15[b10][tVar.j(i71)] & 32) != 32) {
                                    break;
                                }
                                i71++;
                            } else if (i70 == 1) {
                                i9 = -1;
                                if (i68 != -1) {
                                    z13 = false;
                                    break;
                                }
                                i68 = i69;
                            } else {
                                i9 = -1;
                                if (i67 != -1) {
                                    z13 = false;
                                    break;
                                }
                                i67 = i69;
                            }
                        }
                    }
                }
                i9 = -1;
                z13 = true;
                if (i68 != i9 && i67 != i9) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 & z13) {
                    i2 i2Var2 = new i2(true);
                    i2VarArr[i68] = i2Var2;
                    i2VarArr[i67] = i2Var2;
                }
            }
            Pair create = Pair.create(i2VarArr, tVarArr2);
            b5.t[] tVarArr3 = (b5.t[]) create.second;
            List[] listArr = new List[tVarArr3.length];
            for (int i72 = 0; i72 < tVarArr3.length; i72++) {
                b5.t tVar2 = tVarArr3[i72];
                if (tVar2 != null) {
                    l0Var = o8.z.y(tVar2);
                } else {
                    o8.x xVar3 = o8.z.f19105b;
                    l0Var = o8.l0.f19056e;
                }
                listArr[i72] = l0Var;
            }
            o8.w wVar7 = new o8.w();
            int i73 = 0;
            while (true) {
                int i74 = vVar6.f1498a;
                j4.j1[] j1VarArr3 = vVar6.f1500c;
                if (i73 >= i74) {
                    break;
                }
                j4.j1 j1Var4 = j1VarArr3[i73];
                List list2 = listArr[i73];
                int i75 = 0;
                while (i75 < j1Var4.f13491a) {
                    j4.i1 a10 = j1Var4.a(i75);
                    int i76 = j1VarArr3[i73].a(i75).f13481a;
                    int[] iArr16 = new int[i76];
                    int i77 = 0;
                    for (int i78 = 0; i78 < i76; i78++) {
                        if ((vVar6.f1501e[i73][i75][i78] & 7) == i57) {
                            iArr16[i77] = i78;
                            i77++;
                        }
                    }
                    int[] copyOf = Arrays.copyOf(iArr16, i77);
                    List[] listArr2 = listArr;
                    String str2 = null;
                    int i79 = 0;
                    boolean z18 = false;
                    int i80 = 0;
                    int i81 = 16;
                    while (i79 < copyOf.length) {
                        String str3 = j1VarArr3[i73].a(i75).d[copyOf[i79]].B;
                        int i82 = i80 + 1;
                        if (i80 == 0) {
                            str2 = str3;
                        } else {
                            z18 = (!d5.f0.a(str2, str3)) | z18;
                        }
                        i81 = Math.min(i81, vVar6.f1501e[i73][i75][i79] & 24);
                        i79++;
                        i80 = i82;
                    }
                    if (z18) {
                        i81 = Math.min(i81, vVar6.d[i73]);
                    }
                    if (i81 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i83 = a10.f13481a;
                    int[] iArr17 = new int[i83];
                    boolean[] zArr = new boolean[i83];
                    for (int i84 = 0; i84 < a10.f13481a; i84++) {
                        iArr17[i84] = vVar6.f1501e[i73][i75][i84] & 7;
                        int i85 = 0;
                        while (true) {
                            if (i85 < list2.size()) {
                                b5.t tVar3 = (b5.t) list2.get(i85);
                                if (tVar3.b().equals(a10) && tVar3.u(i84) != -1) {
                                    z12 = true;
                                    break;
                                }
                                i85++;
                            } else {
                                z12 = false;
                                break;
                            }
                        }
                        zArr[i84] = z12;
                    }
                    wVar7.a(new s2(a10, z11, iArr17, zArr));
                    i75++;
                    listArr = listArr2;
                    i57 = 4;
                }
                i73++;
                i57 = 4;
            }
            j4.j1 j1Var5 = vVar6.f1502f;
            for (int i86 = 0; i86 < j1Var5.f13491a; i86++) {
                j4.i1 a11 = j1Var5.a(i86);
                int[] iArr18 = new int[a11.f13481a];
                Arrays.fill(iArr18, 0);
                wVar7.a(new s2(a11, false, iArr18, new boolean[a11.f13481a]));
            }
            b5.a0 a0Var = new b5.a0((i2[]) create.first, (b5.t[]) create.second, new t2(wVar7.c()), vVar6);
            for (b5.t tVar4 : a0Var.f1427c) {
                if (tVar4 != null) {
                    tVar4.q(f10);
                }
            }
            return a0Var;
        }
        throw new IllegalArgumentException();
    }
}
