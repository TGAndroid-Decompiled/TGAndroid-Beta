package l2;

import android.support.v4.media.session.a0;
import android.util.Pair;
import android.util.SparseArray;
import b2.p1;
import b2.v0;
import b2.w;
import b2.x;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import i2.w0;
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
import t7.u;
import u2.c1;
import u2.d0;
import u2.d1;
import u2.e0;
import u2.e1;
import u2.f1;
import u2.r;
import u2.r1;
import v7.c8;
import v7.t6;
import x2.q;
public final class b implements e0, e1, v2.h {
    public static final Pattern R = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern S = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.j F;
    public d0 G;
    public u2.n J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final long P;
    public boolean Q;
    public final int f11566a;
    public final a5.a f11567b;
    public final g2.d0 f11568c;
    public final n2.m d;
    public final hb.a e;
    public final xa.n f11569f;
    public final long h;
    public final y2.m f11570n;
    public final a0 f11571r;
    public final r1 f11572s;
    public final a[] f11573w;
    public final kb.a f11574x;
    public final p f11575y;
    public boolean N = true;
    public v2.i[] H = new v2.i[0];
    public m[] I = new m[0];
    public final IdentityHashMap D = new IdentityHashMap();

    public b(int i10, m2.c cVar, xa.n nVar, int i11, a5.a aVar, g2.d0 d0Var, n2.m mVar, n2.j jVar, hb.a aVar2, a5.a aVar3, long j10, y2.m mVar2, a0 a0Var, kb.a aVar4, f fVar, j2.l lVar) {
        String i12;
        int i13;
        int i14;
        int[][] iArr;
        boolean[] zArr;
        x[][] xVarArr;
        x[] xVarArr2;
        m2.f b10;
        Integer num;
        n2.m mVar3 = mVar;
        this.f11566a = i10;
        this.K = cVar;
        this.f11569f = nVar;
        this.L = i11;
        this.f11567b = aVar;
        this.f11568c = d0Var;
        this.d = mVar3;
        this.F = jVar;
        this.e = aVar2;
        this.E = aVar3;
        this.h = j10;
        this.f11570n = mVar2;
        this.f11571r = a0Var;
        this.f11574x = aVar4;
        boolean z10 = true;
        this.f11575y = new p(cVar, fVar, a0Var);
        int i15 = 0;
        aVar4.getClass();
        l0 l0Var = n0.f6390b;
        x1 x1Var = x1.e;
        this.J = new u2.n(x1Var, x1Var);
        m2.h b11 = cVar.b(i11);
        List list = b11.d;
        this.M = list;
        List list2 = b11.f12658c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i16)).f12624a), Integer.valueOf(i16));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        int i17 = 0;
        while (i17 < size) {
            m2.a aVar5 = (m2.a) list2.get(i17);
            List list3 = aVar5.e;
            List list4 = aVar5.f12627f;
            boolean z11 = z10;
            m2.f b12 = b("http://dashif.org/guidelines/trickmode", list3);
            b12 = b12 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b12;
            int intValue = (b12 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b12.f12651b)))) == null || !a(aVar5, (m2.a) list2.get(num.intValue()))) ? i17 : num.intValue();
            if (intValue == i17 && (b10 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = b10.f12651b;
                String str2 = e2.l0.f6165a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i18 = i15; i18 < length; i18++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i18])));
                    if (num2 != null && a(aVar5, (m2.a) list2.get(num2.intValue()))) {
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
            int[] f7 = c8.f((Collection) arrayList.get(i19));
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
                List list7 = ((m2.a) list2.get(iArr3[i22])).f12626c;
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
                    m2.a aVar6 = (m2.a) list2.get(i25);
                    List list8 = ((m2.a) list2.get(i25)).d;
                    int[] iArr5 = iArr4;
                    int i26 = 0;
                    while (i26 < list8.size()) {
                        m2.f fVar2 = (m2.f) list8.get(i26);
                        zArr = zArr2;
                        xVarArr = xVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f12650a)) {
                            w wVar = new w();
                            wVar.f2370r = v0.n("application/cea-608");
                            wVar.f2356a = a1.g.q(new StringBuilder(), aVar6.f12624a, ":cea608");
                            xVarArr2 = n(fVar2, R, new x(wVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f12650a)) {
                            w wVar2 = new w();
                            wVar2.f2370r = v0.n("application/cea-708");
                            wVar2.f2356a = a1.g.q(new StringBuilder(), aVar6.f12624a, ":cea708");
                            xVarArr2 = n(fVar2, S, new x(wVar2));
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
        p1[] p1VarArr = new p1[size3];
        a[] aVarArr = new a[size3];
        int i27 = 0;
        int i28 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i29 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i29)).f12626c);
            }
            int size4 = arrayList3.size();
            x[] xVarArr5 = new x[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size2;
                x xVar = ((m2.m) arrayList3.get(i30)).f12668a;
                int i32 = i27;
                w a2 = xVar.a();
                a2.S = mVar3.t0(xVar);
                xVarArr5[i30] = new x(a2);
                i30++;
                size2 = i31;
                i27 = i32;
            }
            int i33 = size2;
            int i34 = i27;
            m2.a aVar7 = (m2.a) list2.get(iArr7[0]);
            long j11 = aVar7.f12624a;
            if (j11 != -1) {
                i12 = Long.toString(j11);
            } else {
                i12 = i0.a.i(i28, "unset:");
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
            l(aVar, xVarArr5);
            List list9 = list2;
            p1VarArr[i34] = new p1(i12, xVarArr5);
            int i36 = aVar7.f12625b;
            l0 l0Var2 = n0.f6390b;
            x1 x1Var2 = x1.e;
            a aVar8 = new a(i36, 0, iArr7, i34, i35, i13, -1, x1Var2);
            int[] iArr8 = iArr7;
            int i37 = i34;
            aVarArr[i37] = aVar8;
            int i38 = -1;
            if (i35 != -1) {
                String A = sc.e.A(i12, ":emsg");
                w wVar3 = new w();
                wVar3.f2356a = A;
                wVar3.f2370r = v0.n("application/x-emsg");
                wVar3.f2364l = i12;
                x[] xVarArr6 = new x[z12];
                xVarArr6[0] = new x(wVar3);
                p1VarArr[i35] = new p1(A, xVarArr6);
                a aVar9 = new a(5, 1, iArr8, i37, -1, -1, -1, x1Var2);
                iArr8 = iArr8;
                i37 = i37;
                aVarArr[i35] = aVar9;
                i38 = -1;
            }
            if (i13 != i38) {
                String A2 = sc.e.A(i12, ":cc");
                aVarArr[i13] = new a(3, 1, iArr8, i37, -1, -1, -1, n0.v(xVarArr4[i28]));
                l(aVar, xVarArr4[i28]);
                int i39 = 0;
                while (true) {
                    x[] xVarArr7 = xVarArr4[i28];
                    if (i39 >= xVarArr7.length) {
                        break;
                    }
                    w a10 = xVarArr7[i39].a();
                    a10.f2364l = i12;
                    xVarArr7[i39] = new x(a10);
                    i39++;
                }
                p1VarArr[i13] = new p1(A2, xVarArr4[i28]);
            }
            i28++;
            size2 = i33;
            mVar3 = mVar;
            i27 = i14;
            list2 = list9;
            z12 = true;
        }
        int i40 = 0;
        while (i40 < list.size()) {
            m2.g gVar = (m2.g) list.get(i40);
            w wVar4 = new w();
            wVar4.f2356a = gVar.a();
            wVar4.f2370r = v0.n("application/x-emsg");
            p1VarArr[i27] = new p1(gVar.a() + ":" + i40, new x(wVar4));
            l0 l0Var3 = n0.f6390b;
            aVarArr[i27] = new a(5, 2, new int[0], -1, -1, -1, i40, x1.e);
            i40++;
            i27++;
        }
        Pair create = Pair.create(new r1(p1VarArr), aVarArr);
        this.f11572s = (r1) create.first;
        this.f11573w = (a[]) create.second;
        this.P = Long.MIN_VALUE;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.f12625b;
        List list = aVar.f12626c;
        int i11 = aVar2.f12625b;
        List list2 = aVar2.f12626c;
        if (i10 == i11) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                x xVar = ((m2.m) list.get(0)).f12668a;
                x xVar2 = ((m2.m) list2.get(0)).f12668a;
                int i12 = xVar.f2411f & (-16385);
                int i13 = xVar2.f2411f & (-16385);
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
            if (str.equals(fVar.f12650a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void l(a5.a aVar, x[] xVarArr) {
        String str;
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            x xVar = xVarArr[i10];
            c5.e eVar = (c5.e) aVar.d;
            if (eVar.f3776b && ((u) eVar.f3777c).F(xVar)) {
                w a2 = xVar.a();
                String str2 = xVar.f2415k;
                a2.f2370r = v0.n("application/x-media3-cues");
                a2.P = ((u) eVar.f3777c).y(xVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(xVar.f2423s);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a2.f2362j = sb2.toString();
                a2.f2374w = Long.MAX_VALUE;
                xVar = new x(a2);
            }
            xVarArr[i10] = xVar;
        }
    }

    public static x[] n(m2.f fVar, Pattern pattern, x xVar) {
        String str = fVar.f12651b;
        if (str == null) {
            return new x[]{xVar};
        }
        String str2 = e2.l0.f6165a;
        String[] split = str.split(";", -1);
        x[] xVarArr = new x[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new x[]{xVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            w a2 = xVar.a();
            a2.f2356a = xVar.f2408a + ":" + parseInt;
            a2.O = parseInt;
            a2.d = matcher.group(2);
            xVarArr[i10] = new x(a2);
        }
        return xVarArr;
    }

    @Override
    public final long c() {
        return this.J.c();
    }

    @Override
    public final boolean d() {
        return this.J.d();
    }

    @Override
    public final void f() {
        this.f11570n.a();
    }

    @Override
    public final long g(long j10) {
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
            c1[] c1VarArr = iVar.D;
            c1 c1Var = iVar.f50337y;
            y2.l lVar = iVar.f50333r;
            ?? r14 = iVar.f50335w;
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
                        if (i13 == 0 && aVar.f50299w == -9223372036854775807L) {
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
                    long c10 = iVar.c();
                    if (c10 != Long.MIN_VALUE && j10 >= c10) {
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
                        lVar.b();
                    } else {
                        lVar.f54187c = null;
                        z11 = false;
                        c1Var.G(false);
                        for (c1 c1Var4 : iVar.D) {
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
            int b10 = e2.l0.b(mVar.f11624c, j10, true);
            mVar.h = b10;
            if (mVar.d && b10 == mVar.f11624c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            mVar.f11626n = j11;
        }
        return j10;
    }

    @Override
    public final void h(long j10) {
        v2.i[] iVarArr;
        long j11;
        for (v2.i iVar : this.H) {
            if (!iVar.y()) {
                c1 c1Var = iVar.f50337y;
                int i10 = c1Var.f49867q;
                c1Var.k(j10, true);
                c1 c1Var2 = iVar.f50337y;
                int i11 = c1Var2.f49867q;
                if (i11 > i10) {
                    synchronized (c1Var2) {
                        if (c1Var2.f49866p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = c1Var2.f49864n[c1Var2.f49868r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        c1[] c1VarArr = iVar.D;
                        if (i12 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i12].k(j11, iVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(iVar.B(i11, 0), iVar.K);
                if (min > 0) {
                    e2.l0.X(0, min, iVar.f50335w);
                    iVar.K -= min;
                }
            }
        }
    }

    public final int i(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.f11573w;
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f11563c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void j(d0 d0Var, long j10) {
        this.G = d0Var;
        d0Var.e(this);
    }

    @Override
    public final long k() {
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
    public final boolean m(w0 w0Var) {
        return this.J.m(w0Var);
    }

    @Override
    public final long p(q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
        x[] xVarArr;
        long a2;
        boolean z13;
        boolean z14;
        q[] qVarArr2 = qVarArr;
        int[] iArr3 = new int[qVarArr2.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = -1;
            if (i16 >= qVarArr2.length) {
                break;
            }
            q qVar = qVarArr2[i16];
            if (qVar != null) {
                iArr3[i16] = this.f11572s.b(qVar.b());
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        for (int i17 = 0; i17 < qVarArr2.length; i17++) {
            if (qVarArr2[i17] == null || !zArr[i17]) {
                ?? r42 = d1VarArr[i17];
                if (r42 instanceof v2.i) {
                    ((v2.i) r42).C(this);
                } else if (r42 instanceof v2.g) {
                    v2.g gVar = (v2.g) r42;
                    v2.i iVar = gVar.e;
                    boolean[] zArr3 = iVar.d;
                    int i18 = gVar.f50327c;
                    t6.p(zArr3[i18]);
                    iVar.d[i18] = false;
                }
                d1VarArr[i17] = 0;
            }
        }
        int i19 = 0;
        while (true) {
            z10 = true;
            if (i19 >= qVarArr2.length) {
                break;
            }
            ?? r43 = d1VarArr[i19];
            if ((r43 instanceof r) || (r43 instanceof v2.g)) {
                int i20 = i(iArr3, i19);
                if (i20 == -1) {
                    z14 = d1VarArr[i19] instanceof r;
                } else {
                    ?? r10 = d1VarArr[i19];
                    z14 = ((r10 instanceof v2.g) && ((v2.g) r10).f50325a == d1VarArr[i20]) ? false : false;
                }
                if (!z14) {
                    ?? r44 = d1VarArr[i19];
                    if (r44 instanceof v2.g) {
                        v2.g gVar2 = (v2.g) r44;
                        v2.i iVar2 = gVar2.e;
                        boolean[] zArr4 = iVar2.d;
                        int i21 = gVar2.f50327c;
                        t6.p(zArr4[i21]);
                        iVar2.d[i21] = false;
                    }
                    d1VarArr[i19] = 0;
                }
            }
            i19++;
        }
        int i22 = 0;
        while (i22 < qVarArr2.length) {
            q qVar2 = qVarArr2[i22];
            if (qVar2 == null) {
                iArr2 = iArr3;
                i11 = i15;
                i12 = i22;
            } else {
                ?? r102 = d1VarArr[i22];
                if (r102 == 0) {
                    zArr2[i22] = z10;
                    a aVar = this.f11573w[iArr3[i22]];
                    int i23 = aVar.f11563c;
                    if (i23 == 0) {
                        int i24 = aVar.f11564f;
                        if (i24 != i10) {
                            z12 = z10;
                        } else {
                            z12 = i15;
                        }
                        if (z12 != 0) {
                            p1Var = this.f11572s.a(i24);
                            i13 = z10;
                        } else {
                            i13 = i15;
                            p1Var = null;
                        }
                        int i25 = aVar.f11565g;
                        if (i25 != i10) {
                            x1Var = this.f11573w[i25].h;
                        } else {
                            l0 l0Var = n0.f6390b;
                            x1Var = x1.e;
                        }
                        int size = x1Var.size() + i13;
                        int i26 = i22;
                        x[] xVarArr2 = new x[size];
                        int[] iArr4 = new int[size];
                        if (z12 != 0) {
                            xVarArr2[i15] = p1Var.d[i15];
                            iArr4[i15] = 5;
                            i14 = z10;
                        } else {
                            i14 = i15;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i27 = i15;
                        boolean z15 = z10;
                        int i28 = i14;
                        while (i27 < x1Var.size()) {
                            x xVar = (x) x1Var.get(i27);
                            xVarArr2[i28] = xVar;
                            iArr4[i28] = 3;
                            arrayList.add(xVar);
                            i27++;
                            i28++;
                        }
                        if (this.K.d && z12 != 0) {
                            p pVar = this.f11575y;
                            oVar = new o(pVar, pVar.f11632a);
                        } else {
                            oVar = null;
                        }
                        m2.c cVar = this.K;
                        int i29 = this.L;
                        i d = ((m2.m) ((m2.a) cVar.b(i29).f12658c.get(aVar.f11561a[i15])).f12626c.get(i15)).d();
                        if (d == null) {
                            a2 = -9223372036854775807L;
                            xVarArr = xVarArr2;
                        } else {
                            xVarArr = xVarArr2;
                            a2 = d.a(d.o(j10, cVar.d(i29)));
                        }
                        long j11 = a2;
                        if (this.N) {
                            m2.c cVar2 = this.K;
                            int i30 = this.L;
                            int[] iArr5 = aVar.f11561a;
                            List list = cVar2.b(i30).f12658c;
                            k0 t10 = n0.t();
                            int length = iArr5.length;
                            int i31 = 0;
                            while (i31 < length) {
                                int i32 = i31;
                                t10.d(((m2.a) list.get(iArr5[i32])).f12626c);
                                i31 = i32 + 1;
                            }
                            x1 f7 = t10.f();
                            for (int i33 = 0; i33 < qVar2.length(); i33++) {
                                x xVar2 = ((m2.m) f7.get(qVar2.h(i33))).f12668a;
                                if (!v0.a(xVar2.f2423s, xVar2.f2415k)) {
                                    z13 = z15;
                                    break;
                                }
                            }
                        }
                        z13 = false;
                        a5.a aVar2 = this.f11567b;
                        y2.m mVar = this.f11570n;
                        m2.c cVar3 = this.K;
                        xa.n nVar = this.f11569f;
                        int[] iArr6 = iArr3;
                        int i34 = this.L;
                        int[] iArr7 = aVar.f11561a;
                        int i35 = aVar.f11562b;
                        long j12 = this.h;
                        g2.d0 d0Var = this.f11568c;
                        g2.h createDataSource = ((g2.g) aVar2.f282c).createDataSource();
                        if (d0Var != null) {
                            createDataSource.addTransferListener(d0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i12 = i26;
                        v2.i iVar3 = new v2.i(aVar.f11562b, iArr4, xVarArr, new l((c5.e) aVar2.d, mVar, cVar3, nVar, i34, iArr7, qVar2, i35, createDataSource, j12, aVar2.f281b, z12, arrayList, oVar), this, this.f11571r, j10, this.d, this.F, this.e, this.E, z13, j11, null);
                        long j13 = this.P;
                        iVar3.f50337y.K(j13);
                        for (c1 c1Var : iVar3.D) {
                            c1Var.K(j13);
                        }
                        synchronized (this) {
                            this.D.put(iVar3, oVar2);
                        }
                        d1VarArr[i12] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i12 = i22;
                        if (i23 == 2) {
                            i11 = 0;
                            d1VarArr[i12] = new m((m2.g) this.M.get(aVar.d), qVar2.b().d[0], this.K.d);
                        }
                    }
                    i11 = 0;
                } else {
                    iArr2 = iArr3;
                    i11 = i15;
                    i12 = i22;
                    if (r102 instanceof v2.i) {
                        ((v2.i) r102).e.f11617j = qVar2;
                    }
                }
            }
            i22 = i12 + 1;
            qVarArr2 = qVarArr;
            i15 = i11;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr8 = iArr3;
        ?? r13 = i15;
        while (i15 < qVarArr.length) {
            if (d1VarArr[i15] == 0 && qVarArr[i15] != null) {
                iArr = iArr8;
                a aVar3 = this.f11573w[iArr[i15]];
                if (aVar3.f11563c == 1) {
                    int i36 = i(iArr, i15);
                    if (i36 == -1) {
                        d1VarArr[i15] = new Object();
                    } else {
                        v2.i iVar4 = (v2.i) d1VarArr[i36];
                        int i37 = aVar3.f11562b;
                        boolean[] zArr5 = iVar4.d;
                        c1[] c1VarArr = iVar4.D;
                        for (int i38 = r13 == true ? 1 : 0; i38 < c1VarArr.length; i38++) {
                            if (iVar4.f50329b[i38] == i37) {
                                t6.p(!zArr5[i38]);
                                zArr5[i38] = true;
                                c1VarArr[i38].J(j10, true);
                                d1VarArr[i15] = new v2.g(iVar4, iVar4, c1VarArr[i38], i38);
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
        for (int i39 = r13 == true ? 1 : 0; i39 < length2; i39++) {
            ?? r62 = d1VarArr[i39];
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
        kb.a aVar4 = this.f11574x;
        AbstractList x10 = s.x(arrayList2, new k2.k0(4));
        aVar4.getClass();
        this.J = new u2.n(arrayList2, x10);
        if (this.N) {
            this.N = r13;
            this.O = j10;
            v2.i[] iVarArr2 = this.H;
            int length3 = iVarArr2.length;
            int i40 = r13 == true ? 1 : 0;
            while (true) {
                if (i40 < length3) {
                    if (iVarArr2[i40].z()) {
                        z11 = true;
                        break;
                    }
                    i40++;
                } else {
                    z11 = r13 == true ? 1 : 0;
                    break;
                }
            }
            if (z11) {
                this.Q = true;
                v2.i[] iVarArr3 = this.H;
                int length4 = iVarArr3.length;
                for (int i41 = r13 == true ? 1 : 0; i41 < length4; i41++) {
                    iVarArr3[i41].O = true;
                }
            }
        }
        return j10;
    }

    @Override
    public final r1 q() {
        return this.f11572s;
    }

    @Override
    public final void r(f1 f1Var) {
        this.G.r(this);
    }

    @Override
    public final long s() {
        return this.J.s();
    }

    @Override
    public final long t(long r20, i2.v1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.b.t(long, i2.v1):long");
    }

    @Override
    public final void u(long j10) {
        int i10;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.i iVar = iVarArr[i11];
            if (!iVar.f50333r.d()) {
                long d = this.K.d(this.L);
                c1 c1Var = iVar.f50337y;
                t6.p(!iVar.f50333r.d());
                if (!iVar.y() && d != -9223372036854775807L && !iVar.f50335w.isEmpty()) {
                    v2.a w9 = iVar.w();
                    long j11 = w9.f50300x;
                    if (j11 == -9223372036854775807L) {
                        j11 = w9.f50323n;
                    }
                    if (j11 > d) {
                        long s10 = c1Var.s();
                        if (s10 > d) {
                            c1Var.m(Math.max(d, c1Var.t() + 1));
                            c1[] c1VarArr = iVar.D;
                            int length2 = c1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                c1 c1Var2 = c1VarArr[i12];
                                c1Var2.m(Math.max(d, c1Var2.t() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            iVar.h.B(d, iVar.f50328a, s10);
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
