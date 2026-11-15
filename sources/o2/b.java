package o2;

import a8.ja;
import a8.p0;
import a8.xa;
import android.util.Pair;
import android.util.SparseArray;
import bg.v0;
import c8.g1;
import e2.m1;
import e2.s0;
import e2.t;
import e2.u;
import h2.l0;
import h9.f0;
import h9.g0;
import h9.i0;
import h9.s1;
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
import n2.a0;
import x2.a1;
import x2.b1;
import x2.c0;
import x2.c1;
import x2.d0;
import x2.d1;
import x2.q;
import x2.q1;
public final class b implements d0, c1, y2.h {
    public static final Pattern S = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern T = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final xa F;
    public final q2.k G;
    public c0 H;
    public x2.n K;
    public p2.c L;
    public int M;
    public List N;
    public long P;
    public final long Q;
    public boolean R;
    public final int f21236a;
    public final xa f21237b;
    public final j2.c0 f21238c;
    public final q2.n d;
    public final qb.a f21239e;
    public final xi.e f21240f;
    public final long h;
    public final b3.p f21241n;
    public final h6.m f21242r;
    public final q1 f21243s;
    public final a[] f21244w;
    public final nb.a f21245x;
    public final p f21246y;
    public boolean O = true;
    public y2.i[] I = new y2.i[0];
    public m[] J = new m[0];
    public final IdentityHashMap E = new IdentityHashMap();

    public b(int i7, p2.c cVar, xi.e eVar, int i10, xa xaVar, j2.c0 c0Var, q2.n nVar, q2.k kVar, qb.a aVar, xa xaVar2, long j3, b3.p pVar, h6.m mVar, nb.a aVar2, f fVar, m2.j jVar) {
        String i11;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        u[][] uVarArr;
        u[] uVarArr2;
        p2.f d;
        Integer num;
        q2.n nVar2 = nVar;
        this.f21236a = i7;
        this.L = cVar;
        this.f21240f = eVar;
        this.M = i10;
        this.f21237b = xaVar;
        this.f21238c = c0Var;
        this.d = nVar2;
        this.G = kVar;
        this.f21239e = aVar;
        this.F = xaVar2;
        this.h = j3;
        this.f21241n = pVar;
        this.f21242r = mVar;
        this.f21245x = aVar2;
        boolean z10 = true;
        this.f21246y = new p(cVar, fVar, mVar);
        int i14 = 0;
        aVar2.getClass();
        g0 g0Var = i0.f13686b;
        s1 s1Var = s1.f13749e;
        this.K = new x2.n(s1Var, s1Var);
        p2.h b10 = cVar.b(i10);
        List list = b10.d;
        this.N = list;
        List list2 = b10.f54545c;
        int size = list2.size();
        HashMap hashMap = new HashMap(h9.o.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((p2.a) list2.get(i15)).f54507a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            p2.a aVar3 = (p2.a) list2.get(i16);
            List list3 = aVar3.f54510e;
            List list4 = aVar3.f54511f;
            boolean z11 = z10;
            p2.f d2 = d("http://dashif.org/guidelines/trickmode", list3);
            d2 = d2 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d2;
            int intValue = (d2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(d2.f54538b)))) == null || !a(aVar3, (p2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (d = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = d.f54538b;
                String str2 = l0.f13471a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i17])));
                    if (num2 != null && a(aVar3, (p2.a) list2.get(num2.intValue()))) {
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
            int[] f10 = g1.f((Collection) arrayList.get(i18));
            iArr2[i18] = f10;
            Arrays.sort(f10);
        }
        boolean[] zArr2 = new boolean[size2];
        u[][] uVarArr3 = new u[size2];
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
                List list7 = ((p2.a) list2.get(iArr3[i21])).f54509c;
                iArr = iArr2;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((p2.m) list7.get(i22)).d.isEmpty()) {
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
                    p2.a aVar4 = (p2.a) list2.get(i24);
                    List list8 = ((p2.a) list2.get(i24)).d;
                    int[] iArr5 = iArr4;
                    int i25 = 0;
                    while (i25 < list8.size()) {
                        p2.f fVar2 = (p2.f) list8.get(i25);
                        zArr = zArr2;
                        uVarArr = uVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f54537a)) {
                            t tVar = new t();
                            tVar.f10399r = s0.n("application/cea-608");
                            tVar.f10384a = p0.r(new StringBuilder(), aVar4.f54507a, ":cea608");
                            uVarArr2 = n(fVar2, S, new u(tVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f54537a)) {
                            t tVar2 = new t();
                            tVar2.f10399r = s0.n("application/cea-708");
                            tVar2.f10384a = p0.r(new StringBuilder(), aVar4.f54507a, ":cea708");
                            uVarArr2 = n(fVar2, T, new u(tVar2));
                            break;
                        } else {
                            i25++;
                            uVarArr3 = uVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i23++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    uVarArr = uVarArr3;
                    uVarArr2 = new u[0];
                    break;
                }
            }
            uVarArr[i19] = uVarArr2;
            if (uVarArr2.length != 0) {
                i20++;
            }
            i19++;
            uVarArr3 = uVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        u[][] uVarArr4 = uVarArr3;
        int size3 = list.size() + i20 + size2;
        m1[] m1VarArr = new m1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((p2.a) list2.get(i28)).f54509c);
            }
            int size4 = arrayList3.size();
            u[] uVarArr5 = new u[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                u uVar = ((p2.m) arrayList3.get(i29)).f54556a;
                int i31 = i26;
                t a10 = uVar.a();
                a10.S = nVar2.E1(uVar);
                uVarArr5[i29] = new u(a10);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            p2.a aVar5 = (p2.a) list2.get(iArr7[0]);
            long j10 = aVar5.f54507a;
            if (j10 != -1) {
                i11 = Long.toString(j10);
            } else {
                i11 = i5.c.i(i27, "unset:");
            }
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (uVarArr4[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            m(xaVar, uVarArr5);
            List list9 = list2;
            m1VarArr[i33] = new m1(i11, uVarArr5);
            int i35 = aVar5.f54508b;
            g0 g0Var2 = i0.f13686b;
            s1 s1Var2 = s1.f13749e;
            a aVar6 = new a(i35, 0, iArr7, i33, i34, i12, -1, s1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar6;
            int i37 = -1;
            if (i34 != -1) {
                String v = r.b.v(i11, ":emsg");
                t tVar3 = new t();
                tVar3.f10384a = v;
                tVar3.f10399r = s0.n("application/x-emsg");
                tVar3.f10393l = i11;
                u[] uVarArr6 = new u[z12];
                uVarArr6[0] = new u(tVar3);
                m1VarArr[i34] = new m1(v, uVarArr6);
                a aVar7 = new a(5, 1, iArr8, i36, -1, -1, -1, s1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar7;
                i37 = -1;
            }
            if (i12 != i37) {
                String v10 = r.b.v(i11, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, i0.r(uVarArr4[i27]));
                m(xaVar, uVarArr4[i27]);
                int i38 = 0;
                while (true) {
                    u[] uVarArr7 = uVarArr4[i27];
                    if (i38 >= uVarArr7.length) {
                        break;
                    }
                    t a11 = uVarArr7[i38].a();
                    a11.f10393l = i11;
                    uVarArr7[i38] = new u(a11);
                    i38++;
                }
                m1VarArr[i12] = new m1(v10, uVarArr4[i27]);
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
            p2.g gVar = (p2.g) list.get(i39);
            t tVar4 = new t();
            tVar4.f10384a = gVar.a();
            tVar4.f10399r = s0.n("application/x-emsg");
            m1VarArr[i26] = new m1(gVar.a() + ":" + i39, new u(tVar4));
            g0 g0Var3 = i0.f13686b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, s1.f13749e);
            i39++;
            i26++;
        }
        Pair create = Pair.create(new q1(m1VarArr), aVarArr);
        this.f21243s = (q1) create.first;
        this.f21244w = (a[]) create.second;
        this.Q = Long.MIN_VALUE;
    }

    public static boolean a(p2.a aVar, p2.a aVar2) {
        int i7 = aVar.f54508b;
        List list = aVar.f54509c;
        int i10 = aVar2.f54508b;
        List list2 = aVar2.f54509c;
        if (i7 == i10) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                u uVar = ((p2.m) list.get(0)).f54556a;
                u uVar2 = ((p2.m) list2.get(0)).f54556a;
                int i11 = uVar.f10439f & (-16385);
                int i12 = uVar2.f10439f & (-16385);
                if (Objects.equals(uVar.d, uVar2.d) && i11 == i12) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static p2.f d(String str, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            p2.f fVar = (p2.f) list.get(i7);
            if (str.equals(fVar.f54537a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void m(xa xaVar, u[] uVarArr) {
        String str;
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            u uVar = uVarArr[i7];
            v0 v0Var = (v0) xaVar.d;
            if (v0Var.f3346a && ((nb.a) v0Var.f3348c).L(uVar)) {
                t a10 = uVar.a();
                String str2 = uVar.f10443k;
                a10.f10399r = s0.n("application/x-media3-cues");
                a10.P = ((nb.a) v0Var.f3348c).O(uVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uVar.f10451s);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a10.f10391j = sb2.toString();
                a10.f10403w = Long.MAX_VALUE;
                uVar = new u(a10);
            }
            uVarArr[i7] = uVar;
        }
    }

    public static u[] n(p2.f fVar, Pattern pattern, u uVar) {
        String str = fVar.f54538b;
        if (str == null) {
            return new u[]{uVar};
        }
        String str2 = l0.f13471a;
        String[] split = str.split(";", -1);
        u[] uVarArr = new u[split.length];
        for (int i7 = 0; i7 < split.length; i7++) {
            Matcher matcher = pattern.matcher(split[i7]);
            if (!matcher.matches()) {
                return new u[]{uVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            t a10 = uVar.a();
            a10.f10384a = uVar.f10435a + ":" + parseInt;
            a10.O = parseInt;
            a10.d = matcher.group(2);
            uVarArr[i7] = new u(a10);
        }
        return uVarArr;
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        int i7;
        boolean z10;
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11;
        boolean z12;
        int i12;
        m1 m1Var;
        s1 s1Var;
        int i13;
        o oVar;
        u[] uVarArr2;
        long b10;
        boolean z13;
        boolean z14;
        a3.u[] uVarArr3 = uVarArr;
        int[] iArr3 = new int[uVarArr3.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i7 = -1;
            if (i15 >= uVarArr3.length) {
                break;
            }
            a3.u uVar = uVarArr3[i15];
            if (uVar != null) {
                iArr3[i15] = this.f21243s.b(uVar.c());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        for (int i16 = 0; i16 < uVarArr3.length; i16++) {
            if (uVarArr3[i16] == null || !zArr[i16]) {
                ?? r42 = b1VarArr[i16];
                if (r42 instanceof y2.i) {
                    ((y2.i) r42).D(this);
                } else if (r42 instanceof y2.g) {
                    y2.g gVar = (y2.g) r42;
                    y2.i iVar = gVar.f60125e;
                    boolean[] zArr3 = iVar.d;
                    int i17 = gVar.f60124c;
                    ja.p(zArr3[i17]);
                    iVar.d[i17] = false;
                }
                b1VarArr[i16] = 0;
            }
        }
        int i18 = 0;
        while (true) {
            z10 = true;
            if (i18 >= uVarArr3.length) {
                break;
            }
            ?? r43 = b1VarArr[i18];
            if ((r43 instanceof q) || (r43 instanceof y2.g)) {
                int f10 = f(iArr3, i18);
                if (f10 == -1) {
                    z14 = b1VarArr[i18] instanceof q;
                } else {
                    ?? r10 = b1VarArr[i18];
                    z14 = ((r10 instanceof y2.g) && ((y2.g) r10).f60122a == b1VarArr[f10]) ? false : false;
                }
                if (!z14) {
                    ?? r44 = b1VarArr[i18];
                    if (r44 instanceof y2.g) {
                        y2.g gVar2 = (y2.g) r44;
                        y2.i iVar2 = gVar2.f60125e;
                        boolean[] zArr4 = iVar2.d;
                        int i19 = gVar2.f60124c;
                        ja.p(zArr4[i19]);
                        iVar2.d[i19] = false;
                    }
                    b1VarArr[i18] = 0;
                }
            }
            i18++;
        }
        int i20 = 0;
        while (i20 < uVarArr3.length) {
            a3.u uVar2 = uVarArr3[i20];
            if (uVar2 == null) {
                iArr2 = iArr3;
                i10 = i14;
                i11 = i20;
            } else {
                ?? r102 = b1VarArr[i20];
                if (r102 == 0) {
                    zArr2[i20] = z10;
                    a aVar = this.f21244w[iArr3[i20]];
                    int i21 = aVar.f21232c;
                    if (i21 == 0) {
                        int i22 = aVar.f21234f;
                        if (i22 != i7) {
                            z12 = z10;
                        } else {
                            z12 = i14;
                        }
                        if (z12 != 0) {
                            m1Var = this.f21243s.a(i22);
                            i12 = z10;
                        } else {
                            i12 = i14;
                            m1Var = null;
                        }
                        int i23 = aVar.f21235g;
                        if (i23 != i7) {
                            s1Var = this.f21244w[i23].h;
                        } else {
                            g0 g0Var = i0.f13686b;
                            s1Var = s1.f13749e;
                        }
                        int size = s1Var.size() + i12;
                        int i24 = i20;
                        u[] uVarArr4 = new u[size];
                        int[] iArr4 = new int[size];
                        if (z12 != 0) {
                            uVarArr4[i14] = m1Var.d[i14];
                            iArr4[i14] = 5;
                            i13 = z10;
                        } else {
                            i13 = i14;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i25 = i14;
                        boolean z15 = z10;
                        int i26 = i13;
                        while (i25 < s1Var.size()) {
                            u uVar3 = (u) s1Var.get(i25);
                            uVarArr4[i26] = uVar3;
                            iArr4[i26] = 3;
                            arrayList.add(uVar3);
                            i25++;
                            i26++;
                        }
                        if (this.L.d && z12 != 0) {
                            p pVar = this.f21246y;
                            oVar = new o(pVar, pVar.f21307a);
                        } else {
                            oVar = null;
                        }
                        p2.c cVar = this.L;
                        int i27 = this.M;
                        i c10 = ((p2.m) ((p2.a) cVar.b(i27).f54545c.get(aVar.f21230a[i14])).f54509c.get(i14)).c();
                        if (c10 == null) {
                            b10 = -9223372036854775807L;
                            uVarArr2 = uVarArr4;
                        } else {
                            uVarArr2 = uVarArr4;
                            b10 = c10.b(c10.L(j3, cVar.d(i27)));
                        }
                        long j10 = b10;
                        if (this.O) {
                            p2.c cVar2 = this.L;
                            int i28 = this.M;
                            int[] iArr5 = aVar.f21230a;
                            List list = cVar2.b(i28).f54545c;
                            f0 p10 = i0.p();
                            int length = iArr5.length;
                            int i29 = 0;
                            while (i29 < length) {
                                int i30 = i29;
                                p10.d(((p2.a) list.get(iArr5[i30])).f54509c);
                                i29 = i30 + 1;
                            }
                            s1 f11 = p10.f();
                            for (int i31 = 0; i31 < uVar2.length(); i31++) {
                                u uVar4 = ((p2.m) f11.get(uVar2.i(i31))).f54556a;
                                if (!s0.a(uVar4.f10451s, uVar4.f10443k)) {
                                    z13 = z15;
                                    break;
                                }
                            }
                        }
                        z13 = false;
                        xa xaVar = this.f21237b;
                        b3.p pVar2 = this.f21241n;
                        p2.c cVar3 = this.L;
                        xi.e eVar = this.f21240f;
                        int[] iArr6 = iArr3;
                        int i32 = this.M;
                        int[] iArr7 = aVar.f21230a;
                        int i33 = aVar.f21231b;
                        long j11 = this.h;
                        j2.c0 c0Var = this.f21238c;
                        j2.h createDataSource = ((j2.g) xaVar.f714c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i11 = i24;
                        y2.i iVar3 = new y2.i(aVar.f21231b, iArr4, uVarArr2, new l((v0) xaVar.d, pVar2, cVar3, eVar, i32, iArr7, uVar2, i33, createDataSource, j11, xaVar.f713b, z12, arrayList, oVar), this, this.f21242r, j3, this.d, this.G, this.f21239e, this.F, z13, j10, null);
                        long j12 = this.Q;
                        iVar3.f60136y.K(j12);
                        for (a1 a1Var : iVar3.E) {
                            a1Var.K(j12);
                        }
                        synchronized (this) {
                            this.E.put(iVar3, oVar2);
                        }
                        b1VarArr[i11] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i20;
                        if (i21 == 2) {
                            i10 = 0;
                            b1VarArr[i11] = new m((p2.g) this.N.get(aVar.d), uVar2.c().d[0], this.L.d);
                        }
                    }
                    i10 = 0;
                } else {
                    iArr2 = iArr3;
                    i10 = i14;
                    i11 = i20;
                    if (r102 instanceof y2.i) {
                        ((y2.i) r102).f60129e.f21290j = uVar2;
                    }
                }
            }
            i20 = i11 + 1;
            uVarArr3 = uVarArr;
            i14 = i10;
            iArr3 = iArr2;
            i7 = -1;
            z10 = true;
        }
        int[] iArr8 = iArr3;
        ?? r13 = i14;
        while (i14 < uVarArr.length) {
            if (b1VarArr[i14] == 0 && uVarArr[i14] != null) {
                iArr = iArr8;
                a aVar2 = this.f21244w[iArr[i14]];
                if (aVar2.f21232c == 1) {
                    int f12 = f(iArr, i14);
                    if (f12 == -1) {
                        b1VarArr[i14] = new Object();
                    } else {
                        y2.i iVar4 = (y2.i) b1VarArr[f12];
                        int i34 = aVar2.f21231b;
                        boolean[] zArr5 = iVar4.d;
                        a1[] a1VarArr = iVar4.E;
                        for (int i35 = r13 == true ? 1 : 0; i35 < a1VarArr.length; i35++) {
                            if (iVar4.f60127b[i35] == i34) {
                                ja.p(!zArr5[i35]);
                                zArr5[i35] = true;
                                a1VarArr[i35].J(j3, true);
                                b1VarArr[i14] = new y2.g(iVar4, iVar4, a1VarArr[i35], i35);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i14++;
                    iArr8 = iArr;
                }
            } else {
                iArr = iArr8;
            }
            i14++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = b1VarArr.length;
        for (int i36 = r13 == true ? 1 : 0; i36 < length2; i36++) {
            ?? r62 = b1VarArr[i36];
            if (r62 instanceof y2.i) {
                arrayList2.add((y2.i) r62);
            } else if (r62 instanceof m) {
                arrayList3.add((m) r62);
            }
        }
        y2.i[] iVarArr = new y2.i[arrayList2.size()];
        this.I = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.J = mVarArr;
        arrayList3.toArray(mVarArr);
        nb.a aVar3 = this.f21245x;
        AbstractList y10 = h9.o.y(arrayList2, new a0(6));
        aVar3.getClass();
        this.K = new x2.n(arrayList2, y10);
        if (this.O) {
            this.O = r13;
            this.P = j3;
            y2.i[] iVarArr2 = this.I;
            int length3 = iVarArr2.length;
            int i37 = r13 == true ? 1 : 0;
            while (true) {
                if (i37 < length3) {
                    if (iVarArr2[i37].A()) {
                        z11 = true;
                        break;
                    }
                    i37++;
                } else {
                    z11 = r13 == true ? 1 : 0;
                    break;
                }
            }
            if (z11) {
                this.R = true;
                y2.i[] iVarArr3 = this.I;
                int length4 = iVarArr3.length;
                for (int i38 = r13 == true ? 1 : 0; i38 < length4; i38++) {
                    iVarArr3[i38].P = true;
                }
            }
        }
        return j3;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        return this.K.c(s0Var);
    }

    @Override
    public final long e() {
        return this.K.e();
    }

    public final int f(int[] iArr, int i7) {
        int i10 = iArr[i7];
        if (i10 != -1) {
            a[] aVarArr = this.f21244w;
            int i11 = aVarArr[i10].f21233e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && aVarArr[i13].f21232c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override
    public final void f0(d1 d1Var) {
        this.H.f0(this);
    }

    @Override
    public final boolean g() {
        return this.K.g();
    }

    @Override
    public final long h(long r20, l2.p1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.b.h(long, l2.p1):long");
    }

    @Override
    public final void i() {
        this.f21241n.a();
    }

    @Override
    public final long j(long j3) {
        long j10;
        int i7;
        y2.a aVar;
        boolean z10;
        boolean J;
        int i10;
        boolean z11;
        y2.a aVar2;
        y2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        boolean z12 = false;
        int i11 = 0;
        while (i11 < length) {
            y2.i iVar = iVarArr[i11];
            a1[] a1VarArr = iVar.E;
            a1 a1Var = iVar.f60136y;
            b3.o oVar = iVar.f60132r;
            ?? r14 = iVar.f60134w;
            iVar.K = j3;
            iVar.N = z12;
            iVar.O = z12;
            if (iVar.z()) {
                iVar.J = j3;
                z11 = z12;
                i7 = i11;
            } else {
                ?? r15 = z12;
                while (true) {
                    if (r15 < r14.size()) {
                        aVar = (y2.a) r14.get(r15);
                        int i12 = (aVar.h > j3 ? 1 : (aVar.h == j3 ? 0 : -1));
                        i7 = i11;
                        if (i12 == 0 && aVar.f60093w == -9223372036854775807L) {
                            break;
                        } else if (i12 > 0) {
                            break;
                        } else {
                            r15++;
                            i11 = i7;
                        }
                    } else {
                        i7 = i11;
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    J = a1Var.I(aVar.d(0));
                } else {
                    long e10 = iVar.e();
                    if (e10 != Long.MIN_VALUE && j3 >= e10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    J = a1Var.J(j3, z10);
                }
                if (J && (aVar2 = iVar.M) != null) {
                    i10 = 0;
                    if (aVar2.d(0) <= a1Var.v()) {
                        J = false;
                    }
                } else {
                    i10 = 0;
                }
                if (J) {
                    iVar.L = iVar.C(a1Var.v(), i10);
                    for (a1 a1Var2 : a1VarArr) {
                        a1Var2.J(j3, true);
                    }
                } else {
                    iVar.J = j3;
                    iVar.Q = false;
                    r14.clear();
                    iVar.L = 0;
                    if (oVar.d()) {
                        a1Var.l();
                        for (a1 a1Var3 : a1VarArr) {
                            a1Var3.l();
                        }
                        oVar.b();
                    } else {
                        oVar.f2921c = null;
                        z11 = false;
                        a1Var.G(false);
                        for (a1 a1Var4 : iVar.E) {
                            a1Var4.G(false);
                        }
                    }
                }
                z11 = false;
            }
            i11 = i7 + 1;
            z12 = z11;
        }
        m[] mVarArr = this.J;
        int length2 = mVarArr.length;
        for (int i13 = z12; i13 < length2; i13++) {
            m mVar = mVarArr[i13];
            int b10 = l0.b(mVar.f21297c, j3, true);
            mVar.h = b10;
            if (mVar.d && b10 == mVar.f21297c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            mVar.f21300n = j10;
        }
        return j3;
    }

    @Override
    public final void l(long j3) {
        y2.i[] iVarArr;
        long j10;
        for (y2.i iVar : this.I) {
            if (!iVar.z()) {
                a1 a1Var = iVar.f60136y;
                int i7 = a1Var.f59487q;
                a1Var.k(j3, true);
                a1 a1Var2 = iVar.f60136y;
                int i10 = a1Var2.f59487q;
                if (i10 > i7) {
                    synchronized (a1Var2) {
                        if (a1Var2.f59486p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = a1Var2.f59484n[a1Var2.f59488r];
                        }
                    }
                    int i11 = 0;
                    while (true) {
                        a1[] a1VarArr = iVar.E;
                        if (i11 >= a1VarArr.length) {
                            break;
                        }
                        a1VarArr[i11].k(j10, iVar.d[i11]);
                        i11++;
                    }
                }
                int min = Math.min(iVar.C(i10, 0), iVar.L);
                if (min > 0) {
                    l0.X(0, min, iVar.f60134w);
                    iVar.L -= min;
                }
            }
        }
    }

    @Override
    public final long o() {
        y2.i[] iVarArr;
        if (this.R) {
            boolean z10 = false;
            for (y2.i iVar : this.I) {
                iVar.getClass();
                try {
                    boolean z11 = iVar.O;
                    iVar.O = false;
                    z10 |= z11;
                } catch (Throwable th2) {
                    iVar.O = false;
                    throw th2;
                }
            }
            y2.i[] iVarArr2 = this.I;
            int length = iVarArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    if (iVarArr2[i7].A()) {
                        break;
                    }
                    i7++;
                } else {
                    this.R = false;
                    for (y2.i iVar2 : this.I) {
                        iVar2.P = false;
                    }
                }
            }
            if (z10) {
                return this.P;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final q1 p() {
        return this.f21243s;
    }

    @Override
    public final long s() {
        return this.K.s();
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        this.H = c0Var;
        c0Var.k(this);
    }

    @Override
    public final void u(long j3) {
        int i7;
        y2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            y2.i iVar = iVarArr[i10];
            if (!iVar.f60132r.d()) {
                long d = this.L.d(this.M);
                a1 a1Var = iVar.f60136y;
                ja.p(!iVar.f60132r.d());
                if (!iVar.z() && d != -9223372036854775807L && !iVar.f60134w.isEmpty()) {
                    y2.a x10 = iVar.x();
                    long j10 = x10.f60094x;
                    if (j10 == -9223372036854775807L) {
                        j10 = x10.f60120n;
                    }
                    if (j10 > d) {
                        long s5 = a1Var.s();
                        if (s5 > d) {
                            a1Var.m(Math.max(d, a1Var.t() + 1));
                            a1[] a1VarArr = iVar.E;
                            int length2 = a1VarArr.length;
                            int i11 = 0;
                            while (i11 < length2) {
                                a1 a1Var2 = a1VarArr[i11];
                                a1Var2.m(Math.max(d, a1Var2.t() + 1));
                                i11++;
                                i10 = i10;
                            }
                            i7 = i10;
                            iVar.h.z(d, iVar.f60126a, s5);
                            i10 = i7 + 1;
                        }
                    }
                }
            }
            i7 = i10;
            i10 = i7 + 1;
        }
        this.K.u(j3);
    }
}
