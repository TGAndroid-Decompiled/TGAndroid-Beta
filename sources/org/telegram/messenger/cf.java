package org.telegram.messenger;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;
public final class cf implements e2.a1 {
    public final int f23302a = 0;
    public final Object f23303b;
    public final Object f23304c;

    public cf(p4.e0 e0Var, p4.i1 i1Var) {
        this.f23303b = new WeakReference(e0Var);
        this.f23304c = new WeakReference(i1Var);
    }

    @Override
    public final void B(List list) {
        int i7 = this.f23302a;
    }

    @Override
    public final void D(int i7, boolean z10) {
        int i10 = this.f23302a;
    }

    @Override
    public final void E(e2.q1 q1Var) {
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        b10.f55248s = b10.f55248s.d(q1Var);
                        b10.f55234c.a(true, true);
                        b10.d(new org.telegram.utils.twidget.f(q1Var, 23));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void F(e2.z0 z0Var) {
        int i7 = this.f23302a;
    }

    @Override
    public final void H(e2.w0 w0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i7 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) b10.h.f55382j.f26443e;
                                    n0Var.p0(n0Var.h.f55249t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) b10.h.f55382j.f26443e;
                            n0Var2.p0(n0Var2.h.f55249t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
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
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
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
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.i1 i1Var = (p4.i1) ((WeakReference) this.f23304c).get();
                    if (i1Var != null) {
                        b10.f55248s = b10.f55248s.c(l1Var, i1Var.R0(), i7);
                        b10.f55234c.a(false, true);
                        try {
                            b10.h.f55382j.t(l1Var);
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
        int i7 = this.f23302a;
    }

    @Override
    public final void O(e2.y0 y0Var) {
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        b10.f(y0Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void P(boolean z10) {
        boolean z11;
        switch (this.f23302a) {
            case 0:
                l2.p pVar = (l2.p) this.f23303b;
                df dfVar = (df) this.f23304c;
                a aVar = dfVar.f23548e;
                if (z10) {
                    dfVar.f23547c = ((l2.f0) pVar).l();
                } else {
                    long l10 = ((l2.f0) pVar).l();
                    long j3 = dfVar.f23547c;
                    if (j3 != -9223372036854775807L && l10 > j3) {
                        df.a(dfVar, j3, l10);
                    }
                    dfVar.f23547c = -9223372036854775807L;
                }
                g0.r(aVar);
                if (!z10) {
                    g0.h3(aVar, 60000L);
                    return;
                }
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i7 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        boolean z12 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z13 = g1Var.f55302u;
                        boolean z14 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j10 = g1Var.C;
                        long j11 = g1Var.D;
                        long j12 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var = g1Var.G;
                        if (!l1Var.p() && n1Var.f55408a.f10367b >= l1Var.o()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        a8.la.p(z11);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z12, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z13, z14, i15, i16, i17, z10, z15, o0Var2, j10, j11, j12, s1Var, q1Var);
                        b10.f55234c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) b10.h.f55382j.f26443e;
                            n0Var.p0(n0Var.h.f55249t);
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
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = b10.f55248s;
                    e2.v0 v0Var = g1Var.f55284a;
                    int i7 = g1Var.f55285b;
                    p4.n1 n1Var = g1Var.f55286c;
                    e2.b1 b1Var = g1Var.d;
                    e2.b1 b1Var2 = g1Var.f55287e;
                    int i10 = g1Var.f55288f;
                    e2.w0 w0Var = g1Var.f55289g;
                    int i11 = g1Var.h;
                    boolean z11 = g1Var.f55290i;
                    e2.l1 l1Var = g1Var.f55291j;
                    int i12 = g1Var.f55292k;
                    e2.o0 o0Var = g1Var.f55294m;
                    float f10 = g1Var.f55295n;
                    float f11 = g1Var.f55296o;
                    int i13 = g1Var.f55297p;
                    e2.e eVar = g1Var.f55298q;
                    g2.c cVar = g1Var.f55299r;
                    e2.o oVar = g1Var.f55300s;
                    int i14 = g1Var.f55301t;
                    boolean z12 = g1Var.f55302u;
                    boolean z13 = g1Var.v;
                    int i15 = g1Var.f55303w;
                    boolean z14 = g1Var.f55304x;
                    boolean z15 = g1Var.f55305y;
                    int i16 = g1Var.f55306z;
                    int i17 = g1Var.A;
                    e2.o0 o0Var2 = g1Var.B;
                    long j3 = g1Var.C;
                    long j10 = g1Var.D;
                    long j11 = g1Var.E;
                    e2.s1 s1Var = g1Var.F;
                    e2.q1 q1Var2 = g1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f55234c.a(true, true);
                                b10.h.f55382j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.f55382j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.la.p(z10);
                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.f55234c.a(true, true);
                } else {
                    return;
                }
        }
    }

    public p4.e0 b() {
        return (p4.e0) ((WeakReference) this.f23303b).get();
    }

    @Override
    public final void d(int i7) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i10 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i11 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i12 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i13 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.f55248s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i7, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    b10.h.f55382j.getClass();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f55382j.getClass();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i7, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
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
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i10 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i11 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.f55248s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i7, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    b10.h.f55382j.r(i7);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f55382j.r(i7);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i11, w0Var, i7, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void f(boolean z10) {
        int i7 = this.f23302a;
    }

    @Override
    public final void g(int i7) {
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        b10.f55248s = g1Var.b(g1Var.f55303w, i7, g1Var.v);
                        b10.f55234c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) b10.h.f55382j.f26443e;
                            n0Var.p0(n0Var.h.f55249t);
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
    public final void h(boolean z10) {
        int i7 = this.f23302a;
    }

    @Override
    public final void i(int i7) {
        int i10 = this.f23302a;
    }

    @Override
    public final void j(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cf.j(boolean):void");
    }

    @Override
    public final void k(int i7, boolean z10) {
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        b10.f55248s = g1Var.b(i7, g1Var.f55306z, z10);
                        b10.f55234c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) b10.h.f55382j.f26443e;
                            n0Var.p0(n0Var.h.f55249t);
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
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = b10.f55248s;
                    e2.v0 v0Var = g1Var.f55284a;
                    int i7 = g1Var.f55285b;
                    p4.n1 n1Var = g1Var.f55286c;
                    e2.b1 b1Var = g1Var.d;
                    e2.b1 b1Var2 = g1Var.f55287e;
                    int i10 = g1Var.f55288f;
                    e2.w0 w0Var = g1Var.f55289g;
                    int i11 = g1Var.h;
                    boolean z11 = g1Var.f55290i;
                    e2.l1 l1Var = g1Var.f55291j;
                    int i12 = g1Var.f55292k;
                    e2.x1 x1Var = g1Var.f55293l;
                    e2.o0 o0Var = g1Var.f55294m;
                    float f11 = g1Var.f55295n;
                    int i13 = g1Var.f55297p;
                    e2.e eVar = g1Var.f55298q;
                    g2.c cVar = g1Var.f55299r;
                    e2.o oVar = g1Var.f55300s;
                    int i14 = g1Var.f55301t;
                    boolean z12 = g1Var.f55302u;
                    boolean z13 = g1Var.v;
                    int i15 = g1Var.f55303w;
                    boolean z14 = g1Var.f55304x;
                    boolean z15 = g1Var.f55305y;
                    int i16 = g1Var.f55306z;
                    int i17 = g1Var.A;
                    e2.o0 o0Var2 = g1Var.B;
                    long j3 = g1Var.C;
                    long j10 = g1Var.D;
                    long j11 = g1Var.E;
                    e2.s1 s1Var = g1Var.F;
                    e2.q1 q1Var2 = g1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f55234c.a(true, true);
                                b10.h.f55382j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.f55382j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.la.p(z10);
                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.f55234c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void m(int i7) {
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.i1 i1Var = (p4.i1) ((WeakReference) this.f23304c).get();
                    if (i1Var != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 W = i1Var.W();
                        int i10 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i11 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i12 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i13 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i14 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i15 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i16 = g1Var.f55303w;
                        boolean z14 = g1Var.f55305y;
                        int i17 = g1Var.f55306z;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var = g1Var.G;
                        boolean z15 = false;
                        if (i7 == 3 && z13 && i17 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (l1Var.p() || n1Var.f55408a.f10367b < l1Var.o()) {
                            z15 = true;
                        }
                        a8.la.p(z15);
                        b10.f55248s = new p4.g1(W, i10, n1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i7, z10, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
                        try {
                            qe qeVar = b10.h.f55382j;
                            i1Var.W();
                            p4.n0 n0Var = (p4.n0) qeVar.f26443e;
                            n0Var.p0(n0Var.h.f55249t);
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
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    p4.g1 g1Var = b10.f55248s;
                    e2.v0 v0Var = g1Var.f55284a;
                    int i7 = g1Var.f55285b;
                    p4.n1 n1Var = g1Var.f55286c;
                    e2.b1 b1Var = g1Var.d;
                    e2.b1 b1Var2 = g1Var.f55287e;
                    int i10 = g1Var.f55288f;
                    e2.w0 w0Var = g1Var.f55289g;
                    int i11 = g1Var.h;
                    boolean z11 = g1Var.f55290i;
                    e2.l1 l1Var = g1Var.f55291j;
                    int i12 = g1Var.f55292k;
                    e2.x1 x1Var = g1Var.f55293l;
                    float f10 = g1Var.f55295n;
                    float f11 = g1Var.f55296o;
                    int i13 = g1Var.f55297p;
                    e2.e eVar = g1Var.f55298q;
                    g2.c cVar = g1Var.f55299r;
                    e2.o oVar = g1Var.f55300s;
                    int i14 = g1Var.f55301t;
                    boolean z12 = g1Var.f55302u;
                    boolean z13 = g1Var.v;
                    int i15 = g1Var.f55303w;
                    boolean z14 = g1Var.f55304x;
                    boolean z15 = g1Var.f55305y;
                    int i16 = g1Var.f55306z;
                    int i17 = g1Var.A;
                    e2.o0 o0Var2 = g1Var.B;
                    long j3 = g1Var.C;
                    long j10 = g1Var.D;
                    long j11 = g1Var.E;
                    e2.s1 s1Var = g1Var.F;
                    e2.q1 q1Var2 = g1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f55234c.a(true, true);
                                b10.h.f55382j.q(o0Var);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        b10.h.f55382j.q(o0Var);
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.la.p(z10);
                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    b10.f55234c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void o(e2.e eVar) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i7 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) b10.h.f55382j.f26443e;
                                    n0Var.h.f55249t.K().getClass();
                                    ((q4.l) n0Var.f55386n.f55871b).f55853a.setPlaybackToLocal(eVar.b());
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) b10.h.f55382j.f26443e;
                            n0Var2.h.f55249t.K().getClass();
                            ((q4.l) n0Var2.f55386n.f55871b).f55853a.setPlaybackToLocal(eVar.b());
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
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
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    ab.c0 c0Var = b10.f55237g.f55256b;
                    h9.i0 p10 = c0Var.p();
                    for (int i7 = 0; i7 < p10.size(); i7++) {
                        p4.v vVar = (p4.v) p10.get(i7);
                        c0Var.t(vVar);
                        b10.c(vVar, new org.telegram.utils.twidget.f(22));
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void p(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i7 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var2 = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var2, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    b10.h.f55382j.v();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f55382j.v();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var2, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
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
        int i7 = this.f23302a;
    }

    @Override
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
        boolean z10;
        switch (this.f23302a) {
            case 0:
                df dfVar = (df) this.f23304c;
                if (i7 == 1) {
                    long j3 = dfVar.f23547c;
                    long j10 = -9223372036854775807L;
                    if (j3 != -9223372036854775807L) {
                        df.a(dfVar, j3, b1Var.f10370f);
                    }
                    if (((com.google.android.gms.common.api.q) ((l2.p) this.f23303b)).h()) {
                        j10 = b1Var2.f10370f;
                    }
                    dfVar.f23547c = j10;
                    g0.r(dfVar.f23548e);
                    return;
                }
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i10 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j11 = g1Var.C;
                        long j12 = g1Var.D;
                        long j13 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var = g1Var.G;
                        if (!l1Var.p() && n1Var.f55408a.f10367b >= l1Var.o()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i10, n1Var, b1Var, b1Var2, i7, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j11, j12, j13, s1Var, q1Var);
                        b10.f55234c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) b10.h.f55382j.f26443e;
                            n0Var.p0(n0Var.h.f55249t);
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
    public final void t(boolean z10) {
        e2.q1 q1Var;
        boolean z11;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i7 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z11 = false;
                                    a8.la.p(z11);
                                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    b10.h.f55382j.s(z10);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f55382j.s(z10);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z11 = true;
                        a8.la.p(z11);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
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
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        b10.f55248s = b10.f55248s.a(s1Var);
                        b10.f55234c.a(true, false);
                        b10.d(new org.telegram.utils.twidget.f(s1Var, 21));
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
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    b10.h.f55382j.o(l0Var);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            b10.h.f55382j.o(l0Var);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void x(g2.c cVar) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        e2.v0 v0Var = g1Var.f55284a;
                        int i7 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                z10 = false;
                                a8.la.p(z10);
                                b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                b10.f55234c.a(true, true);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
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
        boolean z10;
        switch (this.f23302a) {
            case 0:
                return;
            default:
                p4.e0 b10 = b();
                if (b10 != null) {
                    b10.u();
                    if (((p4.i1) ((WeakReference) this.f23304c).get()) != null) {
                        p4.g1 g1Var = b10.f55248s;
                        int i7 = g1Var.f55285b;
                        p4.n1 n1Var = g1Var.f55286c;
                        e2.b1 b1Var = g1Var.d;
                        e2.b1 b1Var2 = g1Var.f55287e;
                        int i10 = g1Var.f55288f;
                        e2.w0 w0Var = g1Var.f55289g;
                        int i11 = g1Var.h;
                        boolean z11 = g1Var.f55290i;
                        e2.l1 l1Var = g1Var.f55291j;
                        int i12 = g1Var.f55292k;
                        e2.x1 x1Var = g1Var.f55293l;
                        e2.o0 o0Var = g1Var.f55294m;
                        float f10 = g1Var.f55295n;
                        float f11 = g1Var.f55296o;
                        int i13 = g1Var.f55297p;
                        e2.e eVar = g1Var.f55298q;
                        g2.c cVar = g1Var.f55299r;
                        e2.o oVar = g1Var.f55300s;
                        int i14 = g1Var.f55301t;
                        boolean z12 = g1Var.f55302u;
                        boolean z13 = g1Var.v;
                        int i15 = g1Var.f55303w;
                        boolean z14 = g1Var.f55304x;
                        boolean z15 = g1Var.f55305y;
                        int i16 = g1Var.f55306z;
                        int i17 = g1Var.A;
                        e2.o0 o0Var2 = g1Var.B;
                        long j3 = g1Var.C;
                        long j10 = g1Var.D;
                        long j11 = g1Var.E;
                        e2.s1 s1Var = g1Var.F;
                        e2.q1 q1Var2 = g1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (n1Var.f55408a.f10367b >= l1Var.o()) {
                                    z10 = false;
                                    a8.la.p(z10);
                                    b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    b10.f55234c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) b10.h.f55382j.f26443e;
                                    n0Var.p0(n0Var.h.f55249t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) b10.h.f55382j.f26443e;
                            n0Var2.p0(n0Var2.h.f55249t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.la.p(z10);
                        b10.f55248s = new p4.g1(v0Var, i7, n1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        b10.f55234c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public cf(df dfVar, l2.p pVar) {
        this.f23304c = dfVar;
        this.f23303b = pVar;
    }

    private final void h0() {
    }

    private final void A(List list) {
    }

    private final void C(List list) {
    }

    private final void G(e2.z0 z0Var) {
    }

    private final void I(e2.z0 z0Var) {
    }

    private final void K(boolean z10) {
    }

    private final void N(boolean z10) {
    }

    private final void Q(boolean z10) {
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

    private final void c(e2.e eVar) {
    }

    private final void e0(e2.o0 o0Var) {
    }

    private final void f0(int i7) {
    }

    private final void g0(int i7) {
    }

    private final void i0(int i7) {
    }

    private final void j0(boolean z10) {
    }

    private final void k0(boolean z10) {
    }

    private final void l0(boolean z10) {
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

    private final void z(g2.c cVar) {
    }

    private final void R(int i7, e2.l0 l0Var) {
    }

    private final void V(int i7, boolean z10) {
    }

    private final void c0(int i7, boolean z10) {
    }

    private final void d0(int i7, boolean z10) {
    }

    private final void m0(int i7, int i10) {
    }

    private final void n0(e2.l1 l1Var, int i7) {
    }
}
