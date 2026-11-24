package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class wc8 {
    public static final wc8 H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public final int A;
    public final jr6 B;
    public final long C;
    public final long D;
    public final long E;
    public final eyb F;
    public final byb G;
    public final j54 a;
    public final int b;
    public final l6a c;
    public final nc8 d;
    public final nc8 e;
    public final int f;
    public final zb8 g;
    public final int h;
    public final boolean i;
    public final aob j;
    public final int k;
    public final icc l;
    public final jr6 m;
    public final float n;
    public final float o;
    public final int p;
    public final nz q;
    public final v33 r;
    public final de3 s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        l6a l6aVar = l6a.l;
        nc8 nc8Var = l6a.k;
        zb8 zb8Var = zb8.d;
        icc iccVar = icc.d;
        wnb wnbVar = aob.a;
        jr6 jr6Var = jr6.M;
        H = new wc8(null, 0, l6aVar, nc8Var, nc8Var, 0, zb8Var, 0, false, iccVar, wnbVar, 0, jr6Var, 1.0f, 1.0f, nz.i, 0, v33.d, de3.c, 0, false, false, 1, 0, 1, false, false, jr6Var, 5000L, 15000L, 3000L, eyb.b, byb.J);
        String str = g8c.a;
        I = "1";
        J = "2";
        K = "3";
        L = "4";
        M = "5";
        N = "6";
        O = "7";
        P = "x";
        Q = "8";
        R = "9";
        S = "a";
        T = "b";
        U = "c";
        V = "d";
        W = "e";
        X = "f";
        Y = "g";
        Z = "h";
        a0 = "i";
        b0 = "j";
        c0 = "k";
        d0 = "l";
        e0 = "m";
        f0 = "n";
        g0 = "o";
        h0 = "p";
        i0 = "q";
        j0 = "r";
        k0 = "s";
        l0 = "t";
        m0 = "u";
        n0 = "v";
        o0 = "y";
    }

    public wc8(j54 j54Var, int i, l6a l6aVar, nc8 nc8Var, nc8 nc8Var2, int i2, zb8 zb8Var, int i3, boolean z, icc iccVar, aob aobVar, int i4, jr6 jr6Var, float f, float f2, nz nzVar, int i5, v33 v33Var, de3 de3Var, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, jr6 jr6Var2, long j, long j2, long j3, eyb eybVar, byb bybVar) {
        this.a = j54Var;
        this.b = i;
        this.c = l6aVar;
        this.d = nc8Var;
        this.e = nc8Var2;
        this.f = i2;
        this.g = zb8Var;
        this.h = i3;
        this.i = z;
        this.l = iccVar;
        this.j = aobVar;
        this.k = i4;
        this.m = jr6Var;
        this.n = f;
        this.o = f2;
        this.p = i5;
        this.q = nzVar;
        this.r = v33Var;
        this.s = de3Var;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = jr6Var2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = eybVar;
        this.G = bybVar;
    }

    public final wc8 a(eyb eybVar) {
        boolean z;
        aob aobVar = this.j;
        boolean p = aobVar.p();
        l6a l6aVar = this.c;
        if (!p && l6aVar.a.b >= aobVar.o()) {
            z = false;
        } else {
            z = true;
        }
        gre.p(z);
        return new wc8(this.a, this.b, l6aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, aobVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, eybVar, this.G);
    }

    public final wc8 b(int i, int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        int i3 = this.A;
        if (i3 == 3 && z && i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        aob aobVar = this.j;
        boolean p = aobVar.p();
        l6a l6aVar = this.c;
        if (p || l6aVar.a.b < aobVar.o()) {
            z3 = true;
        }
        gre.p(z3);
        return new wc8(this.a, this.b, l6aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, aobVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final wc8 c(aob aobVar, l6a l6aVar, int i) {
        boolean z;
        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
            z = false;
        } else {
            z = true;
        }
        gre.p(z);
        return new wc8(this.a, this.b, l6aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, aobVar, i, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final wc8 d(byb bybVar) {
        boolean z;
        aob aobVar = this.j;
        boolean p = aobVar.p();
        l6a l6aVar = this.c;
        if (!p && l6aVar.a.b >= aobVar.o()) {
            z = false;
        } else {
            z = true;
        }
        gre.p(z);
        return new wc8(this.a, this.b, l6aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, aobVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, bybVar);
    }

    public final wc8 e(kc8 kc8Var, boolean z, boolean z2) {
        jr6 jr6Var;
        float f;
        float f2;
        nz nzVar;
        v33 v33Var;
        int i;
        boolean z3;
        jr6 jr6Var2;
        eyb eybVar;
        int i2;
        boolean a = kc8Var.a(16);
        boolean a2 = kc8Var.a(17);
        l6a l6aVar = this.c;
        l6a a3 = l6aVar.a(a, a2);
        nc8 b = this.d.b(a, a2);
        nc8 b2 = this.e.b(a, a2);
        boolean z4 = true;
        aob aobVar = this.j;
        if (!a2 && a && !aobVar.p()) {
            int i3 = l6aVar.a.b;
            if (aobVar.o() != 1) {
                znb m = aobVar.m(i3, new znb(), 0L);
                jm5 p = mm5.p();
                int i4 = m.m;
                while (true) {
                    i2 = m.n;
                    if (i4 > i2) {
                        break;
                    }
                    xnb f3 = aobVar.f(i4, new xnb(), true);
                    f3.c = 0;
                    p.c(f3);
                    i4++;
                }
                m.n = i2 - m.m;
                m.m = 0;
                aobVar = new ynb(mm5.u(m), p.f(), new int[]{0});
            }
        } else if (z || !a2) {
            aobVar = aob.a;
        }
        aob aobVar2 = aobVar;
        if (!kc8Var.a(18)) {
            jr6Var = jr6.M;
        } else {
            jr6Var = this.m;
        }
        jr6 jr6Var3 = jr6Var;
        if (!kc8Var.a(22)) {
            f = 1.0f;
            f2 = 1.0f;
        } else {
            f = this.n;
            f2 = this.o;
        }
        if (!kc8Var.a(21)) {
            nzVar = nz.i;
        } else {
            nzVar = this.q;
        }
        nz nzVar2 = nzVar;
        if (!kc8Var.a(28)) {
            v33Var = v33.d;
        } else {
            v33Var = this.r;
        }
        v33 v33Var2 = v33Var;
        if (!kc8Var.a(23)) {
            i = 0;
            z3 = false;
        } else {
            i = this.t;
            z3 = this.u;
        }
        if (!kc8Var.a(18)) {
            jr6Var2 = jr6.M;
        } else {
            jr6Var2 = this.B;
        }
        jr6 jr6Var4 = jr6Var2;
        if (!z2 && kc8Var.a(30)) {
            eybVar = this.F;
        } else {
            eybVar = eyb.b;
        }
        eyb eybVar2 = eybVar;
        if (!aobVar2.p() && a3.a.b >= aobVar2.o()) {
            z4 = false;
        }
        gre.p(z4);
        return new wc8(this.a, this.b, a3, b, b2, this.f, this.g, this.h, this.i, this.l, aobVar2, this.k, jr6Var3, f, f2, nzVar2, this.p, v33Var2, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, jr6Var4, this.C, this.D, this.E, eybVar2, this.G);
    }

    public final Bundle f(int i) {
        Bundle bundle;
        long j;
        long j2;
        long j3;
        int i2;
        boolean z;
        Bundle bundle2;
        ArrayList arrayList;
        int i3;
        xnb xnbVar;
        int i4;
        ca[] caVarArr;
        Bundle b;
        Bundle bundle3 = new Bundle();
        j54 j54Var = this.a;
        if (j54Var != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(j54.w, j54Var.a);
            bundle4.putLong(j54.x, j54Var.b);
            bundle4.putString(j54.y, j54Var.getMessage());
            bundle4.putBundle(j54.G, j54Var.c);
            Throwable cause = j54Var.getCause();
            if (cause != null) {
                bundle4.putString(j54.E, cause.getClass().getName());
                bundle4.putString(j54.F, cause.getMessage());
            }
            bundle3.putBundle(a0, bundle4);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle3.putInt(c0, i5);
        }
        l6a l6aVar = this.c;
        if (i < 3 || !l6aVar.equals(l6a.l)) {
            bundle3.putBundle(b0, l6aVar.b(i));
        }
        nc8 nc8Var = this.d;
        if (i < 3 || !l6a.k.a(nc8Var)) {
            bundle3.putBundle(d0, nc8Var.c(i));
        }
        nc8 nc8Var2 = this.e;
        if (i < 3 || !l6a.k.a(nc8Var2)) {
            bundle3.putBundle(e0, nc8Var2.c(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle3.putInt(f0, i6);
        }
        zb8 zb8Var = zb8.d;
        zb8 zb8Var2 = this.g;
        if (!zb8Var2.equals(zb8Var)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(zb8.e, zb8Var2.a);
            bundle5.putFloat(zb8.f, zb8Var2.b);
            bundle3.putBundle(I, bundle5);
        }
        int i7 = this.h;
        if (i7 != 0) {
            bundle3.putInt(J, i7);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle3.putBoolean(K, z2);
        }
        wnb wnbVar = aob.a;
        aob aobVar = this.j;
        boolean z3 = false;
        long j4 = 0;
        boolean z4 = true;
        if (!aobVar.equals(wnbVar)) {
            ArrayList arrayList2 = new ArrayList();
            int o = aobVar.o();
            znb znbVar = new znb();
            int i8 = 0;
            while (i8 < o) {
                znb m = aobVar.m(i8, znbVar, 0L);
                m.getClass();
                Bundle bundle6 = new Bundle();
                if (!br6.g.equals(m.b)) {
                    bundle6.putBundle(znb.r, m.b.b(i, z3));
                }
                long j5 = m.d;
                if (j5 != -9223372036854775807L) {
                    bundle6.putLong(znb.s, j5);
                }
                long j6 = m.e;
                if (j6 != -9223372036854775807L) {
                    bundle6.putLong(znb.t, j6);
                }
                long j7 = m.f;
                if (j7 != -9223372036854775807L) {
                    bundle6.putLong(znb.u, j7);
                }
                boolean z5 = m.g;
                if (z5) {
                    bundle6.putBoolean(znb.v, z5);
                }
                boolean z6 = m.h;
                if (z6) {
                    bundle6.putBoolean(znb.w, z6);
                }
                wq6 wq6Var = m.i;
                if (wq6Var != null) {
                    bundle6.putBundle(znb.x, wq6Var.b());
                }
                boolean z7 = m.j;
                if (z7) {
                    bundle6.putBoolean(znb.y, z7);
                }
                long j8 = m.k;
                if (j8 != 0) {
                    bundle6.putLong(znb.z, j8);
                }
                long j9 = m.l;
                if (j9 != -9223372036854775807L) {
                    bundle6.putLong(znb.A, j9);
                }
                int i9 = m.m;
                if (i9 != 0) {
                    bundle6.putInt(znb.B, i9);
                }
                int i10 = m.n;
                if (i10 != 0) {
                    bundle6.putInt(znb.C, i10);
                }
                long j10 = m.o;
                if (j10 != 0) {
                    bundle6.putLong(znb.D, j10);
                }
                Object obj = m.a;
                if (obj instanceof String) {
                    bundle6.putString(znb.E, (String) obj);
                }
                arrayList2.add(bundle6);
                i8++;
                z3 = false;
            }
            ArrayList arrayList3 = new ArrayList();
            int h = aobVar.h();
            xnb xnbVar2 = new xnb();
            int i11 = 0;
            while (i11 < h) {
                xnb f = aobVar.f(i11, xnbVar2, z4);
                f.getClass();
                Bundle bundle7 = new Bundle();
                int i12 = f.c;
                if (i12 != 0) {
                    bundle7.putInt(xnb.g, i12);
                }
                long j11 = j4;
                long j12 = f.d;
                if (j12 != -9223372036854775807L) {
                    bundle7.putLong(xnb.h, j12);
                }
                long j13 = f.e;
                if (j13 != j11) {
                    bundle7.putLong(xnb.i, j13);
                }
                boolean z8 = f.f;
                if (z8) {
                    bundle7.putBoolean(xnb.j, z8);
                }
                da daVar = da.c;
                if (!daVar.equals(daVar)) {
                    String str = xnb.k;
                    Bundle bundle8 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    ba[] baVarArr = daVar.b;
                    i3 = h;
                    int length = baVarArr.length;
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = i13;
                        ba baVar = baVarArr[i14];
                        baVar.getClass();
                        int i15 = length;
                        Bundle bundle9 = new Bundle();
                        xnb xnbVar3 = xnbVar2;
                        Bundle bundle10 = bundle3;
                        ArrayList arrayList5 = arrayList2;
                        bundle9.putLong(ba.h, j11);
                        bundle9.putInt(ba.i, baVar.a);
                        bundle9.putInt(ba.o, -1);
                        bundle9.putParcelableArrayList(ba.j, new ArrayList<>(Arrays.asList(baVar.b)));
                        String str2 = ba.p;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        br6[] br6VarArr = baVar.c;
                        int i16 = i11;
                        int length2 = br6VarArr.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            br6 br6Var = br6VarArr[i17];
                            int i18 = i17;
                            if (br6Var == null) {
                                b = null;
                            } else {
                                b = br6Var.b(i, true);
                            }
                            arrayList6.add(b);
                            i17 = i18 + 1;
                        }
                        bundle9.putParcelableArrayList(str2, arrayList6);
                        bundle9.putIntArray(ba.k, baVar.d);
                        bundle9.putLongArray(ba.l, baVar.e);
                        bundle9.putLong(ba.m, 0L);
                        bundle9.putBoolean(ba.n, false);
                        bundle9.putStringArrayList(ba.q, new ArrayList<>(Arrays.asList(baVar.f)));
                        String str3 = ba.s;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        for (ca caVar : baVar.g) {
                            arrayList7.add(null);
                        }
                        bundle9.putParcelableArrayList(str3, arrayList7);
                        bundle9.putBoolean(ba.r, false);
                        arrayList4.add(bundle9);
                        i13 = i14 + 1;
                        length = i15;
                        xnbVar2 = xnbVar3;
                        bundle3 = bundle10;
                        arrayList2 = arrayList5;
                        i11 = i16;
                        j11 = 0;
                    }
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    xnbVar = xnbVar2;
                    i4 = i11;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(da.e, arrayList4);
                    }
                    bundle7.putBundle(str, bundle8);
                } else {
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    i3 = h;
                    xnbVar = xnbVar2;
                    i4 = i11;
                }
                Object obj2 = f.a;
                if (obj2 instanceof String) {
                    bundle7.putString(xnb.l, (String) obj2);
                }
                Object obj3 = f.b;
                if (obj3 instanceof String) {
                    bundle7.putString(xnb.m, (String) obj3);
                }
                arrayList3.add(bundle7);
                i11 = i4 + 1;
                h = i3;
                xnbVar2 = xnbVar;
                bundle3 = bundle2;
                arrayList2 = arrayList;
                j4 = 0;
                z4 = true;
            }
            Bundle bundle11 = bundle3;
            ArrayList arrayList8 = arrayList2;
            int[] iArr = new int[o];
            if (o > 0) {
                z = true;
                i2 = 0;
                iArr[0] = aobVar.a(true);
            } else {
                i2 = 0;
                z = true;
            }
            int i19 = z ? 1 : 0;
            while (i19 < o) {
                iArr[i19] = aobVar.e(iArr[i19 - 1], i2, z);
                i19++;
                i2 = 0;
                z = true;
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBinder(aob.b, new w21(arrayList8));
            bundle12.putBinder(aob.c, new w21(arrayList3));
            bundle12.putIntArray(aob.d, iArr);
            bundle = bundle11;
            bundle.putBundle(L, bundle12);
        } else {
            bundle = bundle3;
        }
        int i20 = this.k;
        if (i20 != 0) {
            bundle.putInt(n0, i20);
        }
        icc iccVar = icc.d;
        icc iccVar2 = this.l;
        if (!iccVar2.equals(iccVar)) {
            Bundle bundle13 = new Bundle();
            int i21 = iccVar2.a;
            if (i21 != 0) {
                bundle13.putInt(icc.e, i21);
            }
            int i22 = iccVar2.b;
            if (i22 != 0) {
                bundle13.putInt(icc.f, i22);
            }
            float f2 = iccVar2.c;
            if (f2 != 1.0f) {
                bundle13.putFloat(icc.g, f2);
            }
            bundle.putBundle(M, bundle13);
        }
        jr6 jr6Var = jr6.M;
        jr6 jr6Var2 = this.m;
        if (!jr6Var2.equals(jr6Var)) {
            bundle.putBundle(N, jr6Var2.c(i));
        }
        float f3 = this.n;
        if (f3 != 1.0f) {
            bundle.putFloat(O, f3);
        }
        float f4 = this.o;
        if (f4 != 1.0f) {
            bundle.putFloat(P, f4);
        }
        int i23 = this.p;
        if (i23 != 0) {
            bundle.putInt(o0, i23);
        }
        nz nzVar = nz.i;
        nz nzVar2 = this.q;
        if (!nzVar2.equals(nzVar)) {
            Bundle bundle14 = new Bundle();
            int i24 = nzVar2.a;
            if (i24 != 0) {
                bundle14.putInt(nz.j, i24);
            }
            int i25 = nzVar2.b;
            if (i25 != 0) {
                bundle14.putInt(nz.k, i25);
            }
            int i26 = nzVar2.c;
            if (i26 != 1) {
                bundle14.putInt(nz.l, i26);
            }
            int i27 = nzVar2.d;
            if (i27 != 1) {
                bundle14.putInt(nz.m, i27);
            }
            int i28 = nzVar2.e;
            if (i28 != 0) {
                bundle14.putInt(nz.n, i28);
            }
            boolean z9 = nzVar2.f;
            if (z9) {
                bundle14.putBoolean(nz.o, z9);
            }
            boolean z10 = nzVar2.g;
            if (!z10) {
                bundle14.putBoolean(nz.p, z10);
            }
            bundle.putBundle(Q, bundle14);
        }
        v33 v33Var = v33.d;
        v33 v33Var2 = this.r;
        if (!v33Var2.equals(v33Var)) {
            Bundle bundle15 = new Bundle();
            String str4 = v33.e;
            w59 w59Var = v33Var2.a;
            jm5 p = mm5.p();
            for (int i29 = 0; i29 < w59Var.d; i29++) {
                if (((u33) w59Var.get(i29)).d == null) {
                    p.c((u33) w59Var.get(i29));
                }
            }
            w59 f5 = p.f();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(f5.d);
            km5 listIterator = f5.listIterator(0);
            while (listIterator.hasNext()) {
                u33 u33Var = (u33) listIterator.next();
                Bundle a = u33Var.a();
                Bitmap bitmap = u33Var.d;
                if (bitmap != null) {
                    a.putParcelable(u33.w, bitmap);
                }
                arrayList9.add(a);
            }
            bundle15.putParcelableArrayList(str4, arrayList9);
            bundle15.putLong(v33.f, v33Var2.b);
            bundle.putBundle(g0, bundle15);
        }
        de3 de3Var = de3.c;
        de3 de3Var2 = this.s;
        if (!de3Var2.equals(de3Var)) {
            Bundle bundle16 = new Bundle();
            int i30 = de3Var2.a;
            if (i30 != 0) {
                bundle16.putInt(de3.d, i30);
            }
            int i31 = de3Var2.b;
            if (i31 != 0) {
                bundle16.putInt(de3.e, i31);
            }
            bundle.putBundle(R, bundle16);
        }
        int i32 = this.t;
        if (i32 != 0) {
            bundle.putInt(S, i32);
        }
        boolean z11 = this.u;
        if (z11) {
            bundle.putBoolean(T, z11);
        }
        boolean z12 = this.v;
        if (z12) {
            bundle.putBoolean(U, z12);
        }
        int i33 = this.w;
        if (i33 != 1) {
            bundle.putInt(V, i33);
        }
        int i34 = this.z;
        if (i34 != 0) {
            bundle.putInt(W, i34);
        }
        int i35 = this.A;
        if (i35 != 1) {
            bundle.putInt(X, i35);
        }
        boolean z13 = this.x;
        if (z13) {
            bundle.putBoolean(Y, z13);
        }
        boolean z14 = this.y;
        if (z14) {
            bundle.putBoolean(Z, z14);
        }
        jr6 jr6Var3 = jr6.M;
        jr6 jr6Var4 = this.B;
        if (!jr6Var4.equals(jr6Var3)) {
            bundle.putBundle(h0, jr6Var4.c(i));
        }
        if (i < 6) {
            j = 0;
        } else {
            j = 5000;
        }
        long j14 = this.C;
        if (j14 != j) {
            bundle.putLong(i0, j14);
        }
        if (i < 6) {
            j2 = 0;
        } else {
            j2 = 15000;
        }
        long j15 = this.D;
        if (j15 != j2) {
            bundle.putLong(j0, j15);
        }
        if (i < 6) {
            j3 = 0;
        } else {
            j3 = 3000;
        }
        long j16 = this.E;
        if (j16 != j3) {
            bundle.putLong(k0, j16);
        }
        eyb eybVar = eyb.b;
        eyb eybVar2 = this.F;
        if (!eybVar2.equals(eybVar)) {
            Bundle bundle17 = new Bundle();
            bundle17.putParcelableArrayList(eyb.c, v21.c(eybVar2.a, new g31((byte) 20)));
            bundle.putBundle(m0, bundle17);
        }
        byb bybVar = byb.J;
        byb bybVar2 = this.G;
        if (!bybVar2.equals(bybVar)) {
            bundle.putBundle(l0, bybVar2.c());
        }
        return bundle;
    }
}
