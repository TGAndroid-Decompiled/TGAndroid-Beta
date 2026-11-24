package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
public final class ut6 {
    public final hl6 a;
    public final Object b;
    public final jr9[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public vt6 g;
    public final boolean[] h;
    public final boolean[] i;
    public final uh0[] j;
    public final fe3 k;
    public final e07 l;
    public ut6 m;
    public vzb n;
    public e0c o;
    public long p;

    public ut6(uh0[] uh0VarArr, long j, fe3 fe3Var, mx6 mx6Var, e07 e07Var, vt6 vt6Var, e0c e0cVar) {
        this.j = uh0VarArr;
        this.p = j;
        this.k = fe3Var;
        this.l = e07Var;
        rz6 rz6Var = vt6Var.a;
        Object obj = rz6Var.a;
        this.b = obj;
        this.g = vt6Var;
        this.n = vzb.d;
        this.o = e0cVar;
        this.c = new jr9[uh0VarArr.length];
        this.h = new boolean[uh0VarArr.length];
        this.i = new boolean[uh0VarArr.length];
        long j2 = vt6Var.b;
        e07Var.getClass();
        int i = ff8.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        rz6 a = rz6Var.a(pair.second);
        d07 d07Var = (d07) e07Var.e.get(obj2);
        d07Var.getClass();
        e07Var.h.add(d07Var);
        c07 c07Var = (c07) e07Var.g.get(d07Var);
        if (c07Var != null) {
            c07Var.a.f(c07Var.b);
        }
        d07Var.c.add(a);
        hl6 c = d07Var.a.c(a, mx6Var, j2);
        e07Var.d.put(c, d07Var);
        e07Var.c();
        this.a = c;
    }

    public final long a(e0c e0cVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        uh0[] uh0VarArr;
        boolean[] zArr3;
        jr9[] jr9VarArr;
        boolean z2;
        t74[] t74VarArr = (t74[]) e0cVar.d;
        int i = 0;
        while (true) {
            int i2 = e0cVar.b;
            zArr2 = this.i;
            boolean z3 = true;
            if (i >= i2) {
                break;
            }
            if (z || !e0cVar.p(this.o, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        int i3 = 0;
        while (true) {
            uh0VarArr = this.j;
            int length = uh0VarArr.length;
            zArr3 = zArr2;
            jr9VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (uh0VarArr[i3].b == -2) {
                jr9VarArr[i3] = 0;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = e0cVar;
        c();
        long c = this.a.c(t74VarArr, zArr3, jr9VarArr, zArr, j);
        for (int i4 = 0; i4 < uh0VarArr.length; i4++) {
            if (uh0VarArr[i4].b == -2 && this.o.q(i4)) {
                jr9VarArr[i4] = new Object();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < jr9VarArr.length; i5++) {
            if (jr9VarArr[i5] != 0) {
                jte.p(e0cVar.q(i5));
                if (uh0VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                if (t74VarArr[i5] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jte.p(z2);
            }
        }
        return c;
    }

    public final void b() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                e0c e0cVar = this.o;
                if (i < e0cVar.b) {
                    boolean q = e0cVar.q(i);
                    t74 t74Var = ((t74[]) this.o.d)[i];
                    if (q && t74Var != null) {
                        t74Var.m();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                e0c e0cVar = this.o;
                if (i < e0cVar.b) {
                    boolean q = e0cVar.q(i);
                    t74 t74Var = ((t74[]) this.o.d)[i];
                    if (q && t74Var != null) {
                        t74Var.j();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j;
        if (!this.e) {
            return this.g.b;
        }
        if (this.f) {
            j = this.a.s();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.g.e;
        }
        return j;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, bqb bqbVar, boolean z) {
        this.e = true;
        this.n = this.a.q();
        e0c j = j(f, bqbVar, z);
        vt6 vt6Var = this.g;
        long j2 = vt6Var.b;
        long j3 = vt6Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        vt6 vt6Var2 = this.g;
        this.p = (vt6Var2.b - a) + j4;
        this.g = vt6Var2.b(a, vt6Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f || this.a.s() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.g.b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        e07 e07Var = this.l;
        hl6 hl6Var = this.a;
        try {
            IdentityHashMap identityHashMap = e07Var.d;
            d07 d07Var = (d07) identityHashMap.remove(hl6Var);
            d07Var.getClass();
            d07Var.a.o(hl6Var);
            d07Var.c.remove(hl6Var.a);
            if (!identityHashMap.isEmpty()) {
                e07Var.c();
            }
            e07Var.d(d07Var);
        } catch (RuntimeException e) {
            ncd.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final e0c j(float f, bqb bqbVar, boolean z) {
        int i;
        ae3 ae3Var;
        int i2;
        boolean z2;
        int[] iArr;
        Context context;
        String str;
        ae3 ae3Var2;
        int i3;
        s74[] s74VarArr;
        String str2;
        int[] iArr2;
        vzb[] vzbVarArr;
        int[][][] iArr3;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int[] iArr4;
        eb3 eb3Var;
        y79 f2;
        y79 f3;
        t74[] t74VarArr;
        boolean z5;
        boolean z6;
        boolean z7;
        y79 y79Var;
        int i6;
        boolean z8;
        f99 f99Var;
        vh0 maVar;
        int i7;
        int[] iArr5;
        long[][] jArr;
        double d;
        long j;
        String str3;
        Pair l;
        CaptioningManager captioningManager;
        Locale locale;
        Point point;
        Pair l2;
        Pair l3;
        int i8;
        boolean z9;
        Context context2;
        int i9;
        int[] iArr6;
        int i10;
        fe3 fe3Var = this.k;
        uh0[] uh0VarArr = this.j;
        vzb vzbVar = this.n;
        fe3Var.getClass();
        int i11 = 1;
        int[] iArr7 = new int[uh0VarArr.length + 1];
        int length = uh0VarArr.length + 1;
        uzb[][] uzbVarArr = new uzb[length];
        int[][][] iArr8 = new int[uh0VarArr.length + 1][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = vzbVar.a;
            uzbVarArr[i12] = new uzb[i13];
            iArr8[i12] = new int[i13];
        }
        int length2 = uh0VarArr.length;
        int[] iArr9 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            iArr9[i14] = uh0VarArr[i14].H();
        }
        int i15 = 0;
        while (i15 < vzbVar.a) {
            uzb a = vzbVar.a(i15);
            if (a.c == 5) {
                i9 = i11;
            } else {
                i9 = 0;
            }
            int length3 = uh0VarArr.length;
            int i16 = i11;
            int i17 = 0;
            int i18 = 0;
            while (i18 < uh0VarArr.length) {
                uh0 uh0Var = uh0VarArr[i18];
                vzb vzbVar2 = vzbVar;
                int[] iArr10 = iArr7;
                int i19 = i11;
                int i20 = 0;
                for (int i21 = 0; i21 < a.a; i21++) {
                    i20 = Math.max(i20, uh0Var.G(a.d[i21]) & 7);
                }
                if (iArr10[i18] == 0) {
                    i10 = i19;
                } else {
                    i10 = 0;
                }
                if (i20 > i17 || (i20 == i17 && i9 != 0 && i16 == 0 && i10 != 0)) {
                    i17 = i20;
                    i16 = i10;
                    length3 = i18;
                }
                i18++;
                vzbVar = vzbVar2;
                iArr7 = iArr10;
                i11 = i19;
            }
            vzb vzbVar3 = vzbVar;
            int[] iArr11 = iArr7;
            int i22 = i11;
            if (length3 == uh0VarArr.length) {
                iArr6 = new int[a.a];
            } else {
                uh0 uh0Var2 = uh0VarArr[length3];
                int[] iArr12 = new int[a.a];
                for (int i23 = 0; i23 < a.a; i23++) {
                    iArr12[i23] = uh0Var2.G(a.d[i23]);
                }
                iArr6 = iArr12;
            }
            int i24 = iArr11[length3];
            uzbVarArr[length3][i24] = a;
            iArr8[length3][i24] = iArr6;
            iArr11[length3] = i24 + 1;
            i15++;
            vzbVar = vzbVar3;
            iArr7 = iArr11;
            i11 = i22;
        }
        int[] iArr13 = iArr7;
        int i25 = i11;
        vzb[] vzbVarArr2 = new vzb[uh0VarArr.length];
        String[] strArr = new String[uh0VarArr.length];
        int[] iArr14 = new int[uh0VarArr.length];
        for (int i26 = 0; i26 < uh0VarArr.length; i26++) {
            int i27 = iArr13[i26];
            vzbVarArr2[i26] = new vzb((uzb[]) hac.V(i27, uzbVarArr[i26]));
            iArr8[i26] = (int[][]) hac.V(i27, iArr8[i26]);
            strArr[i26] = uh0VarArr[i26].l();
            iArr14[i26] = uh0VarArr[i26].b;
        }
        int[] iArr15 = iArr14;
        kp kpVar = new kp(iArr15, vzbVarArr2, iArr9, iArr8, new vzb((uzb[]) hac.V(iArr13[uh0VarArr.length], uzbVarArr[uh0VarArr.length])));
        fe3Var.h = Thread.currentThread();
        Boolean bool = fe3Var.k;
        if (bool == null && (context2 = fe3Var.d) != null) {
            bool = Boolean.valueOf(hac.Q(context2));
            fe3Var.k = bool;
        }
        if (fe3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && fe3Var.i == null) {
            fe3Var.i = new tma(fe3Var.d, new xf2(fe3Var, (byte) 27), bool);
        }
        int i28 = kpVar.a;
        s74[] s74VarArr2 = new s74[i28];
        fe3.c(kpVar, fe3Var.g, s74VarArr2);
        fe3.a(kpVar, fe3Var.g, s74VarArr2);
        fe3.b(kpVar, fe3Var.g, s74VarArr2);
        ae3 ae3Var3 = fe3Var.g;
        Context context3 = fe3Var.d;
        int i29 = kpVar.a;
        Pair e = fe3.e(s74VarArr2, i25);
        if (e == null) {
            int i30 = 0;
            while (true) {
                if (i30 < i29) {
                    if (2 == iArr15[i30] && vzbVarArr2[i30].a > 0) {
                        i8 = 2;
                        z9 = true;
                        break;
                    }
                    i30++;
                } else {
                    i8 = 2;
                    z9 = false;
                    break;
                }
            }
            i = i29;
            ae3Var = ae3Var3;
            i2 = i8;
            context = context3;
            wg wgVar = new wg(fe3Var, ae3Var, z9, iArr9, (byte) 3);
            z2 = true;
            iArr = iArr9;
            e = fe3.l(1, kpVar, iArr8, wgVar, new x03((byte) 7));
            if (e != null) {
                s74VarArr2[((Integer) e.second).intValue()] = (s74) e.first;
            }
        } else {
            i = i29;
            ae3Var = ae3Var3;
            i2 = 2;
            z2 = true;
            iArr = iArr9;
            context = context3;
        }
        if (e == null) {
            str = null;
        } else {
            s74 s74Var = (s74) e.first;
            str = s74Var.a.d[s74Var.b[0]].d;
        }
        Pair e2 = fe3.e(s74VarArr2, i2);
        Pair e3 = fe3.e(s74VarArr2, 4);
        if (e2 == null && e3 == null) {
            if (ae3Var.w.a == i2) {
                int i31 = i;
                ae3Var2 = ae3Var;
                i3 = i31;
                s74VarArr = s74VarArr2;
                str2 = str;
                l2 = null;
            } else {
                if (ae3Var.k && context != null) {
                    point = hac.y(context);
                } else {
                    point = null;
                }
                s74VarArr = s74VarArr2;
                int i32 = i;
                ae3Var2 = ae3Var;
                i3 = i32;
                str2 = str;
                l2 = fe3.l(i2, kpVar, iArr8, new lu(ae3Var2, str, iArr, point, (byte) 11), new x03((byte) 6));
            }
            if ((!ae3Var2.E && l2 != null) || ae3Var2.w.a == i2) {
                l3 = null;
            } else {
                l3 = fe3.l(4, kpVar, iArr8, new wm2(ae3Var2, (byte) 21), new x03((byte) 5));
            }
            if (l3 != null) {
                s74VarArr[((Integer) l3.second).intValue()] = (s74) l3.first;
            } else if (l2 != null) {
                s74VarArr[((Integer) l2.second).intValue()] = (s74) l2.first;
            }
        } else {
            int i33 = i;
            ae3Var2 = ae3Var;
            i3 = i33;
            s74VarArr = s74VarArr2;
            str2 = str;
        }
        if (fe3.e(s74VarArr, 3) == null) {
            if (ae3Var2.w.a == 2) {
                l = null;
            } else {
                if (ae3Var2.B && context != null && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
                    String str4 = hac.a;
                    str3 = locale.toLanguageTag();
                } else {
                    str3 = null;
                }
                l = fe3.l(3, kpVar, iArr8, new wu2(ae3Var2, str2, str3, (byte) 5), new x03((byte) 8));
            }
            if (l != null) {
                s74VarArr[((Integer) l.second).intValue()] = (s74) l.first;
            }
        }
        int a2 = kt6.a(0, 0, 0, 0);
        if (ae3Var2.w.a == 2) {
            iArr2 = iArr15;
            vzbVarArr = vzbVarArr2;
            iArr3 = iArr8;
        } else {
            int i34 = yo5.c;
            ?? eo5Var = new eo5(4);
            int i35 = 0;
            while (i35 < i28) {
                s74 s74Var2 = s74VarArr[i35];
                if (s74Var2 != null) {
                    uzb uzbVar = s74Var2.a;
                    if (!ae3Var2.E0.get(i35)) {
                        i5 = i35;
                        if (!ae3Var2.I.contains(Integer.valueOf(uzbVar.c))) {
                            eo5Var.f(uzbVar.b);
                            int i36 = 0;
                            while (true) {
                                int[] iArr16 = s74Var2.b;
                                iArr4 = iArr15;
                                if (i36 < iArr16.length) {
                                    String str5 = uzbVar.d[iArr16[i36]].n;
                                    if (str5 != null) {
                                        eo5Var.c(str5);
                                    }
                                    i36++;
                                    iArr15 = iArr4;
                                }
                            }
                            i35 = i5 + 1;
                            iArr15 = iArr4;
                        }
                        iArr4 = iArr15;
                        i35 = i5 + 1;
                        iArr15 = iArr4;
                    }
                }
                i5 = i35;
                iArr4 = iArr15;
                i35 = i5 + 1;
                iArr15 = iArr4;
            }
            iArr2 = iArr15;
            yo5 g = eo5Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i37 = 0;
            while (i37 < i3) {
                if (iArr2[i37] != 5) {
                    i4 = i37;
                } else {
                    vzb vzbVar4 = vzbVarArr2[i37];
                    i4 = i37;
                    int i38 = 0;
                    while (i38 < vzbVar4.a) {
                        uzb a3 = vzbVar4.a(i38);
                        arrayList.add(a3);
                        vzb[] vzbVarArr3 = vzbVarArr2;
                        int[] iArr17 = (int[]) iArr8[i4][i38].clone();
                        vzb vzbVar5 = vzbVar4;
                        int[][][] iArr18 = iArr8;
                        for (int i39 = 0; i39 < iArr17.length; i39++) {
                            String str6 = a3.d[i39].n;
                            if (str6 != null && !g.contains(str6)) {
                                iArr17[i39] = a2;
                            }
                        }
                        arrayList2.add(iArr17);
                        i38++;
                        vzbVar4 = vzbVar5;
                        vzbVarArr2 = vzbVarArr3;
                        iArr8 = iArr18;
                    }
                }
                i37 = i4 + 1;
                vzbVarArr2 = vzbVarArr2;
                iArr8 = iArr8;
            }
            vzbVarArr = vzbVarArr2;
            iArr3 = iArr8;
            int size = arrayList.size();
            uzb[] uzbVarArr2 = new uzb[size];
            if (arrayList.size() == size) {
                z3 = true;
            } else {
                z3 = false;
            }
            jte.p(z3);
            arrayList.toArray(uzbVarArr2);
            vzb vzbVar6 = new vzb(uzbVarArr2);
            int size2 = arrayList2.size();
            int[][] iArr19 = new int[size2];
            if (arrayList2.size() == size2) {
                z4 = true;
            } else {
                z4 = false;
            }
            jte.p(z4);
            arrayList2.toArray(iArr19);
            for (int i40 = 0; i40 < i3; i40++) {
                if (iArr2[i40] == 5) {
                    s74 k = fe3.k(vzbVar6, iArr19, ae3Var2);
                    s74VarArr[i40] = k;
                    if (k == null) {
                        break;
                    }
                    Arrays.fill(iArr19[vzbVar6.b(k.a)], a2);
                }
            }
        }
        for (int i41 = 0; i41 < i3; i41++) {
            int i42 = iArr2[i41];
            if (i42 != 2 && i42 != 1 && i42 != 3 && i42 != 4 && i42 != 5 && s74VarArr[i41] == null) {
                s74VarArr[i41] = fe3.k(vzbVarArr[i41], iArr3[i41], ae3Var2);
            }
        }
        fe3.c(kpVar, fe3Var.g, s74VarArr);
        fe3.a(kpVar, fe3Var.g, s74VarArr);
        fe3.b(kpVar, fe3Var.g, s74VarArr);
        q7f q7fVar = fe3Var.e;
        eb3 eb3Var2 = fe3Var.b;
        eb3Var2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (s74 s74Var3 : s74VarArr) {
            if (s74Var3 != null && s74Var3.b.length > 1) {
                jo5 p = mo5.p();
                p.c(new la(0L, 0L));
                arrayList3.add(p);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = s74VarArr.length;
        long[][] jArr2 = new long[length4];
        for (int i43 = 0; i43 < s74VarArr.length; i43++) {
            s74 s74Var4 = s74VarArr[i43];
            if (s74Var4 == null) {
                jArr2[i43] = new long[0];
            } else {
                int[] iArr20 = s74Var4.b;
                jArr2[i43] = new long[iArr20.length];
                for (int i44 = 0; i44 < iArr20.length; i44++) {
                    long j2 = s74Var4.a.d[iArr20[i44]].k;
                    long[] jArr3 = jArr2[i43];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr3[i44] = j2;
                }
                Arrays.sort(jArr2[i43]);
            }
        }
        int[] iArr21 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i45 = 0; i45 < length4; i45++) {
            long[] jArr5 = jArr2[i45];
            if (jArr5.length == 0) {
                j = 0;
            } else {
                j = jArr5[0];
            }
            jArr4[i45] = j;
        }
        ma.w(arrayList3, jArr4);
        ntd.b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(jk7.b);
        ?? obj = new Object();
        ntd.b(2, "expectedValuesPerKey");
        zi7 zi7Var = new zi7(treeMap);
        zi7Var.h = obj;
        int i46 = 0;
        loop13: while (true) {
            if (i46 < length4) {
                long[] jArr6 = jArr2[i46];
                if (jArr6.length <= 1) {
                    eb3Var = eb3Var2;
                    i7 = length4;
                    iArr5 = iArr21;
                    jArr = jArr2;
                } else {
                    int length5 = jArr6.length;
                    double[] dArr = new double[length5];
                    eb3Var = eb3Var2;
                    int i47 = 0;
                    while (true) {
                        long[] jArr7 = jArr2[i46];
                        i7 = length4;
                        double d2 = 0.0d;
                        iArr5 = iArr21;
                        if (i47 >= jArr7.length) {
                            break;
                        }
                        long[][] jArr8 = jArr2;
                        long j3 = jArr7[i47];
                        if (j3 != -1) {
                            d2 = Math.log(j3);
                        }
                        dArr[i47] = d2;
                        i47++;
                        jArr2 = jArr8;
                        length4 = i7;
                        iArr21 = iArr5;
                    }
                    long[][] jArr9 = jArr2;
                    int i48 = length5 - 1;
                    double d3 = dArr[i48] - dArr[0];
                    int i49 = 0;
                    while (i49 < i48) {
                        double d4 = dArr[i49];
                        int i50 = i49 + 1;
                        double d5 = (d4 + dArr[i50]) * 0.5d;
                        if (d3 == 0.0d) {
                            d = 1.0d;
                        } else {
                            d = (d5 - dArr[0]) / d3;
                        }
                        Double valueOf = Double.valueOf(d);
                        Integer valueOf2 = Integer.valueOf(i46);
                        long[][] jArr10 = jArr9;
                        Map map = zi7Var.e;
                        double d6 = d3;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            Collection m = zi7Var.m();
                            if (m.add(valueOf2)) {
                                zi7Var.f++;
                                map.put(valueOf, m);
                            } else {
                                bh7.j("New Collection violated the Collection spec");
                                f2 = null;
                                break loop13;
                            }
                        } else if (collection.add(valueOf2)) {
                            zi7Var.f++;
                        }
                        i49 = i50;
                        jArr9 = jArr10;
                        d3 = d6;
                    }
                    jArr = jArr9;
                }
                i46++;
                length4 = i7;
                iArr21 = iArr5;
                jArr2 = jArr;
                eb3Var2 = eb3Var;
            } else {
                eb3Var = eb3Var2;
                int[] iArr22 = iArr21;
                long[][] jArr11 = jArr2;
                Collection collection2 = zi7Var.c;
                if (collection2 == null) {
                    collection2 = new p3(zi7Var, (byte) 1);
                    zi7Var.c = collection2;
                }
                mo5 q = mo5.q(collection2);
                for (int i51 = 0; i51 < q.size(); i51++) {
                    int intValue = ((Integer) q.get(i51)).intValue();
                    int i52 = iArr22[intValue] + 1;
                    iArr22[intValue] = i52;
                    jArr4[intValue] = jArr11[intValue][i52];
                    ma.w(arrayList3, jArr4);
                }
                for (int i53 = 0; i53 < s74VarArr.length; i53++) {
                    if (arrayList3.get(i53) != null) {
                        jArr4[i53] = jArr4[i53] << 1;
                    }
                }
                ma.w(arrayList3, jArr4);
                jo5 p2 = mo5.p();
                for (int i54 = 0; i54 < arrayList3.size(); i54++) {
                    jo5 jo5Var = (jo5) arrayList3.get(i54);
                    if (jo5Var == null) {
                        f3 = y79.e;
                    } else {
                        f3 = jo5Var.f();
                    }
                    p2.c(f3);
                }
                f2 = p2.f();
            }
        }
        t74[] t74VarArr2 = new t74[s74VarArr.length];
        for (int i55 = 0; i55 < s74VarArr.length; i55++) {
            s74 s74Var5 = s74VarArr[i55];
            if (s74Var5 != null) {
                int[] iArr23 = s74Var5.b;
                if (iArr23.length != 0) {
                    int length6 = iArr23.length;
                    uzb uzbVar2 = s74Var5.a;
                    if (length6 == 1) {
                        maVar = new vh0(0, uzbVar2, new int[]{iArr23[0]});
                    } else {
                        maVar = new ma(uzbVar2, iArr23, eb3Var, 10000L, 25000L, 25000L, (mo5) f2.get(i55));
                    }
                    t74VarArr2[i55] = maVar;
                }
            }
        }
        f99[] f99VarArr = new f99[i28];
        for (int i56 = 0; i56 < i28; i56++) {
            int i57 = ((int[]) kpVar.b)[i56];
            if (!fe3Var.g.E0.get(i56) && !fe3Var.g.I.contains(Integer.valueOf(i57)) && (((int[]) kpVar.b)[i56] == -2 || t74VarArr2[i56] != null)) {
                f99Var = f99.c;
            } else {
                f99Var = null;
            }
            f99VarArr[i56] = f99Var;
        }
        fe3Var.g.getClass();
        ae3 ae3Var4 = fe3Var.g;
        if (ae3Var4.w.a != 0) {
            int i58 = 0;
            int i59 = 0;
            int i60 = -1;
            while (true) {
                if (i58 < kpVar.a) {
                    int i61 = ((int[]) kpVar.b)[i58];
                    t74 t74Var = t74VarArr2[i58];
                    if (i61 != 1) {
                        if (t74Var != null) {
                            break;
                        }
                    } else if (t74Var != null && t74Var.length() == 1) {
                        if (fe3.j(ae3Var4, iArr3[i58][((vzb[]) kpVar.c)[i58].b(t74Var.c())][t74Var.k(0)], t74Var.o())) {
                            i59++;
                            i60 = i58;
                        }
                    }
                    i58++;
                } else if (i59 == 1) {
                    if (ae3Var4.w.b) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    f99 f99Var2 = f99VarArr[i60];
                    if (f99Var2 != null && f99Var2.b) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    f99VarArr[i60] = new f99(i6, z8);
                }
            }
        }
        Pair create = Pair.create(f99VarArr, t74VarArr2);
        t74[] t74VarArr3 = (t74[]) create.second;
        int length7 = t74VarArr3.length;
        List[] listArr = new List[length7];
        for (int i62 = 0; i62 < t74VarArr3.length; i62++) {
            t74 t74Var2 = t74VarArr3[i62];
            if (t74Var2 != null) {
                y79Var = mo5.u(t74Var2);
            } else {
                ko5 ko5Var = mo5.b;
                y79Var = y79.e;
            }
            listArr[i62] = y79Var;
        }
        ?? eo5Var2 = new eo5(4);
        int i63 = 0;
        while (true) {
            int i64 = kpVar.a;
            vzb[] vzbVarArr4 = (vzb[]) kpVar.c;
            if (i63 >= i64) {
                break;
            }
            vzb vzbVar7 = vzbVarArr4[i63];
            int i65 = 0;
            while (i65 < vzbVar7.a) {
                uzb a4 = vzbVar7.a(i65);
                int i66 = vzbVarArr4[i63].a(i65).a;
                int[] iArr24 = new int[i66];
                int i67 = 0;
                int i68 = 0;
                while (i68 < i66) {
                    List[] listArr2 = listArr;
                    if ((((int[][][]) kpVar.e)[i63][i65][i68] & 7) == 4) {
                        iArr24[i67] = i68;
                        i67++;
                    }
                    i68++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr24, i67);
                int i69 = 16;
                int i70 = i63;
                String str7 = null;
                int i71 = 0;
                boolean z10 = false;
                int i72 = 0;
                while (i71 < copyOf.length) {
                    int[] iArr25 = copyOf;
                    String str8 = vzbVarArr4[i70].a(i65).d[copyOf[i71]].t;
                    int i73 = i72 + 1;
                    if (i72 == 0) {
                        str7 = str8;
                    } else {
                        z10 |= !Objects.equals(str7, str8);
                    }
                    i69 = Math.min(i69, ((int[][][]) kpVar.e)[i70][i65][i71] & 24);
                    i71++;
                    i72 = i73;
                    copyOf = iArr25;
                }
                if (z10) {
                    i69 = Math.min(i69, ((int[]) kpVar.d)[i70]);
                }
                if (i69 != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int i74 = a4.a;
                int[] iArr26 = new int[i74];
                boolean[] zArr = new boolean[i74];
                int i75 = 0;
                while (i75 < a4.a) {
                    iArr26[i75] = ((int[][][]) kpVar.e)[i70][i65][i75] & 7;
                    int i76 = 0;
                    boolean z11 = false;
                    while (i76 < length7) {
                        List list = listArr3[i76];
                        int i77 = length7;
                        vzb vzbVar8 = vzbVar7;
                        int i78 = 0;
                        while (true) {
                            if (i78 < list.size()) {
                                t74 t74Var3 = (t74) list.get(i78);
                                int i79 = i78;
                                if (t74Var3.c().equals(a4) && t74Var3.v(i75) != -1) {
                                    z11 = true;
                                    break;
                                }
                                i78 = i79 + 1;
                            }
                        }
                        i76++;
                        length7 = i77;
                        vzbVar7 = vzbVar8;
                    }
                    zArr[i75] = z11;
                    i75++;
                    vzbVar7 = vzbVar7;
                }
                eo5Var2.c(new f0c(a4, z7, iArr26, zArr));
                i65++;
                listArr = listArr3;
                i63 = i70;
                length7 = length7;
                vzbVar7 = vzbVar7;
            }
            i63++;
        }
        vzb vzbVar9 = (vzb) kpVar.f;
        for (int i80 = 0; i80 < vzbVar9.a; i80++) {
            uzb a5 = vzbVar9.a(i80);
            int[] iArr27 = new int[a5.a];
            Arrays.fill(iArr27, 0);
            eo5Var2.c(new f0c(a5, false, iArr27, new boolean[a5.a]));
        }
        e0c e0cVar = new e0c((f99[]) create.first, (t74[]) create.second, new g0c(eo5Var2.f()), kpVar);
        for (int i81 = 0; i81 < e0cVar.b; i81++) {
            boolean q2 = e0cVar.q(i81);
            t74[] t74VarArr4 = (t74[]) e0cVar.d;
            if (q2) {
                if (t74VarArr4[i81] == null && this.j[i81].b != -2) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                jte.p(z6);
            } else {
                if (t74VarArr4[i81] == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                jte.p(z5);
            }
        }
        for (t74 t74Var4 : (t74[]) e0cVar.d) {
            if (t74Var4 != null) {
                t74Var4.r(f);
                t74Var4.h(z);
            }
        }
        return e0cVar;
    }
}
