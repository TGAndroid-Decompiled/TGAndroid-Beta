package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class z implements b2.z0 {
    public final WeakReference f16255a;
    public final WeakReference f16256b;

    public z(b0 b0Var, f1 f1Var) {
        this.f16255a = new WeakReference(b0Var);
        this.f16256b = new WeakReference(f1Var);
    }

    public final b0 a() {
        return (b0) this.f16255a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            int i10 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i12 = d1Var.h;
            boolean z11 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z14 = d1Var.v;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var2 = d1Var.E;
            try {
                if (!k1Var2.p()) {
                    q1Var = q1Var2;
                    if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15982c.a(true, true);
                        a2.h.f16157i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16157i.j(eVar);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            a2.f(x0Var);
        }
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        boolean z11;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            int i10 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i12 = d1Var.h;
            boolean z12 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z13 = d1Var.f16043s;
            boolean z14 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z15 = d1Var.v;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var = d1Var.E;
            if (!k1Var2.p() && k1Var.f16140a.f3233b >= k1Var2.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
            try {
                a2.h.f16157i.getClass();
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
            a2.t();
        }
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        boolean z11;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            int i10 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i12 = d1Var.h;
            boolean z12 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z13 = d1Var.f16043s;
            boolean z14 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var = d1Var.E;
            if (!k1Var2.p() && k1Var.f16140a.f3233b >= k1Var2.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f16157i.f16122e;
                l0Var.N(l0Var.f16156g.f15997t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
            a2.t();
        }
    }

    @Override
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i12 = d1Var.h;
            boolean z11 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z14 = d1Var.v;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var2 = d1Var.E;
            try {
                if (!k1Var2.p()) {
                    q1Var = q1Var2;
                    if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15982c.a(true, true);
                        a2.h.f16157i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16157i.l(k0Var);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            int i10 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i12 = d1Var.h;
            boolean z11 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var2 = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z14 = d1Var.v;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var2 = d1Var.E;
            try {
                if (!k1Var2.p()) {
                    q1Var = q1Var2;
                    if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f15982c.a(true, true);
                        a2.h.f16157i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16157i.r();
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            a2.f15996s = d1Var.b(i10, d1Var.f16047x, z10);
            a2.f15982c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f16157i.f16122e;
                l0Var.N(l0Var.f16156g.f15997t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            int i10 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            int i12 = d1Var.h;
            boolean z11 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z14 = d1Var.v;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var2 = d1Var.E;
            try {
                if (!k1Var2.p()) {
                    q1Var = q1Var2;
                    if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15982c.a(true, true);
                        l0 l0Var = (l0) a2.h.f16157i.f16122e;
                        l0Var.N(l0Var.f16156g.f15997t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                l0 l0Var2 = (l0) a2.h.f16157i.f16122e;
                l0Var2.N(l0Var2.f16156g.f15997t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            f1 f1Var = (f1) this.f16256b.get();
            if (f1Var == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 W = f1Var.W();
            int i11 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i12 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i13 = d1Var.h;
            boolean z11 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i14 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i15 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i16 = d1Var.f16045u;
            boolean z14 = d1Var.f16046w;
            int i17 = d1Var.f16047x;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var = d1Var.E;
            boolean z15 = false;
            if (i10 == 3 && z13 && i17 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (k1Var2.p() || k1Var.f16140a.f3233b < k1Var2.o()) {
                z15 = true;
            }
            e2.d.g(z15);
            a2.f15996s = new d1(W, i11, k1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var2, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
            try {
                j0 j0Var = a2.h.f16157i;
                f1Var.W();
                l0 l0Var = (l0) j0Var.f16122e;
                l0Var.N(l0Var.f16156g.f15997t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            a2.f15996s = d1Var.b(d1Var.f16045u, i10, d1Var.f16044t);
            a2.f15982c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f16157i.f16122e;
                l0Var.N(l0Var.f16156g.f15997t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            int i10 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i12 = d1Var.h;
            boolean z11 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z14 = d1Var.v;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var2 = d1Var.E;
            try {
                if (!k1Var2.p()) {
                    q1Var = q1Var2;
                    if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15982c.a(true, true);
                        l0 l0Var = (l0) a2.h.f16157i.f16122e;
                        l0Var.N(l0Var.f16156g.f15997t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                l0 l0Var2 = (l0) a2.h.f16157i.f16122e;
                l0Var2.N(l0Var2.f16156g.f15997t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        d1 d1Var = a2.f15996s;
        b2.u0 u0Var = d1Var.f16027a;
        int i10 = d1Var.f16028b;
        k1 k1Var = d1Var.f16029c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.f16030e;
        int i11 = d1Var.f16031f;
        b2.v0 v0Var = d1Var.f16032g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.f16033i;
        b2.k1 k1Var2 = d1Var.f16034j;
        int i13 = d1Var.f16035k;
        x1 x1Var = d1Var.f16036l;
        float f7 = d1Var.f16038n;
        b2.e eVar = d1Var.f16039o;
        d2.d dVar = d1Var.f16040p;
        b2.l lVar = d1Var.f16041q;
        int i14 = d1Var.f16042r;
        boolean z12 = d1Var.f16043s;
        boolean z13 = d1Var.f16044t;
        int i15 = d1Var.f16045u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.f16046w;
        int i16 = d1Var.f16047x;
        int i17 = d1Var.f16048y;
        b2.n0 n0Var2 = d1Var.f16049z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        if (!k1Var2.p() && k1Var.f16140a.f3233b >= k1Var2.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15982c.a(true, true);
        try {
            a2.h.f16157i.n(n0Var);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame() {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            oi.f fVar = a2.f15985g.f16004b;
            e9.i0 s10 = fVar.s();
            for (int i10 = 0; i10 < s10.size(); i10++) {
                r rVar = (r) s10.get(i10);
                fVar.v(rVar);
                a2.c(rVar, new j2.e(18));
            }
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            int i11 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i12 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            boolean z11 = d1Var.f16033i;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z14 = d1Var.v;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var2 = d1Var.E;
            try {
                if (!k1Var2.p()) {
                    q1Var = q1Var2;
                    if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15996s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15982c.a(true, true);
                        a2.h.f16157i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16157i.o(i10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15996s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q1 q1Var;
        boolean z11;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            d1 d1Var = a2.f15996s;
            b2.u0 u0Var = d1Var.f16027a;
            int i10 = d1Var.f16028b;
            k1 k1Var = d1Var.f16029c;
            b2.a1 a1Var = d1Var.d;
            b2.a1 a1Var2 = d1Var.f16030e;
            int i11 = d1Var.f16031f;
            b2.v0 v0Var = d1Var.f16032g;
            int i12 = d1Var.h;
            b2.k1 k1Var2 = d1Var.f16034j;
            int i13 = d1Var.f16035k;
            x1 x1Var = d1Var.f16036l;
            b2.n0 n0Var = d1Var.f16037m;
            float f7 = d1Var.f16038n;
            b2.e eVar = d1Var.f16039o;
            d2.d dVar = d1Var.f16040p;
            b2.l lVar = d1Var.f16041q;
            int i14 = d1Var.f16042r;
            boolean z12 = d1Var.f16043s;
            boolean z13 = d1Var.f16044t;
            int i15 = d1Var.f16045u;
            boolean z14 = d1Var.v;
            boolean z15 = d1Var.f16046w;
            int i16 = d1Var.f16047x;
            int i17 = d1Var.f16048y;
            b2.n0 n0Var2 = d1Var.f16049z;
            long j3 = d1Var.A;
            long j10 = d1Var.B;
            long j11 = d1Var.C;
            s1 s1Var = d1Var.D;
            q1 q1Var2 = d1Var.E;
            try {
                if (!k1Var2.p()) {
                    q1Var = q1Var2;
                    if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15982c.a(true, true);
                        a2.h.f16157i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16157i.p(z10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15982c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            f1 f1Var = (f1) this.f16256b.get();
            if (f1Var == null) {
                return;
            }
            a2.f15996s = a2.f15996s.c(k1Var, f1Var.O0(), i10);
            a2.f15982c.a(false, true);
            try {
                a2.h.f16157i.q(k1Var);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            a2.f15996s = a2.f15996s.d(q1Var);
            a2.f15982c.a(true, true);
            a2.d(new j2.e(q1Var, 19));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((f1) this.f16256b.get()) == null) {
                return;
            }
            a2.f15996s = a2.f15996s.a(s1Var);
            a2.f15982c.a(true, false);
            a2.d(new j2.e(s1Var, 17));
        }
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        d1 d1Var = a2.f15996s;
        b2.u0 u0Var = d1Var.f16027a;
        int i10 = d1Var.f16028b;
        k1 k1Var = d1Var.f16029c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.f16030e;
        int i11 = d1Var.f16031f;
        b2.v0 v0Var = d1Var.f16032g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.f16033i;
        b2.k1 k1Var2 = d1Var.f16034j;
        int i13 = d1Var.f16035k;
        b2.n0 n0Var = d1Var.f16037m;
        float f7 = d1Var.f16038n;
        b2.e eVar = d1Var.f16039o;
        d2.d dVar = d1Var.f16040p;
        b2.l lVar = d1Var.f16041q;
        int i14 = d1Var.f16042r;
        boolean z12 = d1Var.f16043s;
        boolean z13 = d1Var.f16044t;
        int i15 = d1Var.f16045u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.f16046w;
        int i16 = d1Var.f16047x;
        int i17 = d1Var.f16048y;
        b2.n0 n0Var2 = d1Var.f16049z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        if (!k1Var2.p() && k1Var.f16140a.f3233b >= k1Var2.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15982c.a(true, true);
        try {
            a2.h.f16157i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onVolumeChanged(float f7) {
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        d1 d1Var = a2.f15996s;
        b2.u0 u0Var = d1Var.f16027a;
        int i10 = d1Var.f16028b;
        k1 k1Var = d1Var.f16029c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.f16030e;
        int i11 = d1Var.f16031f;
        b2.v0 v0Var = d1Var.f16032g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.f16033i;
        b2.k1 k1Var2 = d1Var.f16034j;
        int i13 = d1Var.f16035k;
        x1 x1Var = d1Var.f16036l;
        b2.n0 n0Var = d1Var.f16037m;
        b2.e eVar = d1Var.f16039o;
        d2.d dVar = d1Var.f16040p;
        b2.l lVar = d1Var.f16041q;
        int i14 = d1Var.f16042r;
        boolean z12 = d1Var.f16043s;
        boolean z13 = d1Var.f16044t;
        int i15 = d1Var.f16045u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.f16046w;
        int i16 = d1Var.f16047x;
        int i17 = d1Var.f16048y;
        b2.n0 n0Var2 = d1Var.f16049z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var = d1Var.E;
        if (!k1Var2.p() && k1Var.f16140a.f3233b >= k1Var2.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15982c.a(true, true);
        try {
            a2.h.f16157i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onCues(d2.d dVar) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.f16256b.get()) == null) {
            return;
        }
        d1 d1Var = a2.f15996s;
        b2.u0 u0Var = d1Var.f16027a;
        int i10 = d1Var.f16028b;
        k1 k1Var = d1Var.f16029c;
        b2.a1 a1Var = d1Var.d;
        b2.a1 a1Var2 = d1Var.f16030e;
        int i11 = d1Var.f16031f;
        b2.v0 v0Var = d1Var.f16032g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.f16033i;
        b2.k1 k1Var2 = d1Var.f16034j;
        int i13 = d1Var.f16035k;
        x1 x1Var = d1Var.f16036l;
        b2.n0 n0Var = d1Var.f16037m;
        float f7 = d1Var.f16038n;
        b2.e eVar = d1Var.f16039o;
        b2.l lVar = d1Var.f16041q;
        int i14 = d1Var.f16042r;
        boolean z12 = d1Var.f16043s;
        boolean z13 = d1Var.f16044t;
        int i15 = d1Var.f16045u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.f16046w;
        int i16 = d1Var.f16047x;
        int i17 = d1Var.f16048y;
        b2.n0 n0Var2 = d1Var.f16049z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        if (k1Var2.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f15982c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f15996s = new d1(u0Var, i10, k1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15982c.a(true, true);
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((f1) this.f16256b.get()) == null) {
            return;
        }
        d1 d1Var = a2.f15996s;
        b2.u0 u0Var = d1Var.f16027a;
        int i11 = d1Var.f16028b;
        k1 k1Var = d1Var.f16029c;
        b2.v0 v0Var = d1Var.f16032g;
        int i12 = d1Var.h;
        boolean z11 = d1Var.f16033i;
        b2.k1 k1Var2 = d1Var.f16034j;
        int i13 = d1Var.f16035k;
        x1 x1Var = d1Var.f16036l;
        b2.n0 n0Var = d1Var.f16037m;
        float f7 = d1Var.f16038n;
        b2.e eVar = d1Var.f16039o;
        d2.d dVar = d1Var.f16040p;
        b2.l lVar = d1Var.f16041q;
        int i14 = d1Var.f16042r;
        boolean z12 = d1Var.f16043s;
        boolean z13 = d1Var.f16044t;
        int i15 = d1Var.f16045u;
        boolean z14 = d1Var.v;
        boolean z15 = d1Var.f16046w;
        int i16 = d1Var.f16047x;
        int i17 = d1Var.f16048y;
        b2.n0 n0Var2 = d1Var.f16049z;
        long j3 = d1Var.A;
        long j10 = d1Var.B;
        long j11 = d1Var.C;
        s1 s1Var = d1Var.D;
        q1 q1Var2 = d1Var.E;
        try {
            if (k1Var2.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (k1Var.f16140a.f3233b >= k1Var2.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f15996s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f15982c.a(true, true);
                    l0 l0Var = (l0) a2.h.f16157i.f16122e;
                    l0Var.N(l0Var.f16156g.f15997t);
                    return;
                }
            }
            l0 l0Var2 = (l0) a2.h.f16157i.f16122e;
            l0Var2.N(l0Var2.f16156g.f15997t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f15996s = new d1(u0Var, i11, k1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var2, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15982c.a(true, true);
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onMetadata(b2.p0 p0Var) {
    }

    @Override
    public final void onPlayerErrorChanged(b2.u0 u0Var) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override
    public final void onEvents(b2.b1 b1Var, b2.y0 y0Var) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }
}
