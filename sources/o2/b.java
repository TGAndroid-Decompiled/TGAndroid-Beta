package o2;

import a8.la;
import a8.p0;
import a8.xa;
import android.util.Pair;
import android.util.SparseArray;
import b3.q;
import bg.w0;
import c8.k1;
import e2.m1;
import e2.s0;
import e2.t;
import e2.u;
import h2.l0;
import h9.f0;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import j2.c0;
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
import x2.c1;
import x2.d0;
import x2.d1;
import x2.e0;
import x2.e1;
import x2.f1;
import x2.r;
import x2.r1;
public final class b implements e0, e1, y2.h {
    public static final Pattern S = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern T = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final xa F;
    public final q2.j G;
    public d0 H;
    public x2.n K;
    public p2.c L;
    public int M;
    public List N;
    public long P;
    public final long Q;
    public boolean R;
    public final int f21625a;
    public final xa f21626b;
    public final c0 f21627c;
    public final q2.m d;
    public final qb.a f21628e;
    public final xi.e f21629f;
    public final long h;
    public final q f21630n;
    public final h6.m f21631r;
    public final r1 f21632s;
    public final a[] f21633w;
    public final nb.a f21634x;
    public final p f21635y;
    public boolean O = true;
    public y2.i[] I = new y2.i[0];
    public m[] J = new m[0];
    public final IdentityHashMap E = new IdentityHashMap();

    public b(int i7, p2.c cVar, xi.e eVar, int i10, xa xaVar, c0 c0Var, q2.m mVar, q2.j jVar, qb.a aVar, xa xaVar2, long j3, q qVar, h6.m mVar2, nb.a aVar2, f fVar, m2.i iVar) {
        String i11;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        u[][] uVarArr;
        u[] uVarArr2;
        p2.f d;
        Integer num;
        q2.m mVar3 = mVar;
        this.f21625a = i7;
        this.L = cVar;
        this.f21629f = eVar;
        this.M = i10;
        this.f21626b = xaVar;
        this.f21627c = c0Var;
        this.d = mVar3;
        this.G = jVar;
        this.f21628e = aVar;
        this.F = xaVar2;
        this.h = j3;
        this.f21630n = qVar;
        this.f21631r = mVar2;
        this.f21634x = aVar2;
        boolean z10 = true;
        this.f21635y = new p(cVar, fVar, mVar2);
        int i14 = 0;
        aVar2.getClass();
        g0 g0Var = i0.f14032b;
        t1 t1Var = t1.f14100e;
        this.K = new x2.n(t1Var, t1Var);
        p2.h b10 = cVar.b(i10);
        List list = b10.d;
        this.N = list;
        List list2 = b10.f55155c;
        int size = list2.size();
        HashMap hashMap = new HashMap(h9.o.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((p2.a) list2.get(i15)).f55117a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            p2.a aVar3 = (p2.a) list2.get(i16);
            List list3 = aVar3.f55120e;
            List list4 = aVar3.f55121f;
            boolean z11 = z10;
            p2.f d2 = d("http://dashif.org/guidelines/trickmode", list3);
            d2 = d2 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d2;
            int intValue = (d2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(d2.f55148b)))) == null || !a(aVar3, (p2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (d = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = d.f55148b;
                String str2 = l0.f13812a;
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
            int[] f10 = k1.f((Collection) arrayList.get(i18));
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
                List list7 = ((p2.a) list2.get(iArr3[i21])).f55119c;
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
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f55147a)) {
                            t tVar = new t();
                            tVar.f10743r = s0.n("application/cea-608");
                            tVar.f10728a = p0.r(new StringBuilder(), aVar4.f55117a, ":cea608");
                            uVarArr2 = l(fVar2, S, new u(tVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f55147a)) {
                            t tVar2 = new t();
                            tVar2.f10743r = s0.n("application/cea-708");
                            tVar2.f10728a = p0.r(new StringBuilder(), aVar4.f55117a, ":cea708");
                            uVarArr2 = l(fVar2, T, new u(tVar2));
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
                arrayList3.addAll(((p2.a) list2.get(i28)).f55119c);
            }
            int size4 = arrayList3.size();
            u[] uVarArr5 = new u[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                u uVar = ((p2.m) arrayList3.get(i29)).f55166a;
                int i31 = i26;
                t a10 = uVar.a();
                a10.S = mVar3.E1(uVar);
                uVarArr5[i29] = new u(a10);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            p2.a aVar5 = (p2.a) list2.get(iArr7[0]);
            long j10 = aVar5.f55117a;
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
            j(xaVar, uVarArr5);
            List list9 = list2;
            m1VarArr[i33] = new m1(i11, uVarArr5);
            int i35 = aVar5.f55118b;
            g0 g0Var2 = i0.f14032b;
            t1 t1Var2 = t1.f14100e;
            a aVar6 = new a(i35, 0, iArr7, i33, i34, i12, -1, t1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar6;
            int i37 = -1;
            if (i34 != -1) {
                String v = p5.c.v(i11, ":emsg");
                t tVar3 = new t();
                tVar3.f10728a = v;
                tVar3.f10743r = s0.n("application/x-emsg");
                tVar3.f10737l = i11;
                u[] uVarArr6 = new u[z12];
                uVarArr6[0] = new u(tVar3);
                m1VarArr[i34] = new m1(v, uVarArr6);
                a aVar7 = new a(5, 1, iArr8, i36, -1, -1, -1, t1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar7;
                i37 = -1;
            }
            if (i12 != i37) {
                String v10 = p5.c.v(i11, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, i0.r(uVarArr4[i27]));
                j(xaVar, uVarArr4[i27]);
                int i38 = 0;
                while (true) {
                    u[] uVarArr7 = uVarArr4[i27];
                    if (i38 >= uVarArr7.length) {
                        break;
                    }
                    t a11 = uVarArr7[i38].a();
                    a11.f10737l = i11;
                    uVarArr7[i38] = new u(a11);
                    i38++;
                }
                m1VarArr[i12] = new m1(v10, uVarArr4[i27]);
            }
            i27++;
            size2 = i32;
            mVar3 = mVar;
            i26 = i13;
            list2 = list9;
            z12 = true;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            p2.g gVar = (p2.g) list.get(i39);
            t tVar4 = new t();
            tVar4.f10728a = gVar.a();
            tVar4.f10743r = s0.n("application/x-emsg");
            m1VarArr[i26] = new m1(gVar.a() + ":" + i39, new u(tVar4));
            g0 g0Var3 = i0.f14032b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, t1.f14100e);
            i39++;
            i26++;
        }
        Pair create = Pair.create(new r1(m1VarArr), aVarArr);
        this.f21632s = (r1) create.first;
        this.f21633w = (a[]) create.second;
        this.Q = Long.MIN_VALUE;
    }

    public static boolean a(p2.a aVar, p2.a aVar2) {
        int i7 = aVar.f55118b;
        List list = aVar.f55119c;
        int i10 = aVar2.f55118b;
        List list2 = aVar2.f55119c;
        if (i7 == i10) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                u uVar = ((p2.m) list.get(0)).f55166a;
                u uVar2 = ((p2.m) list2.get(0)).f55166a;
                int i11 = uVar.f10783f & (-16385);
                int i12 = uVar2.f10783f & (-16385);
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
            if (str.equals(fVar.f55147a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void j(xa xaVar, u[] uVarArr) {
        String str;
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            u uVar = uVarArr[i7];
            w0 w0Var = (w0) xaVar.d;
            if (w0Var.f3366a && ((nb.a) w0Var.f3368c).H(uVar)) {
                t a10 = uVar.a();
                String str2 = uVar.f10787k;
                a10.f10743r = s0.n("application/x-media3-cues");
                a10.P = ((nb.a) w0Var.f3368c).O(uVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uVar.f10795s);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a10.f10735j = sb2.toString();
                a10.f10747w = Long.MAX_VALUE;
                uVar = new u(a10);
            }
            uVarArr[i7] = uVar;
        }
    }

    public static u[] l(p2.f fVar, Pattern pattern, u uVar) {
        String str = fVar.f55148b;
        if (str == null) {
            return new u[]{uVar};
        }
        String str2 = l0.f13812a;
        String[] split = str.split(";", -1);
        u[] uVarArr = new u[split.length];
        for (int i7 = 0; i7 < split.length; i7++) {
            Matcher matcher = pattern.matcher(split[i7]);
            if (!matcher.matches()) {
                return new u[]{uVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            t a10 = uVar.a();
            a10.f10728a = uVar.f10779a + ":" + parseInt;
            a10.O = parseInt;
            a10.d = matcher.group(2);
            uVarArr[i7] = new u(a10);
        }
        return uVarArr;
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
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
        t1 t1Var;
        int i13;
        o oVar;
        u[] uVarArr2;
        long a10;
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
                iArr3[i15] = this.f21632s.b(uVar.c());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        for (int i16 = 0; i16 < uVarArr3.length; i16++) {
            if (uVarArr3[i16] == null || !zArr[i16]) {
                ?? r42 = d1VarArr[i16];
                if (r42 instanceof y2.i) {
                    ((y2.i) r42).D(this);
                } else if (r42 instanceof y2.g) {
                    y2.g gVar = (y2.g) r42;
                    y2.i iVar = gVar.f60732e;
                    boolean[] zArr3 = iVar.d;
                    int i17 = gVar.f60731c;
                    la.p(zArr3[i17]);
                    iVar.d[i17] = false;
                }
                d1VarArr[i16] = 0;
            }
        }
        int i18 = 0;
        while (true) {
            z10 = true;
            if (i18 >= uVarArr3.length) {
                break;
            }
            ?? r43 = d1VarArr[i18];
            if ((r43 instanceof r) || (r43 instanceof y2.g)) {
                int h = h(iArr3, i18);
                if (h == -1) {
                    z14 = d1VarArr[i18] instanceof r;
                } else {
                    ?? r10 = d1VarArr[i18];
                    z14 = ((r10 instanceof y2.g) && ((y2.g) r10).f60729a == d1VarArr[h]) ? false : false;
                }
                if (!z14) {
                    ?? r44 = d1VarArr[i18];
                    if (r44 instanceof y2.g) {
                        y2.g gVar2 = (y2.g) r44;
                        y2.i iVar2 = gVar2.f60732e;
                        boolean[] zArr4 = iVar2.d;
                        int i19 = gVar2.f60731c;
                        la.p(zArr4[i19]);
                        iVar2.d[i19] = false;
                    }
                    d1VarArr[i18] = 0;
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
                ?? r102 = d1VarArr[i20];
                if (r102 == 0) {
                    zArr2[i20] = z10;
                    a aVar = this.f21633w[iArr3[i20]];
                    int i21 = aVar.f21621c;
                    if (i21 == 0) {
                        int i22 = aVar.f21623f;
                        if (i22 != i7) {
                            z12 = z10;
                        } else {
                            z12 = i14;
                        }
                        if (z12 != 0) {
                            m1Var = this.f21632s.a(i22);
                            i12 = z10;
                        } else {
                            i12 = i14;
                            m1Var = null;
                        }
                        int i23 = aVar.f21624g;
                        if (i23 != i7) {
                            t1Var = this.f21633w[i23].h;
                        } else {
                            g0 g0Var = i0.f14032b;
                            t1Var = t1.f14100e;
                        }
                        int size = t1Var.size() + i12;
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
                        while (i25 < t1Var.size()) {
                            u uVar3 = (u) t1Var.get(i25);
                            uVarArr4[i26] = uVar3;
                            iArr4[i26] = 3;
                            arrayList.add(uVar3);
                            i25++;
                            i26++;
                        }
                        if (this.L.d && z12 != 0) {
                            p pVar = this.f21635y;
                            oVar = new o(pVar, pVar.f21696a);
                        } else {
                            oVar = null;
                        }
                        p2.c cVar = this.L;
                        int i27 = this.M;
                        i c10 = ((p2.m) ((p2.a) cVar.b(i27).f55155c.get(aVar.f21619a[i14])).f55119c.get(i14)).c();
                        if (c10 == null) {
                            a10 = -9223372036854775807L;
                            uVarArr2 = uVarArr4;
                        } else {
                            uVarArr2 = uVarArr4;
                            a10 = c10.a(c10.o(j3, cVar.d(i27)));
                        }
                        long j10 = a10;
                        if (this.O) {
                            p2.c cVar2 = this.L;
                            int i28 = this.M;
                            int[] iArr5 = aVar.f21619a;
                            List list = cVar2.b(i28).f55155c;
                            f0 p10 = i0.p();
                            int length = iArr5.length;
                            int i29 = 0;
                            while (i29 < length) {
                                int i30 = i29;
                                p10.d(((p2.a) list.get(iArr5[i30])).f55119c);
                                i29 = i30 + 1;
                            }
                            t1 f10 = p10.f();
                            for (int i31 = 0; i31 < uVar2.length(); i31++) {
                                u uVar4 = ((p2.m) f10.get(uVar2.i(i31))).f55166a;
                                if (!s0.a(uVar4.f10795s, uVar4.f10787k)) {
                                    z13 = z15;
                                    break;
                                }
                            }
                        }
                        z13 = false;
                        xa xaVar = this.f21626b;
                        q qVar = this.f21630n;
                        p2.c cVar3 = this.L;
                        xi.e eVar = this.f21629f;
                        int[] iArr6 = iArr3;
                        int i32 = this.M;
                        int[] iArr7 = aVar.f21619a;
                        int i33 = aVar.f21620b;
                        long j11 = this.h;
                        c0 c0Var = this.f21627c;
                        j2.h createDataSource = ((j2.g) xaVar.f714c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i11 = i24;
                        y2.i iVar3 = new y2.i(aVar.f21620b, iArr4, uVarArr2, new l((w0) xaVar.d, qVar, cVar3, eVar, i32, iArr7, uVar2, i33, createDataSource, j11, xaVar.f713b, z12, arrayList, oVar), this, this.f21631r, j3, this.d, this.G, this.f21628e, this.F, z13, j10, null);
                        long j12 = this.Q;
                        iVar3.f60743y.K(j12);
                        for (c1 c1Var : iVar3.E) {
                            c1Var.K(j12);
                        }
                        synchronized (this) {
                            this.E.put(iVar3, oVar2);
                        }
                        d1VarArr[i11] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i20;
                        if (i21 == 2) {
                            i10 = 0;
                            d1VarArr[i11] = new m((p2.g) this.N.get(aVar.d), uVar2.c().d[0], this.L.d);
                        }
                    }
                    i10 = 0;
                } else {
                    iArr2 = iArr3;
                    i10 = i14;
                    i11 = i20;
                    if (r102 instanceof y2.i) {
                        ((y2.i) r102).f60736e.f21679j = uVar2;
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
            if (d1VarArr[i14] == 0 && uVarArr[i14] != null) {
                iArr = iArr8;
                a aVar2 = this.f21633w[iArr[i14]];
                if (aVar2.f21621c == 1) {
                    int h7 = h(iArr, i14);
                    if (h7 == -1) {
                        d1VarArr[i14] = new Object();
                    } else {
                        y2.i iVar4 = (y2.i) d1VarArr[h7];
                        int i34 = aVar2.f21620b;
                        boolean[] zArr5 = iVar4.d;
                        c1[] c1VarArr = iVar4.E;
                        for (int i35 = r13 == true ? 1 : 0; i35 < c1VarArr.length; i35++) {
                            if (iVar4.f60734b[i35] == i34) {
                                la.p(!zArr5[i35]);
                                zArr5[i35] = true;
                                c1VarArr[i35].J(j3, true);
                                d1VarArr[i14] = new y2.g(iVar4, iVar4, c1VarArr[i35], i35);
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
        int length2 = d1VarArr.length;
        for (int i36 = r13 == true ? 1 : 0; i36 < length2; i36++) {
            ?? r62 = d1VarArr[i36];
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
        nb.a aVar3 = this.f21634x;
        AbstractList y10 = h9.o.y(arrayList2, new a0(7));
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
    public final void c0(f1 f1Var) {
        this.H.c0(this);
    }

    @Override
    public final long e() {
        return this.K.e();
    }

    @Override
    public final long f(long r20, l2.p1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.b.f(long, l2.p1):long");
    }

    @Override
    public final boolean g() {
        return this.K.g();
    }

    public final int h(int[] iArr, int i7) {
        int i10 = iArr[i7];
        if (i10 != -1) {
            a[] aVarArr = this.f21633w;
            int i11 = aVarArr[i10].f21622e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && aVarArr[i13].f21621c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override
    public final void i() {
        this.f21630n.a();
    }

    @Override
    public final long k(long j3) {
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
            c1[] c1VarArr = iVar.E;
            c1 c1Var = iVar.f60743y;
            b3.p pVar = iVar.f60739r;
            ?? r14 = iVar.f60741w;
            iVar.K = j3;
            iVar.N = z12;
            iVar.O = z12;
            if (iVar.y()) {
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
                        if (i12 == 0 && aVar.f60700w == -9223372036854775807L) {
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
                    J = c1Var.I(aVar.d(0));
                } else {
                    long e10 = iVar.e();
                    if (e10 != Long.MIN_VALUE && j3 >= e10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    J = c1Var.J(j3, z10);
                }
                if (J && (aVar2 = iVar.M) != null) {
                    i10 = 0;
                    if (aVar2.d(0) <= c1Var.v()) {
                        J = false;
                    }
                } else {
                    i10 = 0;
                }
                if (J) {
                    iVar.L = iVar.C(c1Var.v(), i10);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.J(j3, true);
                    }
                } else {
                    iVar.J = j3;
                    iVar.Q = false;
                    r14.clear();
                    iVar.L = 0;
                    if (pVar.d()) {
                        c1Var.l();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.l();
                        }
                        pVar.b();
                    } else {
                        pVar.f2928c = null;
                        z11 = false;
                        c1Var.G(false);
                        for (c1 c1Var4 : iVar.E) {
                            c1Var4.G(false);
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
            int b10 = l0.b(mVar.f21686c, j3, true);
            mVar.h = b10;
            if (mVar.d && b10 == mVar.f21686c.length) {
                j10 = j3;
            } else {
                j10 = -9223372036854775807L;
            }
            mVar.f21689n = j10;
        }
        return j3;
    }

    @Override
    public final void n(long j3) {
        y2.i[] iVarArr;
        long j10;
        for (y2.i iVar : this.I) {
            if (!iVar.y()) {
                c1 c1Var = iVar.f60743y;
                int i7 = c1Var.f60105q;
                c1Var.k(j3, true);
                c1 c1Var2 = iVar.f60743y;
                int i10 = c1Var2.f60105q;
                if (i10 > i7) {
                    synchronized (c1Var2) {
                        if (c1Var2.f60104p == 0) {
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = c1Var2.f60102n[c1Var2.f60106r];
                        }
                    }
                    int i11 = 0;
                    while (true) {
                        c1[] c1VarArr = iVar.E;
                        if (i11 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i11].k(j10, iVar.d[i11]);
                        i11++;
                    }
                }
                int min = Math.min(iVar.C(i10, 0), iVar.L);
                if (min > 0) {
                    l0.X(0, min, iVar.f60741w);
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
    public final r1 q() {
        return this.f21632s;
    }

    @Override
    public final long r() {
        return this.K.r();
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        this.H = d0Var;
        d0Var.m(this);
    }

    @Override
    public final void u(long j3) {
        int i7;
        y2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            y2.i iVar = iVarArr[i10];
            if (!iVar.f60739r.d()) {
                long d = this.L.d(this.M);
                c1 c1Var = iVar.f60743y;
                la.p(!iVar.f60739r.d());
                if (!iVar.y() && d != -9223372036854775807L && !iVar.f60741w.isEmpty()) {
                    y2.a w10 = iVar.w();
                    long j10 = w10.f60701x;
                    if (j10 == -9223372036854775807L) {
                        j10 = w10.f60727n;
                    }
                    if (j10 > d) {
                        long s5 = c1Var.s();
                        if (s5 > d) {
                            c1Var.m(Math.max(d, c1Var.t() + 1));
                            c1[] c1VarArr = iVar.E;
                            int length2 = c1VarArr.length;
                            int i11 = 0;
                            while (i11 < length2) {
                                c1 c1Var2 = c1VarArr[i11];
                                c1Var2.m(Math.max(d, c1Var2.t() + 1));
                                i11++;
                                i10 = i10;
                            }
                            i7 = i10;
                            iVar.h.B(d, iVar.f60733a, s5);
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
