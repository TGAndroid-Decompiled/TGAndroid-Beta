package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class ye8 {
    public static final ye8 H;
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
    public final jt6 B;
    public final long C;
    public final long D;
    public final long E;
    public final g0c F;
    public final d0c G;
    public final u64 a;
    public final int b;
    public final n8a c;
    public final qe8 d;
    public final qe8 e;
    public final int f;
    public final ce8 g;
    public final int h;
    public final boolean i;
    public final bqb j;
    public final int k;
    public final jec l;
    public final jt6 m;
    public final float n;
    public final float o;
    public final int p;
    public final o00 q;
    public final g53 r;
    public final of3 s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        n8a n8aVar = n8a.l;
        qe8 qe8Var = n8a.k;
        ce8 ce8Var = ce8.d;
        jec jecVar = jec.d;
        xpb xpbVar = bqb.a;
        jt6 jt6Var = jt6.M;
        H = new ye8(null, 0, n8aVar, qe8Var, qe8Var, 0, ce8Var, 0, false, jecVar, xpbVar, 0, jt6Var, 1.0f, 1.0f, o00.i, 0, g53.d, of3.c, 0, false, false, 1, 0, 1, false, false, jt6Var, 5000L, 15000L, 3000L, g0c.b, d0c.J);
        String str = hac.a;
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

    public ye8(u64 u64Var, int i, n8a n8aVar, qe8 qe8Var, qe8 qe8Var2, int i2, ce8 ce8Var, int i3, boolean z, jec jecVar, bqb bqbVar, int i4, jt6 jt6Var, float f, float f2, o00 o00Var, int i5, g53 g53Var, of3 of3Var, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, jt6 jt6Var2, long j, long j2, long j3, g0c g0cVar, d0c d0cVar) {
        this.a = u64Var;
        this.b = i;
        this.c = n8aVar;
        this.d = qe8Var;
        this.e = qe8Var2;
        this.f = i2;
        this.g = ce8Var;
        this.h = i3;
        this.i = z;
        this.l = jecVar;
        this.j = bqbVar;
        this.k = i4;
        this.m = jt6Var;
        this.n = f;
        this.o = f2;
        this.p = i5;
        this.q = o00Var;
        this.r = g53Var;
        this.s = of3Var;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = jt6Var2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = g0cVar;
        this.G = d0cVar;
    }

    public final ye8 a(g0c g0cVar) {
        boolean z;
        bqb bqbVar = this.j;
        boolean p = bqbVar.p();
        n8a n8aVar = this.c;
        if (!p && n8aVar.a.b >= bqbVar.o()) {
            z = false;
        } else {
            z = true;
        }
        jte.p(z);
        return new ye8(this.a, this.b, n8aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bqbVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, g0cVar, this.G);
    }

    public final ye8 b(int i, int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        int i3 = this.A;
        if (i3 == 3 && z && i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bqb bqbVar = this.j;
        boolean p = bqbVar.p();
        n8a n8aVar = this.c;
        if (p || n8aVar.a.b < bqbVar.o()) {
            z3 = true;
        }
        jte.p(z3);
        return new ye8(this.a, this.b, n8aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bqbVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ye8 c(bqb bqbVar, n8a n8aVar, int i) {
        boolean z;
        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
            z = false;
        } else {
            z = true;
        }
        jte.p(z);
        return new ye8(this.a, this.b, n8aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bqbVar, i, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final ye8 d(d0c d0cVar) {
        boolean z;
        bqb bqbVar = this.j;
        boolean p = bqbVar.p();
        n8a n8aVar = this.c;
        if (!p && n8aVar.a.b >= bqbVar.o()) {
            z = false;
        } else {
            z = true;
        }
        jte.p(z);
        return new ye8(this.a, this.b, n8aVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bqbVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, d0cVar);
    }

    public final ye8 e(ne8 ne8Var, boolean z, boolean z2) {
        jt6 jt6Var;
        float f;
        float f2;
        o00 o00Var;
        g53 g53Var;
        int i;
        boolean z3;
        jt6 jt6Var2;
        g0c g0cVar;
        int i2;
        boolean a = ne8Var.a(16);
        boolean a2 = ne8Var.a(17);
        n8a n8aVar = this.c;
        n8a a3 = n8aVar.a(a, a2);
        qe8 b = this.d.b(a, a2);
        qe8 b2 = this.e.b(a, a2);
        boolean z4 = true;
        bqb bqbVar = this.j;
        if (!a2 && a && !bqbVar.p()) {
            int i3 = n8aVar.a.b;
            if (bqbVar.o() != 1) {
                aqb m = bqbVar.m(i3, new aqb(), 0L);
                jo5 p = mo5.p();
                int i4 = m.m;
                while (true) {
                    i2 = m.n;
                    if (i4 > i2) {
                        break;
                    }
                    ypb f3 = bqbVar.f(i4, new ypb(), true);
                    f3.c = 0;
                    p.c(f3);
                    i4++;
                }
                m.n = i2 - m.m;
                m.m = 0;
                bqbVar = new zpb(mo5.u(m), p.f(), new int[]{0});
            }
        } else if (z || !a2) {
            bqbVar = bqb.a;
        }
        bqb bqbVar2 = bqbVar;
        if (!ne8Var.a(18)) {
            jt6Var = jt6.M;
        } else {
            jt6Var = this.m;
        }
        jt6 jt6Var3 = jt6Var;
        if (!ne8Var.a(22)) {
            f = 1.0f;
            f2 = 1.0f;
        } else {
            f = this.n;
            f2 = this.o;
        }
        if (!ne8Var.a(21)) {
            o00Var = o00.i;
        } else {
            o00Var = this.q;
        }
        o00 o00Var2 = o00Var;
        if (!ne8Var.a(28)) {
            g53Var = g53.d;
        } else {
            g53Var = this.r;
        }
        g53 g53Var2 = g53Var;
        if (!ne8Var.a(23)) {
            i = 0;
            z3 = false;
        } else {
            i = this.t;
            z3 = this.u;
        }
        if (!ne8Var.a(18)) {
            jt6Var2 = jt6.M;
        } else {
            jt6Var2 = this.B;
        }
        jt6 jt6Var4 = jt6Var2;
        if (!z2 && ne8Var.a(30)) {
            g0cVar = this.F;
        } else {
            g0cVar = g0c.b;
        }
        g0c g0cVar2 = g0cVar;
        if (!bqbVar2.p() && a3.a.b >= bqbVar2.o()) {
            z4 = false;
        }
        jte.p(z4);
        return new ye8(this.a, this.b, a3, b, b2, this.f, this.g, this.h, this.i, this.l, bqbVar2, this.k, jt6Var3, f, f2, o00Var2, this.p, g53Var2, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, jt6Var4, this.C, this.D, this.E, g0cVar2, this.G);
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
        ypb ypbVar;
        int i4;
        ca[] caVarArr;
        Bundle b;
        Bundle bundle3 = new Bundle();
        u64 u64Var = this.a;
        if (u64Var != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(u64.w, u64Var.a);
            bundle4.putLong(u64.x, u64Var.b);
            bundle4.putString(u64.y, u64Var.getMessage());
            bundle4.putBundle(u64.G, u64Var.c);
            Throwable cause = u64Var.getCause();
            if (cause != null) {
                bundle4.putString(u64.E, cause.getClass().getName());
                bundle4.putString(u64.F, cause.getMessage());
            }
            bundle3.putBundle(a0, bundle4);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle3.putInt(c0, i5);
        }
        n8a n8aVar = this.c;
        if (i < 3 || !n8aVar.equals(n8a.l)) {
            bundle3.putBundle(b0, n8aVar.b(i));
        }
        qe8 qe8Var = this.d;
        if (i < 3 || !n8a.k.a(qe8Var)) {
            bundle3.putBundle(d0, qe8Var.c(i));
        }
        qe8 qe8Var2 = this.e;
        if (i < 3 || !n8a.k.a(qe8Var2)) {
            bundle3.putBundle(e0, qe8Var2.c(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle3.putInt(f0, i6);
        }
        ce8 ce8Var = ce8.d;
        ce8 ce8Var2 = this.g;
        if (!ce8Var2.equals(ce8Var)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(ce8.e, ce8Var2.a);
            bundle5.putFloat(ce8.f, ce8Var2.b);
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
        xpb xpbVar = bqb.a;
        bqb bqbVar = this.j;
        boolean z3 = false;
        long j4 = 0;
        boolean z4 = true;
        if (!bqbVar.equals(xpbVar)) {
            ArrayList arrayList2 = new ArrayList();
            int o = bqbVar.o();
            aqb aqbVar = new aqb();
            int i8 = 0;
            while (i8 < o) {
                aqb m = bqbVar.m(i8, aqbVar, 0L);
                m.getClass();
                Bundle bundle6 = new Bundle();
                if (!bt6.g.equals(m.b)) {
                    bundle6.putBundle(aqb.r, m.b.b(i, z3));
                }
                long j5 = m.d;
                if (j5 != -9223372036854775807L) {
                    bundle6.putLong(aqb.s, j5);
                }
                long j6 = m.e;
                if (j6 != -9223372036854775807L) {
                    bundle6.putLong(aqb.t, j6);
                }
                long j7 = m.f;
                if (j7 != -9223372036854775807L) {
                    bundle6.putLong(aqb.u, j7);
                }
                boolean z5 = m.g;
                if (z5) {
                    bundle6.putBoolean(aqb.v, z5);
                }
                boolean z6 = m.h;
                if (z6) {
                    bundle6.putBoolean(aqb.w, z6);
                }
                ws6 ws6Var = m.i;
                if (ws6Var != null) {
                    bundle6.putBundle(aqb.x, ws6Var.b());
                }
                boolean z7 = m.j;
                if (z7) {
                    bundle6.putBoolean(aqb.y, z7);
                }
                long j8 = m.k;
                if (j8 != 0) {
                    bundle6.putLong(aqb.z, j8);
                }
                long j9 = m.l;
                if (j9 != -9223372036854775807L) {
                    bundle6.putLong(aqb.A, j9);
                }
                int i9 = m.m;
                if (i9 != 0) {
                    bundle6.putInt(aqb.B, i9);
                }
                int i10 = m.n;
                if (i10 != 0) {
                    bundle6.putInt(aqb.C, i10);
                }
                long j10 = m.o;
                if (j10 != 0) {
                    bundle6.putLong(aqb.D, j10);
                }
                Object obj = m.a;
                if (obj instanceof String) {
                    bundle6.putString(aqb.E, (String) obj);
                }
                arrayList2.add(bundle6);
                i8++;
                z3 = false;
            }
            ArrayList arrayList3 = new ArrayList();
            int h = bqbVar.h();
            ypb ypbVar2 = new ypb();
            int i11 = 0;
            while (i11 < h) {
                ypb f = bqbVar.f(i11, ypbVar2, z4);
                f.getClass();
                Bundle bundle7 = new Bundle();
                int i12 = f.c;
                if (i12 != 0) {
                    bundle7.putInt(ypb.g, i12);
                }
                long j11 = j4;
                long j12 = f.d;
                if (j12 != -9223372036854775807L) {
                    bundle7.putLong(ypb.h, j12);
                }
                long j13 = f.e;
                if (j13 != j11) {
                    bundle7.putLong(ypb.i, j13);
                }
                boolean z8 = f.f;
                if (z8) {
                    bundle7.putBoolean(ypb.j, z8);
                }
                da daVar = da.c;
                if (!daVar.equals(daVar)) {
                    String str = ypb.k;
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
                        ypb ypbVar3 = ypbVar2;
                        Bundle bundle10 = bundle3;
                        ArrayList arrayList5 = arrayList2;
                        bundle9.putLong(ba.h, j11);
                        bundle9.putInt(ba.i, baVar.a);
                        bundle9.putInt(ba.o, -1);
                        bundle9.putParcelableArrayList(ba.j, new ArrayList<>(Arrays.asList(baVar.b)));
                        String str2 = ba.p;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        bt6[] bt6VarArr = baVar.c;
                        int i16 = i11;
                        int length2 = bt6VarArr.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            bt6 bt6Var = bt6VarArr[i17];
                            int i18 = i17;
                            if (bt6Var == null) {
                                b = null;
                            } else {
                                b = bt6Var.b(i, true);
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
                        ypbVar2 = ypbVar3;
                        bundle3 = bundle10;
                        arrayList2 = arrayList5;
                        i11 = i16;
                        j11 = 0;
                    }
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    ypbVar = ypbVar2;
                    i4 = i11;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(da.e, arrayList4);
                    }
                    bundle7.putBundle(str, bundle8);
                } else {
                    bundle2 = bundle3;
                    arrayList = arrayList2;
                    i3 = h;
                    ypbVar = ypbVar2;
                    i4 = i11;
                }
                Object obj2 = f.a;
                if (obj2 instanceof String) {
                    bundle7.putString(ypb.l, (String) obj2);
                }
                Object obj3 = f.b;
                if (obj3 instanceof String) {
                    bundle7.putString(ypb.m, (String) obj3);
                }
                arrayList3.add(bundle7);
                i11 = i4 + 1;
                h = i3;
                ypbVar2 = ypbVar;
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
                iArr[0] = bqbVar.a(true);
            } else {
                i2 = 0;
                z = true;
            }
            int i19 = z ? 1 : 0;
            while (i19 < o) {
                iArr[i19] = bqbVar.e(iArr[i19 - 1], i2, z);
                i19++;
                i2 = 0;
                z = true;
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBinder(bqb.b, new e41(arrayList8));
            bundle12.putBinder(bqb.c, new e41(arrayList3));
            bundle12.putIntArray(bqb.d, iArr);
            bundle = bundle11;
            bundle.putBundle(L, bundle12);
        } else {
            bundle = bundle3;
        }
        int i20 = this.k;
        if (i20 != 0) {
            bundle.putInt(n0, i20);
        }
        jec jecVar = jec.d;
        jec jecVar2 = this.l;
        if (!jecVar2.equals(jecVar)) {
            Bundle bundle13 = new Bundle();
            int i21 = jecVar2.a;
            if (i21 != 0) {
                bundle13.putInt(jec.e, i21);
            }
            int i22 = jecVar2.b;
            if (i22 != 0) {
                bundle13.putInt(jec.f, i22);
            }
            float f2 = jecVar2.c;
            if (f2 != 1.0f) {
                bundle13.putFloat(jec.g, f2);
            }
            bundle.putBundle(M, bundle13);
        }
        jt6 jt6Var = jt6.M;
        jt6 jt6Var2 = this.m;
        if (!jt6Var2.equals(jt6Var)) {
            bundle.putBundle(N, jt6Var2.c(i));
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
        o00 o00Var = o00.i;
        o00 o00Var2 = this.q;
        if (!o00Var2.equals(o00Var)) {
            Bundle bundle14 = new Bundle();
            int i24 = o00Var2.a;
            if (i24 != 0) {
                bundle14.putInt(o00.j, i24);
            }
            int i25 = o00Var2.b;
            if (i25 != 0) {
                bundle14.putInt(o00.k, i25);
            }
            int i26 = o00Var2.c;
            if (i26 != 1) {
                bundle14.putInt(o00.l, i26);
            }
            int i27 = o00Var2.d;
            if (i27 != 1) {
                bundle14.putInt(o00.m, i27);
            }
            int i28 = o00Var2.e;
            if (i28 != 0) {
                bundle14.putInt(o00.n, i28);
            }
            boolean z9 = o00Var2.f;
            if (z9) {
                bundle14.putBoolean(o00.o, z9);
            }
            boolean z10 = o00Var2.g;
            if (!z10) {
                bundle14.putBoolean(o00.p, z10);
            }
            bundle.putBundle(Q, bundle14);
        }
        g53 g53Var = g53.d;
        g53 g53Var2 = this.r;
        if (!g53Var2.equals(g53Var)) {
            Bundle bundle15 = new Bundle();
            String str4 = g53.e;
            y79 y79Var = g53Var2.a;
            jo5 p = mo5.p();
            for (int i29 = 0; i29 < y79Var.d; i29++) {
                if (((f53) y79Var.get(i29)).d == null) {
                    p.c((f53) y79Var.get(i29));
                }
            }
            y79 f5 = p.f();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(f5.d);
            ko5 listIterator = f5.listIterator(0);
            while (listIterator.hasNext()) {
                f53 f53Var = (f53) listIterator.next();
                Bundle a = f53Var.a();
                Bitmap bitmap = f53Var.d;
                if (bitmap != null) {
                    a.putParcelable(f53.w, bitmap);
                }
                arrayList9.add(a);
            }
            bundle15.putParcelableArrayList(str4, arrayList9);
            bundle15.putLong(g53.f, g53Var2.b);
            bundle.putBundle(g0, bundle15);
        }
        of3 of3Var = of3.c;
        of3 of3Var2 = this.s;
        if (!of3Var2.equals(of3Var)) {
            Bundle bundle16 = new Bundle();
            int i30 = of3Var2.a;
            if (i30 != 0) {
                bundle16.putInt(of3.d, i30);
            }
            int i31 = of3Var2.b;
            if (i31 != 0) {
                bundle16.putInt(of3.e, i31);
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
        jt6 jt6Var3 = jt6.M;
        jt6 jt6Var4 = this.B;
        if (!jt6Var4.equals(jt6Var3)) {
            bundle.putBundle(h0, jt6Var4.c(i));
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
        g0c g0cVar = g0c.b;
        g0c g0cVar2 = this.F;
        if (!g0cVar2.equals(g0cVar)) {
            Bundle bundle17 = new Bundle();
            bundle17.putParcelableArrayList(g0c.c, d41.c(g0cVar2.a, new o41((byte) 20)));
            bundle.putBundle(m0, bundle17);
        }
        d0c d0cVar = d0c.J;
        d0c d0cVar2 = this.G;
        if (!d0cVar2.equals(d0cVar)) {
            bundle.putBundle(l0, d0cVar2.c());
        }
        return bundle;
    }
}
