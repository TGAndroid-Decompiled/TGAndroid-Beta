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
public final class x63 implements tt6, r6a {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kq F;
    public final fs3 G;
    public st6 H;
    public wr2 K;
    public t63 L;
    public int M;
    public List N;
    public boolean P;
    public long Q;
    public final long R;
    public boolean S;
    public final int a;
    public final hi2 b;
    public final w0c c;
    public final is3 d;
    public final k4f e;
    public final e7a f;
    public final long h;
    public final ma6 n;
    public final mx6 r;
    public final vzb s;
    public final w63[] w;
    public final kg7 x;
    public final ue8 y;
    public boolean O = true;
    public si2[] I = new si2[0];
    public w54[] J = new w54[0];
    public final IdentityHashMap E = new IdentityHashMap();

    public x63(int i, t63 t63Var, e7a e7aVar, int i2, hi2 hi2Var, w0c w0cVar, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, long j, ma6 ma6Var, mx6 mx6Var, kg7 kg7Var, sz4 sz4Var, we8 we8Var) {
        String j2;
        int i3;
        int[][] iArr;
        boolean[] zArr;
        go4[][] go4VarArr;
        go4[] go4VarArr2;
        lf3 i4;
        Integer num;
        hi2 hi2Var2 = hi2Var;
        is3 is3Var2 = is3Var;
        this.a = i;
        this.L = t63Var;
        this.f = e7aVar;
        this.M = i2;
        this.b = hi2Var2;
        this.c = w0cVar;
        this.d = is3Var2;
        this.G = fs3Var;
        this.e = k4fVar;
        this.F = kqVar;
        this.h = j;
        this.n = ma6Var;
        this.r = mx6Var;
        this.x = kg7Var;
        boolean z = true;
        this.y = new ue8(t63Var, sz4Var, mx6Var);
        int i5 = 0;
        kg7Var.getClass();
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        this.K = new wr2(y79Var, y79Var);
        h58 b = t63Var.b(i2);
        List list = b.d;
        this.N = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(fqe.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            hashMap.put(Long.valueOf(((ea) list2.get(i6)).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            ea eaVar = (ea) list2.get(i7);
            List list3 = eaVar.e;
            List list4 = eaVar.f;
            boolean z2 = z;
            lf3 i8 = i("http://dashif.org/guidelines/trickmode", list3);
            i8 = i8 == null ? i("http://dashif.org/guidelines/trickmode", list4) : i8;
            int intValue = (i8 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(i8.b)))) == null || !d(eaVar, (ea) list2.get(num.intValue()))) ? i7 : num.intValue();
            if (intValue == i7 && (i4 = i("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = i4.b;
                String str2 = hac.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i9 = i5; i9 < length; i9++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i9])));
                    if (num2 != null && d(eaVar, (ea) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z = z2;
            i5 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] e = ine.e((Collection) arrayList.get(i10));
            iArr2[i10] = e;
            Arrays.sort(e);
        }
        boolean[] zArr2 = new boolean[size2];
        go4[][] go4VarArr3 = new go4[size2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr3 = iArr2[i11];
            int length2 = iArr3.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((ea) list2.get(iArr3[i13])).c;
                iArr = iArr2;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (!((ka9) list7.get(i14)).d.isEmpty()) {
                        zArr2[i11] = z3;
                        i12++;
                        break;
                    }
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i11];
            int length3 = iArr4.length;
            int i15 = 0;
            while (true) {
                if (i15 < length3) {
                    int i16 = iArr4[i15];
                    ea eaVar2 = (ea) list2.get(i16);
                    List list8 = ((ea) list2.get(i16)).d;
                    int[] iArr5 = iArr4;
                    int i17 = 0;
                    while (i17 < list8.size()) {
                        lf3 lf3Var = (lf3) list8.get(i17);
                        zArr = zArr2;
                        go4VarArr = go4VarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(lf3Var.a)) {
                            fo4 fo4Var = new fo4();
                            fo4Var.s = wf7.n("application/cea-608");
                            fo4Var.a = kt6.q(new StringBuilder(), eaVar2.a, ":cea608");
                            go4VarArr2 = u(lf3Var, T, new go4(fo4Var));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(lf3Var.a)) {
                            fo4 fo4Var2 = new fo4();
                            fo4Var2.s = wf7.n("application/cea-708");
                            fo4Var2.a = kt6.q(new StringBuilder(), eaVar2.a, ":cea708");
                            go4VarArr2 = u(lf3Var, U, new go4(fo4Var2));
                            break;
                        } else {
                            i17++;
                            go4VarArr3 = go4VarArr;
                            zArr2 = zArr;
                        }
                    }
                    i15++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    go4VarArr = go4VarArr3;
                    go4VarArr2 = new go4[0];
                    break;
                }
            }
            go4VarArr[i11] = go4VarArr2;
            i12 += go4VarArr2.length;
            i11++;
            go4VarArr3 = go4VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        go4[][] go4VarArr4 = go4VarArr3;
        int size3 = list.size() + i12 + size2;
        uzb[] uzbVarArr = new uzb[size3];
        w63[] w63VarArr = new w63[size3];
        int i18 = 0;
        int i19 = 0;
        while (i19 < size2) {
            int[] iArr7 = iArr6[i19];
            ArrayList arrayList3 = new ArrayList();
            for (int i20 : iArr7) {
                arrayList3.addAll(((ea) list2.get(i20)).c);
            }
            int size4 = arrayList3.size();
            go4[] go4VarArr5 = new go4[size4];
            int i21 = 0;
            while (i21 < size4) {
                int i22 = size2;
                go4 go4Var = ((ka9) arrayList3.get(i21)).a;
                int i23 = i18;
                fo4 a = go4Var.a();
                a.W = is3Var2.x(go4Var);
                go4VarArr5[i21] = new go4(a);
                i21++;
                size2 = i22;
                i18 = i23;
            }
            int i24 = size2;
            int i25 = i18;
            ea eaVar3 = (ea) list2.get(iArr7[0]);
            long j3 = eaVar3.a;
            if (j3 != -1) {
                j2 = Long.toString(j3);
            } else {
                j2 = hg9.j(i19, "unset:");
            }
            int i26 = i25 + 1;
            if (zArr3[i19]) {
                i3 = i25 + 2;
            } else {
                i3 = i26;
                i26 = -1;
            }
            int i27 = go4VarArr4[i19].length != 0 ? i3 : -1;
            p(hi2Var2, go4VarArr5);
            List list9 = list2;
            uzbVarArr[i25] = new uzb(j2, go4VarArr5);
            int i28 = i25;
            w63VarArr[i28] = new w63(eaVar3.b, 0, iArr7, i25, i26, i27, go4VarArr4[i19].length, -1, null);
            int i29 = -1;
            if (i26 != -1) {
                String p = td4.p(j2, ":emsg");
                fo4 fo4Var3 = new fo4();
                fo4Var3.a = p;
                fo4Var3.s = wf7.n("application/x-emsg");
                fo4Var3.m = j2;
                go4[] go4VarArr6 = new go4[z3];
                go4VarArr6[0] = new go4(fo4Var3);
                uzbVarArr[i26] = new uzb(p, go4VarArr6);
                w63 w63Var = new w63(5, 1, iArr7, i28, -1, -1, -1, -1, null);
                i28 = i28;
                w63VarArr[i26] = w63Var;
                i29 = -1;
            }
            if (i27 != i29) {
                go4[] go4VarArr7 = go4VarArr4[i19];
                p(hi2Var2, go4VarArr7);
                int i30 = 0;
                while (i30 < go4VarArr7.length) {
                    go4 go4Var2 = go4VarArr7[i30];
                    go4[] go4VarArr8 = go4VarArr4[i19];
                    fo4 a2 = go4Var2.a();
                    a2.m = j2;
                    int i31 = i28;
                    go4VarArr8[i30] = new go4(a2);
                    w63VarArr[i27] = new w63(3, 1, iArr7, i31, -1, -1, -1, -1, go4Var2);
                    uzbVarArr[i27] = new uzb(j2 + ":cc:" + i30, go4VarArr4[i19][i30]);
                    i27++;
                    i30++;
                    i28 = i31;
                }
                i3 += go4VarArr7.length;
            }
            i18 = i3;
            i19++;
            size2 = i24;
            hi2Var2 = hi2Var;
            is3Var2 = is3Var;
            list2 = list9;
            z3 = true;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            x54 x54Var = (x54) list.get(i32);
            fo4 fo4Var4 = new fo4();
            fo4Var4.a = x54Var.a();
            fo4Var4.s = wf7.n("application/x-emsg");
            uzbVarArr[i18] = new uzb(x54Var.a() + ":" + i32, new go4(fo4Var4));
            w63VarArr[i18] = new w63(5, 2, new int[0], -1, -1, -1, -1, i32, null);
            i32++;
            i18++;
        }
        Pair create = Pair.create(new vzb(uzbVarArr), w63VarArr);
        this.s = (vzb) create.first;
        this.w = (w63[]) create.second;
        this.R = Long.MIN_VALUE;
    }

    public static boolean d(ea eaVar, ea eaVar2) {
        int i = eaVar.b;
        List list = eaVar.c;
        int i2 = eaVar2.b;
        List list2 = eaVar2.c;
        if (i == i2) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                go4 go4Var = ((ka9) list.get(0)).a;
                go4 go4Var2 = ((ka9) list2.get(0)).a;
                int i3 = go4Var.f & (-16385);
                int i4 = go4Var2.f & (-16385);
                if (Objects.equals(go4Var.d, go4Var2.d) && i3 == i4) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static lf3 i(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            lf3 lf3Var = (lf3) list.get(i);
            if (str.equals(lf3Var.a)) {
                return lf3Var;
            }
        }
        return null;
    }

    public static void p(hi2 hi2Var, go4[] go4VarArr) {
        String str;
        for (int i = 0; i < go4VarArr.length; i++) {
            go4 go4Var = go4VarArr[i];
            m41 m41Var = (m41) hi2Var.c;
            if (m41Var.b && ((fgf) m41Var.c).h(go4Var)) {
                fo4 a = go4Var.a();
                String str2 = go4Var.l;
                a.s = wf7.n("application/x-media3-cues");
                a.T = ((fgf) m41Var.c).C(go4Var);
                StringBuilder sb = new StringBuilder();
                sb.append(go4Var.t);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb.append(str);
                a.k = sb.toString();
                a.x = Long.MAX_VALUE;
                go4Var = new go4(a);
            }
            go4VarArr[i] = go4Var;
        }
    }

    public static go4[] u(lf3 lf3Var, Pattern pattern, go4 go4Var) {
        String str = lf3Var.b;
        if (str == null) {
            return new go4[]{go4Var};
        }
        String str2 = hac.a;
        String[] split = str.split(";", -1);
        go4[] go4VarArr = new go4[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new go4[]{go4Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            fo4 a = go4Var.a();
            a.a = go4Var.a + ":" + parseInt;
            a.S = parseInt;
            a.d = matcher.group(2);
            go4VarArr[i] = new go4(a);
        }
        return go4VarArr;
    }

    @Override
    public final void b(s6a s6aVar) {
        this.H.b(this);
    }

    @Override
    public final long c(defpackage.t74[] r37, boolean[] r38, defpackage.jr9[] r39, boolean[] r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x63.c(t74[], boolean[], jr9[], boolean[], long):long");
    }

    @Override
    public final void e() {
        this.P = true;
    }

    @Override
    public final boolean f() {
        return this.K.f();
    }

    @Override
    public final long g() {
        return this.K.g();
    }

    @Override
    public final long h(long r19, defpackage.jx9 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x63.h(long, jx9):long");
    }

    @Override
    public final void j() {
        this.n.d();
    }

    @Override
    public final long k(long j) {
        long j2;
        int i;
        ph0 ph0Var;
        boolean z;
        boolean J;
        int i2;
        boolean z2;
        ph0 ph0Var2;
        si2[] si2VarArr = this.I;
        int length = si2VarArr.length;
        boolean z3 = false;
        int i3 = 0;
        while (i3 < length) {
            si2 si2Var = si2VarArr[i3];
            hr9[] hr9VarArr = si2Var.E;
            hr9 hr9Var = si2Var.y;
            mx6 mx6Var = si2Var.r;
            ?? r14 = si2Var.w;
            si2Var.K = j;
            si2Var.N = z3;
            si2Var.O = z3;
            if (si2Var.y()) {
                si2Var.J = j;
                z2 = z3;
                i = i3;
            } else {
                ?? r15 = z3;
                while (true) {
                    if (r15 < r14.size()) {
                        ph0Var = (ph0) r14.get(r15);
                        int i4 = (ph0Var.h > j ? 1 : (ph0Var.h == j ? 0 : -1));
                        i = i3;
                        if (i4 == 0 && ph0Var.w == -9223372036854775807L) {
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
                ph0Var = null;
                if (ph0Var != null) {
                    J = hr9Var.I(ph0Var.d(0));
                } else {
                    long g = si2Var.g();
                    if (g != Long.MIN_VALUE && j >= g) {
                        z = false;
                    } else {
                        z = true;
                    }
                    J = hr9Var.J(j, z);
                }
                if (J && (ph0Var2 = si2Var.M) != null) {
                    i2 = 0;
                    if (ph0Var2.d(0) <= hr9Var.v()) {
                        J = false;
                    }
                } else {
                    i2 = 0;
                }
                if (J) {
                    si2Var.L = si2Var.B(hr9Var.v(), i2);
                    for (hr9 hr9Var2 : hr9VarArr) {
                        hr9Var2.J(j, true);
                    }
                } else {
                    si2Var.J = j;
                    si2Var.S = false;
                    r14.clear();
                    si2Var.L = 0;
                    if (mx6Var.Y()) {
                        hr9Var.l();
                        for (hr9 hr9Var3 : hr9VarArr) {
                            hr9Var3.l();
                        }
                        mx6Var.v();
                    } else {
                        mx6Var.d = null;
                        z2 = false;
                        hr9Var.G(false);
                        for (hr9 hr9Var4 : si2Var.E) {
                            hr9Var4.G(false);
                        }
                    }
                }
                z2 = false;
            }
            i3 = i + 1;
            z3 = z2;
        }
        w54[] w54VarArr = this.J;
        int length2 = w54VarArr.length;
        for (int i5 = z3; i5 < length2; i5++) {
            w54 w54Var = w54VarArr[i5];
            int b = hac.b(w54Var.c, j, true);
            w54Var.h = b;
            if (w54Var.d && b == w54Var.c.length) {
                j2 = j;
            } else {
                j2 = -9223372036854775807L;
            }
            w54Var.n = j2;
        }
        return j;
    }

    @Override
    public final void l(long j) {
        si2[] si2VarArr;
        for (si2 si2Var : this.I) {
            hr9 hr9Var = si2Var.y;
            if (!si2Var.y()) {
                int i = hr9Var.q;
                hr9Var.k(j, true);
                int i2 = hr9Var.q;
                if (i2 > i) {
                    long r = hr9Var.r();
                    int i3 = 0;
                    while (true) {
                        hr9[] hr9VarArr = si2Var.E;
                        if (i3 >= hr9VarArr.length) {
                            break;
                        }
                        hr9VarArr[i3].k(r, si2Var.d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(si2Var.B(i2, 0), si2Var.L);
                if (min > 0) {
                    hac.Y(0, min, si2Var.w);
                    si2Var.L -= min;
                }
            }
        }
    }

    public final int m(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 != -1) {
            w63[] w63VarArr = this.w;
            int i3 = w63VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && w63VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override
    public final long n() {
        si2[] si2VarArr;
        if (this.S) {
            boolean z = false;
            for (si2 si2Var : this.I) {
                si2Var.getClass();
                try {
                    boolean z2 = si2Var.O;
                    si2Var.O = false;
                    z |= z2;
                } catch (Throwable th) {
                    si2Var.O = false;
                    throw th;
                }
            }
            si2[] si2VarArr2 = this.I;
            int length = si2VarArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (si2VarArr2[i].z()) {
                        break;
                    }
                    i++;
                } else {
                    this.S = false;
                    for (si2 si2Var2 : this.I) {
                        si2Var2.Q = false;
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
    public final void o(st6 st6Var, long j) {
        this.H = st6Var;
        st6Var.a(this);
    }

    @Override
    public final vzb q() {
        return this.s;
    }

    @Override
    public final boolean r(sa6 sa6Var) {
        return this.K.r(sa6Var);
    }

    @Override
    public final long s() {
        return this.K.s();
    }

    @Override
    public final void t(long j) {
        int i;
        si2[] si2VarArr = this.I;
        int length = si2VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            si2 si2Var = si2VarArr[i2];
            if (!si2Var.r.Y()) {
                long d = this.L.d(this.M);
                hr9 hr9Var = si2Var.y;
                jte.p(!si2Var.r.Y());
                if (!si2Var.y() && d != -9223372036854775807L && !si2Var.w.isEmpty()) {
                    ph0 v = si2Var.v();
                    long j2 = v.x;
                    if (j2 == -9223372036854775807L) {
                        j2 = v.n;
                    }
                    if (j2 > d) {
                        long s = hr9Var.s();
                        if (s > d) {
                            hr9Var.m(Math.max(d, hr9Var.t() + 1));
                            hr9[] hr9VarArr = si2Var.E;
                            int length2 = hr9VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                hr9 hr9Var2 = hr9VarArr[i3];
                                hr9Var2.m(Math.max(d, hr9Var2.t() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            si2Var.h.A(d, si2Var.a, s);
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
