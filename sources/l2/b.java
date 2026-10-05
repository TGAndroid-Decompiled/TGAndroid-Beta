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
import e9.q;
import i2.s0;
import ii.n4;
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
import u2.d1;
import u2.e1;
import u2.p1;
import v7.y7;
public final class b implements d0, d1, v2.g {
    public static final Pattern P = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern Q = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.k F;
    public c0 G;
    public u2.n J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final int f15243a;
    public final a5.a f15244b;
    public final g2.c0 f15245c;
    public final n2.n d;
    public final qb.b f15246e;
    public final s f15247f;
    public final long h;
    public final y2.m f15248n;
    public final y2.d f15249r;
    public final p1 f15250s;
    public final a[] v;
    public final ob.a f15251w;
    public final p f15252x;
    public boolean N = true;
    public v2.h[] H = new v2.h[0];
    public m[] I = new m[0];
    public final IdentityHashMap f15253y = new IdentityHashMap();

    public b(int i10, m2.c cVar, s sVar, int i11, a5.a aVar, g2.c0 c0Var, n2.n nVar, n2.k kVar, qb.b bVar, a5.a aVar2, long j3, y2.m mVar, y2.d dVar, ob.a aVar3, n4 n4Var, j2.k kVar2) {
        String h;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        b2.s[][] sVarArr;
        b2.s[] sVarArr2;
        m2.f e7;
        Integer num;
        n2.n nVar2 = nVar;
        this.f15243a = i10;
        this.K = cVar;
        this.f15247f = sVar;
        this.L = i11;
        this.f15244b = aVar;
        this.f15245c = c0Var;
        this.d = nVar2;
        this.F = kVar;
        this.f15246e = bVar;
        this.E = aVar2;
        this.h = j3;
        this.f15248n = mVar;
        this.f15249r = dVar;
        this.f15251w = aVar3;
        this.f15252x = new p(cVar, n4Var, dVar);
        aVar3.getClass();
        g0 g0Var = i0.f8758b;
        a1 a1Var = a1.f8721e;
        this.J = new u2.n(a1Var, a1Var);
        m2.h b10 = cVar.b(i11);
        List list = b10.d;
        this.M = list;
        List list2 = b10.f16011c;
        int size = list2.size();
        HashMap hashMap = new HashMap(q.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i14)).f15973a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            m2.a aVar4 = (m2.a) list2.get(i15);
            List list3 = aVar4.f15976e;
            List list4 = aVar4.f15977f;
            m2.f e10 = e("http://dashif.org/guidelines/trickmode", list3);
            e10 = e10 == null ? e("http://dashif.org/guidelines/trickmode", list4) : e10;
            int intValue = (e10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(e10.f16004b)))) == null || !a(aVar4, (m2.a) list2.get(num.intValue()))) ? i15 : num.intValue();
            if (intValue == i15 && (e7 = e("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = e7.f16004b;
                String str2 = e2.d0.f8538a;
                for (String str3 : str.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str3)));
                    if (num2 != null && a(aVar4, (m2.a) list2.get(num2.intValue()))) {
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
                List list7 = ((m2.a) list2.get(iArr3[i19])).f15975c;
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
                    m2.a aVar5 = (m2.a) list2.get(i22);
                    List list8 = ((m2.a) list2.get(i22)).d;
                    int[] iArr5 = iArr4;
                    int i23 = 0;
                    while (i23 < list8.size()) {
                        m2.f fVar = (m2.f) list8.get(i23);
                        zArr = zArr2;
                        sVarArr = sVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f16003a)) {
                            r rVar = new r();
                            rVar.f3506q = r0.n("application/cea-608");
                            rVar.f3492a = a4.a.s(new StringBuilder(), aVar5.f15973a, ":cea608");
                            sVarArr2 = t(fVar, P, new b2.s(rVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f16003a)) {
                            r rVar2 = new r();
                            rVar2.f3506q = r0.n("application/cea-708");
                            rVar2.f3492a = a4.a.s(new StringBuilder(), aVar5.f15973a, ":cea708");
                            sVarArr2 = t(fVar, Q, new b2.s(rVar2));
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
                arrayList3.addAll(((m2.a) list2.get(i26)).f15975c);
            }
            int size4 = arrayList3.size();
            b2.s[] sVarArr5 = new b2.s[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size2;
                b2.s sVar2 = ((m2.m) arrayList3.get(i27)).f16022a;
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
            m2.a aVar6 = (m2.a) list2.get(iArr7[0]);
            long j10 = aVar6.f15973a;
            if (j10 != -1) {
                h = Long.toString(j10);
            } else {
                h = hg.c.h(i25, "unset:");
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
            s(aVar, sVarArr5);
            List list9 = list2;
            l1VarArr[i31] = new l1(h, sVarArr5);
            int i33 = aVar6.f15974b;
            g0 g0Var2 = i0.f8758b;
            a1 a1Var2 = a1.f8721e;
            a aVar7 = new a(i33, 0, iArr7, i31, i32, i12, -1, a1Var2);
            int[] iArr8 = iArr7;
            int i34 = i31;
            aVarArr[i34] = aVar7;
            int i35 = -1;
            if (i32 != -1) {
                String v = sa.e.v(h, ":emsg");
                r rVar3 = new r();
                rVar3.f3492a = v;
                rVar3.f3506q = r0.n("application/x-emsg");
                l1VarArr[i32] = new l1(v, new b2.s(rVar3));
                a aVar8 = new a(5, 1, iArr8, i34, -1, -1, -1, a1Var2);
                iArr8 = iArr8;
                i34 = i34;
                aVarArr[i32] = aVar8;
                i35 = -1;
            }
            if (i12 != i35) {
                String v9 = sa.e.v(h, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i34, -1, -1, -1, i0.w(sVarArr4[i25]));
                s(aVar, sVarArr4[i25]);
                l1VarArr[i12] = new l1(v9, sVarArr4[i25]);
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
            rVar4.f3492a = gVar.a();
            rVar4.f3506q = r0.n("application/x-emsg");
            l1VarArr[i24] = new l1(gVar.a() + ":" + i36, new b2.s(rVar4));
            g0 g0Var3 = i0.f8758b;
            aVarArr[i24] = new a(5, 2, new int[0], -1, -1, -1, i36, a1.f8721e);
            i36++;
            i24++;
        }
        Pair create = Pair.create(new p1(l1VarArr), aVarArr);
        this.f15250s = (p1) create.first;
        this.v = (a[]) create.second;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f15974b;
        List list = aVar.f15975c;
        int i11 = aVar2.f15974b;
        List list2 = aVar2.f15975c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                b2.s sVar = ((m2.m) list.get(0)).f16022a;
                b2.s sVar2 = ((m2.m) list2.get(0)).f16022a;
                int i12 = sVar.f3553f & (-16385);
                int i13 = sVar2.f3553f & (-16385);
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
            if (str.equals(fVar.f16003a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void s(a5.a aVar, b2.s[] sVarArr) {
        String str;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            b2.s sVar = sVarArr[i10];
            b2.p pVar = (b2.p) aVar.d;
            if (pVar.f3426b && ((qb.b) pVar.f3427c).V(sVar)) {
                r a2 = sVar.a();
                String str2 = sVar.f3557k;
                a2.f3506q = r0.n("application/x-media3-cues");
                a2.O = ((qb.b) pVar.f3427c).D(sVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sVar.f3564r);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f3499j = sb2.toString();
                a2.v = Long.MAX_VALUE;
                sVar = new b2.s(a2);
            }
            sVarArr[i10] = sVar;
        }
    }

    public static b2.s[] t(m2.f fVar, Pattern pattern, b2.s sVar) {
        String str = fVar.f16004b;
        if (str == null) {
            return new b2.s[]{sVar};
        }
        String str2 = e2.d0.f8538a;
        String[] split = str.split(";", -1);
        b2.s[] sVarArr = new b2.s[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new b2.s[]{sVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r a2 = sVar.a();
            a2.f3492a = sVar.f3549a + ":" + parseInt;
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
    public final void f(e1 e1Var) {
        this.G.f(this);
    }

    @Override
    public final void g() {
        this.f15248n.a();
    }

    @Override
    public final long h(long j3) {
        v2.h[] hVarArr;
        m[] mVarArr;
        long j10;
        v2.a aVar;
        boolean z10;
        boolean G;
        for (v2.h hVar : this.H) {
            b1[] b1VarArr = hVar.f47814y;
            b1 b1Var = hVar.f47813x;
            y2.l lVar = hVar.f47810r;
            ArrayList arrayList = hVar.v;
            hVar.J = j3;
            hVar.M = false;
            if (hVar.w()) {
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
                    G = b1Var.F(aVar.d(0));
                } else {
                    long d = hVar.d();
                    if (d != Long.MIN_VALUE && j3 >= d) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    G = b1Var.G(j3, z10);
                }
                if (G) {
                    hVar.K = hVar.A(b1Var.t(), 0);
                    for (b1 b1Var2 : b1VarArr) {
                        b1Var2.G(j3, true);
                    }
                } else {
                    hVar.I = j3;
                    hVar.O = false;
                    arrayList.clear();
                    hVar.K = 0;
                    if (lVar.d()) {
                        b1Var.k();
                        for (b1 b1Var3 : b1VarArr) {
                            b1Var3.k();
                        }
                        lVar.b();
                    } else {
                        lVar.f50417c = null;
                        b1Var.D(false);
                        for (b1 b1Var4 : hVar.f47814y) {
                            b1Var4.D(false);
                        }
                    }
                }
            }
        }
        for (m mVar : this.I) {
            int a2 = e2.d0.a(mVar.f15305c, j3, true);
            mVar.h = a2;
            if (mVar.d && a2 == mVar.f15305c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            mVar.f15308n = j10;
        }
        return j3;
    }

    @Override
    public final void i(long j3) {
        v2.h[] hVarArr;
        long j10;
        for (v2.h hVar : this.H) {
            if (!hVar.w()) {
                b1 b1Var = hVar.f47813x;
                int i10 = b1Var.f47244q;
                b1Var.j(j3, true);
                b1 b1Var2 = hVar.f47813x;
                int i11 = b1Var2.f47244q;
                if (i11 > i10) {
                    synchronized (b1Var2) {
                        if (b1Var2.f47243p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = b1Var2.f47241n[b1Var2.f47245r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        b1[] b1VarArr = hVar.f47814y;
                        if (i12 >= b1VarArr.length) {
                            break;
                        }
                        b1VarArr[i12].j(j10, hVar.d[i12]);
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

    public final int j(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].f15240e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f15239c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.G = c0Var;
        c0Var.b(this);
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
    public final long n(x2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
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
        o oVar;
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
                iArr3[i14] = this.f15250s.b(rVar.b());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            if (rVarArr[i15] == null || !zArr[i15]) {
                ?? r32 = c1VarArr[i15];
                if (r32 instanceof v2.h) {
                    ((v2.h) r32).B(this);
                } else if (r32 instanceof v2.f) {
                    v2.f fVar = (v2.f) r32;
                    v2.h hVar = fVar.f47803e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f47802c;
                    e2.d.g(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                c1VarArr[i15] = 0;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            boolean z13 = true;
            if (i17 >= rVarArr.length) {
                break;
            }
            ?? r33 = c1VarArr[i17];
            if ((r33 instanceof u2.q) || (r33 instanceof v2.f)) {
                int j10 = j(i17, iArr3);
                if (j10 == -1) {
                    z12 = c1VarArr[i17] instanceof u2.q;
                } else {
                    ?? r72 = c1VarArr[i17];
                    z12 = ((r72 instanceof v2.f) && ((v2.f) r72).f47800a == c1VarArr[j10]) ? false : false;
                }
                if (!z12) {
                    ?? r34 = c1VarArr[i17];
                    if (r34 instanceof v2.f) {
                        v2.f fVar2 = (v2.f) r34;
                        v2.h hVar2 = fVar2.f47803e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f47802c;
                        e2.d.g(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    c1VarArr[i17] = 0;
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
                ?? r35 = c1VarArr[i19];
                if (r35 == 0) {
                    zArr2[i19] = z10;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.f15239c;
                    if (i20 == 0) {
                        int i21 = aVar.f15241f;
                        if (i21 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            l1Var = this.f15250s.a(i21);
                            i12 = 1;
                        } else {
                            l1Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f15242g;
                        if (i22 != i10) {
                            a1Var = this.v[i22].h;
                        } else {
                            g0 g0Var = i0.f8758b;
                            a1Var = a1.f8721e;
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
                            p pVar = this.f15252x;
                            oVar = new o(pVar, pVar.f15315a);
                        } else {
                            oVar = null;
                        }
                        a5.a aVar2 = this.f15244b;
                        y2.m mVar = this.f15248n;
                        m2.c cVar = this.K;
                        s sVar2 = this.f15247f;
                        int i24 = this.L;
                        int[] iArr5 = aVar.f15237a;
                        int i25 = aVar.f15238b;
                        iArr2 = iArr3;
                        long j11 = this.h;
                        g2.c0 c0Var = this.f15245c;
                        g2.h createDataSource = ((g2.g) aVar2.f300c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        i11 = i19;
                        v2.h hVar3 = new v2.h(aVar.f15238b, iArr4, sVarArr, new l((b2.p) aVar2.d, mVar, cVar, sVar2, i24, iArr5, rVar2, i25, createDataSource, j11, aVar2.f299b, z11, arrayList, oVar), this, this.f15249r, j3, this.d, this.F, this.f15246e, this.E, this.N);
                        synchronized (this) {
                            this.f15253y.put(hVar3, oVar2);
                        }
                        c1VarArr[i11] = hVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i19;
                        if (i20 == 2) {
                            c1VarArr[i11] = new m((m2.g) this.M.get(aVar.d), rVar2.b().d[0], this.K.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i19;
                    if (r35 instanceof v2.h) {
                        ((v2.h) r35).f47807e.f15298j = rVar2;
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
            if (c1VarArr[i26] == 0 && rVarArr[i26] != null) {
                a aVar3 = this.v[iArr6[i26]];
                if (aVar3.f15239c == 1) {
                    iArr = iArr6;
                    int j12 = j(i26, iArr);
                    if (j12 == -1) {
                        c1VarArr[i26] = new Object();
                    } else {
                        v2.h hVar4 = (v2.h) c1VarArr[j12];
                        int i27 = aVar3.f15238b;
                        boolean[] zArr5 = hVar4.d;
                        b1[] b1VarArr = hVar4.f47814y;
                        for (int i28 = 0; i28 < b1VarArr.length; i28++) {
                            if (hVar4.f47805b[i28] == i27) {
                                e2.d.g(!zArr5[i28]);
                                zArr5[i28] = true;
                                b1VarArr[i28].G(j3, true);
                                c1VarArr[i26] = new v2.f(hVar4, hVar4, b1VarArr[i28], i28);
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
        for (?? r73 : c1VarArr) {
            if (r73 instanceof v2.h) {
                arrayList2.add((v2.h) r73);
            } else if (r73 instanceof m) {
                arrayList3.add((m) r73);
            }
        }
        v2.h[] hVarArr = new v2.h[arrayList2.size()];
        this.H = hVarArr;
        arrayList2.toArray(hVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.I = mVarArr;
        arrayList3.toArray(mVarArr);
        ob.a aVar4 = this.f15251w;
        AbstractList w10 = q.w(arrayList2, new j2.e(19));
        aVar4.getClass();
        this.J = new u2.n(arrayList2, w10);
        if (this.N) {
            this.N = false;
            this.O = j3;
        }
        return j3;
    }

    @Override
    public final p1 o() {
        return this.f15250s;
    }

    @Override
    public final long p() {
        return this.J.p();
    }

    @Override
    public final long q(long r20, i2.q1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.q(long, i2.q1):long");
    }

    @Override
    public final void r(long j3) {
        int i10;
        v2.h[] hVarArr = this.H;
        int length = hVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.h hVar = hVarArr[i11];
            if (!hVar.f47810r.d()) {
                long d = this.K.d(this.L);
                b1 b1Var = hVar.f47813x;
                e2.d.g(!hVar.f47810r.d());
                if (!hVar.w() && d != -9223372036854775807L && !hVar.v.isEmpty()) {
                    v2.a t10 = hVar.t();
                    long j10 = t10.f47774w;
                    if (j10 == -9223372036854775807L) {
                        j10 = t10.f47798n;
                    }
                    if (j10 > d) {
                        long q6 = b1Var.q();
                        if (q6 > d) {
                            b1Var.l(Math.max(d, b1Var.r() + 1));
                            b1[] b1VarArr = hVar.f47814y;
                            int length2 = b1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                b1 b1Var2 = b1VarArr[i12];
                                b1Var2.l(Math.max(d, b1Var2.r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            hVar.h.y(hVar.f47804a, d, q6);
                            i11 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i11;
            i11 = i10 + 1;
        }
        this.J.r(j3);
    }
}
