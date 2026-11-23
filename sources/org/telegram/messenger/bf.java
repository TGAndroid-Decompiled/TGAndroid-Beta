package org.telegram.messenger;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;
public final class bf implements e2.a1 {
    public final int f23186a = 0;
    public final Object f23187b;
    public final Object f23188c;

    public bf(p4.d0 d0Var, p4.h1 h1Var) {
        this.f23187b = new WeakReference(d0Var);
        this.f23188c = new WeakReference(h1Var);
    }

    @Override
    public final void B(List list) {
        int i7 = this.f23186a;
    }

    @Override
    public final void D(int i7, boolean z10) {
        int i10 = this.f23186a;
    }

    @Override
    public final void E(e2.q1 q1Var) {
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        i7.f55323s = i7.f55323s.d(q1Var);
                        i7.f55309c.a(true, true);
                        i7.d(new org.telegram.utils.twidget.f(q1Var, 23));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void F(e2.z0 z0Var) {
        int i7 = this.f23186a;
    }

    @Override
    public final void H(e2.w0 w0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i7.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i10 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.f55309c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) i7.h.f55483j.f26328e;
                                    n0Var.p0(n0Var.h.f55324t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) i7.h.f55483j.f26328e;
                            n0Var2.p0(n0Var2.h.f55324t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.f55309c.a(true, true);
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i11 = i();
                if (i11 != null) {
                    i11.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        i11.d(new gh.c(i7, i10, 3));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void L(e2.l1 l1Var, int i7) {
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    p4.h1 h1Var = (p4.h1) ((WeakReference) this.f23188c).get();
                    if (h1Var != null) {
                        i10.f55323s = i10.f55323s.c(l1Var, h1Var.R0(), i7);
                        i10.f55309c.a(false, true);
                        try {
                            i10.h.f55483j.t(l1Var);
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
        int i7 = this.f23186a;
    }

    @Override
    public final void O(e2.y0 y0Var) {
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        i7.f(y0Var);
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
        switch (this.f23186a) {
            case 0:
                l2.q qVar = (l2.q) this.f23187b;
                cf cfVar = (cf) this.f23188c;
                a aVar = cfVar.f23462e;
                if (z10) {
                    cfVar.f23461c = ((l2.g0) qVar).n();
                } else {
                    long n10 = ((l2.g0) qVar).n();
                    long j3 = cfVar.f23461c;
                    if (j3 != -9223372036854775807L && n10 > j3) {
                        cf.a(cfVar, j3, n10);
                    }
                    cfVar.f23461c = -9223372036854775807L;
                }
                g0.r(aVar);
                if (!z10) {
                    g0.h3(aVar, 60000L);
                    return;
                }
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i7.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i10 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        boolean z12 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z13 = f1Var.f55380u;
                        boolean z14 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j10 = f1Var.C;
                        long j11 = f1Var.D;
                        long j12 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var = f1Var.G;
                        if (!l1Var.p() && m1Var.f55471a.f10328b >= l1Var.o()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        a8.ma.p(z11);
                        i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z12, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z13, z14, i16, i17, i18, z10, z15, o0Var2, j10, j11, j12, s1Var, q1Var);
                        i7.f55309c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i7.h.f55483j.f26328e;
                            n0Var.p0(n0Var.h.f55324t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        i7.t();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void a(int i7) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i10.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i11 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i12 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i13 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i14 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i10.f55323s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i13, z11, x1Var, l1Var, i14, o0Var, f10, f11, eVar, i7, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i10.f55309c.a(true, true);
                                    i10.h.f55483j.getClass();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i10.h.f55483j.getClass();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i10.f55323s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i13, z11, x1Var, l1Var, i14, o0Var, f10, f11, eVar, i7, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.f55309c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void b(e2.x1 x1Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    p4.f1 f1Var = i7.f55323s;
                    e2.v0 v0Var = f1Var.f55362a;
                    int i10 = f1Var.f55363b;
                    p4.m1 m1Var = f1Var.f55364c;
                    e2.b1 b1Var = f1Var.d;
                    e2.b1 b1Var2 = f1Var.f55365e;
                    int i11 = f1Var.f55366f;
                    e2.w0 w0Var = f1Var.f55367g;
                    int i12 = f1Var.h;
                    boolean z11 = f1Var.f55368i;
                    e2.l1 l1Var = f1Var.f55369j;
                    int i13 = f1Var.f55370k;
                    e2.o0 o0Var = f1Var.f55372m;
                    float f10 = f1Var.f55373n;
                    float f11 = f1Var.f55374o;
                    int i14 = f1Var.f55375p;
                    e2.e eVar = f1Var.f55376q;
                    g2.c cVar = f1Var.f55377r;
                    e2.o oVar = f1Var.f55378s;
                    int i15 = f1Var.f55379t;
                    boolean z12 = f1Var.f55380u;
                    boolean z13 = f1Var.v;
                    int i16 = f1Var.f55381w;
                    boolean z14 = f1Var.f55382x;
                    boolean z15 = f1Var.f55383y;
                    int i17 = f1Var.f55384z;
                    int i18 = f1Var.A;
                    e2.o0 o0Var2 = f1Var.B;
                    long j3 = f1Var.C;
                    long j10 = f1Var.D;
                    long j11 = f1Var.E;
                    e2.s1 s1Var = f1Var.F;
                    e2.q1 q1Var2 = f1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.f55309c.a(true, true);
                                i7.h.f55483j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        i7.h.f55483j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.ma.p(z10);
                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    i7.f55309c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void c(boolean z10) {
        int i7 = this.f23186a;
    }

    @Override
    public final void d(int i7) {
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i10.f55323s;
                        i10.f55323s = f1Var.b(f1Var.f55381w, i7, f1Var.v);
                        i10.f55309c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i10.h.f55483j.f26328e;
                            n0Var.p0(n0Var.h.f55324t);
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
    public final void e(int i7) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i10.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i11 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i12 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i10.f55323s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i7, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i10.f55309c.a(true, true);
                                    i10.h.f55483j.r(i7);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i10.h.f55483j.r(i7);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i10.f55323s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i12, w0Var, i7, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.f55309c.a(true, true);
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
        int i7 = this.f23186a;
    }

    @Override
    public final void g(int i7) {
        int i10 = this.f23186a;
    }

    @Override
    public final void h(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bf.h(boolean):void");
    }

    public p4.d0 i() {
        return (p4.d0) ((WeakReference) this.f23187b).get();
    }

    @Override
    public final void j(int i7, boolean z10) {
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i10.f55323s;
                        i10.f55323s = f1Var.b(i7, f1Var.f55384z, z10);
                        i10.f55309c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i10.h.f55483j.f26328e;
                            n0Var.p0(n0Var.h.f55324t);
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
    public final void k(float f10) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    p4.f1 f1Var = i7.f55323s;
                    e2.v0 v0Var = f1Var.f55362a;
                    int i10 = f1Var.f55363b;
                    p4.m1 m1Var = f1Var.f55364c;
                    e2.b1 b1Var = f1Var.d;
                    e2.b1 b1Var2 = f1Var.f55365e;
                    int i11 = f1Var.f55366f;
                    e2.w0 w0Var = f1Var.f55367g;
                    int i12 = f1Var.h;
                    boolean z11 = f1Var.f55368i;
                    e2.l1 l1Var = f1Var.f55369j;
                    int i13 = f1Var.f55370k;
                    e2.x1 x1Var = f1Var.f55371l;
                    e2.o0 o0Var = f1Var.f55372m;
                    float f11 = f1Var.f55373n;
                    int i14 = f1Var.f55375p;
                    e2.e eVar = f1Var.f55376q;
                    g2.c cVar = f1Var.f55377r;
                    e2.o oVar = f1Var.f55378s;
                    int i15 = f1Var.f55379t;
                    boolean z12 = f1Var.f55380u;
                    boolean z13 = f1Var.v;
                    int i16 = f1Var.f55381w;
                    boolean z14 = f1Var.f55382x;
                    boolean z15 = f1Var.f55383y;
                    int i17 = f1Var.f55384z;
                    int i18 = f1Var.A;
                    e2.o0 o0Var2 = f1Var.B;
                    long j3 = f1Var.C;
                    long j10 = f1Var.D;
                    long j11 = f1Var.E;
                    e2.s1 s1Var = f1Var.F;
                    e2.q1 q1Var2 = f1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.f55309c.a(true, true);
                                i7.h.f55483j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        i7.h.f55483j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.ma.p(z10);
                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    i7.f55309c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void m(int i7) {
        boolean z10;
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    p4.h1 h1Var = (p4.h1) ((WeakReference) this.f23188c).get();
                    if (h1Var != null) {
                        p4.f1 f1Var = i10.f55323s;
                        e2.v0 X = h1Var.X();
                        int i11 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i12 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i13 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i14 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i15 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i16 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i17 = f1Var.f55381w;
                        boolean z14 = f1Var.f55383y;
                        int i18 = f1Var.f55384z;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var = f1Var.G;
                        boolean z15 = false;
                        if (i7 == 3 && z13 && i18 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (l1Var.p() || m1Var.f55471a.f10328b < l1Var.o()) {
                            z15 = true;
                        }
                        a8.ma.p(z15);
                        i10.f55323s = new p4.f1(X, i11, m1Var, b1Var, b1Var2, i12, w0Var, i13, z11, x1Var, l1Var, i14, o0Var, f10, f11, eVar, i15, cVar, oVar, i16, z12, z13, i17, i18, i7, z10, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.f55309c.a(true, true);
                        try {
                            pe peVar = i10.h.f55483j;
                            h1Var.X();
                            p4.n0 n0Var = (p4.n0) peVar.f26328e;
                            n0Var.p0(n0Var.h.f55324t);
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    p4.f1 f1Var = i7.f55323s;
                    e2.v0 v0Var = f1Var.f55362a;
                    int i10 = f1Var.f55363b;
                    p4.m1 m1Var = f1Var.f55364c;
                    e2.b1 b1Var = f1Var.d;
                    e2.b1 b1Var2 = f1Var.f55365e;
                    int i11 = f1Var.f55366f;
                    e2.w0 w0Var = f1Var.f55367g;
                    int i12 = f1Var.h;
                    boolean z11 = f1Var.f55368i;
                    e2.l1 l1Var = f1Var.f55369j;
                    int i13 = f1Var.f55370k;
                    e2.x1 x1Var = f1Var.f55371l;
                    float f10 = f1Var.f55373n;
                    float f11 = f1Var.f55374o;
                    int i14 = f1Var.f55375p;
                    e2.e eVar = f1Var.f55376q;
                    g2.c cVar = f1Var.f55377r;
                    e2.o oVar = f1Var.f55378s;
                    int i15 = f1Var.f55379t;
                    boolean z12 = f1Var.f55380u;
                    boolean z13 = f1Var.v;
                    int i16 = f1Var.f55381w;
                    boolean z14 = f1Var.f55382x;
                    boolean z15 = f1Var.f55383y;
                    int i17 = f1Var.f55384z;
                    int i18 = f1Var.A;
                    e2.o0 o0Var2 = f1Var.B;
                    long j3 = f1Var.C;
                    long j10 = f1Var.D;
                    long j11 = f1Var.E;
                    e2.s1 s1Var = f1Var.F;
                    e2.q1 q1Var2 = f1Var.G;
                    try {
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.f55309c.a(true, true);
                                i7.h.f55483j.q(o0Var);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        i7.h.f55483j.q(o0Var);
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.ma.p(z10);
                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    i7.f55309c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void o(e2.e eVar) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i7.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i10 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.f55309c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) i7.h.f55483j.f26328e;
                                    n0Var.h.f55324t.L().getClass();
                                    ((q4.l) n0Var.f55487n.f55949b).f55931a.setPlaybackToLocal(eVar.b());
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) i7.h.f55483j.f26328e;
                            n0Var2.h.f55324t.L().getClass();
                            ((q4.l) n0Var2.f55487n.f55949b).f55931a.setPlaybackToLocal(eVar.b());
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.f55309c.a(true, true);
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    ab.c0 c0Var = i7.f55312g.f55331b;
                    h9.i0 s5 = c0Var.s();
                    for (int i10 = 0; i10 < s5.size(); i10++) {
                        p4.v vVar = (p4.v) s5.get(i10);
                        c0Var.w(vVar);
                        i7.c(vVar, new org.telegram.utils.twidget.f(22));
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i7.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i10 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var2 = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var2, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                                    i7.f55309c.a(true, true);
                                    i7.h.f55483j.v();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i7.h.f55483j.v();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var2, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                        i7.f55309c.a(true, true);
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
        int i7 = this.f23186a;
    }

    @Override
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
        boolean z10;
        switch (this.f23186a) {
            case 0:
                cf cfVar = (cf) this.f23188c;
                if (i7 == 1) {
                    long j3 = cfVar.f23461c;
                    long j10 = -9223372036854775807L;
                    if (j3 != -9223372036854775807L) {
                        cf.a(cfVar, j3, b1Var.f10331f);
                    }
                    if (((com.google.android.gms.common.api.q) ((l2.q) this.f23187b)).j()) {
                        j10 = b1Var2.f10331f;
                    }
                    cfVar.f23461c = j10;
                    g0.r(cfVar.f23462e);
                    return;
                }
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i10.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i11 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j11 = f1Var.C;
                        long j12 = f1Var.D;
                        long j13 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var = f1Var.G;
                        if (!l1Var.p() && m1Var.f55471a.f10328b >= l1Var.o()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        a8.ma.p(z10);
                        i10.f55323s = new p4.f1(v0Var, i11, m1Var, b1Var, b1Var2, i7, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j11, j12, j13, s1Var, q1Var);
                        i10.f55309c.a(true, true);
                        try {
                            p4.n0 n0Var = (p4.n0) i10.h.f55483j.f26328e;
                            n0Var.p0(n0Var.h.f55324t);
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i7.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i10 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z11 = false;
                                    a8.ma.p(z11);
                                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.f55309c.a(true, true);
                                    i7.h.f55483j.s(z10);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i7.h.f55483j.s(z10);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z11 = true;
                        a8.ma.p(z11);
                        i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z10, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.f55309c.a(true, true);
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        i7.f55323s = i7.f55323s.a(s1Var);
                        i7.f55309c.a(true, false);
                        i7.d(new org.telegram.utils.twidget.f(s1Var, 21));
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i10 = i();
                if (i10 != null) {
                    i10.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i10.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i10.f55323s = new p4.f1(v0Var, i7, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i10.f55309c.a(true, true);
                                    i10.h.f55483j.o(l0Var);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            i10.h.f55483j.o(l0Var);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i10.f55323s = new p4.f1(v0Var, i7, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i10.f55309c.a(true, true);
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i7.f55323s;
                        e2.v0 v0Var = f1Var.f55362a;
                        int i10 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        if (!l1Var.p()) {
                            q1Var = q1Var2;
                            if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                z10 = false;
                                a8.ma.p(z10);
                                i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                i7.f55309c.a(true, true);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.f55309c.a(true, true);
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
        switch (this.f23186a) {
            case 0:
                return;
            default:
                p4.d0 i7 = i();
                if (i7 != null) {
                    i7.u();
                    if (((p4.h1) ((WeakReference) this.f23188c).get()) != null) {
                        p4.f1 f1Var = i7.f55323s;
                        int i10 = f1Var.f55363b;
                        p4.m1 m1Var = f1Var.f55364c;
                        e2.b1 b1Var = f1Var.d;
                        e2.b1 b1Var2 = f1Var.f55365e;
                        int i11 = f1Var.f55366f;
                        e2.w0 w0Var = f1Var.f55367g;
                        int i12 = f1Var.h;
                        boolean z11 = f1Var.f55368i;
                        e2.l1 l1Var = f1Var.f55369j;
                        int i13 = f1Var.f55370k;
                        e2.x1 x1Var = f1Var.f55371l;
                        e2.o0 o0Var = f1Var.f55372m;
                        float f10 = f1Var.f55373n;
                        float f11 = f1Var.f55374o;
                        int i14 = f1Var.f55375p;
                        e2.e eVar = f1Var.f55376q;
                        g2.c cVar = f1Var.f55377r;
                        e2.o oVar = f1Var.f55378s;
                        int i15 = f1Var.f55379t;
                        boolean z12 = f1Var.f55380u;
                        boolean z13 = f1Var.v;
                        int i16 = f1Var.f55381w;
                        boolean z14 = f1Var.f55382x;
                        boolean z15 = f1Var.f55383y;
                        int i17 = f1Var.f55384z;
                        int i18 = f1Var.A;
                        e2.o0 o0Var2 = f1Var.B;
                        long j3 = f1Var.C;
                        long j10 = f1Var.D;
                        long j11 = f1Var.E;
                        e2.s1 s1Var = f1Var.F;
                        e2.q1 q1Var2 = f1Var.G;
                        try {
                            if (!l1Var.p()) {
                                q1Var = q1Var2;
                                if (m1Var.f55471a.f10328b >= l1Var.o()) {
                                    z10 = false;
                                    a8.ma.p(z10);
                                    i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    i7.f55309c.a(true, true);
                                    p4.n0 n0Var = (p4.n0) i7.h.f55483j.f26328e;
                                    n0Var.p0(n0Var.h.f55324t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.n0 n0Var2 = (p4.n0) i7.h.f55483j.f26328e;
                            n0Var2.p0(n0Var2.h.f55324t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ma.p(z10);
                        i7.f55323s = new p4.f1(v0Var, i10, m1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i18, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        i7.f55309c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public bf(cf cfVar, l2.q qVar) {
        this.f23188c = cfVar;
        this.f23187b = qVar;
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

    private final void l(e2.e eVar) {
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
