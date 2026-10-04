package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class y implements b2.z0 {
    public final WeakReference f16312a;
    public final WeakReference f16313b;

    public y(a0 a0Var, e1 e1Var) {
        this.f16312a = new WeakReference(a0Var);
        this.f16313b = new WeakReference(e1Var);
    }

    public final a0 a() {
        return (a0) this.f16312a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            int i10 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16198a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16038c.a(true, true);
                        a2.h.f16210i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16210i.j(eVar);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
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
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            int i10 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i12 = c1Var.h;
            boolean z12 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z13 = c1Var.f16102s;
            boolean z14 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z15 = c1Var.v;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var = c1Var.E;
            if (!k1Var.p() && j1Var.f16198a.f3154b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
            try {
                a2.h.f16210i.getClass();
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
            a2.t();
        }
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        boolean z11;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            int i10 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i12 = c1Var.h;
            boolean z12 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z13 = c1Var.f16102s;
            boolean z14 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var = c1Var.E;
            if (!k1Var.p() && j1Var.f16198a.f3154b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f16210i.f16181e;
                k0Var.N(k0Var.f16209g.f16053t);
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
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16198a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16038c.a(true, true);
                        a2.h.f16210i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16210i.l(k0Var);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            int i10 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var2 = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16198a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f16038c.a(true, true);
                        a2.h.f16210i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16210i.r();
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            a2.f16052s = c1Var.b(i10, c1Var.f16106x, z10);
            a2.f16038c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f16210i.f16181e;
                k0Var.N(k0Var.f16209g.f16053t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            int i10 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16198a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16038c.a(true, true);
                        k0 k0Var = (k0) a2.h.f16210i.f16181e;
                        k0Var.N(k0Var.f16209g.f16053t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f16210i.f16181e;
                k0Var2.N(k0Var2.f16209g.f16053t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            e1 e1Var = (e1) this.f16313b.get();
            if (e1Var == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 W = e1Var.W();
            int i11 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i12 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i13 = c1Var.h;
            boolean z11 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i14 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i15 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i16 = c1Var.f16104u;
            boolean z14 = c1Var.f16105w;
            int i17 = c1Var.f16106x;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var = c1Var.E;
            boolean z15 = false;
            if (i10 == 3 && z13 && i17 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g((k1Var.p() || j1Var.f16198a.f3154b < k1Var.o()) ? true : true);
            a2.f16052s = new c1(W, i11, j1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
            try {
                i0 i0Var = a2.h.f16210i;
                e1Var.W();
                k0 k0Var = (k0) i0Var.f16181e;
                k0Var.N(k0Var.f16209g.f16053t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            a2.f16052s = c1Var.b(c1Var.f16104u, i10, c1Var.f16103t);
            a2.f16038c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f16210i.f16181e;
                k0Var.N(k0Var.f16209g.f16053t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            int i10 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16198a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16038c.a(true, true);
                        k0 k0Var = (k0) a2.h.f16210i.f16181e;
                        k0Var.N(k0Var.f16209g.f16053t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f16210i.f16181e;
                k0Var2.N(k0Var2.f16209g.f16053t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        c1 c1Var = a2.f16052s;
        b2.u0 u0Var = c1Var.f16086a;
        int i10 = c1Var.f16087b;
        j1 j1Var = c1Var.f16088c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16089e;
        int i11 = c1Var.f16090f;
        b2.v0 v0Var = c1Var.f16091g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16092i;
        b2.k1 k1Var = c1Var.f16093j;
        int i13 = c1Var.f16094k;
        x1 x1Var = c1Var.f16095l;
        float f7 = c1Var.f16097n;
        b2.e eVar = c1Var.f16098o;
        d2.d dVar = c1Var.f16099p;
        b2.l lVar = c1Var.f16100q;
        int i14 = c1Var.f16101r;
        boolean z12 = c1Var.f16102s;
        boolean z13 = c1Var.f16103t;
        int i15 = c1Var.f16104u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16105w;
        int i16 = c1Var.f16106x;
        int i17 = c1Var.f16107y;
        b2.n0 n0Var2 = c1Var.f16108z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f16198a.f3154b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16038c.a(true, true);
        try {
            a2.h.f16210i.n(n0Var);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame() {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            qi.f fVar = a2.f16041g.f16060b;
            e9.i0 s10 = fVar.s();
            for (int i10 = 0; i10 < s10.size(); i10++) {
                r rVar = (r) s10.get(i10);
                fVar.v(rVar);
                a2.c(rVar, new j2.e(24));
            }
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            int i11 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i12 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            boolean z11 = c1Var.f16092i;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16198a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16052s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16038c.a(true, true);
                        a2.h.f16210i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16210i.o(i10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16052s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16052s;
            b2.u0 u0Var = c1Var.f16086a;
            int i10 = c1Var.f16087b;
            j1 j1Var = c1Var.f16088c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16089e;
            int i11 = c1Var.f16090f;
            b2.v0 v0Var = c1Var.f16091g;
            int i12 = c1Var.h;
            b2.k1 k1Var = c1Var.f16093j;
            int i13 = c1Var.f16094k;
            x1 x1Var = c1Var.f16095l;
            b2.n0 n0Var = c1Var.f16096m;
            float f7 = c1Var.f16097n;
            b2.e eVar = c1Var.f16098o;
            d2.d dVar = c1Var.f16099p;
            b2.l lVar = c1Var.f16100q;
            int i14 = c1Var.f16101r;
            boolean z12 = c1Var.f16102s;
            boolean z13 = c1Var.f16103t;
            int i15 = c1Var.f16104u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16105w;
            int i16 = c1Var.f16106x;
            int i17 = c1Var.f16107y;
            b2.n0 n0Var2 = c1Var.f16108z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16198a.f3154b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16038c.a(true, true);
                        a2.h.f16210i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16210i.p(z10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16038c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            e1 e1Var = (e1) this.f16313b.get();
            if (e1Var == null) {
                return;
            }
            a2.f16052s = a2.f16052s.c(k1Var, e1Var.O0(), i10);
            a2.f16038c.a(false, true);
            try {
                a2.h.f16210i.q(k1Var);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            a2.f16052s = a2.f16052s.d(q1Var);
            a2.f16038c.a(true, true);
            a2.d(new j2.e(q1Var, 25));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16313b.get()) == null) {
                return;
            }
            a2.f16052s = a2.f16052s.a(s1Var);
            a2.f16038c.a(true, false);
            a2.d(new j2.e(s1Var, 23));
        }
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        c1 c1Var = a2.f16052s;
        b2.u0 u0Var = c1Var.f16086a;
        int i10 = c1Var.f16087b;
        j1 j1Var = c1Var.f16088c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16089e;
        int i11 = c1Var.f16090f;
        b2.v0 v0Var = c1Var.f16091g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16092i;
        b2.k1 k1Var = c1Var.f16093j;
        int i13 = c1Var.f16094k;
        b2.n0 n0Var = c1Var.f16096m;
        float f7 = c1Var.f16097n;
        b2.e eVar = c1Var.f16098o;
        d2.d dVar = c1Var.f16099p;
        b2.l lVar = c1Var.f16100q;
        int i14 = c1Var.f16101r;
        boolean z12 = c1Var.f16102s;
        boolean z13 = c1Var.f16103t;
        int i15 = c1Var.f16104u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16105w;
        int i16 = c1Var.f16106x;
        int i17 = c1Var.f16107y;
        b2.n0 n0Var2 = c1Var.f16108z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f16198a.f3154b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16038c.a(true, true);
        try {
            a2.h.f16210i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onVolumeChanged(float f7) {
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        c1 c1Var = a2.f16052s;
        b2.u0 u0Var = c1Var.f16086a;
        int i10 = c1Var.f16087b;
        j1 j1Var = c1Var.f16088c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16089e;
        int i11 = c1Var.f16090f;
        b2.v0 v0Var = c1Var.f16091g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16092i;
        b2.k1 k1Var = c1Var.f16093j;
        int i13 = c1Var.f16094k;
        x1 x1Var = c1Var.f16095l;
        b2.n0 n0Var = c1Var.f16096m;
        b2.e eVar = c1Var.f16098o;
        d2.d dVar = c1Var.f16099p;
        b2.l lVar = c1Var.f16100q;
        int i14 = c1Var.f16101r;
        boolean z12 = c1Var.f16102s;
        boolean z13 = c1Var.f16103t;
        int i15 = c1Var.f16104u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16105w;
        int i16 = c1Var.f16106x;
        int i17 = c1Var.f16107y;
        b2.n0 n0Var2 = c1Var.f16108z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f16198a.f3154b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16038c.a(true, true);
        try {
            a2.h.f16210i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onCues(d2.d dVar) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((e1) this.f16313b.get()) == null) {
            return;
        }
        c1 c1Var = a2.f16052s;
        b2.u0 u0Var = c1Var.f16086a;
        int i10 = c1Var.f16087b;
        j1 j1Var = c1Var.f16088c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16089e;
        int i11 = c1Var.f16090f;
        b2.v0 v0Var = c1Var.f16091g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16092i;
        b2.k1 k1Var = c1Var.f16093j;
        int i13 = c1Var.f16094k;
        x1 x1Var = c1Var.f16095l;
        b2.n0 n0Var = c1Var.f16096m;
        float f7 = c1Var.f16097n;
        b2.e eVar = c1Var.f16098o;
        b2.l lVar = c1Var.f16100q;
        int i14 = c1Var.f16101r;
        boolean z12 = c1Var.f16102s;
        boolean z13 = c1Var.f16103t;
        int i15 = c1Var.f16104u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16105w;
        int i16 = c1Var.f16106x;
        int i17 = c1Var.f16107y;
        b2.n0 n0Var2 = c1Var.f16108z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (j1Var.f16198a.f3154b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f16038c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f16052s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16038c.a(true, true);
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((e1) this.f16313b.get()) == null) {
            return;
        }
        c1 c1Var = a2.f16052s;
        b2.u0 u0Var = c1Var.f16086a;
        int i11 = c1Var.f16087b;
        j1 j1Var = c1Var.f16088c;
        b2.v0 v0Var = c1Var.f16091g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16092i;
        b2.k1 k1Var = c1Var.f16093j;
        int i13 = c1Var.f16094k;
        x1 x1Var = c1Var.f16095l;
        b2.n0 n0Var = c1Var.f16096m;
        float f7 = c1Var.f16097n;
        b2.e eVar = c1Var.f16098o;
        d2.d dVar = c1Var.f16099p;
        b2.l lVar = c1Var.f16100q;
        int i14 = c1Var.f16101r;
        boolean z12 = c1Var.f16102s;
        boolean z13 = c1Var.f16103t;
        int i15 = c1Var.f16104u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16105w;
        int i16 = c1Var.f16106x;
        int i17 = c1Var.f16107y;
        b2.n0 n0Var2 = c1Var.f16108z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (j1Var.f16198a.f3154b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f16052s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f16038c.a(true, true);
                    k0 k0Var = (k0) a2.h.f16210i.f16181e;
                    k0Var.N(k0Var.f16209g.f16053t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.f16210i.f16181e;
            k0Var2.N(k0Var2.f16209g.f16053t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f16052s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16038c.a(true, true);
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
