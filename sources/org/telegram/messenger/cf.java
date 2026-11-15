package org.telegram.messenger;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;
public final class cf implements e2.a1 {
    public final int f22865a = 0;
    public final Object f22866b;
    public final Object f22867c;

    public cf(p4.d0 d0Var, p4.g1 g1Var) {
        this.f22866b = new WeakReference(d0Var);
        this.f22867c = new WeakReference(g1Var);
    }

    @Override
    public final void B(List list) {
        int i7 = this.f22865a;
    }

    @Override
    public final void D(int i7, boolean z10) {
        int i10 = this.f22865a;
    }

    @Override
    public final void E(e2.q1 q1Var) {
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        k10.f54634s = k10.f54634s.d(q1Var);
                        k10.f54620c.a(true, true);
                        k10.d(new org.telegram.utils.twidget.e(q1Var, 22));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void F(e2.z0 z0Var) {
        int i7 = this.f22865a;
    }

    @Override
    public final void H(e2.w0 w0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i7 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
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
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ja.p(z10);
                                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) k10.h.f54783j.f26087e;
                                    m0Var.p0(m0Var.h.f54635t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) k10.h.f54783j.f26087e;
                            m0Var2.p0(m0Var2.h.f54635t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        k10.d(new gh.c(i7, i10, 3));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void L(e2.l1 l1Var, int i7) {
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    p4.g1 g1Var = (p4.g1) ((WeakReference) this.f22867c).get();
                    if (g1Var != null) {
                        k10.f54634s = k10.f54634s.c(l1Var, g1Var.R0(), i7);
                        k10.f54620c.a(false, true);
                        try {
                            k10.h.f54783j.t(l1Var);
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
        int i7 = this.f22865a;
    }

    @Override
    public final void O(e2.y0 y0Var) {
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        k10.f(y0Var);
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
        switch (this.f22865a) {
            case 0:
                l2.p pVar = (l2.p) this.f22866b;
                df dfVar = (df) this.f22867c;
                a aVar = dfVar.f23085e;
                if (z10) {
                    dfVar.f23084c = ((l2.f0) pVar).l();
                } else {
                    long l10 = ((l2.f0) pVar).l();
                    long j3 = dfVar.f23084c;
                    if (j3 != -9223372036854775807L && l10 > j3) {
                        df.a(dfVar, j3, l10);
                    }
                    dfVar.f23084c = -9223372036854775807L;
                }
                g0.r(aVar);
                if (!z10) {
                    g0.i3(aVar, 60000L);
                    return;
                }
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i7 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        boolean z12 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z13 = e1Var.f54680u;
                        boolean z14 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j10 = e1Var.C;
                        long j11 = e1Var.D;
                        long j12 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        if (!l1Var2.p() && l1Var.f54772a.f10020b >= l1Var2.o()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        a8.ja.p(z11);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z12, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z13, z14, i15, i16, i17, z10, z15, o0Var2, j10, j11, j12, s1Var, q1Var);
                        k10.f54620c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) k10.h.f54783j.f26087e;
                            m0Var.p0(m0Var.h.f54635t);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                        k10.t();
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i10 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i11 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i12 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i13 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
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
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ja.p(z10);
                                    k10.f54634s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i7, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    k10.h.f54783j.getClass();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            k10.h.f54783j.getClass();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i7, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    p4.e1 e1Var = k10.f54634s;
                    e2.v0 v0Var = e1Var.f54662a;
                    int i7 = e1Var.f54663b;
                    p4.l1 l1Var = e1Var.f54664c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.f54665e;
                    int i10 = e1Var.f54666f;
                    e2.w0 w0Var = e1Var.f54667g;
                    int i11 = e1Var.h;
                    boolean z11 = e1Var.f54668i;
                    e2.l1 l1Var2 = e1Var.f54669j;
                    int i12 = e1Var.f54670k;
                    e2.o0 o0Var = e1Var.f54672m;
                    float f10 = e1Var.f54673n;
                    float f11 = e1Var.f54674o;
                    int i13 = e1Var.f54675p;
                    e2.e eVar = e1Var.f54676q;
                    g2.c cVar = e1Var.f54677r;
                    e2.o oVar = e1Var.f54678s;
                    int i14 = e1Var.f54679t;
                    boolean z12 = e1Var.f54680u;
                    boolean z13 = e1Var.v;
                    int i15 = e1Var.f54681w;
                    boolean z14 = e1Var.f54682x;
                    boolean z15 = e1Var.f54683y;
                    int i16 = e1Var.f54684z;
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
                            if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                z10 = false;
                                a8.ja.p(z10);
                                k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                k10.f54620c.a(true, true);
                                k10.h.f54783j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        k10.h.f54783j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.ja.p(z10);
                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    k10.f54620c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void c(boolean z10) {
        int i7 = this.f22865a;
    }

    @Override
    public final void d(int i7) {
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        k10.f54634s = e1Var.b(e1Var.f54681w, i7, e1Var.v);
                        k10.f54620c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) k10.h.f54783j.f26087e;
                            m0Var.p0(m0Var.h.f54635t);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i10 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i11 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
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
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ja.p(z10);
                                    k10.f54634s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i7, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    k10.h.f54783j.r(i7);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            k10.h.f54783j.r(i7);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i11, w0Var, i7, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
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
        int i7 = this.f22865a;
    }

    @Override
    public final void g(int i7) {
        int i10 = this.f22865a;
    }

    @Override
    public final void h(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cf.h(boolean):void");
    }

    @Override
    public final void i(int i7, boolean z10) {
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        k10.f54634s = e1Var.b(i7, e1Var.f54684z, z10);
                        k10.f54620c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) k10.h.f54783j.f26087e;
                            m0Var.p0(m0Var.h.f54635t);
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
    public final void j(float f10) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    p4.e1 e1Var = k10.f54634s;
                    e2.v0 v0Var = e1Var.f54662a;
                    int i7 = e1Var.f54663b;
                    p4.l1 l1Var = e1Var.f54664c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.f54665e;
                    int i10 = e1Var.f54666f;
                    e2.w0 w0Var = e1Var.f54667g;
                    int i11 = e1Var.h;
                    boolean z11 = e1Var.f54668i;
                    e2.l1 l1Var2 = e1Var.f54669j;
                    int i12 = e1Var.f54670k;
                    e2.x1 x1Var = e1Var.f54671l;
                    e2.o0 o0Var = e1Var.f54672m;
                    float f11 = e1Var.f54673n;
                    int i13 = e1Var.f54675p;
                    e2.e eVar = e1Var.f54676q;
                    g2.c cVar = e1Var.f54677r;
                    e2.o oVar = e1Var.f54678s;
                    int i14 = e1Var.f54679t;
                    boolean z12 = e1Var.f54680u;
                    boolean z13 = e1Var.v;
                    int i15 = e1Var.f54681w;
                    boolean z14 = e1Var.f54682x;
                    boolean z15 = e1Var.f54683y;
                    int i16 = e1Var.f54684z;
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
                            if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                z10 = false;
                                a8.ja.p(z10);
                                k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                k10.f54620c.a(true, true);
                                k10.h.f54783j.getClass();
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        k10.h.f54783j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.ja.p(z10);
                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    k10.f54620c.a(true, true);
                } else {
                    return;
                }
        }
    }

    public p4.d0 k() {
        return (p4.d0) ((WeakReference) this.f22866b).get();
    }

    @Override
    public final void l(int i7) {
        boolean z10;
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    p4.g1 g1Var = (p4.g1) ((WeakReference) this.f22867c).get();
                    if (g1Var != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 W = g1Var.W();
                        int i10 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i11 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i12 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i13 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i14 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i15 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i16 = e1Var.f54681w;
                        boolean z14 = e1Var.f54683y;
                        int i17 = e1Var.f54684z;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        boolean z15 = false;
                        if (i7 == 3 && z13 && i17 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (l1Var2.p() || l1Var.f54772a.f10020b < l1Var2.o()) {
                            z15 = true;
                        }
                        a8.ja.p(z15);
                        k10.f54634s = new p4.e1(W, i10, l1Var, b1Var, b1Var2, i11, w0Var, i12, z11, x1Var, l1Var2, i13, o0Var, f10, f11, eVar, i14, cVar, oVar, i15, z12, z13, i16, i17, i7, z10, z14, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
                        try {
                            qe qeVar = k10.h.f54783j;
                            g1Var.W();
                            p4.m0 m0Var = (p4.m0) qeVar.f26087e;
                            m0Var.p0(m0Var.h.f54635t);
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
    public final void m(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    p4.e1 e1Var = k10.f54634s;
                    e2.v0 v0Var = e1Var.f54662a;
                    int i7 = e1Var.f54663b;
                    p4.l1 l1Var = e1Var.f54664c;
                    e2.b1 b1Var = e1Var.d;
                    e2.b1 b1Var2 = e1Var.f54665e;
                    int i10 = e1Var.f54666f;
                    e2.w0 w0Var = e1Var.f54667g;
                    int i11 = e1Var.h;
                    boolean z11 = e1Var.f54668i;
                    e2.l1 l1Var2 = e1Var.f54669j;
                    int i12 = e1Var.f54670k;
                    e2.x1 x1Var = e1Var.f54671l;
                    float f10 = e1Var.f54673n;
                    float f11 = e1Var.f54674o;
                    int i13 = e1Var.f54675p;
                    e2.e eVar = e1Var.f54676q;
                    g2.c cVar = e1Var.f54677r;
                    e2.o oVar = e1Var.f54678s;
                    int i14 = e1Var.f54679t;
                    boolean z12 = e1Var.f54680u;
                    boolean z13 = e1Var.v;
                    int i15 = e1Var.f54681w;
                    boolean z14 = e1Var.f54682x;
                    boolean z15 = e1Var.f54683y;
                    int i16 = e1Var.f54684z;
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
                            if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                z10 = false;
                                a8.ja.p(z10);
                                k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                k10.f54620c.a(true, true);
                                k10.h.f54783j.q(o0Var);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        k10.h.f54783j.q(o0Var);
                        return;
                    } catch (RemoteException e10) {
                        h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    a8.ja.p(z10);
                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                    k10.f54620c.a(true, true);
                } else {
                    return;
                }
        }
    }

    @Override
    public final void n(e2.e eVar) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i7 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
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
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ja.p(z10);
                                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) k10.h.f54783j.f26087e;
                                    m0Var.h.f54635t.K().getClass();
                                    ((q4.l) m0Var.f54787n.f55252b).f55234a.setPlaybackToLocal(eVar.b());
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) k10.h.f54783j.f26087e;
                            m0Var2.h.f54635t.K().getClass();
                            ((q4.l) m0Var2.f54787n.f55252b).f55234a.setPlaybackToLocal(eVar.b());
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public final void o(e2.o0 o0Var) {
        e2.q1 q1Var;
        boolean z10;
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i7 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var2 = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
                        int i17 = e1Var.A;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        try {
                            if (!l1Var2.p()) {
                                q1Var = q1Var2;
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ja.p(z10);
                                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var2, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    k10.h.f54783j.v();
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            k10.h.f54783j.v();
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var2, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    ab.c0 c0Var = k10.f54623g.f54601b;
                    h9.i0 o4 = c0Var.o();
                    for (int i7 = 0; i7 < o4.size(); i7++) {
                        p4.v vVar = (p4.v) o4.get(i7);
                        c0Var.s(vVar);
                        k10.c(vVar, new org.telegram.utils.twidget.e(21));
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(e2.v0 v0Var) {
        int i7 = this.f22865a;
    }

    @Override
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
        boolean z10;
        switch (this.f22865a) {
            case 0:
                df dfVar = (df) this.f22867c;
                if (i7 == 1) {
                    long j3 = dfVar.f23084c;
                    long j10 = -9223372036854775807L;
                    if (j3 != -9223372036854775807L) {
                        df.a(dfVar, j3, b1Var.f10023f);
                    }
                    if (((com.google.android.gms.common.api.q) ((l2.p) this.f22866b)).h()) {
                        j10 = b1Var2.f10023f;
                    }
                    dfVar.f23084c = j10;
                    g0.r(dfVar.f23085e);
                    return;
                }
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i10 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j11 = e1Var.C;
                        long j12 = e1Var.D;
                        long j13 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var = e1Var.G;
                        if (!l1Var2.p() && l1Var.f54772a.f10020b >= l1Var2.o()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i10, l1Var, b1Var, b1Var2, i7, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j11, j12, j13, s1Var, q1Var);
                        k10.f54620c.a(true, true);
                        try {
                            p4.m0 m0Var = (p4.m0) k10.h.f54783j.f26087e;
                            m0Var.p0(m0Var.h.f54635t);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i7 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
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
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z11 = false;
                                    a8.ja.p(z11);
                                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    k10.h.f54783j.s(z10);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            k10.h.f54783j.s(z10);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z11 = true;
                        a8.ja.p(z11);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z10, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        k10.f54634s = k10.f54634s.a(s1Var);
                        k10.f54620c.a(true, false);
                        k10.d(new org.telegram.utils.twidget.e(s1Var, 20));
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
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
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ja.p(z10);
                                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    k10.h.f54783j.o(l0Var);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            k10.h.f54783j.o(l0Var);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        e2.v0 v0Var = e1Var.f54662a;
                        int i7 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
                        int i17 = e1Var.A;
                        e2.o0 o0Var2 = e1Var.B;
                        long j3 = e1Var.C;
                        long j10 = e1Var.D;
                        long j11 = e1Var.E;
                        e2.s1 s1Var = e1Var.F;
                        e2.q1 q1Var2 = e1Var.G;
                        if (!l1Var2.p()) {
                            q1Var = q1Var2;
                            if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                z10 = false;
                                a8.ja.p(z10);
                                k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                k10.f54620c.a(true, true);
                                return;
                            }
                        } else {
                            q1Var = q1Var2;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
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
        switch (this.f22865a) {
            case 0:
                return;
            default:
                p4.d0 k10 = k();
                if (k10 != null) {
                    k10.u();
                    if (((p4.g1) ((WeakReference) this.f22867c).get()) != null) {
                        p4.e1 e1Var = k10.f54634s;
                        int i7 = e1Var.f54663b;
                        p4.l1 l1Var = e1Var.f54664c;
                        e2.b1 b1Var = e1Var.d;
                        e2.b1 b1Var2 = e1Var.f54665e;
                        int i10 = e1Var.f54666f;
                        e2.w0 w0Var = e1Var.f54667g;
                        int i11 = e1Var.h;
                        boolean z11 = e1Var.f54668i;
                        e2.l1 l1Var2 = e1Var.f54669j;
                        int i12 = e1Var.f54670k;
                        e2.x1 x1Var = e1Var.f54671l;
                        e2.o0 o0Var = e1Var.f54672m;
                        float f10 = e1Var.f54673n;
                        float f11 = e1Var.f54674o;
                        int i13 = e1Var.f54675p;
                        e2.e eVar = e1Var.f54676q;
                        g2.c cVar = e1Var.f54677r;
                        e2.o oVar = e1Var.f54678s;
                        int i14 = e1Var.f54679t;
                        boolean z12 = e1Var.f54680u;
                        boolean z13 = e1Var.v;
                        int i15 = e1Var.f54681w;
                        boolean z14 = e1Var.f54682x;
                        boolean z15 = e1Var.f54683y;
                        int i16 = e1Var.f54684z;
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
                                if (l1Var.f54772a.f10020b >= l1Var2.o()) {
                                    z10 = false;
                                    a8.ja.p(z10);
                                    k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                                    k10.f54620c.a(true, true);
                                    p4.m0 m0Var = (p4.m0) k10.h.f54783j.f26087e;
                                    m0Var.p0(m0Var.h.f54635t);
                                    return;
                                }
                            } else {
                                q1Var = q1Var2;
                            }
                            p4.m0 m0Var2 = (p4.m0) k10.h.f54783j.f26087e;
                            m0Var2.p0(m0Var2.h.f54635t);
                            return;
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        a8.ja.p(z10);
                        k10.f54634s = new p4.e1(v0Var, i7, l1Var, b1Var, b1Var2, i10, w0Var, i11, z11, x1Var, l1Var2, i12, o0Var, f10, f11, eVar, i13, cVar, oVar, i14, z12, z13, i15, i16, i17, z14, z15, o0Var2, j3, j10, j11, s1Var, q1Var);
                        k10.f54620c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public cf(df dfVar, l2.p pVar) {
        this.f22867c = dfVar;
        this.f22866b = pVar;
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

    private final void l0(boolean z10) {
    }

    private final void o0(e2.q1 q1Var) {
    }

    private final void p(e2.e eVar) {
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
