package l2;

import android.util.Pair;
import android.util.SparseArray;
import b2.l1;
import b2.p;
import b2.r;
import b2.r0;
import b2.s;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
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
import ji.u4;
import org.telegram.ui.Cells.p6;
import u2.b1;
import u2.c0;
import u2.c1;
import u2.d0;
import u2.d1;
import u2.o1;
import v7.x7;
public final class b implements d0, c1, v2.g {
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
    public final int f15208a;
    public final a5.a f15209b;
    public final g2.c0 f15210c;
    public final n2.m d;
    public final rb.a f15211e;
    public final fg.f f15212f;
    public final long h;
    public final y2.n f15213n;
    public final y2.d f15214r;
    public final o1 f15215s;
    public final a[] v;
    public final qb.b f15216w;
    public final o f15217x;
    public boolean N = true;
    public v2.h[] H = new v2.h[0];
    public l[] I = new l[0];
    public final IdentityHashMap f15218y = new IdentityHashMap();

    public b(int i10, m2.c cVar, fg.f fVar, int i11, a5.a aVar, g2.c0 c0Var, n2.m mVar, n2.j jVar, rb.a aVar2, a5.a aVar3, long j3, y2.n nVar, y2.d dVar, qb.b bVar, u4 u4Var, j2.k kVar) {
        String i12;
        int i13;
        int i14;
        int[][] iArr;
        boolean[] zArr;
        s[][] sVarArr;
        s[] sVarArr2;
        m2.f f7;
        Integer num;
        n2.m mVar2 = mVar;
        this.f15208a = i10;
        this.K = cVar;
        this.f15212f = fVar;
        this.L = i11;
        this.f15209b = aVar;
        this.f15210c = c0Var;
        this.d = mVar2;
        this.F = jVar;
        this.f15211e = aVar2;
        this.E = aVar3;
        this.h = j3;
        this.f15213n = nVar;
        this.f15214r = dVar;
        this.f15216w = bVar;
        this.f15217x = new o(cVar, u4Var, dVar);
        bVar.getClass();
        g0 g0Var = i0.f8985b;
        a1 a1Var = a1.f8948e;
        this.J = new u2.n(a1Var, a1Var);
        m2.h b10 = cVar.b(i11);
        List list = b10.d;
        this.M = list;
        List list2 = b10.f15813c;
        int size = list2.size();
        HashMap hashMap = new HashMap(q.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i15)).f15775a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        for (int i16 = 0; i16 < size; i16++) {
            m2.a aVar4 = (m2.a) list2.get(i16);
            List list3 = aVar4.f15778e;
            List list4 = aVar4.f15779f;
            m2.f f10 = f("http://dashif.org/guidelines/trickmode", list3);
            f10 = f10 == null ? f("http://dashif.org/guidelines/trickmode", list4) : f10;
            int intValue = (f10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(f10.f15806b)))) == null || !e(aVar4, (m2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (f7 = f("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = f7.f15806b;
                String str2 = e2.d0.f8765a;
                for (String str3 : str.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str3)));
                    if (num2 != null && e(aVar4, (m2.a) list2.get(num2.intValue()))) {
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
            int[] f11 = x7.f((Collection) arrayList.get(i17));
            iArr2[i17] = f11;
            Arrays.sort(f11);
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
                List list7 = ((m2.a) list2.get(iArr3[i20])).f15777c;
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
                        m2.f fVar2 = (m2.f) list8.get(i24);
                        zArr = zArr2;
                        sVarArr = sVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f15805a)) {
                            r rVar = new r();
                            rVar.f2339q = r0.n("application/cea-608");
                            rVar.f2325a = a4.a.r(new StringBuilder(), aVar5.f15775a, ":cea608");
                            sVarArr2 = i(fVar2, P, new s(rVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f15805a)) {
                            r rVar2 = new r();
                            rVar2.f2339q = r0.n("application/cea-708");
                            rVar2.f2325a = a4.a.r(new StringBuilder(), aVar5.f15775a, ":cea708");
                            sVarArr2 = i(fVar2, Q, new s(rVar2));
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
                arrayList3.addAll(((m2.a) list2.get(i27)).f15777c);
            }
            int size4 = arrayList3.size();
            s[] sVarArr5 = new s[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                s sVar = ((m2.m) arrayList3.get(i28)).f15824a;
                int i30 = i25;
                r a2 = sVar.a();
                a2.R = mVar2.H0(sVar);
                sVarArr5[i28] = new s(a2);
                i28++;
                size2 = i29;
                i25 = i30;
            }
            int i31 = size2;
            int i32 = i25;
            m2.a aVar6 = (m2.a) list2.get(iArr7[0]);
            long j10 = aVar6.f15775a;
            if (j10 != -1) {
                i12 = Long.toString(j10);
            } else {
                i12 = i2.g.i(i26, "unset:");
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
            h(aVar, sVarArr5);
            List list9 = list2;
            l1VarArr[i32] = new l1(i12, sVarArr5);
            int i34 = aVar6.f15776b;
            g0 g0Var2 = i0.f8985b;
            a1 a1Var2 = a1.f8948e;
            a aVar7 = new a(i34, 0, iArr7, i32, i33, i13, -1, a1Var2);
            int[] iArr8 = iArr7;
            int i35 = i32;
            aVarArr[i35] = aVar7;
            int i36 = -1;
            if (i33 != -1) {
                String t10 = p6.t(i12, ":emsg");
                r rVar3 = new r();
                rVar3.f2325a = t10;
                rVar3.f2339q = r0.n("application/x-emsg");
                l1VarArr[i33] = new l1(t10, new s(rVar3));
                a aVar8 = new a(5, 1, iArr8, i35, -1, -1, -1, a1Var2);
                iArr8 = iArr8;
                i35 = i35;
                aVarArr[i33] = aVar8;
                i36 = -1;
            }
            if (i13 != i36) {
                String t11 = p6.t(i12, ":cc");
                aVarArr[i13] = new a(3, 1, iArr8, i35, -1, -1, -1, i0.w(sVarArr4[i26]));
                h(aVar, sVarArr4[i26]);
                l1VarArr[i13] = new l1(t11, sVarArr4[i26]);
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
            rVar4.f2325a = gVar.a();
            rVar4.f2339q = r0.n("application/x-emsg");
            l1VarArr[i25] = new l1(gVar.a() + ":" + i37, new s(rVar4));
            g0 g0Var3 = i0.f8985b;
            aVarArr[i25] = new a(5, 2, new int[0], -1, -1, -1, i37, a1.f8948e);
            i37++;
            i25++;
        }
        Pair create = Pair.create(new o1(l1VarArr), aVarArr);
        this.f15215s = (o1) create.first;
        this.v = (a[]) create.second;
    }

    public static boolean e(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f15776b;
        List list = aVar.f15777c;
        int i11 = aVar2.f15776b;
        List list2 = aVar2.f15777c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                s sVar = ((m2.m) list.get(0)).f15824a;
                s sVar2 = ((m2.m) list2.get(0)).f15824a;
                int i12 = sVar.f2386f & (-16385);
                int i13 = sVar2.f2386f & (-16385);
                if (Objects.equals(sVar.d, sVar2.d) && i12 == i13) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static m2.f f(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.f fVar = (m2.f) list.get(i10);
            if (str.equals(fVar.f15805a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void h(a5.a aVar, s[] sVarArr) {
        String str;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            p pVar = (p) aVar.d;
            if (pVar.f2259b && ((rb.a) pVar.f2260c).i0(sVar)) {
                r a2 = sVar.a();
                String str2 = sVar.f2390k;
                a2.f2339q = r0.n("application/x-media3-cues");
                a2.O = ((rb.a) pVar.f2260c).J(sVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sVar.f2397r);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f2332j = sb2.toString();
                a2.v = Long.MAX_VALUE;
                sVar = new s(a2);
            }
            sVarArr[i10] = sVar;
        }
    }

    public static s[] i(m2.f fVar, Pattern pattern, s sVar) {
        String str = fVar.f15806b;
        if (str == null) {
            return new s[]{sVar};
        }
        String str2 = e2.d0.f8765a;
        String[] split = str.split(";", -1);
        s[] sVarArr = new s[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new s[]{sVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r a2 = sVar.a();
            a2.f2325a = sVar.f2382a + ":" + parseInt;
            a2.N = parseInt;
            a2.d = matcher.group(2);
            sVarArr[i10] = new s(a2);
        }
        return sVarArr;
    }

    @Override
    public final void b(d1 d1Var) {
        this.G.b(this);
    }

    @Override
    public final boolean c() {
        return this.J.c();
    }

    @Override
    public final long d() {
        return this.J.d();
    }

    public final int g(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].f15205e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f15204c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void j() {
        this.f15213n.b();
    }

    @Override
    public final long k(long j3) {
        v2.h[] hVarArr;
        l[] lVarArr;
        long j10;
        v2.a aVar;
        boolean z10;
        boolean G;
        for (v2.h hVar : this.H) {
            u2.a1[] a1VarArr = hVar.f47347y;
            u2.a1 a1Var = hVar.f47346x;
            y2.m mVar = hVar.f47343r;
            ArrayList arrayList = hVar.v;
            hVar.J = j3;
            hVar.M = false;
            if (hVar.z()) {
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
                    G = a1Var.F(aVar.d(0));
                } else {
                    long d = hVar.d();
                    if (d != Long.MIN_VALUE && j3 >= d) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    G = a1Var.G(j3, z10);
                }
                if (G) {
                    hVar.K = hVar.B(a1Var.t(), 0);
                    for (u2.a1 a1Var2 : a1VarArr) {
                        a1Var2.G(j3, true);
                    }
                } else {
                    hVar.I = j3;
                    hVar.O = false;
                    arrayList.clear();
                    hVar.K = 0;
                    if (mVar.d()) {
                        a1Var.k();
                        for (u2.a1 a1Var3 : a1VarArr) {
                            a1Var3.k();
                        }
                        mVar.a();
                    } else {
                        mVar.f49549c = null;
                        a1Var.D(false);
                        for (u2.a1 a1Var4 : hVar.f47347y) {
                            a1Var4.D(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.I) {
            int a2 = e2.d0.a(lVar.f15268c, j3, true);
            lVar.h = a2;
            if (lVar.d && a2 == lVar.f15268c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            lVar.f15271n = j10;
        }
        return j3;
    }

    @Override
    public final void l(long j3) {
        v2.h[] hVarArr;
        long j10;
        for (v2.h hVar : this.H) {
            if (!hVar.z()) {
                u2.a1 a1Var = hVar.f47346x;
                int i10 = a1Var.f46660q;
                a1Var.j(j3, true);
                u2.a1 a1Var2 = hVar.f47346x;
                int i11 = a1Var2.f46660q;
                if (i11 > i10) {
                    synchronized (a1Var2) {
                        if (a1Var2.f46659p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = a1Var2.f46657n[a1Var2.f46661r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        u2.a1[] a1VarArr = hVar.f47347y;
                        if (i12 >= a1VarArr.length) {
                            break;
                        }
                        a1VarArr[i12].j(j10, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.B(i11, 0), hVar.K);
                if (min > 0) {
                    e2.d0.V(0, min, hVar.v);
                    hVar.K -= min;
                }
            }
        }
    }

    @Override
    public final void n(c0 c0Var, long j3) {
        this.G = c0Var;
        c0Var.a(this);
    }

    @Override
    public final long o() {
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
    public final boolean p(i2.r0 r0Var) {
        return this.J.p(r0Var);
    }

    @Override
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
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
                iArr3[i14] = this.f15215s.b(rVar.b());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            if (rVarArr[i15] == null || !zArr[i15]) {
                ?? r32 = b1VarArr[i15];
                if (r32 instanceof v2.h) {
                    ((v2.h) r32).C(this);
                } else if (r32 instanceof v2.f) {
                    v2.f fVar = (v2.f) r32;
                    v2.h hVar = fVar.f47336e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f47335c;
                    e2.d.g(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                b1VarArr[i15] = 0;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            boolean z13 = true;
            if (i17 >= rVarArr.length) {
                break;
            }
            ?? r33 = b1VarArr[i17];
            if ((r33 instanceof u2.q) || (r33 instanceof v2.f)) {
                int g10 = g(i17, iArr3);
                if (g10 == -1) {
                    z12 = b1VarArr[i17] instanceof u2.q;
                } else {
                    ?? r72 = b1VarArr[i17];
                    z12 = ((r72 instanceof v2.f) && ((v2.f) r72).f47333a == b1VarArr[g10]) ? false : false;
                }
                if (!z12) {
                    ?? r34 = b1VarArr[i17];
                    if (r34 instanceof v2.f) {
                        v2.f fVar2 = (v2.f) r34;
                        v2.h hVar2 = fVar2.f47336e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f47335c;
                        e2.d.g(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    b1VarArr[i17] = 0;
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
                ?? r35 = b1VarArr[i19];
                if (r35 == 0) {
                    zArr2[i19] = z10;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.f15204c;
                    if (i20 == 0) {
                        int i21 = aVar.f15206f;
                        if (i21 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            l1Var = this.f15215s.a(i21);
                            i12 = 1;
                        } else {
                            l1Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f15207g;
                        if (i22 != i10) {
                            a1Var = this.v[i22].h;
                        } else {
                            g0 g0Var = i0.f8985b;
                            a1Var = a1.f8948e;
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
                            o oVar = this.f15217x;
                            nVar = new n(oVar, oVar.f15278a);
                        } else {
                            nVar = null;
                        }
                        a5.a aVar2 = this.f15209b;
                        y2.n nVar2 = this.f15213n;
                        m2.c cVar = this.K;
                        fg.f fVar3 = this.f15212f;
                        int i24 = this.L;
                        int[] iArr5 = aVar.f15202a;
                        int i25 = aVar.f15203b;
                        iArr2 = iArr3;
                        long j10 = this.h;
                        g2.c0 c0Var = this.f15210c;
                        g2.h createDataSource = ((g2.g) aVar2.f298c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        n nVar3 = nVar;
                        i11 = i19;
                        v2.h hVar3 = new v2.h(aVar.f15203b, iArr4, sVarArr, new k((p) aVar2.d, nVar2, cVar, fVar3, i24, iArr5, rVar2, i25, createDataSource, j10, aVar2.f297b, z11, arrayList, nVar), this, this.f15214r, j3, this.d, this.F, this.f15211e, this.E, this.N);
                        synchronized (this) {
                            this.f15218y.put(hVar3, nVar3);
                        }
                        b1VarArr[i11] = hVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i19;
                        if (i20 == 2) {
                            b1VarArr[i11] = new l((m2.g) this.M.get(aVar.d), rVar2.b().d[0], this.K.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i19;
                    if (r35 instanceof v2.h) {
                        ((v2.h) r35).f47340e.f15261j = rVar2;
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
            if (b1VarArr[i26] == 0 && rVarArr[i26] != null) {
                a aVar3 = this.v[iArr6[i26]];
                if (aVar3.f15204c == 1) {
                    iArr = iArr6;
                    int g11 = g(i26, iArr);
                    if (g11 == -1) {
                        b1VarArr[i26] = new Object();
                    } else {
                        v2.h hVar4 = (v2.h) b1VarArr[g11];
                        int i27 = aVar3.f15203b;
                        boolean[] zArr5 = hVar4.d;
                        u2.a1[] a1VarArr = hVar4.f47347y;
                        for (int i28 = 0; i28 < a1VarArr.length; i28++) {
                            if (hVar4.f47338b[i28] == i27) {
                                e2.d.g(!zArr5[i28]);
                                zArr5[i28] = true;
                                a1VarArr[i28].G(j3, true);
                                b1VarArr[i26] = new v2.f(hVar4, hVar4, a1VarArr[i28], i28);
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
        for (?? r73 : b1VarArr) {
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
        qb.b bVar = this.f15216w;
        AbstractList w10 = q.w(arrayList2, new j2.e(16));
        bVar.getClass();
        this.J = new u2.n(arrayList2, w10);
        if (this.N) {
            this.N = false;
            this.O = j3;
        }
        return j3;
    }

    @Override
    public final o1 r() {
        return this.f15215s;
    }

    @Override
    public final long s() {
        return this.J.s();
    }

    @Override
    public final long t(long r20, i2.p1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.t(long, i2.p1):long");
    }

    @Override
    public final void u(long j3) {
        int i10;
        v2.h[] hVarArr = this.H;
        int length = hVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.h hVar = hVarArr[i11];
            if (!hVar.f47343r.d()) {
                long d = this.K.d(this.L);
                u2.a1 a1Var = hVar.f47346x;
                e2.d.g(!hVar.f47343r.d());
                if (!hVar.z() && d != -9223372036854775807L && !hVar.v.isEmpty()) {
                    v2.a x10 = hVar.x();
                    long j10 = x10.f47307w;
                    if (j10 == -9223372036854775807L) {
                        j10 = x10.f47331n;
                    }
                    if (j10 > d) {
                        long q6 = a1Var.q();
                        if (q6 > d) {
                            a1Var.l(Math.max(d, a1Var.r() + 1));
                            u2.a1[] a1VarArr = hVar.f47347y;
                            int length2 = a1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                u2.a1 a1Var2 = a1VarArr[i12];
                                a1Var2.l(Math.max(d, a1Var2.r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            hVar.h.y(hVar.f47337a, d, q6);
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
}
