package l2;

import android.util.Pair;
import android.util.SparseArray;
import b2.l1;
import b2.p;
import b2.r;
import b2.r0;
import b2.s;
import com.google.firebase.messaging.t;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
import i2.s0;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u2.b1;
import u2.c0;
import u2.c1;
import u2.d0;
import u2.n1;
import u2.z0;
import v7.y7;
public final class b implements d0, b1, v2.g {
    public static final Pattern P = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern Q = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.j F;
    public c0 G;
    public u2.n J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final int f13790a;
    public final a5.a f13791b;
    public final g2.c0 f13792c;
    public final n2.m d;
    public final qb.b e;
    public final t f13793f;
    public final long h;
    public final y2.n f13794n;
    public final y2.d f13795r;
    public final n1 f13796s;
    public final a[] v;
    public final ob.a f13797w;
    public final o f13798x;
    public boolean N = true;
    public v2.h[] H = new v2.h[0];
    public l[] I = new l[0];
    public final IdentityHashMap f13799y = new IdentityHashMap();

    public b(int i10, m2.c cVar, t tVar, int i11, a5.a aVar, g2.c0 c0Var, n2.m mVar, n2.j jVar, qb.b bVar, a5.a aVar2, long j3, y2.n nVar, y2.d dVar, ob.a aVar3, ka.c cVar2, j2.k kVar) {
        String i12;
        int i13;
        int i14;
        int[][] iArr;
        boolean[] zArr;
        s[][] sVarArr;
        s[] sVarArr2;
        m2.f e;
        Integer num;
        n2.m mVar2 = mVar;
        this.f13790a = i10;
        this.K = cVar;
        this.f13793f = tVar;
        this.L = i11;
        this.f13791b = aVar;
        this.f13792c = c0Var;
        this.d = mVar2;
        this.F = jVar;
        this.e = bVar;
        this.E = aVar2;
        this.h = j3;
        this.f13794n = nVar;
        this.f13795r = dVar;
        this.f13797w = aVar3;
        this.f13798x = new o(cVar, cVar2, dVar);
        aVar3.getClass();
        g0 g0Var = i0.f8067b;
        a1 a1Var = a1.e;
        this.J = new u2.n(a1Var, a1Var);
        m2.h b10 = cVar.b(i11);
        List list = b10.d;
        this.M = list;
        List list2 = b10.f14408c;
        int size = list2.size();
        HashMap hashMap = new HashMap(q.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i15)).f14374a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        for (int i16 = 0; i16 < size; i16++) {
            m2.a aVar4 = (m2.a) list2.get(i16);
            List list3 = aVar4.e;
            List list4 = aVar4.f14377f;
            m2.f e7 = e("http://dashif.org/guidelines/trickmode", list3);
            e7 = e7 == null ? e("http://dashif.org/guidelines/trickmode", list4) : e7;
            int intValue = (e7 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(e7.f14401b)))) == null || !b(aVar4, (m2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (e = e("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = e.f14401b;
                String str2 = e2.d0.f7871a;
                for (String str3 : str.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str3)));
                    if (num2 != null && b(aVar4, (m2.a) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] f7 = y7.f((Collection) arrayList.get(i17));
            iArr2[i17] = f7;
            Arrays.sort(f7);
        }
        boolean[] zArr2 = new boolean[size2];
        s[][] sVarArr3 = new s[size2];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr3 = iArr2[i18];
            int length = iArr3.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((m2.a) list2.get(iArr3[i20])).f14376c;
                iArr = iArr2;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    if (!((m2.m) list7.get(i21)).d.isEmpty()) {
                        zArr2[i18] = true;
                        i19++;
                        break;
                    }
                }
                i20++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i18];
            int length2 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 < length2) {
                    int i23 = iArr4[i22];
                    m2.a aVar5 = (m2.a) list2.get(i23);
                    List list8 = ((m2.a) list2.get(i23)).d;
                    int[] iArr5 = iArr4;
                    int i24 = 0;
                    while (i24 < list8.size()) {
                        m2.f fVar = (m2.f) list8.get(i24);
                        zArr = zArr2;
                        sVarArr = sVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f14400a)) {
                            r rVar = new r();
                            rVar.f3245q = r0.n("application/cea-608");
                            rVar.f3232a = a4.a.s(new StringBuilder(), aVar5.f14374a, ":cea608");
                            sVarArr2 = n(fVar, P, new s(rVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f14400a)) {
                            r rVar2 = new r();
                            rVar2.f3245q = r0.n("application/cea-708");
                            rVar2.f3232a = a4.a.s(new StringBuilder(), aVar5.f14374a, ":cea708");
                            sVarArr2 = n(fVar, Q, new s(rVar2));
                            break;
                        } else {
                            i24++;
                            sVarArr3 = sVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i22++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    sVarArr = sVarArr3;
                    sVarArr2 = new s[0];
                    break;
                }
            }
            sVarArr[i18] = sVarArr2;
            if (sVarArr2.length != 0) {
                i19++;
            }
            i18++;
            sVarArr3 = sVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        s[][] sVarArr4 = sVarArr3;
        int size3 = list.size() + i19 + size2;
        l1[] l1VarArr = new l1[size3];
        a[] aVarArr = new a[size3];
        int i25 = 0;
        int i26 = 0;
        while (i26 < size2) {
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i27)).f14376c);
            }
            int size4 = arrayList3.size();
            s[] sVarArr5 = new s[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                s sVar = ((m2.m) arrayList3.get(i28)).f14418a;
                int i30 = i25;
                r a2 = sVar.a();
                a2.R = mVar2.L0(sVar);
                sVarArr5[i28] = new s(a2);
                i28++;
                size2 = i29;
                i25 = i30;
            }
            int i31 = size2;
            int i32 = i25;
            m2.a aVar6 = (m2.a) list2.get(iArr7[0]);
            long j10 = aVar6.f14374a;
            if (j10 != -1) {
                i12 = Long.toString(j10);
            } else {
                i12 = hg.c.i(i26, "unset:");
            }
            int i33 = i32 + 1;
            if (zArr3[i26]) {
                i13 = i32 + 2;
            } else {
                i13 = i33;
                i33 = -1;
            }
            if (sVarArr4[i26].length != 0) {
                i14 = i13 + 1;
            } else {
                i14 = i13;
                i13 = -1;
            }
            j(aVar, sVarArr5);
            List list9 = list2;
            l1VarArr[i32] = new l1(i12, sVarArr5);
            int i34 = aVar6.f14375b;
            g0 g0Var2 = i0.f8067b;
            a1 a1Var2 = a1.e;
            a aVar7 = new a(i34, 0, iArr7, i32, i33, i13, -1, a1Var2);
            int[] iArr8 = iArr7;
            int i35 = i32;
            aVarArr[i35] = aVar7;
            int i36 = -1;
            if (i33 != -1) {
                String g10 = w.c.g(i12, ":emsg");
                r rVar3 = new r();
                rVar3.f3232a = g10;
                rVar3.f3245q = r0.n("application/x-emsg");
                l1VarArr[i33] = new l1(g10, new s(rVar3));
                a aVar8 = new a(5, 1, iArr8, i35, -1, -1, -1, a1Var2);
                iArr8 = iArr8;
                i35 = i35;
                aVarArr[i33] = aVar8;
                i36 = -1;
            }
            if (i13 != i36) {
                String g11 = w.c.g(i12, ":cc");
                aVarArr[i13] = new a(3, 1, iArr8, i35, -1, -1, -1, i0.w(sVarArr4[i26]));
                j(aVar, sVarArr4[i26]);
                l1VarArr[i13] = new l1(g11, sVarArr4[i26]);
            }
            i26++;
            size2 = i31;
            mVar2 = mVar;
            i25 = i14;
            list2 = list9;
        }
        int i37 = 0;
        while (i37 < list.size()) {
            m2.g gVar = (m2.g) list.get(i37);
            r rVar4 = new r();
            rVar4.f3232a = gVar.a();
            rVar4.f3245q = r0.n("application/x-emsg");
            l1VarArr[i25] = new l1(gVar.a() + ":" + i37, new s(rVar4));
            g0 g0Var3 = i0.f8067b;
            aVarArr[i25] = new a(5, 2, new int[0], -1, -1, -1, i37, a1.e);
            i37++;
            i25++;
        }
        Pair create = Pair.create(new n1(l1VarArr), aVarArr);
        this.f13796s = (n1) create.first;
        this.v = (a[]) create.second;
    }

    public static boolean b(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f14375b;
        List list = aVar.f14376c;
        int i11 = aVar2.f14375b;
        List list2 = aVar2.f14376c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                s sVar = ((m2.m) list.get(0)).f14418a;
                s sVar2 = ((m2.m) list2.get(0)).f14418a;
                int i12 = sVar.f3290f & (-16385);
                int i13 = sVar2.f3290f & (-16385);
                if (Objects.equals(sVar.d, sVar2.d) && i12 == i13) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static m2.f e(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.f fVar = (m2.f) list.get(i10);
            if (str.equals(fVar.f14400a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void j(a5.a aVar, s[] sVarArr) {
        String str;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            p pVar = (p) aVar.d;
            if (pVar.f3168b && ((qb.b) pVar.f3169c).W(sVar)) {
                r a2 = sVar.a();
                String str2 = sVar.f3294k;
                a2.f3245q = r0.n("application/x-media3-cues");
                a2.O = ((qb.b) pVar.f3169c).D(sVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sVar.f3301r);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f3238j = sb2.toString();
                a2.v = Long.MAX_VALUE;
                sVar = new s(a2);
            }
            sVarArr[i10] = sVar;
        }
    }

    public static s[] n(m2.f fVar, Pattern pattern, s sVar) {
        String str = fVar.f14401b;
        if (str == null) {
            return new s[]{sVar};
        }
        String str2 = e2.d0.f7871a;
        String[] split = str.split(";", -1);
        s[] sVarArr = new s[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new s[]{sVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r a2 = sVar.a();
            a2.f3232a = sVar.f3287a + ":" + parseInt;
            a2.N = parseInt;
            a2.d = matcher.group(2);
            sVarArr[i10] = new s(a2);
        }
        return sVarArr;
    }

    @Override
    public final boolean c() {
        return this.J.c();
    }

    @Override
    public final long d() {
        return this.J.d();
    }

    public final int f(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f13787c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void g() {
        this.f13794n.a();
    }

    @Override
    public final long h(long j3) {
        v2.h[] hVarArr;
        l[] lVarArr;
        long j10;
        v2.a aVar;
        boolean z10;
        boolean G;
        for (v2.h hVar : this.H) {
            z0[] z0VarArr = hVar.f43809y;
            z0 z0Var = hVar.f43808x;
            y2.m mVar = hVar.f43805r;
            ArrayList arrayList = hVar.v;
            hVar.J = j3;
            hVar.M = false;
            if (hVar.y()) {
                hVar.I = j3;
            } else {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    aVar = (v2.a) arrayList.get(i10);
                    int i11 = (aVar.h > j3 ? 1 : (aVar.h == j3 ? 0 : -1));
                    if (i11 == 0 && aVar.v == -9223372036854775807L) {
                        break;
                    } else if (i11 > 0) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    G = z0Var.F(aVar.d(0));
                } else {
                    long d = hVar.d();
                    if (d != Long.MIN_VALUE && j3 >= d) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    G = z0Var.G(j3, z10);
                }
                if (G) {
                    hVar.K = hVar.A(z0Var.t(), 0);
                    for (z0 z0Var2 : z0VarArr) {
                        z0Var2.G(j3, true);
                    }
                } else {
                    hVar.I = j3;
                    hVar.O = false;
                    arrayList.clear();
                    hVar.K = 0;
                    if (mVar.d()) {
                        z0Var.k();
                        for (z0 z0Var3 : z0VarArr) {
                            z0Var3.k();
                        }
                        mVar.b();
                    } else {
                        mVar.f46251c = null;
                        z0Var.D(false);
                        for (z0 z0Var4 : hVar.f43809y) {
                            z0Var4.D(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.I) {
            int a2 = e2.d0.a(lVar.f13846c, j3, true);
            lVar.h = a2;
            if (lVar.d && a2 == lVar.f13846c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            lVar.f13848n = j10;
        }
        return j3;
    }

    @Override
    public final void i(long j3) {
        v2.h[] hVarArr;
        long j10;
        for (v2.h hVar : this.H) {
            if (!hVar.y()) {
                z0 z0Var = hVar.f43808x;
                int i10 = z0Var.f43477q;
                z0Var.j(j3, true);
                z0 z0Var2 = hVar.f43808x;
                int i11 = z0Var2.f43477q;
                if (i11 > i10) {
                    synchronized (z0Var2) {
                        if (z0Var2.f43476p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = z0Var2.f43474n[z0Var2.f43478r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        z0[] z0VarArr = hVar.f43809y;
                        if (i12 >= z0VarArr.length) {
                            break;
                        }
                        z0VarArr[i12].j(j10, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.A(i11, 0), hVar.K);
                if (min > 0) {
                    e2.d0.V(0, min, hVar.v);
                    hVar.K -= min;
                }
            }
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.G = c0Var;
        c0Var.a(this);
    }

    @Override
    public final long l() {
        v2.h[] hVarArr = this.H;
        int length = hVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            v2.h hVar = hVarArr[i10];
            hVar.getClass();
            try {
                if (hVar.N) {
                    return this.O;
                }
            } finally {
                hVar.N = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final boolean m(s0 s0Var) {
        return this.J.m(s0Var);
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, u2.a1[] a1VarArr, boolean[] zArr2, long j3) {
        int i10;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        boolean z11;
        l1 l1Var;
        int i12;
        a1 a1Var;
        int i13;
        n nVar;
        boolean z12;
        int[] iArr3 = new int[rVarArr.length];
        char c10 = 0;
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= rVarArr.length) {
                break;
            }
            x2.r rVar = rVarArr[i14];
            if (rVar != null) {
                iArr3[i14] = this.f13796s.b(rVar.b());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            if (rVarArr[i15] == null || !zArr[i15]) {
                ?? r32 = a1VarArr[i15];
                if (r32 instanceof v2.h) {
                    ((v2.h) r32).B(this);
                } else if (r32 instanceof v2.f) {
                    v2.f fVar = (v2.f) r32;
                    v2.h hVar = fVar.e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f43799c;
                    e2.d.g(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                a1VarArr[i15] = 0;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            boolean z13 = true;
            if (i17 >= rVarArr.length) {
                break;
            }
            ?? r33 = a1VarArr[i17];
            if ((r33 instanceof u2.q) || (r33 instanceof v2.f)) {
                int f7 = f(i17, iArr3);
                if (f7 == -1) {
                    z12 = a1VarArr[i17] instanceof u2.q;
                } else {
                    ?? r72 = a1VarArr[i17];
                    z12 = ((r72 instanceof v2.f) && ((v2.f) r72).f43797a == a1VarArr[f7]) ? false : false;
                }
                if (!z12) {
                    ?? r34 = a1VarArr[i17];
                    if (r34 instanceof v2.f) {
                        v2.f fVar2 = (v2.f) r34;
                        v2.h hVar2 = fVar2.e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f43799c;
                        e2.d.g(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    a1VarArr[i17] = 0;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < rVarArr.length) {
            x2.r rVar2 = rVarArr[i19];
            if (rVar2 == null) {
                iArr2 = iArr3;
                i11 = i19;
            } else {
                ?? r35 = a1VarArr[i19];
                if (r35 == 0) {
                    zArr2[i19] = z10;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.f13787c;
                    if (i20 == 0) {
                        int i21 = aVar.f13788f;
                        if (i21 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            l1Var = this.f13796s.a(i21);
                            i12 = 1;
                        } else {
                            l1Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f13789g;
                        if (i22 != i10) {
                            a1Var = this.v[i22].h;
                        } else {
                            g0 g0Var = i0.f8067b;
                            a1Var = a1.e;
                        }
                        int size = a1Var.size() + i12;
                        s[] sVarArr = new s[size];
                        int[] iArr4 = new int[size];
                        if (z11) {
                            sVarArr[c10] = l1Var.d[c10];
                            iArr4[c10] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i23 = 0; i23 < a1Var.size(); i23++) {
                            s sVar = (s) a1Var.get(i23);
                            sVarArr[i13] = sVar;
                            iArr4[i13] = 3;
                            arrayList.add(sVar);
                            i13 += z10 ? 1 : 0;
                        }
                        if (this.K.d && z11) {
                            o oVar = this.f13798x;
                            nVar = new n(oVar, oVar.f13854a);
                        } else {
                            nVar = null;
                        }
                        a5.a aVar2 = this.f13791b;
                        y2.n nVar2 = this.f13794n;
                        m2.c cVar = this.K;
                        t tVar = this.f13793f;
                        int i24 = this.L;
                        int[] iArr5 = aVar.f13785a;
                        int i25 = aVar.f13786b;
                        iArr2 = iArr3;
                        long j10 = this.h;
                        g2.c0 c0Var = this.f13792c;
                        g2.h createDataSource = ((g2.g) aVar2.f278c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        n nVar3 = nVar;
                        i11 = i19;
                        v2.h hVar3 = new v2.h(aVar.f13786b, iArr4, sVarArr, new k((p) aVar2.d, nVar2, cVar, tVar, i24, iArr5, rVar2, i25, createDataSource, j10, aVar2.f277b, z11, arrayList, nVar), this, this.f13795r, j3, this.d, this.F, this.e, this.E, this.N);
                        synchronized (this) {
                            this.f13799y.put(hVar3, nVar3);
                        }
                        a1VarArr[i11] = hVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i19;
                        if (i20 == 2) {
                            a1VarArr[i11] = new l((m2.g) this.M.get(aVar.d), rVar2.b().d[0], this.K.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i19;
                    if (r35 instanceof v2.h) {
                        ((v2.h) r35).e.f13839j = rVar2;
                    }
                }
            }
            i19 = i11 + 1;
            iArr3 = iArr2;
            c10 = 0;
            i10 = -1;
            z10 = true;
        }
        int[] iArr6 = iArr3;
        int i26 = 0;
        while (i26 < rVarArr.length) {
            if (a1VarArr[i26] == 0 && rVarArr[i26] != null) {
                a aVar3 = this.v[iArr6[i26]];
                if (aVar3.f13787c == 1) {
                    iArr = iArr6;
                    int f10 = f(i26, iArr);
                    if (f10 == -1) {
                        a1VarArr[i26] = new Object();
                    } else {
                        v2.h hVar4 = (v2.h) a1VarArr[f10];
                        int i27 = aVar3.f13786b;
                        boolean[] zArr5 = hVar4.d;
                        z0[] z0VarArr = hVar4.f43809y;
                        for (int i28 = 0; i28 < z0VarArr.length; i28++) {
                            if (hVar4.f43801b[i28] == i27) {
                                e2.d.g(!zArr5[i28]);
                                zArr5[i28] = true;
                                z0VarArr[i28].G(j3, true);
                                a1VarArr[i26] = new v2.f(hVar4, hVar4, z0VarArr[i28], i28);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i26++;
                    iArr6 = iArr;
                } else {
                    iArr = iArr6;
                }
            } else {
                iArr = iArr6;
            }
            i26++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (?? r73 : a1VarArr) {
            if (r73 instanceof v2.h) {
                arrayList2.add((v2.h) r73);
            } else if (r73 instanceof l) {
                arrayList3.add((l) r73);
            }
        }
        v2.h[] hVarArr = new v2.h[arrayList2.size()];
        this.H = hVarArr;
        arrayList2.toArray(hVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.I = lVarArr;
        arrayList3.toArray(lVarArr);
        ob.a aVar4 = this.f13797w;
        AbstractList w10 = q.w(arrayList2, new j2.e(16));
        aVar4.getClass();
        this.J = new u2.n(arrayList2, w10);
        if (this.N) {
            this.N = false;
            this.O = j3;
        }
        return j3;
    }

    @Override
    public final n1 r() {
        return this.f13796s;
    }

    @Override
    public final long s() {
        return this.J.s();
    }

    @Override
    public final long t(long r20, i2.q1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.t(long, i2.q1):long");
    }

    @Override
    public final void u(long j3) {
        int i10;
        v2.h[] hVarArr = this.H;
        int length = hVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.h hVar = hVarArr[i11];
            if (!hVar.f43805r.d()) {
                long d = this.K.d(this.L);
                z0 z0Var = hVar.f43808x;
                e2.d.g(!hVar.f43805r.d());
                if (!hVar.y() && d != -9223372036854775807L && !hVar.v.isEmpty()) {
                    v2.a w10 = hVar.w();
                    long j10 = w10.f43774w;
                    if (j10 == -9223372036854775807L) {
                        j10 = w10.f43795n;
                    }
                    if (j10 > d) {
                        long q6 = z0Var.q();
                        if (q6 > d) {
                            z0Var.l(Math.max(d, z0Var.r() + 1));
                            z0[] z0VarArr = hVar.f43809y;
                            int length2 = z0VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                z0 z0Var2 = z0VarArr[i12];
                                z0Var2.l(Math.max(d, z0Var2.r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            hVar.h.y(hVar.f43800a, d, q6);
                            i11 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i11;
            i11 = i10 + 1;
        }
        this.J.u(j3);
    }

    @Override
    public final void v(c1 c1Var) {
        this.G.v(this);
    }
}
