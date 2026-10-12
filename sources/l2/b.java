package l2;

import android.util.Pair;
import android.util.SparseArray;
import b2.q1;
import b2.w;
import b2.w0;
import b2.x;
import e2.m0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import g2.c0;
import i2.v0;
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
import k2.y0;
import t7.u;
import u2.c1;
import u2.d0;
import u2.d1;
import u2.e0;
import u2.e1;
import u2.f1;
import u2.r;
import u2.r1;
import v7.b8;
import v7.u6;
public final class b implements e0, e1, v2.h {
    public static final Pattern R = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern S = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.k F;
    public d0 G;
    public u2.o J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final long P;
    public boolean Q;
    public final int f14481a;
    public final a5.a f14482b;
    public final c0 f14483c;
    public final n2.n d;
    public final oa.d e;
    public final qi.e f14484f;
    public final long h;
    public final y2.m f14485n;
    public final androidx.biometric.e f14486r;
    public final r1 f14487s;
    public final a[] v;
    public final oa.d f14488w;
    public final p f14489x;
    public boolean N = true;
    public v2.i[] H = new v2.i[0];
    public m[] I = new m[0];
    public final IdentityHashMap f14490y = new IdentityHashMap();

    public b(int i10, m2.c cVar, qi.e eVar, int i11, a5.a aVar, c0 c0Var, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar2, long j10, y2.m mVar, androidx.biometric.e eVar2, oa.d dVar2, f fVar, j2.k kVar2) {
        String i12;
        int i13;
        int i14;
        int[][] iArr;
        boolean[] zArr;
        x[][] xVarArr;
        x[] xVarArr2;
        m2.f d;
        Integer num;
        n2.n nVar2 = nVar;
        this.f14481a = i10;
        this.K = cVar;
        this.f14484f = eVar;
        this.L = i11;
        this.f14482b = aVar;
        this.f14483c = c0Var;
        this.d = nVar2;
        this.F = kVar;
        this.e = dVar;
        this.E = aVar2;
        this.h = j10;
        this.f14485n = mVar;
        this.f14486r = eVar2;
        this.f14488w = dVar2;
        boolean z10 = true;
        this.f14489x = new p(cVar, fVar, eVar2);
        int i15 = 0;
        dVar2.getClass();
        l0 l0Var = n0.f8592b;
        x1 x1Var = x1.e;
        this.J = new u2.o(x1Var, x1Var);
        m2.h b10 = cVar.b(i11);
        List list = b10.d;
        this.M = list;
        List list2 = b10.f15348c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i16)).f15314a), Integer.valueOf(i16));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        int i17 = 0;
        while (i17 < size) {
            m2.a aVar3 = (m2.a) list2.get(i17);
            List list3 = aVar3.e;
            List list4 = aVar3.f15317f;
            boolean z11 = z10;
            m2.f d10 = d("http://dashif.org/guidelines/trickmode", list3);
            d10 = d10 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d10;
            int intValue = (d10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(d10.f15341b)))) == null || !a(aVar3, (m2.a) list2.get(num.intValue()))) ? i17 : num.intValue();
            if (intValue == i17 && (d = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = d.f15341b;
                String str2 = m0.f8372a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i18 = i15; i18 < length; i18++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i18])));
                    if (num2 != null && a(aVar3, (m2.a) list2.get(num2.intValue()))) {
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
            int[] f7 = b8.f((Collection) arrayList.get(i19));
            iArr2[i19] = f7;
            Arrays.sort(f7);
        }
        boolean[] zArr2 = new boolean[size2];
        x[][] xVarArr3 = new x[size2];
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
                List list7 = ((m2.a) list2.get(iArr3[i22])).f15316c;
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
                        m2.f fVar2 = (m2.f) list8.get(i26);
                        zArr = zArr2;
                        xVarArr = xVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f15340a)) {
                            w wVar = new w();
                            wVar.f2466r = w0.n("application/cea-608");
                            wVar.f2452a = a1.g.r(new StringBuilder(), aVar4.f15314a, ":cea608");
                            xVarArr2 = j(fVar2, R, new x(wVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f15340a)) {
                            w wVar2 = new w();
                            wVar2.f2466r = w0.n("application/cea-708");
                            wVar2.f2452a = a1.g.r(new StringBuilder(), aVar4.f15314a, ":cea708");
                            xVarArr2 = j(fVar2, S, new x(wVar2));
                            break;
                        } else {
                            i26++;
                            xVarArr3 = xVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i24++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    xVarArr = xVarArr3;
                    xVarArr2 = new x[0];
                    break;
                }
            }
            xVarArr[i20] = xVarArr2;
            if (xVarArr2.length != 0) {
                i21++;
            }
            i20++;
            xVarArr3 = xVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        x[][] xVarArr4 = xVarArr3;
        int size3 = list.size() + i21 + size2;
        q1[] q1VarArr = new q1[size3];
        a[] aVarArr = new a[size3];
        int i27 = 0;
        int i28 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i29 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i29)).f15316c);
            }
            int size4 = arrayList3.size();
            x[] xVarArr5 = new x[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size2;
                x xVar = ((m2.m) arrayList3.get(i30)).f15358a;
                int i32 = i27;
                w a2 = xVar.a();
                a2.S = nVar2.I0(xVar);
                xVarArr5[i30] = new x(a2);
                i30++;
                size2 = i31;
                i27 = i32;
            }
            int i33 = size2;
            int i34 = i27;
            m2.a aVar5 = (m2.a) list2.get(iArr7[0]);
            long j11 = aVar5.f15314a;
            if (j11 != -1) {
                i12 = Long.toString(j11);
            } else {
                i12 = i2.d.i(i28, "unset:");
            }
            int i35 = i34 + 1;
            if (zArr3[i28]) {
                i13 = i34 + 2;
            } else {
                i13 = i35;
                i35 = -1;
            }
            if (xVarArr4[i28].length != 0) {
                i14 = i13 + 1;
            } else {
                i14 = i13;
                i13 = -1;
            }
            f(aVar, xVarArr5);
            List list9 = list2;
            q1VarArr[i34] = new q1(i12, xVarArr5);
            int i36 = aVar5.f15315b;
            l0 l0Var2 = n0.f8592b;
            x1 x1Var2 = x1.e;
            a aVar6 = new a(i36, 0, iArr7, i34, i35, i13, -1, x1Var2);
            int[] iArr8 = iArr7;
            int i37 = i34;
            aVarArr[i37] = aVar6;
            int i38 = -1;
            if (i35 != -1) {
                String u10 = t8.b.u(i12, ":emsg");
                w wVar3 = new w();
                wVar3.f2452a = u10;
                wVar3.f2466r = w0.n("application/x-emsg");
                wVar3.f2460l = i12;
                x[] xVarArr6 = new x[z12];
                xVarArr6[0] = new x(wVar3);
                q1VarArr[i35] = new q1(u10, xVarArr6);
                a aVar7 = new a(5, 1, iArr8, i37, -1, -1, -1, x1Var2);
                iArr8 = iArr8;
                i37 = i37;
                aVarArr[i35] = aVar7;
                i38 = -1;
            }
            if (i13 != i38) {
                String u11 = t8.b.u(i12, ":cc");
                aVarArr[i13] = new a(3, 1, iArr8, i37, -1, -1, -1, n0.v(xVarArr4[i28]));
                f(aVar, xVarArr4[i28]);
                int i39 = 0;
                while (true) {
                    x[] xVarArr7 = xVarArr4[i28];
                    if (i39 >= xVarArr7.length) {
                        break;
                    }
                    w a10 = xVarArr7[i39].a();
                    a10.f2460l = i12;
                    xVarArr7[i39] = new x(a10);
                    i39++;
                }
                q1VarArr[i13] = new q1(u11, xVarArr4[i28]);
            }
            i28++;
            size2 = i33;
            nVar2 = nVar;
            i27 = i14;
            list2 = list9;
            z12 = true;
        }
        int i40 = 0;
        while (i40 < list.size()) {
            m2.g gVar = (m2.g) list.get(i40);
            w wVar4 = new w();
            wVar4.f2452a = gVar.a();
            wVar4.f2466r = w0.n("application/x-emsg");
            q1VarArr[i27] = new q1(gVar.a() + ":" + i40, new x(wVar4));
            l0 l0Var3 = n0.f8592b;
            aVarArr[i27] = new a(5, 2, new int[0], -1, -1, -1, i40, x1.e);
            i40++;
            i27++;
        }
        Pair create = Pair.create(new r1(q1VarArr), aVarArr);
        this.f14487s = (r1) create.first;
        this.v = (a[]) create.second;
        this.P = Long.MIN_VALUE;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f15315b;
        List list = aVar.f15316c;
        int i11 = aVar2.f15315b;
        List list2 = aVar2.f15316c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                x xVar = ((m2.m) list.get(0)).f15358a;
                x xVar2 = ((m2.m) list2.get(0)).f15358a;
                int i12 = xVar.f2507f & (-16385);
                int i13 = xVar2.f2507f & (-16385);
                if (Objects.equals(xVar.d, xVar2.d) && i12 == i13) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static m2.f d(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.f fVar = (m2.f) list.get(i10);
            if (str.equals(fVar.f15340a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void f(a5.a aVar, x[] xVarArr) {
        String str;
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            x xVar = xVarArr[i10];
            c5.f fVar = (c5.f) aVar.d;
            if (fVar.f4358b && ((u) fVar.f4359c).b0(xVar)) {
                w a2 = xVar.a();
                String str2 = xVar.f2511k;
                a2.f2466r = w0.n("application/x-media3-cues");
                a2.P = ((u) fVar.f4359c).J(xVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(xVar.f2519s);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f2458j = sb2.toString();
                a2.f2470w = Long.MAX_VALUE;
                xVar = new x(a2);
            }
            xVarArr[i10] = xVar;
        }
    }

    public static x[] j(m2.f fVar, Pattern pattern, x xVar) {
        String str = fVar.f15341b;
        if (str == null) {
            return new x[]{xVar};
        }
        String str2 = m0.f8372a;
        String[] split = str.split(";", -1);
        x[] xVarArr = new x[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new x[]{xVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            w a2 = xVar.a();
            a2.f2452a = xVar.f2504a + ":" + parseInt;
            a2.O = parseInt;
            a2.d = matcher.group(2);
            xVarArr[i10] = new x(a2);
        }
        return xVarArr;
    }

    @Override
    public final void G(f1 f1Var) {
        this.G.G(this);
    }

    @Override
    public final long b() {
        return this.J.b();
    }

    @Override
    public final boolean c() {
        return this.J.c();
    }

    public final int e(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f14478c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void g() {
        this.f14485n.d();
    }

    @Override
    public final long h(long j10) {
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
            c1[] c1VarArr = iVar.f46516y;
            c1 c1Var = iVar.f46515x;
            y2.l lVar = iVar.f46512r;
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
                    J = c1Var.I(aVar.d(0));
                } else {
                    long b10 = iVar.b();
                    if (b10 != Long.MIN_VALUE && j10 >= b10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    J = c1Var.J(j10, z10);
                }
                if (J && (aVar2 = iVar.L) != null) {
                    i11 = 0;
                    if (aVar2.d(0) <= c1Var.v()) {
                        J = false;
                    }
                } else {
                    i11 = 0;
                }
                if (J) {
                    iVar.K = iVar.C(c1Var.v(), i11);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.J(j10, true);
                    }
                } else {
                    iVar.I = j10;
                    iVar.P = false;
                    r14.clear();
                    iVar.K = 0;
                    if (lVar.c()) {
                        c1Var.l();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.l();
                        }
                        lVar.a();
                    } else {
                        lVar.f48545c = null;
                        z11 = false;
                        c1Var.G(false);
                        for (c1 c1Var4 : iVar.f46516y) {
                            c1Var4.G(false);
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
            int b11 = m0.b(mVar.f14539c, j10, true);
            mVar.h = b11;
            if (mVar.d && b11 == mVar.f14539c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            mVar.f14541n = j11;
        }
        return j10;
    }

    @Override
    public final void i(long j10) {
        v2.i[] iVarArr;
        long j11;
        for (v2.i iVar : this.H) {
            if (!iVar.y()) {
                c1 c1Var = iVar.f46515x;
                int i10 = c1Var.f45895q;
                c1Var.k(j10, true);
                c1 c1Var2 = iVar.f46515x;
                int i11 = c1Var2.f45895q;
                if (i11 > i10) {
                    synchronized (c1Var2) {
                        if (c1Var2.f45894p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = c1Var2.f45892n[c1Var2.f45896r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        c1[] c1VarArr = iVar.f46516y;
                        if (i12 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i12].k(j11, iVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(iVar.C(i11, 0), iVar.K);
                if (min > 0) {
                    m0.X(0, min, iVar.v);
                    iVar.K -= min;
                }
            }
        }
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.G = d0Var;
        d0Var.y(this);
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
    public final boolean p(v0 v0Var) {
        return this.J.p(v0Var);
    }

    @Override
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        boolean z12;
        int i13;
        q1 q1Var;
        x1 x1Var;
        int i14;
        o oVar;
        x[] xVarArr;
        long b10;
        boolean z13;
        boolean z14;
        x2.p[] pVarArr2 = pVarArr;
        int[] iArr3 = new int[pVarArr2.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = -1;
            if (i16 >= pVarArr2.length) {
                break;
            }
            x2.p pVar = pVarArr2[i16];
            if (pVar != null) {
                iArr3[i16] = this.f14487s.b(pVar.b());
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        for (int i17 = 0; i17 < pVarArr2.length; i17++) {
            if (pVarArr2[i17] == null || !zArr[i17]) {
                ?? r42 = d1VarArr[i17];
                if (r42 instanceof v2.i) {
                    ((v2.i) r42).D(this);
                } else if (r42 instanceof v2.g) {
                    v2.g gVar = (v2.g) r42;
                    v2.i iVar = gVar.e;
                    boolean[] zArr3 = iVar.d;
                    int i18 = gVar.f46506c;
                    u6.p(zArr3[i18]);
                    iVar.d[i18] = false;
                }
                d1VarArr[i17] = 0;
            }
        }
        int i19 = 0;
        while (true) {
            z10 = true;
            if (i19 >= pVarArr2.length) {
                break;
            }
            ?? r43 = d1VarArr[i19];
            if ((r43 instanceof r) || (r43 instanceof v2.g)) {
                int e = e(i19, iArr3);
                if (e == -1) {
                    z14 = d1VarArr[i19] instanceof r;
                } else {
                    ?? r10 = d1VarArr[i19];
                    z14 = ((r10 instanceof v2.g) && ((v2.g) r10).f46504a == d1VarArr[e]) ? false : false;
                }
                if (!z14) {
                    ?? r44 = d1VarArr[i19];
                    if (r44 instanceof v2.g) {
                        v2.g gVar2 = (v2.g) r44;
                        v2.i iVar2 = gVar2.e;
                        boolean[] zArr4 = iVar2.d;
                        int i20 = gVar2.f46506c;
                        u6.p(zArr4[i20]);
                        iVar2.d[i20] = false;
                    }
                    d1VarArr[i19] = 0;
                }
            }
            i19++;
        }
        int i21 = 0;
        while (i21 < pVarArr2.length) {
            x2.p pVar2 = pVarArr2[i21];
            if (pVar2 == null) {
                iArr2 = iArr3;
                i11 = i15;
                i12 = i21;
            } else {
                ?? r102 = d1VarArr[i21];
                if (r102 == 0) {
                    zArr2[i21] = z10;
                    a aVar = this.v[iArr3[i21]];
                    int i22 = aVar.f14478c;
                    if (i22 == 0) {
                        int i23 = aVar.f14479f;
                        if (i23 != i10) {
                            z12 = z10;
                        } else {
                            z12 = i15;
                        }
                        if (z12 != 0) {
                            q1Var = this.f14487s.a(i23);
                            i13 = z10;
                        } else {
                            i13 = i15;
                            q1Var = null;
                        }
                        int i24 = aVar.f14480g;
                        if (i24 != i10) {
                            x1Var = this.v[i24].h;
                        } else {
                            l0 l0Var = n0.f8592b;
                            x1Var = x1.e;
                        }
                        int size = x1Var.size() + i13;
                        int i25 = i21;
                        x[] xVarArr2 = new x[size];
                        int[] iArr4 = new int[size];
                        if (z12 != 0) {
                            xVarArr2[i15] = q1Var.d[i15];
                            iArr4[i15] = 5;
                            i14 = z10;
                        } else {
                            i14 = i15;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i26 = i15;
                        boolean z15 = z10;
                        int i27 = i14;
                        while (i26 < x1Var.size()) {
                            x xVar = (x) x1Var.get(i26);
                            xVarArr2[i27] = xVar;
                            iArr4[i27] = 3;
                            arrayList.add(xVar);
                            i26++;
                            i27++;
                        }
                        if (this.K.d && z12 != 0) {
                            p pVar3 = this.f14489x;
                            oVar = new o(pVar3, pVar3.f14547a);
                        } else {
                            oVar = null;
                        }
                        m2.c cVar = this.K;
                        int i28 = this.L;
                        i d = ((m2.m) ((m2.a) cVar.b(i28).f15348c.get(aVar.f14476a[i15])).f15316c.get(i15)).d();
                        if (d == null) {
                            b10 = -9223372036854775807L;
                            xVarArr = xVarArr2;
                        } else {
                            xVarArr = xVarArr2;
                            b10 = d.b(d.o(j10, cVar.d(i28)));
                        }
                        long j11 = b10;
                        if (this.N) {
                            m2.c cVar2 = this.K;
                            int i29 = this.L;
                            int[] iArr5 = aVar.f14476a;
                            List list = cVar2.b(i29).f15348c;
                            k0 t10 = n0.t();
                            int length = iArr5.length;
                            int i30 = 0;
                            while (i30 < length) {
                                int i31 = i30;
                                t10.d(((m2.a) list.get(iArr5[i31])).f15316c);
                                i30 = i31 + 1;
                            }
                            x1 f7 = t10.f();
                            for (int i32 = 0; i32 < pVar2.length(); i32++) {
                                x xVar2 = ((m2.m) f7.get(pVar2.h(i32))).f15358a;
                                if (!w0.a(xVar2.f2519s, xVar2.f2511k)) {
                                    z13 = z15;
                                    break;
                                }
                            }
                        }
                        z13 = false;
                        a5.a aVar2 = this.f14482b;
                        y2.m mVar = this.f14485n;
                        m2.c cVar3 = this.K;
                        qi.e eVar = this.f14484f;
                        int[] iArr6 = iArr3;
                        int i33 = this.L;
                        int[] iArr7 = aVar.f14476a;
                        int i34 = aVar.f14477b;
                        long j12 = this.h;
                        c0 c0Var = this.f14483c;
                        g2.h createDataSource = ((g2.g) aVar2.f280c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i12 = i25;
                        v2.i iVar3 = new v2.i(aVar.f14477b, iArr4, xVarArr, new l((c5.f) aVar2.d, mVar, cVar3, eVar, i33, iArr7, pVar2, i34, createDataSource, j12, aVar2.f279b, z12, arrayList, oVar), this, this.f14486r, j10, this.d, this.F, this.e, this.E, z13, j11, null);
                        long j13 = this.P;
                        iVar3.f46515x.K(j13);
                        for (c1 c1Var : iVar3.f46516y) {
                            c1Var.K(j13);
                        }
                        synchronized (this) {
                            this.f14490y.put(iVar3, oVar2);
                        }
                        d1VarArr[i12] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i12 = i21;
                        if (i22 == 2) {
                            i11 = 0;
                            d1VarArr[i12] = new m((m2.g) this.M.get(aVar.d), pVar2.b().d[0], this.K.d);
                        }
                    }
                    i11 = 0;
                } else {
                    iArr2 = iArr3;
                    i11 = i15;
                    i12 = i21;
                    if (r102 instanceof v2.i) {
                        ((v2.i) r102).e.f14532j = pVar2;
                    }
                }
            }
            i21 = i12 + 1;
            pVarArr2 = pVarArr;
            i15 = i11;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr8 = iArr3;
        ?? r13 = i15;
        while (i15 < pVarArr.length) {
            if (d1VarArr[i15] == 0 && pVarArr[i15] != null) {
                iArr = iArr8;
                a aVar3 = this.v[iArr[i15]];
                if (aVar3.f14478c == 1) {
                    int e7 = e(i15, iArr);
                    if (e7 == -1) {
                        d1VarArr[i15] = new Object();
                    } else {
                        v2.i iVar4 = (v2.i) d1VarArr[e7];
                        int i35 = aVar3.f14477b;
                        boolean[] zArr5 = iVar4.d;
                        c1[] c1VarArr = iVar4.f46516y;
                        for (int i36 = r13 == true ? 1 : 0; i36 < c1VarArr.length; i36++) {
                            if (iVar4.f46508b[i36] == i35) {
                                u6.p(!zArr5[i36]);
                                zArr5[i36] = true;
                                c1VarArr[i36].J(j10, true);
                                d1VarArr[i15] = new v2.g(iVar4, iVar4, c1VarArr[i36], i36);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i15++;
                    iArr8 = iArr;
                }
            } else {
                iArr = iArr8;
            }
            i15++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = d1VarArr.length;
        for (int i37 = r13 == true ? 1 : 0; i37 < length2; i37++) {
            ?? r62 = d1VarArr[i37];
            if (r62 instanceof v2.i) {
                arrayList2.add((v2.i) r62);
            } else if (r62 instanceof m) {
                arrayList3.add((m) r62);
            }
        }
        v2.i[] iVarArr = new v2.i[arrayList2.size()];
        this.H = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.I = mVarArr;
        arrayList3.toArray(mVarArr);
        oa.d dVar = this.f14488w;
        AbstractList x10 = s.x(arrayList2, new y0(1));
        dVar.getClass();
        this.J = new u2.o(arrayList2, x10);
        if (this.N) {
            this.N = r13;
            this.O = j10;
            v2.i[] iVarArr2 = this.H;
            int length3 = iVarArr2.length;
            int i38 = r13 == true ? 1 : 0;
            while (true) {
                if (i38 < length3) {
                    if (iVarArr2[i38].z()) {
                        z11 = true;
                        break;
                    }
                    i38++;
                } else {
                    z11 = r13 == true ? 1 : 0;
                    break;
                }
            }
            if (z11) {
                this.Q = true;
                v2.i[] iVarArr3 = this.H;
                int length4 = iVarArr3.length;
                for (int i39 = r13 == true ? 1 : 0; i39 < length4; i39++) {
                    iVarArr3[i39].O = true;
                }
            }
        }
        return j10;
    }

    @Override
    public final r1 r() {
        return this.f14487s;
    }

    @Override
    public final long s() {
        return this.J.s();
    }

    @Override
    public final long t(long r20, i2.t1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.t(long, i2.t1):long");
    }

    @Override
    public final void u(long j10) {
        int i10;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.i iVar = iVarArr[i11];
            if (!iVar.f46512r.c()) {
                long d = this.K.d(this.L);
                c1 c1Var = iVar.f46515x;
                u6.p(!iVar.f46512r.c());
                if (!iVar.y() && d != -9223372036854775807L && !iVar.v.isEmpty()) {
                    v2.a w9 = iVar.w();
                    long j11 = w9.f46479w;
                    if (j11 == -9223372036854775807L) {
                        j11 = w9.f46502n;
                    }
                    if (j11 > d) {
                        long s10 = c1Var.s();
                        if (s10 > d) {
                            c1Var.m(Math.max(d, c1Var.t() + 1));
                            c1[] c1VarArr = iVar.f46516y;
                            int length2 = c1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                c1 c1Var2 = c1VarArr[i12];
                                c1Var2.m(Math.max(d, c1Var2.t() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            iVar.h.C(iVar.f46507a, d, s10);
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
}
