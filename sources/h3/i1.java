package h3;

import android.os.Looper;
import android.util.Pair;
import h7.u6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class i1 {

    public final Object f7921a;

    public final Object f7922b;

    public final j4.b1[] f7923c;
    public boolean d;

    public boolean f7924e;

    public j1 f7925f;

    public boolean f7926g;
    public final boolean[] h;

    public final h2[] f7927i;

    public final b5.v f7928j;

    public final s1 f7929k;

    public i1 f7930l;

    public j4.j1 f7931m;

    public b5.z f7932n;

    public long f7933o;

    public i1(h2[] h2VarArr, long j10, b5.v vVar, com.google.android.exoplayer2.upstream.r rVar, s1 s1Var, j1 j1Var, b5.z zVar) {
        this.f7927i = h2VarArr;
        this.f7933o = j10;
        this.f7928j = vVar;
        this.f7929k = s1Var;
        j4.c0 c0Var = j1Var.f7945a;
        this.f7922b = c0Var.f12503a;
        this.f7925f = j1Var;
        this.f7931m = j4.j1.d;
        this.f7932n = zVar;
        this.f7923c = new j4.b1[h2VarArr.length];
        this.h = new boolean[h2VarArr.length];
        long j11 = j1Var.f7946b;
        long j12 = j1Var.d;
        s1Var.getClass();
        Object obj = c0Var.f12503a;
        int i10 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        j4.c0 c0VarB = c0Var.b(pair.second);
        r1 r1Var = (r1) s1Var.d.get(obj2);
        r1Var.getClass();
        s1Var.f8151g.add(r1Var);
        q1 q1Var = (q1) s1Var.f8150f.get(r1Var);
        if (q1Var != null) {
            q1Var.f8085a.e(q1Var.f8086b);
        }
        r1Var.f8110c.add(c0VarB);
        j4.z zVarB = r1Var.f8108a.b(c0VarB, rVar, j11);
        s1Var.f8148c.put(zVarB, r1Var);
        s1Var.c();
        this.f7921a = j12 != -9223372036854775807L ? new j4.d(zVarB, true, 0L, j12) : zVarB;
    }

    public final long a(b5.z zVar, long j10, boolean z10, boolean[] zArr) {
        h2[] h2VarArr;
        j4.b1[] b1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zVar.f2028a) {
                break;
            }
            if (z10 || !zVar.a(this.f7932n, i10)) {
                z11 = false;
            }
            this.h[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            h2VarArr = this.f7927i;
            int length = h2VarArr.length;
            b1VarArr = this.f7923c;
            if (i11 >= length) {
                break;
            }
            if (h2VarArr[i11].getTrackType() == -2) {
                b1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f7932n = zVar;
        c();
        long jF = this.f7921a.F(zVar.f2030c, this.h, this.f7923c, zArr, j10);
        for (int i12 = 0; i12 < h2VarArr.length; i12++) {
            if (h2VarArr[i12].getTrackType() == -2 && this.f7932n.b(i12)) {
                b1VarArr[i12] = new j4.m();
            }
        }
        this.f7924e = false;
        for (int i13 = 0; i13 < b1VarArr.length; i13++) {
            if (b1VarArr[i13] != null) {
                d5.a.i(zVar.b(i13));
                if (h2VarArr[i13].getTrackType() != -2) {
                    this.f7924e = true;
                }
            } else {
                d5.a.i(zVar.f2030c[i13] == null);
            }
        }
        return jF;
    }

    public final void b() {
        if (this.f7930l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            b5.z zVar = this.f7932n;
            if (i10 >= zVar.f2028a) {
                return;
            }
            boolean zB = zVar.b(i10);
            b5.s sVar = this.f7932n.f2030c[i10];
            if (zB && sVar != null) {
                sVar.l();
            }
            i10++;
        }
    }

    public final void c() {
        if (this.f7930l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            b5.z zVar = this.f7932n;
            if (i10 >= zVar.f2028a) {
                return;
            }
            boolean zB = zVar.b(i10);
            b5.s sVar = this.f7932n.f2030c[i10];
            if (zB && sVar != null) {
                sVar.i();
            }
            i10++;
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f7925f.f7946b;
        }
        long jD = this.f7924e ? this.f7921a.D() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f7925f.f7948e : jD;
    }

    public final long e() {
        return this.f7925f.f7946b + this.f7933o;
    }

    public final void f() {
        b();
        ?? r10 = this.f7921a;
        try {
            boolean z10 = r10 instanceof j4.d;
            s1 s1Var = this.f7929k;
            if (z10) {
                s1Var.f(((j4.d) r10).f12533a);
            } else {
                s1Var.f(r10);
            }
        } catch (RuntimeException e9) {
            d5.a.p("MediaPeriodHolder", "Period release failed.", e9);
        }
    }

    public final b5.z g(float f10, s2 s2Var) {
        b5.i iVar;
        boolean z10;
        String str;
        long j10;
        boolean z11;
        p8.l0 l0VarY;
        int i10;
        boolean z12;
        b5.s bVar;
        long j11;
        com.google.android.exoplayer2.upstream.f fVar;
        int[] iArr;
        int i11;
        b5.u uVar;
        Object obj;
        int i12;
        j4.i1 i1Var;
        j4.j1 j1Var;
        b5.l lVar;
        int[] iArr2;
        b5.v vVar = this.f7928j;
        h2[] h2VarArr = this.f7927i;
        j4.j1 j1Var2 = this.f7931m;
        vVar.getClass();
        int[] iArr3 = new int[h2VarArr.length + 1];
        int length = h2VarArr.length + 1;
        j4.i1[][] i1VarArr = new j4.i1[length][];
        int[][][] iArr4 = new int[h2VarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = j1Var2.f12593a;
            i1VarArr[i13] = new j4.i1[i14];
            iArr4[i13] = new int[i14][];
        }
        int length2 = h2VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr5[i15] = h2VarArr[i15].supportsMixedMimeTypeAdaptation();
        }
        int i16 = 0;
        while (i16 < j1Var2.f12593a) {
            j4.i1 i1VarA = j1Var2.a(i16);
            boolean z13 = i1VarA.f12585c == 5;
            int length3 = h2VarArr.length;
            int i17 = 0;
            int i18 = 0;
            boolean z14 = true;
            while (i17 < h2VarArr.length) {
                h2 h2Var = h2VarArr[i17];
                b5.v vVar2 = vVar;
                int iMax = 0;
                for (int i19 = 0; i19 < i1VarA.f12583a; i19++) {
                    iMax = Math.max(iMax, h2Var.supportsFormat(i1VarA.d[i19]) & 7);
                }
                boolean z15 = iArr3[i17] == 0;
                if (iMax > i18 || (iMax == i18 && z13 && !z14 && z15)) {
                    i18 = iMax;
                    z14 = z15;
                    length3 = i17;
                }
                i17++;
                vVar = vVar2;
            }
            b5.v vVar3 = vVar;
            if (length3 == h2VarArr.length) {
                iArr2 = new int[i1VarA.f12583a];
            } else {
                h2 h2Var2 = h2VarArr[length3];
                int[] iArr6 = new int[i1VarA.f12583a];
                for (int i20 = 0; i20 < i1VarA.f12583a; i20++) {
                    iArr6[i20] = h2Var2.supportsFormat(i1VarA.d[i20]);
                }
                iArr2 = iArr6;
            }
            int i21 = iArr3[length3];
            i1VarArr[length3][i21] = i1VarA;
            iArr4[length3][i21] = iArr2;
            iArr3[length3] = i21 + 1;
            i16++;
            vVar = vVar3;
        }
        b5.v vVar4 = vVar;
        j4.j1[] j1VarArr = new j4.j1[h2VarArr.length];
        String[] strArr = new String[h2VarArr.length];
        int[] iArr7 = new int[h2VarArr.length];
        for (int i22 = 0; i22 < h2VarArr.length; i22++) {
            int i23 = iArr3[i22];
            j1VarArr[i22] = new j4.j1((j4.i1[]) d5.g0.J(i23, i1VarArr[i22]));
            iArr4[i22] = (int[][]) d5.g0.J(i23, iArr4[i22]);
            strArr[i22] = h2VarArr[i22].getName();
            iArr7[i22] = h2VarArr[i22].getTrackType();
        }
        b5.u uVar2 = new b5.u(iArr7, j1VarArr, iArr5, iArr4, new j4.j1((j4.i1[]) d5.g0.J(iArr3[h2VarArr.length], i1VarArr[h2VarArr.length])));
        b5.q qVar = (b5.q) vVar4;
        synchronized (qVar.d) {
            try {
                iVar = qVar.h;
                if (iVar.V && d5.g0.f4795a >= 32 && (lVar = qVar.f1979i) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    d5.a.j(looperMyLooper);
                    lVar.b(qVar, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i24 = uVar2.f1983a;
        b5.r[] rVarArr = new b5.r[i24];
        int i25 = 2;
        Pair pairI = b5.q.i(2, uVar2, iArr4, new ag.h0(1, iVar, iArr5), new a5.f(6));
        if (pairI != null) {
            rVarArr[((Integer) pairI.second).intValue()] = (b5.r) pairI.first;
        }
        int i26 = 0;
        while (true) {
            if (i26 >= uVar2.f1983a) {
                z10 = false;
                break;
            }
            if (2 == iArr7[i26] && j1VarArr[i26].f12593a > 0) {
                z10 = true;
                break;
            }
            i26++;
        }
        Pair pairI2 = b5.q.i(1, uVar2, iArr4, new b5.d(qVar, iVar, z10, 0), new a5.f(7));
        if (pairI2 != null) {
            rVarArr[((Integer) pairI2.second).intValue()] = (b5.r) pairI2.first;
        }
        if (pairI2 == null) {
            str = null;
        } else {
            b5.r rVar = (b5.r) pairI2.first;
            str = rVar.f1981a.d[rVar.f1982b[0]].f8186c;
        }
        int i27 = 3;
        Pair pairI3 = b5.q.i(3, uVar2, iArr4, new ag.h0(i25, iVar, str), new a5.f(8));
        if (pairI3 != null) {
            rVarArr[((Integer) pairI3.second).intValue()] = (b5.r) pairI3.first;
        }
        int i28 = 0;
        while (i28 < i24) {
            int i29 = iArr7[i28];
            if (i29 == i25 || i29 == 1 || i29 == i27) {
                i12 = i28;
            } else {
                j4.j1 j1Var3 = j1VarArr[i28];
                int[][] iArr8 = iArr4[i28];
                j4.i1 i1Var2 = null;
                int i30 = 0;
                int i31 = 0;
                b5.g gVar = null;
                while (i30 < j1Var3.f12593a) {
                    j4.i1 i1VarA2 = j1Var3.a(i30);
                    int[] iArr9 = iArr8[i30];
                    int i32 = i28;
                    b5.g gVar2 = gVar;
                    int i33 = 0;
                    while (i33 < i1VarA2.f12583a) {
                        int i34 = i33;
                        if (b5.q.f(iArr9[i33], iVar.W)) {
                            i1Var = i1VarA2;
                            b5.g gVar3 = new b5.g(i1VarA2.d[i34], iArr9[i34]);
                            if (gVar2 != null) {
                                j1Var = j1Var3;
                                if (p8.t.f45586a.c(gVar3.f1949b, gVar2.f1949b).c(gVar3.f1948a, gVar2.f1948a).e() > 0) {
                                }
                            } else {
                                j1Var = j1Var3;
                            }
                            gVar2 = gVar3;
                            i31 = i34;
                            i1Var2 = i1Var;
                        } else {
                            i1Var = i1VarA2;
                            j1Var = j1Var3;
                        }
                        i33 = i34 + 1;
                        i1VarA2 = i1Var;
                        j1Var3 = j1Var;
                    }
                    i30++;
                    gVar = gVar2;
                    i28 = i32;
                }
                i12 = i28;
                rVarArr[i12] = i1Var2 == null ? null : new b5.r(0, i1Var2, new int[]{i31});
            }
            i28 = i12 + 1;
            i25 = 2;
            i27 = 3;
        }
        Object obj2 = null;
        int i35 = uVar2.f1983a;
        j4.j1[] j1VarArr2 = uVar2.f1985c;
        HashMap map = new HashMap();
        for (int i36 = 0; i36 < i35; i36++) {
            b5.q.c(j1VarArr2[i36], iVar, map);
        }
        b5.q.c(uVar2.f1987f, iVar, map);
        for (int i37 = 0; i37 < i35; i37++) {
            b5.w wVar = (b5.w) map.get(Integer.valueOf(uVar2.f1984b[i37]));
            if (wVar != null) {
                j4.i1 i1Var3 = wVar.f1992a;
                p8.z zVar = wVar.f1993b;
                rVarArr[i37] = (zVar.isEmpty() || j1VarArr2[i37].b(i1Var3) == -1) ? null : new b5.r(0, i1Var3, u6.e(zVar));
            }
        }
        int i38 = uVar2.f1983a;
        for (int i39 = 0; i39 < i38; i39++) {
            j4.j1 j1Var4 = uVar2.f1985c[i39];
            Map map2 = (Map) iVar.Z.get(i39);
            if (map2 != null && map2.containsKey(j1Var4)) {
                Map map3 = (Map) iVar.Z.get(i39);
                if (map3 != null) {
                }
                rVarArr[i39] = null;
            }
        }
        for (int i40 = 0; i40 < i24; i40++) {
            int i41 = uVar2.f1984b[i40];
            if (iVar.f1951a0.get(i40) || iVar.L.contains(Integer.valueOf(i41))) {
                rVarArr[i40] = null;
            }
        }
        ab.a aVar = qVar.f1977f;
        com.google.android.exoplayer2.upstream.f fVar2 = qVar.f1989b;
        d5.a.j(fVar2);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i42 = 0;
        while (i42 < rVarArr.length) {
            b5.r rVar2 = rVarArr[i42];
            if (rVar2 == null || rVar2.f1982b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                p8.x xVar = p8.z.f45604b;
                p8.w wVar2 = new p8.w();
                wVar2.a(new b5.a(0L, 0L));
                arrayList.add(wVar2);
                obj = obj2;
            }
            i42++;
            obj2 = obj;
        }
        int length4 = rVarArr.length;
        long[][] jArr = new long[length4][];
        int i43 = 0;
        while (true) {
            j10 = -1;
            if (i43 >= rVarArr.length) {
                break;
            }
            b5.r rVar3 = rVarArr[i43];
            if (rVar3 == null) {
                jArr[i43] = new long[0];
                uVar = uVar2;
            } else {
                int[] iArr10 = rVar3.f1982b;
                jArr[i43] = new long[iArr10.length];
                int i44 = 0;
                while (i44 < iArr10.length) {
                    b5.u uVar3 = uVar2;
                    long j12 = rVar3.f1981a.d[iArr10[i44]].f8189n;
                    long[] jArr2 = jArr[i43];
                    if (j12 == -1) {
                        j12 = 0;
                    }
                    jArr2[i44] = j12;
                    i44++;
                    uVar2 = uVar3;
                }
                uVar = uVar2;
                Arrays.sort(jArr[i43]);
            }
            i43++;
            uVar2 = uVar;
        }
        b5.u uVar4 = uVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i45 = 0; i45 < length4; i45++) {
            long[] jArr4 = jArr[i45];
            jArr3[i45] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        b5.b.v(arrayList, jArr3);
        p8.l.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(p8.j0.f45549b);
        p8.g0 g0Var = new p8.g0();
        p8.h0 h0Var = new p8.h0();
        if (!treeMap.isEmpty()) {
            throw new IllegalArgumentException();
        }
        h0Var.d = treeMap;
        h0Var.f45547f = g0Var;
        int i46 = 0;
        while (i46 < length4) {
            long[] jArr5 = jArr[i46];
            if (jArr5.length <= 1) {
                fVar = fVar2;
                i11 = length4;
                j11 = j10;
                iArr = iArr11;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                j11 = j10;
                int i47 = 0;
                while (true) {
                    long[] jArr6 = jArr[i46];
                    fVar = fVar2;
                    double dLog = 0.0d;
                    if (i47 >= jArr6.length) {
                        break;
                    }
                    int i48 = length4;
                    int[] iArr12 = iArr11;
                    long j13 = jArr6[i47];
                    if (j13 != j11) {
                        dLog = Math.log(j13);
                    }
                    dArr[i47] = dLog;
                    i47++;
                    length4 = i48;
                    iArr11 = iArr12;
                    fVar2 = fVar;
                }
                int i49 = length4;
                iArr = iArr11;
                int i50 = length5 - 1;
                double d = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d10 = dArr[i51];
                    i51++;
                    Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d10 + dArr[i51]) * 0.5d) - dArr[0]) / d);
                    int i52 = i49;
                    Integer numValueOf = Integer.valueOf(i46);
                    double d11 = d;
                    Map map4 = h0Var.d;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        List list = (List) h0Var.f45547f.get();
                        if (!list.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        h0Var.f45546e++;
                        map4.put(dValueOf, list);
                    } else if (collection.add(numValueOf)) {
                        h0Var.f45546e++;
                    }
                    i49 = i52;
                    d = d11;
                }
                i11 = i49;
            }
            i46++;
            iArr11 = iArr;
            j10 = j11;
            length4 = i11;
            fVar2 = fVar;
        }
        com.google.android.exoplayer2.upstream.f fVar3 = fVar2;
        int[] iArr13 = iArr11;
        i7.m mVar = h0Var.f45553b;
        int i53 = 4;
        if (mVar == null) {
            mVar = new i7.m(4, h0Var);
            h0Var.f45553b = mVar;
        }
        p8.z zVarU = p8.z.u(mVar);
        for (int i54 = 0; i54 < zVarU.size(); i54++) {
            int iIntValue = ((Integer) zVarU.get(i54)).intValue();
            int i55 = iArr13[iIntValue] + 1;
            iArr13[iIntValue] = i55;
            jArr3[iIntValue] = jArr[iIntValue][i55];
            b5.b.v(arrayList, jArr3);
        }
        for (int i56 = 0; i56 < rVarArr.length; i56++) {
            if (arrayList.get(i56) != null) {
                jArr3[i56] = jArr3[i56] * 2;
            }
        }
        b5.b.v(arrayList, jArr3);
        p8.l.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i57 = 0;
        int i58 = 0;
        while (i57 < arrayList.size()) {
            p8.w wVar3 = (p8.w) arrayList.get(i57);
            p8.l0 l0VarC = wVar3 == null ? p8.l0.f45555e : wVar3.c();
            l0VarC.getClass();
            int i59 = i58 + 1;
            if (objArrCopyOf.length < i59) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, p8.w.d(objArrCopyOf.length, i59));
            }
            objArrCopyOf[i58] = l0VarC;
            i57++;
            i58 = i59;
        }
        p8.l0 l0VarS = p8.z.s(i58, objArrCopyOf);
        b5.s[] sVarArr = new b5.s[rVarArr.length];
        for (int i60 = 0; i60 < rVarArr.length; i60++) {
            b5.r rVar4 = rVarArr[i60];
            if (rVar4 != null) {
                int[] iArr14 = rVar4.f1982b;
                if (iArr14.length != 0) {
                    if (iArr14.length == 1) {
                        bVar = new b5.t(rVar4.f1981a, new int[]{iArr14[0]});
                    } else {
                        long j14 = 25000;
                        bVar = new b5.b(rVar4.f1981a, iArr14, fVar3, 10000, j14, j14, (p8.z) l0VarS.get(i60));
                    }
                    sVarArr[i60] = bVar;
                }
            }
        }
        i2[] i2VarArr = new i2[i24];
        int i61 = 0;
        while (i61 < i24) {
            b5.u uVar5 = uVar4;
            i2VarArr[i61] = (iVar.f1951a0.get(i61) || iVar.L.contains(Integer.valueOf(uVar5.f1984b[i61])) || (uVar5.f1984b[i61] != -2 && sVarArr[i61] == null)) ? null : i2.f7934b;
            i61++;
            uVar4 = uVar5;
        }
        b5.u uVar6 = uVar4;
        if (iVar.X) {
            int i62 = -1;
            int i63 = -1;
            int i64 = 0;
            while (true) {
                if (i64 >= uVar6.f1983a) {
                    i10 = -1;
                    z12 = true;
                    break;
                }
                int i65 = uVar6.f1984b[i64];
                b5.s sVar = sVarArr[i64];
                if ((i65 == 1 || i65 == 2) && sVar != null) {
                    int[][] iArr15 = iArr4[i64];
                    int iB = uVar6.f1985c[i64].b(sVar.b());
                    int i66 = 0;
                    while (true) {
                        if (i66 >= sVar.length()) {
                            if (i65 != 1) {
                                i10 = -1;
                                if (i62 == -1) {
                                    i62 = i64;
                                    break;
                                }
                                z12 = false;
                                break;
                            }
                            i10 = -1;
                            if (i63 == -1) {
                                i63 = i64;
                                break;
                            }
                            z12 = false;
                            break;
                        }
                        if ((iArr15[iB][sVar.j(i66)] & 32) != 32) {
                            break;
                        }
                        i66++;
                    }
                }
                i64++;
            }
            if (((i63 == i10 || i62 == i10) ? false : true) & z12) {
                i2 i2Var = new i2(true);
                i2VarArr[i63] = i2Var;
                i2VarArr[i62] = i2Var;
            }
        }
        Pair pairCreate = Pair.create(i2VarArr, sVarArr);
        b5.s[] sVarArr2 = (b5.s[]) pairCreate.second;
        List[] listArr = new List[sVarArr2.length];
        for (int i67 = 0; i67 < sVarArr2.length; i67++) {
            b5.s sVar2 = sVarArr2[i67];
            if (sVar2 != null) {
                l0VarY = p8.z.y(sVar2);
            } else {
                p8.x xVar2 = p8.z.f45604b;
                l0VarY = p8.l0.f45555e;
            }
            listArr[i67] = l0VarY;
        }
        p8.w wVar4 = new p8.w();
        int i68 = 0;
        while (true) {
            int i69 = uVar6.f1983a;
            j4.j1[] j1VarArr3 = uVar6.f1985c;
            if (i68 >= i69) {
                break;
            }
            j4.j1 j1Var5 = j1VarArr3[i68];
            List list2 = listArr[i68];
            int i70 = 0;
            while (i70 < j1Var5.f12593a) {
                j4.i1 i1VarA3 = j1Var5.a(i70);
                int i71 = j1VarArr3[i68].a(i70).f12583a;
                int[] iArr16 = new int[i71];
                int i72 = 0;
                for (int i73 = 0; i73 < i71; i73++) {
                    if ((uVar6.f1986e[i68][i70][i73] & 7) == i53) {
                        iArr16[i72] = i73;
                        i72++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr16, i72);
                List[] listArr2 = listArr;
                String str2 = null;
                int i74 = 0;
                boolean z16 = false;
                int i75 = 0;
                int iMin = 16;
                while (i74 < iArrCopyOf.length) {
                    String str3 = j1VarArr3[i68].a(i70).d[iArrCopyOf[i74]].B;
                    int i76 = i75 + 1;
                    if (i75 == 0) {
                        str2 = str3;
                    } else {
                        z16 = (!d5.g0.a(str2, str3)) | z16;
                    }
                    iMin = Math.min(iMin, uVar6.f1986e[i68][i70][i74] & 24);
                    i74++;
                    i75 = i76;
                }
                if (z16) {
                    iMin = Math.min(iMin, uVar6.d[i68]);
                }
                boolean z17 = iMin != 0;
                int i77 = i1VarA3.f12583a;
                int[] iArr17 = new int[i77];
                boolean[] zArr = new boolean[i77];
                for (int i78 = 0; i78 < i1VarA3.f12583a; i78++) {
                    iArr17[i78] = uVar6.f1986e[i68][i70][i78] & 7;
                    int i79 = 0;
                    while (true) {
                        if (i79 >= list2.size()) {
                            z11 = false;
                            break;
                        }
                        b5.s sVar3 = (b5.s) list2.get(i79);
                        if (sVar3.b().equals(i1VarA3) && sVar3.u(i78) != -1) {
                            z11 = true;
                            break;
                        }
                        i79++;
                    }
                    zArr[i78] = z11;
                }
                wVar4.a(new t2(i1VarA3, z17, iArr17, zArr));
                i70++;
                listArr = listArr2;
                i53 = 4;
            }
            i68++;
            i53 = 4;
        }
        j4.j1 j1Var6 = uVar6.f1987f;
        for (int i80 = 0; i80 < j1Var6.f12593a; i80++) {
            j4.i1 i1VarA4 = j1Var6.a(i80);
            int[] iArr18 = new int[i1VarA4.f12583a];
            Arrays.fill(iArr18, 0);
            wVar4.a(new t2(i1VarA4, false, iArr18, new boolean[i1VarA4.f12583a]));
        }
        b5.z zVar2 = new b5.z((i2[]) pairCreate.first, (b5.s[]) pairCreate.second, new u2(wVar4.c()), uVar6);
        for (b5.s sVar4 : zVar2.f2030c) {
            if (sVar4 != null) {
                sVar4.q(f10);
            }
        }
        return zVar2;
    }
}
