package k2;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b8.zb;
import d2.v1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.hr;
public final class x0 {
    public final Object f16760a;
    public final Object f16761b;
    public final w2.d1[] f16762c;
    public boolean d;
    public boolean f16763e;
    public boolean f16764f;
    public y0 f16765g;
    public boolean h;
    public final boolean[] f16766i;
    public final b[] f16767j;
    public final z2.s f16768k;
    public final i1 f16769l;
    public x0 f16770m;
    public w2.r1 f16771n;
    public z2.t f16772o;
    public long f16773p;

    public x0(b[] bVarArr, long j10, z2.s sVar, android.support.v4.media.session.a0 a0Var, i1 i1Var, y0 y0Var, z2.t tVar) {
        this.f16767j = bVarArr;
        this.f16773p = j10;
        this.f16768k = sVar;
        this.f16769l = i1Var;
        w2.g0 g0Var = y0Var.f16777a;
        this.f16761b = g0Var.f57081a;
        this.f16765g = y0Var;
        this.f16771n = w2.r1.d;
        this.f16772o = tVar;
        this.f16762c = new w2.d1[bVarArr.length];
        this.f16766i = new boolean[bVarArr.length];
        long j11 = y0Var.f16778b;
        long j12 = y0Var.f16780e;
        boolean z10 = y0Var.f16782g;
        i1Var.getClass();
        Object obj = g0Var.f57081a;
        int i3 = a.f16436g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        w2.g0 a10 = g0Var.a(pair.second);
        h1 h1Var = (h1) i1Var.d.get(obj2);
        h1Var.getClass();
        i1Var.f16586g.add(h1Var);
        g1 g1Var = (g1) i1Var.f16585f.get(h1Var);
        if (g1Var != null) {
            g1Var.f16509a.f(g1Var.f16510b);
        }
        h1Var.f16533c.add(a10);
        w2.y c2 = h1Var.f16531a.c(a10, a0Var, j11);
        i1Var.f16583c.put(c2, h1Var);
        i1Var.c();
        if (j12 != -9223372036854775807L) {
            c2 = new w2.d(c2, !z10, 0L, j12, 0);
        }
        this.f16760a = c2;
    }

    public final long a(z2.t tVar, long j10, boolean z10, boolean[] zArr) {
        b[] bVarArr;
        Object[] objArr;
        boolean z11;
        int i3 = 0;
        while (true) {
            boolean z12 = true;
            if (i3 >= tVar.f59646a) {
                break;
            }
            if (z10 || !tVar.a(this.f16772o, i3)) {
                z12 = false;
            }
            this.f16766i[i3] = z12;
            i3++;
        }
        int i10 = 0;
        while (true) {
            bVarArr = this.f16767j;
            int length = bVarArr.length;
            objArr = this.f16762c;
            if (i10 >= length) {
                break;
            }
            if (bVarArr[i10].f16444b == -2) {
                objArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f16772o = tVar;
        c();
        long s6 = this.f16760a.s(tVar.f59648c, this.f16766i, this.f16762c, zArr, j10);
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].f16444b == -2 && this.f16772o.b(i11)) {
                objArr[i11] = new Object();
            }
        }
        this.f16764f = false;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] != null) {
                zb.p(tVar.b(i12));
                if (bVarArr[i12].f16444b != -2) {
                    this.f16764f = true;
                }
            } else {
                if (tVar.f59648c[i12] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zb.p(z11);
            }
        }
        return s6;
    }

    public final void b() {
        if (this.f16770m == null) {
            int i3 = 0;
            while (true) {
                z2.t tVar = this.f16772o;
                if (i3 < tVar.f59646a) {
                    boolean b10 = tVar.b(i3);
                    z2.p pVar = this.f16772o.f59648c[i3];
                    if (b10 && pVar != null) {
                        pVar.k();
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f16770m == null) {
            int i3 = 0;
            while (true) {
                z2.t tVar = this.f16772o;
                if (i3 < tVar.f59646a) {
                    boolean b10 = tVar.b(i3);
                    z2.p pVar = this.f16772o.f59648c[i3];
                    if (b10 && pVar != null) {
                        pVar.h();
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j10;
        if (!this.f16763e) {
            return this.f16765g.f16778b;
        }
        if (this.f16764f) {
            j10 = this.f16760a.q();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f16765g.f16781f;
        }
        return j10;
    }

    public final long e() {
        return this.f16765g.f16778b + this.f16773p;
    }

    public final void f(float f10, d2.n1 n1Var, boolean z10) {
        this.f16763e = true;
        this.f16771n = this.f16760a.p();
        z2.t j10 = j(f10, n1Var, z10);
        y0 y0Var = this.f16765g;
        long j11 = y0Var.f16778b;
        long j12 = y0Var.f16781f;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long a10 = a(j10, j11, false, new boolean[this.f16767j.length]);
        long j13 = this.f16773p;
        y0 y0Var2 = this.f16765g;
        this.f16773p = (y0Var2.f16778b - a10) + j13;
        this.f16765g = y0Var2.b(a10, y0Var2.f16779c);
    }

    public final boolean g() {
        if (this.f16763e) {
            if (!this.f16764f || this.f16760a.q() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.f16763e) {
            if (g() || d() - this.f16765g.f16778b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r02 = this.f16760a;
        try {
            boolean z10 = r02 instanceof w2.d;
            i1 i1Var = this.f16769l;
            if (z10) {
                i1Var.f(((w2.d) r02).f57066a);
            } else {
                i1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            g2.a.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final z2.t j(float f10, d2.n1 n1Var, boolean z10) {
        z2.i iVar;
        z2.i iVar2;
        z2.n nVar;
        String str;
        String str2;
        int[] iArr;
        w2.r1[] r1VarArr;
        int[][][] iArr2;
        boolean z11;
        boolean z12;
        int i3;
        int i10;
        int[] iArr3;
        z2.p[] pVarArr;
        boolean z13;
        boolean z14;
        boolean z15;
        g9.s1 s1Var;
        int i11;
        boolean z16;
        q1 q1Var;
        z2.c bVar;
        g9.s1 f11;
        a3.d dVar;
        int i12;
        long[][] jArr;
        double d;
        long j10;
        String str3;
        Pair p10;
        CaptioningManager captioningManager;
        Locale locale;
        Point point;
        Pair p11;
        Pair p12;
        boolean z17;
        Context context;
        int i13;
        int[] iArr4;
        int i14;
        z2.s sVar = this.f16768k;
        b[] bVarArr = this.f16767j;
        w2.r1 r1Var = this.f16771n;
        sVar.getClass();
        int i15 = 1;
        int[] iArr5 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        d2.o1[][] o1VarArr = new d2.o1[length];
        int[][][] iArr6 = new int[bVarArr.length + 1][];
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = r1Var.f57206a;
            o1VarArr[i16] = new d2.o1[i17];
            iArr6[i16] = new int[i17];
        }
        int length2 = bVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i18 = 0; i18 < length2; i18++) {
            iArr7[i18] = bVarArr[i18].D();
        }
        int i19 = 0;
        while (i19 < r1Var.f57206a) {
            d2.o1 a10 = r1Var.a(i19);
            if (a10.f8254c == 5) {
                i13 = i15;
            } else {
                i13 = 0;
            }
            int length3 = bVarArr.length;
            int i20 = i15;
            int i21 = 0;
            int i22 = 0;
            while (i21 < bVarArr.length) {
                b bVar2 = bVarArr[i21];
                z2.s sVar2 = sVar;
                w2.r1 r1Var2 = r1Var;
                int i23 = i15;
                int i24 = 0;
                for (int i25 = 0; i25 < a10.f8252a; i25++) {
                    i24 = Math.max(i24, bVar2.C(a10.d[i25]) & 7);
                }
                if (iArr5[i21] == 0) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                if (i24 > i22 || (i24 == i22 && i13 != 0 && i20 == 0 && i14 != 0)) {
                    i22 = i24;
                    i20 = i14;
                    length3 = i21;
                }
                i21++;
                sVar = sVar2;
                r1Var = r1Var2;
                i15 = i23;
            }
            z2.s sVar3 = sVar;
            w2.r1 r1Var3 = r1Var;
            int i26 = i15;
            if (length3 == bVarArr.length) {
                iArr4 = new int[a10.f8252a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr8 = new int[a10.f8252a];
                for (int i27 = 0; i27 < a10.f8252a; i27++) {
                    iArr8[i27] = bVar3.C(a10.d[i27]);
                }
                iArr4 = iArr8;
            }
            int i28 = iArr5[length3];
            o1VarArr[length3][i28] = a10;
            iArr6[length3][i28] = iArr4;
            iArr5[length3] = i28 + 1;
            i19++;
            sVar = sVar3;
            r1Var = r1Var3;
            i15 = i26;
        }
        z2.s sVar4 = sVar;
        int i29 = i15;
        w2.r1[] r1VarArr2 = new w2.r1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr9 = new int[bVarArr.length];
        for (int i30 = 0; i30 < bVarArr.length; i30++) {
            int i31 = iArr5[i30];
            r1VarArr2[i30] = new w2.r1((d2.o1[]) g2.n0.U(i31, o1VarArr[i30]));
            iArr6[i30] = (int[][]) g2.n0.U(i31, iArr6[i30]);
            strArr[i30] = bVarArr[i30].j();
            iArr9[i30] = bVarArr[i30].f16444b;
        }
        int[] iArr10 = iArr9;
        z2.r rVar = new z2.r(iArr10, r1VarArr2, iArr7, iArr6, new w2.r1((d2.o1[]) g2.n0.U(iArr5[bVarArr.length], o1VarArr[bVarArr.length])));
        z2.n nVar2 = (z2.n) sVar4;
        synchronized (nVar2.d) {
            nVar2.h = Thread.currentThread();
            iVar = nVar2.f59632g;
        }
        if (nVar2.f59635k == null && (context = nVar2.f59630e) != null) {
            nVar2.f59635k = Boolean.valueOf(g2.n0.P(context));
        }
        if (iVar.A0 && Build.VERSION.SDK_INT >= 32 && nVar2.f59633i == null) {
            nVar2.f59633i = new b3.d(nVar2.f59630e, new xf.c(nVar2, 6), nVar2.f59635k);
        }
        int i32 = rVar.f59638a;
        z2.o[] oVarArr = new z2.o[i32];
        z2.n.f(rVar, iVar, oVarArr);
        z2.n.d(rVar, iVar, oVarArr);
        z2.n.e(rVar, iVar, oVarArr);
        Context context2 = nVar2.f59630e;
        int i33 = rVar.f59638a;
        Pair h = z2.n.h(oVarArr, i29);
        if (h == null) {
            int i34 = 0;
            while (true) {
                if (i34 < i33) {
                    if (2 == iArr10[i34] && r1VarArr2[i34].f57206a > 0) {
                        z17 = true;
                        break;
                    }
                    i34++;
                } else {
                    z17 = false;
                    break;
                }
            }
            ga.b bVar4 = new ga.b(nVar2, iVar, z17, iArr7, 7);
            nVar = nVar2;
            iVar2 = iVar;
            h = z2.n.p(1, rVar, iArr6, bVar4, new vg.i1(6));
            if (h != null) {
                oVarArr[((Integer) h.second).intValue()] = (z2.o) h.first;
            }
        } else {
            iVar2 = iVar;
            nVar = nVar2;
        }
        if (h == null) {
            str = null;
        } else {
            z2.o oVar = (z2.o) h.first;
            str = oVar.f59636a.d[oVar.f59637b[0]].d;
        }
        Pair h7 = z2.n.h(oVarArr, 2);
        Pair h10 = z2.n.h(oVarArr, 4);
        if (h7 == null && h10 == null) {
            if (iVar2.f8408w.f8333a == 2) {
                str2 = str;
                p11 = null;
            } else {
                if (iVar2.f8397k && context2 != null) {
                    point = g2.n0.y(context2);
                } else {
                    point = null;
                }
                a1.d dVar2 = new a1.d(iVar2, str, iArr7, point, 22);
                str2 = str;
                p11 = z2.n.p(2, rVar, iArr6, dVar2, new vg.i1(5));
            }
            if ((!iVar2.E && p11 != null) || iVar2.f8408w.f8333a == 2) {
                p12 = null;
            } else {
                p12 = z2.n.p(4, rVar, iArr6, new xg.c(iVar2, 5), new vg.i1(4));
            }
            if (p12 != null) {
                oVarArr[((Integer) p12.second).intValue()] = (z2.o) p12.first;
            } else if (p11 != null) {
                oVarArr[((Integer) p11.second).intValue()] = (z2.o) p11.first;
            }
        } else {
            str2 = str;
        }
        if (z2.n.h(oVarArr, 3) == null) {
            if (iVar2.f8408w.f8333a == 2) {
                p10 = null;
            } else {
                if (iVar2.B && context2 != null && (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
                    String str4 = g2.n0.f11873a;
                    str3 = locale.toLanguageTag();
                } else {
                    str3 = null;
                }
                p10 = z2.n.p(3, rVar, iArr6, new hr(iVar2, str2, str3, 14), new vg.i1(7));
            }
            if (p10 != null) {
                oVarArr[((Integer) p10.second).intValue()] = (z2.o) p10.first;
            }
        }
        int a11 = p1.a(0, 0, 0, 0);
        if (iVar2.f8408w.f8333a == 2) {
            iArr = iArr10;
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
        } else {
            int i35 = g9.t0.f12149c;
            ?? b0Var = new g9.b0(4);
            int i36 = 0;
            while (i36 < i32) {
                z2.o oVar2 = oVarArr[i36];
                if (oVar2 != null) {
                    d2.o1 o1Var = oVar2.f59636a;
                    if (!iVar2.E0.get(i36)) {
                        i10 = i36;
                        if (!iVar2.I.contains(Integer.valueOf(o1Var.f8254c))) {
                            b0Var.f(o1Var.f8253b);
                            int i37 = 0;
                            while (true) {
                                int[] iArr11 = oVar2.f59637b;
                                iArr3 = iArr10;
                                if (i37 < iArr11.length) {
                                    String str5 = o1Var.d[iArr11[i37]].f8483m;
                                    if (str5 != null) {
                                        b0Var.c(str5);
                                    }
                                    i37++;
                                    iArr10 = iArr3;
                                }
                            }
                            i36 = i10 + 1;
                            iArr10 = iArr3;
                        }
                        iArr3 = iArr10;
                        i36 = i10 + 1;
                        iArr10 = iArr3;
                    }
                }
                i10 = i36;
                iArr3 = iArr10;
                i36 = i10 + 1;
                iArr10 = iArr3;
            }
            iArr = iArr10;
            g9.t0 g7 = b0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i38 = 0;
            while (i38 < i33) {
                if (iArr[i38] != 5) {
                    i3 = i38;
                } else {
                    w2.r1 r1Var4 = r1VarArr2[i38];
                    i3 = i38;
                    int i39 = 0;
                    while (i39 < r1Var4.f57206a) {
                        d2.o1 a12 = r1Var4.a(i39);
                        arrayList.add(a12);
                        w2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr12 = (int[]) iArr6[i3][i39].clone();
                        w2.r1 r1Var5 = r1Var4;
                        int[][][] iArr13 = iArr6;
                        for (int i40 = 0; i40 < iArr12.length; i40++) {
                            String str6 = a12.d[i40].f8483m;
                            if (str6 != null && !g7.contains(str6)) {
                                iArr12[i40] = a11;
                            }
                        }
                        arrayList2.add(iArr12);
                        i39++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr6 = iArr13;
                    }
                }
                i38 = i3 + 1;
                r1VarArr2 = r1VarArr2;
                iArr6 = iArr6;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
            int size = arrayList.size();
            d2.o1[] o1VarArr2 = new d2.o1[size];
            if (arrayList.size() == size) {
                z11 = true;
            } else {
                z11 = false;
            }
            zb.p(z11);
            arrayList.toArray(o1VarArr2);
            w2.r1 r1Var6 = new w2.r1(o1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2];
            if (arrayList2.size() == size2) {
                z12 = true;
            } else {
                z12 = false;
            }
            zb.p(z12);
            arrayList2.toArray(iArr14);
            for (int i41 = 0; i41 < i33; i41++) {
                if (iArr[i41] == 5) {
                    z2.o o10 = z2.n.o(r1Var6, iArr14, iVar2);
                    oVarArr[i41] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[r1Var6.b(o10.f59636a)], a11);
                }
            }
        }
        for (int i42 = 0; i42 < i33; i42++) {
            int i43 = iArr[i42];
            if (i43 != 2 && i43 != 1 && i43 != 3 && i43 != 4) {
                if (i43 != 5 && oVarArr[i42] == null) {
                    oVarArr[i42] = z2.n.o(r1VarArr[i42], iArr2[i42], iVar2);
                }
            }
        }
        z2.n.f(rVar, iVar2, oVarArr);
        z2.n.d(rVar, iVar2, oVarArr);
        z2.n.e(rVar, iVar2, oVarArr);
        ra.e eVar = nVar.f59631f;
        a3.d dVar3 = nVar.f59644b;
        dVar3.getClass();
        eVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (z2.o oVar3 : oVarArr) {
            if (oVar3 != null && oVar3.f59637b.length > 1) {
                g9.f0 p13 = g9.i0.p();
                p13.c(new z2.a(0L, 0L));
                arrayList3.add(p13);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = oVarArr.length;
        long[][] jArr2 = new long[length4];
        for (int i44 = 0; i44 < oVarArr.length; i44++) {
            z2.o oVar4 = oVarArr[i44];
            if (oVar4 == null) {
                jArr2[i44] = new long[0];
            } else {
                int[] iArr15 = oVar4.f59637b;
                jArr2[i44] = new long[iArr15.length];
                for (int i45 = 0; i45 < iArr15.length; i45++) {
                    long j11 = oVar4.f59636a.d[iArr15[i45]].f8480j;
                    long[] jArr3 = jArr2[i44];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr3[i45] = j11;
                }
                Arrays.sort(jArr2[i44]);
            }
        }
        int[] iArr16 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i46 = 0; i46 < length4; i46++) {
            long[] jArr5 = jArr2[i46];
            if (jArr5.length == 0) {
                j10 = 0;
            } else {
                j10 = jArr5[0];
            }
            jArr4[i46] = j10;
        }
        z2.b.v(arrayList3, jArr4);
        g9.o.g(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(g9.n1.f12107b);
        g9.j1 j1Var = new g9.j1();
        g9.k1 k1Var = new g9.k1(treeMap);
        k1Var.h = j1Var;
        int i47 = 0;
        while (i47 < length4) {
            long[] jArr6 = jArr2[i47];
            if (jArr6.length <= 1) {
                dVar = dVar3;
                i12 = length4;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                dVar = dVar3;
                int i48 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i47];
                    i12 = length4;
                    double d10 = 0.0d;
                    if (i48 >= jArr7.length) {
                        break;
                    }
                    long[][] jArr8 = jArr2;
                    int i49 = length5;
                    long j12 = jArr7[i48];
                    if (j12 != -1) {
                        d10 = Math.log(j12);
                    }
                    dArr[i48] = d10;
                    i48++;
                    jArr2 = jArr8;
                    length4 = i12;
                    length5 = i49;
                }
                long[][] jArr9 = jArr2;
                int i50 = length5 - 1;
                double d11 = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d12 = dArr[i51];
                    int i52 = i51 + 1;
                    double d13 = (d12 + dArr[i52]) * 0.5d;
                    if (d11 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d13 - dArr[0]) / d11;
                    }
                    Double valueOf = Double.valueOf(d);
                    Integer valueOf2 = Integer.valueOf(i47);
                    Map map = k1Var.f12091e;
                    long[][] jArr10 = jArr9;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h11 = k1Var.h();
                        if (h11.add(valueOf2)) {
                            k1Var.f12092f++;
                            map.put(valueOf, h11);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        k1Var.f12092f++;
                    }
                    i51 = i52;
                    jArr9 = jArr10;
                }
                jArr = jArr9;
            }
            i47++;
            length4 = i12;
            jArr2 = jArr;
            dVar3 = dVar;
        }
        a3.d dVar4 = dVar3;
        long[][] jArr11 = jArr2;
        Collection collection2 = k1Var.f12095c;
        if (collection2 == null) {
            collection2 = new b8.f(k1Var, 3);
            k1Var.f12095c = collection2;
        }
        g9.i0 q10 = g9.i0.q(collection2);
        for (int i53 = 0; i53 < q10.size(); i53++) {
            int intValue = ((Integer) q10.get(i53)).intValue();
            int i54 = iArr16[intValue] + 1;
            iArr16[intValue] = i54;
            jArr4[intValue] = jArr11[intValue][i54];
            z2.b.v(arrayList3, jArr4);
        }
        for (int i55 = 0; i55 < oVarArr.length; i55++) {
            if (arrayList3.get(i55) != null) {
                jArr4[i55] = jArr4[i55] * 2;
            }
        }
        z2.b.v(arrayList3, jArr4);
        g9.f0 p14 = g9.i0.p();
        for (int i56 = 0; i56 < arrayList3.size(); i56++) {
            g9.f0 f0Var = (g9.f0) arrayList3.get(i56);
            if (f0Var == null) {
                f11 = g9.s1.f12146e;
            } else {
                f11 = f0Var.f();
            }
            p14.c(f11);
        }
        g9.s1 f12 = p14.f();
        z2.p[] pVarArr2 = new z2.p[oVarArr.length];
        for (int i57 = 0; i57 < oVarArr.length; i57++) {
            z2.o oVar5 = oVarArr[i57];
            if (oVar5 != null) {
                int[] iArr17 = oVar5.f59637b;
                if (iArr17.length != 0) {
                    if (iArr17.length == 1) {
                        bVar = new z2.c(oVar5.f59636a, new int[]{iArr17[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new z2.b(oVar5.f59636a, iArr17, dVar4, 10000, j13, j13, (g9.i0) f12.get(i57));
                    }
                    pVarArr2[i57] = bVar;
                }
            }
        }
        q1[] q1VarArr = new q1[i32];
        for (int i58 = 0; i58 < i32; i58++) {
            int i59 = rVar.f59639b[i58];
            if (!iVar2.E0.get(i58) && !iVar2.I.contains(Integer.valueOf(i59)) && (rVar.f59639b[i58] == -2 || pVarArr2[i58] != null)) {
                q1Var = q1.f16683c;
            } else {
                q1Var = null;
            }
            q1VarArr[i58] = q1Var;
        }
        if (iVar2.f8408w.f8333a != 0) {
            int i60 = 0;
            int i61 = 0;
            int i62 = -1;
            while (true) {
                if (i60 < rVar.f59638a) {
                    int i63 = rVar.f59639b[i60];
                    z2.p pVar = pVarArr2[i60];
                    if (i63 != 1 && pVar != null) {
                        break;
                    }
                    if (i63 == 1 && pVar != null && pVar.length() == 1) {
                        if (z2.n.n(iVar2, iArr2[i60][rVar.f59640c[i60].b(pVar.b())][pVar.i(0)], pVar.n())) {
                            i61++;
                            i62 = i60;
                        }
                    }
                    i60++;
                } else if (i61 == 1) {
                    if (iVar2.f8408w.f8334b) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                    q1 q1Var2 = q1VarArr[i62];
                    if (q1Var2 != null && q1Var2.f16685b) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    q1VarArr[i62] = new q1(i11, z16);
                }
            }
        }
        Pair create = Pair.create(q1VarArr, pVarArr2);
        z2.p[] pVarArr3 = (z2.p[]) create.second;
        int length6 = pVarArr3.length;
        List[] listArr = new List[length6];
        for (int i64 = 0; i64 < pVarArr3.length; i64++) {
            z2.p pVar2 = pVarArr3[i64];
            if (pVar2 != null) {
                s1Var = g9.i0.u(pVar2);
            } else {
                g9.g0 g0Var = g9.i0.f12083b;
                s1Var = g9.s1.f12146e;
            }
            listArr[i64] = s1Var;
        }
        ?? b0Var2 = new g9.b0(4);
        int i65 = 0;
        while (true) {
            int i66 = rVar.f59638a;
            w2.r1[] r1VarArr4 = rVar.f59640c;
            if (i65 >= i66) {
                break;
            }
            w2.r1 r1Var7 = r1VarArr4[i65];
            int i67 = 0;
            while (i67 < r1Var7.f57206a) {
                d2.o1 a13 = r1Var7.a(i67);
                int i68 = r1VarArr4[i65].a(i67).f8252a;
                int[] iArr18 = new int[i68];
                int i69 = 0;
                int i70 = 0;
                while (i70 < i68) {
                    List[] listArr2 = listArr;
                    if ((rVar.f59641e[i65][i67][i70] & 7) == 4) {
                        iArr18[i69] = i70;
                        i69++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr18, i69);
                int i71 = 16;
                int i72 = i65;
                int i73 = 0;
                String str7 = null;
                boolean z18 = false;
                int i74 = 0;
                while (i73 < copyOf.length) {
                    int[] iArr19 = copyOf;
                    String str8 = r1VarArr4[i72].a(i67).d[copyOf[i73]].f8489s;
                    int i75 = i74 + 1;
                    if (i74 == 0) {
                        str7 = str8;
                    } else {
                        z18 = (!Objects.equals(str7, str8)) | z18;
                    }
                    i71 = Math.min(i71, rVar.f59641e[i72][i67][i73] & 24);
                    i73++;
                    i74 = i75;
                    copyOf = iArr19;
                }
                if (z18) {
                    i71 = Math.min(i71, rVar.d[i72]);
                }
                if (i71 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                int i76 = a13.f8252a;
                int[] iArr20 = new int[i76];
                boolean[] zArr = new boolean[i76];
                int i77 = 0;
                while (i77 < a13.f8252a) {
                    iArr20[i77] = rVar.f59641e[i72][i67][i77] & 7;
                    int i78 = 0;
                    boolean z19 = false;
                    while (i78 < length6) {
                        List list = listArr3[i78];
                        int i79 = length6;
                        w2.r1 r1Var8 = r1Var7;
                        int i80 = 0;
                        while (true) {
                            if (i80 < list.size()) {
                                z2.p pVar3 = (z2.p) list.get(i80);
                                int i81 = i80;
                                if (pVar3.b().equals(a13) && pVar3.u(i77) != -1) {
                                    z19 = true;
                                    break;
                                }
                                i80 = i81 + 1;
                            }
                        }
                        i78++;
                        length6 = i79;
                        r1Var7 = r1Var8;
                    }
                    zArr[i77] = z19;
                    i77++;
                    r1Var7 = r1Var7;
                }
                b0Var2.c(new d2.u1(a13, z15, iArr20, zArr));
                i67++;
                i65 = i72;
                listArr = listArr3;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i65++;
        }
        w2.r1 r1Var9 = rVar.f59642f;
        for (int i82 = 0; i82 < r1Var9.f57206a; i82++) {
            d2.o1 a14 = r1Var9.a(i82);
            int[] iArr21 = new int[a14.f8252a];
            Arrays.fill(iArr21, 0);
            b0Var2.c(new d2.u1(a14, false, iArr21, new boolean[a14.f8252a]));
        }
        z2.t tVar = new z2.t((q1[]) create.first, (z2.p[]) create.second, new v1(b0Var2.f()), rVar);
        for (int i83 = 0; i83 < tVar.f59646a; i83++) {
            if (tVar.b(i83)) {
                if (tVar.f59648c[i83] == null && this.f16767j[i83].f16444b != -2) {
                    z14 = false;
                    zb.p(z14);
                }
                z14 = true;
                zb.p(z14);
            } else {
                if (tVar.f59648c[i83] == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zb.p(z13);
            }
        }
        for (z2.p pVar4 : tVar.f59648c) {
            if (pVar4 != null) {
                pVar4.q(f10);
                pVar4.f(z10);
            }
        }
        return tVar;
    }

    public final void k() {
        Object obj = this.f16760a;
        if (obj instanceof w2.d) {
            long j10 = this.f16765g.f16780e;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            w2.d dVar = (w2.d) obj;
            dVar.f57070f = 0L;
            dVar.h = j10;
        }
    }
}
