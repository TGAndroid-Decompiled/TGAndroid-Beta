package l2;

import android.util.Pair;
import android.util.SparseArray;
import b2.l1;
import b2.r;
import b2.r0;
import com.google.firebase.messaging.s;
import e9.a1;
import e9.g0;
import e9.i0;
import g2.c0;
import i2.q0;
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
import org.telegram.ui.Cells.r6;
import u2.c1;
import u2.d0;
import u2.d1;
import u2.e0;
import u2.e1;
import u2.f1;
import u2.q1;
import v7.y7;
public final class b implements e0, e1, v2.g {
    public static final Pattern P = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern Q = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.j F;
    public d0 G;
    public u2.o J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final int f12696a;
    public final a5.a f12697b;
    public final c0 f12698c;
    public final n2.n d;
    public final rb.a e;
    public final s f12699f;
    public final long h;
    public final y2.o f12700n;
    public final y2.d f12701r;
    public final q1 f12702s;
    public final a[] v;
    public final ob.a f12703w;
    public final q f12704x;
    public boolean N = true;
    public v2.h[] H = new v2.h[0];
    public n[] I = new n[0];
    public final IdentityHashMap f12705y = new IdentityHashMap();

    public b(int i10, m2.c cVar, s sVar, int i11, a5.a aVar, c0 c0Var, n2.n nVar, n2.j jVar, rb.a aVar2, a5.a aVar3, long j3, y2.o oVar, y2.d dVar, ob.a aVar4, a4.m mVar, j2.k kVar) {
        String j10;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        b2.s[][] sVarArr;
        b2.s[] sVarArr2;
        m2.f e;
        Integer num;
        n2.n nVar2 = nVar;
        this.f12696a = i10;
        this.K = cVar;
        this.f12699f = sVar;
        this.L = i11;
        this.f12697b = aVar;
        this.f12698c = c0Var;
        this.d = nVar2;
        this.F = jVar;
        this.e = aVar2;
        this.E = aVar3;
        this.h = j3;
        this.f12700n = oVar;
        this.f12701r = dVar;
        this.f12703w = aVar4;
        this.f12704x = new q(cVar, mVar, dVar);
        aVar4.getClass();
        g0 g0Var = i0.f7384b;
        a1 a1Var = a1.e;
        this.J = new u2.o(a1Var, a1Var);
        m2.h b10 = cVar.b(i11);
        List list = b10.d;
        this.M = list;
        List list2 = b10.f13258c;
        int size = list2.size();
        HashMap hashMap = new HashMap(e9.q.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i14)).f13224a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            m2.a aVar5 = (m2.a) list2.get(i15);
            List list3 = aVar5.e;
            List list4 = aVar5.f13227f;
            m2.f e7 = e("http://dashif.org/guidelines/trickmode", list3);
            e7 = e7 == null ? e("http://dashif.org/guidelines/trickmode", list4) : e7;
            int intValue = (e7 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(e7.f13251b)))) == null || !a(aVar5, (m2.a) list2.get(num.intValue()))) ? i15 : num.intValue();
            if (intValue == i15 && (e = e("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = e.f13251b;
                String str2 = e2.d0.f7188a;
                for (String str3 : str.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str3)));
                    if (num2 != null && a(aVar5, (m2.a) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i16 = 0; i16 < size2; i16++) {
            int[] f7 = y7.f((Collection) arrayList.get(i16));
            iArr2[i16] = f7;
            Arrays.sort(f7);
        }
        boolean[] zArr2 = new boolean[size2];
        b2.s[][] sVarArr3 = new b2.s[size2];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr3 = iArr2[i17];
            int length = iArr3.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((m2.a) list2.get(iArr3[i19])).f13226c;
                iArr = iArr2;
                for (int i20 = 0; i20 < list7.size(); i20++) {
                    if (!((m2.m) list7.get(i20)).d.isEmpty()) {
                        zArr2[i17] = true;
                        i18++;
                        break;
                    }
                }
                i19++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i17];
            int length2 = iArr4.length;
            int i21 = 0;
            while (true) {
                if (i21 < length2) {
                    int i22 = iArr4[i21];
                    m2.a aVar6 = (m2.a) list2.get(i22);
                    List list8 = ((m2.a) list2.get(i22)).d;
                    int[] iArr5 = iArr4;
                    int i23 = 0;
                    while (i23 < list8.size()) {
                        m2.f fVar = (m2.f) list8.get(i23);
                        zArr = zArr2;
                        sVarArr = sVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f13250a)) {
                            r rVar = new r();
                            rVar.f1946q = r0.n("application/cea-608");
                            rVar.f1933a = a4.a.r(new StringBuilder(), aVar6.f13224a, ":cea608");
                            sVarArr2 = p(fVar, P, new b2.s(rVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f13250a)) {
                            r rVar2 = new r();
                            rVar2.f1946q = r0.n("application/cea-708");
                            rVar2.f1933a = a4.a.r(new StringBuilder(), aVar6.f13224a, ":cea708");
                            sVarArr2 = p(fVar, Q, new b2.s(rVar2));
                            break;
                        } else {
                            i23++;
                            sVarArr3 = sVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i21++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    sVarArr = sVarArr3;
                    sVarArr2 = new b2.s[0];
                    break;
                }
            }
            sVarArr[i17] = sVarArr2;
            if (sVarArr2.length != 0) {
                i18++;
            }
            i17++;
            sVarArr3 = sVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        b2.s[][] sVarArr4 = sVarArr3;
        int size3 = list.size() + i18 + size2;
        l1[] l1VarArr = new l1[size3];
        a[] aVarArr = new a[size3];
        int i24 = 0;
        int i25 = 0;
        while (i25 < size2) {
            int[] iArr7 = iArr6[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i26 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i26)).f13226c);
            }
            int size4 = arrayList3.size();
            b2.s[] sVarArr5 = new b2.s[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size2;
                b2.s sVar2 = ((m2.m) arrayList3.get(i27)).f13268a;
                int i29 = i24;
                r a2 = sVar2.a();
                a2.R = nVar2.L0(sVar2);
                sVarArr5[i27] = new b2.s(a2);
                i27++;
                size2 = i28;
                i24 = i29;
            }
            int i30 = size2;
            int i31 = i24;
            m2.a aVar7 = (m2.a) list2.get(iArr7[0]);
            long j11 = aVar7.f13224a;
            if (j11 != -1) {
                j10 = Long.toString(j11);
            } else {
                j10 = hc.b.j(i25, "unset:");
            }
            int i32 = i31 + 1;
            if (zArr3[i25]) {
                i12 = i31 + 2;
            } else {
                i12 = i32;
                i32 = -1;
            }
            if (sVarArr4[i25].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            l(aVar, sVarArr5);
            List list9 = list2;
            l1VarArr[i31] = new l1(j10, sVarArr5);
            int i33 = aVar7.f13225b;
            g0 g0Var2 = i0.f7384b;
            a1 a1Var2 = a1.e;
            a aVar8 = new a(i33, 0, iArr7, i31, i32, i12, -1, a1Var2);
            int[] iArr8 = iArr7;
            int i34 = i31;
            aVarArr[i34] = aVar8;
            int i35 = -1;
            if (i32 != -1) {
                String t10 = r6.t(j10, ":emsg");
                r rVar3 = new r();
                rVar3.f1933a = t10;
                rVar3.f1946q = r0.n("application/x-emsg");
                l1VarArr[i32] = new l1(t10, new b2.s(rVar3));
                a aVar9 = new a(5, 1, iArr8, i34, -1, -1, -1, a1Var2);
                iArr8 = iArr8;
                i34 = i34;
                aVarArr[i32] = aVar9;
                i35 = -1;
            }
            if (i12 != i35) {
                String t11 = r6.t(j10, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i34, -1, -1, -1, i0.w(sVarArr4[i25]));
                l(aVar, sVarArr4[i25]);
                l1VarArr[i12] = new l1(t11, sVarArr4[i25]);
            }
            i25++;
            size2 = i30;
            nVar2 = nVar;
            i24 = i13;
            list2 = list9;
        }
        int i36 = 0;
        while (i36 < list.size()) {
            m2.g gVar = (m2.g) list.get(i36);
            r rVar4 = new r();
            rVar4.f1933a = gVar.a();
            rVar4.f1946q = r0.n("application/x-emsg");
            l1VarArr[i24] = new l1(gVar.a() + ":" + i36, new b2.s(rVar4));
            g0 g0Var3 = i0.f7384b;
            aVarArr[i24] = new a(5, 2, new int[0], -1, -1, -1, i36, a1.e);
            i36++;
            i24++;
        }
        Pair create = Pair.create(new q1(l1VarArr), aVarArr);
        this.f12702s = (q1) create.first;
        this.v = (a[]) create.second;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f13225b;
        List list = aVar.f13226c;
        int i11 = aVar2.f13225b;
        List list2 = aVar2.f13226c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                b2.s sVar = ((m2.m) list.get(0)).f13268a;
                b2.s sVar2 = ((m2.m) list2.get(0)).f13268a;
                int i12 = sVar.f1991f & (-16385);
                int i13 = sVar2.f1991f & (-16385);
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
            if (str.equals(fVar.f13250a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void l(a5.a aVar, b2.s[] sVarArr) {
        String str;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            b2.s sVar = sVarArr[i10];
            b2.p pVar = (b2.p) aVar.d;
            if (pVar.f1869b && ((rb.a) pVar.f1870c).C(sVar)) {
                r a2 = sVar.a();
                String str2 = sVar.f1995k;
                a2.f1946q = r0.n("application/x-media3-cues");
                a2.O = ((rb.a) pVar.f1870c).k(sVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sVar.f2002r);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f1939j = sb2.toString();
                a2.v = Long.MAX_VALUE;
                sVar = new b2.s(a2);
            }
            sVarArr[i10] = sVar;
        }
    }

    public static b2.s[] p(m2.f fVar, Pattern pattern, b2.s sVar) {
        String str = fVar.f13251b;
        if (str == null) {
            return new b2.s[]{sVar};
        }
        String str2 = e2.d0.f7188a;
        String[] split = str.split(";", -1);
        b2.s[] sVarArr = new b2.s[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new b2.s[]{sVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r a2 = sVar.a();
            a2.f1933a = sVar.f1988a + ":" + parseInt;
            a2.N = parseInt;
            a2.d = matcher.group(2);
            sVarArr[i10] = new b2.s(a2);
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

    @Override
    public final void f() {
        this.f12700n.a();
    }

    @Override
    public final void g(f1 f1Var) {
        this.G.g(this);
    }

    @Override
    public final long h(long j3) {
        v2.h[] hVarArr;
        n[] nVarArr;
        long j10;
        v2.a aVar;
        boolean z10;
        boolean G;
        for (v2.h hVar : this.H) {
            c1[] c1VarArr = hVar.f42880y;
            c1 c1Var = hVar.f42879x;
            y2.n nVar = hVar.f42876r;
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
                    G = c1Var.F(aVar.d(0));
                } else {
                    long d = hVar.d();
                    if (d != Long.MIN_VALUE && j3 >= d) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    G = c1Var.G(j3, z10);
                }
                if (G) {
                    hVar.K = hVar.A(c1Var.t(), 0);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.G(j3, true);
                    }
                } else {
                    hVar.I = j3;
                    hVar.O = false;
                    arrayList.clear();
                    hVar.K = 0;
                    if (nVar.d()) {
                        c1Var.k();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.k();
                        }
                        nVar.b();
                    } else {
                        nVar.f46447c = null;
                        c1Var.D(false);
                        for (c1 c1Var4 : hVar.f42880y) {
                            c1Var4.D(false);
                        }
                    }
                }
            }
        }
        for (n nVar2 : this.I) {
            int a2 = e2.d0.a(nVar2.f12756c, j3, true);
            nVar2.h = a2;
            if (nVar2.d && a2 == nVar2.f12756c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            nVar2.f12758n = j10;
        }
        return j3;
    }

    @Override
    public final void i(long j3) {
        v2.h[] hVarArr;
        long j10;
        for (v2.h hVar : this.H) {
            if (!hVar.y()) {
                c1 c1Var = hVar.f42879x;
                int i10 = c1Var.f42300q;
                c1Var.j(j3, true);
                c1 c1Var2 = hVar.f42879x;
                int i11 = c1Var2.f42300q;
                if (i11 > i10) {
                    synchronized (c1Var2) {
                        if (c1Var2.f42299p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = c1Var2.f42297n[c1Var2.f42301r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        c1[] c1VarArr = hVar.f42880y;
                        if (i12 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i12].j(j10, hVar.d[i12]);
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
    public final void j(d0 d0Var, long j3) {
        this.G = d0Var;
        d0Var.b(this);
    }

    public final int k(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f12693c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final long m() {
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
    public final boolean n(q0 q0Var) {
        return this.J.n(q0Var);
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
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
        p pVar;
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
                iArr3[i14] = this.f12702s.b(rVar.b());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            if (rVarArr[i15] == null || !zArr[i15]) {
                ?? r32 = d1VarArr[i15];
                if (r32 instanceof v2.h) {
                    ((v2.h) r32).B(this);
                } else if (r32 instanceof v2.f) {
                    v2.f fVar = (v2.f) r32;
                    v2.h hVar = fVar.e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f42870c;
                    e2.d.g(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                d1VarArr[i15] = 0;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            boolean z13 = true;
            if (i17 >= rVarArr.length) {
                break;
            }
            ?? r33 = d1VarArr[i17];
            if ((r33 instanceof u2.r) || (r33 instanceof v2.f)) {
                int k10 = k(i17, iArr3);
                if (k10 == -1) {
                    z12 = d1VarArr[i17] instanceof u2.r;
                } else {
                    ?? r72 = d1VarArr[i17];
                    z12 = ((r72 instanceof v2.f) && ((v2.f) r72).f42868a == d1VarArr[k10]) ? false : false;
                }
                if (!z12) {
                    ?? r34 = d1VarArr[i17];
                    if (r34 instanceof v2.f) {
                        v2.f fVar2 = (v2.f) r34;
                        v2.h hVar2 = fVar2.e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f42870c;
                        e2.d.g(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    d1VarArr[i17] = 0;
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
                ?? r35 = d1VarArr[i19];
                if (r35 == 0) {
                    zArr2[i19] = z10;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.f12693c;
                    if (i20 == 0) {
                        int i21 = aVar.f12694f;
                        if (i21 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            l1Var = this.f12702s.a(i21);
                            i12 = 1;
                        } else {
                            l1Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f12695g;
                        if (i22 != i10) {
                            a1Var = this.v[i22].h;
                        } else {
                            g0 g0Var = i0.f7384b;
                            a1Var = a1.e;
                        }
                        int size = a1Var.size() + i12;
                        b2.s[] sVarArr = new b2.s[size];
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
                            b2.s sVar = (b2.s) a1Var.get(i23);
                            sVarArr[i13] = sVar;
                            iArr4[i13] = 3;
                            arrayList.add(sVar);
                            i13 += z10 ? 1 : 0;
                        }
                        if (this.K.d && z11) {
                            q qVar = this.f12704x;
                            pVar = new p(qVar, qVar.f12764a);
                        } else {
                            pVar = null;
                        }
                        a5.a aVar2 = this.f12697b;
                        y2.o oVar = this.f12700n;
                        m2.c cVar = this.K;
                        s sVar2 = this.f12699f;
                        int i24 = this.L;
                        int[] iArr5 = aVar.f12691a;
                        int i25 = aVar.f12692b;
                        iArr2 = iArr3;
                        long j10 = this.h;
                        c0 c0Var = this.f12698c;
                        g2.h createDataSource = ((g2.g) aVar2.f276c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        p pVar2 = pVar;
                        i11 = i19;
                        v2.h hVar3 = new v2.h(aVar.f12692b, iArr4, sVarArr, new m((b2.p) aVar2.d, oVar, cVar, sVar2, i24, iArr5, rVar2, i25, createDataSource, j10, aVar2.f275b, z11, arrayList, pVar), this, this.f12701r, j3, this.d, this.F, this.e, this.E, this.N);
                        synchronized (this) {
                            this.f12705y.put(hVar3, pVar2);
                        }
                        d1VarArr[i11] = hVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i19;
                        if (i20 == 2) {
                            d1VarArr[i11] = new n((m2.g) this.M.get(aVar.d), rVar2.b().d[0], this.K.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i19;
                    if (r35 instanceof v2.h) {
                        ((v2.h) r35).e.f12749j = rVar2;
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
            if (d1VarArr[i26] == 0 && rVarArr[i26] != null) {
                a aVar3 = this.v[iArr6[i26]];
                if (aVar3.f12693c == 1) {
                    iArr = iArr6;
                    int k11 = k(i26, iArr);
                    if (k11 == -1) {
                        d1VarArr[i26] = new Object();
                    } else {
                        v2.h hVar4 = (v2.h) d1VarArr[k11];
                        int i27 = aVar3.f12692b;
                        boolean[] zArr5 = hVar4.d;
                        c1[] c1VarArr = hVar4.f42880y;
                        for (int i28 = 0; i28 < c1VarArr.length; i28++) {
                            if (hVar4.f42872b[i28] == i27) {
                                e2.d.g(!zArr5[i28]);
                                zArr5[i28] = true;
                                c1VarArr[i28].G(j3, true);
                                d1VarArr[i26] = new v2.f(hVar4, hVar4, c1VarArr[i28], i28);
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
        for (?? r73 : d1VarArr) {
            if (r73 instanceof v2.h) {
                arrayList2.add((v2.h) r73);
            } else if (r73 instanceof n) {
                arrayList3.add((n) r73);
            }
        }
        v2.h[] hVarArr = new v2.h[arrayList2.size()];
        this.H = hVarArr;
        arrayList2.toArray(hVarArr);
        n[] nVarArr = new n[arrayList3.size()];
        this.I = nVarArr;
        arrayList3.toArray(nVarArr);
        ob.a aVar4 = this.f12703w;
        AbstractList w10 = e9.q.w(arrayList2, new j2.h(9));
        aVar4.getClass();
        this.J = new u2.o(arrayList2, w10);
        if (this.N) {
            this.N = false;
            this.O = j3;
        }
        return j3;
    }

    @Override
    public final q1 q() {
        return this.f12702s;
    }

    @Override
    public final long r() {
        return this.J.r();
    }

    @Override
    public final long s(long r20, i2.o1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.s(long, i2.o1):long");
    }

    @Override
    public final void u(long j3) {
        int i10;
        v2.h[] hVarArr = this.H;
        int length = hVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.h hVar = hVarArr[i11];
            if (!hVar.f42876r.d()) {
                long d = this.K.d(this.L);
                c1 c1Var = hVar.f42879x;
                e2.d.g(!hVar.f42876r.d());
                if (!hVar.y() && d != -9223372036854775807L && !hVar.v.isEmpty()) {
                    v2.a w10 = hVar.w();
                    long j10 = w10.f42845w;
                    if (j10 == -9223372036854775807L) {
                        j10 = w10.f42866n;
                    }
                    if (j10 > d) {
                        long q6 = c1Var.q();
                        if (q6 > d) {
                            c1Var.l(Math.max(d, c1Var.r() + 1));
                            c1[] c1VarArr = hVar.f42880y;
                            int length2 = c1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                c1 c1Var2 = c1VarArr[i12];
                                c1Var2.l(Math.max(d, c1Var2.r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            hVar.h.x(hVar.f42871a, d, q6);
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
