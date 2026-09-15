package m4;

import android.os.RemoteException;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class y implements b2.z0 {
    public final WeakReference f14722a;
    public final WeakReference f14723b;

    public y(a0 a0Var, k1 k1Var) {
        this.f14722a = new WeakReference(a0Var);
        this.f14723b = new WeakReference(k1Var);
    }

    public final a0 a() {
        return (a0) this.f14722a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            int i10 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i12 = i1Var.h;
            boolean z11 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z14 = i1Var.v;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var2 = i1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (p1Var.f14653a.f2925b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14452c.a(true, true);
                        a2.h.f14597i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14597i.j(eVar);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
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
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            int i10 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i12 = i1Var.h;
            boolean z12 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z13 = i1Var.f14572s;
            boolean z14 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z15 = i1Var.v;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var = i1Var.E;
            if (!k1Var.p() && p1Var.f14653a.f2925b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
            try {
                a2.h.f14597i.getClass();
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
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            int i10 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i12 = i1Var.h;
            boolean z12 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z13 = i1Var.f14572s;
            boolean z14 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var = i1Var.E;
            if (!k1Var.p() && p1Var.f14653a.f2925b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f14597i.e;
                l0Var.N(l0Var.f14596g.f14466t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
            a2.t();
        }
    }

    @Override
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i12 = i1Var.h;
            boolean z11 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z14 = i1Var.v;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var2 = i1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (p1Var.f14653a.f2925b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14452c.a(true, true);
                        a2.h.f14597i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14597i.l(k0Var);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            int i10 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i12 = i1Var.h;
            boolean z11 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var2 = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z14 = i1Var.v;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var2 = i1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (p1Var.f14653a.f2925b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f14452c.a(true, true);
                        a2.h.f14597i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14597i.r();
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            a2.f14465s = i1Var.b(i10, i1Var.f14576x, z10);
            a2.f14452c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f14597i.e;
                l0Var.N(l0Var.f14596g.f14466t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            int i10 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            int i12 = i1Var.h;
            boolean z11 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z14 = i1Var.v;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var2 = i1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (p1Var.f14653a.f2925b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14452c.a(true, true);
                        l0 l0Var = (l0) a2.h.f14597i.e;
                        l0Var.N(l0Var.f14596g.f14466t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                l0 l0Var2 = (l0) a2.h.f14597i.e;
                l0Var2.N(l0Var2.f14596g.f14466t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            k1 k1Var = (k1) this.f14723b.get();
            if (k1Var == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 W = k1Var.W();
            int i11 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i12 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i13 = i1Var.h;
            boolean z11 = i1Var.f14562i;
            b2.k1 k1Var2 = i1Var.f14563j;
            int i14 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i15 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i16 = i1Var.f14574u;
            boolean z14 = i1Var.f14575w;
            int i17 = i1Var.f14576x;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var = i1Var.E;
            boolean z15 = false;
            if (i10 == 3 && z13 && i17 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g((k1Var2.p() || p1Var.f14653a.f2925b < k1Var2.o()) ? true : true);
            a2.f14465s = new i1(W, i11, p1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var2, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
            try {
                j0 j0Var = a2.h.f14597i;
                k1Var.W();
                l0 l0Var = (l0) j0Var.e;
                l0Var.N(l0Var.f14596g.f14466t);
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
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            a2.f14465s = i1Var.b(i1Var.f14574u, i10, i1Var.f14573t);
            a2.f14452c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f14597i.e;
                l0Var.N(l0Var.f14596g.f14466t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            int i10 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i12 = i1Var.h;
            boolean z11 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z14 = i1Var.v;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var2 = i1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (p1Var.f14653a.f2925b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14452c.a(true, true);
                        l0 l0Var = (l0) a2.h.f14597i.e;
                        l0Var.N(l0Var.f14596g.f14466t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                l0 l0Var2 = (l0) a2.h.f14597i.e;
                l0Var2.N(l0Var2.f14596g.f14466t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
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
        i1 i1Var = a2.f14465s;
        b2.u0 u0Var = i1Var.f14557a;
        int i10 = i1Var.f14558b;
        p1 p1Var = i1Var.f14559c;
        b2.a1 a1Var = i1Var.d;
        b2.a1 a1Var2 = i1Var.e;
        int i11 = i1Var.f14560f;
        b2.v0 v0Var = i1Var.f14561g;
        int i12 = i1Var.h;
        boolean z11 = i1Var.f14562i;
        b2.k1 k1Var = i1Var.f14563j;
        int i13 = i1Var.f14564k;
        x1 x1Var = i1Var.f14565l;
        float f7 = i1Var.f14567n;
        b2.e eVar = i1Var.f14568o;
        d2.d dVar = i1Var.f14569p;
        b2.l lVar = i1Var.f14570q;
        int i14 = i1Var.f14571r;
        boolean z12 = i1Var.f14572s;
        boolean z13 = i1Var.f14573t;
        int i15 = i1Var.f14574u;
        boolean z14 = i1Var.v;
        boolean z15 = i1Var.f14575w;
        int i16 = i1Var.f14576x;
        int i17 = i1Var.f14577y;
        b2.n0 n0Var2 = i1Var.f14578z;
        long j3 = i1Var.A;
        long j10 = i1Var.B;
        long j11 = i1Var.C;
        b2.s1 s1Var = i1Var.D;
        b2.q1 q1Var = i1Var.E;
        if (!k1Var.p() && p1Var.f14653a.f2925b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14452c.a(true, true);
        try {
            a2.h.f14597i.n(n0Var);
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
            ni.f fVar = a2.f14454g.f14538b;
            e9.i0 s10 = fVar.s();
            for (int i10 = 0; i10 < s10.size(); i10++) {
                r rVar = (r) s10.get(i10);
                fVar.v(rVar);
                a2.c(rVar, new j2.e(22));
            }
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            int i11 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i12 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            boolean z11 = i1Var.f14562i;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z14 = i1Var.v;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var2 = i1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (p1Var.f14653a.f2925b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14465s = new i1(u0Var, i11, p1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14452c.a(true, true);
                        a2.h.f14597i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14597i.o(i10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14465s = new i1(u0Var, i11, p1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            i1 i1Var = a2.f14465s;
            b2.u0 u0Var = i1Var.f14557a;
            int i10 = i1Var.f14558b;
            p1 p1Var = i1Var.f14559c;
            b2.a1 a1Var = i1Var.d;
            b2.a1 a1Var2 = i1Var.e;
            int i11 = i1Var.f14560f;
            b2.v0 v0Var = i1Var.f14561g;
            int i12 = i1Var.h;
            b2.k1 k1Var = i1Var.f14563j;
            int i13 = i1Var.f14564k;
            x1 x1Var = i1Var.f14565l;
            b2.n0 n0Var = i1Var.f14566m;
            float f7 = i1Var.f14567n;
            b2.e eVar = i1Var.f14568o;
            d2.d dVar = i1Var.f14569p;
            b2.l lVar = i1Var.f14570q;
            int i14 = i1Var.f14571r;
            boolean z12 = i1Var.f14572s;
            boolean z13 = i1Var.f14573t;
            int i15 = i1Var.f14574u;
            boolean z14 = i1Var.v;
            boolean z15 = i1Var.f14575w;
            int i16 = i1Var.f14576x;
            int i17 = i1Var.f14577y;
            b2.n0 n0Var2 = i1Var.f14578z;
            long j3 = i1Var.A;
            long j10 = i1Var.B;
            long j11 = i1Var.C;
            b2.s1 s1Var = i1Var.D;
            b2.q1 q1Var2 = i1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (p1Var.f14653a.f2925b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14452c.a(true, true);
                        a2.h.f14597i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14597i.p(z10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14452c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            k1 k1Var2 = (k1) this.f14723b.get();
            if (k1Var2 == null) {
                return;
            }
            a2.f14465s = a2.f14465s.c(k1Var, k1Var2.O0(), i10);
            a2.f14452c.a(false, true);
            try {
                a2.h.f14597i.q(k1Var);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            a2.f14465s = a2.f14465s.d(q1Var);
            a2.f14452c.a(true, true);
            a2.d(new j2.e(q1Var, 23));
        }
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((k1) this.f14723b.get()) == null) {
                return;
            }
            a2.f14465s = a2.f14465s.a(s1Var);
            a2.f14452c.a(true, false);
            a2.d(new j2.e(s1Var, 21));
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
        i1 i1Var = a2.f14465s;
        b2.u0 u0Var = i1Var.f14557a;
        int i10 = i1Var.f14558b;
        p1 p1Var = i1Var.f14559c;
        b2.a1 a1Var = i1Var.d;
        b2.a1 a1Var2 = i1Var.e;
        int i11 = i1Var.f14560f;
        b2.v0 v0Var = i1Var.f14561g;
        int i12 = i1Var.h;
        boolean z11 = i1Var.f14562i;
        b2.k1 k1Var = i1Var.f14563j;
        int i13 = i1Var.f14564k;
        b2.n0 n0Var = i1Var.f14566m;
        float f7 = i1Var.f14567n;
        b2.e eVar = i1Var.f14568o;
        d2.d dVar = i1Var.f14569p;
        b2.l lVar = i1Var.f14570q;
        int i14 = i1Var.f14571r;
        boolean z12 = i1Var.f14572s;
        boolean z13 = i1Var.f14573t;
        int i15 = i1Var.f14574u;
        boolean z14 = i1Var.v;
        boolean z15 = i1Var.f14575w;
        int i16 = i1Var.f14576x;
        int i17 = i1Var.f14577y;
        b2.n0 n0Var2 = i1Var.f14578z;
        long j3 = i1Var.A;
        long j10 = i1Var.B;
        long j11 = i1Var.C;
        b2.s1 s1Var = i1Var.D;
        b2.q1 q1Var = i1Var.E;
        if (!k1Var.p() && p1Var.f14653a.f2925b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14452c.a(true, true);
        try {
            a2.h.f14597i.getClass();
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
        i1 i1Var = a2.f14465s;
        b2.u0 u0Var = i1Var.f14557a;
        int i10 = i1Var.f14558b;
        p1 p1Var = i1Var.f14559c;
        b2.a1 a1Var = i1Var.d;
        b2.a1 a1Var2 = i1Var.e;
        int i11 = i1Var.f14560f;
        b2.v0 v0Var = i1Var.f14561g;
        int i12 = i1Var.h;
        boolean z11 = i1Var.f14562i;
        b2.k1 k1Var = i1Var.f14563j;
        int i13 = i1Var.f14564k;
        x1 x1Var = i1Var.f14565l;
        b2.n0 n0Var = i1Var.f14566m;
        b2.e eVar = i1Var.f14568o;
        d2.d dVar = i1Var.f14569p;
        b2.l lVar = i1Var.f14570q;
        int i14 = i1Var.f14571r;
        boolean z12 = i1Var.f14572s;
        boolean z13 = i1Var.f14573t;
        int i15 = i1Var.f14574u;
        boolean z14 = i1Var.v;
        boolean z15 = i1Var.f14575w;
        int i16 = i1Var.f14576x;
        int i17 = i1Var.f14577y;
        b2.n0 n0Var2 = i1Var.f14578z;
        long j3 = i1Var.A;
        long j10 = i1Var.B;
        long j11 = i1Var.C;
        b2.s1 s1Var = i1Var.D;
        b2.q1 q1Var = i1Var.E;
        if (!k1Var.p() && p1Var.f14653a.f2925b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14452c.a(true, true);
        try {
            a2.h.f14597i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onCues(d2.d dVar) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((k1) this.f14723b.get()) == null) {
            return;
        }
        i1 i1Var = a2.f14465s;
        b2.u0 u0Var = i1Var.f14557a;
        int i10 = i1Var.f14558b;
        p1 p1Var = i1Var.f14559c;
        b2.a1 a1Var = i1Var.d;
        b2.a1 a1Var2 = i1Var.e;
        int i11 = i1Var.f14560f;
        b2.v0 v0Var = i1Var.f14561g;
        int i12 = i1Var.h;
        boolean z11 = i1Var.f14562i;
        b2.k1 k1Var = i1Var.f14563j;
        int i13 = i1Var.f14564k;
        x1 x1Var = i1Var.f14565l;
        b2.n0 n0Var = i1Var.f14566m;
        float f7 = i1Var.f14567n;
        b2.e eVar = i1Var.f14568o;
        b2.l lVar = i1Var.f14570q;
        int i14 = i1Var.f14571r;
        boolean z12 = i1Var.f14572s;
        boolean z13 = i1Var.f14573t;
        int i15 = i1Var.f14574u;
        boolean z14 = i1Var.v;
        boolean z15 = i1Var.f14575w;
        int i16 = i1Var.f14576x;
        int i17 = i1Var.f14577y;
        b2.n0 n0Var2 = i1Var.f14578z;
        long j3 = i1Var.A;
        long j10 = i1Var.B;
        long j11 = i1Var.C;
        b2.s1 s1Var = i1Var.D;
        b2.q1 q1Var2 = i1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (p1Var.f14653a.f2925b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f14452c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f14465s = new i1(u0Var, i10, p1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14452c.a(true, true);
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((k1) this.f14723b.get()) == null) {
            return;
        }
        i1 i1Var = a2.f14465s;
        b2.u0 u0Var = i1Var.f14557a;
        int i11 = i1Var.f14558b;
        p1 p1Var = i1Var.f14559c;
        b2.v0 v0Var = i1Var.f14561g;
        int i12 = i1Var.h;
        boolean z11 = i1Var.f14562i;
        b2.k1 k1Var = i1Var.f14563j;
        int i13 = i1Var.f14564k;
        x1 x1Var = i1Var.f14565l;
        b2.n0 n0Var = i1Var.f14566m;
        float f7 = i1Var.f14567n;
        b2.e eVar = i1Var.f14568o;
        d2.d dVar = i1Var.f14569p;
        b2.l lVar = i1Var.f14570q;
        int i14 = i1Var.f14571r;
        boolean z12 = i1Var.f14572s;
        boolean z13 = i1Var.f14573t;
        int i15 = i1Var.f14574u;
        boolean z14 = i1Var.v;
        boolean z15 = i1Var.f14575w;
        int i16 = i1Var.f14576x;
        int i17 = i1Var.f14577y;
        b2.n0 n0Var2 = i1Var.f14578z;
        long j3 = i1Var.A;
        long j10 = i1Var.B;
        long j11 = i1Var.C;
        b2.s1 s1Var = i1Var.D;
        b2.q1 q1Var2 = i1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (p1Var.f14653a.f2925b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f14465s = new i1(u0Var, i11, p1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f14452c.a(true, true);
                    l0 l0Var = (l0) a2.h.f14597i.e;
                    l0Var.N(l0Var.f14596g.f14466t);
                    return;
                }
            }
            l0 l0Var2 = (l0) a2.h.f14597i.e;
            l0Var2.N(l0Var2.f14596g.f14466t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f14465s = new i1(u0Var, i11, p1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14452c.a(true, true);
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
