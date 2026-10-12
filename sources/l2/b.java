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
import u2.n1;
import u2.z0;
import v7.v7;
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
    public final int f15056a;
    public final a5.a f15057b;
    public final g2.c0 f15058c;
    public final n2.m d;
    public final t f15059e;
    public final s f15060f;
    public final long h;
    public final y2.m f15061n;
    public final y2.d f15062r;
    public final n1 f15063s;
    public final a[] v;
    public final na.d f15064w;
    public final p f15065x;
    public boolean N = true;
    public v2.h[] H = new v2.h[0];
    public m[] I = new m[0];
    public final IdentityHashMap f15066y = new IdentityHashMap();

    public b(int i10, m2.c cVar, s sVar, int i11, a5.a aVar, g2.c0 c0Var, n2.m mVar, n2.j jVar, t tVar, a5.a aVar2, long j3, y2.m mVar2, y2.d dVar, na.d dVar2, a6.m mVar3, j2.k kVar) {
        String i12;
        int i13;
        int i14;
        int[][] iArr;
        boolean[] zArr;
        b2.s[][] sVarArr;
        b2.s[] sVarArr2;
        m2.f f7;
        Integer num;
        n2.m mVar4 = mVar;
        this.f15056a = i10;
        this.K = cVar;
        this.f15060f = sVar;
        this.L = i11;
        this.f15057b = aVar;
        this.f15058c = c0Var;
        this.d = mVar4;
        this.F = jVar;
        this.f15059e = tVar;
        this.E = aVar2;
        this.h = j3;
        this.f15061n = mVar2;
        this.f15062r = dVar;
        this.f15064w = dVar2;
        boolean z10 = true;
        this.f15065x = new p(cVar, mVar3, dVar);
        int i15 = 0;
        dVar2.getClass();
        g0 g0Var = i0.f8749b;
        a1 a1Var = a1.f8712e;
        this.J = new u2.n(a1Var, a1Var);
        m2.h b10 = cVar.b(i11);
        List list = b10.d;
        this.M = list;
        List list2 = b10.f15691c;
        int size = list2.size();
        HashMap hashMap = new HashMap(q.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i16)).f15653a), Integer.valueOf(i16));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        int i17 = 0;
        while (i17 < size) {
            m2.a aVar3 = (m2.a) list2.get(i17);
            List list3 = aVar3.f15656e;
            List list4 = aVar3.f15657f;
            boolean z11 = z10;
            m2.f f10 = f("http://dashif.org/guidelines/trickmode", list3);
            f10 = f10 == null ? f("http://dashif.org/guidelines/trickmode", list4) : f10;
            int intValue = (f10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(f10.f15684b)))) == null || !e(aVar3, (m2.a) list2.get(num.intValue()))) ? i17 : num.intValue();
            if (intValue == i17 && (f7 = f("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = f7.f15684b;
                String str2 = e2.d0.f8529a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i18 = i15; i18 < length; i18++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i18])));
                    if (num2 != null && e(aVar3, (m2.a) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i17) {
                List list5 = (List) sparseArray.get(i17);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i17, list6);
                arrayList.remove(list5);
            }
            i17++;
            z10 = z11;
            i15 = 0;
        }
        boolean z12 = z10;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] f11 = v7.f((Collection) arrayList.get(i19));
            iArr2[i19] = f11;
            Arrays.sort(f11);
        }
        boolean[] zArr2 = new boolean[size2];
        b2.s[][] sVarArr3 = new b2.s[size2];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr3 = iArr2[i20];
            int length2 = iArr3.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((m2.a) list2.get(iArr3[i22])).f15655c;
                iArr = iArr2;
                for (int i23 = 0; i23 < list7.size(); i23++) {
                    if (!((m2.m) list7.get(i23)).d.isEmpty()) {
                        zArr2[i20] = z12;
                        i21++;
                        break;
                    }
                }
                i22++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i20];
            int length3 = iArr4.length;
            int i24 = 0;
            while (true) {
                if (i24 < length3) {
                    int i25 = iArr4[i24];
                    m2.a aVar4 = (m2.a) list2.get(i25);
                    List list8 = ((m2.a) list2.get(i25)).d;
                    int[] iArr5 = iArr4;
                    int i26 = 0;
                    while (i26 < list8.size()) {
                        m2.f fVar = (m2.f) list8.get(i26);
                        zArr = zArr2;
                        sVarArr = sVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f15683a)) {
                            r rVar = new r();
                            rVar.f3583q = r0.n("application/cea-608");
                            rVar.f3569a = a1.g.s(new StringBuilder(), aVar4.f15653a, ":cea608");
                            sVarArr2 = t(fVar, P, new b2.s(rVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f15683a)) {
                            r rVar2 = new r();
                            rVar2.f3583q = r0.n("application/cea-708");
                            rVar2.f3569a = a1.g.s(new StringBuilder(), aVar4.f15653a, ":cea708");
                            sVarArr2 = t(fVar, Q, new b2.s(rVar2));
                            break;
                        } else {
                            i26++;
                            sVarArr3 = sVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i24++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    sVarArr = sVarArr3;
                    sVarArr2 = new b2.s[0];
                    break;
                }
            }
            sVarArr[i20] = sVarArr2;
            if (sVarArr2.length != 0) {
                i21++;
            }
            i20++;
            sVarArr3 = sVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        b2.s[][] sVarArr4 = sVarArr3;
        int size3 = list.size() + i21 + size2;
        l1[] l1VarArr = new l1[size3];
        a[] aVarArr = new a[size3];
        int i27 = 0;
        int i28 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i29 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i29)).f15655c);
            }
            int size4 = arrayList3.size();
            b2.s[] sVarArr5 = new b2.s[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size2;
                b2.s sVar2 = ((m2.m) arrayList3.get(i30)).f15702a;
                int i32 = i27;
                r a2 = sVar2.a();
                a2.R = mVar4.Q0(sVar2);
                sVarArr5[i30] = new b2.s(a2);
                i30++;
                size2 = i31;
                i27 = i32;
            }
            int i33 = size2;
            int i34 = i27;
            m2.a aVar5 = (m2.a) list2.get(iArr7[0]);
            long j10 = aVar5.f15653a;
            if (j10 != -1) {
                i12 = Long.toString(j10);
            } else {
                i12 = hg.c.i(i28, "unset:");
            }
            int i35 = i34 + 1;
            if (zArr3[i28]) {
                i13 = i34 + 2;
            } else {
                i13 = i35;
                i35 = -1;
            }
            if (sVarArr4[i28].length != 0) {
                i14 = i13 + 1;
            } else {
                i14 = i13;
                i13 = -1;
            }
            s(aVar, sVarArr5);
            List list9 = list2;
            l1VarArr[i34] = new l1(i12, sVarArr5);
            int i36 = aVar5.f15654b;
            g0 g0Var2 = i0.f8749b;
            a1 a1Var2 = a1.f8712e;
            a aVar6 = new a(i36, 0, iArr7, i34, i35, i13, -1, a1Var2);
            int[] iArr8 = iArr7;
            int i37 = i34;
            aVarArr[i37] = aVar6;
            int i38 = -1;
            if (i35 != -1) {
                String v = v.v(i12, ":emsg");
                r rVar3 = new r();
                rVar3.f3569a = v;
                rVar3.f3583q = r0.n("application/x-emsg");
                b2.s[] sVarArr6 = new b2.s[z12];
                sVarArr6[0] = new b2.s(rVar3);
                l1VarArr[i35] = new l1(v, sVarArr6);
                a aVar7 = new a(5, 1, iArr8, i37, -1, -1, -1, a1Var2);
                iArr8 = iArr8;
                i37 = i37;
                aVarArr[i35] = aVar7;
                i38 = -1;
            }
            if (i13 != i38) {
                String v9 = v.v(i12, ":cc");
                aVarArr[i13] = new a(3, 1, iArr8, i37, -1, -1, -1, i0.w(sVarArr4[i28]));
                s(aVar, sVarArr4[i28]);
                l1VarArr[i13] = new l1(v9, sVarArr4[i28]);
            }
            i28++;
            size2 = i33;
            mVar4 = mVar;
            i27 = i14;
            list2 = list9;
            z12 = true;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            m2.g gVar = (m2.g) list.get(i39);
            r rVar4 = new r();
            rVar4.f3569a = gVar.a();
            rVar4.f3583q = r0.n("application/x-emsg");
            l1VarArr[i27] = new l1(gVar.a() + ":" + i39, new b2.s(rVar4));
            g0 g0Var3 = i0.f8749b;
            aVarArr[i27] = new a(5, 2, new int[0], -1, -1, -1, i39, a1.f8712e);
            i39++;
            i27++;
        }
        Pair create = Pair.create(new n1(l1VarArr), aVarArr);
        this.f15063s = (n1) create.first;
        this.v = (a[]) create.second;
    }

    public static boolean e(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f15654b;
        List list = aVar.f15655c;
        int i11 = aVar2.f15654b;
        List list2 = aVar2.f15655c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                b2.s sVar = ((m2.m) list.get(0)).f15702a;
                b2.s sVar2 = ((m2.m) list2.get(0)).f15702a;
                int i12 = sVar.f3630f & (-16385);
                int i13 = sVar2.f3630f & (-16385);
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
            if (str.equals(fVar.f15683a)) {
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
            if (pVar.f3503b && ((qb.b) pVar.f3504c).H(sVar)) {
                r a2 = sVar.a();
                String str2 = sVar.f3634k;
                a2.f3583q = r0.n("application/x-media3-cues");
                a2.O = ((qb.b) pVar.f3504c).y(sVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sVar.f3641r);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f3576j = sb2.toString();
                a2.v = Long.MAX_VALUE;
                sVar = new b2.s(a2);
            }
            sVarArr[i10] = sVar;
        }
    }

    public static b2.s[] t(m2.f fVar, Pattern pattern, b2.s sVar) {
        String str = fVar.f15684b;
        if (str == null) {
            return new b2.s[]{sVar};
        }
        String str2 = e2.d0.f8529a;
        String[] split = str.split(";", -1);
        b2.s[] sVarArr = new b2.s[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new b2.s[]{sVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r a2 = sVar.a();
            a2.f3569a = sVar.f3626a + ":" + parseInt;
            a2.N = parseInt;
            a2.d = matcher.group(2);
            sVarArr[i10] = new b2.s(a2);
        }
        return sVarArr;
    }

    @Override
    public final void b(c1 c1Var) {
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

    @Override
    public final void g() {
        this.f15061n.a();
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
            z0[] z0VarArr = hVar.f49307y;
            z0 z0Var = hVar.f49306x;
            y2.l lVar = hVar.f49303r;
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
                    hVar.K = hVar.z(z0Var.t(), 0);
                    for (z0 z0Var2 : z0VarArr) {
                        z0Var2.G(j3, true);
                    }
                } else {
                    hVar.I = j3;
                    hVar.O = false;
                    r14.clear();
                    hVar.K = 0;
                    if (lVar.d()) {
                        z0Var.k();
                        for (z0 z0Var3 : z0VarArr) {
                            z0Var3.k();
                        }
                        lVar.b();
                    } else {
                        lVar.f51930c = null;
                        z11 = false;
                        z0Var.D(false);
                        for (z0 z0Var4 : hVar.f49307y) {
                            z0Var4.D(false);
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
            int a2 = e2.d0.a(mVar.f15118c, j3, true);
            mVar.h = a2;
            if (mVar.d && a2 == mVar.f15118c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            mVar.f15121n = j10;
        }
        return j3;
    }

    @Override
    public final void i(long j3) {
        v2.h[] hVarArr;
        long j10;
        for (v2.h hVar : this.H) {
            if (!hVar.v()) {
                z0 z0Var = hVar.f49306x;
                int i10 = z0Var.f48993q;
                z0Var.j(j3, true);
                z0 z0Var2 = hVar.f49306x;
                int i11 = z0Var2.f48993q;
                if (i11 > i10) {
                    synchronized (z0Var2) {
                        if (z0Var2.f48992p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = z0Var2.f48990n[z0Var2.f48994r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        z0[] z0VarArr = hVar.f49307y;
                        if (i12 >= z0VarArr.length) {
                            break;
                        }
                        z0VarArr[i12].j(j10, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.z(i11, 0), hVar.K);
                if (min > 0) {
                    e2.d0.U(0, min, hVar.v);
                    hVar.K -= min;
                }
            }
        }
    }

    public final int j(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].f15053e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f15052c == 0) {
                    return i13;
                }
            }
        }
        return -1;
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
    public final long n(x2.r[] rVarArr, boolean[] zArr, u2.a1[] a1VarArr, boolean[] zArr2, long j3) {
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
                iArr3[i16] = this.f15063s.b(rVar.b());
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        for (int i17 = 0; i17 < rVarArr.length; i17++) {
            if (rVarArr[i17] == null || !zArr[i17]) {
                ?? r32 = a1VarArr[i17];
                if (r32 instanceof v2.h) {
                    ((v2.h) r32).A(this);
                } else if (r32 instanceof v2.f) {
                    v2.f fVar = (v2.f) r32;
                    v2.h hVar = fVar.f49296e;
                    boolean[] zArr3 = hVar.d;
                    int i18 = fVar.f49295c;
                    e2.d.g(zArr3[i18]);
                    hVar.d[i18] = false;
                }
                a1VarArr[i17] = 0;
            }
        }
        int i19 = 0;
        while (true) {
            z10 = true;
            boolean z13 = true;
            if (i19 >= rVarArr.length) {
                break;
            }
            ?? r33 = a1VarArr[i19];
            if ((r33 instanceof u2.q) || (r33 instanceof v2.f)) {
                int j10 = j(i19, iArr3);
                if (j10 == -1) {
                    z12 = a1VarArr[i19] instanceof u2.q;
                } else {
                    ?? r72 = a1VarArr[i19];
                    z12 = ((r72 instanceof v2.f) && ((v2.f) r72).f49293a == a1VarArr[j10]) ? false : false;
                }
                if (!z12) {
                    ?? r34 = a1VarArr[i19];
                    if (r34 instanceof v2.f) {
                        v2.f fVar2 = (v2.f) r34;
                        v2.h hVar2 = fVar2.f49296e;
                        boolean[] zArr4 = hVar2.d;
                        int i20 = fVar2.f49295c;
                        e2.d.g(zArr4[i20]);
                        hVar2.d[i20] = false;
                    }
                    a1VarArr[i19] = 0;
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
                ?? r35 = a1VarArr[i21];
                if (r35 == 0) {
                    zArr2[i21] = z10;
                    a aVar = this.v[iArr3[i21]];
                    int i22 = aVar.f15052c;
                    if (i22 == 0) {
                        int i23 = aVar.f15054f;
                        if (i23 != i10) {
                            z11 = z10 ? 1 : 0;
                        } else {
                            z11 = i15;
                        }
                        if (z11 != 0) {
                            l1Var = this.f15063s.a(i23);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i15;
                            l1Var = null;
                        }
                        int i24 = aVar.f15055g;
                        if (i24 != i10) {
                            a1Var = this.v[i24].h;
                        } else {
                            g0 g0Var = i0.f8749b;
                            a1Var = a1.f8712e;
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
                            p pVar = this.f15065x;
                            oVar = new o(pVar, pVar.f15128a);
                        } else {
                            oVar = null;
                        }
                        a5.a aVar2 = this.f15057b;
                        y2.m mVar = this.f15061n;
                        m2.c cVar = this.K;
                        s sVar2 = this.f15060f;
                        int i26 = this.L;
                        int[] iArr5 = aVar.f15050a;
                        int i27 = aVar.f15051b;
                        iArr2 = iArr3;
                        long j11 = this.h;
                        g2.c0 c0Var = this.f15058c;
                        g2.h createDataSource = ((g2.g) aVar2.f300c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        i11 = 0;
                        i12 = i21;
                        v2.h hVar3 = new v2.h(aVar.f15051b, iArr4, sVarArr, new l((b2.p) aVar2.d, mVar, cVar, sVar2, i26, iArr5, rVar2, i27, createDataSource, j11, aVar2.f299b, z11, arrayList, oVar), this, this.f15062r, j3, this.d, this.F, this.f15059e, this.E, this.N);
                        synchronized (this) {
                            this.f15066y.put(hVar3, oVar2);
                        }
                        a1VarArr[i12] = hVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i15;
                        i12 = i21;
                        if (i22 == 2) {
                            a1VarArr[i12] = new m((m2.g) this.M.get(aVar.d), rVar2.b().d[i11], this.K.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i11 = i15;
                    i12 = i21;
                    if (r35 instanceof v2.h) {
                        ((v2.h) r35).f49300e.f15111j = rVar2;
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
            if (a1VarArr[i28] == 0 && rVarArr[i28] != null) {
                a aVar3 = this.v[iArr6[i28]];
                if (aVar3.f15052c == 1) {
                    iArr = iArr6;
                    int j12 = j(i28, iArr);
                    if (j12 == -1) {
                        a1VarArr[i28] = new Object();
                    } else {
                        v2.h hVar4 = (v2.h) a1VarArr[j12];
                        int i29 = aVar3.f15051b;
                        boolean[] zArr5 = hVar4.d;
                        z0[] z0VarArr = hVar4.f49307y;
                        for (int i30 = r332 == true ? 1 : 0; i30 < z0VarArr.length; i30++) {
                            if (hVar4.f49298b[i30] == i29) {
                                e2.d.g(!zArr5[i30]);
                                zArr5[i30] = true;
                                z0VarArr[i30].G(j3, true);
                                a1VarArr[i28] = new v2.f(hVar4, hVar4, z0VarArr[i30], i30);
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
        int length = a1VarArr.length;
        for (int i31 = r332 == true ? 1 : 0; i31 < length; i31++) {
            ?? r73 = a1VarArr[i31];
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
        na.d dVar = this.f15064w;
        AbstractList w10 = q.w(arrayList2, new j2.e(15));
        dVar.getClass();
        this.J = new u2.n(arrayList2, w10);
        if (this.N) {
            this.N = r332;
            this.O = j3;
        }
        return j3;
    }

    @Override
    public final n1 o() {
        return this.f15063s;
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
            if (!hVar.f49303r.d()) {
                long d = this.K.d(this.L);
                z0 z0Var = hVar.f49306x;
                e2.d.g(!hVar.f49303r.d());
                if (!hVar.v() && d != -9223372036854775807L && !hVar.v.isEmpty()) {
                    v2.a t10 = hVar.t();
                    long j10 = t10.f49267w;
                    if (j10 == -9223372036854775807L) {
                        j10 = t10.f49291n;
                    }
                    if (j10 > d) {
                        long q6 = z0Var.q();
                        if (q6 > d) {
                            z0Var.l(Math.max(d, z0Var.r() + 1));
                            z0[] z0VarArr = hVar.f49307y;
                            int length2 = z0VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                z0 z0Var2 = z0VarArr[i12];
                                z0Var2.l(Math.max(d, z0Var2.r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            hVar.h.A(hVar.f49297a, d, q6);
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
