package o4;

import android.os.RemoteException;
import b8.zb;
import d2.a2;
import d2.v1;
import java.lang.ref.WeakReference;
import java.util.List;
import org.telegram.messenger.we;
public final class c0 implements d2.c1 {
    public final int f20599a = 0;
    public final Object f20600b;
    public final Object f20601c;

    public c0(e0 e0Var, l1 l1Var) {
        this.f20600b = new WeakReference(e0Var);
        this.f20601c = new WeakReference(l1Var);
    }

    @Override
    public final void B(d2.s1 s1Var) {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        b10.f20635s = b10.f20635s.d(s1Var);
                        b10.f20621c.a(true, true);
                        b10.d(new n9.j(s1Var, 4));
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
    public final void C(d2.q0 q0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    j1 j1Var = b10.f20635s;
                    d2.x0 x0Var = j1Var.f20719a;
                    int i3 = j1Var.f20720b;
                    q1 q1Var = j1Var.f20721c;
                    d2.d1 d1Var = j1Var.d;
                    d2.d1 d1Var2 = j1Var.f20722e;
                    int i10 = j1Var.f20723f;
                    d2.y0 y0Var = j1Var.f20724g;
                    int i11 = j1Var.h;
                    boolean z11 = j1Var.f20725i;
                    d2.n1 n1Var = j1Var.f20726j;
                    int i12 = j1Var.f20727k;
                    a2 a2Var = j1Var.f20728l;
                    float f10 = j1Var.f20730n;
                    float f11 = j1Var.f20731o;
                    int i13 = j1Var.f20732p;
                    d2.f fVar = j1Var.f20733q;
                    f2.c cVar = j1Var.f20734r;
                    d2.p pVar = j1Var.f20735s;
                    int i14 = j1Var.f20736t;
                    boolean z12 = j1Var.f20737u;
                    boolean z13 = j1Var.v;
                    int i15 = j1Var.f20738w;
                    boolean z14 = j1Var.f20739x;
                    boolean z15 = j1Var.f20740y;
                    int i16 = j1Var.f20741z;
                    int i17 = j1Var.A;
                    d2.q0 q0Var2 = j1Var.B;
                    long j10 = j1Var.C;
                    long j11 = j1Var.D;
                    long j12 = j1Var.E;
                    v1 v1Var = j1Var.F;
                    d2.s1 s1Var2 = j1Var.G;
                    try {
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.f20621c.a(true, true);
                                b10.h.f20775j.p(q0Var);
                                return;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        b10.h.f20775j.p(q0Var);
                        return;
                    } catch (RemoteException e10) {
                        g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    zb.p(z10);
                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                    b10.f20621c.a(true, true);
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void E(d2.n1 n1Var, int i3) {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = (l1) ((WeakReference) this.f20601c).get();
                    if (l1Var != null) {
                        b10.f20635s = b10.f20635s.c(n1Var, l1Var.R0(), i3);
                        b10.f20621c.a(false, true);
                        try {
                            b10.h.f20775j.s(n1Var);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
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
    public final void F(List list) {
        int i3 = this.f20599a;
    }

    @Override
    public final void G(int i3, boolean z10) {
        int i10 = this.f20599a;
    }

    @Override
    public final void H(d2.y0 y0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i3 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i10 = j1Var.f20723f;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    o0 o0Var = (o0) b10.h.f20775j.f20756e;
                                    o0Var.p0(o0Var.h.f20636t);
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.f20775j.f20756e;
                            o0Var2.p0(o0Var2.h.f20636t);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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
    public final void J(int i3, int i10) {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        b10.d(new hh.c(i3, i10, 3));
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
    public final void L(d2.q0 q0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i3 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i10 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var2 = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var2, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    b10.h.f20775j.u();
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.f20775j.u();
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var2, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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
    public final void N(d2.a1 a1Var) {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        b10.f(a1Var);
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
    public final void O(d2.b1 b1Var) {
        int i3 = this.f20599a;
    }

    @Override
    public final void P(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: o4.c0.P(boolean):void");
    }

    @Override
    public final void a(int i3) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i10 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i11 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i12 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i13 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i12, z11, a2Var, n1Var, i13, q0Var, f10, f11, fVar, i3, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    b10.h.f20775j.getClass();
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.f20775j.getClass();
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i12, z11, a2Var, n1Var, i13, q0Var, f10, f11, fVar, i3, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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

    public e0 b() {
        return (e0) ((WeakReference) this.f20600b).get();
    }

    @Override
    public final void c(int i3) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i10 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i11 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i3, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    b10.h.f20775j.q(i3);
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.f20775j.q(i3);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i11, y0Var, i3, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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
    public final void e(boolean z10) {
        int i3 = this.f20599a;
    }

    @Override
    public final void f(a2 a2Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    j1 j1Var = b10.f20635s;
                    d2.x0 x0Var = j1Var.f20719a;
                    int i3 = j1Var.f20720b;
                    q1 q1Var = j1Var.f20721c;
                    d2.d1 d1Var = j1Var.d;
                    d2.d1 d1Var2 = j1Var.f20722e;
                    int i10 = j1Var.f20723f;
                    d2.y0 y0Var = j1Var.f20724g;
                    int i11 = j1Var.h;
                    boolean z11 = j1Var.f20725i;
                    d2.n1 n1Var = j1Var.f20726j;
                    int i12 = j1Var.f20727k;
                    d2.q0 q0Var = j1Var.f20729m;
                    float f10 = j1Var.f20730n;
                    float f11 = j1Var.f20731o;
                    int i13 = j1Var.f20732p;
                    d2.f fVar = j1Var.f20733q;
                    f2.c cVar = j1Var.f20734r;
                    d2.p pVar = j1Var.f20735s;
                    int i14 = j1Var.f20736t;
                    boolean z12 = j1Var.f20737u;
                    boolean z13 = j1Var.v;
                    int i15 = j1Var.f20738w;
                    boolean z14 = j1Var.f20739x;
                    boolean z15 = j1Var.f20740y;
                    int i16 = j1Var.f20741z;
                    int i17 = j1Var.A;
                    d2.q0 q0Var2 = j1Var.B;
                    long j10 = j1Var.C;
                    long j11 = j1Var.D;
                    long j12 = j1Var.E;
                    v1 v1Var = j1Var.F;
                    d2.s1 s1Var2 = j1Var.G;
                    try {
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.f20621c.a(true, true);
                                b10.h.f20775j.getClass();
                                return;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        b10.h.f20775j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    zb.p(z10);
                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                    b10.f20621c.a(true, true);
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void g(int i3) {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        b10.f20635s = j1Var.b(j1Var.f20738w, i3, j1Var.v);
                        b10.f20621c.a(true, true);
                        try {
                            o0 o0Var = (o0) b10.h.f20775j.f20756e;
                            o0Var.p0(o0Var.h.f20636t);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
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
    public final void h(boolean z10) {
        int i3 = this.f20599a;
    }

    @Override
    public final void i(int i3) {
        int i10 = this.f20599a;
    }

    @Override
    public final void k(f2.c cVar) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i3 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i10 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.f20621c.a(true, true);
                                return;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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
    public final void l(d2.x0 x0Var) {
        int i3 = this.f20599a;
    }

    @Override
    public final void m(d2.s0 s0Var) {
        int i3 = this.f20599a;
    }

    @Override
    public final void n(int i3, d2.n0 n0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i10 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    b10.h.f20775j.n(n0Var);
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.f20775j.n(n0Var);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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
    public final void o(d2.x0 x0Var) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        int i3 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i10 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    o0 o0Var = (o0) b10.h.f20775j.f20756e;
                                    o0Var.p0(o0Var.h.f20636t);
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.f20775j.f20756e;
                            o0Var2.p0(o0Var2.h.f20636t);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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
    public final void onRenderedFirstFrame() {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    ui.f fVar = b10.f20624g.f20661b;
                    g9.i0 n4 = fVar.n();
                    for (int i3 = 0; i3 < n4.size(); i3++) {
                        v vVar = (v) n4.get(i3);
                        fVar.p(vVar);
                        b10.c(vVar, new n9.j(3));
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void p(boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: o4.c0.p(boolean):void");
    }

    @Override
    public final void q(d2.d1 d1Var, d2.d1 d1Var2, int i3) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i10 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i3, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    o0 o0Var = (o0) b10.h.f20775j.f20756e;
                                    o0Var.p0(o0Var.h.f20636t);
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.f20775j.f20756e;
                            o0Var2.p0(o0Var2.h.f20636t);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i10, q1Var, d1Var, d1Var2, i3, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                we weVar = (we) this.f20601c;
                if (i3 == 1) {
                    long j13 = weVar.f26193c;
                    long j14 = -9223372036854775807L;
                    if (j13 != -9223372036854775807L) {
                        we.a(weVar, j13, d1Var.f8070f);
                    }
                    if (((ci.u0) ((k2.p) this.f20600b)).i0()) {
                        j14 = d1Var2.f8070f;
                    }
                    weVar.f26193c = j14;
                    org.telegram.messenger.g0.r(weVar.f26194e);
                    return;
                }
                return;
        }
    }

    @Override
    public final void r(int i3, boolean z10) {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        b10.f20635s = j1Var.b(i3, j1Var.f20741z, z10);
                        b10.f20621c.a(true, true);
                        try {
                            o0 o0Var = (o0) b10.h.f20775j.f20756e;
                            o0Var.p0(o0Var.h.f20636t);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
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
    public final void s(float f10) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    j1 j1Var = b10.f20635s;
                    d2.x0 x0Var = j1Var.f20719a;
                    int i3 = j1Var.f20720b;
                    q1 q1Var = j1Var.f20721c;
                    d2.d1 d1Var = j1Var.d;
                    d2.d1 d1Var2 = j1Var.f20722e;
                    int i10 = j1Var.f20723f;
                    d2.y0 y0Var = j1Var.f20724g;
                    int i11 = j1Var.h;
                    boolean z11 = j1Var.f20725i;
                    d2.n1 n1Var = j1Var.f20726j;
                    int i12 = j1Var.f20727k;
                    a2 a2Var = j1Var.f20728l;
                    d2.q0 q0Var = j1Var.f20729m;
                    float f11 = j1Var.f20730n;
                    int i13 = j1Var.f20732p;
                    d2.f fVar = j1Var.f20733q;
                    f2.c cVar = j1Var.f20734r;
                    d2.p pVar = j1Var.f20735s;
                    int i14 = j1Var.f20736t;
                    boolean z12 = j1Var.f20737u;
                    boolean z13 = j1Var.v;
                    int i15 = j1Var.f20738w;
                    boolean z14 = j1Var.f20739x;
                    boolean z15 = j1Var.f20740y;
                    int i16 = j1Var.f20741z;
                    int i17 = j1Var.A;
                    d2.q0 q0Var2 = j1Var.B;
                    long j10 = j1Var.C;
                    long j11 = j1Var.D;
                    long j12 = j1Var.E;
                    v1 v1Var = j1Var.F;
                    d2.s1 s1Var2 = j1Var.G;
                    if (f10 != 0.0f) {
                        f11 = f10;
                    }
                    try {
                        if (!n1Var.p()) {
                            s1Var = s1Var2;
                            if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                z10 = false;
                                zb.p(z10);
                                b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                b10.f20621c.a(true, true);
                                b10.h.f20775j.getClass();
                                return;
                            }
                        } else {
                            s1Var = s1Var2;
                        }
                        b10.h.f20775j.getClass();
                        return;
                    } catch (RemoteException e10) {
                        g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        return;
                    }
                    z10 = true;
                    zb.p(z10);
                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                    b10.f20621c.a(true, true);
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final void u(d2.f fVar) {
        d2.s1 s1Var;
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i3 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i10 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i11 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z10 = false;
                                    zb.p(z10);
                                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    o0 o0Var = (o0) b10.h.f20775j.f20756e;
                                    o0Var.h.f20636t.I().getClass();
                                    ((p4.l) o0Var.f20779n.f53181a).f53164a.setPlaybackToLocal(fVar.b());
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            o0 o0Var2 = (o0) b10.h.f20775j.f20756e;
                            o0Var2.h.f20636t.I().getClass();
                            ((p4.l) o0Var2.f20779n.f53181a).f53164a.setPlaybackToLocal(fVar.b());
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z10 = true;
                        zb.p(z10);
                        b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z11, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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
    public final void v(v1 v1Var) {
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        b10.f20635s = b10.f20635s.a(v1Var);
                        b10.f20621c.a(true, false);
                        b10.d(new n9.j(v1Var, 2));
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
    public final void w(int i3) {
        boolean z10;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    l1 l1Var = (l1) ((WeakReference) this.f20601c).get();
                    if (l1Var != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 U = l1Var.U();
                        int i10 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i11 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i12 = j1Var.h;
                        boolean z11 = j1Var.f20725i;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i13 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i14 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i15 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i16 = j1Var.f20738w;
                        boolean z14 = j1Var.f20740y;
                        int i17 = j1Var.f20741z;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var = j1Var.G;
                        boolean z15 = false;
                        if (i3 == 3 && z13 && i17 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (n1Var.p() || q1Var.f20817a.f8067b < n1Var.o()) {
                            z15 = true;
                        }
                        zb.p(z15);
                        b10.f20635s = new j1(U, i10, q1Var, d1Var, d1Var2, i11, y0Var, i12, z11, a2Var, n1Var, i13, q0Var, f10, f11, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i3, z10, z14, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
                        try {
                            m0 m0Var = b10.h.f20775j;
                            l1Var.U();
                            o0 o0Var = (o0) m0Var.f20756e;
                            o0Var.p0(o0Var.h.f20636t);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
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
    public final void y(boolean z10) {
        d2.s1 s1Var;
        boolean z11;
        switch (this.f20599a) {
            case 0:
                e0 b10 = b();
                if (b10 != null) {
                    b10.v();
                    if (((l1) ((WeakReference) this.f20601c).get()) != null) {
                        j1 j1Var = b10.f20635s;
                        d2.x0 x0Var = j1Var.f20719a;
                        int i3 = j1Var.f20720b;
                        q1 q1Var = j1Var.f20721c;
                        d2.d1 d1Var = j1Var.d;
                        d2.d1 d1Var2 = j1Var.f20722e;
                        int i10 = j1Var.f20723f;
                        d2.y0 y0Var = j1Var.f20724g;
                        int i11 = j1Var.h;
                        d2.n1 n1Var = j1Var.f20726j;
                        int i12 = j1Var.f20727k;
                        a2 a2Var = j1Var.f20728l;
                        d2.q0 q0Var = j1Var.f20729m;
                        float f10 = j1Var.f20730n;
                        float f11 = j1Var.f20731o;
                        int i13 = j1Var.f20732p;
                        d2.f fVar = j1Var.f20733q;
                        f2.c cVar = j1Var.f20734r;
                        d2.p pVar = j1Var.f20735s;
                        int i14 = j1Var.f20736t;
                        boolean z12 = j1Var.f20737u;
                        boolean z13 = j1Var.v;
                        int i15 = j1Var.f20738w;
                        boolean z14 = j1Var.f20739x;
                        boolean z15 = j1Var.f20740y;
                        int i16 = j1Var.f20741z;
                        int i17 = j1Var.A;
                        d2.q0 q0Var2 = j1Var.B;
                        long j10 = j1Var.C;
                        long j11 = j1Var.D;
                        long j12 = j1Var.E;
                        v1 v1Var = j1Var.F;
                        d2.s1 s1Var2 = j1Var.G;
                        try {
                            if (!n1Var.p()) {
                                s1Var = s1Var2;
                                if (q1Var.f20817a.f8067b >= n1Var.o()) {
                                    z11 = false;
                                    zb.p(z11);
                                    b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z10, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                                    b10.f20621c.a(true, true);
                                    b10.h.f20775j.r(z10);
                                    return;
                                }
                            } else {
                                s1Var = s1Var2;
                            }
                            b10.h.f20775j.r(z10);
                            return;
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                            return;
                        }
                        z11 = true;
                        zb.p(z11);
                        b10.f20635s = new j1(x0Var, i3, q1Var, d1Var, d1Var2, i10, y0Var, i11, z10, a2Var, n1Var, i12, q0Var, f10, f11, fVar, i13, cVar, pVar, i14, z12, z13, i15, i16, i17, z14, z15, q0Var2, j10, j11, j12, v1Var, s1Var);
                        b10.f20621c.a(true, true);
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

    public c0(we weVar, k2.p pVar) {
        this.f20601c = weVar;
        this.f20600b = pVar;
    }

    private final void h0() {
    }

    private final void A(List list) {
    }

    private final void D(d2.b1 b1Var) {
    }

    private final void I(d2.b1 b1Var) {
    }

    private final void K(boolean z10) {
    }

    private final void M(boolean z10) {
    }

    private final void Q(boolean z10) {
    }

    private final void S(d2.q0 q0Var) {
    }

    private final void T(d2.s0 s0Var) {
    }

    private final void U(d2.s0 s0Var) {
    }

    private final void W(d2.y0 y0Var) {
    }

    private final void X(int i3) {
    }

    private final void Y(int i3) {
    }

    private final void Z(d2.x0 x0Var) {
    }

    private final void a0(d2.x0 x0Var) {
    }

    private final void b0(d2.x0 x0Var) {
    }

    private final void d(d2.f fVar) {
    }

    private final void e0(d2.q0 q0Var) {
    }

    private final void f0(int i3) {
    }

    private final void g0(int i3) {
    }

    private final void i0(int i3) {
    }

    private final void j(int i3) {
    }

    private final void j0(boolean z10) {
    }

    private final void k0(boolean z10) {
    }

    private final void l0(boolean z10) {
    }

    private final void o0(d2.s1 s1Var) {
    }

    private final void p0(v1 v1Var) {
    }

    private final void q0(a2 a2Var) {
    }

    private final void r0(float f10) {
    }

    private final void t(d2.a1 a1Var) {
    }

    private final void x(List list) {
    }

    private final void z(f2.c cVar) {
    }

    private final void R(int i3, d2.n0 n0Var) {
    }

    private final void V(int i3, boolean z10) {
    }

    private final void c0(int i3, boolean z10) {
    }

    private final void d0(int i3, boolean z10) {
    }

    private final void m0(int i3, int i10) {
    }

    private final void n0(d2.n1 n1Var, int i3) {
    }
}
