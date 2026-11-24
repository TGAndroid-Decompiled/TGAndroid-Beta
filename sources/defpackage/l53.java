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
public final class l53 implements sr6, p4a {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kp F;
    public final vq3 G;
    public rr6 H;
    public lq2 K;
    public h53 L;
    public int M;
    public List N;
    public boolean P;
    public long Q;
    public final long R;
    public boolean S;
    public final int a;
    public final lv6 b;
    public final vyb c;
    public final yq3 d;
    public final i2f e;
    public final c5a f;
    public final long h;
    public final n86 n;
    public final mv6 r;
    public final txb s;
    public final k53[] w;
    public final ie7 x;
    public final rc8 y;
    public boolean O = true;
    public eh2[] I = new eh2[0];
    public l44[] J = new l44[0];
    public final IdentityHashMap E = new IdentityHashMap();

    public l53(int i, h53 h53Var, c5a c5aVar, int i2, lv6 lv6Var, vyb vybVar, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, long j, n86 n86Var, mv6 mv6Var, ie7 ie7Var, lj9 lj9Var, uc8 uc8Var) {
        String k;
        int i3;
        int[][] iArr;
        boolean[] zArr;
        fm4[][] fm4VarArr;
        fm4[] fm4VarArr2;
        zd3 h;
        Integer num;
        lv6 lv6Var2 = lv6Var;
        yq3 yq3Var2 = yq3Var;
        this.a = i;
        this.L = h53Var;
        this.f = c5aVar;
        this.M = i2;
        this.b = lv6Var2;
        this.c = vybVar;
        this.d = yq3Var2;
        this.G = vq3Var;
        this.e = i2fVar;
        this.F = kpVar;
        this.h = j;
        this.n = n86Var;
        this.r = mv6Var;
        this.x = ie7Var;
        boolean z = true;
        this.y = new rc8(h53Var, lj9Var, mv6Var);
        int i4 = 0;
        ie7Var.getClass();
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.K = new lq2(w59Var, w59Var);
        f38 b = h53Var.b(i2);
        List list = b.d;
        this.N = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(coe.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i5 = 0; i5 < size; i5++) {
            hashMap.put(Long.valueOf(((ea) list2.get(i5)).a), Integer.valueOf(i5));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i5));
            arrayList.add(arrayList2);
            sparseArray.put(i5, arrayList2);
        }
        int i6 = 0;
        while (i6 < size) {
            ea eaVar = (ea) list2.get(i6);
            List list3 = eaVar.e;
            List list4 = eaVar.f;
            boolean z2 = z;
            zd3 h2 = h("http://dashif.org/guidelines/trickmode", list3);
            h2 = h2 == null ? h("http://dashif.org/guidelines/trickmode", list4) : h2;
            int intValue = (h2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(h2.b)))) == null || !c(eaVar, (ea) list2.get(num.intValue()))) ? i6 : num.intValue();
            if (intValue == i6 && (h = h("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = h.b;
                String str2 = g8c.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i7 = i4; i7 < length; i7++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i7])));
                    if (num2 != null && c(eaVar, (ea) list2.get(num2.intValue()))) {
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
            int[] e = gle.e((Collection) arrayList.get(i8));
            iArr2[i8] = e;
            Arrays.sort(e);
        }
        boolean[] zArr2 = new boolean[size2];
        fm4[][] fm4VarArr3 = new fm4[size2];
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
                List list7 = ((ea) list2.get(iArr3[i11])).c;
                iArr = iArr2;
                for (int i12 = 0; i12 < list7.size(); i12++) {
                    if (!((i89) list7.get(i12)).d.isEmpty()) {
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
                    ea eaVar2 = (ea) list2.get(i14);
                    List list8 = ((ea) list2.get(i14)).d;
                    int[] iArr5 = iArr4;
                    int i15 = 0;
                    while (i15 < list8.size()) {
                        zd3 zd3Var = (zd3) list8.get(i15);
                        zArr = zArr2;
                        fm4VarArr = fm4VarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(zd3Var.a)) {
                            em4 em4Var = new em4();
                            em4Var.s = ud7.n("application/cea-608");
                            em4Var.a = ls6.p(new StringBuilder(), eaVar2.a, ":cea608");
                            fm4VarArr2 = u(zd3Var, T, new fm4(em4Var));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(zd3Var.a)) {
                            em4 em4Var2 = new em4();
                            em4Var2.s = ud7.n("application/cea-708");
                            em4Var2.a = ls6.p(new StringBuilder(), eaVar2.a, ":cea708");
                            fm4VarArr2 = u(zd3Var, U, new fm4(em4Var2));
                            break;
                        } else {
                            i15++;
                            fm4VarArr3 = fm4VarArr;
                            zArr2 = zArr;
                        }
                    }
                    i13++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    fm4VarArr = fm4VarArr3;
                    fm4VarArr2 = new fm4[0];
                    break;
                }
            }
            fm4VarArr[i9] = fm4VarArr2;
            i10 += fm4VarArr2.length;
            i9++;
            fm4VarArr3 = fm4VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        fm4[][] fm4VarArr4 = fm4VarArr3;
        int size3 = list.size() + i10 + size2;
        sxb[] sxbVarArr = new sxb[size3];
        k53[] k53VarArr = new k53[size3];
        int i16 = 0;
        int i17 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i18 : iArr7) {
                arrayList3.addAll(((ea) list2.get(i18)).c);
            }
            int size4 = arrayList3.size();
            fm4[] fm4VarArr5 = new fm4[size4];
            int i19 = 0;
            while (i19 < size4) {
                int i20 = size2;
                fm4 fm4Var = ((i89) arrayList3.get(i19)).a;
                int i21 = i16;
                em4 a = fm4Var.a();
                a.W = yq3Var2.w(fm4Var);
                fm4VarArr5[i19] = new fm4(a);
                i19++;
                size2 = i20;
                i16 = i21;
            }
            int i22 = size2;
            int i23 = i16;
            ea eaVar3 = (ea) list2.get(iArr7[0]);
            long j2 = eaVar3.a;
            if (j2 != -1) {
                k = Long.toString(j2);
            } else {
                k = de9.k(i17, "unset:");
            }
            int i24 = i23 + 1;
            if (zArr3[i17]) {
                i3 = i23 + 2;
            } else {
                i3 = i24;
                i24 = -1;
            }
            int i25 = fm4VarArr4[i17].length != 0 ? i3 : -1;
            n(lv6Var2, fm4VarArr5);
            List list9 = list2;
            sxbVarArr[i23] = new sxb(k, fm4VarArr5);
            int i26 = i23;
            k53VarArr[i26] = new k53(eaVar3.b, 0, iArr7, i23, i24, i25, fm4VarArr4[i17].length, -1, null);
            int i27 = -1;
            if (i24 != -1) {
                String o = tb4.o(k, ":emsg");
                em4 em4Var3 = new em4();
                em4Var3.a = o;
                em4Var3.s = ud7.n("application/x-emsg");
                em4Var3.m = k;
                fm4[] fm4VarArr6 = new fm4[z3];
                fm4VarArr6[0] = new fm4(em4Var3);
                sxbVarArr[i24] = new sxb(o, fm4VarArr6);
                k53 k53Var = new k53(5, 1, iArr7, i26, -1, -1, -1, -1, null);
                i26 = i26;
                k53VarArr[i24] = k53Var;
                i27 = -1;
            }
            if (i25 != i27) {
                fm4[] fm4VarArr7 = fm4VarArr4[i17];
                n(lv6Var2, fm4VarArr7);
                int i28 = 0;
                while (i28 < fm4VarArr7.length) {
                    fm4 fm4Var2 = fm4VarArr7[i28];
                    fm4[] fm4VarArr8 = fm4VarArr4[i17];
                    em4 a2 = fm4Var2.a();
                    a2.m = k;
                    int i29 = i26;
                    fm4VarArr8[i28] = new fm4(a2);
                    k53VarArr[i25] = new k53(3, 1, iArr7, i29, -1, -1, -1, -1, fm4Var2);
                    sxbVarArr[i25] = new sxb(k + ":cc:" + i28, fm4VarArr4[i17][i28]);
                    i25++;
                    i28++;
                    i26 = i29;
                }
                i3 += fm4VarArr7.length;
            }
            i16 = i3;
            i17++;
            size2 = i22;
            lv6Var2 = lv6Var;
            yq3Var2 = yq3Var;
            list2 = list9;
            z3 = true;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            m44 m44Var = (m44) list.get(i30);
            em4 em4Var4 = new em4();
            em4Var4.a = m44Var.a();
            em4Var4.s = ud7.n("application/x-emsg");
            sxbVarArr[i16] = new sxb(m44Var.a() + ":" + i30, new fm4(em4Var4));
            k53VarArr[i16] = new k53(5, 2, new int[0], -1, -1, -1, -1, i30, null);
            i30++;
            i16++;
        }
        Pair create = Pair.create(new txb(sxbVarArr), k53VarArr);
        this.s = (txb) create.first;
        this.w = (k53[]) create.second;
        this.R = Long.MIN_VALUE;
    }

    public static boolean c(ea eaVar, ea eaVar2) {
        int i = eaVar.b;
        List list = eaVar.c;
        int i2 = eaVar2.b;
        List list2 = eaVar2.c;
        if (i == i2) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                fm4 fm4Var = ((i89) list.get(0)).a;
                fm4 fm4Var2 = ((i89) list2.get(0)).a;
                int i3 = fm4Var.f & (-16385);
                int i4 = fm4Var2.f & (-16385);
                if (Objects.equals(fm4Var.d, fm4Var2.d) && i3 == i4) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static zd3 h(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            zd3 zd3Var = (zd3) list.get(i);
            if (str.equals(zd3Var.a)) {
                return zd3Var;
            }
        }
        return null;
    }

    public static void n(lv6 lv6Var, fm4[] fm4VarArr) {
        String str;
        for (int i = 0; i < fm4VarArr.length; i++) {
            fm4 fm4Var = fm4VarArr[i];
            e31 e31Var = (e31) lv6Var.c;
            if (e31Var.b && ((eef) e31Var.c).h(fm4Var)) {
                em4 a = fm4Var.a();
                String str2 = fm4Var.l;
                a.s = ud7.n("application/x-media3-cues");
                a.T = ((eef) e31Var.c).y(fm4Var);
                StringBuilder sb = new StringBuilder();
                sb.append(fm4Var.t);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb.append(str);
                a.k = sb.toString();
                a.x = Long.MAX_VALUE;
                fm4Var = new fm4(a);
            }
            fm4VarArr[i] = fm4Var;
        }
    }

    public static fm4[] u(zd3 zd3Var, Pattern pattern, fm4 fm4Var) {
        String str = zd3Var.b;
        if (str == null) {
            return new fm4[]{fm4Var};
        }
        String str2 = g8c.a;
        String[] split = str.split(";", -1);
        fm4[] fm4VarArr = new fm4[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new fm4[]{fm4Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            em4 a = fm4Var.a();
            a.a = fm4Var.a + ":" + parseInt;
            a.S = parseInt;
            a.d = matcher.group(2);
            fm4VarArr[i] = new fm4(a);
        }
        return fm4VarArr;
    }

    @Override
    public final void b(q4a q4aVar) {
        this.H.b(this);
    }

    @Override
    public final boolean d() {
        return this.K.d();
    }

    @Override
    public final long e(defpackage.k64[] r37, boolean[] r38, defpackage.ip9[] r39, boolean[] r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l53.e(k64[], boolean[], ip9[], boolean[], long):long");
    }

    @Override
    public final void f() {
        this.P = true;
    }

    @Override
    public final long g() {
        return this.K.g();
    }

    @Override
    public final long i(long r19, defpackage.gv9 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l53.i(long, gv9):long");
    }

    public final int j(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 != -1) {
            k53[] k53VarArr = this.w;
            int i3 = k53VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && k53VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override
    public final void k() {
        this.n.b();
    }

    @Override
    public final long l(long j) {
        long j2;
        int i;
        og0 og0Var;
        boolean z;
        boolean J;
        int i2;
        boolean z2;
        og0 og0Var2;
        eh2[] eh2VarArr = this.I;
        int length = eh2VarArr.length;
        boolean z3 = false;
        int i3 = 0;
        while (i3 < length) {
            eh2 eh2Var = eh2VarArr[i3];
            gp9[] gp9VarArr = eh2Var.E;
            gp9 gp9Var = eh2Var.y;
            mv6 mv6Var = eh2Var.r;
            ?? r14 = eh2Var.w;
            eh2Var.K = j;
            eh2Var.N = z3;
            eh2Var.O = z3;
            if (eh2Var.y()) {
                eh2Var.J = j;
                z2 = z3;
                i = i3;
            } else {
                ?? r15 = z3;
                while (true) {
                    if (r15 < r14.size()) {
                        og0Var = (og0) r14.get(r15);
                        int i4 = (og0Var.h > j ? 1 : (og0Var.h == j ? 0 : -1));
                        i = i3;
                        if (i4 == 0 && og0Var.w == -9223372036854775807L) {
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
                og0Var = null;
                if (og0Var != null) {
                    J = gp9Var.I(og0Var.e(0));
                } else {
                    long g = eh2Var.g();
                    if (g != Long.MIN_VALUE && j >= g) {
                        z = false;
                    } else {
                        z = true;
                    }
                    J = gp9Var.J(j, z);
                }
                if (J && (og0Var2 = eh2Var.M) != null) {
                    i2 = 0;
                    if (og0Var2.e(0) <= gp9Var.v()) {
                        J = false;
                    }
                } else {
                    i2 = 0;
                }
                if (J) {
                    eh2Var.L = eh2Var.B(gp9Var.v(), i2);
                    for (gp9 gp9Var2 : gp9VarArr) {
                        gp9Var2.J(j, true);
                    }
                } else {
                    eh2Var.J = j;
                    eh2Var.S = false;
                    r14.clear();
                    eh2Var.L = 0;
                    if (mv6Var.W()) {
                        gp9Var.l();
                        for (gp9 gp9Var3 : gp9VarArr) {
                            gp9Var3.l();
                        }
                        mv6Var.p();
                    } else {
                        mv6Var.d = null;
                        z2 = false;
                        gp9Var.G(false);
                        for (gp9 gp9Var4 : eh2Var.E) {
                            gp9Var4.G(false);
                        }
                    }
                }
                z2 = false;
            }
            i3 = i + 1;
            z3 = z2;
        }
        l44[] l44VarArr = this.J;
        int length2 = l44VarArr.length;
        for (int i5 = z3; i5 < length2; i5++) {
            l44 l44Var = l44VarArr[i5];
            int b = g8c.b(l44Var.c, j, true);
            l44Var.h = b;
            if (l44Var.d && b == l44Var.c.length) {
                j2 = j;
            } else {
                j2 = -9223372036854775807L;
            }
            l44Var.n = j2;
        }
        return j;
    }

    @Override
    public final void m(long j) {
        eh2[] eh2VarArr;
        for (eh2 eh2Var : this.I) {
            gp9 gp9Var = eh2Var.y;
            if (!eh2Var.y()) {
                int i = gp9Var.q;
                gp9Var.k(j, true);
                int i2 = gp9Var.q;
                if (i2 > i) {
                    long r = gp9Var.r();
                    int i3 = 0;
                    while (true) {
                        gp9[] gp9VarArr = eh2Var.E;
                        if (i3 >= gp9VarArr.length) {
                            break;
                        }
                        gp9VarArr[i3].k(r, eh2Var.d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(eh2Var.B(i2, 0), eh2Var.L);
                if (min > 0) {
                    g8c.Y(0, min, eh2Var.w);
                    eh2Var.L -= min;
                }
            }
        }
    }

    @Override
    public final long o() {
        eh2[] eh2VarArr;
        if (this.S) {
            boolean z = false;
            for (eh2 eh2Var : this.I) {
                eh2Var.getClass();
                try {
                    boolean z2 = eh2Var.O;
                    eh2Var.O = false;
                    z |= z2;
                } catch (Throwable th) {
                    eh2Var.O = false;
                    throw th;
                }
            }
            eh2[] eh2VarArr2 = this.I;
            int length = eh2VarArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (eh2VarArr2[i].z()) {
                        break;
                    }
                    i++;
                } else {
                    this.S = false;
                    for (eh2 eh2Var2 : this.I) {
                        eh2Var2.Q = false;
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
    public final void p(rr6 rr6Var, long j) {
        this.H = rr6Var;
        rr6Var.a(this);
    }

    @Override
    public final txb q() {
        return this.s;
    }

    @Override
    public final boolean r(t86 t86Var) {
        return this.K.r(t86Var);
    }

    @Override
    public final long s() {
        return this.K.s();
    }

    @Override
    public final void t(long j) {
        int i;
        eh2[] eh2VarArr = this.I;
        int length = eh2VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            eh2 eh2Var = eh2VarArr[i2];
            if (!eh2Var.r.W()) {
                long d = this.L.d(this.M);
                gp9 gp9Var = eh2Var.y;
                gre.p(!eh2Var.r.W());
                if (!eh2Var.y() && d != -9223372036854775807L && !eh2Var.w.isEmpty()) {
                    og0 w = eh2Var.w();
                    long j2 = w.x;
                    if (j2 == -9223372036854775807L) {
                        j2 = w.n;
                    }
                    if (j2 > d) {
                        long s = gp9Var.s();
                        if (s > d) {
                            gp9Var.m(Math.max(d, gp9Var.t() + 1));
                            gp9[] gp9VarArr = eh2Var.E;
                            int length2 = gp9VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                gp9 gp9Var2 = gp9VarArr[i3];
                                gp9Var2.m(Math.max(d, gp9Var2.t() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            eh2Var.h.A(d, eh2Var.a, s);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.K.t(j);
    }
}
