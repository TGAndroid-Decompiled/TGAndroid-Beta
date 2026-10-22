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
import u2.d0;
import u2.e0;
import u2.s1;
import v7.b8;
import v7.u6;
public final class k implements e0, v {
    public final j2.k E;
    public final le.b F = new le.b(this, 6);
    public d0 G;
    public int H;
    public s1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.o M;
    public final long N;
    public final c f17606a;
    public final p2.e f17607b;
    public final l2.f f17608c;
    public final c0 d;
    public final n2.n e;
    public final n2.k f17609f;
    public final oa.d h;
    public final a5.a f17610n;
    public final androidx.biometric.e f17611r;
    public final IdentityHashMap f17612s;
    public final w0 v;
    public final oa.d f17613w;
    public final boolean f17614x;
    public final int f17615y;

    public k(c cVar, p2.e eVar, l2.f fVar, c0 c0Var, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, androidx.biometric.e eVar2, oa.d dVar2, boolean z10, int i10, j2.k kVar2) {
        this.f17606a = cVar;
        this.f17607b = eVar;
        this.f17608c = fVar;
        this.d = c0Var;
        this.e = nVar;
        this.f17609f = kVar;
        this.h = dVar;
        this.f17610n = aVar;
        this.f17611r = eVar2;
        this.f17613w = dVar2;
        this.f17614x = z10;
        this.f17615y = i10;
        this.E = kVar2;
        dVar2.getClass();
        l0 l0Var = n0.f8474b;
        x1 x1Var = x1.e;
        this.M = new u2.o(x1Var, x1Var);
        this.f17612s = new IdentityHashMap();
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
        l0 l0Var = n0.f8474b;
        x1 x1Var = x1.e;
        int i14 = -1;
        if (wVar2 != null) {
            str2 = wVar2.f4120k;
            t0Var = wVar2.f4121l;
            i11 = wVar2.K;
            i10 = wVar2.e;
            i12 = wVar2.f4116f;
            str = wVar2.d;
            str3 = wVar2.f4114b;
            n0Var = wVar2.f4115c;
        } else {
            String w9 = m0.w(1, wVar.f4120k);
            t0Var = wVar.f4121l;
            if (z10) {
                i11 = wVar.K;
                i10 = wVar.e;
                i12 = wVar.f4116f;
                str = wVar.d;
                str3 = wVar.f4114b;
                str2 = w9;
                n0Var = wVar.f4115c;
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
            i14 = wVar.f4118i;
        }
        b2.v vVar = new b2.v();
        vVar.f4061a = wVar.f4113a;
        vVar.f4062b = str3;
        vVar.f4063c = n0.u(n0Var);
        vVar.f4074q = v0.n(wVar.f4127r);
        vVar.f4075r = v0.n(d);
        vVar.f4067j = str2;
        vVar.f4068k = t0Var;
        vVar.h = i13;
        vVar.f4066i = i14;
        vVar.J = i11;
        vVar.e = i10;
        vVar.f4064f = i12;
        vVar.d = str;
        return new w(vVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        n0 n0Var;
        long j10;
        for (q qVar : this.J) {
            y2.l lVar = qVar.f17658s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f17661y;
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
                        p2.n b10 = iVar.f17588g.b(jVar.f17604x, false);
                        b10.getClass();
                        n0 n0Var2 = b10.f44016r;
                        int i11 = (int) (jVar.f47916s - b10.f44009k);
                        if (i11 < 0) {
                            j10 = 0;
                        } else {
                            if (i11 < n0Var2.size()) {
                                n0Var = ((p2.k) n0Var2.get(i11)).f43994x;
                            } else {
                                n0Var = b10.f44017s;
                            }
                            j10 = ((p2.i) n0Var.get(i10)).f43997c;
                        }
                        jVar.f17601a0 = j10;
                    }
                } else if (c10 == 0) {
                    qVar.H.post(new z(7, qVar, jVar));
                } else if (c10 == 2 && !qVar.f17651j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.h(this);
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
            p2.e eVar = iVar.f17588g;
            int length2 = xVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    break;
                }
                x xVar3 = xVarArr[i12];
                p2.d dVar2 = (p2.d) eVar.d.get(uri);
                if (dVar2 != null) {
                    xVar = dVar2.f43938a;
                } else {
                    xVar = null;
                }
                if (xVar3.equals(xVar)) {
                    if (!z10) {
                        si.z a2 = iVar.a(uri);
                        qVar.f17657r.getClass();
                        dVar = oa.d.x3(a2, c0Var);
                    } else {
                        dVar = null;
                    }
                    iVar.f17595o = uri;
                    if (dVar != null) {
                        int i13 = dVar.f14896a;
                        i10 = i11;
                        long j10 = dVar.f14897b;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < xVarArr.length) {
                                        x xVar4 = xVarArr[i14];
                                        p2.d dVar3 = (p2.d) eVar.d.get(uri);
                                        if (dVar3 != null) {
                                            xVar2 = dVar3.f43938a;
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
                                if (i14 != -1 && (u10 = iVar.f17598r.u(i14)) != -1 && iVar.f17598r.o(u10, j10)) {
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
                                throw new IllegalStateException(i2.e.j(i13, "Invalid fallback selection type: "));
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
        this.G.h(this);
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
        q qVar = new q(str, i10, this.F, new i(this.f17606a, this.f17607b, xVarArr, wVarArr, this.f17608c, this.d, this.v, list, this.E), map, this.f17611r, j10, wVar, this.e, this.f17609f, this.h, this.f17610n, this.f17615y, null);
        long j11 = this.N;
        qVar.f17652k0 = j11;
        if (qVar.S) {
            for (p pVar : qVar.L) {
                pVar.K(j11);
            }
        }
        return qVar;
    }

    @Override
    public final void i() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.C();
            if (qVar.f17651j0 && !qVar.T) {
                throw b2.w0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long j(long j10) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean F = qVarArr[0].F(j10, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].F(j10, F);
                i10++;
            }
            if (F) {
                ((SparseArray) this.v.f14830b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void l(long j10) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.A()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].k(j10, qVar.f17644d0[i10]);
                }
            }
        }
    }

    @Override
    public final void n(d0 d0Var, long j10) {
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
        this.G = d0Var;
        p2.e eVar = this.f17607b;
        eVar.getClass();
        eVar.e.add(this);
        p2.q qVar = eVar.f43947s;
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
        c cVar2 = this.f17606a;
        boolean z16 = this.f17614x;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            n0Var = c12;
        } else {
            w wVar = qVar.f44034j;
            List list2 = qVar.f44035k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < c10.size(); i15++) {
                w wVar2 = ((x) c10.get(i15)).f44079a.f44076a;
                int i16 = wVar2.A;
                String str2 = wVar2.f4120k;
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
                    wVarArr[i20] = xVar.f44079a.f44076a;
                    iArr2[i20] = i21;
                    i20++;
                }
                i21++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = wVarArr[0].f4120k;
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
                        String w9 = m0.w(2, wVar3.f4120k);
                        String d = v0.d(w9);
                        w[] wVarArr3 = wVarArr;
                        b2.v vVar = new b2.v();
                        vVar.f4061a = wVar3.f4113a;
                        vVar.f4062b = wVar3.f4114b;
                        vVar.f4063c = n0.u(wVar3.f4115c);
                        vVar.f4074q = v0.n(wVar3.f4127r);
                        vVar.f4075r = v0.n(d);
                        vVar.f4067j = w9;
                        vVar.f4068k = wVar3.f4121l;
                        vVar.h = wVar3.h;
                        vVar.f4066i = wVar3.f4118i;
                        vVar.f4081y = wVar3.f4134z;
                        vVar.f4082z = wVar3.A;
                        vVar.C = wVar3.D;
                        vVar.e = wVar3.e;
                        vVar.f4064f = wVar3.f4116f;
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
                        a2.f4069l = "main";
                        arrayList5.add(new p1("main:audio", new w(a2)));
                    }
                    if (list3 != null) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            String j11 = i2.e.j(i24, "main:cc:");
                            b2.v a10 = cVar2.b((w) list3.get(i24)).a();
                            a10.f4069l = "main";
                            arrayList5.add(new p1(j11, new w(a10)));
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
                vVar2.f4061a = str;
                vVar2.f4075r = v0.n("application/id3");
                vVar2.f4069l = "main";
                p1 p1Var = new p1("main:id3", new w(vVar2));
                arrayList5.add(p1Var);
                e.D((p1[]) arrayList5.toArray(new p1[0]), arrayList5.indexOf(p1Var));
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
            String str4 = ((x) c11.get(i26)).f44079a.f44078c;
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
                    if (str4.equals(((x) c11.get(i27)).f44079a.f44078c)) {
                        x xVar2 = (x) c11.get(i27);
                        w wVar4 = xVar2.f44079a.f44076a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(xVar2);
                        arrayList7.add(wVar4);
                        if (m0.v(1, wVar4.f4120k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z18 &= z11;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.f8252a;
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
                    String u10 = r4.c.u(concat, ":id3");
                    b2.v vVar3 = new b2.v();
                    vVar3.f4061a = str;
                    vVar3.f4075r = v0.n("application/id3");
                    vVar3.f4069l = concat;
                    e7.D(new p1[]{new p1(concat, (w[]) arrayList.toArray(new w[0])), new p1(u10, new w(vVar3))}, 1);
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
            String str6 = ((x) n0Var3.get(i28)).f44079a.f44078c;
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
                    if (str6.equals(((x) n0Var3.get(i29)).f44079a.f44078c)) {
                        x xVar3 = (x) n0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(xVar3);
                        arrayList10.add(xVar3.f44079a.f44076a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                w[] wVarArr6 = (w[]) arrayList10.toArray(new w[0]);
                String str7 = m0.f8252a;
                l0 l0Var = n0.f8474b;
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
                e10.D(new p1[]{new p1(concat2, wVarArr7)}, new int[0]);
            }
            i28 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList3.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.H = this.J.length;
        for (int i31 = 0; i31 < this.L; i31++) {
            this.J[i31].d.f17592l = true;
        }
        for (q qVar2 : this.J) {
            if (!qVar2.T) {
                u0 u0Var = new u0();
                u0Var.f12591a = qVar2.f17647f0;
                qVar2.p(new i2.v0(u0Var));
            }
        }
        this.K = this.J;
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    u0 u0Var = new u0();
                    u0Var.f12591a = qVar.f17647f0;
                    qVar.p(new i2.v0(u0Var));
                }
            }
            return false;
        }
        return this.M.p(v0Var);
    }

    @Override
    public final long q(x2.p[] r40, boolean[] r41, u2.e1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.q(x2.p[], boolean[], u2.e1[], boolean[], long):long");
    }

    @Override
    public final s1 r() {
        s1 s1Var = this.I;
        s1Var.getClass();
        return s1Var;
    }

    @Override
    public final long s() {
        return this.M.s();
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
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
                p2.e eVar = iVar.f17588g;
                int c10 = iVar.f17598r.c();
                x[] xVarArr = iVar.e;
                if (c10 < xVarArr.length && c10 != -1) {
                    nVar = eVar.b(xVarArr[iVar.f17598r.l()].c(), true);
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    n0 n0Var = nVar.f44016r;
                    if (!n0Var.isEmpty()) {
                        long j12 = nVar.h - eVar.I;
                        long j13 = j10 - j12;
                        int d = m0.d(n0Var, Long.valueOf(j13), true);
                        long j14 = ((p2.k) n0Var.get(d)).e;
                        if (nVar.f44040c && d != n0Var.size() - 1) {
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
