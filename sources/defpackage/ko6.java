package defpackage;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
public final class ko6 implements bg8 {
    public final byte a = 0;
    public final Object b;
    public final Object c;

    public ko6(yx6 yx6Var, og8 og8Var) {
        this.b = new WeakReference(yx6Var);
        this.c = new WeakReference(og8Var);
    }

    @Override
    public final void A(int i, cg8 cg8Var, cg8 cg8Var2) {
        c2c c2cVar;
        boolean z;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                lo6 lo6Var = (lo6) obj;
                if (i == 1) {
                    long j = lo6Var.c;
                    long j2 = -9223372036854775807L;
                    if (j != -9223372036854775807L) {
                        lo6Var.c(j, cg8Var.f);
                    }
                    if (((s64) this.b).i()) {
                        j2 = cg8Var2.f;
                    }
                    lo6Var.c = j2;
                    hl.r(lo6Var.e);
                    return;
                }
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((og8) ((WeakReference) obj).get()) != null) {
                        kg8 kg8Var = i2.s;
                        e64 e64Var = kg8Var.a;
                        int i3 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j3 = kg8Var.C;
                        long j4 = kg8Var.D;
                        long j5 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar2 = kg8Var.G;
                        try {
                            if (!asbVar.p()) {
                                c2cVar = c2cVar2;
                                if (daaVar.a.b >= asbVar.o()) {
                                    z = false;
                                    yve.p(z);
                                    i2.s = new kg8(e64Var, i3, daaVar, cg8Var, cg8Var2, i, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j3, j4, j5, f2cVar, c2cVar);
                                    i2.c.a(true, true);
                                    qy6 qy6Var = (qy6) i2.h.l.e;
                                    yx6 yx6Var = qy6Var.j;
                                    yx6Var.t();
                                    qy6Var.q0(yx6Var.t);
                                    return;
                                }
                            } else {
                                c2cVar = c2cVar2;
                            }
                            qy6 qy6Var2 = (qy6) i2.h.l.e;
                            yx6 yx6Var2 = qy6Var2.j;
                            yx6Var2.t();
                            qy6Var2.q0(yx6Var2.t);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        yve.p(z);
                        i2.s = new kg8(e64Var, i3, daaVar, cg8Var, cg8Var2, i, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j3, j4, j5, f2cVar, c2cVar);
                        i2.c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void B(nt6 nt6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i.s;
                        e64 e64Var = kg8Var.a;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var2 = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var2, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var, j, j2, j3, f2cVar, c2cVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.C();
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void C(nt6 nt6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    kg8 kg8Var = i.s;
                    e64 e64Var = kg8Var.a;
                    int i2 = kg8Var.b;
                    daa daaVar = kg8Var.c;
                    cg8 cg8Var = kg8Var.d;
                    cg8 cg8Var2 = kg8Var.e;
                    int i3 = kg8Var.f;
                    of8 of8Var = kg8Var.g;
                    int i4 = kg8Var.h;
                    boolean z2 = kg8Var.i;
                    asb asbVar = kg8Var.j;
                    int i5 = kg8Var.k;
                    ggc ggcVar = kg8Var.l;
                    float f = kg8Var.n;
                    float f2 = kg8Var.o;
                    int i6 = kg8Var.p;
                    oz ozVar = kg8Var.q;
                    n43 n43Var = kg8Var.r;
                    xe3 xe3Var = kg8Var.s;
                    int i7 = kg8Var.t;
                    boolean z3 = kg8Var.u;
                    boolean z4 = kg8Var.v;
                    int i8 = kg8Var.w;
                    boolean z5 = kg8Var.x;
                    boolean z6 = kg8Var.y;
                    int i9 = kg8Var.z;
                    int i10 = kg8Var.A;
                    nt6 nt6Var2 = kg8Var.B;
                    long j = kg8Var.C;
                    long j2 = kg8Var.D;
                    long j3 = kg8Var.E;
                    f2c f2cVar = kg8Var.F;
                    c2c c2cVar = kg8Var.G;
                    if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yve.p(z);
                    i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.u(nt6Var);
                        return;
                    } catch (RemoteException e) {
                        efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void D(asb asbVar, int i) {
        c2c c2cVar;
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    og8 og8Var = (og8) ((WeakReference) this.c).get();
                    if (og8Var != null) {
                        daa R0 = og8Var.R0();
                        if (i == 0 && i2.s.j.p()) {
                            kg8 kg8Var = i2.s;
                            e64 e64Var = kg8Var.a;
                            int i3 = kg8Var.b;
                            daa daaVar = kg8Var.c;
                            int i4 = kg8Var.f;
                            of8 of8Var = kg8Var.g;
                            int i5 = kg8Var.h;
                            boolean z2 = kg8Var.i;
                            asb asbVar2 = kg8Var.j;
                            int i6 = kg8Var.k;
                            ggc ggcVar = kg8Var.l;
                            nt6 nt6Var = kg8Var.m;
                            float f = kg8Var.n;
                            float f2 = kg8Var.o;
                            int i7 = kg8Var.p;
                            oz ozVar = kg8Var.q;
                            n43 n43Var = kg8Var.r;
                            xe3 xe3Var = kg8Var.s;
                            int i8 = kg8Var.t;
                            boolean z3 = kg8Var.u;
                            boolean z4 = kg8Var.v;
                            int i9 = kg8Var.w;
                            boolean z5 = kg8Var.x;
                            boolean z6 = kg8Var.y;
                            int i10 = kg8Var.z;
                            int i11 = kg8Var.A;
                            nt6 nt6Var2 = kg8Var.B;
                            long j = kg8Var.C;
                            long j2 = kg8Var.D;
                            long j3 = kg8Var.E;
                            f2c f2cVar = kg8Var.F;
                            c2c c2cVar2 = kg8Var.G;
                            cg8 cg8Var = kg8Var.e;
                            cg8 cg8Var2 = R0.a;
                            if (!asbVar2.p()) {
                                c2cVar = c2cVar2;
                                if (daaVar.a.b >= asbVar2.o()) {
                                    z = false;
                                    yve.p(z);
                                    i2.s = new kg8(e64Var, i3, daaVar, cg8Var, cg8Var2, i4, of8Var, i5, z2, ggcVar, asbVar2, i6, nt6Var, f, f2, ozVar, i7, n43Var, xe3Var, i8, z3, z4, i9, i10, i11, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                                }
                            } else {
                                c2cVar = c2cVar2;
                            }
                            z = true;
                            yve.p(z);
                            i2.s = new kg8(e64Var, i3, daaVar, cg8Var, cg8Var2, i4, of8Var, i5, z2, ggcVar, asbVar2, i6, nt6Var, f, f2, ozVar, i7, n43Var, xe3Var, i8, z3, z4, i9, i10, i11, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        }
                        i2.s = i2.s.c(asbVar, R0, i);
                        i2.c.a(false, true);
                        try {
                            i2.h.l.x(asbVar);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void E(e64 e64Var) {
        byte b = this.a;
    }

    @Override
    public final void F(e64 e64Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i.s;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i.c.a(true, true);
                        try {
                            qy6 qy6Var = (qy6) i.h.l.e;
                            yx6 yx6Var = qy6Var.j;
                            yx6Var.t();
                            qy6Var.q0(yx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void G(j99 j99Var) {
        byte b = this.a;
    }

    @Override
    public final void H(int i, boolean z) {
        byte b = this.a;
    }

    @Override
    public final void J(of8 of8Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i.s;
                        e64 e64Var = kg8Var.a;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        int i4 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i.c.a(true, true);
                        try {
                            qy6 qy6Var = (qy6) i.h.l.e;
                            yx6 yx6Var = qy6Var.j;
                            yx6Var.t();
                            qy6Var.q0(yx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void K(zf8 zf8Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        i.f(zf8Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void L(uf7 uf7Var) {
        byte b = this.a;
    }

    @Override
    public final void M(int i, int i2) {
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i3 = i();
                if (i3 != null) {
                    i3.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        i3.d(new ml0(i, i2, (byte) 3));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void P(boolean z) {
        boolean z2;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                s64 s64Var = (s64) this.b;
                lo6 lo6Var = (lo6) obj;
                z96 z96Var = lo6Var.e;
                if (z) {
                    lo6Var.c = s64Var.k();
                } else {
                    long k = s64Var.k();
                    long j = lo6Var.c;
                    if (j != -9223372036854775807L && k > j) {
                        lo6Var.c(j, k);
                    }
                    lo6Var.c = -9223372036854775807L;
                }
                hl.r(z96Var);
                if (!z) {
                    hl.d3(z96Var, 60000L);
                    return;
                }
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) obj).get()) != null) {
                        kg8 kg8Var = i.s;
                        e64 e64Var = kg8Var.a;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z3 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z4 = kg8Var.u;
                        boolean z5 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j2 = kg8Var.C;
                        long j3 = kg8Var.D;
                        long j4 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        yve.p(z2);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z3, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z4, z5, i8, i9, i10, z, z6, nt6Var2, j2, j3, j4, f2cVar, c2cVar);
                        i.c.a(true, true);
                        try {
                            qy6 qy6Var = (qy6) i.h.l.e;
                            yx6 yx6Var = qy6Var.j;
                            yx6Var.t();
                            qy6Var.q0(yx6Var.t);
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                        i.r();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void a(ggc ggcVar) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    kg8 kg8Var = i.s;
                    e64 e64Var = kg8Var.a;
                    int i2 = kg8Var.b;
                    daa daaVar = kg8Var.c;
                    cg8 cg8Var = kg8Var.d;
                    cg8 cg8Var2 = kg8Var.e;
                    int i3 = kg8Var.f;
                    of8 of8Var = kg8Var.g;
                    int i4 = kg8Var.h;
                    boolean z2 = kg8Var.i;
                    asb asbVar = kg8Var.j;
                    int i5 = kg8Var.k;
                    nt6 nt6Var = kg8Var.m;
                    float f = kg8Var.n;
                    float f2 = kg8Var.o;
                    int i6 = kg8Var.p;
                    oz ozVar = kg8Var.q;
                    n43 n43Var = kg8Var.r;
                    xe3 xe3Var = kg8Var.s;
                    int i7 = kg8Var.t;
                    boolean z3 = kg8Var.u;
                    boolean z4 = kg8Var.v;
                    int i8 = kg8Var.w;
                    boolean z5 = kg8Var.x;
                    boolean z6 = kg8Var.y;
                    int i9 = kg8Var.z;
                    int i10 = kg8Var.A;
                    nt6 nt6Var2 = kg8Var.B;
                    long j = kg8Var.C;
                    long j2 = kg8Var.D;
                    long j3 = kg8Var.E;
                    f2c f2cVar = kg8Var.F;
                    c2c c2cVar = kg8Var.G;
                    if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yve.p(z);
                    i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.getClass();
                        return;
                    } catch (RemoteException e) {
                        efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void b(int i) {
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i2.s;
                        i2.s = kg8Var.b(kg8Var.w, i, kg8Var.v);
                        i2.c.a(true, true);
                        try {
                            qy6 qy6Var = (qy6) i2.h.l.e;
                            yx6 yx6Var = qy6Var.j;
                            yx6Var.t();
                            qy6Var.q0(yx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(ag8 ag8Var) {
        byte b = this.a;
    }

    @Override
    public final void d(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i2.s;
                        e64 e64Var = kg8Var.a;
                        int i3 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i4 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i5 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i6 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i2.s = new kg8(e64Var, i3, daaVar, cg8Var, cg8Var2, i4, of8Var, i5, z2, ggcVar, asbVar, i6, nt6Var, f, f2, ozVar, i, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.getClass();
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void f(int i) {
        byte b = this.a;
    }

    @Override
    public final void g(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i2.s;
                        e64 e64Var = kg8Var.a;
                        int i3 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i4 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i2.s = new kg8(e64Var, i3, daaVar, cg8Var, cg8Var2, i4, of8Var, i, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.v(i);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void h(boolean z) {
        byte b = this.a;
    }

    public final yx6 i() {
        return (yx6) ((WeakReference) this.b).get();
    }

    @Override
    public final void l(oz ozVar) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i.s;
                        e64 e64Var = kg8Var.a;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i.c.a(true, true);
                        try {
                            qy6 qy6Var = (qy6) i.h.l.e;
                            yx6 yx6Var = qy6Var.j;
                            yx6Var.t();
                            yx6Var.t.H().getClass();
                            ((gx6) qy6Var.p.b).a.setPlaybackToLocal(ozVar.b());
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void m(c2c c2cVar) {
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        i.s = i.s.d(c2cVar);
                        i.c.a(true, true);
                        i.d(new tq6(c2cVar, (byte) 6));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void o(boolean z) {
        boolean z2;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i.s;
                        e64 e64Var = kg8Var.a;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z3 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z4 = kg8Var.u;
                        boolean z5 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z6 = kg8Var.x;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        yve.p(z2);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z3, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z4, z5, i8, i9, i10, z6, z, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.getClass();
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                        i.r();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    rx6 rx6Var = i.g.b;
                    po5 L = rx6Var.L();
                    for (int i2 = 0; i2 < L.size(); i2++) {
                        xw6 xw6Var = (xw6) L.get(i2);
                        rx6Var.D0();
                        us2 us2Var = (us2) ((qs) rx6Var.c).get(xw6Var);
                        i.c(xw6Var, new tq6((byte) 5));
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void p(int i, boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i2.s;
                        i2.s = kg8Var.b(i, kg8Var.z, z);
                        i2.c.a(true, true);
                        try {
                            qy6 qy6Var = (qy6) i2.h.l.e;
                            yx6 yx6Var = qy6Var.j;
                            yx6Var.t();
                            qy6Var.q0(yx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(float f) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    kg8 kg8Var = i.s;
                    e64 e64Var = kg8Var.a;
                    int i2 = kg8Var.b;
                    daa daaVar = kg8Var.c;
                    cg8 cg8Var = kg8Var.d;
                    cg8 cg8Var2 = kg8Var.e;
                    int i3 = kg8Var.f;
                    of8 of8Var = kg8Var.g;
                    int i4 = kg8Var.h;
                    boolean z2 = kg8Var.i;
                    asb asbVar = kg8Var.j;
                    int i5 = kg8Var.k;
                    ggc ggcVar = kg8Var.l;
                    nt6 nt6Var = kg8Var.m;
                    float f2 = kg8Var.n;
                    int i6 = kg8Var.p;
                    oz ozVar = kg8Var.q;
                    n43 n43Var = kg8Var.r;
                    xe3 xe3Var = kg8Var.s;
                    int i7 = kg8Var.t;
                    boolean z3 = kg8Var.u;
                    boolean z4 = kg8Var.v;
                    int i8 = kg8Var.w;
                    boolean z5 = kg8Var.x;
                    boolean z6 = kg8Var.y;
                    int i9 = kg8Var.z;
                    int i10 = kg8Var.A;
                    nt6 nt6Var2 = kg8Var.B;
                    long j = kg8Var.C;
                    long j2 = kg8Var.D;
                    long j3 = kg8Var.E;
                    f2c f2cVar = kg8Var.F;
                    c2c c2cVar = kg8Var.G;
                    if (f != 0.0f) {
                        f2 = f;
                    }
                    if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yve.p(z);
                    i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.getClass();
                        return;
                    } catch (RemoteException e) {
                        efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void r(int i, ft6 ft6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i2.s;
                        e64 e64Var = kg8Var.a;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i2.s = new kg8(e64Var, i, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.s(ft6Var);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void t(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    og8 og8Var = (og8) ((WeakReference) this.c).get();
                    if (og8Var != null) {
                        kg8 kg8Var = i2.s;
                        e64 U = og8Var.U();
                        int i3 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i4 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i5 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i6 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i7 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i8 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i9 = kg8Var.w;
                        boolean z5 = kg8Var.y;
                        int i10 = kg8Var.z;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        boolean z6 = false;
                        if (i == 3 && z4 && i10 == 0) {
                            z6 = true;
                        }
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i2.s = new kg8(U, i3, daaVar, cg8Var, cg8Var2, i4, of8Var, i5, z2, ggcVar, asbVar, i6, nt6Var, f, f2, ozVar, i7, n43Var, xe3Var, i8, z3, z4, i9, i10, i, z6, z5, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i2.c.a(true, true);
                        try {
                            guc gucVar = i2.h.l;
                            og8Var.U();
                            qy6 qy6Var = (qy6) gucVar.e;
                            yx6 yx6Var = qy6Var.j;
                            yx6Var.t();
                            qy6Var.q0(yx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void v(boolean z) {
        boolean z2;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i.s;
                        e64 e64Var = kg8Var.a;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        n43 n43Var = kg8Var.r;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        yve.p(z2);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.w(z);
                            return;
                        } catch (RemoteException e) {
                            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void x(n43 n43Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        kg8 kg8Var = i.s;
                        e64 e64Var = kg8Var.a;
                        int i2 = kg8Var.b;
                        daa daaVar = kg8Var.c;
                        cg8 cg8Var = kg8Var.d;
                        cg8 cg8Var2 = kg8Var.e;
                        int i3 = kg8Var.f;
                        of8 of8Var = kg8Var.g;
                        int i4 = kg8Var.h;
                        boolean z2 = kg8Var.i;
                        asb asbVar = kg8Var.j;
                        int i5 = kg8Var.k;
                        ggc ggcVar = kg8Var.l;
                        nt6 nt6Var = kg8Var.m;
                        float f = kg8Var.n;
                        float f2 = kg8Var.o;
                        int i6 = kg8Var.p;
                        oz ozVar = kg8Var.q;
                        xe3 xe3Var = kg8Var.s;
                        int i7 = kg8Var.t;
                        boolean z3 = kg8Var.u;
                        boolean z4 = kg8Var.v;
                        int i8 = kg8Var.w;
                        boolean z5 = kg8Var.x;
                        boolean z6 = kg8Var.y;
                        int i9 = kg8Var.z;
                        int i10 = kg8Var.A;
                        nt6 nt6Var2 = kg8Var.B;
                        long j = kg8Var.C;
                        long j2 = kg8Var.D;
                        long j3 = kg8Var.E;
                        f2c f2cVar = kg8Var.F;
                        c2c c2cVar = kg8Var.G;
                        if (!asbVar.p() && daaVar.a.b >= asbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        yve.p(z);
                        i.s = new kg8(e64Var, i2, daaVar, cg8Var, cg8Var2, i3, of8Var, i4, z2, ggcVar, asbVar, i5, nt6Var, f, f2, ozVar, i6, n43Var, xe3Var, i7, z3, z4, i8, i9, i10, z5, z6, nt6Var2, j, j2, j3, f2cVar, c2cVar);
                        i.c.a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void z(f2c f2cVar) {
        switch (this.a) {
            case 0:
                return;
            default:
                yx6 i = i();
                if (i != null) {
                    i.t();
                    if (((og8) ((WeakReference) this.c).get()) != null) {
                        i.s = i.s.a(f2cVar);
                        i.c.a(true, false);
                        i.d(new tq6(f2cVar, (byte) 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void h0() {
    }

    public ko6(lo6 lo6Var, s64 s64Var) {
        this.c = lo6Var;
        this.b = s64Var;
    }

    private final void I(ag8 ag8Var) {
    }

    private final void N(boolean z) {
    }

    private final void O(boolean z) {
    }

    private final void Q(boolean z) {
    }

    private final void S(nt6 nt6Var) {
    }

    private final void T(uf7 uf7Var) {
    }

    private final void U(uf7 uf7Var) {
    }

    private final void W(of8 of8Var) {
    }

    private final void X(int i) {
    }

    private final void Y(int i) {
    }

    private final void Z(e64 e64Var) {
    }

    private final void a0(e64 e64Var) {
    }

    private final void b0(e64 e64Var) {
    }

    private final void e0(nt6 nt6Var) {
    }

    private final void f0(int i) {
    }

    private final void g0(int i) {
    }

    private final void i0(int i) {
    }

    private final void j(oz ozVar) {
    }

    private final void j0(boolean z) {
    }

    private final void k(int i) {
    }

    private final void k0(boolean z) {
    }

    private final void l0(boolean z) {
    }

    private final void n(zf8 zf8Var) {
    }

    private final void o0(c2c c2cVar) {
    }

    private final void p0(f2c f2cVar) {
    }

    private final void q0(ggc ggcVar) {
    }

    private final void r0(float f) {
    }

    private final void s(n43 n43Var) {
    }

    private final void u(j99 j99Var) {
    }

    private final void w(j99 j99Var) {
    }

    private final void y(ag8 ag8Var) {
    }

    private final void R(int i, ft6 ft6Var) {
    }

    private final void V(int i, boolean z) {
    }

    private final void c0(int i, boolean z) {
    }

    private final void d0(int i, boolean z) {
    }

    private final void m0(int i, int i2) {
    }

    private final void n0(asb asbVar, int i) {
    }
}
