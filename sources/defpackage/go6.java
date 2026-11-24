package defpackage;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
public final class go6 implements pe8 {
    public final byte a = 0;
    public final Object b;
    public final Object c;

    public go6(tx6 tx6Var, cf8 cf8Var) {
        this.b = new WeakReference(tx6Var);
        this.c = new WeakReference(cf8Var);
    }

    @Override
    public final void A(int i, qe8 qe8Var, qe8 qe8Var2) {
        d0c d0cVar;
        boolean z;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ho6 ho6Var = (ho6) obj;
                if (i == 1) {
                    long j = ho6Var.c;
                    long j2 = -9223372036854775807L;
                    if (j != -9223372036854775807L) {
                        ho6Var.c(j, qe8Var.f);
                    }
                    if (((h74) this.b).i()) {
                        j2 = qe8Var2.f;
                    }
                    ho6Var.c = j2;
                    gm.r(ho6Var.e);
                    return;
                }
                return;
            default:
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((cf8) ((WeakReference) obj).get()) != null) {
                        ye8 ye8Var = i2.s;
                        u64 u64Var = ye8Var.a;
                        int i3 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j3 = ye8Var.C;
                        long j4 = ye8Var.D;
                        long j5 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar2 = ye8Var.G;
                        try {
                            if (!bqbVar.p()) {
                                d0cVar = d0cVar2;
                                if (n8aVar.a.b >= bqbVar.o()) {
                                    z = false;
                                    jte.p(z);
                                    i2.s = new ye8(u64Var, i3, n8aVar, qe8Var, qe8Var2, i, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j3, j4, j5, g0cVar, d0cVar);
                                    i2.c.a(true, true);
                                    ly6 ly6Var = (ly6) i2.h.l.e;
                                    tx6 tx6Var = ly6Var.j;
                                    tx6Var.t();
                                    ly6Var.q0(tx6Var.t);
                                    return;
                                }
                            } else {
                                d0cVar = d0cVar2;
                            }
                            ly6 ly6Var2 = (ly6) i2.h.l.e;
                            tx6 tx6Var2 = ly6Var2.j;
                            tx6Var2.t();
                            ly6Var2.q0(tx6Var2.t);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        jte.p(z);
                        i2.s = new ye8(u64Var, i3, n8aVar, qe8Var, qe8Var2, i, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j3, j4, j5, g0cVar, d0cVar);
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
    public final void B(jt6 jt6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i.s;
                        u64 u64Var = ye8Var.a;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var2 = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var2, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var, j, j2, j3, g0cVar, d0cVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.C();
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void C(jt6 jt6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    ye8 ye8Var = i.s;
                    u64 u64Var = ye8Var.a;
                    int i2 = ye8Var.b;
                    n8a n8aVar = ye8Var.c;
                    qe8 qe8Var = ye8Var.d;
                    qe8 qe8Var2 = ye8Var.e;
                    int i3 = ye8Var.f;
                    ce8 ce8Var = ye8Var.g;
                    int i4 = ye8Var.h;
                    boolean z2 = ye8Var.i;
                    bqb bqbVar = ye8Var.j;
                    int i5 = ye8Var.k;
                    jec jecVar = ye8Var.l;
                    float f = ye8Var.n;
                    float f2 = ye8Var.o;
                    int i6 = ye8Var.p;
                    o00 o00Var = ye8Var.q;
                    g53 g53Var = ye8Var.r;
                    of3 of3Var = ye8Var.s;
                    int i7 = ye8Var.t;
                    boolean z3 = ye8Var.u;
                    boolean z4 = ye8Var.v;
                    int i8 = ye8Var.w;
                    boolean z5 = ye8Var.x;
                    boolean z6 = ye8Var.y;
                    int i9 = ye8Var.z;
                    int i10 = ye8Var.A;
                    jt6 jt6Var2 = ye8Var.B;
                    long j = ye8Var.C;
                    long j2 = ye8Var.D;
                    long j3 = ye8Var.E;
                    g0c g0cVar = ye8Var.F;
                    d0c d0cVar = ye8Var.G;
                    if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    jte.p(z);
                    i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.u(jt6Var);
                        return;
                    } catch (RemoteException e) {
                        ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void D(bqb bqbVar, int i) {
        d0c d0cVar;
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    cf8 cf8Var = (cf8) ((WeakReference) this.c).get();
                    if (cf8Var != null) {
                        n8a R0 = cf8Var.R0();
                        if (i == 0 && i2.s.j.p()) {
                            ye8 ye8Var = i2.s;
                            u64 u64Var = ye8Var.a;
                            int i3 = ye8Var.b;
                            n8a n8aVar = ye8Var.c;
                            int i4 = ye8Var.f;
                            ce8 ce8Var = ye8Var.g;
                            int i5 = ye8Var.h;
                            boolean z2 = ye8Var.i;
                            bqb bqbVar2 = ye8Var.j;
                            int i6 = ye8Var.k;
                            jec jecVar = ye8Var.l;
                            jt6 jt6Var = ye8Var.m;
                            float f = ye8Var.n;
                            float f2 = ye8Var.o;
                            int i7 = ye8Var.p;
                            o00 o00Var = ye8Var.q;
                            g53 g53Var = ye8Var.r;
                            of3 of3Var = ye8Var.s;
                            int i8 = ye8Var.t;
                            boolean z3 = ye8Var.u;
                            boolean z4 = ye8Var.v;
                            int i9 = ye8Var.w;
                            boolean z5 = ye8Var.x;
                            boolean z6 = ye8Var.y;
                            int i10 = ye8Var.z;
                            int i11 = ye8Var.A;
                            jt6 jt6Var2 = ye8Var.B;
                            long j = ye8Var.C;
                            long j2 = ye8Var.D;
                            long j3 = ye8Var.E;
                            g0c g0cVar = ye8Var.F;
                            d0c d0cVar2 = ye8Var.G;
                            qe8 qe8Var = ye8Var.e;
                            qe8 qe8Var2 = R0.a;
                            if (!bqbVar2.p()) {
                                d0cVar = d0cVar2;
                                if (n8aVar.a.b >= bqbVar2.o()) {
                                    z = false;
                                    jte.p(z);
                                    i2.s = new ye8(u64Var, i3, n8aVar, qe8Var, qe8Var2, i4, ce8Var, i5, z2, jecVar, bqbVar2, i6, jt6Var, f, f2, o00Var, i7, g53Var, of3Var, i8, z3, z4, i9, i10, i11, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                                }
                            } else {
                                d0cVar = d0cVar2;
                            }
                            z = true;
                            jte.p(z);
                            i2.s = new ye8(u64Var, i3, n8aVar, qe8Var, qe8Var2, i4, ce8Var, i5, z2, jecVar, bqbVar2, i6, jt6Var, f, f2, o00Var, i7, g53Var, of3Var, i8, z3, z4, i9, i10, i11, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        }
                        i2.s = i2.s.c(bqbVar, R0, i);
                        i2.c.a(false, true);
                        try {
                            i2.h.l.x(bqbVar);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void E(u64 u64Var) {
        byte b = this.a;
    }

    @Override
    public final void F(u64 u64Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i.s;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i.c.a(true, true);
                        try {
                            ly6 ly6Var = (ly6) i.h.l.e;
                            tx6 tx6Var = ly6Var.j;
                            tx6Var.t();
                            ly6Var.q0(tx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void G(y79 y79Var) {
        byte b = this.a;
    }

    @Override
    public final void H(int i, boolean z) {
        byte b = this.a;
    }

    @Override
    public final void J(ce8 ce8Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i.s;
                        u64 u64Var = ye8Var.a;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        int i4 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i.c.a(true, true);
                        try {
                            ly6 ly6Var = (ly6) i.h.l.e;
                            tx6 tx6Var = ly6Var.j;
                            tx6Var.t();
                            ly6Var.q0(tx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void K(ne8 ne8Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        i.f(ne8Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void L(nf7 nf7Var) {
        byte b = this.a;
    }

    @Override
    public final void M(int i, int i2) {
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i3 = i();
                if (i3 != null) {
                    i3.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        i3.d(new lm0(i, i2, (byte) 3));
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
                h74 h74Var = (h74) this.b;
                ho6 ho6Var = (ho6) obj;
                pg6 pg6Var = ho6Var.e;
                if (z) {
                    ho6Var.c = h74Var.k();
                } else {
                    long k = h74Var.k();
                    long j = ho6Var.c;
                    if (j != -9223372036854775807L && k > j) {
                        ho6Var.c(j, k);
                    }
                    ho6Var.c = -9223372036854775807L;
                }
                gm.r(pg6Var);
                if (!z) {
                    gm.d3(pg6Var, 60000L);
                    return;
                }
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) obj).get()) != null) {
                        ye8 ye8Var = i.s;
                        u64 u64Var = ye8Var.a;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z3 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z4 = ye8Var.u;
                        boolean z5 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j2 = ye8Var.C;
                        long j3 = ye8Var.D;
                        long j4 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        jte.p(z2);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z3, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z4, z5, i8, i9, i10, z, z6, jt6Var2, j2, j3, j4, g0cVar, d0cVar);
                        i.c.a(true, true);
                        try {
                            ly6 ly6Var = (ly6) i.h.l.e;
                            tx6 tx6Var = ly6Var.j;
                            tx6Var.t();
                            ly6Var.q0(tx6Var.t);
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
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
    public final void a(jec jecVar) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    ye8 ye8Var = i.s;
                    u64 u64Var = ye8Var.a;
                    int i2 = ye8Var.b;
                    n8a n8aVar = ye8Var.c;
                    qe8 qe8Var = ye8Var.d;
                    qe8 qe8Var2 = ye8Var.e;
                    int i3 = ye8Var.f;
                    ce8 ce8Var = ye8Var.g;
                    int i4 = ye8Var.h;
                    boolean z2 = ye8Var.i;
                    bqb bqbVar = ye8Var.j;
                    int i5 = ye8Var.k;
                    jt6 jt6Var = ye8Var.m;
                    float f = ye8Var.n;
                    float f2 = ye8Var.o;
                    int i6 = ye8Var.p;
                    o00 o00Var = ye8Var.q;
                    g53 g53Var = ye8Var.r;
                    of3 of3Var = ye8Var.s;
                    int i7 = ye8Var.t;
                    boolean z3 = ye8Var.u;
                    boolean z4 = ye8Var.v;
                    int i8 = ye8Var.w;
                    boolean z5 = ye8Var.x;
                    boolean z6 = ye8Var.y;
                    int i9 = ye8Var.z;
                    int i10 = ye8Var.A;
                    jt6 jt6Var2 = ye8Var.B;
                    long j = ye8Var.C;
                    long j2 = ye8Var.D;
                    long j3 = ye8Var.E;
                    g0c g0cVar = ye8Var.F;
                    d0c d0cVar = ye8Var.G;
                    if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    jte.p(z);
                    i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.getClass();
                        return;
                    } catch (RemoteException e) {
                        ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void b(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i2.s;
                        u64 u64Var = ye8Var.a;
                        int i3 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i4 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i5 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i6 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i2.s = new ye8(u64Var, i3, n8aVar, qe8Var, qe8Var2, i4, ce8Var, i5, z2, jecVar, bqbVar, i6, jt6Var, f, f2, o00Var, i, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.getClass();
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i) {
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i2.s;
                        i2.s = ye8Var.b(ye8Var.w, i, ye8Var.v);
                        i2.c.a(true, true);
                        try {
                            ly6 ly6Var = (ly6) i2.h.l.e;
                            tx6 tx6Var = ly6Var.j;
                            tx6Var.t();
                            ly6Var.q0(tx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void d(oe8 oe8Var) {
        byte b = this.a;
    }

    @Override
    public final void e(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void f(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void g(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i2.s;
                        u64 u64Var = ye8Var.a;
                        int i3 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i4 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i2.s = new ye8(u64Var, i3, n8aVar, qe8Var, qe8Var2, i4, ce8Var, i, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.v(i);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void h(int i) {
        byte b = this.a;
    }

    public final tx6 i() {
        return (tx6) ((WeakReference) this.b).get();
    }

    @Override
    public final void l(o00 o00Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i.s;
                        u64 u64Var = ye8Var.a;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i.c.a(true, true);
                        try {
                            ly6 ly6Var = (ly6) i.h.l.e;
                            tx6 tx6Var = ly6Var.j;
                            tx6Var.t();
                            tx6Var.t.H().getClass();
                            ((bx6) ly6Var.p.b).a.setPlaybackToLocal(o00Var.b());
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void m(d0c d0cVar) {
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        i.s = i.s.d(d0cVar);
                        i.c.a(true, true);
                        i.d(new u36(d0cVar, (byte) 26));
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
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i.s;
                        u64 u64Var = ye8Var.a;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z3 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z4 = ye8Var.u;
                        boolean z5 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z6 = ye8Var.x;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        jte.p(z2);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z3, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z4, z5, i8, i9, i10, z6, z, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.getClass();
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tx6 i = i();
                if (i != null) {
                    i.t();
                    mx6 mx6Var = i.g.b;
                    mo5 M = mx6Var.M();
                    for (int i2 = 0; i2 < M.size(); i2++) {
                        sw6 sw6Var = (sw6) M.get(i2);
                        mx6Var.C0();
                        mt2 mt2Var = (mt2) ((qt) mx6Var.c).get(sw6Var);
                        i.c(sw6Var, new u36((byte) 25));
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
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i2.s;
                        i2.s = ye8Var.b(i, ye8Var.z, z);
                        i2.c.a(true, true);
                        try {
                            ly6 ly6Var = (ly6) i2.h.l.e;
                            tx6 tx6Var = ly6Var.j;
                            tx6Var.t();
                            ly6Var.q0(tx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tx6 i = i();
                if (i != null) {
                    i.t();
                    ye8 ye8Var = i.s;
                    u64 u64Var = ye8Var.a;
                    int i2 = ye8Var.b;
                    n8a n8aVar = ye8Var.c;
                    qe8 qe8Var = ye8Var.d;
                    qe8 qe8Var2 = ye8Var.e;
                    int i3 = ye8Var.f;
                    ce8 ce8Var = ye8Var.g;
                    int i4 = ye8Var.h;
                    boolean z2 = ye8Var.i;
                    bqb bqbVar = ye8Var.j;
                    int i5 = ye8Var.k;
                    jec jecVar = ye8Var.l;
                    jt6 jt6Var = ye8Var.m;
                    float f2 = ye8Var.n;
                    int i6 = ye8Var.p;
                    o00 o00Var = ye8Var.q;
                    g53 g53Var = ye8Var.r;
                    of3 of3Var = ye8Var.s;
                    int i7 = ye8Var.t;
                    boolean z3 = ye8Var.u;
                    boolean z4 = ye8Var.v;
                    int i8 = ye8Var.w;
                    boolean z5 = ye8Var.x;
                    boolean z6 = ye8Var.y;
                    int i9 = ye8Var.z;
                    int i10 = ye8Var.A;
                    jt6 jt6Var2 = ye8Var.B;
                    long j = ye8Var.C;
                    long j2 = ye8Var.D;
                    long j3 = ye8Var.E;
                    g0c g0cVar = ye8Var.F;
                    d0c d0cVar = ye8Var.G;
                    if (f != 0.0f) {
                        f2 = f;
                    }
                    if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    jte.p(z);
                    i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                    i.c.a(true, true);
                    try {
                        i.h.l.getClass();
                        return;
                    } catch (RemoteException e) {
                        ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void r(int i, bt6 bt6Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i2.s;
                        u64 u64Var = ye8Var.a;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i2.s = new ye8(u64Var, i, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i2.c.a(true, true);
                        try {
                            i2.h.l.s(bt6Var);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tx6 i2 = i();
                if (i2 != null) {
                    i2.t();
                    cf8 cf8Var = (cf8) ((WeakReference) this.c).get();
                    if (cf8Var != null) {
                        ye8 ye8Var = i2.s;
                        u64 U = cf8Var.U();
                        int i3 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i4 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i5 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i6 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i7 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i8 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i9 = ye8Var.w;
                        boolean z5 = ye8Var.y;
                        int i10 = ye8Var.z;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        boolean z6 = false;
                        if (i == 3 && z4 && i10 == 0) {
                            z6 = true;
                        }
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i2.s = new ye8(U, i3, n8aVar, qe8Var, qe8Var2, i4, ce8Var, i5, z2, jecVar, bqbVar, i6, jt6Var, f, f2, o00Var, i7, g53Var, of3Var, i8, z3, z4, i9, i10, i, z6, z5, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i2.c.a(true, true);
                        try {
                            trc trcVar = i2.h.l;
                            cf8Var.U();
                            ly6 ly6Var = (ly6) trcVar.e;
                            tx6 tx6Var = ly6Var.j;
                            tx6Var.t();
                            ly6Var.q0(tx6Var.t);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
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
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i.s;
                        u64 u64Var = ye8Var.a;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        g53 g53Var = ye8Var.r;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        jte.p(z2);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i.c.a(true, true);
                        try {
                            i.h.l.w(z);
                            return;
                        } catch (RemoteException e) {
                            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void x(g53 g53Var) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        ye8 ye8Var = i.s;
                        u64 u64Var = ye8Var.a;
                        int i2 = ye8Var.b;
                        n8a n8aVar = ye8Var.c;
                        qe8 qe8Var = ye8Var.d;
                        qe8 qe8Var2 = ye8Var.e;
                        int i3 = ye8Var.f;
                        ce8 ce8Var = ye8Var.g;
                        int i4 = ye8Var.h;
                        boolean z2 = ye8Var.i;
                        bqb bqbVar = ye8Var.j;
                        int i5 = ye8Var.k;
                        jec jecVar = ye8Var.l;
                        jt6 jt6Var = ye8Var.m;
                        float f = ye8Var.n;
                        float f2 = ye8Var.o;
                        int i6 = ye8Var.p;
                        o00 o00Var = ye8Var.q;
                        of3 of3Var = ye8Var.s;
                        int i7 = ye8Var.t;
                        boolean z3 = ye8Var.u;
                        boolean z4 = ye8Var.v;
                        int i8 = ye8Var.w;
                        boolean z5 = ye8Var.x;
                        boolean z6 = ye8Var.y;
                        int i9 = ye8Var.z;
                        int i10 = ye8Var.A;
                        jt6 jt6Var2 = ye8Var.B;
                        long j = ye8Var.C;
                        long j2 = ye8Var.D;
                        long j3 = ye8Var.E;
                        g0c g0cVar = ye8Var.F;
                        d0c d0cVar = ye8Var.G;
                        if (!bqbVar.p() && n8aVar.a.b >= bqbVar.o()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        jte.p(z);
                        i.s = new ye8(u64Var, i2, n8aVar, qe8Var, qe8Var2, i3, ce8Var, i4, z2, jecVar, bqbVar, i5, jt6Var, f, f2, o00Var, i6, g53Var, of3Var, i7, z3, z4, i8, i9, i10, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
                        i.c.a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void z(g0c g0cVar) {
        switch (this.a) {
            case 0:
                return;
            default:
                tx6 i = i();
                if (i != null) {
                    i.t();
                    if (((cf8) ((WeakReference) this.c).get()) != null) {
                        i.s = i.s.a(g0cVar);
                        i.c.a(true, false);
                        i.d(new u36(g0cVar, (byte) 24));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void h0() {
    }

    public go6(ho6 ho6Var, h74 h74Var) {
        this.c = ho6Var;
        this.b = h74Var;
    }

    private final void I(oe8 oe8Var) {
    }

    private final void N(boolean z) {
    }

    private final void O(boolean z) {
    }

    private final void Q(boolean z) {
    }

    private final void S(jt6 jt6Var) {
    }

    private final void T(nf7 nf7Var) {
    }

    private final void U(nf7 nf7Var) {
    }

    private final void W(ce8 ce8Var) {
    }

    private final void X(int i) {
    }

    private final void Y(int i) {
    }

    private final void Z(u64 u64Var) {
    }

    private final void a0(u64 u64Var) {
    }

    private final void b0(u64 u64Var) {
    }

    private final void e0(jt6 jt6Var) {
    }

    private final void f0(int i) {
    }

    private final void g0(int i) {
    }

    private final void i0(int i) {
    }

    private final void j(o00 o00Var) {
    }

    private final void j0(boolean z) {
    }

    private final void k(int i) {
    }

    private final void k0(boolean z) {
    }

    private final void l0(boolean z) {
    }

    private final void n(ne8 ne8Var) {
    }

    private final void o0(d0c d0cVar) {
    }

    private final void p0(g0c g0cVar) {
    }

    private final void q0(jec jecVar) {
    }

    private final void r0(float f) {
    }

    private final void s(g53 g53Var) {
    }

    private final void u(y79 y79Var) {
    }

    private final void w(y79 y79Var) {
    }

    private final void y(oe8 oe8Var) {
    }

    private final void R(int i, bt6 bt6Var) {
    }

    private final void V(int i, boolean z) {
    }

    private final void c0(int i, boolean z) {
    }

    private final void d0(int i, boolean z) {
    }

    private final void m0(int i, int i2) {
    }

    private final void n0(bqb bqbVar, int i) {
    }
}
