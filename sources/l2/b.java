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
import sc.v;
import t7.t;
import u2.b1;
import u2.c0;
import u2.c1;
import u2.d0;
import u2.d1;
import u2.o1;
import v7.v7;
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
    public final int f15307a;
    public final a5.a f15308b;
    public final g2.c0 f15309c;
    public final n2.m d;
    public final rb.a f15310e;
    public final s f15311f;
    public final long h;
    public final y2.m f15312n;
    public final y2.d f15313r;
    public final o1 f15314s;
    public final a[] v;
    public final t f15315w;
    public final p f15316x;
    public boolean N = true;
    public v2.h[] H = new v2.h[0];
    public m[] I = new m[0];
    public final IdentityHashMap f15317y = new IdentityHashMap();

    public b(int i10, m2.c cVar, s sVar, int i11, a5.a aVar, g2.c0 c0Var, n2.m mVar, n2.j jVar, rb.a aVar2, a5.a aVar3, long j3, y2.m mVar2, y2.d dVar, t tVar, f fVar, j2.k kVar) {
        String h;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        b2.s[][] sVarArr;
        b2.s[] sVarArr2;
        m2.f b10;
        Integer num;
        n2.m mVar3 = mVar;
        this.f15307a = i10;
        this.K = cVar;
        this.f15311f = sVar;
        this.L = i11;
        this.f15308b = aVar;
        this.f15309c = c0Var;
        this.d = mVar3;
        this.F = jVar;
        this.f15310e = aVar2;
        this.E = aVar3;
        this.h = j3;
        this.f15312n = mVar2;
        this.f15313r = dVar;
        this.f15315w = tVar;
        boolean z10 = true;
        this.f15316x = new p(cVar, fVar, dVar);
        int i14 = 0;
        tVar.getClass();
        g0 g0Var = i0.f8752b;
        a1 a1Var = a1.f8715e;
        this.J = new u2.n(a1Var, a1Var);
        m2.h b11 = cVar.b(i11);
        List list = b11.d;
        this.M = list;
        List list2 = b11.f15941c;
        int size = list2.size();
        HashMap hashMap = new HashMap(q.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i15)).f15903a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            m2.a aVar4 = (m2.a) list2.get(i16);
            List list3 = aVar4.f15906e;
            List list4 = aVar4.f15907f;
            boolean z11 = z10;
            m2.f b12 = b("http://dashif.org/guidelines/trickmode", list3);
            b12 = b12 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b12;
            int intValue = (b12 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b12.f15934b)))) == null || !a(aVar4, (m2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (b10 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = b10.f15934b;
                String str2 = e2.d0.f8532a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i17])));
                    if (num2 != null && a(aVar4, (m2.a) list2.get(num2.intValue()))) {
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
            i16++;
            z10 = z11;
            i14 = 0;
        }
        boolean z12 = z10;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] f7 = v7.f((Collection) arrayList.get(i18));
            iArr2[i18] = f7;
            Arrays.sort(f7);
        }
        boolean[] zArr2 = new boolean[size2];
        b2.s[][] sVarArr3 = new b2.s[size2];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length2 = iArr3.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((m2.a) list2.get(iArr3[i21])).f15905c;
                iArr = iArr2;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((m2.m) list7.get(i22)).d.isEmpty()) {
                        zArr2[i19] = z12;
                        i20++;
                        break;
                    }
                }
                i21++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i19];
            int length3 = iArr4.length;
            int i23 = 0;
            while (true) {
                if (i23 < length3) {
                    int i24 = iArr4[i23];
                    m2.a aVar5 = (m2.a) list2.get(i24);
                    List list8 = ((m2.a) list2.get(i24)).d;
                    int[] iArr5 = iArr4;
                    int i25 = 0;
                    while (i25 < list8.size()) {
                        m2.f fVar2 = (m2.f) list8.get(i25);
                        zArr = zArr2;
                        sVarArr = sVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f15933a)) {
                            r rVar = new r();
                            rVar.f3585q = r0.n("application/cea-608");
                            rVar.f3571a = a1.g.s(new StringBuilder(), aVar5.f15903a, ":cea608");
                            sVarArr2 = j(fVar2, P, new b2.s(rVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f15933a)) {
                            r rVar2 = new r();
                            rVar2.f3585q = r0.n("application/cea-708");
                            rVar2.f3571a = a1.g.s(new StringBuilder(), aVar5.f15903a, ":cea708");
                            sVarArr2 = j(fVar2, Q, new b2.s(rVar2));
                            break;
                        } else {
                            i25++;
                            sVarArr3 = sVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i23++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    sVarArr = sVarArr3;
                    sVarArr2 = new b2.s[0];
                    break;
                }
            }
            sVarArr[i19] = sVarArr2;
            if (sVarArr2.length != 0) {
                i20++;
            }
            i19++;
            sVarArr3 = sVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        b2.s[][] sVarArr4 = sVarArr3;
        int size3 = list.size() + i20 + size2;
        l1[] l1VarArr = new l1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i28)).f15905c);
            }
            int size4 = arrayList3.size();
            b2.s[] sVarArr5 = new b2.s[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                b2.s sVar2 = ((m2.m) arrayList3.get(i29)).f15952a;
                int i31 = i26;
                r a2 = sVar2.a();
                a2.R = mVar3.Q0(sVar2);
                sVarArr5[i29] = new b2.s(a2);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            m2.a aVar6 = (m2.a) list2.get(iArr7[0]);
            long j10 = aVar6.f15903a;
            if (j10 != -1) {
                h = Long.toString(j10);
            } else {
                h = hg.c.h(i27, "unset:");
            }
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (sVarArr4[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            f(aVar, sVarArr5);
            List list9 = list2;
            l1VarArr[i33] = new l1(h, sVarArr5);
            int i35 = aVar6.f15904b;
            g0 g0Var2 = i0.f8752b;
            a1 a1Var2 = a1.f8715e;
            a aVar7 = new a(i35, 0, iArr7, i33, i34, i12, -1, a1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar7;
            int i37 = -1;
            if (i34 != -1) {
                String v = v.v(h, ":emsg");
                r rVar3 = new r();
                rVar3.f3571a = v;
                rVar3.f3585q = r0.n("application/x-emsg");
                b2.s[] sVarArr6 = new b2.s[z12];
                sVarArr6[0] = new b2.s(rVar3);
                l1VarArr[i34] = new l1(v, sVarArr6);
                a aVar8 = new a(5, 1, iArr8, i36, -1, -1, -1, a1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar8;
                i37 = -1;
            }
            if (i12 != i37) {
                String v9 = v.v(h, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, i0.w(sVarArr4[i27]));
                f(aVar, sVarArr4[i27]);
                l1VarArr[i12] = new l1(v9, sVarArr4[i27]);
            }
            i27++;
            size2 = i32;
            mVar3 = mVar;
            i26 = i13;
            list2 = list9;
            z12 = true;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            m2.g gVar = (m2.g) list.get(i38);
            r rVar4 = new r();
            rVar4.f3571a = gVar.a();
            rVar4.f3585q = r0.n("application/x-emsg");
            l1VarArr[i26] = new l1(gVar.a() + ":" + i38, new b2.s(rVar4));
            g0 g0Var3 = i0.f8752b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i38, a1.f8715e);
            i38++;
            i26++;
        }
        Pair create = Pair.create(new o1(l1VarArr), aVarArr);
        this.f15314s = (o1) create.first;
        this.v = (a[]) create.second;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f15904b;
        List list = aVar.f15905c;
        int i11 = aVar2.f15904b;
        List list2 = aVar2.f15905c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                b2.s sVar = ((m2.m) list.get(0)).f15952a;
                b2.s sVar2 = ((m2.m) list2.get(0)).f15952a;
                int i12 = sVar.f3632f & (-16385);
                int i13 = sVar2.f3632f & (-16385);
                if (Objects.equals(sVar.d, sVar2.d) && i12 == i13) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static m2.f b(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.f fVar = (m2.f) list.get(i10);
            if (str.equals(fVar.f15933a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void f(a5.a aVar, b2.s[] sVarArr) {
        String str;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            b2.s sVar = sVarArr[i10];
            b2.p pVar = (b2.p) aVar.d;
            if (pVar.f3505b && ((ob.a) pVar.f3506c).D1(sVar)) {
                r a2 = sVar.a();
                String str2 = sVar.f3636k;
                a2.f3585q = r0.n("application/x-media3-cues");
                a2.O = ((ob.a) pVar.f3506c).U0(sVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sVar.f3643r);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f3578j = sb2.toString();
                a2.v = Long.MAX_VALUE;
                sVar = new b2.s(a2);
            }
            sVarArr[i10] = sVar;
        }
    }

    public static b2.s[] j(m2.f fVar, Pattern pattern, b2.s sVar) {
        String str = fVar.f15934b;
        if (str == null) {
            return new b2.s[]{sVar};
        }
        String str2 = e2.d0.f8532a;
        String[] split = str.split(";", -1);
        b2.s[] sVarArr = new b2.s[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new b2.s[]{sVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r a2 = sVar.a();
            a2.f3571a = sVar.f3628a + ":" + parseInt;
            a2.N = parseInt;
            a2.d = matcher.group(2);
            sVarArr[i10] = new b2.s(a2);
        }
        return sVarArr;
    }

    @Override
    public final void D(d1 d1Var) {
        this.G.D(this);
    }

    @Override
    public final boolean c() {
        return this.J.c();
    }

    @Override
    public final long d() {
        return this.J.d();
    }

    public final int e(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].f15304e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f15303c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void g() {
        this.f15312n.a();
    }

    @Override
    public final long h(long j3) {
        long j10;
        int i10;
        v2.a aVar;
        boolean z10;
        boolean G;
        boolean z11;
        v2.h[] hVarArr = this.H;
        int length = hVarArr.length;
        boolean z12 = false;
        int i11 = 0;
        while (i11 < length) {
            v2.h hVar = hVarArr[i11];
            u2.a1[] a1VarArr = hVar.f49069y;
            u2.a1 a1Var = hVar.f49068x;
            y2.l lVar = hVar.f49065r;
            ?? r14 = hVar.v;
            hVar.J = j3;
            hVar.M = z12;
            if (hVar.v()) {
                hVar.I = j3;
                z11 = z12;
                i10 = i11;
            } else {
                ?? r15 = z12;
                while (true) {
                    if (r15 < r14.size()) {
                        aVar = (v2.a) r14.get(r15);
                        int i12 = (aVar.h > j3 ? 1 : (aVar.h == j3 ? 0 : -1));
                        i10 = i11;
                        if (i12 == 0 && aVar.v == -9223372036854775807L) {
                            break;
                        } else if (i12 > 0) {
                            break;
                        } else {
                            r15++;
                            i11 = i10;
                        }
                    } else {
                        i10 = i11;
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
                    hVar.K = hVar.x(a1Var.t(), 0);
                    for (u2.a1 a1Var2 : a1VarArr) {
                        a1Var2.G(j3, true);
                    }
                } else {
                    hVar.I = j3;
                    hVar.O = false;
                    r14.clear();
                    hVar.K = 0;
                    if (lVar.d()) {
                        a1Var.k();
                        for (u2.a1 a1Var3 : a1VarArr) {
                            a1Var3.k();
                        }
                        lVar.b();
                    } else {
                        lVar.f51696c = null;
                        z11 = false;
                        a1Var.D(false);
                        for (u2.a1 a1Var4 : hVar.f49069y) {
                            a1Var4.D(false);
                        }
                    }
                }
                z11 = false;
            }
            i11 = i10 + 1;
            z12 = z11;
        }
        m[] mVarArr = this.I;
        int length2 = mVarArr.length;
        for (int i13 = z12; i13 < length2; i13++) {
            m mVar = mVarArr[i13];
            int a2 = e2.d0.a(mVar.f15369c, j3, true);
            mVar.h = a2;
            if (mVar.d && a2 == mVar.f15369c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            mVar.f15372n = j10;
        }
        return j3;
    }

    @Override
    public final void i(long j3) {
        v2.h[] hVarArr;
        long j10;
        for (v2.h hVar : this.H) {
            if (!hVar.v()) {
                u2.a1 a1Var = hVar.f49068x;
                int i10 = a1Var.f48535q;
                a1Var.j(j3, true);
                u2.a1 a1Var2 = hVar.f49068x;
                int i11 = a1Var2.f48535q;
                if (i11 > i10) {
                    synchronized (a1Var2) {
                        if (a1Var2.f48534p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = a1Var2.f48532n[a1Var2.f48536r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        u2.a1[] a1VarArr = hVar.f49069y;
                        if (i12 >= a1VarArr.length) {
                            break;
                        }
                        a1VarArr[i12].j(j10, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.x(i11, 0), hVar.K);
                if (min > 0) {
                    e2.d0.U(0, min, hVar.v);
                    hVar.K -= min;
                }
            }
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.G = c0Var;
        c0Var.m(this);
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
    public final boolean n(s0 s0Var) {
        return this.J.n(s0Var);
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        int i10;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        boolean z11;
        int i13;
        l1 l1Var;
        a1 a1Var;
        int i14;
        o oVar;
        boolean z12;
        int[] iArr3 = new int[rVarArr.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = -1;
            if (i16 >= rVarArr.length) {
                break;
            }
            x2.r rVar = rVarArr[i16];
            if (rVar != null) {
                iArr3[i16] = this.f15314s.b(rVar.b());
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        for (int i17 = 0; i17 < rVarArr.length; i17++) {
            if (rVarArr[i17] == null || !zArr[i17]) {
                ?? r32 = b1VarArr[i17];
                if (r32 instanceof v2.h) {
                    ((v2.h) r32).z(this);
                } else if (r32 instanceof v2.f) {
                    v2.f fVar = (v2.f) r32;
                    v2.h hVar = fVar.f49058e;
                    boolean[] zArr3 = hVar.d;
                    int i18 = fVar.f49057c;
                    e2.d.g(zArr3[i18]);
                    hVar.d[i18] = false;
                }
                b1VarArr[i17] = 0;
            }
        }
        int i19 = 0;
        while (true) {
            z10 = true;
            boolean z13 = true;
            if (i19 >= rVarArr.length) {
                break;
            }
            ?? r33 = b1VarArr[i19];
            if ((r33 instanceof u2.q) || (r33 instanceof v2.f)) {
                int e7 = e(i19, iArr3);
                if (e7 == -1) {
                    z12 = b1VarArr[i19] instanceof u2.q;
                } else {
                    ?? r72 = b1VarArr[i19];
                    z12 = ((r72 instanceof v2.f) && ((v2.f) r72).f49055a == b1VarArr[e7]) ? false : false;
                }
                if (!z12) {
                    ?? r34 = b1VarArr[i19];
                    if (r34 instanceof v2.f) {
                        v2.f fVar2 = (v2.f) r34;
                        v2.h hVar2 = fVar2.f49058e;
                        boolean[] zArr4 = hVar2.d;
                        int i20 = fVar2.f49057c;
                        e2.d.g(zArr4[i20]);
                        hVar2.d[i20] = false;
                    }
                    b1VarArr[i19] = 0;
                }
            }
            i19++;
        }
        int i21 = 0;
        while (i21 < rVarArr.length) {
            x2.r rVar2 = rVarArr[i21];
            if (rVar2 == null) {
                iArr2 = iArr3;
                i11 = i15;
                i12 = i21;
            } else {
                ?? r35 = b1VarArr[i21];
                if (r35 == 0) {
                    zArr2[i21] = z10;
                    a aVar = this.v[iArr3[i21]];
                    int i22 = aVar.f15303c;
                    if (i22 == 0) {
                        int i23 = aVar.f15305f;
                        if (i23 != i10) {
                            z11 = z10 ? 1 : 0;
                        } else {
                            z11 = i15;
                        }
                        if (z11 != 0) {
                            l1Var = this.f15314s.a(i23);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i15;
                            l1Var = null;
                        }
                        int i24 = aVar.f15306g;
                        if (i24 != i10) {
                            a1Var = this.v[i24].h;
                        } else {
                            g0 g0Var = i0.f8752b;
                            a1Var = a1.f8715e;
                        }
                        int size = a1Var.size() + i13;
                        b2.s[] sVarArr = new b2.s[size];
                        int[] iArr4 = new int[size];
                        if (z11 != 0) {
                            sVarArr[i15] = l1Var.d[i15];
                            iArr4[i15] = 5;
                            i14 = z10 ? 1 : 0;
                        } else {
                            i14 = i15;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i25 = i15; i25 < a1Var.size(); i25++) {
                            b2.s sVar = (b2.s) a1Var.get(i25);
                            sVarArr[i14] = sVar;
                            iArr4[i14] = 3;
                            arrayList.add(sVar);
                            i14 += z10 ? 1 : 0;
                        }
                        if (this.K.d && z11 != 0) {
                            p pVar = this.f15316x;
                            oVar = new o(pVar, pVar.f15379a);
                        } else {
                            oVar = null;
                        }
                        a5.a aVar2 = this.f15308b;
                        y2.m mVar = this.f15312n;
                        m2.c cVar = this.K;
                        s sVar2 = this.f15311f;
                        int i26 = this.L;
                        int[] iArr5 = aVar.f15301a;
                        int i27 = aVar.f15302b;
                        iArr2 = iArr3;
                        long j10 = this.h;
                        g2.c0 c0Var = this.f15309c;
                        g2.h createDataSource = ((g2.g) aVar2.f300c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        i11 = 0;
                        i12 = i21;
                        v2.h hVar3 = new v2.h(aVar.f15302b, iArr4, sVarArr, new l((b2.p) aVar2.d, mVar, cVar, sVar2, i26, iArr5, rVar2, i27, createDataSource, j10, aVar2.f299b, z11, arrayList, oVar), this, this.f15313r, j3, this.d, this.F, this.f15310e, this.E, this.N);
                        synchronized (this) {
                            this.f15317y.put(hVar3, oVar2);
                        }
                        b1VarArr[i12] = hVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i15;
                        i12 = i21;
                        if (i22 == 2) {
                            b1VarArr[i12] = new m((m2.g) this.M.get(aVar.d), rVar2.b().d[i11], this.K.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i15;
                    i12 = i21;
                    if (r35 instanceof v2.h) {
                        ((v2.h) r35).f49062e.f15362j = rVar2;
                    }
                }
            }
            i21 = i12 + 1;
            i15 = i11;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr6 = iArr3;
        ?? r332 = i15;
        int i28 = r332 == true ? 1 : 0;
        while (i28 < rVarArr.length) {
            if (b1VarArr[i28] == 0 && rVarArr[i28] != null) {
                a aVar3 = this.v[iArr6[i28]];
                if (aVar3.f15303c == 1) {
                    iArr = iArr6;
                    int e10 = e(i28, iArr);
                    if (e10 == -1) {
                        b1VarArr[i28] = new Object();
                    } else {
                        v2.h hVar4 = (v2.h) b1VarArr[e10];
                        int i29 = aVar3.f15302b;
                        boolean[] zArr5 = hVar4.d;
                        u2.a1[] a1VarArr = hVar4.f49069y;
                        for (int i30 = r332 == true ? 1 : 0; i30 < a1VarArr.length; i30++) {
                            if (hVar4.f49060b[i30] == i29) {
                                e2.d.g(!zArr5[i30]);
                                zArr5[i30] = true;
                                a1VarArr[i30].G(j3, true);
                                b1VarArr[i28] = new v2.f(hVar4, hVar4, a1VarArr[i30], i30);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i28++;
                    iArr6 = iArr;
                } else {
                    iArr = iArr6;
                }
            } else {
                iArr = iArr6;
            }
            i28++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = b1VarArr.length;
        for (int i31 = r332 == true ? 1 : 0; i31 < length; i31++) {
            ?? r73 = b1VarArr[i31];
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
        t tVar = this.f15315w;
        AbstractList w10 = q.w(arrayList2, new j2.e(15));
        tVar.getClass();
        this.J = new u2.n(arrayList2, w10);
        if (this.N) {
            this.N = r332;
            this.O = j3;
        }
        return j3;
    }

    @Override
    public final o1 p() {
        return this.f15314s;
    }

    @Override
    public final long q() {
        return this.J.q();
    }

    @Override
    public final long r(long r20, i2.q1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.r(long, i2.q1):long");
    }

    @Override
    public final void s(long j3) {
        int i10;
        v2.h[] hVarArr = this.H;
        int length = hVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.h hVar = hVarArr[i11];
            if (!hVar.f49065r.d()) {
                long d = this.K.d(this.L);
                u2.a1 a1Var = hVar.f49068x;
                e2.d.g(!hVar.f49065r.d());
                if (!hVar.v() && d != -9223372036854775807L && !hVar.v.isEmpty()) {
                    v2.a t10 = hVar.t();
                    long j10 = t10.f49029w;
                    if (j10 == -9223372036854775807L) {
                        j10 = t10.f49053n;
                    }
                    if (j10 > d) {
                        long q6 = a1Var.q();
                        if (q6 > d) {
                            a1Var.l(Math.max(d, a1Var.r() + 1));
                            u2.a1[] a1VarArr = hVar.f49069y;
                            int length2 = a1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                u2.a1 a1Var2 = a1VarArr[i12];
                                a1Var2.l(Math.max(d, a1Var2.r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            hVar.h.A(hVar.f49059a, d, q6);
                            i11 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i11;
            i11 = i10 + 1;
        }
        this.J.s(j3);
    }
}
