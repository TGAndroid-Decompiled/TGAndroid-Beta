package org.telegram.messenger;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;
public final class df implements e2.a1 {
    public final int f22021a = 0;
    public final Object f22022b;
    public final Object f22023c;

    public df(p4.d0 d0Var, p4.g1 g1Var) {
        this.f22022b = new WeakReference(d0Var);
        this.f22023c = new WeakReference(g1Var);
    }

    @Override
    public final void B(List list) {
        int i7 = this.f22021a;
    }

    @Override
    public final void C(int i7, boolean z9) {
        int i10 = this.f22021a;
    }

    @Override
    public final void D(e2.q1 q1Var) {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        b10.f53217s = b10.f53217s.d(q1Var);
                        b10.f53203c.a(true, true);
                        b10.d(new org.telegram.utils.twidget.e(q1Var, 17));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void F(e2.z0 z0Var) {
        int i7 = this.f22021a;
    }

    @Override
    public final void H(e2.w0 w0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i7 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) b10.h.f53366j.f25285e;
                                    m0Var.p0(m0Var.h.f53218t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) b10.h.f53366j.f25285e;
                            m0Var2.p0(m0Var2.h.f53218t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void J(int i7, int i10) {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        b10.d(new gh.c(i7, i10, 3));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void L(e2.l1 l1Var, int i7) {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = (p4.g1) ((WeakReference) this.f22023c).get();
                    if (g1Var != null) {
                        b10.f53217s = b10.f53217s.c(l1Var, g1Var.R0(), i7);
                        b10.f53203c.a(false, true);
                        try {
                            b10.h.f53366j.t(l1Var);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void M(e2.q0 q0Var) {
        int i7 = this.f22021a;
    }

    @Override
    public final void O(e2.y0 y0Var) {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        b10.f(y0Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void P(boolean z9) {
        boolean z10;
        switch (this.f22021a) {
            case 0:
                l2.p pVar = (l2.p) this.f22022b;
                ef efVar = (ef) this.f22023c;
                a aVar = efVar.f22219e;
                if (z9) {
                    efVar.f22218c = ((l2.i0) pVar).l();
                } else {
                    long l10 = ((l2.i0) pVar).l();
                    long j3 = efVar.f22218c;
                    if (j3 != -9223372036854775807L && l10 > j3) {
                        ef.a(efVar, j3, l10);
                    }
                    efVar.f22218c = -9223372036854775807L;
                }
                g0.r(aVar);
                if (!z9) {
                    g0.i3(aVar, 60000L);
                    return;
                }
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i7 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z12 = e1Var.f53263u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j10 = e1Var.C;
                        long j11 = e1Var.D;
                        long j12 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        if (!l1Var2.p() && l1Var.f53355a.f10184b >= l1Var2.o()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        a8.ia.p(z10);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z12, z13, i15, i16, i17, z9, z14, o0Var2, j10, j11, j12, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.f53366j.f25285e;
                            m0Var.p0(m0Var.h.f53218t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        b10.t();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void a(e2.x1 x1Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.e1 e1Var = b10.f53217s;
                    e2.v0 v0Var = e1Var.f53245a;
                    int i7 = e1Var.f53246b;
                    p4.l1 l1Var = e1Var.f53247c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.f53248e;
                    int i10 = e1Var.f53249f;
                    e2.w0 w0Var = e1Var.f53250g;
                    int i11 = e1Var.h;
                    boolean z10 = e1Var.f53251i;
                    e2.l1 l1Var2 = e1Var.f53252j;
                    int i12 = e1Var.f53253k;
                    e2.o0 o0Var = e1Var.f53255m;
                    float f10 = e1Var.f53256n;
                    float f11 = e1Var.f53257o;
                    int i13 = e1Var.f53258p;
                    e2.e eVar = e1Var.f53259q;
                    g2.d dVar = e1Var.f53260r;
                    e2.o oVar = e1Var.f53261s;
                    int i14 = e1Var.f53262t;
                    boolean z11 = e1Var.f53263u;
                    boolean z12 = e1Var.v;
                    int i15 = e1Var.f53264w;
                    boolean z13 = e1Var.f53265x;
                    boolean z14 = e1Var.f53266y;
                    int i16 = e1Var.f53267z;
                    int i17 = e1Var.A;
                    e2.o0 o0Var2 = e1Var.B;
                    long j3 = e1Var.C;
                    long j10 = e1Var.D;
                    long j11 = e1Var.E;
                    e2.s1 s1Var = e1Var.F;
                    e2.q1 q1Var2 = e1Var.G;
                    try {
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f53203c.a(true, true);
                                b10.h.f53366j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.f53366j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z9 = true;
                    a8.ia.p(z9);
                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.f53203c.a(true, true);
                } else {
                    return;
                }
        }
    }

    public p4.d0 b() {
        return (p4.d0) ((WeakReference) this.f22022b).get();
    }

    @Override
    public final void c(int i7) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i10 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i11 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i12 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i13 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.f53217s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i7, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    b10.h.f53366j.getClass();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f53366j.getClass();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i7, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void e(int i7) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i10 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i11 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.f53217s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i7, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    b10.h.f53366j.r(i7);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f53366j.r(i7);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i7, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void f(boolean z9) {
        int i7 = this.f22021a;
    }

    @Override
    public final void g(int i7) {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        b10.f53217s = e1Var.b(e1Var.f53264w, i7, e1Var.v);
                        b10.f53203c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.f53366j.f25285e;
                            m0Var.p0(m0Var.h.f53218t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void h(boolean z9) {
        int i7 = this.f22021a;
    }

    @Override
    public final void i(int i7) {
        int i10 = this.f22021a;
    }

    @Override
    public final void j(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.df.j(boolean):void");
    }

    @Override
    public final void k(int i7, boolean z9) {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        b10.f53217s = e1Var.b(i7, e1Var.f53267z, z9);
                        b10.f53203c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.f53366j.f25285e;
                            m0Var.p0(m0Var.h.f53218t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(float f10) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.e1 e1Var = b10.f53217s;
                    e2.v0 v0Var = e1Var.f53245a;
                    int i7 = e1Var.f53246b;
                    p4.l1 l1Var = e1Var.f53247c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.f53248e;
                    int i10 = e1Var.f53249f;
                    e2.w0 w0Var = e1Var.f53250g;
                    int i11 = e1Var.h;
                    boolean z10 = e1Var.f53251i;
                    e2.l1 l1Var2 = e1Var.f53252j;
                    int i12 = e1Var.f53253k;
                    e2.x1 x1Var = e1Var.f53254l;
                    e2.o0 o0Var = e1Var.f53255m;
                    float f11 = e1Var.f53256n;
                    int i13 = e1Var.f53258p;
                    e2.e eVar = e1Var.f53259q;
                    g2.d dVar = e1Var.f53260r;
                    e2.o oVar = e1Var.f53261s;
                    int i14 = e1Var.f53262t;
                    boolean z11 = e1Var.f53263u;
                    boolean z12 = e1Var.v;
                    int i15 = e1Var.f53264w;
                    boolean z13 = e1Var.f53265x;
                    boolean z14 = e1Var.f53266y;
                    int i16 = e1Var.f53267z;
                    int i17 = e1Var.A;
                    e2.o0 o0Var2 = e1Var.B;
                    long j3 = e1Var.C;
                    long j10 = e1Var.D;
                    long j11 = e1Var.E;
                    e2.s1 s1Var = e1Var.F;
                    e2.q1 q1Var2 = e1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f53203c.a(true, true);
                                b10.h.f53366j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.f53366j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z9 = true;
                    a8.ia.p(z9);
                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.f53203c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void m(int i7) {
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = (p4.g1) ((WeakReference) this.f22023c).get();
                    if (g1Var != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 W = g1Var.W();
                        int i10 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i11 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i12 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i13 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i14 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i15 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i16 = e1Var.f53264w;
                        boolean z13 = e1Var.f53266y;
                        int i17 = e1Var.f53267z;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        boolean z14 = false;
                        if (i7 == 3 && z12 && i17 == 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (l1Var2.p() || l1Var.f53355a.f10184b < l1Var2.o()) {
                            z14 = true;
                        }
                        a8.ia.p(z14);
                        b10.f53217s = new p4.e1(W, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i14, dVar, oVar, i15, z11, z12, i16, i17, i7, z9, z13, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                        try {
                            re reVar = b10.h.f53366j;
                            g1Var.W();
                            p4.m0 m0Var = (p4.m0) reVar.f25285e;
                            m0Var.p0(m0Var.h.f53218t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void n(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.e1 e1Var = b10.f53217s;
                    e2.v0 v0Var = e1Var.f53245a;
                    int i7 = e1Var.f53246b;
                    p4.l1 l1Var = e1Var.f53247c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.f53248e;
                    int i10 = e1Var.f53249f;
                    e2.w0 w0Var = e1Var.f53250g;
                    int i11 = e1Var.h;
                    boolean z10 = e1Var.f53251i;
                    e2.l1 l1Var2 = e1Var.f53252j;
                    int i12 = e1Var.f53253k;
                    e2.x1 x1Var = e1Var.f53254l;
                    float f10 = e1Var.f53256n;
                    float f11 = e1Var.f53257o;
                    int i13 = e1Var.f53258p;
                    e2.e eVar = e1Var.f53259q;
                    g2.d dVar = e1Var.f53260r;
                    e2.o oVar = e1Var.f53261s;
                    int i14 = e1Var.f53262t;
                    boolean z11 = e1Var.f53263u;
                    boolean z12 = e1Var.v;
                    int i15 = e1Var.f53264w;
                    boolean z13 = e1Var.f53265x;
                    boolean z14 = e1Var.f53266y;
                    int i16 = e1Var.f53267z;
                    int i17 = e1Var.A;
                    e2.o0 o0Var2 = e1Var.B;
                    long j3 = e1Var.C;
                    long j10 = e1Var.D;
                    long j11 = e1Var.E;
                    e2.s1 s1Var = e1Var.F;
                    e2.q1 q1Var2 = e1Var.G;
                    try {
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f53203c.a(true, true);
                                b10.h.f53366j.q(o0Var);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.f53366j.q(o0Var);
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z9 = true;
                    a8.ia.p(z9);
                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.f53203c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void o(e2.e eVar) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i7 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) b10.h.f53366j.f25285e;
                                    m0Var.h.f53218t.K().getClass();
                                    ((q4.l) m0Var.f53370n.f53804b).f53786a.setPlaybackToLocal(eVar.b());
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) b10.h.f53366j.f25285e;
                            m0Var2.h.f53218t.K().getClass();
                            ((q4.l) m0Var2.f53370n.f53804b).f53786a.setPlaybackToLocal(eVar.b());
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    ui.e eVar = b10.f53206g.f53184b;
                    h9.i0 w10 = eVar.w();
                    for (int i7 = 0; i7 < w10.size(); i7++) {
                        p4.v vVar = (p4.v) w10.get(i7);
                        eVar.A(vVar);
                        b10.c(vVar, new org.telegram.utils.twidget.e(16));
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void p(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i7 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var2 = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var2, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    b10.h.f53366j.v();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f53366j.v();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var2, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void q(e2.v0 v0Var) {
        int i7 = this.f22021a;
    }

    @Override
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
        boolean z9;
        switch (this.f22021a) {
            case 0:
                ef efVar = (ef) this.f22023c;
                if (i7 == 1) {
                    long j3 = efVar.f22218c;
                    long j10 = -9223372036854775807L;
                    if (j3 != -9223372036854775807L) {
                        ef.a(efVar, j3, b1Var.f10187f);
                    }
                    if (((bi.b1) ((l2.p) this.f22022b)).h()) {
                        j10 = b1Var2.f10187f;
                    }
                    efVar.f22218c = j10;
                    g0.r(efVar.f22219e);
                    return;
                }
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i10 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j11 = e1Var.C;
                        long j12 = e1Var.D;
                        long j13 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        if (!l1Var2.p() && l1Var.f53355a.f10184b >= l1Var2.o()) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i7, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j11, j12, j13, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) b10.h.f53366j.f25285e;
                            m0Var.p0(m0Var.h.f53218t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void t(boolean z9) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i7 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ia.p(z10);
                                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z9, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    b10.h.f53366j.s(z9);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f53366j.s(z9);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ia.p(z10);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z9, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void u(e2.s1 s1Var) {
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        b10.f53217s = b10.f53217s.a(s1Var);
                        b10.f53203c.a(true, false);
                        b10.d(new org.telegram.utils.twidget.e(s1Var, 15));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void v(int i7, e2.l0 l0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    b10.h.f53366j.o(l0Var);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f53366j.o(l0Var);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void x(g2.d dVar) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        e2.v0 v0Var = e1Var.f53245a;
                        int i7 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                z9 = false;
                                a8.ia.p(z9);
                                b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f53203c.a(true, true);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void y(e2.v0 v0Var) {
        e2.q1 q1Var;
        boolean z9;
        switch (this.f22021a) {
            case 0:
                return;
            default:
                p4.d0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.g1) ((WeakReference) this.f22023c).get()) != null) {
                        p4.e1 e1Var = b10.f53217s;
                        int i7 = e1Var.f53246b;
                        p4.l1 l1Var = e1Var.f53247c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f53248e;
                        int i10 = e1Var.f53249f;
                        e2.w0 w0Var = e1Var.f53250g;
                        int i11 = e1Var.h;
                        boolean z10 = e1Var.f53251i;
                        e2.l1 l1Var2 = e1Var.f53252j;
                        int i12 = e1Var.f53253k;
                        e2.x1 x1Var = e1Var.f53254l;
                        e2.o0 o0Var = e1Var.f53255m;
                        float f10 = e1Var.f53256n;
                        float f11 = e1Var.f53257o;
                        int i13 = e1Var.f53258p;
                        e2.e eVar = e1Var.f53259q;
                        g2.d dVar = e1Var.f53260r;
                        e2.o oVar = e1Var.f53261s;
                        int i14 = e1Var.f53262t;
                        boolean z11 = e1Var.f53263u;
                        boolean z12 = e1Var.v;
                        int i15 = e1Var.f53264w;
                        boolean z13 = e1Var.f53265x;
                        boolean z14 = e1Var.f53266y;
                        int i16 = e1Var.f53267z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f53355a.f10184b >= l1Var2.o()) {
                                    z9 = false;
                                    a8.ia.p(z9);
                                    b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f53203c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) b10.h.f53366j.f25285e;
                                    m0Var.p0(m0Var.h.f53218t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) b10.h.f53366j.f25285e;
                            m0Var2.p0(m0Var2.h.f53218t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z9 = true;
                        a8.ia.p(z9);
                        b10.f53217s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, dVar, oVar, i14, z11, z12, i15, i16, i17, z13, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f53203c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public df(ef efVar, l2.p pVar) {
        this.f22023c = efVar;
        this.f22022b = pVar;
    }

    private final void h0() {
    }

    private final void A(List list) {
    }

    private final void E(List list) {
    }

    private final void G(e2.z0 z0Var) {
    }

    private final void I(e2.z0 z0Var) {
    }

    private final void K(boolean z9) {
    }

    private final void N(boolean z9) {
    }

    private final void Q(boolean z9) {
    }

    private final void S(e2.o0 o0Var) {
    }

    private final void T(e2.q0 q0Var) {
    }

    private final void U(e2.q0 q0Var) {
    }

    private final void W(e2.w0 w0Var) {
    }

    private final void X(int i7) {
    }

    private final void Y(int i7) {
    }

    private final void Z(e2.v0 v0Var) {
    }

    private final void a0(e2.v0 v0Var) {
    }

    private final void b0(e2.v0 v0Var) {
    }

    private final void d(e2.e eVar) {
    }

    private final void e0(e2.o0 o0Var) {
    }

    private final void f0(int i7) {
    }

    private final void g0(int i7) {
    }

    private final void i0(int i7) {
    }

    private final void j0(boolean z9) {
    }

    private final void k0(boolean z9) {
    }

    private final void l0(boolean z9) {
    }

    private final void o0(e2.q1 q1Var) {
    }

    private final void p0(e2.s1 s1Var) {
    }

    private final void q0(e2.x1 x1Var) {
    }

    private final void r(int i7) {
    }

    private final void r0(float f10) {
    }

    private final void w(e2.y0 y0Var) {
    }

    private final void z(g2.d dVar) {
    }

    private final void R(int i7, e2.l0 l0Var) {
    }

    private final void V(int i7, boolean z9) {
    }

    private final void c0(int i7, boolean z9) {
    }

    private final void d0(int i7, boolean z9) {
    }

    private final void m0(int i7, int i10) {
    }

    private final void n0(e2.l1 l1Var, int i7) {
    }
}
