package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.p1;
import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c5.b0;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import g2.c0;
import i2.r1;
import i2.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m4.z;
import p2.u;
import u2.d0;
import u2.e0;
import u2.s1;
import v7.b8;
import v7.u6;
public final class k implements e0, u {
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
    public final c f17605a;
    public final p2.d f17606b;
    public final l2.f f17607c;
    public final c0 d;
    public final n2.n e;
    public final n2.k f17608f;
    public final oa.d h;
    public final a5.a f17609n;
    public final androidx.biometric.e f17610r;
    public final IdentityHashMap f17611s;
    public final k0.b v;
    public final oa.d f17612w;
    public final boolean f17613x;
    public final int f17614y;

    public k(c cVar, p2.d dVar, l2.f fVar, c0 c0Var, n2.n nVar, n2.k kVar, oa.d dVar2, a5.a aVar, androidx.biometric.e eVar, oa.d dVar3, boolean z10, int i10, j2.k kVar2) {
        this.f17605a = cVar;
        this.f17606b = dVar;
        this.f17607c = fVar;
        this.d = c0Var;
        this.e = nVar;
        this.f17608f = kVar;
        this.h = dVar2;
        this.f17609n = aVar;
        this.f17610r = eVar;
        this.f17612w = dVar3;
        this.f17613x = z10;
        this.f17614y = i10;
        this.E = kVar2;
        dVar3.getClass();
        l0 l0Var = n0.f8475b;
        x1 x1Var = x1.e;
        this.M = new u2.o(x1Var, x1Var);
        this.f17611s = new IdentityHashMap();
        this.v = new k0.b(11);
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
        l0 l0Var = n0.f8475b;
        x1 x1Var = x1.e;
        int i14 = -1;
        if (wVar2 != null) {
            str2 = wVar2.f4124k;
            t0Var = wVar2.f4125l;
            i11 = wVar2.K;
            i10 = wVar2.e;
            i12 = wVar2.f4120f;
            str = wVar2.d;
            str3 = wVar2.f4118b;
            n0Var = wVar2.f4119c;
        } else {
            String w9 = m0.w(1, wVar.f4124k);
            t0Var = wVar.f4125l;
            if (z10) {
                i11 = wVar.K;
                i10 = wVar.e;
                i12 = wVar.f4120f;
                str = wVar.d;
                str3 = wVar.f4118b;
                str2 = w9;
                n0Var = wVar.f4119c;
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
            i14 = wVar.f4122i;
        }
        v vVar = new v();
        vVar.f4065a = wVar.f4117a;
        vVar.f4066b = str3;
        vVar.f4067c = n0.u(n0Var);
        vVar.f4078q = v0.n(wVar.f4131r);
        vVar.f4079r = v0.n(d);
        vVar.f4071j = str2;
        vVar.f4072k = t0Var;
        vVar.h = i13;
        vVar.f4070i = i14;
        vVar.J = i11;
        vVar.e = i10;
        vVar.f4068f = i12;
        vVar.d = str;
        return new w(vVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        n0 n0Var;
        long j10;
        for (q qVar : this.J) {
            y2.l lVar = qVar.f17657s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f17660y;
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
                        p2.m b10 = iVar.f17587g.b(jVar.f17603x, false);
                        b10.getClass();
                        n0 n0Var2 = b10.f44008r;
                        int i11 = (int) (jVar.f47906s - b10.f44001k);
                        if (i11 < 0) {
                            j10 = 0;
                        } else {
                            if (i11 < n0Var2.size()) {
                                n0Var = ((p2.j) n0Var2.get(i11)).f43986x;
                            } else {
                                n0Var = b10.f44009s;
                            }
                            j10 = ((p2.h) n0Var.get(i10)).f43989c;
                        }
                        jVar.f17600a0 = j10;
                    }
                } else if (c10 == 0) {
                    qVar.H.post(new z(7, qVar, jVar));
                } else if (c10 == 2 && !qVar.f17650j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.v(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        int i10;
        boolean z11;
        p2.w wVar;
        k4.d dVar;
        int u10;
        boolean z12;
        p2.w wVar2;
        q[] qVarArr = this.J;
        int length = qVarArr.length;
        int i11 = 0;
        boolean z13 = false;
        while (i11 < length) {
            q qVar = qVarArr[i11];
            i iVar = qVar.d;
            p2.w[] wVarArr = iVar.e;
            p2.d dVar2 = iVar.f17587g;
            int length2 = wVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    break;
                }
                p2.w wVar3 = wVarArr[i12];
                p2.c cVar = (p2.c) dVar2.d.get(uri);
                if (cVar != null) {
                    wVar = cVar.f43930a;
                } else {
                    wVar = null;
                }
                if (wVar3.equals(wVar)) {
                    if (!z10) {
                        si.z a2 = iVar.a(uri);
                        qVar.f17656r.getClass();
                        dVar = oa.d.x3(a2, b0Var);
                    } else {
                        dVar = null;
                    }
                    iVar.f17594o = uri;
                    if (dVar != null) {
                        int i13 = dVar.f14895a;
                        i10 = i11;
                        long j10 = dVar.f14896b;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < wVarArr.length) {
                                        p2.w wVar4 = wVarArr[i14];
                                        p2.c cVar2 = (p2.c) dVar2.d.get(uri);
                                        if (cVar2 != null) {
                                            wVar2 = cVar2.f43930a;
                                        } else {
                                            wVar2 = null;
                                        }
                                        if (wVar4.equals(wVar2)) {
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        i14 = -1;
                                        break;
                                    }
                                }
                                if (i14 != -1 && (u10 = iVar.f17597r.u(i14)) != -1 && iVar.f17597r.o(u10, j10)) {
                                    p2.c cVar3 = (p2.c) dVar2.d.get(uri);
                                    if (cVar3 != null) {
                                        z12 = p2.c.c(cVar3, uri, j10);
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        z11 = true;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(i2.d.j(i13, "Invalid fallback selection type: "));
                            }
                        } else {
                            p2.c cVar4 = (p2.c) dVar2.d.get(uri);
                            if (cVar4 != null) {
                                z11 = p2.c.c(cVar4, uri, j10);
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
        this.G.v(this);
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

    public final q e(String str, int i10, p2.w[] wVarArr, w[] wVarArr2, w wVar, List list, Map map, long j10) {
        q qVar = new q(str, i10, this.F, new i(this.f17605a, this.f17606b, wVarArr, wVarArr2, this.f17607c, this.d, this.v, list, this.E), map, this.f17610r, j10, wVar, this.e, this.f17608f, this.h, this.f17609n, this.f17614y, null);
        long j11 = this.N;
        qVar.f17651k0 = j11;
        if (qVar.S) {
            for (p pVar : qVar.L) {
                pVar.K(j11);
            }
        }
        return qVar;
    }

    @Override
    public final void g() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.C();
            if (qVar.f17650j0 && !qVar.T) {
                throw w0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long i(long j10) {
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
                ((SparseArray) this.v.f14564b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void k(long j10) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.A()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].k(j10, qVar.f17643d0[i10]);
                }
            }
        }
    }

    @Override
    public final void m(d0 d0Var, long j10) {
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
        p2.d dVar = this.f17606b;
        dVar.getClass();
        dVar.e.add(this);
        p2.p pVar = dVar.f43939s;
        pVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        n0 c10 = dVar.c(0);
        c10.getClass();
        n0 c11 = dVar.c(2);
        c11.getClass();
        n0 c12 = dVar.c(3);
        c12.getClass();
        boolean isEmpty = c10.isEmpty();
        this.H = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.f17605a;
        boolean z16 = this.f17613x;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            n0Var = c12;
        } else {
            w wVar = pVar.f44026j;
            List list2 = pVar.f44027k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < c10.size(); i15++) {
                w wVar2 = ((p2.w) c10.get(i15)).f44071a.f44068a;
                int i16 = wVar2.A;
                String str2 = wVar2.f4124k;
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
            p2.w[] wVarArr = new p2.w[i12];
            w[] wVarArr2 = new w[i12];
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
                    p2.w wVar3 = (p2.w) c10.get(i21);
                    wVarArr[i20] = wVar3;
                    wVarArr2[i20] = wVar3.f44071a.f44068a;
                    iArr2[i20] = i21;
                    i20++;
                }
                i21++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = wVarArr2[0].f4124k;
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
            q e = e("main", i22, wVarArr, wVarArr2, wVar, list3, map3, j10);
            arrayList3.add(e);
            arrayList4.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    w[] wVarArr3 = new w[i12];
                    int i23 = 0;
                    while (i23 < i12) {
                        w wVar4 = wVarArr2[i23];
                        String w9 = m0.w(2, wVar4.f4124k);
                        String d = v0.d(w9);
                        w[] wVarArr4 = wVarArr2;
                        v vVar = new v();
                        vVar.f4065a = wVar4.f4117a;
                        vVar.f4066b = wVar4.f4118b;
                        vVar.f4067c = n0.u(wVar4.f4119c);
                        vVar.f4078q = v0.n(wVar4.f4131r);
                        vVar.f4079r = v0.n(d);
                        vVar.f4071j = w9;
                        vVar.f4072k = wVar4.f4125l;
                        vVar.h = wVar4.h;
                        vVar.f4070i = wVar4.f4122i;
                        vVar.f4085y = wVar4.f4138z;
                        vVar.f4086z = wVar4.A;
                        vVar.C = wVar4.D;
                        vVar.e = wVar4.e;
                        vVar.f4068f = wVar4.f4120f;
                        vVar.H = wVar4.I;
                        wVarArr3[i23] = new w(vVar);
                        i23++;
                        wVarArr2 = wVarArr4;
                        map3 = map3;
                    }
                    w[] wVarArr5 = wVarArr2;
                    map = map3;
                    arrayList5.add(new p1("main", wVarArr3));
                    if (v10 > 0 && (wVar != null || c11.isEmpty())) {
                        v a2 = f(wVarArr5[0], wVar, false).a();
                        a2.f4073l = "main";
                        arrayList5.add(new p1("main:audio", new w(a2)));
                    }
                    if (list3 != null) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            String j11 = i2.d.j(i24, "main:cc:");
                            v a10 = cVar2.b((w) list3.get(i24)).a();
                            a10.f4073l = "main";
                            arrayList5.add(new p1(j11, new w(a10)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    w[] wVarArr6 = new w[i12];
                    for (int i25 = 0; i25 < i12; i25++) {
                        wVarArr6[i25] = f(wVarArr2[i25], wVar, true);
                    }
                    arrayList5.add(new p1("main", wVarArr6));
                }
                v vVar2 = new v();
                str = "ID3";
                vVar2.f4065a = str;
                vVar2.f4079r = v0.n("application/id3");
                vVar2.f4073l = "main";
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
            String str4 = ((p2.w) c11.get(i26)).f44071a.f44070c;
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
                    if (str4.equals(((p2.w) c11.get(i27)).f44071a.f44070c)) {
                        p2.w wVar5 = (p2.w) c11.get(i27);
                        w wVar6 = wVar5.f44071a.f44068a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(wVar5);
                        arrayList7.add(wVar6);
                        if (m0.v(1, wVar6.f4124k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z18 &= z11;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.f8253a;
                i11 = i26;
                hashSet2 = hashSet3;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q e7 = e(concat, 1, (p2.w[]) arrayList6.toArray(new p2.w[0]), (w[]) arrayList7.toArray(new w[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList4.add(b8.f(arrayList2));
                arrayList3.add(e7);
                if (z10 && z18) {
                    String u10 = r4.c.u(concat, ":id3");
                    v vVar3 = new v();
                    vVar3.f4065a = str;
                    vVar3.f4079r = v0.n("application/id3");
                    vVar3.f4073l = concat;
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
            String str6 = ((p2.w) n0Var3.get(i28)).f44071a.f44070c;
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
                    if (str6.equals(((p2.w) n0Var3.get(i29)).f44071a.f44070c)) {
                        p2.w wVar7 = (p2.w) n0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(wVar7);
                        arrayList10.add(wVar7.f44071a.f44068a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                w[] wVarArr7 = (w[]) arrayList10.toArray(new w[0]);
                String str7 = m0.f8253a;
                l0 l0Var = n0.f8475b;
                n0Var = n0Var3;
                i10 = i28;
                hashSet = hashSet4;
                q e10 = e(concat2, 3, (p2.w[]) arrayList9.toArray(new p2.w[0]), wVarArr7, null, x1.e, map4, j10);
                arrayList4.add(b8.f(arrayList11));
                arrayList3.add(e10);
                int length = wVarArr7.length;
                w[] wVarArr8 = new w[length];
                for (int i30 = 0; i30 < length; i30++) {
                    wVarArr8[i30] = cVar.b(wVarArr7[i30]);
                }
                e10.D(new p1[]{new p1(concat2, wVarArr8)}, new int[0]);
            }
            i28 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList3.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.H = this.J.length;
        for (int i31 = 0; i31 < this.L; i31++) {
            this.J[i31].d.f17591l = true;
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                i2.t0 t0Var = new i2.t0();
                t0Var.f12588a = qVar.f17646f0;
                qVar.p(new u0(t0Var));
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
                    t0Var.f12588a = qVar.f17646f0;
                    qVar.p(new u0(t0Var));
                }
            }
            return false;
        }
        return this.M.p(u0Var);
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
    public final long t(long j10, r1 r1Var) {
        p2.m mVar;
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
                p2.d dVar = iVar.f17587g;
                int c10 = iVar.f17597r.c();
                p2.w[] wVarArr = iVar.e;
                if (c10 < wVarArr.length && c10 != -1) {
                    mVar = dVar.b(wVarArr[iVar.f17597r.l()].c(), true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    n0 n0Var = mVar.f44008r;
                    if (!n0Var.isEmpty()) {
                        long j12 = mVar.h - dVar.I;
                        long j13 = j10 - j12;
                        int d = m0.d(n0Var, Long.valueOf(j13), true);
                        long j14 = ((p2.j) n0Var.get(d)).e;
                        if (mVar.f44032c && d != n0Var.size() - 1) {
                            j11 = ((p2.j) n0Var.get(d + 1)).e;
                        } else {
                            j11 = j14;
                        }
                        return r1Var.a(j13, j14, j11) + j12;
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
