package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class a0 implements b2.z0 {
    public final WeakReference f15725a;
    public final WeakReference f15726b;

    public a0(c0 c0Var, g1 g1Var) {
        this.f15725a = new WeakReference(c0Var);
        this.f15726b = new WeakReference(g1Var);
    }

    public final c0 a() {
        return (c0) this.f15725a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        q1 q1Var;
        boolean z10;
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            int i10 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f15896a.f3231b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15734c.a(true, true);
                        a2.h.f15907i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15907i.j(eVar);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
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
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            int i10 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i12 = e1Var.h;
            boolean z12 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z13 = e1Var.f15799s;
            boolean z14 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z15 = e1Var.v;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var = e1Var.E;
            if (!k1Var.p() && l1Var.f15896a.f3231b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
            try {
                a2.h.f15907i.getClass();
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
            a2.t();
        }
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        boolean z11;
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            int i10 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i12 = e1Var.h;
            boolean z12 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z13 = e1Var.f15799s;
            boolean z14 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var = e1Var.E;
            if (!k1Var.p() && l1Var.f15896a.f3231b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
            try {
                m0 m0Var = (m0) a2.h.f15907i.f15873e;
                m0Var.N(m0Var.f15906g.f15749t);
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
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f15896a.f3231b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15734c.a(true, true);
                        a2.h.f15907i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15907i.l(k0Var);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        q1 q1Var;
        boolean z10;
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            int i10 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var2 = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f15896a.f3231b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f15734c.a(true, true);
                        a2.h.f15907i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15907i.r();
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            a2.f15748s = e1Var.b(i10, e1Var.f15803x, z10);
            a2.f15734c.a(true, true);
            try {
                m0 m0Var = (m0) a2.h.f15907i.f15873e;
                m0Var.N(m0Var.f15906g.f15749t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        q1 q1Var;
        boolean z10;
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            int i10 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f15896a.f3231b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15734c.a(true, true);
                        m0 m0Var = (m0) a2.h.f15907i.f15873e;
                        m0Var.N(m0Var.f15906g.f15749t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                m0 m0Var2 = (m0) a2.h.f15907i.f15873e;
                m0Var2.N(m0Var2.f15906g.f15749t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            g1 g1Var = (g1) this.f15726b.get();
            if (g1Var == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 W = g1Var.W();
            int i11 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i12 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i13 = e1Var.h;
            boolean z11 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i14 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i15 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i16 = e1Var.f15801u;
            boolean z14 = e1Var.f15802w;
            int i17 = e1Var.f15803x;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var = e1Var.E;
            boolean z15 = false;
            if (i10 == 3 && z13 && i17 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (k1Var.p() || l1Var.f15896a.f3231b < k1Var.o()) {
                z15 = true;
            }
            e2.d.g(z15);
            a2.f15748s = new e1(W, i11, l1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
            try {
                k0 k0Var = a2.h.f15907i;
                g1Var.W();
                m0 m0Var = (m0) k0Var.f15873e;
                m0Var.N(m0Var.f15906g.f15749t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            a2.f15748s = e1Var.b(e1Var.f15801u, i10, e1Var.f15800t);
            a2.f15734c.a(true, true);
            try {
                m0 m0Var = (m0) a2.h.f15907i.f15873e;
                m0Var.N(m0Var.f15906g.f15749t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        q1 q1Var;
        boolean z10;
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            int i10 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f15896a.f3231b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15734c.a(true, true);
                        m0 m0Var = (m0) a2.h.f15907i.f15873e;
                        m0Var.N(m0Var.f15906g.f15749t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                m0 m0Var2 = (m0) a2.h.f15907i.f15873e;
                m0Var2.N(m0Var2.f15906g.f15749t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        boolean z10;
        c0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        e1 e1Var = a2.f15748s;
        b2.u0 u0Var = e1Var.f15783a;
        int i10 = e1Var.f15784b;
        l1 l1Var = e1Var.f15785c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f15786e;
        int i11 = e1Var.f15787f;
        b2.v0 v0Var = e1Var.f15788g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f15789i;
        b2.k1 k1Var = e1Var.f15790j;
        int i13 = e1Var.f15791k;
        x1 x1Var = e1Var.f15792l;
        float f7 = e1Var.f15794n;
        b2.e eVar = e1Var.f15795o;
        d2.d dVar = e1Var.f15796p;
        b2.l lVar = e1Var.f15797q;
        int i14 = e1Var.f15798r;
        boolean z12 = e1Var.f15799s;
        boolean z13 = e1Var.f15800t;
        int i15 = e1Var.f15801u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f15802w;
        int i16 = e1Var.f15803x;
        int i17 = e1Var.f15804y;
        b2.n0 n0Var2 = e1Var.f15805z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var = e1Var.E;
        if (!k1Var.p() && l1Var.f15896a.f3231b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15734c.a(true, true);
        try {
            a2.h.f15907i.n(n0Var);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame() {
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            oi.f fVar = a2.f15737g.f15756b;
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
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            int i11 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i12 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            boolean z11 = e1Var.f15789i;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f15896a.f3231b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15748s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15734c.a(true, true);
                        a2.h.f15907i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15907i.o(i10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15748s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q1 q1Var;
        boolean z11;
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f15748s;
            b2.u0 u0Var = e1Var.f15783a;
            int i10 = e1Var.f15784b;
            l1 l1Var = e1Var.f15785c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f15786e;
            int i11 = e1Var.f15787f;
            b2.v0 v0Var = e1Var.f15788g;
            int i12 = e1Var.h;
            b2.k1 k1Var = e1Var.f15790j;
            int i13 = e1Var.f15791k;
            x1 x1Var = e1Var.f15792l;
            b2.n0 n0Var = e1Var.f15793m;
            float f7 = e1Var.f15794n;
            b2.e eVar = e1Var.f15795o;
            d2.d dVar = e1Var.f15796p;
            b2.l lVar = e1Var.f15797q;
            int i14 = e1Var.f15798r;
            boolean z12 = e1Var.f15799s;
            boolean z13 = e1Var.f15800t;
            int i15 = e1Var.f15801u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f15802w;
            int i16 = e1Var.f15803x;
            int i17 = e1Var.f15804y;
            b2.n0 n0Var2 = e1Var.f15805z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f15896a.f3231b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15734c.a(true, true);
                        a2.h.f15907i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15907i.p(z10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15734c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            g1 g1Var = (g1) this.f15726b.get();
            if (g1Var == null) {
                return;
            }
            a2.f15748s = a2.f15748s.c(k1Var, g1Var.O0(), i10);
            a2.f15734c.a(false, true);
            try {
                a2.h.f15907i.q(k1Var);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            a2.f15748s = a2.f15748s.d(q1Var);
            a2.f15734c.a(true, true);
            a2.d(new j2.e(q1Var, 19));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        c0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f15726b.get()) == null) {
                return;
            }
            a2.f15748s = a2.f15748s.a(s1Var);
            a2.f15734c.a(true, false);
            a2.d(new j2.e(s1Var, 17));
        }
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        boolean z10;
        c0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        e1 e1Var = a2.f15748s;
        b2.u0 u0Var = e1Var.f15783a;
        int i10 = e1Var.f15784b;
        l1 l1Var = e1Var.f15785c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f15786e;
        int i11 = e1Var.f15787f;
        b2.v0 v0Var = e1Var.f15788g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f15789i;
        b2.k1 k1Var = e1Var.f15790j;
        int i13 = e1Var.f15791k;
        b2.n0 n0Var = e1Var.f15793m;
        float f7 = e1Var.f15794n;
        b2.e eVar = e1Var.f15795o;
        d2.d dVar = e1Var.f15796p;
        b2.l lVar = e1Var.f15797q;
        int i14 = e1Var.f15798r;
        boolean z12 = e1Var.f15799s;
        boolean z13 = e1Var.f15800t;
        int i15 = e1Var.f15801u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f15802w;
        int i16 = e1Var.f15803x;
        int i17 = e1Var.f15804y;
        b2.n0 n0Var2 = e1Var.f15805z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var = e1Var.E;
        if (!k1Var.p() && l1Var.f15896a.f3231b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15734c.a(true, true);
        try {
            a2.h.f15907i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onVolumeChanged(float f7) {
        boolean z10;
        c0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        e1 e1Var = a2.f15748s;
        b2.u0 u0Var = e1Var.f15783a;
        int i10 = e1Var.f15784b;
        l1 l1Var = e1Var.f15785c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f15786e;
        int i11 = e1Var.f15787f;
        b2.v0 v0Var = e1Var.f15788g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f15789i;
        b2.k1 k1Var = e1Var.f15790j;
        int i13 = e1Var.f15791k;
        x1 x1Var = e1Var.f15792l;
        b2.n0 n0Var = e1Var.f15793m;
        b2.e eVar = e1Var.f15795o;
        d2.d dVar = e1Var.f15796p;
        b2.l lVar = e1Var.f15797q;
        int i14 = e1Var.f15798r;
        boolean z12 = e1Var.f15799s;
        boolean z13 = e1Var.f15800t;
        int i15 = e1Var.f15801u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f15802w;
        int i16 = e1Var.f15803x;
        int i17 = e1Var.f15804y;
        b2.n0 n0Var2 = e1Var.f15805z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var = e1Var.E;
        if (!k1Var.p() && l1Var.f15896a.f3231b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15734c.a(true, true);
        try {
            a2.h.f15907i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onCues(d2.d dVar) {
        q1 q1Var;
        boolean z10;
        c0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((g1) this.f15726b.get()) == null) {
            return;
        }
        e1 e1Var = a2.f15748s;
        b2.u0 u0Var = e1Var.f15783a;
        int i10 = e1Var.f15784b;
        l1 l1Var = e1Var.f15785c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f15786e;
        int i11 = e1Var.f15787f;
        b2.v0 v0Var = e1Var.f15788g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f15789i;
        b2.k1 k1Var = e1Var.f15790j;
        int i13 = e1Var.f15791k;
        x1 x1Var = e1Var.f15792l;
        b2.n0 n0Var = e1Var.f15793m;
        float f7 = e1Var.f15794n;
        b2.e eVar = e1Var.f15795o;
        b2.l lVar = e1Var.f15797q;
        int i14 = e1Var.f15798r;
        boolean z12 = e1Var.f15799s;
        boolean z13 = e1Var.f15800t;
        int i15 = e1Var.f15801u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f15802w;
        int i16 = e1Var.f15803x;
        int i17 = e1Var.f15804y;
        b2.n0 n0Var2 = e1Var.f15805z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var2 = e1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (l1Var.f15896a.f3231b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f15734c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f15748s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15734c.a(true, true);
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        q1 q1Var;
        boolean z10;
        c0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((g1) this.f15726b.get()) == null) {
            return;
        }
        e1 e1Var = a2.f15748s;
        b2.u0 u0Var = e1Var.f15783a;
        int i11 = e1Var.f15784b;
        l1 l1Var = e1Var.f15785c;
        b2.v0 v0Var = e1Var.f15788g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f15789i;
        b2.k1 k1Var = e1Var.f15790j;
        int i13 = e1Var.f15791k;
        x1 x1Var = e1Var.f15792l;
        b2.n0 n0Var = e1Var.f15793m;
        float f7 = e1Var.f15794n;
        b2.e eVar = e1Var.f15795o;
        d2.d dVar = e1Var.f15796p;
        b2.l lVar = e1Var.f15797q;
        int i14 = e1Var.f15798r;
        boolean z12 = e1Var.f15799s;
        boolean z13 = e1Var.f15800t;
        int i15 = e1Var.f15801u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f15802w;
        int i16 = e1Var.f15803x;
        int i17 = e1Var.f15804y;
        b2.n0 n0Var2 = e1Var.f15805z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var2 = e1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (l1Var.f15896a.f3231b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f15748s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f15734c.a(true, true);
                    m0 m0Var = (m0) a2.h.f15907i.f15873e;
                    m0Var.N(m0Var.f15906g.f15749t);
                    return;
                }
            }
            m0 m0Var2 = (m0) a2.h.f15907i.f15873e;
            m0Var2.N(m0Var2.f15906g.f15749t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f15748s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15734c.a(true, true);
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
