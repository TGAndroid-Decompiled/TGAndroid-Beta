package l2;

import android.util.Pair;
import android.util.SparseArray;
import b2.p1;
import b2.v;
import b2.v0;
import b2.w;
import e2.m0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import i2.u0;
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
import k2.f0;
import t7.u;
import u2.b1;
import u2.c0;
import u2.c1;
import u2.d0;
import u2.d1;
import u2.e1;
import u2.q;
import u2.q1;
import v7.b8;
import v7.u6;
public final class b implements d0, d1, v2.h {
    public static final Pattern R = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern S = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.k F;
    public c0 G;
    public u2.n J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final long P;
    public boolean Q;
    public final int f15822a;
    public final a5.a f15823b;
    public final g2.c0 f15824c;
    public final n2.n d;
    public final oa.d e;
    public final qi.e f15825f;
    public final long h;
    public final y2.m f15826n;
    public final androidx.biometric.e f15827r;
    public final q1 f15828s;
    public final a[] v;
    public final oa.d f15829w;
    public final p f15830x;
    public boolean N = true;
    public v2.i[] H = new v2.i[0];
    public m[] I = new m[0];
    public final IdentityHashMap f15831y = new IdentityHashMap();

    public b(int i10, m2.c cVar, qi.e eVar, int i11, a5.a aVar, g2.c0 c0Var, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar2, long j10, y2.m mVar, androidx.biometric.e eVar2, oa.d dVar2, f fVar, j2.k kVar2) {
        String j11;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        w[][] wVarArr;
        w[] wVarArr2;
        m2.f b10;
        Integer num;
        n2.n nVar2 = nVar;
        this.f15822a = i10;
        this.K = cVar;
        this.f15825f = eVar;
        this.L = i11;
        this.f15823b = aVar;
        this.f15824c = c0Var;
        this.d = nVar2;
        this.F = kVar;
        this.e = dVar;
        this.E = aVar2;
        this.h = j10;
        this.f15826n = mVar;
        this.f15827r = eVar2;
        this.f15829w = dVar2;
        boolean z10 = true;
        this.f15830x = new p(cVar, fVar, eVar2);
        int i14 = 0;
        dVar2.getClass();
        l0 l0Var = n0.f8477b;
        x1 x1Var = x1.e;
        this.J = new u2.n(x1Var, x1Var);
        m2.h b11 = cVar.b(i11);
        List list = b11.d;
        this.M = list;
        List list2 = b11.f16443c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i15)).f16409a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            m2.a aVar3 = (m2.a) list2.get(i16);
            List list3 = aVar3.e;
            List list4 = aVar3.f16412f;
            boolean z11 = z10;
            m2.f b12 = b("http://dashif.org/guidelines/trickmode", list3);
            b12 = b12 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b12;
            int intValue = (b12 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b12.f16436b)))) == null || !a(aVar3, (m2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (b10 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = b10.f16436b;
                String str2 = m0.f8255a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i17])));
                    if (num2 != null && a(aVar3, (m2.a) list2.get(num2.intValue()))) {
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
            int[] f7 = b8.f((Collection) arrayList.get(i18));
            iArr2[i18] = f7;
            Arrays.sort(f7);
        }
        boolean[] zArr2 = new boolean[size2];
        w[][] wVarArr3 = new w[size2];
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
                List list7 = ((m2.a) list2.get(iArr3[i21])).f16411c;
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
                    m2.a aVar4 = (m2.a) list2.get(i24);
                    List list8 = ((m2.a) list2.get(i24)).d;
                    int[] iArr5 = iArr4;
                    int i25 = 0;
                    while (i25 < list8.size()) {
                        m2.f fVar2 = (m2.f) list8.get(i25);
                        zArr = zArr2;
                        wVarArr = wVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f16435a)) {
                            v vVar = new v();
                            vVar.f4079r = v0.n("application/cea-608");
                            vVar.f4065a = a1.g.r(new StringBuilder(), aVar4.f16409a, ":cea608");
                            wVarArr2 = j(fVar2, R, new w(vVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f16435a)) {
                            v vVar2 = new v();
                            vVar2.f4079r = v0.n("application/cea-708");
                            vVar2.f4065a = a1.g.r(new StringBuilder(), aVar4.f16409a, ":cea708");
                            wVarArr2 = j(fVar2, S, new w(vVar2));
                            break;
                        } else {
                            i25++;
                            wVarArr3 = wVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i23++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    wVarArr = wVarArr3;
                    wVarArr2 = new w[0];
                    break;
                }
            }
            wVarArr[i19] = wVarArr2;
            if (wVarArr2.length != 0) {
                i20++;
            }
            i19++;
            wVarArr3 = wVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        w[][] wVarArr4 = wVarArr3;
        int size3 = list.size() + i20 + size2;
        p1[] p1VarArr = new p1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i28)).f16411c);
            }
            int size4 = arrayList3.size();
            w[] wVarArr5 = new w[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                w wVar = ((m2.m) arrayList3.get(i29)).f16453a;
                int i31 = i26;
                v a2 = wVar.a();
                a2.S = nVar2.I0(wVar);
                wVarArr5[i29] = new w(a2);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            m2.a aVar5 = (m2.a) list2.get(iArr7[0]);
            long j12 = aVar5.f16409a;
            if (j12 != -1) {
                j11 = Long.toString(j12);
            } else {
                j11 = i2.d.j(i27, "unset:");
            }
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (wVarArr4[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            f(aVar, wVarArr5);
            List list9 = list2;
            p1VarArr[i33] = new p1(j11, wVarArr5);
            int i35 = aVar5.f16410b;
            l0 l0Var2 = n0.f8477b;
            x1 x1Var2 = x1.e;
            a aVar6 = new a(i35, 0, iArr7, i33, i34, i12, -1, x1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar6;
            int i37 = -1;
            if (i34 != -1) {
                String u10 = r4.c.u(j11, ":emsg");
                v vVar3 = new v();
                vVar3.f4065a = u10;
                vVar3.f4079r = v0.n("application/x-emsg");
                vVar3.f4073l = j11;
                w[] wVarArr6 = new w[z12];
                wVarArr6[0] = new w(vVar3);
                p1VarArr[i34] = new p1(u10, wVarArr6);
                a aVar7 = new a(5, 1, iArr8, i36, -1, -1, -1, x1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar7;
                i37 = -1;
            }
            if (i12 != i37) {
                String u11 = r4.c.u(j11, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, n0.v(wVarArr4[i27]));
                f(aVar, wVarArr4[i27]);
                int i38 = 0;
                while (true) {
                    w[] wVarArr7 = wVarArr4[i27];
                    if (i38 >= wVarArr7.length) {
                        break;
                    }
                    v a10 = wVarArr7[i38].a();
                    a10.f4073l = j11;
                    wVarArr7[i38] = new w(a10);
                    i38++;
                }
                p1VarArr[i12] = new p1(u11, wVarArr4[i27]);
            }
            i27++;
            size2 = i32;
            nVar2 = nVar;
            i26 = i13;
            list2 = list9;
            z12 = true;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            m2.g gVar = (m2.g) list.get(i39);
            v vVar4 = new v();
            vVar4.f4065a = gVar.a();
            vVar4.f4079r = v0.n("application/x-emsg");
            p1VarArr[i26] = new p1(gVar.a() + ":" + i39, new w(vVar4));
            l0 l0Var3 = n0.f8477b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, x1.e);
            i39++;
            i26++;
        }
        Pair create = Pair.create(new q1(p1VarArr), aVarArr);
        this.f15828s = (q1) create.first;
        this.v = (a[]) create.second;
        this.P = Long.MIN_VALUE;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f16410b;
        List list = aVar.f16411c;
        int i11 = aVar2.f16410b;
        List list2 = aVar2.f16411c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                w wVar = ((m2.m) list.get(0)).f16453a;
                w wVar2 = ((m2.m) list2.get(0)).f16453a;
                int i12 = wVar.f4120f & (-16385);
                int i13 = wVar2.f4120f & (-16385);
                if (Objects.equals(wVar.d, wVar2.d) && i12 == i13) {
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
            if (str.equals(fVar.f16435a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void f(a5.a aVar, w[] wVarArr) {
        String str;
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            w wVar = wVarArr[i10];
            c5.f fVar = (c5.f) aVar.d;
            if (fVar.f4732b && ((u) fVar.f4733c).a0(wVar)) {
                v a2 = wVar.a();
                String str2 = wVar.f4124k;
                a2.f4079r = v0.n("application/x-media3-cues");
                a2.P = ((u) fVar.f4733c).L(wVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(wVar.f4132s);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f4071j = sb2.toString();
                a2.f4083w = Long.MAX_VALUE;
                wVar = new w(a2);
            }
            wVarArr[i10] = wVar;
        }
    }

    public static w[] j(m2.f fVar, Pattern pattern, w wVar) {
        String str = fVar.f16436b;
        if (str == null) {
            return new w[]{wVar};
        }
        String str2 = m0.f8255a;
        String[] split = str.split(";", -1);
        w[] wVarArr = new w[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new w[]{wVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            v a2 = wVar.a();
            a2.f4065a = wVar.f4117a + ":" + parseInt;
            a2.O = parseInt;
            a2.d = matcher.group(2);
            wVarArr[i10] = new w(a2);
        }
        return wVarArr;
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
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f15819c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void g() {
        this.f15826n.a();
    }

    @Override
    public final long i(long j10) {
        long j11;
        int i10;
        v2.a aVar;
        boolean z10;
        boolean J;
        int i11;
        boolean z11;
        v2.a aVar2;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        boolean z12 = false;
        int i12 = 0;
        while (i12 < length) {
            v2.i iVar = iVarArr[i12];
            b1[] b1VarArr = iVar.f47949y;
            b1 b1Var = iVar.f47948x;
            y2.l lVar = iVar.f47945r;
            ?? r14 = iVar.v;
            iVar.J = j10;
            iVar.M = z12;
            iVar.N = z12;
            if (iVar.y()) {
                iVar.I = j10;
                z11 = z12;
                i10 = i12;
            } else {
                ?? r15 = z12;
                while (true) {
                    if (r15 < r14.size()) {
                        aVar = (v2.a) r14.get(r15);
                        int i13 = (aVar.h > j10 ? 1 : (aVar.h == j10 ? 0 : -1));
                        i10 = i12;
                        if (i13 == 0 && aVar.v == -9223372036854775807L) {
                            break;
                        } else if (i13 > 0) {
                            break;
                        } else {
                            r15++;
                            i12 = i10;
                        }
                    } else {
                        i10 = i12;
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    J = b1Var.I(aVar.d(0));
                } else {
                    long d = iVar.d();
                    if (d != Long.MIN_VALUE && j10 >= d) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    J = b1Var.J(j10, z10);
                }
                if (J && (aVar2 = iVar.L) != null) {
                    i11 = 0;
                    if (aVar2.d(0) <= b1Var.v()) {
                        J = false;
                    }
                } else {
                    i11 = 0;
                }
                if (J) {
                    iVar.K = iVar.B(b1Var.v(), i11);
                    for (b1 b1Var2 : b1VarArr) {
                        b1Var2.J(j10, true);
                    }
                } else {
                    iVar.I = j10;
                    iVar.P = false;
                    r14.clear();
                    iVar.K = 0;
                    if (lVar.d()) {
                        b1Var.l();
                        for (b1 b1Var3 : b1VarArr) {
                            b1Var3.l();
                        }
                        lVar.b();
                    } else {
                        lVar.f49974c = null;
                        z11 = false;
                        b1Var.G(false);
                        for (b1 b1Var4 : iVar.f47949y) {
                            b1Var4.G(false);
                        }
                    }
                }
                z11 = false;
            }
            i12 = i10 + 1;
            z12 = z11;
        }
        m[] mVarArr = this.I;
        int length2 = mVarArr.length;
        for (int i14 = z12; i14 < length2; i14++) {
            m mVar = mVarArr[i14];
            int b10 = m0.b(mVar.f15880c, j10, true);
            mVar.h = b10;
            if (mVar.d && b10 == mVar.f15880c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            mVar.f15882n = j11;
        }
        return j10;
    }

    @Override
    public final void k(long j10) {
        v2.i[] iVarArr;
        long j11;
        for (v2.i iVar : this.H) {
            if (!iVar.y()) {
                b1 b1Var = iVar.f47948x;
                int i10 = b1Var.f47322q;
                b1Var.k(j10, true);
                b1 b1Var2 = iVar.f47948x;
                int i11 = b1Var2.f47322q;
                if (i11 > i10) {
                    synchronized (b1Var2) {
                        if (b1Var2.f47321p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = b1Var2.f47319n[b1Var2.f47323r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        b1[] b1VarArr = iVar.f47949y;
                        if (i12 >= b1VarArr.length) {
                            break;
                        }
                        b1VarArr[i12].k(j11, iVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(iVar.B(i11, 0), iVar.K);
                if (min > 0) {
                    m0.X(0, min, iVar.v);
                    iVar.K -= min;
                }
            }
        }
    }

    @Override
    public final void m(c0 c0Var, long j10) {
        this.G = c0Var;
        c0Var.h(this);
    }

    @Override
    public final long o() {
        v2.i[] iVarArr;
        if (this.Q) {
            boolean z10 = false;
            for (v2.i iVar : this.H) {
                iVar.getClass();
                try {
                    boolean z11 = iVar.N;
                    iVar.N = false;
                    z10 |= z11;
                } catch (Throwable th2) {
                    iVar.N = false;
                    throw th2;
                }
            }
            v2.i[] iVarArr2 = this.H;
            int length = iVarArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (iVarArr2[i10].z()) {
                        break;
                    }
                    i10++;
                } else {
                    this.Q = false;
                    for (v2.i iVar2 : this.H) {
                        iVar2.O = false;
                    }
                }
            }
            if (z10) {
                return this.O;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(u0 u0Var) {
        return this.J.p(u0Var);
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        boolean z12;
        int i13;
        p1 p1Var;
        x1 x1Var;
        int i14;
        o oVar;
        long a2;
        int[] iArr3;
        int i15;
        boolean z13;
        boolean z14;
        x2.p[] pVarArr2 = pVarArr;
        int[] iArr4 = new int[pVarArr2.length];
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i10 = -1;
            if (i17 >= pVarArr2.length) {
                break;
            }
            x2.p pVar = pVarArr2[i17];
            if (pVar != null) {
                iArr4[i17] = this.f15828s.b(pVar.b());
            } else {
                iArr4[i17] = -1;
            }
            i17++;
        }
        for (int i18 = 0; i18 < pVarArr2.length; i18++) {
            if (pVarArr2[i18] == null || !zArr[i18]) {
                ?? r42 = c1VarArr[i18];
                if (r42 instanceof v2.i) {
                    ((v2.i) r42).C(this);
                } else if (r42 instanceof v2.g) {
                    v2.g gVar = (v2.g) r42;
                    v2.i iVar = gVar.e;
                    boolean[] zArr3 = iVar.d;
                    int i19 = gVar.f47939c;
                    u6.p(zArr3[i19]);
                    iVar.d[i19] = false;
                }
                c1VarArr[i18] = 0;
            }
        }
        int i20 = 0;
        while (true) {
            z10 = true;
            if (i20 >= pVarArr2.length) {
                break;
            }
            ?? r43 = c1VarArr[i20];
            if ((r43 instanceof q) || (r43 instanceof v2.g)) {
                int e = e(i20, iArr4);
                if (e == -1) {
                    z14 = c1VarArr[i20] instanceof q;
                } else {
                    ?? r10 = c1VarArr[i20];
                    z14 = ((r10 instanceof v2.g) && ((v2.g) r10).f47937a == c1VarArr[e]) ? false : false;
                }
                if (!z14) {
                    ?? r44 = c1VarArr[i20];
                    if (r44 instanceof v2.g) {
                        v2.g gVar2 = (v2.g) r44;
                        v2.i iVar2 = gVar2.e;
                        boolean[] zArr4 = iVar2.d;
                        int i21 = gVar2.f47939c;
                        u6.p(zArr4[i21]);
                        iVar2.d[i21] = false;
                    }
                    c1VarArr[i20] = 0;
                }
            }
            i20++;
        }
        int i22 = 0;
        while (i22 < pVarArr2.length) {
            x2.p pVar2 = pVarArr2[i22];
            if (pVar2 == null) {
                iArr2 = iArr4;
                i11 = i22;
                i12 = i16;
            } else {
                ?? r11 = c1VarArr[i22];
                if (r11 == 0) {
                    zArr2[i22] = z10;
                    a aVar = this.v[iArr4[i22]];
                    int i23 = aVar.f15819c;
                    if (i23 == 0) {
                        int i24 = aVar.f15820f;
                        if (i24 != i10) {
                            z12 = z10;
                        } else {
                            z12 = i16;
                        }
                        if (z12 != 0) {
                            p1Var = this.f15828s.a(i24);
                            i13 = z10;
                        } else {
                            i13 = i16;
                            p1Var = null;
                        }
                        int i25 = aVar.f15821g;
                        if (i25 != i10) {
                            x1Var = this.v[i25].h;
                        } else {
                            l0 l0Var = n0.f8477b;
                            x1Var = x1.e;
                        }
                        int size = x1Var.size() + i13;
                        int i26 = i22;
                        w[] wVarArr = new w[size];
                        int[] iArr5 = new int[size];
                        if (z12 != 0) {
                            wVarArr[i16] = p1Var.d[i16];
                            iArr5[i16] = 5;
                            i14 = z10;
                        } else {
                            i14 = i16;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z15 = z10;
                        int i27 = i16;
                        int i28 = i14;
                        while (i27 < x1Var.size()) {
                            w wVar = (w) x1Var.get(i27);
                            wVarArr[i28] = wVar;
                            iArr5[i28] = 3;
                            arrayList.add(wVar);
                            i27++;
                            i28++;
                        }
                        if (this.K.d && z12 != 0) {
                            p pVar3 = this.f15830x;
                            oVar = new o(pVar3, pVar3.f15888a);
                        } else {
                            oVar = null;
                        }
                        m2.c cVar = this.K;
                        int i29 = this.L;
                        i c10 = ((m2.m) ((m2.a) cVar.b(i29).f16443c.get(aVar.f15817a[i16])).f16411c.get(i16)).c();
                        if (c10 == null) {
                            a2 = -9223372036854775807L;
                        } else {
                            a2 = c10.a(c10.o(j10, cVar.d(i29)));
                        }
                        if (this.N) {
                            m2.c cVar2 = this.K;
                            int i30 = this.L;
                            int[] iArr6 = aVar.f15817a;
                            List list = cVar2.b(i30).f16443c;
                            k0 t10 = n0.t();
                            iArr3 = iArr4;
                            int i31 = 0;
                            for (int length = iArr6.length; i31 < length; length = length) {
                                t10.d(((m2.a) list.get(iArr6[i31])).f16411c);
                                i31++;
                            }
                            x1 f7 = t10.f();
                            for (int i32 = 0; i32 < pVar2.length(); i32++) {
                                w wVar2 = ((m2.m) f7.get(pVar2.h(i32))).f16453a;
                                if (!v0.a(wVar2.f4132s, wVar2.f4124k)) {
                                    i15 = i26;
                                    z13 = z15;
                                    break;
                                }
                            }
                        } else {
                            iArr3 = iArr4;
                        }
                        i15 = i26;
                        z13 = false;
                        a5.a aVar2 = this.f15823b;
                        y2.m mVar = this.f15826n;
                        m2.c cVar3 = this.K;
                        qi.e eVar = this.f15825f;
                        int i33 = this.L;
                        int[] iArr7 = aVar.f15817a;
                        int i34 = aVar.f15818b;
                        i11 = i15;
                        long j11 = this.h;
                        g2.c0 c0Var = this.f15824c;
                        g2.h createDataSource = ((g2.g) aVar2.f281c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr3;
                        v2.i iVar3 = new v2.i(aVar.f15818b, iArr5, wVarArr, new l((c5.f) aVar2.d, mVar, cVar3, eVar, i33, iArr7, pVar2, i34, createDataSource, j11, aVar2.f280b, z12, arrayList, oVar), this, this.f15827r, j10, this.d, this.F, this.e, this.E, z13, a2, null);
                        long j12 = this.P;
                        iVar3.f47948x.K(j12);
                        for (b1 b1Var : iVar3.f47949y) {
                            b1Var.K(j12);
                        }
                        synchronized (this) {
                            this.f15831y.put(iVar3, oVar2);
                        }
                        c1VarArr[i11] = iVar3;
                    } else {
                        iArr2 = iArr4;
                        i11 = i22;
                        if (i23 == 2) {
                            i12 = 0;
                            c1VarArr[i11] = new m((m2.g) this.M.get(aVar.d), pVar2.b().d[0], this.K.d);
                        }
                    }
                    i12 = 0;
                } else {
                    iArr2 = iArr4;
                    i11 = i22;
                    i12 = i16;
                    if (r11 instanceof v2.i) {
                        ((v2.i) r11).e.f15873j = pVar2;
                    }
                }
            }
            i16 = i12;
            iArr4 = iArr2;
            i10 = -1;
            z10 = true;
            i22 = i11 + 1;
            pVarArr2 = pVarArr;
        }
        int[] iArr8 = iArr4;
        ?? r32 = i16;
        while (i16 < pVarArr.length) {
            if (c1VarArr[i16] == 0 && pVarArr[i16] != null) {
                iArr = iArr8;
                a aVar3 = this.v[iArr[i16]];
                if (aVar3.f15819c == 1) {
                    int e7 = e(i16, iArr);
                    if (e7 == -1) {
                        c1VarArr[i16] = new Object();
                    } else {
                        v2.i iVar4 = (v2.i) c1VarArr[e7];
                        int i35 = aVar3.f15818b;
                        boolean[] zArr5 = iVar4.d;
                        b1[] b1VarArr = iVar4.f47949y;
                        for (int i36 = r32 == true ? 1 : 0; i36 < b1VarArr.length; i36++) {
                            if (iVar4.f47941b[i36] == i35) {
                                u6.p(!zArr5[i36]);
                                zArr5[i36] = true;
                                b1VarArr[i36].J(j10, true);
                                c1VarArr[i16] = new v2.g(iVar4, iVar4, b1VarArr[i36], i36);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i16++;
                    iArr8 = iArr;
                }
            } else {
                iArr = iArr8;
            }
            i16++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = c1VarArr.length;
        for (int i37 = r32 == true ? 1 : 0; i37 < length2; i37++) {
            ?? r92 = c1VarArr[i37];
            if (r92 instanceof v2.i) {
                arrayList2.add((v2.i) r92);
            } else if (r92 instanceof m) {
                arrayList3.add((m) r92);
            }
        }
        v2.i[] iVarArr = new v2.i[arrayList2.size()];
        this.H = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.I = mVarArr;
        arrayList3.toArray(mVarArr);
        oa.d dVar = this.f15829w;
        AbstractList x10 = s.x(arrayList2, new f0(3));
        dVar.getClass();
        this.J = new u2.n(arrayList2, x10);
        if (this.N) {
            this.N = r32;
            this.O = j10;
            v2.i[] iVarArr2 = this.H;
            int length3 = iVarArr2.length;
            int i38 = r32 == true ? 1 : 0;
            while (true) {
                if (i38 < length3) {
                    if (iVarArr2[i38].z()) {
                        z11 = true;
                        break;
                    }
                    i38++;
                } else {
                    z11 = r32 == true ? 1 : 0;
                    break;
                }
            }
            if (z11) {
                this.Q = true;
                v2.i[] iVarArr3 = this.H;
                int length4 = iVarArr3.length;
                for (int i39 = r32 == true ? 1 : 0; i39 < length4; i39++) {
                    iVarArr3[i39].O = true;
                }
            }
        }
        return j10;
    }

    @Override
    public final q1 r() {
        return this.f15828s;
    }

    @Override
    public final long s() {
        return this.J.s();
    }

    @Override
    public final long t(long r20, i2.r1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.t(long, i2.r1):long");
    }

    @Override
    public final void u(long j10) {
        int i10;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.i iVar = iVarArr[i11];
            if (!iVar.f47945r.d()) {
                long d = this.K.d(this.L);
                b1 b1Var = iVar.f47948x;
                u6.p(!iVar.f47945r.d());
                if (!iVar.y() && d != -9223372036854775807L && !iVar.v.isEmpty()) {
                    v2.a w9 = iVar.w();
                    long j11 = w9.f47912w;
                    if (j11 == -9223372036854775807L) {
                        j11 = w9.f47935n;
                    }
                    if (j11 > d) {
                        long s10 = b1Var.s();
                        if (s10 > d) {
                            b1Var.m(Math.max(d, b1Var.t() + 1));
                            b1[] b1VarArr = iVar.f47949y;
                            int length2 = b1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                b1 b1Var2 = b1VarArr[i12];
                                b1Var2.m(Math.max(d, b1Var2.t() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            iVar.h.C(iVar.f47940a, d, s10);
                            i11 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i11;
            i11 = i10 + 1;
        }
        this.J.u(j10);
    }

    @Override
    public final void v(e1 e1Var) {
        this.G.v(this);
    }
}
