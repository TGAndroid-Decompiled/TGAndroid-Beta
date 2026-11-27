package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class kg8 {
    public static final kg8 H;
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
    public final nt6 B;
    public final long C;
    public final long D;
    public final long E;
    public final f2c F;
    public final c2c G;
    public final e64 a;
    public final int b;
    public final daa c;
    public final cg8 d;
    public final cg8 e;
    public final int f;
    public final of8 g;
    public final int h;
    public final boolean i;
    public final asb j;
    public final int k;
    public final ggc l;
    public final nt6 m;
    public final float n;
    public final float o;
    public final int p;
    public final oz q;
    public final n43 r;
    public final xe3 s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        daa daaVar = daa.l;
        cg8 cg8Var = daa.k;
        of8 of8Var = of8.d;
        ggc ggcVar = ggc.d;
        wrb wrbVar = asb.a;
        nt6 nt6Var = nt6.M;
        H = new kg8(null, 0, daaVar, cg8Var, cg8Var, 0, of8Var, 0, false, ggcVar, wrbVar, 0, nt6Var, 1.0f, 1.0f, oz.i, 0, n43.d, xe3.c, 0, false, false, 1, 0, 1, false, false, nt6Var, 5000L, 15000L, 3000L, f2c.b, c2c.J);
        String str = gcc.a;
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

    public kg8(e64 e64Var, int i, daa daaVar, cg8 cg8Var, cg8 cg8Var2, int i2, of8 of8Var, int i3, boolean z, ggc ggcVar, asb asbVar, int i4, nt6 nt6Var, float f, float f2, oz ozVar, int i5, n43 n43Var, xe3 xe3Var, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, nt6 nt6Var2, long j, long j2, long j3, f2c f2cVar, c2c c2cVar) {
        this.a = e64Var;
        this.b = i;
        this.c = daaVar;
        this.d = cg8Var;
        this.e = cg8Var2;
        this.f = i2;
        this.g = of8Var;
        this.h = i3;
        this.i = z;
        this.l = ggcVar;
        this.j = asbVar;
        this.k = i4;
        this.m = nt6Var;
        this.n = f;
        this.o = f2;
        this.p = i5;
        this.q = ozVar;
        this.r = n43Var;
        this.s = xe3Var;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = nt6Var2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = f2cVar;
        this.G = c2cVar;
    }

    public final kg8 a(f2c f2cVar) {
        boolean z;
        asb asbVar = this.j;
        boolean p = asbVar.p();
        daa daaVar = this.c;
        if (!p && daaVar.a.b >= asbVar.o()) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        return new kg8(this.a, this.b, daaVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, asbVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, f2cVar, this.G);
    }

    public final kg8 b(int i, int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        int i3 = this.A;
        if (i3 == 3 && z && i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        asb asbVar = this.j;
        boolean p = asbVar.p();
        daa daaVar = this.c;
        if (p || daaVar.a.b < asbVar.o()) {
            z3 = true;
        }
        yve.p(z3);
        return new kg8(this.a, this.b, daaVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, asbVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final kg8 c(asb asbVar, daa daaVar, int i) {
        boolean z;
        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        return new kg8(this.a, this.b, daaVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, asbVar, i, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final kg8 d(c2c c2cVar) {
        boolean z;
        asb asbVar = this.j;
        boolean p = asbVar.p();
        daa daaVar = this.c;
        if (!p && daaVar.a.b >= asbVar.o()) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        return new kg8(this.a, this.b, daaVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, asbVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, c2cVar);
    }

    public final kg8 e(zf8 zf8Var, boolean z, boolean z2) {
        nt6 nt6Var;
        float f;
        float f2;
        oz ozVar;
        n43 n43Var;
        int i;
        boolean z3;
        nt6 nt6Var2;
        f2c f2cVar;
        int i2;
        boolean a = zf8Var.a(16);
        boolean a2 = zf8Var.a(17);
        daa daaVar = this.c;
        daa a3 = daaVar.a(a, a2);
        cg8 b = this.d.b(a, a2);
        cg8 b2 = this.e.b(a, a2);
        boolean z4 = true;
        asb asbVar = this.j;
        if (!a2 && a && !asbVar.p()) {
            int i3 = daaVar.a.b;
            if (asbVar.o() != 1) {
                zrb m = asbVar.m(i3, new zrb(), 0L);
                mo5 p = po5.p();
                int i4 = m.m;
                while (true) {
                    i2 = m.n;
                    if (i4 > i2) {
                        break;
                    }
                    xrb f3 = asbVar.f(i4, new xrb(), true);
                    f3.c = 0;
                    p.c(f3);
                    i4++;
                }
                m.n = i2 - m.m;
                m.m = 0;
                asbVar = new yrb(po5.u(m), p.f(), new int[]{0});
            }
        } else if (z || !a2) {
            asbVar = asb.a;
        }
        asb asbVar2 = asbVar;
        if (!zf8Var.a(18)) {
            nt6Var = nt6.M;
        } else {
            nt6Var = this.m;
        }
        nt6 nt6Var3 = nt6Var;
        if (!zf8Var.a(22)) {
            f = 1.0f;
            f2 = 1.0f;
        } else {
            f = this.n;
            f2 = this.o;
        }
        if (!zf8Var.a(21)) {
            ozVar = oz.i;
        } else {
            ozVar = this.q;
        }
        oz ozVar2 = ozVar;
        if (!zf8Var.a(28)) {
            n43Var = n43.d;
        } else {
            n43Var = this.r;
        }
        n43 n43Var2 = n43Var;
        if (!zf8Var.a(23)) {
            i = 0;
            z3 = false;
        } else {
            i = this.t;
            z3 = this.u;
        }
        if (!zf8Var.a(18)) {
            nt6Var2 = nt6.M;
        } else {
            nt6Var2 = this.B;
        }
        nt6 nt6Var4 = nt6Var2;
        if (!z2 && zf8Var.a(30)) {
            f2cVar = this.F;
        } else {
            f2cVar = f2c.b;
        }
        f2c f2cVar2 = f2cVar;
        if (!asbVar2.p() && a3.a.b >= asbVar2.o()) {
            z4 = false;
        }
        yve.p(z4);
        return new kg8(this.a, this.b, a3, b, b2, this.f, this.g, this.h, this.i, this.l, asbVar2, this.k, nt6Var3, f, f2, ozVar2, this.p, n43Var2, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, nt6Var4, this.C, this.D, this.E, f2cVar2, this.G);
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
        xrb xrbVar;
        int i4;
        da[] daVarArr;
        Bundle b;
        Bundle bundle3 = new Bundle();
        e64 e64Var = this.a;
        if (e64Var != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(e64.w, e64Var.a);
            bundle4.putLong(e64.x, e64Var.b);
            bundle4.putString(e64.y, e64Var.getMessage());
            bundle4.putBundle(e64.G, e64Var.c);
            Throwable cause = e64Var.getCause();
            if (cause != null) {
                bundle4.putString(e64.E, cause.getClass().getName());
                bundle4.putString(e64.F, cause.getMessage());
            }
            bundle3.putBundle(a0, bundle4);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle3.putInt(c0, i5);
        }
        daa daaVar = this.c;
        if (i < 3 || !daaVar.equals(daa.l)) {
            bundle3.putBundle(b0, daaVar.b(i));
        }
        cg8 cg8Var = this.d;
        if (i < 3 || !daa.k.a(cg8Var)) {
            bundle3.putBundle(d0, cg8Var.c(i));
        }
        cg8 cg8Var2 = this.e;
        if (i < 3 || !daa.k.a(cg8Var2)) {
            bundle3.putBundle(e0, cg8Var2.c(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle3.putInt(f0, i6);
        }
        of8 of8Var = of8.d;
        of8 of8Var2 = this.g;
        if (!of8Var2.equals(of8Var)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(of8.e, of8Var2.a);
            bundle5.putFloat(of8.f, of8Var2.b);
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
        wrb wrbVar = asb.a;
        asb asbVar = this.j;
        boolean z3 = false;
        long j4 = 0;
        boolean z4 = true;
        if (!asbVar.equals(wrbVar)) {
            ArrayList arrayList2 = new ArrayList();
            int o = asbVar.o();
            zrb zrbVar = new zrb();
            int i8 = 0;
            while (i8 < o) {
                zrb m = asbVar.m(i8, zrbVar, 0L);
                m.getClass();
                Bundle bundle6 = new Bundle();
                if (!ft6.g.equals(m.b)) {
                    bundle6.putBundle(zrb.r, m.b.b(i, z3));
                }
                long j5 = m.d;
                if (j5 != -9223372036854775807L) {
                    bundle6.putLong(zrb.s, j5);
                }
                long j6 = m.e;
                if (j6 != -9223372036854775807L) {
                    bundle6.putLong(zrb.t, j6);
                }
                long j7 = m.f;
                if (j7 != -9223372036854775807L) {
                    bundle6.putLong(zrb.u, j7);
                }
                boolean z5 = m.g;
                if (z5) {
                    bundle6.putBoolean(zrb.v, z5);
                }
                boolean z6 = m.h;
                if (z6) {
                    bundle6.putBoolean(zrb.w, z6);
                }
                at6 at6Var = m.i;
                if (at6Var != null) {
                    bundle6.putBundle(zrb.x, at6Var.b());
                }
                boolean z7 = m.j;
                if (z7) {
                    bundle6.putBoolean(zrb.y, z7);
                }
                long j8 = m.k;
                if (j8 != 0) {
                    bundle6.putLong(zrb.z, j8);
                }
                long j9 = m.l;
                if (j9 != -9223372036854775807L) {
                    bundle6.putLong(zrb.A, j9);
                }
                int i9 = m.m;
                if (i9 != 0) {
                    bundle6.putInt(zrb.B, i9);
                }
                int i10 = m.n;
                if (i10 != 0) {
                    bundle6.putInt(zrb.C, i10);
                }
                long j10 = m.o;
                if (j10 != 0) {
                    bundle6.putLong(zrb.D, j10);
                }
                Object obj = m.a;
                if (obj instanceof String) {
                    bundle6.putString(zrb.E, (String) obj);
                }
                arrayList2.add(bundle6);
                i8++;
                z3 = false;
            }
            ArrayList arrayList3 = new ArrayList();
            int h = asbVar.h();
            xrb xrbVar2 = new xrb();
            int i11 = 0;
            while (i11 < h) {
                xrb f = asbVar.f(i11, xrbVar2, z4);
                f.getClass();
                Bundle bundle7 = new Bundle();
                int i12 = f.c;
                if (i12 != 0) {
                    bundle7.putInt(xrb.g, i12);
                }
                long j11 = j4;
                long j12 = f.d;
                if (j12 != -9223372036854775807L) {
                    bundle7.putLong(xrb.h, j12);
                }
                long j13 = f.e;
                if (j13 != j11) {
                    bundle7.putLong(xrb.i, j13);
                }
                boolean z8 = f.f;
                if (z8) {
                    bundle7.putBoolean(xrb.j, z8);
                }
                ea eaVar = ea.c;
                if (!eaVar.equals(eaVar)) {
                    String str = xrb.k;
                    Bundle bundle8 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    ca[] caVarArr = eaVar.b;
                    i3 = h;
                    int length = caVarArr.length;
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = i13;
                        ca caVar = caVarArr[i14];
                        caVar.getClass();
                        int i15 = length;
                        Bundle bundle9 = new Bundle();
                        xrb xrbVar3 = xrbVar2;
                        Bundle bundle10 = bundle3;
                        ArrayList arrayList5 = arrayList2;
                        bundle9.putLong(ca.h, j11);
                        bundle9.putInt(ca.i, caVar.a);
                        bundle9.putInt(ca.o, -1);
                        bundle9.putParcelableArrayList(ca.j, new ArrayList<>(Arrays.asList(caVar.b)));
                        String str2 = ca.p;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        ft6[] ft6VarArr = caVar.c;
                        int i16 = i11;
                        int length2 = ft6VarArr.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            ft6 ft6Var = ft6VarArr[i17];
                            int i18 = i17;
                            if (ft6Var == null) {
                                b = null;
                            } else {
                                b = ft6Var.b(i, true);
                            }
                            arrayList6.add(b);
                            i17 = i18 + 1;
                        }
                        bundle9.putParcelableArrayList(str2, arrayList6);
                        bundle9.putIntArray(ca.k, caVar.d);
                        bundle9.putLongArray(ca.l, caVar.e);
                        bundle9.putLong(ca.m, 0L);
                        bundle9.putBoolean(ca.n, false);
                        bundle9.putStringArrayList(ca.q, new ArrayList<>(Arrays.asList(caVar.f)));
                        String str3 = ca.s;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        for (da daVar : caVar.g) {
                            arrayList7.add(null);
                        }
                        bundle9.putParcelableArrayList(str3, arrayList7);
                        bundle9.putBoolean(ca.r, false);
                        arrayList4.add(bundle9);
                        i13 = i14 + 1;
                        length = i15;
                        xrbVar2 = xrbVar3;
                        bundle3 = bundle10;
                        arrayList2 = arrayList5;
                        i11 = i16;
                        j11 = 0;
                    }
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    xrbVar = xrbVar2;
                    i4 = i11;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(ea.e, arrayList4);
                    }
                    bundle7.putBundle(str, bundle8);
                } else {
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    i3 = h;
                    xrbVar = xrbVar2;
                    i4 = i11;
                }
                Object obj2 = f.a;
                if (obj2 instanceof String) {
                    bundle7.putString(xrb.l, (String) obj2);
                }
                Object obj3 = f.b;
                if (obj3 instanceof String) {
                    bundle7.putString(xrb.m, (String) obj3);
                }
                arrayList3.add(bundle7);
                i11 = i4 + 1;
                h = i3;
                xrbVar2 = xrbVar;
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
                iArr[0] = asbVar.a(true);
            } else {
                i2 = 0;
                z = true;
            }
            int i19 = z ? 1 : 0;
            while (i19 < o) {
                iArr[i19] = asbVar.e(iArr[i19 - 1], i2, z);
                i19++;
                i2 = 0;
                z = true;
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBinder(asb.b, new f31(arrayList8));
            bundle12.putBinder(asb.c, new f31(arrayList3));
            bundle12.putIntArray(asb.d, iArr);
            bundle = bundle11;
            bundle.putBundle(L, bundle12);
        } else {
            bundle = bundle3;
        }
        int i20 = this.k;
        if (i20 != 0) {
            bundle.putInt(n0, i20);
        }
        ggc ggcVar = ggc.d;
        ggc ggcVar2 = this.l;
        if (!ggcVar2.equals(ggcVar)) {
            Bundle bundle13 = new Bundle();
            int i21 = ggcVar2.a;
            if (i21 != 0) {
                bundle13.putInt(ggc.e, i21);
            }
            int i22 = ggcVar2.b;
            if (i22 != 0) {
                bundle13.putInt(ggc.f, i22);
            }
            float f2 = ggcVar2.c;
            if (f2 != 1.0f) {
                bundle13.putFloat(ggc.g, f2);
            }
            bundle.putBundle(M, bundle13);
        }
        nt6 nt6Var = nt6.M;
        nt6 nt6Var2 = this.m;
        if (!nt6Var2.equals(nt6Var)) {
            bundle.putBundle(N, nt6Var2.c(i));
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
        oz ozVar = oz.i;
        oz ozVar2 = this.q;
        if (!ozVar2.equals(ozVar)) {
            Bundle bundle14 = new Bundle();
            int i24 = ozVar2.a;
            if (i24 != 0) {
                bundle14.putInt(oz.j, i24);
            }
            int i25 = ozVar2.b;
            if (i25 != 0) {
                bundle14.putInt(oz.k, i25);
            }
            int i26 = ozVar2.c;
            if (i26 != 1) {
                bundle14.putInt(oz.l, i26);
            }
            int i27 = ozVar2.d;
            if (i27 != 1) {
                bundle14.putInt(oz.m, i27);
            }
            int i28 = ozVar2.e;
            if (i28 != 0) {
                bundle14.putInt(oz.n, i28);
            }
            boolean z9 = ozVar2.f;
            if (z9) {
                bundle14.putBoolean(oz.o, z9);
            }
            boolean z10 = ozVar2.g;
            if (!z10) {
                bundle14.putBoolean(oz.p, z10);
            }
            bundle.putBundle(Q, bundle14);
        }
        n43 n43Var = n43.d;
        n43 n43Var2 = this.r;
        if (!n43Var2.equals(n43Var)) {
            Bundle bundle15 = new Bundle();
            String str4 = n43.e;
            j99 j99Var = n43Var2.a;
            mo5 p = po5.p();
            for (int i29 = 0; i29 < j99Var.d; i29++) {
                if (((m43) j99Var.get(i29)).d == null) {
                    p.c((m43) j99Var.get(i29));
                }
            }
            j99 f5 = p.f();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(f5.d);
            no5 listIterator = f5.listIterator(0);
            while (listIterator.hasNext()) {
                m43 m43Var = (m43) listIterator.next();
                Bundle a = m43Var.a();
                Bitmap bitmap = m43Var.d;
                if (bitmap != null) {
                    a.putParcelable(m43.w, bitmap);
                }
                arrayList9.add(a);
            }
            bundle15.putParcelableArrayList(str4, arrayList9);
            bundle15.putLong(n43.f, n43Var2.b);
            bundle.putBundle(g0, bundle15);
        }
        xe3 xe3Var = xe3.c;
        xe3 xe3Var2 = this.s;
        if (!xe3Var2.equals(xe3Var)) {
            Bundle bundle16 = new Bundle();
            int i30 = xe3Var2.a;
            if (i30 != 0) {
                bundle16.putInt(xe3.d, i30);
            }
            int i31 = xe3Var2.b;
            if (i31 != 0) {
                bundle16.putInt(xe3.e, i31);
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
        nt6 nt6Var3 = nt6.M;
        nt6 nt6Var4 = this.B;
        if (!nt6Var4.equals(nt6Var3)) {
            bundle.putBundle(h0, nt6Var4.c(i));
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
        f2c f2cVar = f2c.b;
        f2c f2cVar2 = this.F;
        if (!f2cVar2.equals(f2cVar)) {
            Bundle bundle17 = new Bundle();
            bundle17.putParcelableArrayList(f2c.c, e31.c(f2cVar2.a, new p31((byte) 20)));
            bundle.putBundle(m0, bundle17);
        }
        c2c c2cVar = c2c.J;
        c2c c2cVar2 = this.G;
        if (!c2cVar2.equals(c2cVar)) {
            bundle.putBundle(l0, c2cVar2.c());
        }
        return bundle;
    }
}
