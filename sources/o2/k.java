package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.p1;
import b2.t0;
import b2.v0;
import b2.w;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import g2.c0;
import i2.o1;
import i2.s1;
import i2.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.w0;
import m4.z;
import p2.v;
import p2.x;
import si.o0;
import u2.e0;
import u2.f0;
import u2.t1;
import v7.b8;
import v7.u6;
public final class k implements f0, v {
    public final j2.j E;
    public final le.b F = new le.b(this, 6);
    public e0 G;
    public int H;
    public t1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.o M;
    public final long N;
    public final c f17669a;
    public final p2.e f17670b;
    public final l2.f f17671c;
    public final c0 d;
    public final n2.n e;
    public final n2.k f17672f;
    public final oa.d h;
    public final a5.a f17673n;
    public final androidx.biometric.e f17674r;
    public final IdentityHashMap f17675s;
    public final w0 v;
    public final oa.d f17676w;
    public final boolean f17677x;
    public final int f17678y;

    public k(c cVar, p2.e eVar, l2.f fVar, c0 c0Var, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, androidx.biometric.e eVar2, oa.d dVar2, boolean z10, int i10, j2.j jVar) {
        this.f17669a = cVar;
        this.f17670b = eVar;
        this.f17671c = fVar;
        this.d = c0Var;
        this.e = nVar;
        this.f17672f = kVar;
        this.h = dVar;
        this.f17673n = aVar;
        this.f17674r = eVar2;
        this.f17676w = dVar2;
        this.f17677x = z10;
        this.f17678y = i10;
        this.E = jVar;
        dVar2.getClass();
        l0 l0Var = n0.f8481b;
        x1 x1Var = x1.e;
        this.M = new u2.o(x1Var, x1Var);
        this.f17675s = new IdentityHashMap();
        this.v = new w0(9);
        this.J = new q[0];
        this.K = new q[0];
        this.N = Long.MIN_VALUE;
    }

    public static w f(w wVar, w wVar2, boolean z10) {
        t0 t0Var;
        int i10;
        String str;
        String str2;
        n0 n0Var;
        int i11;
        int i12;
        String str3;
        int i13;
        l0 l0Var = n0.f8481b;
        x1 x1Var = x1.e;
        int i14 = -1;
        if (wVar2 != null) {
            str2 = wVar2.f4127k;
            t0Var = wVar2.f4128l;
            i11 = wVar2.K;
            i10 = wVar2.e;
            i12 = wVar2.f4123f;
            str = wVar2.d;
            str3 = wVar2.f4121b;
            n0Var = wVar2.f4122c;
        } else {
            String w9 = m0.w(1, wVar.f4127k);
            t0Var = wVar.f4128l;
            if (z10) {
                i11 = wVar.K;
                i10 = wVar.e;
                i12 = wVar.f4123f;
                str = wVar.d;
                str3 = wVar.f4121b;
                str2 = w9;
                n0Var = wVar.f4122c;
            } else {
                i10 = 0;
                str = null;
                str2 = w9;
                n0Var = x1Var;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        String d = v0.d(str2);
        if (z10) {
            i13 = wVar.h;
        } else {
            i13 = -1;
        }
        if (z10) {
            i14 = wVar.f4125i;
        }
        b2.v vVar = new b2.v();
        vVar.f4068a = wVar.f4120a;
        vVar.f4069b = str3;
        vVar.f4070c = n0.u(n0Var);
        vVar.f4081q = v0.n(wVar.f4134r);
        vVar.f4082r = v0.n(d);
        vVar.f4074j = str2;
        vVar.f4075k = t0Var;
        vVar.h = i13;
        vVar.f4073i = i14;
        vVar.J = i11;
        vVar.e = i10;
        vVar.f4071f = i12;
        vVar.d = str;
        return new w(vVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        n0 n0Var;
        long j10;
        for (q qVar : this.J) {
            y2.l lVar = qVar.f17721s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f17724y;
            if (!arrayList.isEmpty()) {
                j jVar = (j) e9.s.m(arrayList);
                int c10 = iVar.c(jVar);
                int i10 = jVar.E;
                boolean z10 = true;
                if (c10 == 1) {
                    if (!jVar.g()) {
                        if (i10 == -1) {
                            z10 = false;
                        }
                        u6.p(z10);
                        p2.n b10 = iVar.f17651g.b(jVar.f17667x, false);
                        b10.getClass();
                        n0 n0Var2 = b10.f44431r;
                        int i11 = (int) (jVar.f48354s - b10.f44424k);
                        if (i11 < 0) {
                            j10 = 0;
                        } else {
                            if (i11 < n0Var2.size()) {
                                n0Var = ((p2.k) n0Var2.get(i11)).f44409x;
                            } else {
                                n0Var = b10.f44432s;
                            }
                            j10 = ((p2.i) n0Var.get(i10)).f44412c;
                        }
                        jVar.f17664a0 = j10;
                    }
                } else if (c10 == 0) {
                    qVar.H.post(new z(7, qVar, jVar));
                } else if (c10 == 2 && !qVar.f17714j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.b(this);
    }

    @Override
    public final boolean b(Uri uri, c5.c0 c0Var, boolean z10) {
        int i10;
        boolean z11;
        x xVar;
        k4.d dVar;
        int u10;
        boolean z12;
        x xVar2;
        q[] qVarArr = this.J;
        int length = qVarArr.length;
        int i11 = 0;
        boolean z13 = false;
        while (i11 < length) {
            q qVar = qVarArr[i11];
            i iVar = qVar.d;
            x[] xVarArr = iVar.e;
            p2.e eVar = iVar.f17651g;
            int length2 = xVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    break;
                }
                x xVar3 = xVarArr[i12];
                p2.d dVar2 = (p2.d) eVar.d.get(uri);
                if (dVar2 != null) {
                    xVar = dVar2.f44353a;
                } else {
                    xVar = null;
                }
                if (xVar3.equals(xVar)) {
                    if (!z10) {
                        si.z a2 = iVar.a(uri);
                        qVar.f17720r.getClass();
                        dVar = oa.d.x3(a2, c0Var);
                    } else {
                        dVar = null;
                    }
                    iVar.f17658o = uri;
                    if (dVar != null) {
                        int i13 = dVar.f14942a;
                        i10 = i11;
                        long j10 = dVar.f14943b;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < xVarArr.length) {
                                        x xVar4 = xVarArr[i14];
                                        p2.d dVar3 = (p2.d) eVar.d.get(uri);
                                        if (dVar3 != null) {
                                            xVar2 = dVar3.f44353a;
                                        } else {
                                            xVar2 = null;
                                        }
                                        if (xVar4.equals(xVar2)) {
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        i14 = -1;
                                        break;
                                    }
                                }
                                if (i14 != -1 && (u10 = iVar.f17661r.u(i14)) != -1 && iVar.f17661r.o(u10, j10)) {
                                    p2.d dVar4 = (p2.d) eVar.d.get(uri);
                                    if (dVar4 != null) {
                                        z12 = p2.d.c(dVar4, uri, j10);
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        z11 = true;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(o1.k(i13, "Invalid fallback selection type: "));
                            }
                        } else {
                            p2.d dVar5 = (p2.d) eVar.d.get(uri);
                            if (dVar5 != null) {
                                z11 = p2.d.c(dVar5, uri, j10);
                            }
                        }
                    }
                } else {
                    i12++;
                }
            }
            i10 = i11;
            z11 = false;
            z13 |= z11;
            i11 = i10 + 1;
        }
        this.G.b(this);
        return z13;
    }

    @Override
    public final boolean c() {
        return this.M.c();
    }

    @Override
    public final long d() {
        return this.M.d();
    }

    public final q e(String str, int i10, x[] xVarArr, w[] wVarArr, w wVar, List list, Map map, long j10) {
        q qVar = new q(str, i10, this.F, new i(this.f17669a, this.f17670b, xVarArr, wVarArr, this.f17671c, this.d, this.v, list, this.E), map, this.f17674r, j10, wVar, this.e, this.f17672f, this.h, this.f17673n, this.f17678y, null);
        long j11 = this.N;
        qVar.f17715k0 = j11;
        if (qVar.S) {
            for (p pVar : qVar.L) {
                pVar.K(j11);
            }
        }
        return qVar;
    }

    @Override
    public final void h() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.E();
            if (qVar.f17714j0 && !qVar.T) {
                throw b2.w0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long i(long j10) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean H = qVarArr[0].H(j10, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].H(j10, H);
                i10++;
            }
            if (H) {
                ((SparseArray) this.v.f14874b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void l(long j10) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.B()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].k(j10, qVar.f17707d0[i10]);
                }
            }
        }
    }

    @Override
    public final void n(e0 e0Var, long j10) {
        String str;
        c cVar;
        boolean z10;
        Map map;
        n0 n0Var;
        q[] qVarArr;
        int i10;
        HashSet hashSet;
        int i11;
        HashSet hashSet2;
        n0 n0Var2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        boolean z15;
        List list;
        this.G = e0Var;
        p2.e eVar = this.f17670b;
        eVar.getClass();
        eVar.e.add(this);
        p2.q qVar = eVar.f44362s;
        qVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        n0 c10 = eVar.c(0);
        c10.getClass();
        n0 c11 = eVar.c(2);
        c11.getClass();
        n0 c12 = eVar.c(3);
        c12.getClass();
        boolean isEmpty = c10.isEmpty();
        this.H = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.f17669a;
        boolean z16 = this.f17677x;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            n0Var = c12;
        } else {
            w wVar = qVar.f44449j;
            List list2 = qVar.f44450k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < c10.size(); i15++) {
                w wVar2 = ((x) c10.get(i15)).f44494a.f44491a;
                int i16 = wVar2.A;
                String str2 = wVar2.f4127k;
                if (i16 > 0 || m0.w(2, str2) != null) {
                    int i17 = i14;
                    iArr[i15] = 2;
                    i13++;
                    i14 = i17;
                } else if (m0.w(1, str2) != null) {
                    iArr[i15] = 1;
                    i14++;
                } else {
                    iArr[i15] = -1;
                }
            }
            int i18 = i14;
            if (i13 > 0) {
                z13 = false;
                i12 = i13;
                z12 = true;
            } else if (i18 < size) {
                int i19 = size - i18;
                z12 = false;
                i12 = i19;
                z13 = true;
            } else {
                z12 = false;
                z13 = false;
                i12 = size;
            }
            x[] xVarArr = new x[i12];
            w[] wVarArr = new w[i12];
            int[] iArr2 = new int[i12];
            int i20 = 0;
            boolean z17 = z12;
            int i21 = 0;
            while (i21 < c10.size()) {
                if (z17) {
                    list = list2;
                    if (iArr[i21] != 2) {
                        i21++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z13 || iArr[i21] != 1) {
                    x xVar = (x) c10.get(i21);
                    xVarArr[i20] = xVar;
                    wVarArr[i20] = xVar.f44494a.f44491a;
                    iArr2[i20] = i21;
                    i20++;
                }
                i21++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = wVarArr[0].f4127k;
            int v = m0.v(2, str3);
            int i22 = 1;
            int v10 = m0.v(1, str3);
            if ((v10 == 1 || (v10 == 0 && c11.isEmpty())) && v <= 1 && v10 + v > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z17 && v10 > 0) {
                z15 = true;
            } else {
                z15 = true;
                i22 = 0;
            }
            z10 = z16;
            n0Var = c12;
            q e = e("main", i22, xVarArr, wVarArr, wVar, list3, map3, j10);
            arrayList3.add(e);
            arrayList4.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    w[] wVarArr2 = new w[i12];
                    int i23 = 0;
                    while (i23 < i12) {
                        w wVar3 = wVarArr[i23];
                        String w9 = m0.w(2, wVar3.f4127k);
                        String d = v0.d(w9);
                        w[] wVarArr3 = wVarArr;
                        b2.v vVar = new b2.v();
                        vVar.f4068a = wVar3.f4120a;
                        vVar.f4069b = wVar3.f4121b;
                        vVar.f4070c = n0.u(wVar3.f4122c);
                        vVar.f4081q = v0.n(wVar3.f4134r);
                        vVar.f4082r = v0.n(d);
                        vVar.f4074j = w9;
                        vVar.f4075k = wVar3.f4128l;
                        vVar.h = wVar3.h;
                        vVar.f4073i = wVar3.f4125i;
                        vVar.f4088y = wVar3.f4141z;
                        vVar.f4089z = wVar3.A;
                        vVar.C = wVar3.D;
                        vVar.e = wVar3.e;
                        vVar.f4071f = wVar3.f4123f;
                        vVar.H = wVar3.I;
                        wVarArr2[i23] = new w(vVar);
                        i23++;
                        wVarArr = wVarArr3;
                        map3 = map3;
                    }
                    w[] wVarArr4 = wVarArr;
                    map = map3;
                    arrayList5.add(new p1("main", wVarArr2));
                    if (v10 > 0 && (wVar != null || c11.isEmpty())) {
                        b2.v a2 = f(wVarArr4[0], wVar, false).a();
                        a2.f4076l = "main";
                        arrayList5.add(new p1("main:audio", new w(a2)));
                    }
                    if (list3 != null) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            String k10 = o1.k(i24, "main:cc:");
                            b2.v a10 = cVar2.b((w) list3.get(i24)).a();
                            a10.f4076l = "main";
                            arrayList5.add(new p1(k10, new w(a10)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    w[] wVarArr5 = new w[i12];
                    for (int i25 = 0; i25 < i12; i25++) {
                        wVarArr5[i25] = f(wVarArr[i25], wVar, true);
                    }
                    arrayList5.add(new p1("main", wVarArr5));
                }
                b2.v vVar2 = new b2.v();
                str = "ID3";
                vVar2.f4068a = str;
                vVar2.f4082r = v0.n("application/id3");
                vVar2.f4076l = "main";
                p1 p1Var = new p1("main:id3", new w(vVar2));
                arrayList5.add(p1Var);
                e.F((p1[]) arrayList5.toArray(new p1[0]), arrayList5.indexOf(p1Var));
            } else {
                map = map3;
                str = "ID3";
                cVar = cVar2;
            }
        }
        ArrayList arrayList6 = new ArrayList(c11.size());
        ArrayList arrayList7 = new ArrayList(c11.size());
        ArrayList arrayList8 = new ArrayList(c11.size());
        HashSet hashSet3 = new HashSet();
        int i26 = 0;
        while (i26 < c11.size()) {
            String str4 = ((x) c11.get(i26)).f44494a.f44493c;
            str4.getClass();
            if (!hashSet3.add(str4)) {
                hashSet2 = hashSet3;
                i11 = i26;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            } else {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z18 = true;
                for (int i27 = 0; i27 < c11.size(); i27++) {
                    if (str4.equals(((x) c11.get(i27)).f44494a.f44493c)) {
                        x xVar2 = (x) c11.get(i27);
                        w wVar4 = xVar2.f44494a.f44491a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(xVar2);
                        arrayList7.add(wVar4);
                        if (m0.v(1, wVar4.f4127k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z18 &= z11;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.f8259a;
                i11 = i26;
                hashSet2 = hashSet3;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q e7 = e(concat, 1, (x[]) arrayList6.toArray(new x[0]), (w[]) arrayList7.toArray(new w[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList4.add(b8.f(arrayList2));
                arrayList3.add(e7);
                if (z10 && z18) {
                    String u10 = o0.u(concat, ":id3");
                    b2.v vVar3 = new b2.v();
                    vVar3.f4068a = str;
                    vVar3.f4082r = v0.n("application/id3");
                    vVar3.f4076l = concat;
                    e7.F(new p1[]{new p1(concat, (w[]) arrayList.toArray(new w[0])), new p1(u10, new w(vVar3))}, 1);
                }
            }
            i26 = i11 + 1;
            arrayList7 = arrayList;
            c11 = n0Var2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.L = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(n0Var.size());
        ArrayList arrayList10 = new ArrayList(n0Var.size());
        ArrayList arrayList11 = new ArrayList(n0Var.size());
        HashSet hashSet4 = new HashSet();
        int i28 = 0;
        while (i28 < n0Var.size()) {
            n0 n0Var3 = n0Var;
            String str6 = ((x) n0Var3.get(i28)).f44494a.f44493c;
            str6.getClass();
            if (!hashSet4.add(str6)) {
                hashSet = hashSet4;
                i10 = i28;
                n0Var = n0Var3;
            } else {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i29 = 0; i29 < n0Var3.size(); i29++) {
                    if (str6.equals(((x) n0Var3.get(i29)).f44494a.f44493c)) {
                        x xVar3 = (x) n0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(xVar3);
                        arrayList10.add(xVar3.f44494a.f44491a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                w[] wVarArr6 = (w[]) arrayList10.toArray(new w[0]);
                String str7 = m0.f8259a;
                l0 l0Var = n0.f8481b;
                n0Var = n0Var3;
                i10 = i28;
                hashSet = hashSet4;
                q e10 = e(concat2, 3, (x[]) arrayList9.toArray(new x[0]), wVarArr6, null, x1.e, map4, j10);
                arrayList4.add(b8.f(arrayList11));
                arrayList3.add(e10);
                int length = wVarArr6.length;
                w[] wVarArr7 = new w[length];
                for (int i30 = 0; i30 < length; i30++) {
                    wVarArr7[i30] = cVar.b(wVarArr6[i30]);
                }
                e10.F(new p1[]{new p1(concat2, wVarArr7)}, new int[0]);
            }
            i28 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList3.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.H = this.J.length;
        for (int i31 = 0; i31 < this.L; i31++) {
            this.J[i31].d.f17655l = true;
        }
        for (q qVar2 : this.J) {
            if (!qVar2.T) {
                i2.t0 t0Var = new i2.t0();
                t0Var.f12617a = qVar2.f17710f0;
                qVar2.p(new u0(t0Var));
            }
        }
        this.K = this.J;
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(u0 u0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    i2.t0 t0Var = new i2.t0();
                    t0Var.f12617a = qVar.f17710f0;
                    qVar.p(new u0(t0Var));
                }
            }
            return false;
        }
        return this.M.p(u0Var);
    }

    @Override
    public final long q(x2.p[] r40, boolean[] r41, u2.f1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.q(x2.p[], boolean[], u2.f1[], boolean[], long):long");
    }

    @Override
    public final t1 r() {
        t1 t1Var = this.I;
        t1Var.getClass();
        return t1Var;
    }

    @Override
    public final long s() {
        return this.M.s();
    }

    @Override
    public final long t(long j10, s1 s1Var) {
        p2.n nVar;
        long j11;
        q[] qVarArr = this.K;
        int length = qVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            q qVar = qVarArr[i10];
            if (qVar.Q == 2) {
                i iVar = qVar.d;
                p2.e eVar = iVar.f17651g;
                int c10 = iVar.f17661r.c();
                x[] xVarArr = iVar.e;
                if (c10 < xVarArr.length && c10 != -1) {
                    nVar = eVar.b(xVarArr[iVar.f17661r.l()].c(), true);
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    n0 n0Var = nVar.f44431r;
                    if (!n0Var.isEmpty()) {
                        long j12 = nVar.h - eVar.I;
                        long j13 = j10 - j12;
                        int d = m0.d(n0Var, Long.valueOf(j13), true);
                        long j14 = ((p2.k) n0Var.get(d)).e;
                        if (nVar.f44455c && d != n0Var.size() - 1) {
                            j11 = ((p2.k) n0Var.get(d + 1)).e;
                        } else {
                            j11 = j14;
                        }
                        return s1Var.a(j13, j14, j11) + j12;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override
    public final void u(long j10) {
        this.M.u(j10);
    }
}
