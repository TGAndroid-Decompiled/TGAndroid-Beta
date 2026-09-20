package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.r1;
import b2.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.r50;
import org.telegram.ui.mb1;
import v7.z7;
public final class t0 {
    public final Object f10878a;
    public final Object f10879b;
    public final u2.c1[] f10880c;
    public boolean d;
    public boolean e;
    public boolean f10881f;
    public u0 f10882g;
    public boolean h;
    public final boolean[] f10883i;
    public final f[] f10884j;
    public final x2.v f10885k;
    public final f1 f10886l;
    public t0 f10887m;
    public u2.p1 f10888n;
    public x2.w f10889o;
    public long f10890p;

    public t0(f[] fVarArr, long j3, x2.v vVar, y2.d dVar, f1 f1Var, u0 u0Var, x2.w wVar) {
        this.f10884j = fVarArr;
        this.f10890p = j3;
        this.f10885k = vVar;
        this.f10886l = f1Var;
        u2.f0 f0Var = u0Var.f10892a;
        this.f10879b = f0Var.f43653a;
        this.f10882g = u0Var;
        this.f10888n = u2.p1.d;
        this.f10889o = wVar;
        this.f10880c = new u2.c1[fVarArr.length];
        this.f10883i = new boolean[fVarArr.length];
        long j10 = u0Var.f10893b;
        long j11 = u0Var.d;
        boolean z10 = u0Var.f10895f;
        f1Var.getClass();
        Object obj = f0Var.f43653a;
        int i10 = a.f10615g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.f0 a2 = f0Var.a(pair.second);
        e1 e1Var = (e1) f1Var.d.get(obj2);
        e1Var.getClass();
        f1Var.f10702g.add(e1Var);
        d1 d1Var = (d1) f1Var.f10701f.get(e1Var);
        if (d1Var != null) {
            d1Var.f10640a.f(d1Var.f10641b);
        }
        e1Var.f10684c.add(a2);
        u2.x c10 = e1Var.f10682a.c(a2, dVar, j10);
        f1Var.f10700c.put(c10, e1Var);
        f1Var.c();
        this.f10878a = j11 != -9223372036854775807L ? new u2.d(c10, !z10, 0L, j11) : c10;
    }

    public final long a(x2.w wVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= wVar.f45514a) {
                break;
            }
            if (z10 || !wVar.a(this.f10889o, i10)) {
                z12 = false;
            }
            this.f10883i[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            fVarArr = this.f10884j;
            int length = fVarArr.length;
            objArr = this.f10880c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].f10686b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f10889o = wVar;
        c();
        long q6 = this.f10878a.q(wVar.f45516c, this.f10883i, this.f10880c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].f10686b == -2 && this.f10889o.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f10881f = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                e2.d.g(wVar.b(i13));
                if (fVarArr[i13].f10686b != -2) {
                    this.f10881f = true;
                }
            } else {
                if (wVar.f45516c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.g(z11);
            }
        }
        return q6;
    }

    public final void b() {
        if (this.f10887m == null) {
            int i10 = 0;
            while (true) {
                x2.w wVar = this.f10889o;
                if (i10 < wVar.f45514a) {
                    boolean b10 = wVar.b(i10);
                    x2.s sVar = this.f10889o.f45516c[i10];
                    if (b10 && sVar != null) {
                        sVar.j();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f10887m == null) {
            int i10 = 0;
            while (true) {
                x2.w wVar = this.f10889o;
                if (i10 < wVar.f45514a) {
                    boolean b10 = wVar.b(i10);
                    x2.s sVar = this.f10889o.f45516c[i10];
                    if (b10 && sVar != null) {
                        sVar.g();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j3;
        if (!this.e) {
            return this.f10882g.f10893b;
        }
        if (this.f10881f) {
            j3 = this.f10878a.s();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f10882g.e;
        }
        return j3;
    }

    public final long e() {
        return this.f10882g.f10893b + this.f10890p;
    }

    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.e = true;
        this.f10888n = this.f10878a.r();
        x2.w j3 = j(f7, k1Var, z10);
        u0 u0Var = this.f10882g;
        long j10 = u0Var.f10893b;
        long j11 = u0Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.f10884j.length]);
        long j12 = this.f10890p;
        u0 u0Var2 = this.f10882g;
        this.f10890p = (u0Var2.f10893b - a2) + j12;
        this.f10882g = u0Var2.b(a2);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f10881f || this.f10878a.s() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.f10882g.f10893b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f10878a;
        try {
            boolean z10 = r02 instanceof u2.d;
            f1 f1Var = this.f10886l;
            if (z10) {
                f1Var.f(((u2.d) r02).f43641a);
            } else {
                f1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.f("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.w j(float f7, b2.k1 k1Var, boolean z10) {
        x2.j jVar;
        boolean z11;
        String str;
        String str2;
        Object obj;
        Pair j3;
        int[] iArr;
        Pair pair;
        String str3;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pair2;
        x2.s[] sVarArr;
        boolean z12;
        boolean z13;
        e9.a1 a1Var;
        x2.c bVar;
        e9.a1 i10;
        y2.c cVar;
        int i11;
        int[] iArr2;
        x2.u uVar;
        b2.l1 l1Var;
        int i12;
        b2.o1 o1Var;
        Object rVar;
        int i13;
        b2.l1 l1Var2;
        Context context;
        int[] iArr3;
        x2.v vVar = this.f10885k;
        f[] fVarArr = this.f10884j;
        u2.p1 p1Var = this.f10888n;
        vVar.getClass();
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length];
        int[][][] iArr5 = new int[fVarArr.length + 1][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = p1Var.f43765a;
            l1VarArr[i14] = new b2.l1[i15];
            iArr5[i14] = new int[i15];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr6[i16] = fVarArr[i16].B();
        }
        int i17 = 0;
        while (i17 < p1Var.f43765a) {
            b2.l1 a2 = p1Var.a(i17);
            boolean z14 = a2.f3093c == 5;
            int length3 = fVarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z15 = true;
            while (i18 < fVarArr.length) {
                f fVar = fVarArr[i18];
                x2.v vVar2 = vVar;
                u2.p1 p1Var2 = p1Var;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.f3091a; i21++) {
                    i20 = Math.max(i20, fVar.A(a2.d[i21]) & 7);
                }
                boolean z16 = iArr4[i18] == 0;
                if (i20 > i19 || (i20 == i19 && z14 && !z15 && z16)) {
                    i19 = i20;
                    z15 = z16;
                    length3 = i18;
                }
                i18++;
                vVar = vVar2;
                p1Var = p1Var2;
            }
            x2.v vVar3 = vVar;
            u2.p1 p1Var3 = p1Var;
            if (length3 == fVarArr.length) {
                iArr3 = new int[a2.f3091a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr7 = new int[a2.f3091a];
                for (int i22 = 0; i22 < a2.f3091a; i22++) {
                    iArr7[i22] = fVar2.A(a2.d[i22]);
                }
                iArr3 = iArr7;
            }
            int i23 = iArr4[length3];
            l1VarArr[length3][i23] = a2;
            iArr5[length3][i23] = iArr3;
            iArr4[length3] = i23 + 1;
            i17++;
            vVar = vVar3;
            p1Var = p1Var3;
        }
        x2.v vVar4 = vVar;
        u2.p1[] p1VarArr = new u2.p1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i24 = 0; i24 < fVarArr.length; i24++) {
            int i25 = iArr4[i24];
            p1VarArr[i24] = new u2.p1((b2.l1[]) e2.d0.S(i25, l1VarArr[i24]));
            iArr5[i24] = (int[][]) e2.d0.S(i25, iArr5[i24]);
            strArr[i24] = fVarArr[i24].j();
            iArr8[i24] = fVarArr[i24].f10686b;
        }
        x2.u uVar2 = new x2.u(iArr8, p1VarArr, iArr6, iArr5, new u2.p1((b2.l1[]) e2.d0.S(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.q qVar = (x2.q) vVar4;
        synchronized (qVar.d) {
            qVar.h = Thread.currentThread();
            jVar = qVar.f45501g;
        }
        if (qVar.f45504k == null && (context = qVar.e) != null) {
            qVar.f45504k = Boolean.valueOf(e2.d0.N(context));
        }
        if (jVar.f45474s0 && Build.VERSION.SDK_INT >= 32 && qVar.f45502i == null) {
            qVar.f45502i = new x2.l(qVar.e, qVar, qVar.f45504k);
        }
        int i26 = uVar2.f45507a;
        Context context2 = qVar.e;
        x2.r[] rVarArr = new x2.r[i26];
        int i27 = 0;
        while (true) {
            if (i27 >= uVar2.f45507a) {
                z11 = false;
                break;
            } else if (2 == iArr8[i27] && p1VarArr[i27].f43765a > 0) {
                z11 = true;
                break;
            } else {
                i27++;
            }
        }
        Pair j10 = x2.q.j(1, uVar2, iArr5, new ca.b(qVar, jVar, z11, iArr6, 7), new mb1(14));
        if (j10 != null) {
            rVarArr[((Integer) j10.second).intValue()] = (x2.r) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.r rVar2 = (x2.r) j10.first;
            str = rVar2.f45505a.d[rVar2.f45506b[0]].d;
        }
        b2.o1 o1Var2 = jVar.f3235u;
        if (o1Var2.f3172a == 2) {
            str2 = str;
            j3 = null;
            obj = null;
        } else {
            a1.d dVar = new a1.d(jVar, str, iArr6, (!jVar.f3225k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            obj = null;
            j3 = x2.q.j(2, uVar2, iArr5, dVar, new mb1(13));
        }
        int i28 = 4;
        if ((jVar.A || j3 == null) && o1Var2.f3172a != 2) {
            iArr = iArr8;
            pair = x2.q.j(4, uVar2, iArr5, new r5.d(jVar, 13), new mb1(12));
        } else {
            iArr = iArr8;
            pair = obj;
        }
        if (pair != 0) {
            rVarArr[((Integer) pair.second).intValue()] = (x2.r) pair.first;
        } else if (j3 != null) {
            rVarArr[((Integer) j3.second).intValue()] = (x2.r) j3.first;
        }
        int i29 = 3;
        if (o1Var2.f3172a == 2) {
            pair2 = obj;
        } else {
            if (!jVar.f3237x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = obj;
            } else {
                String str4 = e2.d0.f7888a;
                str3 = locale.toLanguageTag();
            }
            pair2 = x2.q.j(3, uVar2, iArr5, new r50(jVar, str2, str3, 10), new mb1(15));
        }
        if (pair2 != 0) {
            rVarArr[((Integer) pair2.second).intValue()] = (x2.r) pair2.first;
        }
        int i30 = 0;
        while (i30 < i26) {
            int i31 = iArr[i30];
            if (i31 == 2 || i31 == 1 || i31 == i29 || i31 == i28) {
                i12 = i30;
                o1Var = o1Var2;
            } else {
                u2.p1 p1Var4 = p1VarArr[i30];
                int[][] iArr9 = iArr5[i30];
                if (o1Var2.f3172a == 2) {
                    i12 = i30;
                    o1Var = o1Var2;
                } else {
                    b2.l1 l1Var3 = obj;
                    b2.l1 l1Var4 = l1Var3;
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < p1Var4.f43765a) {
                        b2.l1 a10 = p1Var4.a(i32);
                        int[] iArr10 = iArr9[i32];
                        int i34 = i30;
                        b2.o1 o1Var3 = o1Var2;
                        x2.g gVar = l1Var4;
                        int i35 = i33;
                        b2.l1 l1Var5 = l1Var3;
                        int i36 = 0;
                        while (i36 < a10.f3091a) {
                            u2.p1 p1Var5 = p1Var4;
                            if (hg.k0.d(iArr10[i36], jVar.f45475t0)) {
                                i13 = i36;
                                x2.g gVar2 = new x2.g(a10.d[i36], iArr10[i13]);
                                if (gVar != 0) {
                                    l1Var2 = a10;
                                    if (e9.z.f8146a.c(gVar2.f45465b, gVar.f45465b).c(gVar2.f45464a, gVar.f45464a).e() <= 0) {
                                    }
                                } else {
                                    l1Var2 = a10;
                                }
                                gVar = gVar2;
                                i35 = i13;
                                l1Var5 = l1Var2;
                            } else {
                                i13 = i36;
                                l1Var2 = a10;
                            }
                            i36 = i13 + 1;
                            p1Var4 = p1Var5;
                            a10 = l1Var2;
                            gVar = gVar;
                        }
                        i32++;
                        l1Var3 = l1Var5;
                        i33 = i35;
                        o1Var2 = o1Var3;
                        l1Var4 = gVar;
                        i30 = i34;
                    }
                    i12 = i30;
                    o1Var = o1Var2;
                    if (l1Var3 != null) {
                        rVar = new x2.r(l1Var3, i33);
                        rVarArr[i12] = rVar;
                    }
                }
                rVar = obj;
                rVarArr[i12] = rVar;
            }
            i30 = i12 + 1;
            o1Var2 = o1Var;
            i29 = 3;
            i28 = 4;
        }
        int i37 = uVar2.f45507a;
        u2.p1[] p1VarArr2 = uVar2.f45509c;
        HashMap hashMap = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            x2.q.c(p1VarArr2[i38], jVar, hashMap);
        }
        x2.q.c(uVar2.f45510f, jVar, hashMap);
        for (int i39 = 0; i39 < i37; i39++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(uVar2.f45508b[i39]));
            if (m1Var != null) {
                b2.l1 l1Var6 = m1Var.f3118a;
                e9.i0 i0Var = m1Var.f3119b;
                rVarArr[i39] = (i0Var.isEmpty() || p1VarArr2[i39].b(l1Var6) == -1) ? obj : new x2.r(l1Var6, z7.f(i0Var));
            }
        }
        int i40 = uVar2.f45507a;
        for (int i41 = 0; i41 < i40; i41++) {
            u2.p1 p1Var6 = uVar2.f45509c[i41];
            Map map = (Map) jVar.f45477v0.get(i41);
            if (map != null && map.containsKey(p1Var6)) {
                Map map2 = (Map) jVar.f45477v0.get(i41);
                if (map2 != null && map2.get(p1Var6) != null) {
                    throw new ClassCastException();
                }
                rVarArr[i41] = obj;
            }
        }
        for (int i42 = 0; i42 < i26; i42++) {
            int i43 = uVar2.f45508b[i42];
            if (jVar.f45478w0.get(i42) || jVar.E.contains(Integer.valueOf(i43))) {
                rVarArr[i42] = obj;
            }
        }
        qb.b bVar2 = qVar.f45500f;
        y2.c cVar2 = qVar.f45512b;
        e2.d.h(cVar2);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i44 = 0;
        b2.l1 l1Var7 = obj;
        while (i44 < rVarArr.length) {
            x2.r rVar3 = rVarArr[i44];
            if (rVar3 != 0 && rVar3.f45506b.length > 1) {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var = l1Var7;
            } else {
                l1Var = l1Var7;
                arrayList.add(l1Var);
            }
            i44++;
            l1Var7 = l1Var;
        }
        int length4 = rVarArr.length;
        long[][] jArr = new long[length4];
        int i45 = 0;
        while (i45 < rVarArr.length) {
            x2.r rVar4 = rVarArr[i45];
            if (rVar4 == 0) {
                jArr[i45] = new long[0];
                uVar = uVar2;
            } else {
                int[] iArr11 = rVar4.f45506b;
                jArr[i45] = new long[iArr11.length];
                int i46 = 0;
                while (i46 < iArr11.length) {
                    x2.u uVar3 = uVar2;
                    long j11 = rVar4.f45505a.d[iArr11[i46]].f3301j;
                    long[] jArr2 = jArr[i45];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i46] = j11;
                    i46++;
                    uVar2 = uVar3;
                }
                uVar = uVar2;
                Arrays.sort(jArr[i45]);
            }
            i45++;
            uVar2 = uVar;
        }
        x2.u uVar4 = uVar2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.f8143b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f8141f = u0Var;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr5 = jArr[i48];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i11 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i49 = 0;
                while (true) {
                    long[] jArr6 = jArr[i48];
                    i11 = length4;
                    double d = 0.0d;
                    if (i49 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr6[i49];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i49] = d;
                    i49++;
                    length4 = i11;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i50 = length5 - 1;
                double d10 = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d11 = dArr[i51];
                    int i52 = i51 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i52]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i48);
                    double d12 = d10;
                    Map map3 = v0Var.d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        Collection c10 = v0Var.c();
                        if (c10.add(valueOf2)) {
                            v0Var.e++;
                            map3.put(valueOf, c10);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        v0Var.e++;
                    }
                    i51 = i52;
                    d10 = d12;
                }
                continue;
            }
            i48++;
            length4 = i11;
            cVar2 = cVar;
            iArr12 = iArr2;
        }
        y2.c cVar3 = cVar2;
        int[] iArr14 = iArr12;
        e9.n nVar = v0Var.f8109b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.f8109b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i53 = 0; i53 < v.size(); i53++) {
            int intValue = ((Integer) v.get(i53)).intValue();
            int i54 = iArr14[intValue] + 1;
            iArr14[intValue] = i54;
            jArr3[intValue] = jArr[intValue][i54];
            x2.b.v(arrayList, jArr3);
        }
        for (int i55 = 0; i55 < rVarArr.length; i55++) {
            if (arrayList.get(i55) != null) {
                jArr3[i55] = jArr3[i55] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i56 = 0; i56 < arrayList.size(); i56++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i56);
            if (f0Var == null) {
                i10 = e9.a1.e;
            } else {
                i10 = f0Var.i();
            }
            u11.b(i10);
        }
        e9.a1 i57 = u11.i();
        x2.s[] sVarArr2 = new x2.s[rVarArr.length];
        for (int i58 = 0; i58 < rVarArr.length; i58++) {
            x2.r rVar5 = rVarArr[i58];
            if (rVar5 != 0) {
                int[] iArr15 = rVar5.f45506b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.c(rVar5.f45505a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(rVar5.f45505a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i57.get(i58));
                    }
                    sVarArr2[i58] = bVar;
                }
            }
        }
        m1[] m1VarArr = new m1[i26];
        int i59 = 0;
        while (i59 < i26) {
            x2.u uVar5 = uVar4;
            m1VarArr[i59] = (jVar.f45478w0.get(i59) || jVar.E.contains(Integer.valueOf(uVar5.f45508b[i59])) || (uVar5.f45508b[i59] != -2 && sVarArr2[i59] == null)) ? null : m1.f10790c;
            i59++;
            uVar4 = uVar5;
        }
        x2.u uVar6 = uVar4;
        if (jVar.f3235u.f3172a != 0) {
            int i60 = 0;
            int i61 = -1;
            int i62 = 0;
            while (true) {
                if (i62 < uVar6.f45507a) {
                    int i63 = uVar6.f45508b[i62];
                    x2.s sVar = sVarArr2[i62];
                    if (i63 != 1 && sVar != null) {
                        break;
                    }
                    if (i63 == 1 && sVar != null && sVar.length() == 1) {
                        if (x2.q.i(jVar, iArr5[i62][uVar6.f45509c[i62].b(sVar.b())][sVar.h(0)], sVar.m())) {
                            i60++;
                            i61 = i62;
                        }
                    }
                    i62++;
                } else if (i60 == 1) {
                    int i64 = jVar.f3235u.f3173b ? 1 : 2;
                    m1 m1Var2 = m1VarArr[i61];
                    m1VarArr[i61] = new m1(i64, m1Var2 != null && m1Var2.f10792b);
                }
            }
        }
        Pair create = Pair.create(m1VarArr, sVarArr2);
        x2.s[] sVarArr3 = (x2.s[]) create.second;
        List[] listArr = new List[sVarArr3.length];
        for (int i65 = 0; i65 < sVarArr3.length; i65++) {
            x2.s sVar2 = sVarArr3[i65];
            if (sVar2 != null) {
                a1Var = e9.i0.z(sVar2);
            } else {
                e9.g0 g0Var = e9.i0.f8084b;
                a1Var = e9.a1.e;
            }
            listArr[i65] = a1Var;
        }
        ?? wVar = new com.google.android.gms.common.api.internal.w(4);
        int i66 = 0;
        while (true) {
            int i67 = uVar6.f45507a;
            u2.p1[] p1VarArr3 = uVar6.f45509c;
            if (i66 >= i67) {
                break;
            }
            u2.p1 p1Var7 = p1VarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < p1Var7.f43765a) {
                b2.l1 a11 = p1Var7.a(i68);
                int i69 = p1VarArr3[i66].a(i68).f3091a;
                int[] iArr16 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((uVar6.e[i66][i68][i70] & 7) == 4) {
                        iArr16[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i71);
                u2.p1 p1Var8 = p1Var7;
                String str5 = null;
                int i72 = 0;
                boolean z17 = false;
                int i73 = 0;
                int i74 = 16;
                while (i72 < copyOf.length) {
                    String str6 = p1VarArr3[i66].a(i68).d[copyOf[i72]].f3309r;
                    int i75 = i73 + 1;
                    if (i73 == 0) {
                        str5 = str6;
                    } else {
                        z17 = (!Objects.equals(str5, str6)) | z17;
                    }
                    i74 = Math.min(i74, uVar6.e[i66][i68][i72] & 24);
                    i72++;
                    i73 = i75;
                }
                if (z17) {
                    i74 = Math.min(i74, uVar6.d[i66]);
                }
                boolean z18 = i74 != 0;
                int i76 = a11.f3091a;
                int[] iArr17 = new int[i76];
                boolean[] zArr = new boolean[i76];
                for (int i77 = 0; i77 < a11.f3091a; i77++) {
                    iArr17[i77] = uVar6.e[i66][i68][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.s sVar3 = (x2.s) list.get(i78);
                        if (sVar3.b().equals(a11) && sVar3.u(i77) != -1) {
                            z13 = true;
                            break;
                        }
                        i78++;
                    }
                    zArr[i77] = z13;
                }
                wVar.b(new r1(a11, z18, iArr17, zArr));
                i68++;
                listArr = listArr3;
                p1Var7 = p1Var8;
            }
            i66++;
        }
        u2.p1 p1Var9 = uVar6.f45510f;
        for (int i79 = 0; i79 < p1Var9.f43765a; i79++) {
            b2.l1 a12 = p1Var9.a(i79);
            int[] iArr18 = new int[a12.f3091a];
            Arrays.fill(iArr18, 0);
            wVar.b(new r1(a12, false, iArr18, new boolean[a12.f3091a]));
        }
        x2.w wVar2 = new x2.w((m1[]) create.first, (x2.s[]) create.second, new s1(wVar.i()), uVar6);
        for (int i80 = 0; i80 < wVar2.f45514a; i80++) {
            if (wVar2.b(i80)) {
                if (wVar2.f45516c[i80] == null && this.f10884j[i80].f10686b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(wVar2.f45516c[i80] == null);
            }
        }
        for (x2.s sVar4 : wVar2.f45516c) {
            if (sVar4 != null) {
                sVar4.p(f7);
                sVar4.e(z10);
            }
        }
        return wVar2;
    }

    public final void k() {
        Object obj = this.f10878a;
        if (obj instanceof u2.d) {
            long j3 = this.f10882g.d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.e = 0L;
            dVar.f43644f = j3;
        }
    }
}
