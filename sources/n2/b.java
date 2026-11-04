package n2;

import a3.q;
import a3.r;
import android.support.v4.media.session.a0;
import android.util.Pair;
import android.util.SparseArray;
import b8.kg;
import b8.od;
import b8.zb;
import cg.v0;
import d2.o1;
import d2.u;
import d2.u0;
import d2.v;
import g2.n0;
import g9.f0;
import g9.g0;
import g9.i0;
import g9.s1;
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
import k2.p1;
import w2.c1;
import w2.d0;
import w2.d1;
import w2.e0;
import w2.e1;
import w2.f1;
import w2.r1;
public final class b implements e0, e1, x2.h {
    public static final Pattern S = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern T = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kg F;
    public final p2.j G;
    public d0 H;
    public w2.n K;
    public o2.c L;
    public int M;
    public List N;
    public long P;
    public final long Q;
    public boolean R;
    public final int f20134a;
    public final kg f20135b;
    public final i2.d0 f20136c;
    public final p2.m d;
    public final kb.a f20137e;
    public final za.p f20138f;
    public final long h;
    public final r f20139n;
    public final a0 f20140r;
    public final r1 f20141s;
    public final a[] f20142w;
    public final ra.e f20143x;
    public final p f20144y;
    public boolean O = true;
    public x2.i[] I = new x2.i[0];
    public m[] J = new m[0];
    public final IdentityHashMap E = new IdentityHashMap();

    public b(int i3, o2.c cVar, za.p pVar, int i10, kg kgVar, i2.d0 d0Var, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar2, long j10, r rVar, a0 a0Var, ra.e eVar, f fVar, l2.k kVar) {
        String i11;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        v[][] vVarArr;
        v[] vVarArr2;
        o2.f f10;
        Integer num;
        p2.m mVar2 = mVar;
        this.f20134a = i3;
        this.L = cVar;
        this.f20138f = pVar;
        this.M = i10;
        this.f20135b = kgVar;
        this.f20136c = d0Var;
        this.d = mVar2;
        this.G = jVar;
        this.f20137e = aVar;
        this.F = kgVar2;
        this.h = j10;
        this.f20139n = rVar;
        this.f20140r = a0Var;
        this.f20143x = eVar;
        boolean z10 = true;
        this.f20144y = new p(cVar, fVar, a0Var);
        int i14 = 0;
        eVar.getClass();
        g0 g0Var = i0.f12083b;
        s1 s1Var = s1.f12146e;
        this.K = new w2.n(s1Var, s1Var);
        o2.h b10 = cVar.b(i10);
        List list = b10.d;
        this.N = list;
        List list2 = b10.f20542c;
        int size = list2.size();
        HashMap hashMap = new HashMap(g9.o.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((o2.a) list2.get(i15)).f20504a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            o2.a aVar2 = (o2.a) list2.get(i16);
            List list3 = aVar2.f20507e;
            List list4 = aVar2.f20508f;
            boolean z11 = z10;
            o2.f f11 = f("http://dashif.org/guidelines/trickmode", list3);
            f11 = f11 == null ? f("http://dashif.org/guidelines/trickmode", list4) : f11;
            int intValue = (f11 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(f11.f20535b)))) == null || !a(aVar2, (o2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (f10 = f("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = f10.f20535b;
                String str2 = n0.f11873a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i17])));
                    if (num2 != null && a(aVar2, (o2.a) list2.get(num2.intValue()))) {
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
            int[] f12 = od.f((Collection) arrayList.get(i18));
            iArr2[i18] = f12;
            Arrays.sort(f12);
        }
        boolean[] zArr2 = new boolean[size2];
        v[][] vVarArr3 = new v[size2];
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
                List list7 = ((o2.a) list2.get(iArr3[i21])).f20506c;
                iArr = iArr2;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((o2.m) list7.get(i22)).d.isEmpty()) {
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
                    o2.a aVar3 = (o2.a) list2.get(i24);
                    List list8 = ((o2.a) list2.get(i24)).d;
                    int[] iArr5 = iArr4;
                    int i25 = 0;
                    while (i25 < list8.size()) {
                        o2.f fVar2 = (o2.f) list8.get(i25);
                        zArr = zArr2;
                        vVarArr = vVarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f20534a)) {
                            u uVar = new u();
                            uVar.f8431r = u0.n("application/cea-608");
                            uVar.f8416a = a1.g.r(new StringBuilder(), aVar3.f20504a, ":cea608");
                            vVarArr2 = o(fVar2, S, new v(uVar));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f20534a)) {
                            u uVar2 = new u();
                            uVar2.f8431r = u0.n("application/cea-708");
                            uVar2.f8416a = a1.g.r(new StringBuilder(), aVar3.f20504a, ":cea708");
                            vVarArr2 = o(fVar2, T, new v(uVar2));
                            break;
                        } else {
                            i25++;
                            vVarArr3 = vVarArr;
                            zArr2 = zArr;
                        }
                    }
                    i23++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    vVarArr = vVarArr3;
                    vVarArr2 = new v[0];
                    break;
                }
            }
            vVarArr[i19] = vVarArr2;
            if (vVarArr2.length != 0) {
                i20++;
            }
            i19++;
            vVarArr3 = vVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        v[][] vVarArr4 = vVarArr3;
        int size3 = list.size() + i20 + size2;
        o1[] o1VarArr = new o1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((o2.a) list2.get(i28)).f20506c);
            }
            int size4 = arrayList3.size();
            v[] vVarArr5 = new v[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                v vVar = ((o2.m) arrayList3.get(i29)).f20553a;
                int i31 = i26;
                u a10 = vVar.a();
                a10.S = mVar2.u(vVar);
                vVarArr5[i29] = new v(a10);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            o2.a aVar4 = (o2.a) list2.get(iArr7[0]);
            long j11 = aVar4.f20504a;
            if (j11 != -1) {
                i11 = Long.toString(j11);
            } else {
                i11 = p1.i(i27, "unset:");
            }
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (vVarArr4[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            m(kgVar, vVarArr5);
            List list9 = list2;
            o1VarArr[i33] = new o1(i11, vVarArr5);
            int i35 = aVar4.f20505b;
            g0 g0Var2 = i0.f12083b;
            s1 s1Var2 = s1.f12146e;
            a aVar5 = new a(i35, 0, iArr7, i33, i34, i12, -1, s1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar5;
            int i37 = -1;
            if (i34 != -1) {
                String q10 = t4.c.q(i11, ":emsg");
                u uVar3 = new u();
                uVar3.f8416a = q10;
                uVar3.f8431r = u0.n("application/x-emsg");
                uVar3.f8425l = i11;
                v[] vVarArr6 = new v[z12];
                vVarArr6[0] = new v(uVar3);
                o1VarArr[i34] = new o1(q10, vVarArr6);
                a aVar6 = new a(5, 1, iArr8, i36, -1, -1, -1, s1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar6;
                i37 = -1;
            }
            if (i12 != i37) {
                String q11 = t4.c.q(i11, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, i0.r(vVarArr4[i27]));
                m(kgVar, vVarArr4[i27]);
                int i38 = 0;
                while (true) {
                    v[] vVarArr7 = vVarArr4[i27];
                    if (i38 >= vVarArr7.length) {
                        break;
                    }
                    u a11 = vVarArr7[i38].a();
                    a11.f8425l = i11;
                    vVarArr7[i38] = new v(a11);
                    i38++;
                }
                o1VarArr[i12] = new o1(q11, vVarArr4[i27]);
            }
            i27++;
            size2 = i32;
            mVar2 = mVar;
            i26 = i13;
            list2 = list9;
            z12 = true;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            o2.g gVar = (o2.g) list.get(i39);
            u uVar4 = new u();
            uVar4.f8416a = gVar.a();
            uVar4.f8431r = u0.n("application/x-emsg");
            o1VarArr[i26] = new o1(gVar.a() + ":" + i39, new v(uVar4));
            g0 g0Var3 = i0.f12083b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, s1.f12146e);
            i39++;
            i26++;
        }
        Pair create = Pair.create(new r1(o1VarArr), aVarArr);
        this.f20141s = (r1) create.first;
        this.f20142w = (a[]) create.second;
        this.Q = Long.MIN_VALUE;
    }

    public static boolean a(o2.a aVar, o2.a aVar2) {
        int i3 = aVar.f20505b;
        List list = aVar.f20506c;
        int i10 = aVar2.f20505b;
        List list2 = aVar2.f20506c;
        if (i3 == i10) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                v vVar = ((o2.m) list.get(0)).f20553a;
                v vVar2 = ((o2.m) list2.get(0)).f20553a;
                int i11 = vVar.f8477f & (-16385);
                int i12 = vVar2.f8477f & (-16385);
                if (Objects.equals(vVar.d, vVar2.d) && i11 == i12) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static o2.f f(String str, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            o2.f fVar = (o2.f) list.get(i3);
            if (str.equals(fVar.f20534a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void m(kg kgVar, v[] vVarArr) {
        String str;
        for (int i3 = 0; i3 < vVarArr.length; i3++) {
            v vVar = vVarArr[i3];
            v0 v0Var = (v0) kgVar.d;
            if (v0Var.f4757a && ((mb.b) v0Var.f4759c).l(vVar)) {
                u a10 = vVar.a();
                String str2 = vVar.f8481k;
                a10.f8431r = u0.n("application/x-media3-cues");
                a10.P = ((mb.b) v0Var.f4759c).q0(vVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(vVar.f8489s);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb2.append(str);
                a10.f8423j = sb2.toString();
                a10.f8435w = Long.MAX_VALUE;
                vVar = new v(a10);
            }
            vVarArr[i3] = vVar;
        }
    }

    public static v[] o(o2.f fVar, Pattern pattern, v vVar) {
        String str = fVar.f20535b;
        if (str == null) {
            return new v[]{vVar};
        }
        String str2 = n0.f11873a;
        String[] split = str.split(";", -1);
        v[] vVarArr = new v[split.length];
        for (int i3 = 0; i3 < split.length; i3++) {
            Matcher matcher = pattern.matcher(split[i3]);
            if (!matcher.matches()) {
                return new v[]{vVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            u a10 = vVar.a();
            a10.f8416a = vVar.f8473a + ":" + parseInt;
            a10.O = parseInt;
            a10.d = matcher.group(2);
            vVarArr[i3] = new v(a10);
        }
        return vVarArr;
    }

    @Override
    public final boolean c(k2.v0 v0Var) {
        return this.K.c(v0Var);
    }

    @Override
    public final boolean d() {
        return this.K.d();
    }

    @Override
    public final long e() {
        return this.K.e();
    }

    @Override
    public final void g() {
        this.f20139n.a();
    }

    public final int h(int[] iArr, int i3) {
        int i10 = iArr[i3];
        if (i10 != -1) {
            a[] aVarArr = this.f20142w;
            int i11 = aVarArr[i10].f20131e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && aVarArr[i13].f20130c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override
    public final void i(d0 d0Var, long j10) {
        this.H = d0Var;
        d0Var.b(this);
    }

    @Override
    public final long j(long j10) {
        long j11;
        int i3;
        x2.a aVar;
        boolean z10;
        boolean J;
        int i10;
        boolean z11;
        x2.a aVar2;
        x2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        boolean z12 = false;
        int i11 = 0;
        while (i11 < length) {
            x2.i iVar = iVarArr[i11];
            c1[] c1VarArr = iVar.E;
            c1 c1Var = iVar.f58169y;
            q qVar = iVar.f58165r;
            ?? r14 = iVar.f58167w;
            iVar.K = j10;
            iVar.N = z12;
            iVar.O = z12;
            if (iVar.x()) {
                iVar.J = j10;
                z11 = z12;
                i3 = i11;
            } else {
                ?? r15 = z12;
                while (true) {
                    if (r15 < r14.size()) {
                        aVar = (x2.a) r14.get(r15);
                        int i12 = (aVar.h > j10 ? 1 : (aVar.h == j10 ? 0 : -1));
                        i3 = i11;
                        if (i12 == 0 && aVar.f58126w == -9223372036854775807L) {
                            break;
                        } else if (i12 > 0) {
                            break;
                        } else {
                            r15++;
                            i11 = i3;
                        }
                    } else {
                        i3 = i11;
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    J = c1Var.I(aVar.d(0));
                } else {
                    long e10 = iVar.e();
                    if (e10 != Long.MIN_VALUE && j10 >= e10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    J = c1Var.J(j10, z10);
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
                    iVar.L = iVar.A(c1Var.v(), i10);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.J(j10, true);
                    }
                } else {
                    iVar.J = j10;
                    iVar.Q = false;
                    r14.clear();
                    iVar.L = 0;
                    if (qVar.d()) {
                        c1Var.l();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.l();
                        }
                        qVar.b();
                    } else {
                        qVar.f109c = null;
                        z11 = false;
                        c1Var.G(false);
                        for (c1 c1Var4 : iVar.E) {
                            c1Var4.G(false);
                        }
                    }
                }
                z11 = false;
            }
            i11 = i3 + 1;
            z12 = z11;
        }
        m[] mVarArr = this.J;
        int length2 = mVarArr.length;
        for (int i13 = z12; i13 < length2; i13++) {
            m mVar = mVarArr[i13];
            int b10 = n0.b(mVar.f20195c, j10, true);
            mVar.h = b10;
            if (mVar.d && b10 == mVar.f20195c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            mVar.f20198n = j11;
        }
        return j10;
    }

    @Override
    public final void k(f1 f1Var) {
        this.H.k(this);
    }

    @Override
    public final void l(long j10) {
        x2.i[] iVarArr;
        long j11;
        for (x2.i iVar : this.I) {
            if (!iVar.x()) {
                c1 c1Var = iVar.f58169y;
                int i3 = c1Var.f57057q;
                c1Var.k(j10, true);
                c1 c1Var2 = iVar.f58169y;
                int i10 = c1Var2.f57057q;
                if (i10 > i3) {
                    synchronized (c1Var2) {
                        if (c1Var2.f57056p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = c1Var2.f57054n[c1Var2.f57058r];
                        }
                    }
                    int i11 = 0;
                    while (true) {
                        c1[] c1VarArr = iVar.E;
                        if (i11 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i11].k(j11, iVar.d[i11]);
                        i11++;
                    }
                }
                int min = Math.min(iVar.A(i10, 0), iVar.L);
                if (min > 0) {
                    n0.X(0, min, iVar.f58167w);
                    iVar.L -= min;
                }
            }
        }
    }

    @Override
    public final long n() {
        x2.i[] iVarArr;
        if (this.R) {
            boolean z10 = false;
            for (x2.i iVar : this.I) {
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
            x2.i[] iVarArr2 = this.I;
            int length = iVarArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (iVarArr2[i3].y()) {
                        break;
                    }
                    i3++;
                } else {
                    this.R = false;
                    for (x2.i iVar2 : this.I) {
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
    public final r1 p() {
        return this.f20141s;
    }

    @Override
    public final long q() {
        return this.K.q();
    }

    @Override
    public final long r(long r20, k2.t1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.r(long, k2.t1):long");
    }

    @Override
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        int i3;
        boolean z10;
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11;
        boolean z12;
        int i12;
        o1 o1Var;
        s1 s1Var;
        int i13;
        o oVar;
        v[] vVarArr;
        long b10;
        boolean z13;
        boolean z14;
        z2.p[] pVarArr2 = pVarArr;
        int[] iArr3 = new int[pVarArr2.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i3 = -1;
            if (i15 >= pVarArr2.length) {
                break;
            }
            z2.p pVar = pVarArr2[i15];
            if (pVar != null) {
                iArr3[i15] = this.f20141s.b(pVar.b());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        for (int i16 = 0; i16 < pVarArr2.length; i16++) {
            if (pVarArr2[i16] == null || !zArr[i16]) {
                ?? r42 = d1VarArr[i16];
                if (r42 instanceof x2.i) {
                    ((x2.i) r42).B(this);
                } else if (r42 instanceof x2.g) {
                    x2.g gVar = (x2.g) r42;
                    x2.i iVar = gVar.f58158e;
                    boolean[] zArr3 = iVar.d;
                    int i17 = gVar.f58157c;
                    zb.p(zArr3[i17]);
                    iVar.d[i17] = false;
                }
                d1VarArr[i16] = 0;
            }
        }
        int i18 = 0;
        while (true) {
            z10 = true;
            if (i18 >= pVarArr2.length) {
                break;
            }
            ?? r43 = d1VarArr[i18];
            if ((r43 instanceof w2.r) || (r43 instanceof x2.g)) {
                int h = h(iArr3, i18);
                if (h == -1) {
                    z14 = d1VarArr[i18] instanceof w2.r;
                } else {
                    ?? r10 = d1VarArr[i18];
                    z14 = ((r10 instanceof x2.g) && ((x2.g) r10).f58155a == d1VarArr[h]) ? false : false;
                }
                if (!z14) {
                    ?? r44 = d1VarArr[i18];
                    if (r44 instanceof x2.g) {
                        x2.g gVar2 = (x2.g) r44;
                        x2.i iVar2 = gVar2.f58158e;
                        boolean[] zArr4 = iVar2.d;
                        int i19 = gVar2.f58157c;
                        zb.p(zArr4[i19]);
                        iVar2.d[i19] = false;
                    }
                    d1VarArr[i18] = 0;
                }
            }
            i18++;
        }
        int i20 = 0;
        while (i20 < pVarArr2.length) {
            z2.p pVar2 = pVarArr2[i20];
            if (pVar2 == null) {
                iArr2 = iArr3;
                i10 = i14;
                i11 = i20;
            } else {
                ?? r102 = d1VarArr[i20];
                if (r102 == 0) {
                    zArr2[i20] = z10;
                    a aVar = this.f20142w[iArr3[i20]];
                    int i21 = aVar.f20130c;
                    if (i21 == 0) {
                        int i22 = aVar.f20132f;
                        if (i22 != i3) {
                            z12 = z10;
                        } else {
                            z12 = i14;
                        }
                        if (z12 != 0) {
                            o1Var = this.f20141s.a(i22);
                            i12 = z10;
                        } else {
                            i12 = i14;
                            o1Var = null;
                        }
                        int i23 = aVar.f20133g;
                        if (i23 != i3) {
                            s1Var = this.f20142w[i23].h;
                        } else {
                            g0 g0Var = i0.f12083b;
                            s1Var = s1.f12146e;
                        }
                        int size = s1Var.size() + i12;
                        int i24 = i20;
                        v[] vVarArr2 = new v[size];
                        int[] iArr4 = new int[size];
                        if (z12 != 0) {
                            vVarArr2[i14] = o1Var.d[i14];
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
                            v vVar = (v) s1Var.get(i25);
                            vVarArr2[i26] = vVar;
                            iArr4[i26] = 3;
                            arrayList.add(vVar);
                            i25++;
                            i26++;
                        }
                        if (this.L.d && z12 != 0) {
                            p pVar3 = this.f20144y;
                            oVar = new o(pVar3, pVar3.f20205a);
                        } else {
                            oVar = null;
                        }
                        o2.c cVar = this.L;
                        int i27 = this.M;
                        i c2 = ((o2.m) ((o2.a) cVar.b(i27).f20542c.get(aVar.f20128a[i14])).f20506c.get(i14)).c();
                        if (c2 == null) {
                            b10 = -9223372036854775807L;
                            vVarArr = vVarArr2;
                        } else {
                            vVarArr = vVarArr2;
                            b10 = c2.b(c2.s(j10, cVar.d(i27)));
                        }
                        long j11 = b10;
                        if (this.O) {
                            o2.c cVar2 = this.L;
                            int i28 = this.M;
                            int[] iArr5 = aVar.f20128a;
                            List list = cVar2.b(i28).f20542c;
                            f0 p10 = i0.p();
                            int length = iArr5.length;
                            int i29 = 0;
                            while (i29 < length) {
                                int i30 = i29;
                                p10.d(((o2.a) list.get(iArr5[i30])).f20506c);
                                i29 = i30 + 1;
                            }
                            s1 f10 = p10.f();
                            for (int i31 = 0; i31 < pVar2.length(); i31++) {
                                v vVar2 = ((o2.m) f10.get(pVar2.i(i31))).f20553a;
                                if (!u0.a(vVar2.f8489s, vVar2.f8481k)) {
                                    z13 = z15;
                                    break;
                                }
                            }
                        }
                        z13 = false;
                        kg kgVar = this.f20135b;
                        r rVar = this.f20139n;
                        o2.c cVar3 = this.L;
                        za.p pVar4 = this.f20138f;
                        int[] iArr6 = iArr3;
                        int i32 = this.M;
                        int[] iArr7 = aVar.f20128a;
                        int i33 = aVar.f20129b;
                        long j12 = this.h;
                        i2.d0 d0Var = this.f20136c;
                        i2.h createDataSource = ((i2.g) kgVar.f2723c).createDataSource();
                        if (d0Var != null) {
                            createDataSource.addTransferListener(d0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i11 = i24;
                        x2.i iVar3 = new x2.i(aVar.f20129b, iArr4, vVarArr, new l((v0) kgVar.d, rVar, cVar3, pVar4, i32, iArr7, pVar2, i33, createDataSource, j12, kgVar.f2722b, z12, arrayList, oVar), this, this.f20140r, j10, this.d, this.G, this.f20137e, this.F, z13, j11, null);
                        long j13 = this.Q;
                        iVar3.f58169y.K(j13);
                        for (c1 c1Var : iVar3.E) {
                            c1Var.K(j13);
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
                            d1VarArr[i11] = new m((o2.g) this.N.get(aVar.d), pVar2.b().d[0], this.L.d);
                        }
                    }
                    i10 = 0;
                } else {
                    iArr2 = iArr3;
                    i10 = i14;
                    i11 = i20;
                    if (r102 instanceof x2.i) {
                        ((x2.i) r102).f58162e.f20188j = pVar2;
                    }
                }
            }
            i20 = i11 + 1;
            pVarArr2 = pVarArr;
            i14 = i10;
            iArr3 = iArr2;
            i3 = -1;
            z10 = true;
        }
        int[] iArr8 = iArr3;
        ?? r13 = i14;
        while (i14 < pVarArr.length) {
            if (d1VarArr[i14] == 0 && pVarArr[i14] != null) {
                iArr = iArr8;
                a aVar2 = this.f20142w[iArr[i14]];
                if (aVar2.f20130c == 1) {
                    int h7 = h(iArr, i14);
                    if (h7 == -1) {
                        d1VarArr[i14] = new Object();
                    } else {
                        x2.i iVar4 = (x2.i) d1VarArr[h7];
                        int i34 = aVar2.f20129b;
                        boolean[] zArr5 = iVar4.d;
                        c1[] c1VarArr = iVar4.E;
                        for (int i35 = r13 == true ? 1 : 0; i35 < c1VarArr.length; i35++) {
                            if (iVar4.f58160b[i35] == i34) {
                                zb.p(!zArr5[i35]);
                                zArr5[i35] = true;
                                c1VarArr[i35].J(j10, true);
                                d1VarArr[i14] = new x2.g(iVar4, iVar4, c1VarArr[i35], i35);
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
            if (r62 instanceof x2.i) {
                arrayList2.add((x2.i) r62);
            } else if (r62 instanceof m) {
                arrayList3.add((m) r62);
            }
        }
        x2.i[] iVarArr = new x2.i[arrayList2.size()];
        this.I = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.J = mVarArr;
        arrayList3.toArray(mVarArr);
        ra.e eVar = this.f20143x;
        AbstractList y9 = g9.o.y(arrayList2, new l2.d(26));
        eVar.getClass();
        this.K = new w2.n(arrayList2, y9);
        if (this.O) {
            this.O = r13;
            this.P = j10;
            x2.i[] iVarArr2 = this.I;
            int length3 = iVarArr2.length;
            int i37 = r13 == true ? 1 : 0;
            while (true) {
                if (i37 < length3) {
                    if (iVarArr2[i37].y()) {
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
                x2.i[] iVarArr3 = this.I;
                int length4 = iVarArr3.length;
                for (int i38 = r13 == true ? 1 : 0; i38 < length4; i38++) {
                    iVarArr3[i38].P = true;
                }
            }
        }
        return j10;
    }

    @Override
    public final void t(long j10) {
        int i3;
        x2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            x2.i iVar = iVarArr[i10];
            if (!iVar.f58165r.d()) {
                long d = this.L.d(this.M);
                c1 c1Var = iVar.f58169y;
                zb.p(!iVar.f58165r.d());
                if (!iVar.x() && d != -9223372036854775807L && !iVar.f58167w.isEmpty()) {
                    x2.a v = iVar.v();
                    long j11 = v.f58127x;
                    if (j11 == -9223372036854775807L) {
                        j11 = v.f58153n;
                    }
                    if (j11 > d) {
                        long s6 = c1Var.s();
                        if (s6 > d) {
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
                            i3 = i10;
                            iVar.h.B(d, iVar.f58159a, s6);
                            i10 = i3 + 1;
                        }
                    }
                }
            }
            i3 = i10;
            i10 = i3 + 1;
        }
        this.K.t(j10);
    }
}
