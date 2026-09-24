package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class y implements b2.z0 {
    public final WeakReference f14934a;
    public final WeakReference f14935b;

    public y(a0 a0Var, e1 e1Var) {
        this.f14934a = new WeakReference(a0Var);
        this.f14935b = new WeakReference(e1Var);
    }

    public final a0 a() {
        return (a0) this.f14934a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            int i10 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f14827a.f2922b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14678c.a(true, true);
                        a2.h.f14838i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14838i.j(eVar);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
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
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            int i10 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i12 = c1Var.h;
            boolean z12 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z13 = c1Var.f14739s;
            boolean z14 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z15 = c1Var.v;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var = c1Var.E;
            if (!k1Var.p() && j1Var.f14827a.f2922b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
            try {
                a2.h.f14838i.getClass();
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            int i10 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i12 = c1Var.h;
            boolean z12 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z13 = c1Var.f14739s;
            boolean z14 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var = c1Var.E;
            if (!k1Var.p() && j1Var.f14827a.f2922b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f14838i.e;
                k0Var.N(k0Var.f14837g.f14692t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f14827a.f2922b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14678c.a(true, true);
                        a2.h.f14838i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14838i.l(k0Var);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            int i10 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var2 = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f14827a.f2922b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f14678c.a(true, true);
                        a2.h.f14838i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14838i.r();
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            a2.f14691s = c1Var.b(i10, c1Var.f14743x, z10);
            a2.f14678c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f14838i.e;
                k0Var.N(k0Var.f14837g.f14692t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            int i10 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f14827a.f2922b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14678c.a(true, true);
                        k0 k0Var = (k0) a2.h.f14838i.e;
                        k0Var.N(k0Var.f14837g.f14692t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f14838i.e;
                k0Var2.N(k0Var2.f14837g.f14692t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            e1 e1Var = (e1) this.f14935b.get();
            if (e1Var == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 W = e1Var.W();
            int i11 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i12 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i13 = c1Var.h;
            boolean z11 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i14 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i15 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i16 = c1Var.f14741u;
            boolean z14 = c1Var.f14742w;
            int i17 = c1Var.f14743x;
            b2.n0 n0Var2 = c1Var.f14745z;
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
            e2.d.g((k1Var.p() || j1Var.f14827a.f2922b < k1Var.o()) ? true : true);
            a2.f14691s = new c1(W, i11, j1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
            try {
                i0 i0Var = a2.h.f14838i;
                e1Var.W();
                k0 k0Var = (k0) i0Var.e;
                k0Var.N(k0Var.f14837g.f14692t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            a2.f14691s = c1Var.b(c1Var.f14741u, i10, c1Var.f14740t);
            a2.f14678c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f14838i.e;
                k0Var.N(k0Var.f14837g.f14692t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            int i10 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f14827a.f2922b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14678c.a(true, true);
                        k0 k0Var = (k0) a2.h.f14838i.e;
                        k0Var.N(k0Var.f14837g.f14692t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f14838i.e;
                k0Var2.N(k0Var2.f14837g.f14692t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
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
        c1 c1Var = a2.f14691s;
        b2.u0 u0Var = c1Var.f14724a;
        int i10 = c1Var.f14725b;
        j1 j1Var = c1Var.f14726c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f14727f;
        b2.v0 v0Var = c1Var.f14728g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f14729i;
        b2.k1 k1Var = c1Var.f14730j;
        int i13 = c1Var.f14731k;
        x1 x1Var = c1Var.f14732l;
        float f7 = c1Var.f14734n;
        b2.e eVar = c1Var.f14735o;
        d2.d dVar = c1Var.f14736p;
        b2.l lVar = c1Var.f14737q;
        int i14 = c1Var.f14738r;
        boolean z12 = c1Var.f14739s;
        boolean z13 = c1Var.f14740t;
        int i15 = c1Var.f14741u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f14742w;
        int i16 = c1Var.f14743x;
        int i17 = c1Var.f14744y;
        b2.n0 n0Var2 = c1Var.f14745z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f14827a.f2922b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14678c.a(true, true);
        try {
            a2.h.f14838i.n(n0Var);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            oi.f fVar = a2.f14680g.f14699b;
            e9.i0 s10 = fVar.s();
            for (int i10 = 0; i10 < s10.size(); i10++) {
                r rVar = (r) s10.get(i10);
                fVar.v(rVar);
                a2.c(rVar, new j2.e(23));
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
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            int i11 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i12 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            boolean z11 = c1Var.f14729i;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f14827a.f2922b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14691s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14678c.a(true, true);
                        a2.h.f14838i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14838i.o(i10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14691s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f14691s;
            b2.u0 u0Var = c1Var.f14724a;
            int i10 = c1Var.f14725b;
            j1 j1Var = c1Var.f14726c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.e;
            int i11 = c1Var.f14727f;
            b2.v0 v0Var = c1Var.f14728g;
            int i12 = c1Var.h;
            b2.k1 k1Var = c1Var.f14730j;
            int i13 = c1Var.f14731k;
            x1 x1Var = c1Var.f14732l;
            b2.n0 n0Var = c1Var.f14733m;
            float f7 = c1Var.f14734n;
            b2.e eVar = c1Var.f14735o;
            d2.d dVar = c1Var.f14736p;
            b2.l lVar = c1Var.f14737q;
            int i14 = c1Var.f14738r;
            boolean z12 = c1Var.f14739s;
            boolean z13 = c1Var.f14740t;
            int i15 = c1Var.f14741u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f14742w;
            int i16 = c1Var.f14743x;
            int i17 = c1Var.f14744y;
            b2.n0 n0Var2 = c1Var.f14745z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f14827a.f2922b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14678c.a(true, true);
                        a2.h.f14838i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14838i.p(z10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14678c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            e1 e1Var = (e1) this.f14935b.get();
            if (e1Var == null) {
                return;
            }
            a2.f14691s = a2.f14691s.c(k1Var, e1Var.O0(), i10);
            a2.f14678c.a(false, true);
            try {
                a2.h.f14838i.q(k1Var);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            a2.f14691s = a2.f14691s.d(q1Var);
            a2.f14678c.a(true, true);
            a2.d(new j2.e(q1Var, 24));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f14935b.get()) == null) {
                return;
            }
            a2.f14691s = a2.f14691s.a(s1Var);
            a2.f14678c.a(true, false);
            a2.d(new j2.e(s1Var, 22));
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
        c1 c1Var = a2.f14691s;
        b2.u0 u0Var = c1Var.f14724a;
        int i10 = c1Var.f14725b;
        j1 j1Var = c1Var.f14726c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f14727f;
        b2.v0 v0Var = c1Var.f14728g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f14729i;
        b2.k1 k1Var = c1Var.f14730j;
        int i13 = c1Var.f14731k;
        b2.n0 n0Var = c1Var.f14733m;
        float f7 = c1Var.f14734n;
        b2.e eVar = c1Var.f14735o;
        d2.d dVar = c1Var.f14736p;
        b2.l lVar = c1Var.f14737q;
        int i14 = c1Var.f14738r;
        boolean z12 = c1Var.f14739s;
        boolean z13 = c1Var.f14740t;
        int i15 = c1Var.f14741u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f14742w;
        int i16 = c1Var.f14743x;
        int i17 = c1Var.f14744y;
        b2.n0 n0Var2 = c1Var.f14745z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f14827a.f2922b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14678c.a(true, true);
        try {
            a2.h.f14838i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
        c1 c1Var = a2.f14691s;
        b2.u0 u0Var = c1Var.f14724a;
        int i10 = c1Var.f14725b;
        j1 j1Var = c1Var.f14726c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f14727f;
        b2.v0 v0Var = c1Var.f14728g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f14729i;
        b2.k1 k1Var = c1Var.f14730j;
        int i13 = c1Var.f14731k;
        x1 x1Var = c1Var.f14732l;
        b2.n0 n0Var = c1Var.f14733m;
        b2.e eVar = c1Var.f14735o;
        d2.d dVar = c1Var.f14736p;
        b2.l lVar = c1Var.f14737q;
        int i14 = c1Var.f14738r;
        boolean z12 = c1Var.f14739s;
        boolean z13 = c1Var.f14740t;
        int i15 = c1Var.f14741u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f14742w;
        int i16 = c1Var.f14743x;
        int i17 = c1Var.f14744y;
        b2.n0 n0Var2 = c1Var.f14745z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f14827a.f2922b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14678c.a(true, true);
        try {
            a2.h.f14838i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
        if (((e1) this.f14935b.get()) == null) {
            return;
        }
        c1 c1Var = a2.f14691s;
        b2.u0 u0Var = c1Var.f14724a;
        int i10 = c1Var.f14725b;
        j1 j1Var = c1Var.f14726c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.e;
        int i11 = c1Var.f14727f;
        b2.v0 v0Var = c1Var.f14728g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f14729i;
        b2.k1 k1Var = c1Var.f14730j;
        int i13 = c1Var.f14731k;
        x1 x1Var = c1Var.f14732l;
        b2.n0 n0Var = c1Var.f14733m;
        float f7 = c1Var.f14734n;
        b2.e eVar = c1Var.f14735o;
        b2.l lVar = c1Var.f14737q;
        int i14 = c1Var.f14738r;
        boolean z12 = c1Var.f14739s;
        boolean z13 = c1Var.f14740t;
        int i15 = c1Var.f14741u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f14742w;
        int i16 = c1Var.f14743x;
        int i17 = c1Var.f14744y;
        b2.n0 n0Var2 = c1Var.f14745z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (j1Var.f14827a.f2922b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f14678c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f14691s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14678c.a(true, true);
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
        if (((e1) this.f14935b.get()) == null) {
            return;
        }
        c1 c1Var = a2.f14691s;
        b2.u0 u0Var = c1Var.f14724a;
        int i11 = c1Var.f14725b;
        j1 j1Var = c1Var.f14726c;
        b2.v0 v0Var = c1Var.f14728g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f14729i;
        b2.k1 k1Var = c1Var.f14730j;
        int i13 = c1Var.f14731k;
        x1 x1Var = c1Var.f14732l;
        b2.n0 n0Var = c1Var.f14733m;
        float f7 = c1Var.f14734n;
        b2.e eVar = c1Var.f14735o;
        d2.d dVar = c1Var.f14736p;
        b2.l lVar = c1Var.f14737q;
        int i14 = c1Var.f14738r;
        boolean z12 = c1Var.f14739s;
        boolean z13 = c1Var.f14740t;
        int i15 = c1Var.f14741u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f14742w;
        int i16 = c1Var.f14743x;
        int i17 = c1Var.f14744y;
        b2.n0 n0Var2 = c1Var.f14745z;
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
                if (j1Var.f14827a.f2922b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f14691s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f14678c.a(true, true);
                    k0 k0Var = (k0) a2.h.f14838i.e;
                    k0Var.N(k0Var.f14837g.f14692t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.f14838i.e;
            k0Var2.N(k0Var2.f14837g.f14692t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f14691s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14678c.a(true, true);
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
