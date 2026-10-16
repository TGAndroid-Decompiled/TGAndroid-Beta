package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.q1;
import b2.u0;
import b2.w;
import b2.w0;
import b2.x;
import b2.x0;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import g2.c0;
import i2.t1;
import i2.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import ji.h5;
import ji.v2;
import ji.w4;
import org.telegram.ui.Wallet.k5;
import p2.u;
import u2.d0;
import u2.e0;
import u2.r1;
import v7.b8;
import v7.u6;
public final class k implements e0, u {
    public final j2.k E;
    public final w4 F = new w4(this, 10);
    public d0 G;
    public int H;
    public r1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.o M;
    public final long N;
    public final c f16208a;
    public final p2.d f16209b;
    public final m.h f16210c;
    public final c0 d;
    public final n2.m e;
    public final n2.j f16211f;
    public final oa.d h;
    public final a5.a f16212n;
    public final androidx.biometric.e f16213r;
    public final IdentityHashMap f16214s;
    public final h5 v;
    public final oa.d f16215w;
    public final boolean f16216x;
    public final int f16217y;

    public k(c cVar, p2.d dVar, m.h hVar, c0 c0Var, n2.m mVar, n2.j jVar, oa.d dVar2, a5.a aVar, androidx.biometric.e eVar, oa.d dVar3, boolean z10, int i10, j2.k kVar) {
        this.f16208a = cVar;
        this.f16209b = dVar;
        this.f16210c = hVar;
        this.d = c0Var;
        this.e = mVar;
        this.f16211f = jVar;
        this.h = dVar2;
        this.f16212n = aVar;
        this.f16213r = eVar;
        this.f16215w = dVar3;
        this.f16216x = z10;
        this.f16217y = i10;
        this.E = kVar;
        dVar3.getClass();
        l0 l0Var = n0.f8595b;
        x1 x1Var = x1.e;
        this.M = new u2.o(x1Var, x1Var);
        this.f16214s = new IdentityHashMap();
        this.v = new h5(10);
        this.J = new q[0];
        this.K = new q[0];
        this.N = Long.MIN_VALUE;
    }

    public static x f(x xVar, x xVar2, boolean z10) {
        u0 u0Var;
        int i10;
        String str;
        String str2;
        n0 n0Var;
        int i11;
        int i12;
        String str3;
        int i13;
        l0 l0Var = n0.f8595b;
        x1 x1Var = x1.e;
        int i14 = -1;
        if (xVar2 != null) {
            str2 = xVar2.f2515k;
            u0Var = xVar2.f2516l;
            i11 = xVar2.K;
            i10 = xVar2.e;
            i12 = xVar2.f2511f;
            str = xVar2.d;
            str3 = xVar2.f2509b;
            n0Var = xVar2.f2510c;
        } else {
            String w9 = m0.w(1, xVar.f2515k);
            u0Var = xVar.f2516l;
            if (z10) {
                i11 = xVar.K;
                i10 = xVar.e;
                i12 = xVar.f2511f;
                str = xVar.d;
                str3 = xVar.f2509b;
                str2 = w9;
                n0Var = xVar.f2510c;
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
        String d = w0.d(str2);
        if (z10) {
            i13 = xVar.h;
        } else {
            i13 = -1;
        }
        if (z10) {
            i14 = xVar.f2513i;
        }
        w wVar = new w();
        wVar.f2456a = xVar.f2508a;
        wVar.f2457b = str3;
        wVar.f2458c = n0.u(n0Var);
        wVar.f2469q = w0.n(xVar.f2522r);
        wVar.f2470r = w0.n(d);
        wVar.f2462j = str2;
        wVar.f2463k = u0Var;
        wVar.h = i13;
        wVar.f2461i = i14;
        wVar.J = i11;
        wVar.e = i10;
        wVar.f2459f = i12;
        wVar.d = str;
        return new x(wVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        n0 n0Var;
        long j10;
        for (q qVar : this.J) {
            y2.l lVar = qVar.f16260s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f16263y;
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
                        p2.m b10 = iVar.f16190g.b(jVar.f16206x, false);
                        b10.getClass();
                        n0 n0Var2 = b10.f42621r;
                        int i11 = (int) (jVar.f46520s - b10.f42614k);
                        if (i11 < 0) {
                            j10 = 0;
                        } else {
                            if (i11 < n0Var2.size()) {
                                n0Var = ((p2.j) n0Var2.get(i11)).f42599x;
                            } else {
                                n0Var = b10.f42622s;
                            }
                            j10 = ((p2.h) n0Var.get(i10)).f42602c;
                        }
                        jVar.f16203a0 = j10;
                    }
                } else if (c10 == 0) {
                    qVar.H.post(new v2(18, qVar, jVar));
                } else if (c10 == 2 && !qVar.f16253j0 && lVar.d()) {
                    lVar.a();
                }
            }
        }
        this.G.F(this);
    }

    @Override
    public final boolean b(Uri uri, c5.c0 c0Var, boolean z10) {
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
            p2.d dVar2 = iVar.f16190g;
            int length2 = wVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    break;
                }
                p2.w wVar3 = wVarArr[i12];
                p2.c cVar = (p2.c) dVar2.d.get(uri);
                if (cVar != null) {
                    wVar = cVar.f42543a;
                } else {
                    wVar = null;
                }
                if (wVar3.equals(wVar)) {
                    if (!z10) {
                        k5 a2 = iVar.a(uri);
                        qVar.f16259r.getClass();
                        dVar = oa.d.x3(a2, c0Var);
                    } else {
                        dVar = null;
                    }
                    iVar.f16197o = uri;
                    if (dVar != null) {
                        int i13 = dVar.f14095a;
                        i10 = i11;
                        long j10 = dVar.f14096b;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < wVarArr.length) {
                                        p2.w wVar4 = wVarArr[i14];
                                        p2.c cVar2 = (p2.c) dVar2.d.get(uri);
                                        if (cVar2 != null) {
                                            wVar2 = cVar2.f42543a;
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
                                if (i14 != -1 && (u10 = iVar.f16200r.u(i14)) != -1 && iVar.f16200r.o(u10, j10)) {
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
        this.G.F(this);
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

    public final q e(String str, int i10, p2.w[] wVarArr, x[] xVarArr, x xVar, List list, Map map, long j10) {
        q qVar = new q(str, i10, this.F, new i(this.f16208a, this.f16209b, wVarArr, xVarArr, this.f16210c, this.d, this.v, list, this.E), map, this.f16213r, j10, xVar, this.e, this.f16211f, this.h, this.f16212n, this.f16217y, null);
        long j11 = this.N;
        qVar.f16254k0 = j11;
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
            if (qVar.f16253j0 && !qVar.T) {
                throw x0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long h(long j10) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean G = qVarArr[0].G(j10, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].G(j10, G);
                i10++;
            }
            if (G) {
                ((SparseArray) this.v.f13315b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void i(long j10) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.z()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].k(j10, qVar.f16246d0[i10]);
                }
            }
        }
    }

    @Override
    public final void k(d0 d0Var, long j10) {
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
        p2.d dVar = this.f16209b;
        dVar.getClass();
        dVar.e.add(this);
        p2.p pVar = dVar.f42552s;
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
        c cVar2 = this.f16208a;
        boolean z16 = this.f16216x;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            n0Var = c12;
        } else {
            x xVar = pVar.f42639j;
            List list2 = pVar.f42640k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < c10.size(); i15++) {
                x xVar2 = ((p2.w) c10.get(i15)).f42684a.f42681a;
                int i16 = xVar2.A;
                String str2 = xVar2.f2515k;
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
            x[] xVarArr = new x[i12];
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
                    p2.w wVar = (p2.w) c10.get(i21);
                    wVarArr[i20] = wVar;
                    xVarArr[i20] = wVar.f42684a.f42681a;
                    iArr2[i20] = i21;
                    i20++;
                }
                i21++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = xVarArr[0].f2515k;
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
            q e = e("main", i22, wVarArr, xVarArr, xVar, list3, map3, j10);
            arrayList3.add(e);
            arrayList4.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    x[] xVarArr2 = new x[i12];
                    int i23 = 0;
                    while (i23 < i12) {
                        x xVar3 = xVarArr[i23];
                        String w9 = m0.w(2, xVar3.f2515k);
                        String d = w0.d(w9);
                        x[] xVarArr3 = xVarArr;
                        w wVar2 = new w();
                        wVar2.f2456a = xVar3.f2508a;
                        wVar2.f2457b = xVar3.f2509b;
                        wVar2.f2458c = n0.u(xVar3.f2510c);
                        wVar2.f2469q = w0.n(xVar3.f2522r);
                        wVar2.f2470r = w0.n(d);
                        wVar2.f2462j = w9;
                        wVar2.f2463k = xVar3.f2516l;
                        wVar2.h = xVar3.h;
                        wVar2.f2461i = xVar3.f2513i;
                        wVar2.f2476y = xVar3.f2529z;
                        wVar2.f2477z = xVar3.A;
                        wVar2.C = xVar3.D;
                        wVar2.e = xVar3.e;
                        wVar2.f2459f = xVar3.f2511f;
                        wVar2.H = xVar3.I;
                        xVarArr2[i23] = new x(wVar2);
                        i23++;
                        xVarArr = xVarArr3;
                        map3 = map3;
                    }
                    x[] xVarArr4 = xVarArr;
                    map = map3;
                    arrayList5.add(new q1("main", xVarArr2));
                    if (v10 > 0 && (xVar != null || c11.isEmpty())) {
                        w a2 = f(xVarArr4[0], xVar, false).a();
                        a2.f2464l = "main";
                        arrayList5.add(new q1("main:audio", new x(a2)));
                    }
                    if (list3 != null) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            String j11 = i2.d.j(i24, "main:cc:");
                            w a10 = cVar2.b((x) list3.get(i24)).a();
                            a10.f2464l = "main";
                            arrayList5.add(new q1(j11, new x(a10)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    x[] xVarArr5 = new x[i12];
                    for (int i25 = 0; i25 < i12; i25++) {
                        xVarArr5[i25] = f(xVarArr[i25], xVar, true);
                    }
                    arrayList5.add(new q1("main", xVarArr5));
                }
                w wVar3 = new w();
                str = "ID3";
                wVar3.f2456a = str;
                wVar3.f2470r = w0.n("application/id3");
                wVar3.f2464l = "main";
                q1 q1Var = new q1("main:id3", new x(wVar3));
                arrayList5.add(q1Var);
                e.E((q1[]) arrayList5.toArray(new q1[0]), arrayList5.indexOf(q1Var));
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
            String str4 = ((p2.w) c11.get(i26)).f42684a.f42683c;
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
                    if (str4.equals(((p2.w) c11.get(i27)).f42684a.f42683c)) {
                        p2.w wVar4 = (p2.w) c11.get(i27);
                        x xVar4 = wVar4.f42684a.f42681a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(wVar4);
                        arrayList7.add(xVar4);
                        if (m0.v(1, xVar4.f2515k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z18 &= z11;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.f8375a;
                i11 = i26;
                hashSet2 = hashSet3;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q e7 = e(concat, 1, (p2.w[]) arrayList6.toArray(new p2.w[0]), (x[]) arrayList7.toArray(new x[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList4.add(b8.f(arrayList2));
                arrayList3.add(e7);
                if (z10 && z18) {
                    String u10 = t8.b.u(concat, ":id3");
                    w wVar5 = new w();
                    wVar5.f2456a = str;
                    wVar5.f2470r = w0.n("application/id3");
                    wVar5.f2464l = concat;
                    e7.E(new q1[]{new q1(concat, (x[]) arrayList.toArray(new x[0])), new q1(u10, new x(wVar5))}, 1);
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
            String str6 = ((p2.w) n0Var3.get(i28)).f42684a.f42683c;
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
                    if (str6.equals(((p2.w) n0Var3.get(i29)).f42684a.f42683c)) {
                        p2.w wVar6 = (p2.w) n0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(wVar6);
                        arrayList10.add(wVar6.f42684a.f42681a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                x[] xVarArr6 = (x[]) arrayList10.toArray(new x[0]);
                String str7 = m0.f8375a;
                l0 l0Var = n0.f8595b;
                n0Var = n0Var3;
                i10 = i28;
                hashSet = hashSet4;
                q e10 = e(concat2, 3, (p2.w[]) arrayList9.toArray(new p2.w[0]), xVarArr6, null, x1.e, map4, j10);
                arrayList4.add(b8.f(arrayList11));
                arrayList3.add(e10);
                int length = xVarArr6.length;
                x[] xVarArr7 = new x[length];
                for (int i30 = 0; i30 < length; i30++) {
                    xVarArr7[i30] = cVar.b(xVarArr6[i30]);
                }
                e10.E(new q1[]{new q1(concat2, xVarArr7)}, new int[0]);
            }
            i28 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList3.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.H = this.J.length;
        for (int i31 = 0; i31 < this.L; i31++) {
            this.J[i31].d.f16194l = true;
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                i2.u0 u0Var = new i2.u0();
                u0Var.f11202a = qVar.f16249f0;
                qVar.m(new v0(u0Var));
            }
        }
        this.K = this.J;
    }

    @Override
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean m(v0 v0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    i2.u0 u0Var = new i2.u0();
                    u0Var.f11202a = qVar.f16249f0;
                    qVar.m(new v0(u0Var));
                }
            }
            return false;
        }
        return this.M.m(v0Var);
    }

    @Override
    public final long n(x2.p[] r40, boolean[] r41, u2.d1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.n(x2.p[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final r1 o() {
        r1 r1Var = this.I;
        r1Var.getClass();
        return r1Var;
    }

    @Override
    public final long p() {
        return this.M.p();
    }

    @Override
    public final long r(long j10, t1 t1Var) {
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
                p2.d dVar = iVar.f16190g;
                int c10 = iVar.f16200r.c();
                p2.w[] wVarArr = iVar.e;
                if (c10 < wVarArr.length && c10 != -1) {
                    mVar = dVar.b(wVarArr[iVar.f16200r.l()].c(), true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    n0 n0Var = mVar.f42621r;
                    if (!n0Var.isEmpty()) {
                        long j12 = mVar.h - dVar.I;
                        long j13 = j10 - j12;
                        int d = m0.d(n0Var, Long.valueOf(j13), true);
                        long j14 = ((p2.j) n0Var.get(d)).e;
                        if (mVar.f42645c && d != n0Var.size() - 1) {
                            j11 = ((p2.j) n0Var.get(d + 1)).e;
                        } else {
                            j11 = j14;
                        }
                        return t1Var.a(j13, j14, j11) + j12;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override
    public final void s(long j10) {
        this.M.s(j10);
    }
}
