package m4;

import android.os.RemoteException;
import b2.b2;
import b2.w1;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.ef;
import v7.t6;
public final class d0 implements b2.d1 {
    public final int f12719a = 0;
    public final Object f12720b;
    public final Object f12721c;

    public d0(f0 f0Var, n1 n1Var) {
        this.f12720b = new WeakReference(f0Var);
        this.f12721c = new WeakReference(n1Var);
    }

    @Override
    public final void A(d2.d dVar) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i10 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.f12741c.a(true, true);
                                return;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void C(int i10, b2.p0 p0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    b10.h.f12880j.n(p0Var);
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.f12880j.n(p0Var);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void D(b2.c1 c1Var) {
        int i10 = this.f12719a;
    }

    @Override
    public final void F(b2.u0 u0Var) {
        int i10 = this.f12719a;
    }

    @Override
    public final void H(b2.y0 y0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        int i10 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    p0 p0Var = (p0) b10.h.f12880j.e;
                                    p0Var.p0(p0Var.h.f12755t);
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.f12880j.e;
                            p0Var2.p0(p0Var2.h.f12755t);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void I(List list) {
        int i10 = this.f12719a;
    }

    @Override
    public final void K(int i10, boolean z10) {
        int i11 = this.f12719a;
    }

    @Override
    public final void M(int i10, int i11) {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        b10.d(new i2.v(i10, i11, 2));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void N(w1 w1Var) {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        b10.f12754s = b10.f12754s.a(w1Var);
                        b10.f12741c.a(true, false);
                        b10.d(new k2.k0(w1Var, 12));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void O(b2.o1 o1Var, int i10) {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    n1 n1Var = (n1) ((WeakReference) this.f12721c).get();
                    if (n1Var != null) {
                        b10.f12754s = b10.f12754s.c(o1Var, n1Var.R0(), i10);
                        b10.f12741c.a(false, true);
                        try {
                            b10.h.f12880j.s(o1Var);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void P(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d0.P(boolean):void");
    }

    @Override
    public final void a(int i10) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i11 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i12 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i13 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i14 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i13, z11, b2Var, o1Var, i14, s0Var, f7, f10, fVar, i10, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    b10.h.f12880j.getClass();
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.f12880j.getClass();
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i13, z11, b2Var, o1Var, i14, s0Var, f7, f10, fVar, i10, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public f0 b() {
        return (f0) ((WeakReference) this.f12720b).get();
    }

    @Override
    public final void c(int i10) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i11 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i12 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i10, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    b10.h.f12880j.q(i10);
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.f12880j.q(i10);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i12, z0Var, i10, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void d(b2 b2Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = b10.f12754s;
                    b2.y0 y0Var = l1Var.f12837a;
                    int i10 = l1Var.f12838b;
                    s1 s1Var = l1Var.f12839c;
                    b2.e1 e1Var = l1Var.d;
                    b2.e1 e1Var2 = l1Var.e;
                    int i11 = l1Var.f12840f;
                    b2.z0 z0Var = l1Var.f12841g;
                    int i12 = l1Var.h;
                    boolean z11 = l1Var.f12842i;
                    b2.o1 o1Var = l1Var.f12843j;
                    int i13 = l1Var.f12844k;
                    b2.s0 s0Var = l1Var.f12846m;
                    float f7 = l1Var.f12847n;
                    float f10 = l1Var.f12848o;
                    int i14 = l1Var.f12849p;
                    b2.f fVar = l1Var.f12850q;
                    d2.d dVar = l1Var.f12851r;
                    b2.q qVar = l1Var.f12852s;
                    int i15 = l1Var.f12853t;
                    boolean z12 = l1Var.f12854u;
                    boolean z13 = l1Var.v;
                    int i16 = l1Var.f12855w;
                    boolean z14 = l1Var.f12856x;
                    boolean z15 = l1Var.f12857y;
                    int i17 = l1Var.f12858z;
                    int i18 = l1Var.A;
                    b2.s0 s0Var2 = l1Var.B;
                    long j10 = l1Var.C;
                    long j11 = l1Var.D;
                    long j12 = l1Var.E;
                    w1 w1Var = l1Var.F;
                    b2.u1 u1Var2 = l1Var.G;
                    try {
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.f12741c.a(true, true);
                                b10.h.f12880j.getClass();
                                return;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        b10.h.f12880j.getClass();
                        return;
                    } catch (RemoteException e) {
                        e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z10 = true;
                    t6.p(z10);
                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    b10.f12741c.a(true, true);
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f12719a;
    }

    @Override
    public final void f(int i10) {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b10.f12754s = l1Var.b(l1Var.f12855w, i10, l1Var.v);
                        b10.f12741c.a(true, true);
                        try {
                            p0 p0Var = (p0) b10.h.f12880j.e;
                            p0Var.p0(p0Var.h.f12755t);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void g(boolean z10) {
        int i10 = this.f12719a;
    }

    @Override
    public final void h(int i10) {
        int i11 = this.f12719a;
    }

    @Override
    public final void i(b2.s0 s0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = b10.f12754s;
                    b2.y0 y0Var = l1Var.f12837a;
                    int i10 = l1Var.f12838b;
                    s1 s1Var = l1Var.f12839c;
                    b2.e1 e1Var = l1Var.d;
                    b2.e1 e1Var2 = l1Var.e;
                    int i11 = l1Var.f12840f;
                    b2.z0 z0Var = l1Var.f12841g;
                    int i12 = l1Var.h;
                    boolean z11 = l1Var.f12842i;
                    b2.o1 o1Var = l1Var.f12843j;
                    int i13 = l1Var.f12844k;
                    b2 b2Var = l1Var.f12845l;
                    float f7 = l1Var.f12847n;
                    float f10 = l1Var.f12848o;
                    int i14 = l1Var.f12849p;
                    b2.f fVar = l1Var.f12850q;
                    d2.d dVar = l1Var.f12851r;
                    b2.q qVar = l1Var.f12852s;
                    int i15 = l1Var.f12853t;
                    boolean z12 = l1Var.f12854u;
                    boolean z13 = l1Var.v;
                    int i16 = l1Var.f12855w;
                    boolean z14 = l1Var.f12856x;
                    boolean z15 = l1Var.f12857y;
                    int i17 = l1Var.f12858z;
                    int i18 = l1Var.A;
                    b2.s0 s0Var2 = l1Var.B;
                    long j10 = l1Var.C;
                    long j11 = l1Var.D;
                    long j12 = l1Var.E;
                    w1 w1Var = l1Var.F;
                    b2.u1 u1Var2 = l1Var.G;
                    try {
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.f12741c.a(true, true);
                                b10.h.f12880j.p(s0Var);
                                return;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        b10.h.f12880j.p(s0Var);
                        return;
                    } catch (RemoteException e) {
                        e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z10 = true;
                    t6.p(z10);
                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    b10.f12741c.a(true, true);
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void k(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d0.k(boolean):void");
    }

    @Override
    public final void m(b2.s0 s0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i10 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var2 = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var2, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    b10.h.f12880j.u();
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.f12880j.u();
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var2, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void o(int i10, boolean z10) {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b10.f12754s = l1Var.b(i10, l1Var.f12858z, z10);
                        b10.f12741c.a(true, true);
                        try {
                            p0 p0Var = (p0) b10.h.f12880j.e;
                            p0Var.p0(p0Var.h.f12755t);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    xa.n nVar = b10.f12743g.f12790b;
                    e9.n0 A = nVar.A();
                    for (int i10 = 0; i10 < A.size(); i10++) {
                        w wVar = (w) A.get(i10);
                        nVar.E(wVar);
                        b10.c(wVar, new k2.k0(13));
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void p(b2.b1 b1Var) {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        b10.f(b1Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void q(float f7) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = b10.f12754s;
                    b2.y0 y0Var = l1Var.f12837a;
                    int i10 = l1Var.f12838b;
                    s1 s1Var = l1Var.f12839c;
                    b2.e1 e1Var = l1Var.d;
                    b2.e1 e1Var2 = l1Var.e;
                    int i11 = l1Var.f12840f;
                    b2.z0 z0Var = l1Var.f12841g;
                    int i12 = l1Var.h;
                    boolean z11 = l1Var.f12842i;
                    b2.o1 o1Var = l1Var.f12843j;
                    int i13 = l1Var.f12844k;
                    b2 b2Var = l1Var.f12845l;
                    b2.s0 s0Var = l1Var.f12846m;
                    float f10 = l1Var.f12847n;
                    int i14 = l1Var.f12849p;
                    b2.f fVar = l1Var.f12850q;
                    d2.d dVar = l1Var.f12851r;
                    b2.q qVar = l1Var.f12852s;
                    int i15 = l1Var.f12853t;
                    boolean z12 = l1Var.f12854u;
                    boolean z13 = l1Var.v;
                    int i16 = l1Var.f12855w;
                    boolean z14 = l1Var.f12856x;
                    boolean z15 = l1Var.f12857y;
                    int i17 = l1Var.f12858z;
                    int i18 = l1Var.A;
                    b2.s0 s0Var2 = l1Var.B;
                    long j10 = l1Var.C;
                    long j11 = l1Var.D;
                    long j12 = l1Var.E;
                    w1 w1Var = l1Var.F;
                    b2.u1 u1Var2 = l1Var.G;
                    if (f7 != 0.0f) {
                        f10 = f7;
                    }
                    try {
                        if (!o1Var.p()) {
                            u1Var = u1Var2;
                            if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                z10 = false;
                                t6.p(z10);
                                b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                b10.f12741c.a(true, true);
                                b10.h.f12880j.getClass();
                                return;
                            }
                        } else {
                            u1Var = u1Var2;
                        }
                        b10.h.f12880j.getClass();
                        return;
                    } catch (RemoteException e) {
                        e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z10 = true;
                    t6.p(z10);
                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    b10.f12741c.a(true, true);
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void s(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i11 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i10, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    p0 p0Var = (p0) b10.h.f12880j.e;
                                    p0Var.p0(p0Var.h.f12755t);
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.f12880j.e;
                            p0Var2.p0(p0Var2.h.f12755t);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i11, s1Var, e1Var, e1Var2, i10, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                ef efVar = (ef) this.f12721c;
                if (i10 == 1) {
                    long j13 = efVar.f15558c;
                    long j14 = -9223372036854775807L;
                    if (j13 != -9223372036854775807L) {
                        ef.a(efVar, j13, e1Var.f2024f);
                    }
                    if (((b2.h) ((i2.p) this.f12720b)).i0()) {
                        j14 = e1Var2.f2024f;
                    }
                    efVar.f15558c = j14;
                    org.telegram.messenger.i0.r(efVar.e);
                    return;
                }
                return;
        }
    }

    @Override
    public final void u(int i10) {
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    n1 n1Var = (n1) ((WeakReference) this.f12721c).get();
                    if (n1Var != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 V = n1Var.V();
                        int i11 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i12 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i13 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i14 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i15 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i16 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i17 = l1Var.f12855w;
                        boolean z14 = l1Var.f12857y;
                        int i18 = l1Var.f12858z;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var = l1Var.G;
                        boolean z15 = false;
                        if (i10 == 3 && z13 && i18 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o1Var.p() || s1Var.f12940a.f2022b < o1Var.o()) {
                            z15 = true;
                        }
                        t6.p(z15);
                        b10.f12754s = new l1(V, i11, s1Var, e1Var, e1Var2, i12, z0Var, i13, z11, b2Var, o1Var, i14, s0Var, f7, f10, fVar, i15, dVar, qVar, i16, z12, z13, i17, i18, i10, z10, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                        try {
                            n0 n0Var = b10.h.f12880j;
                            n1Var.V();
                            p0 p0Var = (p0) n0Var.e;
                            p0Var.p0(p0Var.h.f12755t);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void v(b2.y0 y0Var) {
        int i10 = this.f12719a;
    }

    @Override
    public final void w(b2.u1 u1Var) {
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        b10.f12754s = b10.f12754s.d(u1Var);
                        b10.f12741c.a(true, true);
                        b10.d(new k2.k0(u1Var, 14));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void x(boolean z10) {
        b2.u1 u1Var;
        boolean z11;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i10 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i12 = l1Var.h;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z11 = false;
                                    t6.p(z11);
                                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z10, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    b10.h.f12880j.r(z10);
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            b10.h.f12880j.r(z10);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z11 = true;
                        t6.p(z11);
                        b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z10, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void y(b2.f fVar) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i10 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f12840f;
                        b2.z0 z0Var = l1Var.f12841g;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    p0 p0Var = (p0) b10.h.f12880j.e;
                                    p0Var.h.f12755t.J().getClass();
                                    ((n4.l) p0Var.f12884n.f13527a).f13511a.setPlaybackToLocal(fVar.b());
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.f12880j.e;
                            p0Var2.h.f12755t.J().getClass();
                            ((n4.l) p0Var2.f12884n.f13527a).f13511a.setPlaybackToLocal(fVar.b());
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void z(b2.z0 z0Var) {
        b2.u1 u1Var;
        boolean z10;
        switch (this.f12719a) {
            case 0:
                f0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((n1) ((WeakReference) this.f12721c).get()) != null) {
                        l1 l1Var = b10.f12754s;
                        b2.y0 y0Var = l1Var.f12837a;
                        int i10 = l1Var.f12838b;
                        s1 s1Var = l1Var.f12839c;
                        b2.e1 e1Var = l1Var.d;
                        b2.e1 e1Var2 = l1Var.e;
                        int i11 = l1Var.f12840f;
                        int i12 = l1Var.h;
                        boolean z11 = l1Var.f12842i;
                        b2.o1 o1Var = l1Var.f12843j;
                        int i13 = l1Var.f12844k;
                        b2 b2Var = l1Var.f12845l;
                        b2.s0 s0Var = l1Var.f12846m;
                        float f7 = l1Var.f12847n;
                        float f10 = l1Var.f12848o;
                        int i14 = l1Var.f12849p;
                        b2.f fVar = l1Var.f12850q;
                        d2.d dVar = l1Var.f12851r;
                        b2.q qVar = l1Var.f12852s;
                        int i15 = l1Var.f12853t;
                        boolean z12 = l1Var.f12854u;
                        boolean z13 = l1Var.v;
                        int i16 = l1Var.f12855w;
                        boolean z14 = l1Var.f12856x;
                        boolean z15 = l1Var.f12857y;
                        int i17 = l1Var.f12858z;
                        int i18 = l1Var.A;
                        b2.s0 s0Var2 = l1Var.B;
                        long j10 = l1Var.C;
                        long j11 = l1Var.D;
                        long j12 = l1Var.E;
                        w1 w1Var = l1Var.F;
                        b2.u1 u1Var2 = l1Var.G;
                        try {
                            if (!o1Var.p()) {
                                u1Var = u1Var2;
                                if (s1Var.f12940a.f2022b >= o1Var.o()) {
                                    z10 = false;
                                    t6.p(z10);
                                    b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                                    b10.f12741c.a(true, true);
                                    p0 p0Var = (p0) b10.h.f12880j.e;
                                    p0Var.p0(p0Var.h.f12755t);
                                    return;
                                }
                            } else {
                                u1Var = u1Var2;
                            }
                            p0 p0Var2 = (p0) b10.h.f12880j.e;
                            p0Var2.p0(p0Var2.h.f12755t);
                            return;
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z10 = true;
                        t6.p(z10);
                        b10.f12754s = new l1(y0Var, i10, s1Var, e1Var, e1Var2, i11, z0Var, i12, z11, b2Var, o1Var, i13, s0Var, f7, f10, fVar, i14, dVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        b10.f12741c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public d0(ef efVar, i2.p pVar) {
        this.f12721c = efVar;
        this.f12720b = pVar;
    }

    private final void h0() {
    }

    private final void B(List list) {
    }

    private final void E(b2.c1 c1Var) {
    }

    private final void G(b2.c1 c1Var) {
    }

    private final void J(boolean z10) {
    }

    private final void L(boolean z10) {
    }

    private final void Q(boolean z10) {
    }

    private final void S(b2.s0 s0Var) {
    }

    private final void T(b2.u0 u0Var) {
    }

    private final void U(b2.u0 u0Var) {
    }

    private final void W(b2.z0 z0Var) {
    }

    private final void X(int i10) {
    }

    private final void Y(int i10) {
    }

    private final void Z(b2.y0 y0Var) {
    }

    private final void a0(b2.y0 y0Var) {
    }

    private final void b0(b2.y0 y0Var) {
    }

    private final void e0(b2.s0 s0Var) {
    }

    private final void f0(int i10) {
    }

    private final void g0(int i10) {
    }

    private final void i0(int i10) {
    }

    private final void j(b2.f fVar) {
    }

    private final void j0(boolean z10) {
    }

    private final void k0(boolean z10) {
    }

    private final void l(int i10) {
    }

    private final void l0(boolean z10) {
    }

    private final void n(b2.b1 b1Var) {
    }

    private final void o0(b2.u1 u1Var) {
    }

    private final void p0(w1 w1Var) {
    }

    private final void q0(b2 b2Var) {
    }

    private final void r(List list) {
    }

    private final void r0(float f7) {
    }

    private final void t(d2.d dVar) {
    }

    private final void R(int i10, b2.p0 p0Var) {
    }

    private final void V(int i10, boolean z10) {
    }

    private final void c0(int i10, boolean z10) {
    }

    private final void d0(int i10, boolean z10) {
    }

    private final void m0(int i10, int i11) {
    }

    private final void n0(b2.o1 o1Var, int i10) {
    }
}
