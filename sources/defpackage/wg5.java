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
public final class wg5 implements xt6, oh5 {
    public final boolean E;
    public final ig8 F;
    public final kj4 G = new kj4(this, (byte) 7);
    public wt6 H;
    public int I;
    public u1c J;
    public vh5[] K;
    public vh5[] L;
    public int M;
    public er2 N;
    public final long O;
    public final ib3 a;
    public final mb3 b;
    public final z8d c;
    public final v2c d;
    public final pr3 e;
    public final mr3 f;
    public final z6f h;
    public final lp n;
    public final rx6 r;
    public final IdentityHashMap s;
    public final pq8 w;
    public final rg7 x;
    public final boolean y;

    public wg5(ib3 ib3Var, mb3 mb3Var, z8d z8dVar, v2c v2cVar, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, rx6 rx6Var, rg7 rg7Var, boolean z, int i, ig8 ig8Var) {
        this.a = ib3Var;
        this.b = mb3Var;
        this.c = z8dVar;
        this.d = v2cVar;
        this.e = pr3Var;
        this.f = mr3Var;
        this.h = z6fVar;
        this.n = lpVar;
        this.r = rx6Var;
        this.x = rg7Var;
        this.y = z;
        this.E = i;
        this.F = ig8Var;
        rg7Var.getClass();
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        this.N = new er2(j99Var, j99Var);
        this.s = new IdentityHashMap();
        this.w = new pq8((byte) 22);
        this.K = new vh5[0];
        this.L = new vh5[0];
        this.O = Long.MIN_VALUE;
    }

    public static ko4 g(ko4 ko4Var, ko4 ko4Var2, boolean z) {
        uf7 uf7Var;
        int i;
        String str;
        String str2;
        po5 po5Var;
        int i2;
        int i3;
        String str3;
        int i4;
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        int i5 = -1;
        if (ko4Var2 != null) {
            str2 = ko4Var2.l;
            uf7Var = ko4Var2.m;
            i2 = ko4Var2.N;
            i = ko4Var2.e;
            i3 = ko4Var2.f;
            str = ko4Var2.d;
            str3 = ko4Var2.b;
            po5Var = ko4Var2.c;
        } else {
            String w = gcc.w(1, ko4Var.l);
            uf7Var = ko4Var.m;
            if (z) {
                i2 = ko4Var.N;
                i = ko4Var.e;
                i3 = ko4Var.f;
                str = ko4Var.d;
                str3 = ko4Var.b;
                str2 = w;
                po5Var = ko4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = w;
                po5Var = j99Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String d = dg7.d(str2);
        if (z) {
            int i6 = ko4Var.i;
            i5 = ko4Var.j;
            i4 = i6;
        } else {
            i4 = -1;
        }
        jo4 jo4Var = new jo4();
        jo4Var.a = ko4Var.a;
        jo4Var.b = str3;
        jo4Var.c = po5.q(po5Var);
        jo4Var.r = dg7.n(ko4Var.s);
        jo4Var.s = dg7.n(d);
        jo4Var.k = str2;
        jo4Var.l = uf7Var;
        jo4Var.i = i4;
        jo4Var.j = i5;
        jo4Var.M = i2;
        jo4Var.e = i;
        jo4Var.f = i3;
        jo4Var.d = str;
        return new ko4(jo4Var);
    }

    @Override
    public final void a() {
        vh5[] vh5VarArr;
        po5 po5Var;
        long j;
        for (vh5 vh5Var : this.K) {
            rx6 rx6Var = vh5Var.s;
            sg5 sg5Var = vh5Var.d;
            ArrayList arrayList = vh5Var.E;
            if (!arrayList.isEmpty()) {
                vg5 vg5Var = (vg5) dqe.b(arrayList);
                int c = sg5Var.c(vg5Var);
                int i = vg5Var.F;
                boolean z = true;
                if (c == 1) {
                    if (!vg5Var.h()) {
                        if (i == -1) {
                            z = false;
                        }
                        yve.p(z);
                        fh5 b = sg5Var.g.b(vg5Var.y, false);
                        b.getClass();
                        po5 po5Var2 = b.r;
                        int i2 = (int) (vg5Var.s - b.k);
                        if (i2 < 0) {
                            j = 0;
                        } else {
                            if (i2 < po5Var2.size()) {
                                po5Var = ((ch5) po5Var2.get(i2)).y;
                            } else {
                                po5Var = b.s;
                            }
                            j = ((ah5) po5Var.get(i)).c;
                        }
                        vg5Var.b0 = j;
                    }
                } else if (c == 0) {
                    vh5Var.I.post(new tg5(vh5Var, vg5Var, (byte) 1));
                } else if (c == 2 && !vh5Var.k0 && rx6Var.Z()) {
                    rx6Var.u();
                }
            }
        }
        this.H.f(this);
    }

    @Override
    public final boolean b(Uri uri, ed edVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        qh5 qh5Var;
        ha6 ha6Var;
        int u;
        boolean z4;
        qh5 qh5Var2;
        vh5[] vh5VarArr = this.K;
        int length = vh5VarArr.length;
        int i2 = 0;
        boolean z5 = false;
        while (i2 < length) {
            vh5 vh5Var = vh5VarArr[i2];
            sg5 sg5Var = vh5Var.d;
            qh5[] qh5VarArr = sg5Var.e;
            HashMap hashMap = sg5Var.g.d;
            int length2 = qh5VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                qh5 qh5Var3 = qh5VarArr[i3];
                lb3 lb3Var = (lb3) hashMap.get(uri);
                if (lb3Var != null) {
                    qh5Var = lb3Var.a;
                } else {
                    qh5Var = null;
                }
                if (qh5Var3.equals(qh5Var)) {
                    if (!z) {
                        ga6 a = sg5Var.a(uri);
                        vh5Var.r.getClass();
                        ha6Var = z6f.u3(a, edVar);
                    } else {
                        ha6Var = null;
                    }
                    sg5Var.p = uri;
                    if (ha6Var != null) {
                        byte b = ha6Var.a;
                        ug5 ug5Var = sg5Var.h;
                        if (ug5Var == null || !ug5Var.k) {
                            ug5Var = null;
                        }
                        i = i2;
                        boolean z6 = false;
                        long j = ha6Var.b;
                        if (b != 1) {
                            if (b == 2) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < qh5VarArr.length) {
                                        qh5 qh5Var4 = qh5VarArr[i4];
                                        z2 = z6;
                                        lb3 lb3Var2 = (lb3) hashMap.get(uri);
                                        if (lb3Var2 != null) {
                                            qh5Var2 = lb3Var2.a;
                                        } else {
                                            qh5Var2 = null;
                                        }
                                        if (qh5Var4.equals(qh5Var2)) {
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
                                if (i4 != -1 && (u = sg5Var.s.u(i4)) != -1 && sg5Var.s.p(u, j)) {
                                    lb3 lb3Var3 = (lb3) hashMap.get(uri);
                                    if (lb3Var3 != null) {
                                        z4 = lb3Var3.a(j, uri, null);
                                    } else {
                                        z4 = z2;
                                    }
                                    if (z4) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                grb.i(uh9.k(b, "Invalid fallback selection type: "));
                                return false;
                            }
                        } else {
                            z2 = false;
                            if (ug5Var != null) {
                                sg5Var.s.f();
                                z3 = ug5Var.a(j);
                            } else {
                                lb3 lb3Var4 = (lb3) hashMap.get(uri);
                                if (lb3Var4 != null) {
                                    z3 = lb3Var4.a(j, uri, null);
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
        this.H.f(this);
        return z5;
    }

    @Override
    public final long c(defpackage.e74[] r41, boolean[] r42, defpackage.at9[] r43, boolean[] r44, long r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg5.c(e74[], boolean[], at9[], boolean[], long):long");
    }

    @Override
    public final boolean e() {
        return this.N.e();
    }

    public final defpackage.vh5 f(java.lang.String r18, int r19, defpackage.qh5[] r20, defpackage.ko4[] r21, defpackage.ko4 r22, java.util.List r23, java.util.Map r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg5.f(java.lang.String, int, qh5[], ko4[], ko4, java.util.List, java.util.Map, long):vh5");
    }

    @Override
    public final long h() {
        return this.N.h();
    }

    @Override
    public final long j(long j, az9 az9Var) {
        fh5 fh5Var;
        long j2;
        vh5[] vh5VarArr = this.L;
        int length = vh5VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            vh5 vh5Var = vh5VarArr[i];
            if (vh5Var.R == 2) {
                sg5 sg5Var = vh5Var.d;
                mb3 mb3Var = sg5Var.g;
                int d = sg5Var.s.d();
                qh5[] qh5VarArr = sg5Var.e;
                if (d < qh5VarArr.length && d != -1) {
                    fh5Var = mb3Var.b(qh5VarArr[sg5Var.s.m()].b(), true);
                } else {
                    fh5Var = null;
                }
                if (fh5Var != null) {
                    po5 po5Var = fh5Var.r;
                    if (!po5Var.isEmpty()) {
                        long j3 = fh5Var.h - mb3Var.M;
                        long j4 = j - j3;
                        int d2 = gcc.d(po5Var, Long.valueOf(j4), true);
                        long j5 = ((ch5) po5Var.get(d2)).e;
                        if (fh5Var.c && d2 != po5Var.size() - 1) {
                            j2 = ((ch5) po5Var.get(d2 + 1)).e;
                        } else {
                            j2 = j5;
                        }
                        return az9Var.a(j4, j5, j2) + j3;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override
    public final void l() {
        vh5[] vh5VarArr;
        for (vh5 vh5Var : this.K) {
            vh5Var.B();
            if (vh5Var.k0 && !vh5Var.U) {
                throw hy7.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long m(long j) {
        vh5[] vh5VarArr = this.L;
        if (vh5VarArr.length > 0) {
            boolean F = vh5VarArr[0].F(j, false);
            int i = 1;
            while (true) {
                vh5[] vh5VarArr2 = this.L;
                if (i >= vh5VarArr2.length) {
                    break;
                }
                vh5VarArr2[i].F(j, F);
                i++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j;
    }

    @Override
    public final void n(long j) {
        vh5[] vh5VarArr;
        for (vh5 vh5Var : this.L) {
            if (vh5Var.T && !vh5Var.z()) {
                int length = vh5Var.M.length;
                for (int i = 0; i < length; i++) {
                    vh5Var.M[i].k(j, vh5Var.e0[i]);
                }
            }
        }
    }

    @Override
    public final long p() {
        return -9223372036854775807L;
    }

    @Override
    public final void q(wt6 wt6Var, long j) {
        String str;
        ib3 ib3Var;
        boolean z;
        Map map;
        vh5[] vh5VarArr;
        int i;
        ArrayList arrayList;
        int i2;
        po5 po5Var;
        Map map2;
        ArrayList arrayList2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        List list;
        this.H = wt6Var;
        mb3 mb3Var = this.b;
        mb3Var.e.add(this);
        jh5 jh5Var = mb3Var.w;
        jh5Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        po5 c = mb3Var.c(0);
        c.getClass();
        po5 c2 = mb3Var.c(2);
        c2.getClass();
        po5 c3 = mb3Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        ib3 ib3Var2 = this.a;
        boolean z6 = this.y;
        if (isEmpty) {
            str = "ID3";
            ib3Var = ib3Var2;
            z = z6;
            map = map3;
        } else {
            ko4 ko4Var = jh5Var.j;
            List list2 = jh5Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                ko4 ko4Var2 = ((qh5) c.get(i6)).a.a;
                int i7 = ko4Var2.B;
                String str2 = ko4Var2.l;
                if (i7 <= 0 && gcc.w(2, str2) == null) {
                    if (gcc.w(1, str2) != null) {
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
            qh5[] qh5VarArr = new qh5[i3];
            ko4[] ko4VarArr = new ko4[i3];
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
                    qh5 qh5Var = (qh5) c.get(i11);
                    qh5VarArr[i10] = qh5Var;
                    ko4VarArr[i10] = qh5Var.a.a;
                    i10++;
                }
                i11++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = ko4VarArr[0].l;
            int v = gcc.v(2, str3);
            int i12 = 1;
            int v2 = gcc.v(1, str3);
            if ((v2 == 1 || (v2 == 0 && c2.isEmpty())) && v <= 1 && v2 + v > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            z = z6;
            vh5 f = f("main", (z7 || v2 <= 0) ? 0 : 0, qh5VarArr, ko4VarArr, ko4Var, list3, map3, j);
            arrayList3.add(f);
            if (z && z5) {
                ArrayList arrayList4 = new ArrayList();
                if (v > 0) {
                    ko4[] ko4VarArr2 = new ko4[i3];
                    int i13 = 0;
                    while (i13 < i3) {
                        ko4 ko4Var3 = ko4VarArr[i13];
                        ko4[] ko4VarArr3 = ko4VarArr;
                        String w = gcc.w(2, ko4Var3.l);
                        String d = dg7.d(w);
                        jo4 jo4Var = new jo4();
                        jo4Var.a = ko4Var3.a;
                        jo4Var.b = ko4Var3.b;
                        jo4Var.c = po5.q(ko4Var3.c);
                        jo4Var.r = dg7.n(ko4Var3.s);
                        jo4Var.s = dg7.n(d);
                        jo4Var.k = w;
                        jo4Var.l = ko4Var3.m;
                        jo4Var.i = ko4Var3.i;
                        jo4Var.j = ko4Var3.j;
                        jo4Var.z = ko4Var3.A;
                        jo4Var.A = ko4Var3.B;
                        jo4Var.a(ko4Var3.F);
                        jo4Var.e = ko4Var3.e;
                        jo4Var.f = ko4Var3.f;
                        jo4Var.K = ko4Var3.L;
                        ko4VarArr2[i13] = new ko4(jo4Var);
                        i13++;
                        ko4VarArr = ko4VarArr3;
                        map3 = map3;
                    }
                    ko4[] ko4VarArr4 = ko4VarArr;
                    map = map3;
                    arrayList4.add(new t1c("main", ko4VarArr2));
                    if (v2 > 0 && (ko4Var != null || c2.isEmpty())) {
                        jo4 a = g(ko4VarArr4[0], ko4Var, false).a();
                        a.m = "main";
                        arrayList4.add(new t1c("main:audio", new ko4(a)));
                    }
                    if (list3 != null) {
                        for (int i14 = 0; i14 < list3.size(); i14++) {
                            String k = uh9.k(i14, "main:cc:");
                            jo4 a2 = ib3Var2.e((ko4) list3.get(i14)).a();
                            a2.m = "main";
                            arrayList4.add(new t1c(k, new ko4(a2)));
                        }
                    }
                    ib3Var = ib3Var2;
                } else {
                    map = map3;
                    ib3Var = ib3Var2;
                    ko4[] ko4VarArr5 = new ko4[i3];
                    for (int i15 = 0; i15 < i3; i15++) {
                        ko4VarArr5[i15] = g(ko4VarArr[i15], ko4Var, true);
                    }
                    arrayList4.add(new t1c("main", ko4VarArr5));
                }
                jo4 jo4Var2 = new jo4();
                str = "ID3";
                jo4Var2.a = str;
                jo4Var2.s = dg7.n("application/id3");
                jo4Var2.m = "main";
                t1c t1cVar = new t1c("main:id3", new ko4(jo4Var2));
                arrayList4.add(t1cVar);
                f.C((t1c[]) arrayList4.toArray(new t1c[0]), arrayList4.indexOf(t1cVar));
            } else {
                map = map3;
                str = "ID3";
                ib3Var = ib3Var2;
            }
        }
        ArrayList arrayList5 = new ArrayList(c2.size());
        ArrayList arrayList6 = new ArrayList(c2.size());
        HashSet hashSet2 = new HashSet();
        int i16 = 0;
        while (i16 < c2.size()) {
            String str4 = ((qh5) c2.get(i16)).a.c;
            str4.getClass();
            if (!hashSet2.add(str4)) {
                arrayList = arrayList5;
                i2 = i16;
                po5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
            } else {
                arrayList5.clear();
                arrayList6.clear();
                boolean z8 = true;
                for (int i17 = 0; i17 < c2.size(); i17++) {
                    if (str4.equals(((qh5) c2.get(i17)).a.c)) {
                        qh5 qh5Var2 = (qh5) c2.get(i17);
                        ko4 ko4Var4 = qh5Var2.a.a;
                        arrayList5.add(qh5Var2);
                        arrayList6.add(ko4Var4);
                        if (gcc.v(1, ko4Var4.l) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z8 &= z2;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = gcc.a;
                arrayList = arrayList5;
                i2 = i16;
                po5Var = c2;
                map2 = map;
                arrayList2 = arrayList6;
                hashSet = hashSet2;
                vh5 f2 = f(concat, 1, (qh5[]) arrayList5.toArray(new qh5[0]), (ko4[]) arrayList6.toArray(new ko4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(f2);
                if (z && z8) {
                    String concat2 = concat.concat(":id3");
                    jo4 jo4Var3 = new jo4();
                    jo4Var3.a = str;
                    jo4Var3.s = dg7.n("application/id3");
                    jo4Var3.m = concat;
                    f2.C(new t1c[]{new t1c(concat, (ko4[]) arrayList2.toArray(new ko4[0])), new t1c(concat2, new ko4(jo4Var3))}, 1);
                }
            }
            i16 = i2 + 1;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
            c2 = po5Var;
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
            String str6 = ((qh5) c3.get(i18)).a.c;
            str6.getClass();
            if (!hashSet3.add(str6)) {
                i = i18;
            } else {
                arrayList7.clear();
                arrayList8.clear();
                for (int i19 = 0; i19 < c3.size(); i19++) {
                    if (str6.equals(((qh5) c3.get(i19)).a.c)) {
                        qh5 qh5Var3 = (qh5) c3.get(i19);
                        arrayList7.add(qh5Var3);
                        arrayList8.add(qh5Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                ko4[] ko4VarArr6 = (ko4[]) arrayList8.toArray(new ko4[0]);
                String str7 = gcc.a;
                no5 no5Var = po5.b;
                i = i18;
                vh5 f3 = f(concat3, 3, (qh5[]) arrayList7.toArray(new qh5[0]), ko4VarArr6, null, j99.e, map4, j);
                arrayList3.add(f3);
                int length = ko4VarArr6.length;
                ko4[] ko4VarArr7 = new ko4[length];
                for (int i20 = 0; i20 < length; i20++) {
                    ko4VarArr7[i20] = ib3Var.e(ko4VarArr6[i20]);
                }
                f3.C(new t1c[]{new t1c(concat3, ko4VarArr7)}, new int[0]);
            }
            i18 = i + 1;
        }
        vh5[] vh5VarArr2 = (vh5[]) arrayList3.toArray(new vh5[0]);
        this.K = vh5VarArr2;
        this.I = vh5VarArr2.length;
        int i21 = 0;
        while (true) {
            int i22 = this.M;
            vh5VarArr = this.K;
            if (i21 >= i22) {
                break;
            }
            vh5VarArr[i21].d.m = true;
            i21++;
        }
        for (vh5 vh5Var : vh5VarArr) {
            if (!vh5Var.U) {
                wa6 wa6Var = new wa6();
                wa6Var.a = vh5Var.g0;
                vh5Var.s(new xa6(wa6Var));
            }
        }
        this.L = this.K;
    }

    @Override
    public final u1c r() {
        u1c u1cVar = this.J;
        u1cVar.getClass();
        return u1cVar;
    }

    @Override
    public final boolean s(xa6 xa6Var) {
        vh5[] vh5VarArr;
        if (this.J == null) {
            for (vh5 vh5Var : this.K) {
                if (!vh5Var.U) {
                    wa6 wa6Var = new wa6();
                    wa6Var.a = vh5Var.g0;
                    vh5Var.s(new xa6(wa6Var));
                }
            }
            return false;
        }
        return this.N.s(xa6Var);
    }

    @Override
    public final long t() {
        return this.N.t();
    }

    @Override
    public final void u(long j) {
        this.N.u(j);
    }

    @Override
    public final void d() {
    }
}
