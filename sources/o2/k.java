package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.l1;
import b2.p0;
import b2.r0;
import b2.s0;
import e9.a1;
import e9.i0;
import i2.q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.g0;
import m4.w;
import u2.c0;
import u2.d0;
import u2.n1;
import v7.v7;
public final class k implements d0, p2.t {
    public final j2.k E;
    public final l2.g F = new l2.g(this, 7);
    public c0 G;
    public int H;
    public n1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final c f16741a;
    public final p2.c f16742b;
    public final n4.l f16743c;
    public final g2.c0 d;
    public final n2.m f16744e;
    public final n2.j f16745f;
    public final t7.t h;
    public final a5.a f16746n;
    public final y2.d f16747r;
    public final IdentityHashMap f16748s;
    public final g0 v;
    public final na.d f16749w;
    public final boolean f16750x;
    public final int f16751y;

    public k(c cVar, p2.c cVar2, n4.l lVar, g2.c0 c0Var, n2.m mVar, n2.j jVar, t7.t tVar, a5.a aVar, y2.d dVar, na.d dVar2, boolean z10, int i10, j2.k kVar) {
        this.f16741a = cVar;
        this.f16742b = cVar2;
        this.f16743c = lVar;
        this.d = c0Var;
        this.f16744e = mVar;
        this.f16745f = jVar;
        this.h = tVar;
        this.f16746n = aVar;
        this.f16747r = dVar;
        this.f16749w = dVar2;
        this.f16750x = z10;
        this.f16751y = i10;
        this.E = kVar;
        dVar2.getClass();
        e9.g0 g0Var = i0.f8749b;
        a1 a1Var = a1.f8712e;
        this.M = new u2.n(a1Var, a1Var);
        this.f16748s = new IdentityHashMap();
        this.v = new g0(9);
        this.J = new q[0];
        this.K = new q[0];
    }

    public static b2.s f(b2.s sVar, b2.s sVar2, boolean z10) {
        p0 p0Var;
        int i10;
        String str;
        String str2;
        i0 i0Var;
        int i11;
        int i12;
        String str3;
        int i13;
        e9.g0 g0Var = i0.f8749b;
        a1 a1Var = a1.f8712e;
        int i14 = -1;
        if (sVar2 != null) {
            str2 = sVar2.f3634k;
            p0Var = sVar2.f3635l;
            i11 = sVar2.J;
            i10 = sVar2.f3629e;
            i12 = sVar2.f3630f;
            str = sVar2.d;
            str3 = sVar2.f3627b;
            i0Var = sVar2.f3628c;
        } else {
            String u10 = e2.d0.u(1, sVar.f3634k);
            p0Var = sVar.f3635l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.f3629e;
                i12 = sVar.f3630f;
                str = sVar.d;
                str3 = sVar.f3627b;
                str2 = u10;
                i0Var = sVar.f3628c;
            } else {
                i10 = 0;
                str = null;
                str2 = u10;
                i0Var = a1Var;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        String d = r0.d(str2);
        if (z10) {
            i13 = sVar.h;
        } else {
            i13 = -1;
        }
        if (z10) {
            i14 = sVar.f3632i;
        }
        b2.r rVar = new b2.r();
        rVar.f3569a = sVar.f3626a;
        rVar.f3570b = str3;
        rVar.f3571c = i0.v(i0Var);
        rVar.f3582p = r0.n(sVar.f3640q);
        rVar.f3583q = r0.n(d);
        rVar.f3576j = str2;
        rVar.f3577k = p0Var;
        rVar.h = i13;
        rVar.f3575i = i14;
        rVar.I = i11;
        rVar.f3572e = i10;
        rVar.f3573f = i12;
        rVar.d = str;
        return new b2.s(rVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.J) {
            y2.l lVar = qVar.f16795s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f16798y;
            if (!arrayList.isEmpty()) {
                j jVar = (j) e9.q.l(arrayList);
                int b10 = iVar.b(jVar);
                int i10 = jVar.E;
                boolean z10 = true;
                if (b10 == 1) {
                    if (!jVar.g()) {
                        if (i10 == -1) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        p2.l a2 = iVar.f16723g.a(iVar.f16721e[iVar.h.a(jVar.d)], false);
                        a2.getClass();
                        i0 i0Var2 = a2.f45135r;
                        int i11 = (int) (jVar.f49311s - a2.f45128k);
                        if (i11 < 0) {
                            j3 = 0;
                        } else {
                            if (i11 < i0Var2.size()) {
                                i0Var = ((p2.i) i0Var2.get(i11)).f45110x;
                            } else {
                                i0Var = a2.f45136s;
                            }
                            j3 = ((p2.g) i0Var.get(i10)).f45113c;
                        }
                        jVar.f16736a0 = j3;
                    }
                } else if (b10 == 0) {
                    qVar.H.post(new w(7, qVar, jVar));
                } else if (b10 == 2 && !qVar.f16789j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.b(this);
    }

    @Override
    public final boolean b(android.net.Uri r18, c5.b0 r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.b(android.net.Uri, c5.b0, boolean):boolean");
    }

    @Override
    public final boolean c() {
        return this.M.c();
    }

    @Override
    public final long d() {
        return this.M.d();
    }

    public final q e(String str, int i10, Uri[] uriArr, b2.s[] sVarArr, b2.s sVar, List list, Map map, long j3) {
        return new q(str, i10, this.F, new i(this.f16741a, this.f16742b, uriArr, sVarArr, this.f16743c, this.d, this.v, list, this.E), map, this.f16747r, j3, sVar, this.f16744e, this.f16745f, this.h, this.f16746n, this.f16751y);
    }

    @Override
    public final void g() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.B();
            if (qVar.f16789j0 && !qVar.T) {
                throw s0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long h(long j3) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean F = qVarArr[0].F(j3, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].F(j3, F);
                i10++;
            }
            if (F) {
                ((SparseArray) this.v.f14467b).clear();
            }
        }
        return j3;
    }

    @Override
    public final void i(long j3) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.z()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].j(j3, qVar.f16781d0[i10]);
                }
            }
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        c cVar;
        boolean z10;
        List list;
        List list2;
        q[] qVarArr;
        int i10;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        boolean z11;
        boolean z12;
        c cVar2;
        int i12;
        boolean z13;
        boolean z14;
        int i13;
        Uri[] uriArr;
        this.G = c0Var;
        p2.c cVar3 = this.f16742b;
        cVar3.getClass();
        cVar3.f45063e.add(this);
        p2.o oVar = cVar3.f45067s;
        oVar.getClass();
        List list3 = oVar.f45151g;
        List list4 = oVar.f45149e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = oVar.h;
        int i14 = 0;
        this.H = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c cVar4 = this.f16741a;
        boolean z15 = this.f16750x;
        if (!isEmpty) {
            b2.s sVar = oVar.f45153j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                list2 = list5;
                if (i15 >= list4.size()) {
                    break;
                }
                b2.s sVar2 = ((p2.n) list4.get(i15)).f45144b;
                int i17 = sVar2.f3648z;
                String str = sVar2.f3634k;
                if (i17 <= 0 && e2.d0.u(2, str) == null) {
                    if (e2.d0.u(1, str) != null) {
                        iArr[i15] = 1;
                        i14++;
                    } else {
                        iArr[i15] = -1;
                    }
                } else {
                    iArr[i15] = 2;
                    i16++;
                }
                i15++;
                list5 = list2;
            }
            if (i16 > 0) {
                z13 = false;
                cVar2 = cVar4;
                i12 = i16;
                z12 = true;
            } else if (i14 < size) {
                z12 = false;
                cVar2 = cVar4;
                i12 = size - i14;
                z13 = true;
            } else {
                z12 = false;
                cVar2 = cVar4;
                i12 = size;
                z13 = false;
            }
            Uri[] uriArr2 = new Uri[i12];
            b2.s[] sVarArr = new b2.s[i12];
            int[] iArr2 = new int[i12];
            int i18 = 0;
            int i19 = 0;
            while (i18 < list4.size()) {
                if (z12) {
                    uriArr = uriArr2;
                    if (iArr[i18] != 2) {
                        i18++;
                        uriArr2 = uriArr;
                    }
                } else {
                    uriArr = uriArr2;
                }
                if (!z13 || iArr[i18] != 1) {
                    p2.n nVar = (p2.n) list4.get(i18);
                    uriArr[i19] = nVar.f45143a;
                    sVarArr[i19] = nVar.f45144b;
                    iArr2[i19] = i18;
                    i19++;
                }
                i18++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = sVarArr[0].f3634k;
            int t10 = e2.d0.t(2, str2);
            int t11 = e2.d0.t(1, str2);
            if ((t11 == 1 || (t11 == 0 && list3.isEmpty())) && t10 <= 1 && t11 + t10 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z12 && t11 > 0) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            c cVar5 = cVar2;
            list = list3;
            z10 = z15;
            q e7 = e("main", i13, uriArr3, sVarArr, oVar.f45153j, oVar.f45154k, map, j3);
            arrayList.add(e7);
            arrayList2.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList3 = new ArrayList();
                if (t10 > 0) {
                    b2.s[] sVarArr2 = new b2.s[i12];
                    int i20 = 0;
                    while (i20 < i12) {
                        b2.s sVar3 = sVarArr[i20];
                        String u10 = e2.d0.u(2, sVar3.f3634k);
                        String d = r0.d(u10);
                        b2.r rVar = new b2.r();
                        rVar.f3569a = sVar3.f3626a;
                        rVar.f3570b = sVar3.f3627b;
                        rVar.f3571c = i0.v(sVar3.f3628c);
                        rVar.f3582p = r0.n(sVar3.f3640q);
                        rVar.f3583q = r0.n(d);
                        rVar.f3576j = u10;
                        rVar.f3577k = sVar3.f3635l;
                        rVar.h = sVar3.h;
                        rVar.f3575i = sVar3.f3632i;
                        rVar.f3589x = sVar3.f3647y;
                        rVar.f3590y = sVar3.f3648z;
                        rVar.B = sVar3.C;
                        rVar.f3572e = sVar3.f3629e;
                        rVar.f3573f = sVar3.f3630f;
                        sVarArr2[i20] = new b2.s(rVar);
                        i20++;
                        sVarArr = sVarArr;
                    }
                    b2.s[] sVarArr3 = sVarArr;
                    arrayList3.add(new l1("main", sVarArr2));
                    if (t11 > 0 && (sVar != null || list.isEmpty())) {
                        arrayList3.add(new l1("main:audio", f(sVarArr3[0], sVar, false)));
                    }
                    List list6 = oVar.f45154k;
                    if (list6 != null) {
                        for (int i21 = 0; i21 < list6.size(); i21++) {
                            arrayList3.add(new l1(hg.c.i(i21, "main:cc:"), cVar5.b((b2.s) list6.get(i21))));
                        }
                    }
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    b2.s[] sVarArr4 = new b2.s[i12];
                    for (int i22 = 0; i22 < i12; i22++) {
                        sVarArr4[i22] = f(sVarArr[i22], sVar, true);
                    }
                    arrayList3.add(new l1("main", sVarArr4));
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3569a = "ID3";
                rVar2.f3583q = r0.n("application/id3");
                l1 l1Var = new l1("main:id3", new b2.s(rVar2));
                arrayList3.add(l1Var);
                e7.D((l1[]) arrayList3.toArray(new l1[0]), arrayList3.indexOf(l1Var));
            } else {
                cVar = cVar5;
            }
        } else {
            cVar = cVar4;
            z10 = z15;
            list = list3;
            list2 = list5;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i23 = 0;
        while (i23 < list.size()) {
            List list7 = list;
            String str3 = ((p2.m) list7.get(i23)).f45142c;
            if (!hashSet3.add(str3)) {
                hashSet2 = hashSet3;
                i11 = i23;
                list = list7;
            } else {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z16 = true;
                for (int i24 = 0; i24 < list7.size(); i24++) {
                    if (str3.equals(((p2.m) list7.get(i24)).f45142c)) {
                        p2.m mVar = (p2.m) list7.get(i24);
                        arrayList6.add(Integer.valueOf(i24));
                        Uri uri = mVar.f45140a;
                        b2.s sVar4 = mVar.f45141b;
                        arrayList4.add(uri);
                        arrayList5.add(sVar4);
                        if (e2.d0.t(1, sVar4.f3634k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z16 &= z11;
                    }
                }
                String concat = "audio:".concat(str3);
                String str4 = e2.d0.f8529a;
                list = list7;
                hashSet2 = hashSet3;
                i11 = i23;
                q e10 = e(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (b2.s[]) arrayList5.toArray(new b2.s[0]), null, Collections.EMPTY_LIST, map, j3);
                arrayList2.add(v7.f(arrayList6));
                arrayList.add(e10);
                if (z10 && z16) {
                    e10.D(new l1[]{new l1(concat, (b2.s[]) arrayList5.toArray(new b2.s[0]))}, new int[0]);
                }
            }
            i23 = i11 + 1;
            hashSet3 = hashSet2;
        }
        this.L = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i25 = 0;
        while (i25 < list2.size()) {
            List list8 = list2;
            String str5 = ((p2.m) list8.get(i25)).f45142c;
            if (!hashSet4.add(str5)) {
                hashSet = hashSet4;
                i10 = i25;
                list2 = list8;
            } else {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i26 = 0; i26 < list8.size(); i26++) {
                    if (str5.equals(((p2.m) list8.get(i26)).f45142c)) {
                        p2.m mVar2 = (p2.m) list8.get(i26);
                        arrayList9.add(Integer.valueOf(i26));
                        arrayList7.add(mVar2.f45140a);
                        arrayList8.add(mVar2.f45141b);
                    }
                }
                String concat2 = "subtitle:".concat(str5);
                b2.s[] sVarArr5 = (b2.s[]) arrayList8.toArray(new b2.s[0]);
                String str6 = e2.d0.f8529a;
                e9.g0 g0Var = i0.f8749b;
                list2 = list8;
                i10 = i25;
                hashSet = hashSet4;
                q e11 = e(concat2, 3, (Uri[]) arrayList7.toArray(new Uri[0]), sVarArr5, null, a1.f8712e, map, j3);
                arrayList2.add(v7.f(arrayList9));
                arrayList.add(e11);
                int length = sVarArr5.length;
                b2.s[] sVarArr6 = new b2.s[length];
                for (int i27 = 0; i27 < length; i27++) {
                    sVarArr6[i27] = cVar.b(sVarArr5[i27]);
                }
                e11.D(new l1[]{new l1(concat2, sVarArr6)}, new int[0]);
            }
            i25 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList2.toArray(new int[0]);
        this.H = this.J.length;
        for (int i28 = 0; i28 < this.L; i28++) {
            this.J[i28].d.f16727l = true;
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                i2.r0 r0Var = new i2.r0();
                r0Var.f11874a = qVar.f16785f0;
                qVar.m(new i2.s0(r0Var));
            }
        }
        this.K = this.J;
    }

    @Override
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    i2.r0 r0Var = new i2.r0();
                    r0Var.f11874a = qVar.f16785f0;
                    qVar.m(new i2.s0(r0Var));
                }
            }
            return false;
        }
        return this.M.m(s0Var);
    }

    @Override
    public final long n(x2.r[] r40, boolean[] r41, u2.a1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.n(x2.r[], boolean[], u2.a1[], boolean[], long):long");
    }

    @Override
    public final n1 o() {
        n1 n1Var = this.I;
        n1Var.getClass();
        return n1Var;
    }

    @Override
    public final long p() {
        return this.M.p();
    }

    @Override
    public final long q(long j3, q1 q1Var) {
        p2.l lVar;
        long j10;
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
                p2.c cVar = iVar.f16723g;
                int c10 = iVar.f16733r.c();
                Uri[] uriArr = iVar.f16721e;
                if (c10 < uriArr.length && c10 != -1) {
                    lVar = cVar.a(uriArr[iVar.f16733r.l()], true);
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    i0 i0Var = lVar.f45135r;
                    if (!i0Var.isEmpty()) {
                        long j11 = lVar.h - cVar.f45070y;
                        long j12 = j3 - j11;
                        int c11 = e2.d0.c(i0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.i) i0Var.get(c11)).f45114e;
                        if (lVar.f45159c && c11 != i0Var.size() - 1) {
                            j10 = ((p2.i) i0Var.get(c11 + 1)).f45114e;
                        } else {
                            j10 = j13;
                        }
                        return q1Var.a(j12, j13, j10) + j11;
                    }
                }
            } else {
                i10++;
            }
        }
        return j3;
    }

    @Override
    public final void r(long j3) {
        this.M.r(j3);
    }
}
