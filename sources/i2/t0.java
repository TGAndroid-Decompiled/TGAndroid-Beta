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
import org.telegram.ui.Components.s50;
import org.telegram.ui.kb1;
import v7.y7;
public final class t0 {
    public final Object f10876a;
    public final Object f10877b;
    public final u2.b1[] f10878c;
    public boolean d;
    public boolean e;
    public boolean f10879f;
    public u0 f10880g;
    public boolean h;
    public final boolean[] f10881i;
    public final f[] f10882j;
    public final x2.u f10883k;
    public final f1 f10884l;
    public t0 f10885m;
    public u2.o1 f10886n;
    public x2.v f10887o;
    public long f10888p;

    public t0(f[] fVarArr, long j3, x2.u uVar, y2.d dVar, f1 f1Var, u0 u0Var, x2.v vVar) {
        this.f10882j = fVarArr;
        this.f10888p = j3;
        this.f10883k = uVar;
        this.f10884l = f1Var;
        u2.f0 f0Var = u0Var.f10890a;
        this.f10877b = f0Var.f43353a;
        this.f10880g = u0Var;
        this.f10886n = u2.o1.d;
        this.f10887o = vVar;
        this.f10878c = new u2.b1[fVarArr.length];
        this.f10881i = new boolean[fVarArr.length];
        long j10 = u0Var.f10891b;
        long j11 = u0Var.d;
        boolean z10 = u0Var.f10893f;
        f1Var.getClass();
        Object obj = f0Var.f43353a;
        int i10 = a.f10613g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.f0 a2 = f0Var.a(pair.second);
        e1 e1Var = (e1) f1Var.d.get(obj2);
        e1Var.getClass();
        f1Var.f10700g.add(e1Var);
        d1 d1Var = (d1) f1Var.f10699f.get(e1Var);
        if (d1Var != null) {
            d1Var.f10638a.f(d1Var.f10639b);
        }
        e1Var.f10682c.add(a2);
        u2.x c10 = e1Var.f10680a.c(a2, dVar, j10);
        f1Var.f10698c.put(c10, e1Var);
        f1Var.c();
        this.f10876a = j11 != -9223372036854775807L ? new u2.d(c10, !z10, 0L, j11) : c10;
    }

    public final long a(x2.v vVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= vVar.f45214a) {
                break;
            }
            if (z10 || !vVar.a(this.f10887o, i10)) {
                z12 = false;
            }
            this.f10881i[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            fVarArr = this.f10882j;
            int length = fVarArr.length;
            objArr = this.f10878c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].f10684b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f10887o = vVar;
        c();
        long p5 = this.f10876a.p(vVar.f45216c, this.f10881i, this.f10878c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].f10684b == -2 && this.f10887o.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f10879f = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                e2.d.g(vVar.b(i13));
                if (fVarArr[i13].f10684b != -2) {
                    this.f10879f = true;
                }
            } else {
                if (vVar.f45216c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.g(z11);
            }
        }
        return p5;
    }

    public final void b() {
        if (this.f10885m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f10887o;
                if (i10 < vVar.f45214a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f10887o.f45216c[i10];
                    if (b10 && rVar != null) {
                        rVar.j();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f10885m == null) {
            int i10 = 0;
            while (true) {
                x2.v vVar = this.f10887o;
                if (i10 < vVar.f45214a) {
                    boolean b10 = vVar.b(i10);
                    x2.r rVar = this.f10887o.f45216c[i10];
                    if (b10 && rVar != null) {
                        rVar.g();
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
            return this.f10880g.f10891b;
        }
        if (this.f10879f) {
            j3 = this.f10876a.s();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f10880g.e;
        }
        return j3;
    }

    public final long e() {
        return this.f10880g.f10891b + this.f10888p;
    }

    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.e = true;
        this.f10886n = this.f10876a.r();
        x2.v j3 = j(f7, k1Var, z10);
        u0 u0Var = this.f10880g;
        long j10 = u0Var.f10891b;
        long j11 = u0Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.f10882j.length]);
        long j12 = this.f10888p;
        u0 u0Var2 = this.f10880g;
        this.f10888p = (u0Var2.f10891b - a2) + j12;
        this.f10880g = u0Var2.b(a2);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f10879f || this.f10876a.s() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.f10880g.f10891b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f10876a;
        try {
            boolean z10 = r02 instanceof u2.d;
            f1 f1Var = this.f10884l;
            if (z10) {
                f1Var.f(((u2.d) r02).f43338a);
            } else {
                f1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.f("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.v j(float f7, b2.k1 k1Var, boolean z10) {
        x2.i iVar;
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
        x2.r[] rVarArr;
        boolean z12;
        boolean z13;
        e9.a1 a1Var;
        x2.c bVar;
        e9.a1 i10;
        y2.c cVar;
        int i11;
        int[] iArr2;
        x2.t tVar;
        b2.l1 l1Var;
        int i12;
        b2.o1 o1Var;
        Object qVar;
        int i13;
        int[][] iArr3;
        Context context;
        int[] iArr4;
        x2.u uVar = this.f10883k;
        f[] fVarArr = this.f10882j;
        u2.o1 o1Var2 = this.f10886n;
        uVar.getClass();
        int[] iArr5 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length];
        int[][][] iArr6 = new int[fVarArr.length + 1][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = o1Var2.f43453a;
            l1VarArr[i14] = new b2.l1[i15];
            iArr6[i14] = new int[i15];
        }
        int length2 = fVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr7[i16] = fVarArr[i16].B();
        }
        int i17 = 0;
        while (i17 < o1Var2.f43453a) {
            b2.l1 a2 = o1Var2.a(i17);
            boolean z14 = a2.f3090c == 5;
            int length3 = fVarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z15 = true;
            while (i18 < fVarArr.length) {
                f fVar = fVarArr[i18];
                x2.u uVar2 = uVar;
                u2.o1 o1Var3 = o1Var2;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.f3088a; i21++) {
                    i20 = Math.max(i20, fVar.A(a2.d[i21]) & 7);
                }
                boolean z16 = iArr5[i18] == 0;
                if (i20 > i19 || (i20 == i19 && z14 && !z15 && z16)) {
                    i19 = i20;
                    z15 = z16;
                    length3 = i18;
                }
                i18++;
                uVar = uVar2;
                o1Var2 = o1Var3;
            }
            x2.u uVar3 = uVar;
            u2.o1 o1Var4 = o1Var2;
            if (length3 == fVarArr.length) {
                iArr4 = new int[a2.f3088a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr8 = new int[a2.f3088a];
                for (int i22 = 0; i22 < a2.f3088a; i22++) {
                    iArr8[i22] = fVar2.A(a2.d[i22]);
                }
                iArr4 = iArr8;
            }
            int i23 = iArr5[length3];
            l1VarArr[length3][i23] = a2;
            iArr6[length3][i23] = iArr4;
            iArr5[length3] = i23 + 1;
            i17++;
            uVar = uVar3;
            o1Var2 = o1Var4;
        }
        x2.u uVar4 = uVar;
        u2.o1[] o1VarArr = new u2.o1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr9 = new int[fVarArr.length];
        for (int i24 = 0; i24 < fVarArr.length; i24++) {
            int i25 = iArr5[i24];
            o1VarArr[i24] = new u2.o1((b2.l1[]) e2.d0.S(i25, l1VarArr[i24]));
            iArr6[i24] = (int[][]) e2.d0.S(i25, iArr6[i24]);
            strArr[i24] = fVarArr[i24].j();
            iArr9[i24] = fVarArr[i24].f10684b;
        }
        x2.t tVar2 = new x2.t(iArr9, o1VarArr, iArr7, iArr6, new u2.o1((b2.l1[]) e2.d0.S(iArr5[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.p pVar = (x2.p) uVar4;
        synchronized (pVar.d) {
            pVar.h = Thread.currentThread();
            iVar = pVar.f45201g;
        }
        if (pVar.f45204k == null && (context = pVar.e) != null) {
            pVar.f45204k = Boolean.valueOf(e2.d0.N(context));
        }
        if (iVar.f45174s0 && Build.VERSION.SDK_INT >= 32 && pVar.f45202i == null) {
            pVar.f45202i = new x2.k(pVar.e, pVar, pVar.f45204k);
        }
        int i26 = tVar2.f45207a;
        Context context2 = pVar.e;
        x2.q[] qVarArr = new x2.q[i26];
        int i27 = 0;
        while (true) {
            if (i27 >= tVar2.f45207a) {
                z11 = false;
                break;
            } else if (2 == iArr9[i27] && o1VarArr[i27].f43453a > 0) {
                z11 = true;
                break;
            } else {
                i27++;
            }
        }
        Pair j10 = x2.p.j(1, tVar2, iArr6, new ca.b(pVar, iVar, z11, iArr7, 7), new kb1(14));
        if (j10 != null) {
            qVarArr[((Integer) j10.second).intValue()] = (x2.q) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.q qVar2 = (x2.q) j10.first;
            str = qVar2.f45205a.d[qVar2.f45206b[0]].d;
        }
        b2.o1 o1Var5 = iVar.f3232u;
        if (o1Var5.f3169a == 2) {
            str2 = str;
            j3 = null;
            obj = null;
        } else {
            a1.d dVar = new a1.d(iVar, str, iArr7, (!iVar.f3222k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            obj = null;
            j3 = x2.p.j(2, tVar2, iArr6, dVar, new kb1(13));
        }
        int i28 = 4;
        if ((iVar.A || j3 == null) && o1Var5.f3169a != 2) {
            iArr = iArr9;
            pair = x2.p.j(4, tVar2, iArr6, new r5.e(iVar, 12), new kb1(12));
        } else {
            iArr = iArr9;
            pair = obj;
        }
        if (pair != 0) {
            qVarArr[((Integer) pair.second).intValue()] = (x2.q) pair.first;
        } else if (j3 != null) {
            qVarArr[((Integer) j3.second).intValue()] = (x2.q) j3.first;
        }
        int i29 = 3;
        if (o1Var5.f3169a == 2) {
            pair2 = obj;
        } else {
            if (!iVar.f3234x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = obj;
            } else {
                String str4 = e2.d0.f7885a;
                str3 = locale.toLanguageTag();
            }
            pair2 = x2.p.j(3, tVar2, iArr6, new s50(iVar, str2, str3, 10), new kb1(15));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i30 = 0;
        while (i30 < i26) {
            int i31 = iArr[i30];
            if (i31 == 2 || i31 == 1 || i31 == i29 || i31 == i28) {
                i12 = i30;
                o1Var = o1Var5;
            } else {
                u2.o1 o1Var6 = o1VarArr[i30];
                int[][] iArr10 = iArr6[i30];
                if (o1Var5.f3169a == 2) {
                    i12 = i30;
                    o1Var = o1Var5;
                } else {
                    b2.l1 l1Var2 = obj;
                    b2.l1 l1Var3 = l1Var2;
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < o1Var6.f43453a) {
                        b2.l1 a10 = o1Var6.a(i32);
                        int[] iArr11 = iArr10[i32];
                        int i34 = i30;
                        b2.o1 o1Var7 = o1Var5;
                        x2.g gVar = l1Var3;
                        int i35 = i33;
                        b2.l1 l1Var4 = l1Var2;
                        int i36 = 0;
                        while (i36 < a10.f3088a) {
                            u2.o1 o1Var8 = o1Var6;
                            if (hg.c.d(iArr11[i36], iVar.f45175t0)) {
                                i13 = i36;
                                x2.g gVar2 = new x2.g(a10.d[i36], iArr11[i13]);
                                if (gVar != 0) {
                                    iArr3 = iArr10;
                                    if (e9.z.f8143a.c(gVar2.f45166b, gVar.f45166b).c(gVar2.f45165a, gVar.f45165a).e() <= 0) {
                                    }
                                } else {
                                    iArr3 = iArr10;
                                }
                                gVar = gVar2;
                                l1Var4 = a10;
                                i35 = i13;
                            } else {
                                i13 = i36;
                                iArr3 = iArr10;
                            }
                            i36 = i13 + 1;
                            o1Var6 = o1Var8;
                            iArr10 = iArr3;
                            gVar = gVar;
                        }
                        i32++;
                        l1Var2 = l1Var4;
                        i33 = i35;
                        o1Var5 = o1Var7;
                        l1Var3 = gVar;
                        i30 = i34;
                    }
                    i12 = i30;
                    o1Var = o1Var5;
                    if (l1Var2 != null) {
                        qVar = new x2.q(l1Var2, i33);
                        qVarArr[i12] = qVar;
                    }
                }
                qVar = obj;
                qVarArr[i12] = qVar;
            }
            i30 = i12 + 1;
            o1Var5 = o1Var;
            i29 = 3;
            i28 = 4;
        }
        int i37 = tVar2.f45207a;
        u2.o1[] o1VarArr2 = tVar2.f45209c;
        HashMap hashMap = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            x2.p.c(o1VarArr2[i38], iVar, hashMap);
        }
        x2.p.c(tVar2.f45210f, iVar, hashMap);
        for (int i39 = 0; i39 < i37; i39++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.f45208b[i39]));
            if (m1Var != null) {
                b2.l1 l1Var5 = m1Var.f3115a;
                e9.i0 i0Var = m1Var.f3116b;
                qVarArr[i39] = (i0Var.isEmpty() || o1VarArr2[i39].b(l1Var5) == -1) ? obj : new x2.q(l1Var5, y7.f(i0Var));
            }
        }
        int i40 = tVar2.f45207a;
        for (int i41 = 0; i41 < i40; i41++) {
            u2.o1 o1Var9 = tVar2.f45209c[i41];
            Map map = (Map) iVar.f45177v0.get(i41);
            if (map != null && map.containsKey(o1Var9)) {
                Map map2 = (Map) iVar.f45177v0.get(i41);
                if (map2 != null && map2.get(o1Var9) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i41] = obj;
            }
        }
        for (int i42 = 0; i42 < i26; i42++) {
            int i43 = tVar2.f45208b[i42];
            if (iVar.f45178w0.get(i42) || iVar.E.contains(Integer.valueOf(i43))) {
                qVarArr[i42] = obj;
            }
        }
        qb.b bVar2 = pVar.f45200f;
        y2.c cVar2 = pVar.f45212b;
        e2.d.h(cVar2);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i44 = 0;
        b2.l1 l1Var6 = obj;
        while (i44 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i44];
            if (qVar3 != 0 && qVar3.f45206b.length > 1) {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var = l1Var6;
            } else {
                l1Var = l1Var6;
                arrayList.add(l1Var);
            }
            i44++;
            l1Var6 = l1Var;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4];
        int i45 = 0;
        while (i45 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i45];
            if (qVar4 == 0) {
                jArr[i45] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr12 = qVar4.f45206b;
                jArr[i45] = new long[iArr12.length];
                int i46 = 0;
                while (i46 < iArr12.length) {
                    x2.t tVar3 = tVar2;
                    long j11 = qVar4.f45205a.d[iArr12[i46]].f3298j;
                    long[] jArr2 = jArr[i45];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i46] = j11;
                    i46++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i45]);
            }
            i45++;
            tVar2 = tVar;
        }
        x2.t tVar4 = tVar2;
        int[] iArr13 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.f8140b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f8138f = u0Var;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr5 = jArr[i48];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i11 = length4;
                iArr2 = iArr13;
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
                    int[] iArr14 = iArr13;
                    long j12 = jArr6[i49];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i49] = d;
                    i49++;
                    length4 = i11;
                    iArr13 = iArr14;
                }
                iArr2 = iArr13;
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
            iArr13 = iArr2;
        }
        y2.c cVar3 = cVar2;
        int[] iArr15 = iArr13;
        e9.n nVar = v0Var.f8106b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.f8106b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i53 = 0; i53 < v.size(); i53++) {
            int intValue = ((Integer) v.get(i53)).intValue();
            int i54 = iArr15[intValue] + 1;
            iArr15[intValue] = i54;
            jArr3[intValue] = jArr[intValue][i54];
            x2.b.v(arrayList, jArr3);
        }
        for (int i55 = 0; i55 < qVarArr.length; i55++) {
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
        x2.r[] rVarArr2 = new x2.r[qVarArr.length];
        for (int i58 = 0; i58 < qVarArr.length; i58++) {
            x2.q qVar5 = qVarArr[i58];
            if (qVar5 != 0) {
                int[] iArr16 = qVar5.f45206b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        bVar = new x2.c(qVar5.f45205a, new int[]{iArr16[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.f45205a, iArr16, cVar3, 10000, j13, j13, (e9.i0) i57.get(i58));
                    }
                    rVarArr2[i58] = bVar;
                }
            }
        }
        m1[] m1VarArr = new m1[i26];
        int i59 = 0;
        while (i59 < i26) {
            x2.t tVar5 = tVar4;
            m1VarArr[i59] = (iVar.f45178w0.get(i59) || iVar.E.contains(Integer.valueOf(tVar5.f45208b[i59])) || (tVar5.f45208b[i59] != -2 && rVarArr2[i59] == null)) ? null : m1.f10788c;
            i59++;
            tVar4 = tVar5;
        }
        x2.t tVar6 = tVar4;
        if (iVar.f3232u.f3169a != 0) {
            int i60 = 0;
            int i61 = -1;
            int i62 = 0;
            while (true) {
                if (i62 < tVar6.f45207a) {
                    int i63 = tVar6.f45208b[i62];
                    x2.r rVar = rVarArr2[i62];
                    if (i63 != 1 && rVar != null) {
                        break;
                    }
                    if (i63 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr6[i62][tVar6.f45209c[i62].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i60++;
                            i61 = i62;
                        }
                    }
                    i62++;
                } else if (i60 == 1) {
                    int i64 = iVar.f3232u.f3170b ? 1 : 2;
                    m1 m1Var2 = m1VarArr[i61];
                    m1VarArr[i61] = new m1(i64, m1Var2 != null && m1Var2.f10790b);
                }
            }
        }
        Pair create = Pair.create(m1VarArr, rVarArr2);
        x2.r[] rVarArr3 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr3.length];
        for (int i65 = 0; i65 < rVarArr3.length; i65++) {
            x2.r rVar2 = rVarArr3[i65];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.f8081b;
                a1Var = e9.a1.e;
            }
            listArr[i65] = a1Var;
        }
        ?? wVar = new com.google.android.gms.common.api.internal.w(4);
        int i66 = 0;
        while (true) {
            int i67 = tVar6.f45207a;
            u2.o1[] o1VarArr3 = tVar6.f45209c;
            if (i66 >= i67) {
                break;
            }
            u2.o1 o1Var10 = o1VarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < o1Var10.f43453a) {
                b2.l1 a11 = o1Var10.a(i68);
                int i69 = o1VarArr3[i66].a(i68).f3088a;
                int[] iArr17 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((tVar6.e[i66][i68][i70] & 7) == 4) {
                        iArr17[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr17, i71);
                u2.o1 o1Var11 = o1Var10;
                String str5 = null;
                int i72 = 0;
                boolean z17 = false;
                int i73 = 0;
                int i74 = 16;
                while (i72 < copyOf.length) {
                    String str6 = o1VarArr3[i66].a(i68).d[copyOf[i72]].f3306r;
                    int i75 = i73 + 1;
                    if (i73 == 0) {
                        str5 = str6;
                    } else {
                        z17 = (!Objects.equals(str5, str6)) | z17;
                    }
                    i74 = Math.min(i74, tVar6.e[i66][i68][i72] & 24);
                    i72++;
                    i73 = i75;
                }
                if (z17) {
                    i74 = Math.min(i74, tVar6.d[i66]);
                }
                boolean z18 = i74 != 0;
                int i76 = a11.f3088a;
                int[] iArr18 = new int[i76];
                boolean[] zArr = new boolean[i76];
                for (int i77 = 0; i77 < a11.f3088a; i77++) {
                    iArr18[i77] = tVar6.e[i66][i68][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.r rVar3 = (x2.r) list.get(i78);
                        if (rVar3.b().equals(a11) && rVar3.u(i77) != -1) {
                            z13 = true;
                            break;
                        }
                        i78++;
                    }
                    zArr[i77] = z13;
                }
                wVar.b(new r1(a11, z18, iArr18, zArr));
                i68++;
                listArr = listArr3;
                o1Var10 = o1Var11;
            }
            i66++;
        }
        u2.o1 o1Var12 = tVar6.f45210f;
        for (int i79 = 0; i79 < o1Var12.f43453a; i79++) {
            b2.l1 a12 = o1Var12.a(i79);
            int[] iArr19 = new int[a12.f3088a];
            Arrays.fill(iArr19, 0);
            wVar.b(new r1(a12, false, iArr19, new boolean[a12.f3088a]));
        }
        x2.v vVar = new x2.v((m1[]) create.first, (x2.r[]) create.second, new s1(wVar.i()), tVar6);
        for (int i80 = 0; i80 < vVar.f45214a; i80++) {
            if (vVar.b(i80)) {
                if (vVar.f45216c[i80] == null && this.f10882j[i80].f10684b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.f45216c[i80] == null);
            }
        }
        for (x2.r rVar4 : vVar.f45216c) {
            if (rVar4 != null) {
                rVar4.p(f7);
                rVar4.e(z10);
            }
        }
        return vVar;
    }

    public final void k() {
        Object obj = this.f10876a;
        if (obj instanceof u2.d) {
            long j3 = this.f10880g.d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.e = 0L;
            dVar.f43341f = j3;
        }
    }
}
