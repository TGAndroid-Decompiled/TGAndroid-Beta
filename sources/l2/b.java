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
import x2.p;
public final class b implements e0, e1, v2.h {
    public static final Pattern R = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern S = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.j F;
    public d0 G;
    public u2.o J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final long P;
    public boolean Q;
    public final int f14483a;
    public final a5.a f14484b;
    public final c0 f14485c;
    public final n2.m d;
    public final oa.d e;
    public final pi.e f14486f;
    public final long h;
    public final y2.m f14487n;
    public final androidx.biometric.e f14488r;
    public final r1 f14489s;
    public final a[] v;
    public final oa.d f14490w;
    public final o f14491x;
    public boolean N = true;
    public v2.i[] H = new v2.i[0];
    public l[] I = new l[0];
    public final IdentityHashMap f14492y = new IdentityHashMap();

    public b(int i10, m2.c cVar, pi.e eVar, int i11, a5.a aVar, c0 c0Var, n2.m mVar, n2.j jVar, oa.d dVar, a5.a aVar2, long j10, y2.m mVar2, androidx.biometric.e eVar2, oa.d dVar2, a6.m mVar3, j2.k kVar) {
        String j11;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        x[][] xVarArr;
        x[] xVarArr2;
        m2.f b10;
        Integer num;
        n2.m mVar4 = mVar;
        this.f14483a = i10;
        this.K = cVar;
        this.f14486f = eVar;
        this.L = i11;
        this.f14484b = aVar;
        this.f14485c = c0Var;
        this.d = mVar4;
        this.F = jVar;
        this.e = dVar;
        this.E = aVar2;
        this.h = j10;
        this.f14487n = mVar2;
        this.f14488r = eVar2;
        this.f14490w = dVar2;
        boolean z10 = true;
        this.f14491x = new o(cVar, mVar3, eVar2);
        int i14 = 0;
        dVar2.getClass();
        l0 l0Var = n0.f8595b;
        x1 x1Var = x1.e;
        this.J = new u2.o(x1Var, x1Var);
        m2.h b11 = cVar.b(i11);
        List list = b11.d;
        this.M = list;
        List list2 = b11.f15083c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i15)).f15049a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            m2.a aVar3 = (m2.a) list2.get(i16);
            List list3 = aVar3.e;
            List list4 = aVar3.f15052f;
            boolean z11 = z10;
            m2.f b12 = b("http://dashif.org/guidelines/trickmode", list3);
            b12 = b12 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b12;
            int intValue = (b12 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b12.f15076b)))) == null || !a(aVar3, (m2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (b10 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = b10.f15076b;
                String str2 = m0.f8375a;
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
        x[][] xVarArr3 = new x[size2];
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
                List list7 = ((m2.a) list2.get(iArr3[i21])).f15051c;
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
                        m2.f fVar = (m2.f) list8.get(i25);
                        zArr = zArr2;
                        xVarArr = xVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f15075a)) {
                            w wVar = new w();
                            wVar.f2470r = w0.n("application/cea-608");
                            wVar.f2456a = a1.g.r(new StringBuilder(), aVar4.f15049a, ":cea608");
                            xVarArr2 = j(fVar, R, new x(wVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f15075a)) {
                            w wVar2 = new w();
                            wVar2.f2470r = w0.n("application/cea-708");
                            wVar2.f2456a = a1.g.r(new StringBuilder(), aVar4.f15049a, ":cea708");
                            xVarArr2 = j(fVar, S, new x(wVar2));
                            break;
                        } else {
                            i25++;
                            xVarArr3 = xVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i23++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    xVarArr = xVarArr3;
                    xVarArr2 = new x[0];
                    break;
                }
            }
            xVarArr[i19] = xVarArr2;
            if (xVarArr2.length != 0) {
                i20++;
            }
            i19++;
            xVarArr3 = xVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        x[][] xVarArr4 = xVarArr3;
        int size3 = list.size() + i20 + size2;
        q1[] q1VarArr = new q1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i28)).f15051c);
            }
            int size4 = arrayList3.size();
            x[] xVarArr5 = new x[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                x xVar = ((m2.m) arrayList3.get(i29)).f15093a;
                int i31 = i26;
                w a2 = xVar.a();
                a2.S = mVar4.J0(xVar);
                xVarArr5[i29] = new x(a2);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            m2.a aVar5 = (m2.a) list2.get(iArr7[0]);
            long j12 = aVar5.f15049a;
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
            if (xVarArr4[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            f(aVar, xVarArr5);
            List list9 = list2;
            q1VarArr[i33] = new q1(j11, xVarArr5);
            int i35 = aVar5.f15050b;
            l0 l0Var2 = n0.f8595b;
            x1 x1Var2 = x1.e;
            a aVar6 = new a(i35, 0, iArr7, i33, i34, i12, -1, x1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar6;
            int i37 = -1;
            if (i34 != -1) {
                String u10 = t8.b.u(j11, ":emsg");
                w wVar3 = new w();
                wVar3.f2456a = u10;
                wVar3.f2470r = w0.n("application/x-emsg");
                wVar3.f2464l = j11;
                x[] xVarArr6 = new x[z12];
                xVarArr6[0] = new x(wVar3);
                q1VarArr[i34] = new q1(u10, xVarArr6);
                a aVar7 = new a(5, 1, iArr8, i36, -1, -1, -1, x1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar7;
                i37 = -1;
            }
            if (i12 != i37) {
                String u11 = t8.b.u(j11, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, n0.v(xVarArr4[i27]));
                f(aVar, xVarArr4[i27]);
                int i38 = 0;
                while (true) {
                    x[] xVarArr7 = xVarArr4[i27];
                    if (i38 >= xVarArr7.length) {
                        break;
                    }
                    w a10 = xVarArr7[i38].a();
                    a10.f2464l = j11;
                    xVarArr7[i38] = new x(a10);
                    i38++;
                }
                q1VarArr[i12] = new q1(u11, xVarArr4[i27]);
            }
            i27++;
            size2 = i32;
            mVar4 = mVar;
            i26 = i13;
            list2 = list9;
            z12 = true;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            m2.g gVar = (m2.g) list.get(i39);
            w wVar4 = new w();
            wVar4.f2456a = gVar.a();
            wVar4.f2470r = w0.n("application/x-emsg");
            q1VarArr[i26] = new q1(gVar.a() + ":" + i39, new x(wVar4));
            l0 l0Var3 = n0.f8595b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, x1.e);
            i39++;
            i26++;
        }
        Pair create = Pair.create(new r1(q1VarArr), aVarArr);
        this.f14489s = (r1) create.first;
        this.v = (a[]) create.second;
        this.P = Long.MIN_VALUE;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f15050b;
        List list = aVar.f15051c;
        int i11 = aVar2.f15050b;
        List list2 = aVar2.f15051c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                x xVar = ((m2.m) list.get(0)).f15093a;
                x xVar2 = ((m2.m) list2.get(0)).f15093a;
                int i12 = xVar.f2511f & (-16385);
                int i13 = xVar2.f2511f & (-16385);
                if (Objects.equals(xVar.d, xVar2.d) && i12 == i13) {
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
            if (str.equals(fVar.f15075a)) {
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
            if (fVar.f4361b && ((u) fVar.f4362c).a0(xVar)) {
                w a2 = xVar.a();
                String str2 = xVar.f2515k;
                a2.f2470r = w0.n("application/x-media3-cues");
                a2.P = ((u) fVar.f4362c).H(xVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(xVar.f2523s);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f2462j = sb2.toString();
                a2.f2474w = Long.MAX_VALUE;
                xVar = new x(a2);
            }
            xVarArr[i10] = xVar;
        }
    }

    public static x[] j(m2.f fVar, Pattern pattern, x xVar) {
        String str = fVar.f15076b;
        if (str == null) {
            return new x[]{xVar};
        }
        String str2 = m0.f8375a;
        String[] split = str.split(";", -1);
        x[] xVarArr = new x[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new x[]{xVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            w a2 = xVar.a();
            a2.f2456a = xVar.f2508a + ":" + parseInt;
            a2.O = parseInt;
            a2.d = matcher.group(2);
            xVarArr[i10] = new x(a2);
        }
        return xVarArr;
    }

    @Override
    public final void F(f1 f1Var) {
        this.G.F(this);
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
                if (i14 == i12 && aVarArr[i14].f14480c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void g() {
        this.f14487n.b();
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
            if (iVar.v()) {
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
                    long d = iVar.d();
                    if (d != Long.MIN_VALUE && j10 >= d) {
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
                    iVar.K = iVar.B(c1Var.v(), i11);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.J(j10, true);
                    }
                } else {
                    iVar.I = j10;
                    iVar.P = false;
                    r14.clear();
                    iVar.K = 0;
                    if (lVar.d()) {
                        c1Var.l();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.l();
                        }
                        lVar.a();
                    } else {
                        lVar.f48544c = null;
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
        l[] lVarArr = this.I;
        int length2 = lVarArr.length;
        for (int i14 = z12; i14 < length2; i14++) {
            l lVar2 = lVarArr[i14];
            int b10 = m0.b(lVar2.f14539c, j10, true);
            lVar2.h = b10;
            if (lVar2.d && b10 == lVar2.f14539c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            lVar2.f14541n = j11;
        }
        return j10;
    }

    @Override
    public final void i(long j10) {
        v2.i[] iVarArr;
        long j11;
        for (v2.i iVar : this.H) {
            if (!iVar.v()) {
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
                int min = Math.min(iVar.B(i11, 0), iVar.K);
                if (min > 0) {
                    m0.X(0, min, iVar.v);
                    iVar.K -= min;
                }
            }
        }
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.G = d0Var;
        d0Var.q(this);
    }

    @Override
    public final long l() {
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
                    if (iVarArr2[i10].x()) {
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
    public final boolean m(v0 v0Var) {
        return this.J.m(v0Var);
    }

    @Override
    public final long n(p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
        n nVar;
        x[] xVarArr;
        long a2;
        boolean z13;
        boolean z14;
        p[] pVarArr2 = pVarArr;
        int[] iArr3 = new int[pVarArr2.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = -1;
            if (i16 >= pVarArr2.length) {
                break;
            }
            p pVar = pVarArr2[i16];
            if (pVar != null) {
                iArr3[i16] = this.f14489s.b(pVar.b());
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        for (int i17 = 0; i17 < pVarArr2.length; i17++) {
            if (pVarArr2[i17] == null || !zArr[i17]) {
                ?? r42 = d1VarArr[i17];
                if (r42 instanceof v2.i) {
                    ((v2.i) r42).C(this);
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
            p pVar2 = pVarArr2[i21];
            if (pVar2 == null) {
                iArr2 = iArr3;
                i11 = i15;
                i12 = i21;
            } else {
                ?? r102 = d1VarArr[i21];
                if (r102 == 0) {
                    zArr2[i21] = z10;
                    a aVar = this.v[iArr3[i21]];
                    int i22 = aVar.f14480c;
                    if (i22 == 0) {
                        int i23 = aVar.f14481f;
                        if (i23 != i10) {
                            z12 = z10;
                        } else {
                            z12 = i15;
                        }
                        if (z12 != 0) {
                            q1Var = this.f14489s.a(i23);
                            i13 = z10;
                        } else {
                            i13 = i15;
                            q1Var = null;
                        }
                        int i24 = aVar.f14482g;
                        if (i24 != i10) {
                            x1Var = this.v[i24].h;
                        } else {
                            l0 l0Var = n0.f8595b;
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
                            o oVar = this.f14491x;
                            nVar = new n(oVar, oVar.f14547a);
                        } else {
                            nVar = null;
                        }
                        m2.c cVar = this.K;
                        int i28 = this.L;
                        h d = ((m2.m) ((m2.a) cVar.b(i28).f15083c.get(aVar.f14478a[i15])).f15051c.get(i15)).d();
                        if (d == null) {
                            a2 = -9223372036854775807L;
                            xVarArr = xVarArr2;
                        } else {
                            xVarArr = xVarArr2;
                            a2 = d.a(d.n(j10, cVar.d(i28)));
                        }
                        long j11 = a2;
                        if (this.N) {
                            m2.c cVar2 = this.K;
                            int i29 = this.L;
                            int[] iArr5 = aVar.f14478a;
                            List list = cVar2.b(i29).f15083c;
                            k0 t10 = n0.t();
                            int length = iArr5.length;
                            int i30 = 0;
                            while (i30 < length) {
                                int i31 = i30;
                                t10.d(((m2.a) list.get(iArr5[i31])).f15051c);
                                i30 = i31 + 1;
                            }
                            x1 f7 = t10.f();
                            for (int i32 = 0; i32 < pVar2.length(); i32++) {
                                x xVar2 = ((m2.m) f7.get(pVar2.h(i32))).f15093a;
                                if (!w0.a(xVar2.f2523s, xVar2.f2515k)) {
                                    z13 = z15;
                                    break;
                                }
                            }
                        }
                        z13 = false;
                        a5.a aVar2 = this.f14484b;
                        y2.m mVar = this.f14487n;
                        m2.c cVar3 = this.K;
                        pi.e eVar = this.f14486f;
                        int[] iArr6 = iArr3;
                        int i33 = this.L;
                        int[] iArr7 = aVar.f14478a;
                        int i34 = aVar.f14479b;
                        long j12 = this.h;
                        c0 c0Var = this.f14485c;
                        g2.h createDataSource = ((g2.g) aVar2.f282c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr6;
                        i12 = i25;
                        v2.i iVar3 = new v2.i(aVar.f14479b, iArr4, xVarArr, new k((c5.f) aVar2.d, mVar, cVar3, eVar, i33, iArr7, pVar2, i34, createDataSource, j12, aVar2.f281b, z12, arrayList, nVar), this, this.f14488r, j10, this.d, this.F, this.e, this.E, z13, j11, null);
                        long j13 = this.P;
                        iVar3.f46515x.K(j13);
                        for (c1 c1Var : iVar3.f46516y) {
                            c1Var.K(j13);
                        }
                        synchronized (this) {
                            this.f14492y.put(iVar3, nVar2);
                        }
                        d1VarArr[i12] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i12 = i21;
                        if (i22 == 2) {
                            i11 = 0;
                            d1VarArr[i12] = new l((m2.g) this.M.get(aVar.d), pVar2.b().d[0], this.K.d);
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
                if (aVar3.f14480c == 1) {
                    int e7 = e(i15, iArr);
                    if (e7 == -1) {
                        d1VarArr[i15] = new Object();
                    } else {
                        v2.i iVar4 = (v2.i) d1VarArr[e7];
                        int i35 = aVar3.f14479b;
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
            } else if (r62 instanceof l) {
                arrayList3.add((l) r62);
            }
        }
        v2.i[] iVarArr = new v2.i[arrayList2.size()];
        this.H = iVarArr;
        arrayList2.toArray(iVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.I = lVarArr;
        arrayList3.toArray(lVarArr);
        oa.d dVar = this.f14490w;
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
                    if (iVarArr2[i38].x()) {
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
    public final r1 o() {
        return this.f14489s;
    }

    @Override
    public final long p() {
        return this.J.p();
    }

    @Override
    public final long r(long r20, i2.t1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.r(long, i2.t1):long");
    }

    @Override
    public final void s(long j10) {
        int i10;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.i iVar = iVarArr[i11];
            if (!iVar.f46512r.d()) {
                long d = this.K.d(this.L);
                c1 c1Var = iVar.f46515x;
                u6.p(!iVar.f46512r.d());
                if (!iVar.v() && d != -9223372036854775807L && !iVar.v.isEmpty()) {
                    v2.a t10 = iVar.t();
                    long j11 = t10.f46479w;
                    if (j11 == -9223372036854775807L) {
                        j11 = t10.f46502n;
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
        this.J.s(j10);
    }
}
