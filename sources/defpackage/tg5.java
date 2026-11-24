package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
public final class tg5 implements tt6, lh5 {
    public final boolean E;
    public final we8 F;
    public final lj4 G = new lj4(this);
    public st6 H;
    public int I;
    public vzb J;
    public sh5[] K;
    public sh5[] L;
    public int M;
    public wr2 N;
    public final long O;
    public final bc3 a;
    public final fc3 b;
    public final k6d c;
    public final w0c d;
    public final is3 e;
    public final fs3 f;
    public final k4f h;
    public final kq n;
    public final mx6 r;
    public final IdentityHashMap s;
    public final et8 w;
    public final kg7 x;
    public final boolean y;

    public tg5(bc3 bc3Var, fc3 fc3Var, k6d k6dVar, w0c w0cVar, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, mx6 mx6Var, kg7 kg7Var, boolean z, int i, we8 we8Var) {
        this.a = bc3Var;
        this.b = fc3Var;
        this.c = k6dVar;
        this.d = w0cVar;
        this.e = is3Var;
        this.f = fs3Var;
        this.h = k4fVar;
        this.n = kqVar;
        this.r = mx6Var;
        this.x = kg7Var;
        this.y = z;
        this.E = i;
        this.F = we8Var;
        kg7Var.getClass();
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        this.N = new wr2(y79Var, y79Var);
        this.s = new IdentityHashMap();
        this.w = new et8();
        this.K = new sh5[0];
        this.L = new sh5[0];
        this.O = Long.MIN_VALUE;
    }

    public static go4 i(go4 go4Var, go4 go4Var2, boolean z) {
        nf7 nf7Var;
        int i;
        String str;
        String str2;
        mo5 mo5Var;
        int i2;
        int i3;
        String str3;
        int i4;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        int i5 = -1;
        if (go4Var2 != null) {
            str2 = go4Var2.l;
            nf7Var = go4Var2.m;
            i2 = go4Var2.N;
            i = go4Var2.e;
            i3 = go4Var2.f;
            str = go4Var2.d;
            str3 = go4Var2.b;
            mo5Var = go4Var2.c;
        } else {
            String w = hac.w(1, go4Var.l);
            nf7Var = go4Var.m;
            if (z) {
                i2 = go4Var.N;
                i = go4Var.e;
                i3 = go4Var.f;
                str = go4Var.d;
                str3 = go4Var.b;
                str2 = w;
                mo5Var = go4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                mo5Var = y79Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String d = wf7.d(str2);
        if (z) {
            int i6 = go4Var.i;
            i5 = go4Var.j;
            i4 = i6;
        } else {
            i4 = -1;
        }
        fo4 fo4Var = new fo4();
        fo4Var.a = go4Var.a;
        fo4Var.b = str3;
        fo4Var.c = mo5.q(mo5Var);
        fo4Var.r = wf7.n(go4Var.s);
        fo4Var.s = wf7.n(d);
        fo4Var.k = str2;
        fo4Var.l = nf7Var;
        fo4Var.i = i4;
        fo4Var.j = i5;
        fo4Var.M = i2;
        fo4Var.e = i;
        fo4Var.f = i3;
        fo4Var.d = str;
        return new go4(fo4Var);
    }

    @Override
    public final void a() {
        sh5[] sh5VarArr;
        mo5 mo5Var;
        long j;
        for (sh5 sh5Var : this.K) {
            mx6 mx6Var = sh5Var.s;
            qg5 qg5Var = sh5Var.d;
            ArrayList arrayList = sh5Var.E;
            if (!arrayList.isEmpty()) {
                sg5 sg5Var = (sg5) lne.b(arrayList);
                int c = qg5Var.c(sg5Var);
                int i = sg5Var.F;
                boolean z = true;
                if (c == 1) {
                    if (!sg5Var.h()) {
                        if (i == -1) {
                            z = false;
                        }
                        jte.p(z);
                        ch5 b = qg5Var.g.b(sg5Var.y, false);
                        b.getClass();
                        mo5 mo5Var2 = b.r;
                        int i2 = (int) (sg5Var.s - b.k);
                        if (i2 < 0) {
                            j = 0;
                        } else {
                            if (i2 < mo5Var2.size()) {
                                mo5Var = ((zg5) mo5Var2.get(i2)).y;
                            } else {
                                mo5Var = b.s;
                            }
                            j = ((xg5) mo5Var.get(i)).c;
                        }
                        sg5Var.b0 = j;
                    }
                } else if (c == 0) {
                    sh5Var.I.post(new fd5(sh5Var, sg5Var, (byte) 5));
                } else if (c == 2 && !sh5Var.k0 && mx6Var.Y()) {
                    mx6Var.v();
                }
            }
        }
        this.H.b(this);
    }

    @Override
    public final boolean b(Uri uri, de deVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        nh5 nh5Var;
        ca6 ca6Var;
        int v;
        boolean z4;
        nh5 nh5Var2;
        sh5[] sh5VarArr = this.K;
        int length = sh5VarArr.length;
        int i2 = 0;
        boolean z5 = false;
        while (i2 < length) {
            sh5 sh5Var = sh5VarArr[i2];
            qg5 qg5Var = sh5Var.d;
            nh5[] nh5VarArr = qg5Var.e;
            HashMap hashMap = qg5Var.g.d;
            int length2 = nh5VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                nh5 nh5Var3 = nh5VarArr[i3];
                ec3 ec3Var = (ec3) hashMap.get(uri);
                if (ec3Var != null) {
                    nh5Var = ec3Var.a;
                } else {
                    nh5Var = null;
                }
                if (nh5Var3.equals(nh5Var)) {
                    if (!z) {
                        ba6 a = qg5Var.a(uri);
                        sh5Var.r.getClass();
                        ca6Var = k4f.u3(a, deVar);
                    } else {
                        ca6Var = null;
                    }
                    qg5Var.p = uri;
                    if (ca6Var != null) {
                        byte b = ca6Var.a;
                        rg5 rg5Var = qg5Var.h;
                        if (rg5Var == null || !rg5Var.k) {
                            rg5Var = null;
                        }
                        i = i2;
                        boolean z6 = false;
                        long j = ca6Var.b;
                        if (b != 1) {
                            if (b == 2) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < nh5VarArr.length) {
                                        nh5 nh5Var4 = nh5VarArr[i4];
                                        z2 = z6;
                                        ec3 ec3Var2 = (ec3) hashMap.get(uri);
                                        if (ec3Var2 != null) {
                                            nh5Var2 = ec3Var2.a;
                                        } else {
                                            nh5Var2 = null;
                                        }
                                        if (nh5Var4.equals(nh5Var2)) {
                                            break;
                                        }
                                        i4++;
                                        z6 = z2;
                                    } else {
                                        z2 = z6;
                                        i4 = -1;
                                        break;
                                    }
                                }
                                if (i4 != -1 && (v = qg5Var.s.v(i4)) != -1 && qg5Var.s.q(v, j)) {
                                    ec3 ec3Var3 = (ec3) hashMap.get(uri);
                                    if (ec3Var3 != null) {
                                        z4 = ec3Var3.a(j, uri, null);
                                    } else {
                                        z4 = z2;
                                    }
                                    if (z4) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                dq9.m(hg9.j(b, "Invalid fallback selection type: "));
                                return false;
                            }
                        } else {
                            z2 = false;
                            if (rg5Var != null) {
                                qg5Var.s.f();
                                z3 = rg5Var.a(j);
                            } else {
                                ec3 ec3Var4 = (ec3) hashMap.get(uri);
                                if (ec3Var4 != null) {
                                    z3 = ec3Var4.a(j, uri, null);
                                }
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            i = i2;
            z2 = false;
            z3 = z2;
            z5 |= z3;
            i2 = i + 1;
        }
        this.H.b(this);
        return z5;
    }

    @Override
    public final long c(defpackage.t74[] r41, boolean[] r42, defpackage.jr9[] r43, boolean[] r44, long r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg5.c(t74[], boolean[], jr9[], boolean[], long):long");
    }

    public final defpackage.sh5 d(java.lang.String r18, int r19, defpackage.nh5[] r20, defpackage.go4[] r21, defpackage.go4 r22, java.util.List r23, java.util.Map r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg5.d(java.lang.String, int, nh5[], go4[], go4, java.util.List, java.util.Map, long):sh5");
    }

    @Override
    public final boolean f() {
        return this.N.f();
    }

    @Override
    public final long g() {
        return this.N.g();
    }

    @Override
    public final long h(long j, jx9 jx9Var) {
        ch5 ch5Var;
        long j2;
        sh5[] sh5VarArr = this.L;
        int length = sh5VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            sh5 sh5Var = sh5VarArr[i];
            if (sh5Var.R == 2) {
                qg5 qg5Var = sh5Var.d;
                fc3 fc3Var = qg5Var.g;
                int d = qg5Var.s.d();
                nh5[] nh5VarArr = qg5Var.e;
                if (d < nh5VarArr.length && d != -1) {
                    ch5Var = fc3Var.b(nh5VarArr[qg5Var.s.n()].b(), true);
                } else {
                    ch5Var = null;
                }
                if (ch5Var != null) {
                    mo5 mo5Var = ch5Var.r;
                    if (!mo5Var.isEmpty()) {
                        long j3 = ch5Var.h - fc3Var.M;
                        long j4 = j - j3;
                        int d2 = hac.d(mo5Var, Long.valueOf(j4), true);
                        long j5 = ((zg5) mo5Var.get(d2)).e;
                        if (ch5Var.c && d2 != mo5Var.size() - 1) {
                            j2 = ((zg5) mo5Var.get(d2 + 1)).e;
                        } else {
                            j2 = j5;
                        }
                        return jx9Var.a(j4, j5, j2) + j3;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override
    public final void j() {
        sh5[] sh5VarArr;
        for (sh5 sh5Var : this.K) {
            sh5Var.C();
            if (sh5Var.k0 && !sh5Var.U) {
                throw bx7.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long k(long j) {
        sh5[] sh5VarArr = this.L;
        if (sh5VarArr.length > 0) {
            boolean F = sh5VarArr[0].F(j, false);
            int i = 1;
            while (true) {
                sh5[] sh5VarArr2 = this.L;
                if (i >= sh5VarArr2.length) {
                    break;
                }
                sh5VarArr2[i].F(j, F);
                i++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j;
    }

    @Override
    public final void l(long j) {
        sh5[] sh5VarArr;
        for (sh5 sh5Var : this.L) {
            if (sh5Var.T && !sh5Var.z()) {
                int length = sh5Var.M.length;
                for (int i = 0; i < length; i++) {
                    sh5Var.M[i].k(j, sh5Var.e0[i]);
                }
            }
        }
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final void o(st6 st6Var, long j) {
        String str;
        bc3 bc3Var;
        boolean z;
        Map map;
        sh5[] sh5VarArr;
        int i;
        ArrayList arrayList;
        int i2;
        mo5 mo5Var;
        Map map2;
        ArrayList arrayList2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        List list;
        this.H = st6Var;
        fc3 fc3Var = this.b;
        fc3Var.e.add(this);
        gh5 gh5Var = fc3Var.w;
        gh5Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        mo5 c = fc3Var.c(0);
        c.getClass();
        mo5 c2 = fc3Var.c(2);
        c2.getClass();
        mo5 c3 = fc3Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        bc3 bc3Var2 = this.a;
        boolean z6 = this.y;
        if (isEmpty) {
            str = "ID3";
            bc3Var = bc3Var2;
            z = z6;
            map = map3;
        } else {
            go4 go4Var = gh5Var.j;
            List list2 = gh5Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                go4 go4Var2 = ((nh5) c.get(i6)).a.a;
                int i7 = go4Var2.B;
                String str2 = go4Var2.l;
                if (i7 <= 0 && hac.w(2, str2) == null) {
                    if (hac.w(1, str2) != null) {
                        iArr[i6] = 1;
                        i5++;
                    } else {
                        iArr[i6] = -1;
                    }
                } else {
                    iArr[i6] = 2;
                    i4++;
                    i5 = i5;
                }
            }
            int i8 = i5;
            if (i4 > 0) {
                z4 = false;
                i3 = i4;
                z3 = true;
            } else if (i8 < size) {
                int i9 = size - i8;
                z3 = false;
                i3 = i9;
                z4 = true;
            } else {
                z3 = false;
                z4 = false;
                i3 = size;
            }
            nh5[] nh5VarArr = new nh5[i3];
            go4[] go4VarArr = new go4[i3];
            int i10 = 0;
            boolean z7 = z3;
            int i11 = 0;
            while (i11 < c.size()) {
                if (z7) {
                    list = list2;
                    if (iArr[i11] != 2) {
                        i11++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z4 || iArr[i11] != 1) {
                    nh5 nh5Var = (nh5) c.get(i11);
                    nh5VarArr[i10] = nh5Var;
                    go4VarArr[i10] = nh5Var.a.a;
                    i10++;
                }
                i11++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = go4VarArr[0].l;
            int v = hac.v(2, str3);
            int i12 = 1;
            int v2 = hac.v(1, str3);
            if ((v2 == 1 || (v2 == 0 && c2.isEmpty())) && v <= 1 && v2 + v > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            z = z6;
            sh5 d = d("main", (z7 || v2 <= 0) ? 0 : 0, nh5VarArr, go4VarArr, go4Var, list3, map3, j);
            arrayList3.add(d);
            if (z && z5) {
                ArrayList arrayList4 = new ArrayList();
                if (v > 0) {
                    go4[] go4VarArr2 = new go4[i3];
                    int i13 = 0;
                    while (i13 < i3) {
                        go4 go4Var3 = go4VarArr[i13];
                        go4[] go4VarArr3 = go4VarArr;
                        String w = hac.w(2, go4Var3.l);
                        String d2 = wf7.d(w);
                        fo4 fo4Var = new fo4();
                        fo4Var.a = go4Var3.a;
                        fo4Var.b = go4Var3.b;
                        fo4Var.c = mo5.q(go4Var3.c);
                        fo4Var.r = wf7.n(go4Var3.s);
                        fo4Var.s = wf7.n(d2);
                        fo4Var.k = w;
                        fo4Var.l = go4Var3.m;
                        fo4Var.i = go4Var3.i;
                        fo4Var.j = go4Var3.j;
                        fo4Var.z = go4Var3.A;
                        fo4Var.A = go4Var3.B;
                        fo4Var.a(go4Var3.F);
                        fo4Var.e = go4Var3.e;
                        fo4Var.f = go4Var3.f;
                        fo4Var.K = go4Var3.L;
                        go4VarArr2[i13] = new go4(fo4Var);
                        i13++;
                        go4VarArr = go4VarArr3;
                        map3 = map3;
                    }
                    go4[] go4VarArr4 = go4VarArr;
                    map = map3;
                    arrayList4.add(new uzb("main", go4VarArr2));
                    if (v2 > 0 && (go4Var != null || c2.isEmpty())) {
                        fo4 a = i(go4VarArr4[0], go4Var, false).a();
                        a.m = "main";
                        arrayList4.add(new uzb("main:audio", new go4(a)));
                    }
                    if (list3 != null) {
                        for (int i14 = 0; i14 < list3.size(); i14++) {
                            String j2 = hg9.j(i14, "main:cc:");
                            fo4 a2 = bc3Var2.e((go4) list3.get(i14)).a();
                            a2.m = "main";
                            arrayList4.add(new uzb(j2, new go4(a2)));
                        }
                    }
                    bc3Var = bc3Var2;
                } else {
                    map = map3;
                    bc3Var = bc3Var2;
                    go4[] go4VarArr5 = new go4[i3];
                    for (int i15 = 0; i15 < i3; i15++) {
                        go4VarArr5[i15] = i(go4VarArr[i15], go4Var, true);
                    }
                    arrayList4.add(new uzb("main", go4VarArr5));
                }
                fo4 fo4Var2 = new fo4();
                str = "ID3";
                fo4Var2.a = str;
                fo4Var2.s = wf7.n("application/id3");
                fo4Var2.m = "main";
                uzb uzbVar = new uzb("main:id3", new go4(fo4Var2));
                arrayList4.add(uzbVar);
                d.D((uzb[]) arrayList4.toArray(new uzb[0]), arrayList4.indexOf(uzbVar));
            } else {
                map = map3;
                str = "ID3";
                bc3Var = bc3Var2;
            }
        }
        ArrayList arrayList5 = new ArrayList(c2.size());
        ArrayList arrayList6 = new ArrayList(c2.size());
        HashSet hashSet2 = new HashSet();
        int i16 = 0;
        while (i16 < c2.size()) {
            String str4 = ((nh5) c2.get(i16)).a.c;
            str4.getClass();
            if (!hashSet2.add(str4)) {
                arrayList = arrayList5;
                i2 = i16;
                mo5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
            } else {
                arrayList5.clear();
                arrayList6.clear();
                boolean z8 = true;
                for (int i17 = 0; i17 < c2.size(); i17++) {
                    if (str4.equals(((nh5) c2.get(i17)).a.c)) {
                        nh5 nh5Var2 = (nh5) c2.get(i17);
                        go4 go4Var4 = nh5Var2.a.a;
                        arrayList5.add(nh5Var2);
                        arrayList6.add(go4Var4);
                        if (hac.v(1, go4Var4.l) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z8 &= z2;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = hac.a;
                arrayList = arrayList5;
                i2 = i16;
                mo5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
                sh5 d3 = d(concat, 1, (nh5[]) arrayList5.toArray(new nh5[0]), (go4[]) arrayList6.toArray(new go4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(d3);
                if (z && z8) {
                    String concat2 = concat.concat(":id3");
                    fo4 fo4Var3 = new fo4();
                    fo4Var3.a = str;
                    fo4Var3.s = wf7.n("application/id3");
                    fo4Var3.m = concat;
                    d3.D(new uzb[]{new uzb(concat, (go4[]) arrayList2.toArray(new go4[0])), new uzb(concat2, new go4(fo4Var3))}, 1);
                }
            }
            i16 = i2 + 1;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
            c2 = mo5Var;
            hashSet2 = hashSet;
            map = map2;
        }
        Map map4 = map;
        this.M = arrayList3.size();
        ArrayList arrayList7 = new ArrayList(c3.size());
        ArrayList arrayList8 = new ArrayList(c3.size());
        HashSet hashSet3 = new HashSet();
        int i18 = 0;
        while (i18 < c3.size()) {
            String str6 = ((nh5) c3.get(i18)).a.c;
            str6.getClass();
            if (!hashSet3.add(str6)) {
                i = i18;
            } else {
                arrayList7.clear();
                arrayList8.clear();
                for (int i19 = 0; i19 < c3.size(); i19++) {
                    if (str6.equals(((nh5) c3.get(i19)).a.c)) {
                        nh5 nh5Var3 = (nh5) c3.get(i19);
                        arrayList7.add(nh5Var3);
                        arrayList8.add(nh5Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                go4[] go4VarArr6 = (go4[]) arrayList8.toArray(new go4[0]);
                String str7 = hac.a;
                ko5 ko5Var = mo5.b;
                i = i18;
                sh5 d4 = d(concat3, 3, (nh5[]) arrayList7.toArray(new nh5[0]), go4VarArr6, null, y79.e, map4, j);
                arrayList3.add(d4);
                int length = go4VarArr6.length;
                go4[] go4VarArr7 = new go4[length];
                for (int i20 = 0; i20 < length; i20++) {
                    go4VarArr7[i20] = bc3Var.e(go4VarArr6[i20]);
                }
                d4.D(new uzb[]{new uzb(concat3, go4VarArr7)}, new int[0]);
            }
            i18 = i + 1;
        }
        sh5[] sh5VarArr2 = (sh5[]) arrayList3.toArray(new sh5[0]);
        this.K = sh5VarArr2;
        this.I = sh5VarArr2.length;
        int i21 = 0;
        while (true) {
            int i22 = this.M;
            sh5VarArr = this.K;
            if (i21 >= i22) {
                break;
            }
            sh5VarArr[i21].d.m = true;
            i21++;
        }
        for (sh5 sh5Var : sh5VarArr) {
            if (!sh5Var.U) {
                ra6 ra6Var = new ra6();
                ra6Var.a = sh5Var.g0;
                sh5Var.r(new sa6(ra6Var));
            }
        }
        this.L = this.K;
    }

    @Override
    public final vzb q() {
        vzb vzbVar = this.J;
        vzbVar.getClass();
        return vzbVar;
    }

    @Override
    public final boolean r(sa6 sa6Var) {
        sh5[] sh5VarArr;
        if (this.J == null) {
            for (sh5 sh5Var : this.K) {
                if (!sh5Var.U) {
                    ra6 ra6Var = new ra6();
                    ra6Var.a = sh5Var.g0;
                    sh5Var.r(new sa6(ra6Var));
                }
            }
            return false;
        }
        return this.N.r(sa6Var);
    }

    @Override
    public final long s() {
        return this.N.s();
    }

    @Override
    public final void t(long j) {
        this.N.t(j);
    }

    @Override
    public final void e() {
    }
}
