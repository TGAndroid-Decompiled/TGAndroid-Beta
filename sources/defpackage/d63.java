package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class d63 implements xt6, h8a {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final lp F;
    public final mr3 G;
    public wt6 H;
    public er2 K;
    public z53 L;
    public int M;
    public List N;
    public boolean P;
    public long Q;
    public final long R;
    public boolean S;
    public final int a;
    public final qx6 b;
    public final v2c c;
    public final pr3 d;
    public final z6f e;
    public final u8a f;
    public final long h;
    public final ra6 n;
    public final rx6 r;
    public final u1c s;
    public final c63[] w;
    public final rg7 x;
    public final gg8 y;
    public boolean O = true;
    public wh2[] I = new wh2[0];
    public h54[] J = new h54[0];
    public final IdentityHashMap E = new IdentityHashMap();

    public d63(int i, z53 z53Var, u8a u8aVar, int i2, qx6 qx6Var, v2c v2cVar, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, long j, ra6 ra6Var, rx6 rx6Var, rg7 rg7Var, wz4 wz4Var, ig8 ig8Var) {
        String k;
        int i3;
        int[][] iArr;
        boolean[] zArr;
        ko4[][] ko4VarArr;
        ko4[] ko4VarArr2;
        te3 g;
        Integer num;
        qx6 qx6Var2 = qx6Var;
        pr3 pr3Var2 = pr3Var;
        this.a = i;
        this.L = z53Var;
        this.f = u8aVar;
        this.M = i2;
        this.b = qx6Var2;
        this.c = v2cVar;
        this.d = pr3Var2;
        this.G = mr3Var;
        this.e = z6fVar;
        this.F = lpVar;
        this.h = j;
        this.n = ra6Var;
        this.r = rx6Var;
        this.x = rg7Var;
        boolean z = true;
        this.y = new gg8(z53Var, wz4Var, rx6Var);
        int i4 = 0;
        rg7Var.getClass();
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        this.K = new er2(j99Var, j99Var);
        v68 b = z53Var.b(i2);
        List list = b.d;
        this.N = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(use.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i5 = 0; i5 < size; i5++) {
            hashMap.put(Long.valueOf(((fa) list2.get(i5)).a), Integer.valueOf(i5));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i5));
            arrayList.add(arrayList2);
            sparseArray.put(i5, arrayList2);
        }
        int i6 = 0;
        while (i6 < size) {
            fa faVar = (fa) list2.get(i6);
            List list3 = faVar.e;
            List list4 = faVar.f;
            boolean z2 = z;
            te3 g2 = g("http://dashif.org/guidelines/trickmode", list3);
            g2 = g2 == null ? g("http://dashif.org/guidelines/trickmode", list4) : g2;
            int intValue = (g2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(g2.b)))) == null || !b(faVar, (fa) list2.get(num.intValue()))) ? i6 : num.intValue();
            if (intValue == i6 && (g = g("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = g.b;
                String str2 = gcc.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i7 = i4; i7 < length; i7++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i7])));
                    if (num2 != null && b(faVar, (fa) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i6) {
                List list5 = (List) sparseArray.get(i6);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i6, list6);
                arrayList.remove(list5);
            }
            i6++;
            z = z2;
            i4 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i8 = 0; i8 < size2; i8++) {
            int[] e = ype.e((Collection) arrayList.get(i8));
            iArr2[i8] = e;
            Arrays.sort(e);
        }
        boolean[] zArr2 = new boolean[size2];
        ko4[][] ko4VarArr3 = new ko4[size2];
        int i9 = 0;
        int i10 = 0;
        while (i9 < size2) {
            int[] iArr3 = iArr2[i9];
            int length2 = iArr3.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((fa) list2.get(iArr3[i11])).c;
                iArr = iArr2;
                for (int i12 = 0; i12 < list7.size(); i12++) {
                    if (!((ub9) list7.get(i12)).d.isEmpty()) {
                        zArr2[i9] = z3;
                        i10++;
                        break;
                    }
                }
                i11++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i9];
            int length3 = iArr4.length;
            int i13 = 0;
            while (true) {
                if (i13 < length3) {
                    int i14 = iArr4[i13];
                    fa faVar2 = (fa) list2.get(i14);
                    List list8 = ((fa) list2.get(i14)).d;
                    int[] iArr5 = iArr4;
                    int i15 = 0;
                    while (i15 < list8.size()) {
                        te3 te3Var = (te3) list8.get(i15);
                        zArr = zArr2;
                        ko4VarArr = ko4VarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(te3Var.a)) {
                            jo4 jo4Var = new jo4();
                            jo4Var.s = dg7.n("application/cea-608");
                            jo4Var.a = qu6.p(new StringBuilder(), faVar2.a, ":cea608");
                            ko4VarArr2 = o(te3Var, T, new ko4(jo4Var));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(te3Var.a)) {
                            jo4 jo4Var2 = new jo4();
                            jo4Var2.s = dg7.n("application/cea-708");
                            jo4Var2.a = qu6.p(new StringBuilder(), faVar2.a, ":cea708");
                            ko4VarArr2 = o(te3Var, U, new ko4(jo4Var2));
                            break;
                        } else {
                            i15++;
                            ko4VarArr3 = ko4VarArr;
                            zArr2 = zArr;
                        }
                    }
                    i13++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    ko4VarArr = ko4VarArr3;
                    ko4VarArr2 = new ko4[0];
                    break;
                }
            }
            ko4VarArr[i9] = ko4VarArr2;
            i10 += ko4VarArr2.length;
            i9++;
            ko4VarArr3 = ko4VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        ko4[][] ko4VarArr4 = ko4VarArr3;
        int size3 = list.size() + i10 + size2;
        t1c[] t1cVarArr = new t1c[size3];
        c63[] c63VarArr = new c63[size3];
        int i16 = 0;
        int i17 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i18 : iArr7) {
                arrayList3.addAll(((fa) list2.get(i18)).c);
            }
            int size4 = arrayList3.size();
            ko4[] ko4VarArr5 = new ko4[size4];
            int i19 = 0;
            while (i19 < size4) {
                int i20 = size2;
                ko4 ko4Var = ((ub9) arrayList3.get(i19)).a;
                int i21 = i16;
                jo4 a = ko4Var.a();
                a.W = pr3Var2.x(ko4Var);
                ko4VarArr5[i19] = new ko4(a);
                i19++;
                size2 = i20;
                i16 = i21;
            }
            int i22 = size2;
            int i23 = i16;
            fa faVar3 = (fa) list2.get(iArr7[0]);
            long j2 = faVar3.a;
            if (j2 != -1) {
                k = Long.toString(j2);
            } else {
                k = uh9.k(i17, "unset:");
            }
            int i24 = i23 + 1;
            if (zArr3[i17]) {
                i3 = i23 + 2;
            } else {
                i3 = i24;
                i24 = -1;
            }
            int i25 = ko4VarArr4[i17].length != 0 ? i3 : -1;
            k(qx6Var2, ko4VarArr5);
            List list9 = list2;
            t1cVarArr[i23] = new t1c(k, ko4VarArr5);
            int i26 = i23;
            c63VarArr[i26] = new c63(faVar3.b, 0, iArr7, i23, i24, i25, ko4VarArr4[i17].length, -1, null);
            int i27 = -1;
            if (i24 != -1) {
                String o = qd4.o(k, ":emsg");
                jo4 jo4Var3 = new jo4();
                jo4Var3.a = o;
                jo4Var3.s = dg7.n("application/x-emsg");
                jo4Var3.m = k;
                ko4[] ko4VarArr6 = new ko4[z3];
                ko4VarArr6[0] = new ko4(jo4Var3);
                t1cVarArr[i24] = new t1c(o, ko4VarArr6);
                c63 c63Var = new c63(5, 1, iArr7, i26, -1, -1, -1, -1, null);
                i26 = i26;
                c63VarArr[i24] = c63Var;
                i27 = -1;
            }
            if (i25 != i27) {
                ko4[] ko4VarArr7 = ko4VarArr4[i17];
                k(qx6Var2, ko4VarArr7);
                int i28 = 0;
                while (i28 < ko4VarArr7.length) {
                    ko4 ko4Var2 = ko4VarArr7[i28];
                    ko4[] ko4VarArr8 = ko4VarArr4[i17];
                    jo4 a2 = ko4Var2.a();
                    a2.m = k;
                    int i29 = i26;
                    ko4VarArr8[i28] = new ko4(a2);
                    c63VarArr[i25] = new c63(3, 1, iArr7, i29, -1, -1, -1, -1, ko4Var2);
                    t1cVarArr[i25] = new t1c(k + ":cc:" + i28, ko4VarArr4[i17][i28]);
                    i25++;
                    i28++;
                    i26 = i29;
                }
                i3 += ko4VarArr7.length;
            }
            i16 = i3;
            i17++;
            size2 = i22;
            qx6Var2 = qx6Var;
            pr3Var2 = pr3Var;
            list2 = list9;
            z3 = true;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            i54 i54Var = (i54) list.get(i30);
            jo4 jo4Var4 = new jo4();
            jo4Var4.a = i54Var.a();
            jo4Var4.s = dg7.n("application/x-emsg");
            t1cVarArr[i16] = new t1c(i54Var.a() + ":" + i30, new ko4(jo4Var4));
            c63VarArr[i16] = new c63(5, 2, new int[0], -1, -1, -1, -1, i30, null);
            i30++;
            i16++;
        }
        Pair create = Pair.create(new u1c(t1cVarArr), c63VarArr);
        this.s = (u1c) create.first;
        this.w = (c63[]) create.second;
        this.R = Long.MIN_VALUE;
    }

    public static boolean b(fa faVar, fa faVar2) {
        int i = faVar.b;
        List list = faVar.c;
        int i2 = faVar2.b;
        List list2 = faVar2.c;
        if (i == i2) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                ko4 ko4Var = ((ub9) list.get(0)).a;
                ko4 ko4Var2 = ((ub9) list2.get(0)).a;
                int i3 = ko4Var.f & (-16385);
                int i4 = ko4Var2.f & (-16385);
                if (Objects.equals(ko4Var.d, ko4Var2.d) && i3 == i4) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static te3 g(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            te3 te3Var = (te3) list.get(i);
            if (str.equals(te3Var.a)) {
                return te3Var;
            }
        }
        return null;
    }

    public static void k(qx6 qx6Var, ko4[] ko4VarArr) {
        String str;
        for (int i = 0; i < ko4VarArr.length; i++) {
            ko4 ko4Var = ko4VarArr[i];
            n31 n31Var = (n31) qx6Var.c;
            if (n31Var.b && ((uif) n31Var.c).j(ko4Var)) {
                jo4 a = ko4Var.a();
                String str2 = ko4Var.l;
                a.s = dg7.n("application/x-media3-cues");
                a.T = ((uif) n31Var.c).y(ko4Var);
                StringBuilder sb = new StringBuilder();
                sb.append(ko4Var.t);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb.append(str);
                a.k = sb.toString();
                a.x = Long.MAX_VALUE;
                ko4Var = new ko4(a);
            }
            ko4VarArr[i] = ko4Var;
        }
    }

    public static ko4[] o(te3 te3Var, Pattern pattern, ko4 ko4Var) {
        String str = te3Var.b;
        if (str == null) {
            return new ko4[]{ko4Var};
        }
        String str2 = gcc.a;
        String[] split = str.split(";", -1);
        ko4[] ko4VarArr = new ko4[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new ko4[]{ko4Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            jo4 a = ko4Var.a();
            a.a = ko4Var.a + ":" + parseInt;
            a.S = parseInt;
            a.d = matcher.group(2);
            ko4VarArr[i] = new ko4(a);
        }
        return ko4VarArr;
    }

    @Override
    public final long c(defpackage.e74[] r37, boolean[] r38, defpackage.at9[] r39, boolean[] r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d63.c(e74[], boolean[], at9[], boolean[], long):long");
    }

    @Override
    public final void d() {
        this.P = true;
    }

    @Override
    public final boolean e() {
        return this.K.e();
    }

    @Override
    public final void f(i8a i8aVar) {
        this.H.f(this);
    }

    @Override
    public final long h() {
        return this.K.h();
    }

    public final int i(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 != -1) {
            c63[] c63VarArr = this.w;
            int i3 = c63VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && c63VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override
    public final long j(long r19, defpackage.az9 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d63.j(long, az9):long");
    }

    @Override
    public final void l() {
        this.n.g();
    }

    @Override
    public final long m(long j) {
        long j2;
        int i;
        pg0 pg0Var;
        boolean z;
        boolean J;
        int i2;
        boolean z2;
        pg0 pg0Var2;
        wh2[] wh2VarArr = this.I;
        int length = wh2VarArr.length;
        boolean z3 = false;
        int i3 = 0;
        while (i3 < length) {
            wh2 wh2Var = wh2VarArr[i3];
            ys9[] ys9VarArr = wh2Var.E;
            ys9 ys9Var = wh2Var.y;
            rx6 rx6Var = wh2Var.r;
            ?? r14 = wh2Var.w;
            wh2Var.K = j;
            wh2Var.N = z3;
            wh2Var.O = z3;
            if (wh2Var.y()) {
                wh2Var.J = j;
                z2 = z3;
                i = i3;
            } else {
                ?? r15 = z3;
                while (true) {
                    if (r15 < r14.size()) {
                        pg0Var = (pg0) r14.get(r15);
                        int i4 = (pg0Var.h > j ? 1 : (pg0Var.h == j ? 0 : -1));
                        i = i3;
                        if (i4 == 0 && pg0Var.w == -9223372036854775807L) {
                            break;
                        }
                        if (i4 > 0) {
                            break;
                        }
                        r15++;
                        i3 = i;
                    } else {
                        i = i3;
                        break;
                    }
                }
                pg0Var = null;
                if (pg0Var != null) {
                    J = ys9Var.I(pg0Var.e(0));
                } else {
                    long h = wh2Var.h();
                    if (h != Long.MIN_VALUE && j >= h) {
                        z = false;
                    } else {
                        z = true;
                    }
                    J = ys9Var.J(j, z);
                }
                if (J && (pg0Var2 = wh2Var.M) != null) {
                    i2 = 0;
                    if (pg0Var2.e(0) <= ys9Var.v()) {
                        J = false;
                    }
                } else {
                    i2 = 0;
                }
                if (J) {
                    wh2Var.L = wh2Var.B(ys9Var.v(), i2);
                    for (ys9 ys9Var2 : ys9VarArr) {
                        ys9Var2.J(j, true);
                    }
                } else {
                    wh2Var.J = j;
                    wh2Var.S = false;
                    r14.clear();
                    wh2Var.L = 0;
                    if (rx6Var.Z()) {
                        ys9Var.l();
                        for (ys9 ys9Var3 : ys9VarArr) {
                            ys9Var3.l();
                        }
                        rx6Var.u();
                    } else {
                        rx6Var.d = null;
                        z2 = false;
                        ys9Var.G(false);
                        for (ys9 ys9Var4 : wh2Var.E) {
                            ys9Var4.G(false);
                        }
                    }
                }
                z2 = false;
            }
            i3 = i + 1;
            z3 = z2;
        }
        h54[] h54VarArr = this.J;
        int length2 = h54VarArr.length;
        for (int i5 = z3; i5 < length2; i5++) {
            h54 h54Var = h54VarArr[i5];
            int b = gcc.b(h54Var.c, j, true);
            h54Var.h = b;
            if (h54Var.d && b == h54Var.c.length) {
                j2 = j;
            } else {
                j2 = -9223372036854775807L;
            }
            h54Var.n = j2;
        }
        return j;
    }

    @Override
    public final void n(long j) {
        wh2[] wh2VarArr;
        for (wh2 wh2Var : this.I) {
            ys9 ys9Var = wh2Var.y;
            if (!wh2Var.y()) {
                int i = ys9Var.q;
                ys9Var.k(j, true);
                int i2 = ys9Var.q;
                if (i2 > i) {
                    long r = ys9Var.r();
                    int i3 = 0;
                    while (true) {
                        ys9[] ys9VarArr = wh2Var.E;
                        if (i3 >= ys9VarArr.length) {
                            break;
                        }
                        ys9VarArr[i3].k(r, wh2Var.d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(wh2Var.B(i2, 0), wh2Var.L);
                if (min > 0) {
                    gcc.Y(0, min, wh2Var.w);
                    wh2Var.L -= min;
                }
            }
        }
    }

    @Override
    public final long p() {
        wh2[] wh2VarArr;
        if (this.S) {
            boolean z = false;
            for (wh2 wh2Var : this.I) {
                wh2Var.getClass();
                try {
                    boolean z2 = wh2Var.O;
                    wh2Var.O = false;
                    z |= z2;
                } catch (Throwable th) {
                    wh2Var.O = false;
                    throw th;
                }
            }
            wh2[] wh2VarArr2 = this.I;
            int length = wh2VarArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (wh2VarArr2[i].z()) {
                        break;
                    }
                    i++;
                } else {
                    this.S = false;
                    for (wh2 wh2Var2 : this.I) {
                        wh2Var2.Q = false;
                    }
                }
            }
            if (z) {
                return this.Q;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final void q(wt6 wt6Var, long j) {
        this.H = wt6Var;
        wt6Var.a(this);
    }

    @Override
    public final u1c r() {
        return this.s;
    }

    @Override
    public final boolean s(xa6 xa6Var) {
        return this.K.s(xa6Var);
    }

    @Override
    public final long t() {
        return this.K.t();
    }

    @Override
    public final void u(long j) {
        int i;
        wh2[] wh2VarArr = this.I;
        int length = wh2VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            wh2 wh2Var = wh2VarArr[i2];
            if (!wh2Var.r.Z()) {
                long d = this.L.d(this.M);
                ys9 ys9Var = wh2Var.y;
                yve.p(!wh2Var.r.Z());
                if (!wh2Var.y() && d != -9223372036854775807L && !wh2Var.w.isEmpty()) {
                    pg0 w = wh2Var.w();
                    long j2 = w.x;
                    if (j2 == -9223372036854775807L) {
                        j2 = w.n;
                    }
                    if (j2 > d) {
                        long s = ys9Var.s();
                        if (s > d) {
                            ys9Var.m(Math.max(d, ys9Var.t() + 1));
                            ys9[] ys9VarArr = wh2Var.E;
                            int length2 = ys9VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                ys9 ys9Var2 = ys9VarArr[i3];
                                ys9Var2.m(Math.max(d, ys9Var2.t() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            wh2Var.h.B(d, wh2Var.a, s);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.K.u(j);
    }
}
