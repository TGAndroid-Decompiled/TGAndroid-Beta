package defpackage;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
public final class fm6 implements mc8 {
    public final byte a = 0;
    public final Object b;
    public final Object c;

    public fm6(tv6 tv6Var, ad8 ad8Var) {
        this.b = new WeakReference(tv6Var);
        this.c = new WeakReference(ad8Var);
    }

    @Override
    public final void A(int i, nc8 nc8Var, nc8 nc8Var2) {
        byb bybVar;
        boolean z;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                gm6 gm6Var = (gm6) obj;
                if (i == 1) {
                    long j = gm6Var.c;
                    long j2 = -9223372036854775807L;
                    if (j != -9223372036854775807L) {
                        gm6Var.c(j, nc8Var.f);
                    }
                    if (((y54) this.b).j()) {
                        j2 = nc8Var2.f;
                    }
                    gm6Var.c = j2;
                    gl.r(gm6Var.e);
                    return;
                }
                return;
            default:
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((ad8) ((WeakReference) obj).get()) != null) {
                        wc8 wc8Var = i2.s;
                        j54 j54Var = wc8Var.a;
                        int i3 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j3 = wc8Var.C;
                        long j4 = wc8Var.D;
                        long j5 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar2 = wc8Var.G;
                        try {
                            if (!aobVar.p()) {
                                bybVar = bybVar2;
                                if (l6aVar.a.b >= aobVar.o()) {
                                    z = false;
                                    gre.p(z);
                                    i2.s = new wc8(j54Var, i3, l6aVar, nc8Var, nc8Var2, i, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j3, j4, j5, eybVar, bybVar);
                                    i2.c.a(true, true);
                                    lw6 lw6Var = (lw6) i2.h.l.e;
                                    tv6 tv6Var = lw6Var.j;
                                    tv6Var.t();
                                    lw6Var.q0(tv6Var.t);
                                    return;
                                }
                            } else {
                                bybVar = bybVar2;
                            }
                            lw6 lw6Var2 = (lw6) i2.h.l.e;
                            tv6 tv6Var2 = lw6Var2.j;
                            tv6Var2.t();
                            lw6Var2.q0(tv6Var2.t);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        gre.p(z);
                        i2.s = new wc8(j54Var, i3, l6aVar, nc8Var, nc8Var2, i, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j3, j4, j5, eybVar, bybVar);
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
    public final void B(jr6 jr6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i.s;
                        j54 j54Var = wc8Var.a;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var2 = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var2, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var, j, j2, j3, eybVar, bybVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.C();
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void C(jr6 jr6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    wc8 wc8Var = i.s;
                    j54 j54Var = wc8Var.a;
                    int i2 = wc8Var.b;
                    l6a l6aVar = wc8Var.c;
                    nc8 nc8Var = wc8Var.d;
                    nc8 nc8Var2 = wc8Var.e;
                    int i3 = wc8Var.f;
                    zb8 zb8Var = wc8Var.g;
                    int i4 = wc8Var.h;
                    boolean z2 = wc8Var.i;
                    aob aobVar = wc8Var.j;
                    int i5 = wc8Var.k;
                    icc iccVar = wc8Var.l;
                    float f = wc8Var.n;
                    float f2 = wc8Var.o;
                    int i6 = wc8Var.p;
                    nz nzVar = wc8Var.q;
                    v33 v33Var = wc8Var.r;
                    de3 de3Var = wc8Var.s;
                    int i7 = wc8Var.t;
                    boolean z3 = wc8Var.u;
                    boolean z4 = wc8Var.v;
                    int i8 = wc8Var.w;
                    boolean z5 = wc8Var.x;
                    boolean z6 = wc8Var.y;
                    int i9 = wc8Var.z;
                    int i10 = wc8Var.A;
                    jr6 jr6Var2 = wc8Var.B;
                    long j = wc8Var.C;
                    long j2 = wc8Var.D;
                    long j3 = wc8Var.E;
                    eyb eybVar = wc8Var.F;
                    byb bybVar = wc8Var.G;
                    if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gre.p(z);
                    i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.u(jr6Var);
                        return;
                    } catch (RemoteException e) {
                        lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void D(aob aobVar, int i) {
        byb bybVar;
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    ad8 ad8Var = (ad8) ((WeakReference) this.c).get();
                    if (ad8Var != null) {
                        l6a R0 = ad8Var.R0();
                        if (i == 0 && i2.s.j.p()) {
                            wc8 wc8Var = i2.s;
                            j54 j54Var = wc8Var.a;
                            int i3 = wc8Var.b;
                            l6a l6aVar = wc8Var.c;
                            int i4 = wc8Var.f;
                            zb8 zb8Var = wc8Var.g;
                            int i5 = wc8Var.h;
                            boolean z2 = wc8Var.i;
                            aob aobVar2 = wc8Var.j;
                            int i6 = wc8Var.k;
                            icc iccVar = wc8Var.l;
                            jr6 jr6Var = wc8Var.m;
                            float f = wc8Var.n;
                            float f2 = wc8Var.o;
                            int i7 = wc8Var.p;
                            nz nzVar = wc8Var.q;
                            v33 v33Var = wc8Var.r;
                            de3 de3Var = wc8Var.s;
                            int i8 = wc8Var.t;
                            boolean z3 = wc8Var.u;
                            boolean z4 = wc8Var.v;
                            int i9 = wc8Var.w;
                            boolean z5 = wc8Var.x;
                            boolean z6 = wc8Var.y;
                            int i10 = wc8Var.z;
                            int i11 = wc8Var.A;
                            jr6 jr6Var2 = wc8Var.B;
                            long j = wc8Var.C;
                            long j2 = wc8Var.D;
                            long j3 = wc8Var.E;
                            eyb eybVar = wc8Var.F;
                            byb bybVar2 = wc8Var.G;
                            nc8 nc8Var = wc8Var.e;
                            nc8 nc8Var2 = R0.a;
                            if (!aobVar2.p()) {
                                bybVar = bybVar2;
                                if (l6aVar.a.b >= aobVar2.o()) {
                                    z = false;
                                    gre.p(z);
                                    i2.s = new wc8(j54Var, i3, l6aVar, nc8Var, nc8Var2, i4, zb8Var, i5, z2, iccVar, aobVar2, i6, jr6Var, f, f2, nzVar, i7, v33Var, de3Var, i8, z3, z4, i9, i10, i11, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                                }
                            } else {
                                bybVar = bybVar2;
                            }
                            z = true;
                            gre.p(z);
                            i2.s = new wc8(j54Var, i3, l6aVar, nc8Var, nc8Var2, i4, zb8Var, i5, z2, iccVar, aobVar2, i6, jr6Var, f, f2, nzVar, i7, v33Var, de3Var, i8, z3, z4, i9, i10, i11, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        }
                        i2.s = i2.s.c(aobVar, R0, i);
                        i2.c.a(false, true);
                        try {
                            i2.h.l.x(aobVar);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void E(j54 j54Var) {
        byte b = this.a;
    }

    @Override
    public final void F(j54 j54Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i.s;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i.c.a(true, true);
                        try {
                            lw6 lw6Var = (lw6) i.h.l.e;
                            tv6 tv6Var = lw6Var.j;
                            tv6Var.t();
                            lw6Var.q0(tv6Var.t);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void G(w59 w59Var) {
        byte b = this.a;
    }

    @Override
    public final void H(int i, boolean z) {
        byte b = this.a;
    }

    @Override
    public final void J(zb8 zb8Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i.s;
                        j54 j54Var = wc8Var.a;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        int i4 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i.c.a(true, true);
                        try {
                            lw6 lw6Var = (lw6) i.h.l.e;
                            tv6 tv6Var = lw6Var.j;
                            tv6Var.t();
                            lw6Var.q0(tv6Var.t);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void K(kc8 kc8Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        i.f(kc8Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void L(ld7 ld7Var) {
        byte b = this.a;
    }

    @Override
    public final void M(int i, int i2) {
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i3 = i();
                if (i3 != null) {
                    i3.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        i3.d(new ll0(i, i2, (byte) 3));
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
                y54 y54Var = (y54) this.b;
                gm6 gm6Var = (gm6) obj;
                vl6 vl6Var = gm6Var.e;
                if (z) {
                    gm6Var.c = y54Var.m();
                } else {
                    long m = y54Var.m();
                    long j = gm6Var.c;
                    if (j != -9223372036854775807L && m > j) {
                        gm6Var.c(j, m);
                    }
                    gm6Var.c = -9223372036854775807L;
                }
                gl.r(vl6Var);
                if (!z) {
                    gl.e3(vl6Var, 60000L);
                    return;
                }
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) obj).get()) != null) {
                        wc8 wc8Var = i.s;
                        j54 j54Var = wc8Var.a;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z3 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z4 = wc8Var.u;
                        boolean z5 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j2 = wc8Var.C;
                        long j3 = wc8Var.D;
                        long j4 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        gre.p(z2);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z3, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z4, z5, i8, i9, i10, z, z6, jr6Var2, j2, j3, j4, eybVar, bybVar);
                        i.c.a(true, true);
                        try {
                            lw6 lw6Var = (lw6) i.h.l.e;
                            tv6 tv6Var = lw6Var.j;
                            tv6Var.t();
                            lw6Var.q0(tv6Var.t);
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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
    public final void a(icc iccVar) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    wc8 wc8Var = i.s;
                    j54 j54Var = wc8Var.a;
                    int i2 = wc8Var.b;
                    l6a l6aVar = wc8Var.c;
                    nc8 nc8Var = wc8Var.d;
                    nc8 nc8Var2 = wc8Var.e;
                    int i3 = wc8Var.f;
                    zb8 zb8Var = wc8Var.g;
                    int i4 = wc8Var.h;
                    boolean z2 = wc8Var.i;
                    aob aobVar = wc8Var.j;
                    int i5 = wc8Var.k;
                    jr6 jr6Var = wc8Var.m;
                    float f = wc8Var.n;
                    float f2 = wc8Var.o;
                    int i6 = wc8Var.p;
                    nz nzVar = wc8Var.q;
                    v33 v33Var = wc8Var.r;
                    de3 de3Var = wc8Var.s;
                    int i7 = wc8Var.t;
                    boolean z3 = wc8Var.u;
                    boolean z4 = wc8Var.v;
                    int i8 = wc8Var.w;
                    boolean z5 = wc8Var.x;
                    boolean z6 = wc8Var.y;
                    int i9 = wc8Var.z;
                    int i10 = wc8Var.A;
                    jr6 jr6Var2 = wc8Var.B;
                    long j = wc8Var.C;
                    long j2 = wc8Var.D;
                    long j3 = wc8Var.E;
                    eyb eybVar = wc8Var.F;
                    byb bybVar = wc8Var.G;
                    if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gre.p(z);
                    i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.getClass();
                        return;
                    } catch (RemoteException e) {
                        lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i2.s;
                        i2.s = wc8Var.b(wc8Var.w, i, wc8Var.v);
                        i2.c.a(true, true);
                        try {
                            lw6 lw6Var = (lw6) i2.h.l.e;
                            tv6 tv6Var = lw6Var.j;
                            tv6Var.t();
                            lw6Var.q0(tv6Var.t);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(lc8 lc8Var) {
        byte b = this.a;
    }

    @Override
    public final void d(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i2.s;
                        j54 j54Var = wc8Var.a;
                        int i3 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i4 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i5 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i6 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i2.s = new wc8(j54Var, i3, l6aVar, nc8Var, nc8Var2, i4, zb8Var, i5, z2, iccVar, aobVar, i6, jr6Var, f, f2, nzVar, i, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.getClass();
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i2.s;
                        j54 j54Var = wc8Var.a;
                        int i3 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i4 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i2.s = new wc8(j54Var, i3, l6aVar, nc8Var, nc8Var2, i4, zb8Var, i, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.v(i);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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

    public final tv6 i() {
        return (tv6) ((WeakReference) this.b).get();
    }

    @Override
    public final void l(nz nzVar) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i.s;
                        j54 j54Var = wc8Var.a;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i.c.a(true, true);
                        try {
                            lw6 lw6Var = (lw6) i.h.l.e;
                            tv6 tv6Var = lw6Var.j;
                            tv6Var.t();
                            tv6Var.t.H().getClass();
                            ((bv6) lw6Var.p.b).a.setPlaybackToLocal(nzVar.b());
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void m(byb bybVar) {
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        i.s = i.s.d(bybVar);
                        i.c.a(true, true);
                        i.d(new w26(bybVar, (byte) 24));
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
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i.s;
                        j54 j54Var = wc8Var.a;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z3 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z4 = wc8Var.u;
                        boolean z5 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z6 = wc8Var.x;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        gre.p(z2);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z3, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z4, z5, i8, i9, i10, z6, z, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.getClass();
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tv6 i = i();
                if (i != null) {
                    i.t();
                    mv6 mv6Var = i.g.b;
                    mm5 K = mv6Var.K();
                    for (int i2 = 0; i2 < K.size(); i2++) {
                        su6 su6Var = (su6) K.get(i2);
                        mv6Var.x0();
                        bs2 bs2Var = (bs2) ((ps) mv6Var.c).get(su6Var);
                        i.c(su6Var, new w26((byte) 23));
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
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i2.s;
                        i2.s = wc8Var.b(i, wc8Var.z, z);
                        i2.c.a(true, true);
                        try {
                            lw6 lw6Var = (lw6) i2.h.l.e;
                            tv6 tv6Var = lw6Var.j;
                            tv6Var.t();
                            lw6Var.q0(tv6Var.t);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tv6 i = i();
                if (i != null) {
                    i.t();
                    wc8 wc8Var = i.s;
                    j54 j54Var = wc8Var.a;
                    int i2 = wc8Var.b;
                    l6a l6aVar = wc8Var.c;
                    nc8 nc8Var = wc8Var.d;
                    nc8 nc8Var2 = wc8Var.e;
                    int i3 = wc8Var.f;
                    zb8 zb8Var = wc8Var.g;
                    int i4 = wc8Var.h;
                    boolean z2 = wc8Var.i;
                    aob aobVar = wc8Var.j;
                    int i5 = wc8Var.k;
                    icc iccVar = wc8Var.l;
                    jr6 jr6Var = wc8Var.m;
                    float f2 = wc8Var.n;
                    int i6 = wc8Var.p;
                    nz nzVar = wc8Var.q;
                    v33 v33Var = wc8Var.r;
                    de3 de3Var = wc8Var.s;
                    int i7 = wc8Var.t;
                    boolean z3 = wc8Var.u;
                    boolean z4 = wc8Var.v;
                    int i8 = wc8Var.w;
                    boolean z5 = wc8Var.x;
                    boolean z6 = wc8Var.y;
                    int i9 = wc8Var.z;
                    int i10 = wc8Var.A;
                    jr6 jr6Var2 = wc8Var.B;
                    long j = wc8Var.C;
                    long j2 = wc8Var.D;
                    long j3 = wc8Var.E;
                    eyb eybVar = wc8Var.F;
                    byb bybVar = wc8Var.G;
                    if (f != 0.0f) {
                        f2 = f;
                    }
                    if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gre.p(z);
                    i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.getClass();
                        return;
                    } catch (RemoteException e) {
                        lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void r(int i, br6 br6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i2.s;
                        j54 j54Var = wc8Var.a;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i2.s = new wc8(j54Var, i, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.s(br6Var);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tv6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    ad8 ad8Var = (ad8) ((WeakReference) this.c).get();
                    if (ad8Var != null) {
                        wc8 wc8Var = i2.s;
                        j54 U = ad8Var.U();
                        int i3 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i4 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i5 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i6 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i7 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i8 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i9 = wc8Var.w;
                        boolean z5 = wc8Var.y;
                        int i10 = wc8Var.z;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        boolean z6 = false;
                        if (i == 3 && z4 && i10 == 0) {
                            z6 = true;
                        }
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i2.s = new wc8(U, i3, l6aVar, nc8Var, nc8Var2, i4, zb8Var, i5, z2, iccVar, aobVar, i6, jr6Var, f, f2, nzVar, i7, v33Var, de3Var, i8, z3, z4, i9, i10, i, z6, z5, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i2.c.a(true, true);
                        try {
                            spc spcVar = i2.h.l;
                            ad8Var.U();
                            lw6 lw6Var = (lw6) spcVar.e;
                            tv6 tv6Var = lw6Var.j;
                            tv6Var.t();
                            lw6Var.q0(tv6Var.t);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i.s;
                        j54 j54Var = wc8Var.a;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        v33 v33Var = wc8Var.r;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        gre.p(z2);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.w(z);
                            return;
                        } catch (RemoteException e) {
                            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void x(v33 v33Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        wc8 wc8Var = i.s;
                        j54 j54Var = wc8Var.a;
                        int i2 = wc8Var.b;
                        l6a l6aVar = wc8Var.c;
                        nc8 nc8Var = wc8Var.d;
                        nc8 nc8Var2 = wc8Var.e;
                        int i3 = wc8Var.f;
                        zb8 zb8Var = wc8Var.g;
                        int i4 = wc8Var.h;
                        boolean z2 = wc8Var.i;
                        aob aobVar = wc8Var.j;
                        int i5 = wc8Var.k;
                        icc iccVar = wc8Var.l;
                        jr6 jr6Var = wc8Var.m;
                        float f = wc8Var.n;
                        float f2 = wc8Var.o;
                        int i6 = wc8Var.p;
                        nz nzVar = wc8Var.q;
                        de3 de3Var = wc8Var.s;
                        int i7 = wc8Var.t;
                        boolean z3 = wc8Var.u;
                        boolean z4 = wc8Var.v;
                        int i8 = wc8Var.w;
                        boolean z5 = wc8Var.x;
                        boolean z6 = wc8Var.y;
                        int i9 = wc8Var.z;
                        int i10 = wc8Var.A;
                        jr6 jr6Var2 = wc8Var.B;
                        long j = wc8Var.C;
                        long j2 = wc8Var.D;
                        long j3 = wc8Var.E;
                        eyb eybVar = wc8Var.F;
                        byb bybVar = wc8Var.G;
                        if (!aobVar.p() && l6aVar.a.b >= aobVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        gre.p(z);
                        i.s = new wc8(j54Var, i2, l6aVar, nc8Var, nc8Var2, i3, zb8Var, i4, z2, iccVar, aobVar, i5, jr6Var, f, f2, nzVar, i6, v33Var, de3Var, i7, z3, z4, i8, i9, i10, z5, z6, jr6Var2, j, j2, j3, eybVar, bybVar);
                        i.c.a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void z(eyb eybVar) {
        switch (this.a) {
            case 0:
                return;
            default:
                tv6 i = i();
                if (i != null) {
                    i.t();
                    if (((ad8) ((WeakReference) this.c).get()) != null) {
                        i.s = i.s.a(eybVar);
                        i.c.a(true, false);
                        i.d(new w26(eybVar, (byte) 22));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fm6(gm6 gm6Var, y54 y54Var) {
        this.c = gm6Var;
        this.b = y54Var;
    }

    private final void h0() {
    }

    private final void I(lc8 lc8Var) {
    }

    private final void N(boolean z) {
    }

    private final void O(boolean z) {
    }

    private final void Q(boolean z) {
    }

    private final void S(jr6 jr6Var) {
    }

    private final void T(ld7 ld7Var) {
    }

    private final void U(ld7 ld7Var) {
    }

    private final void W(zb8 zb8Var) {
    }

    private final void X(int i) {
    }

    private final void Y(int i) {
    }

    private final void Z(j54 j54Var) {
    }

    private final void a0(j54 j54Var) {
    }

    private final void b0(j54 j54Var) {
    }

    private final void e0(jr6 jr6Var) {
    }

    private final void f0(int i) {
    }

    private final void g0(int i) {
    }

    private final void i0(int i) {
    }

    private final void j(nz nzVar) {
    }

    private final void j0(boolean z) {
    }

    private final void k(int i) {
    }

    private final void k0(boolean z) {
    }

    private final void l0(boolean z) {
    }

    private final void n(kc8 kc8Var) {
    }

    private final void o0(byb bybVar) {
    }

    private final void p0(eyb eybVar) {
    }

    private final void q0(icc iccVar) {
    }

    private final void r0(float f) {
    }

    private final void s(v33 v33Var) {
    }

    private final void u(w59 w59Var) {
    }

    private final void w(w59 w59Var) {
    }

    private final void y(lc8 lc8Var) {
    }

    private final void R(int i, br6 br6Var) {
    }

    private final void V(int i, boolean z) {
    }

    private final void c0(int i, boolean z) {
    }

    private final void d0(int i, boolean z) {
    }

    private final void m0(int i, int i2) {
    }

    private final void n0(aob aobVar, int i) {
    }
}
