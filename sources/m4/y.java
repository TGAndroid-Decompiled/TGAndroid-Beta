package m4;

import android.os.RemoteException;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class y implements b2.z0 {
    public final WeakReference f14939a;
    public final WeakReference f14940b;

    public y(a0 a0Var, j1 j1Var) {
        this.f14939a = new WeakReference(a0Var);
        this.f14940b = new WeakReference(j1Var);
    }

    public final a0 a() {
        return (a0) this.f14939a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            int i10 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f14864a.f2930b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14673c.a(true, true);
                        a2.h.f14807i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14807i.j(eVar);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f14940b.get()) == null) {
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            int i10 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i12 = h1Var.h;
            boolean z12 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z13 = h1Var.f14787s;
            boolean z14 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z15 = h1Var.v;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var = h1Var.E;
            if (!k1Var.p() && o1Var.f14864a.f2930b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
            try {
                a2.h.f14807i.getClass();
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            int i10 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i12 = h1Var.h;
            boolean z12 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z13 = h1Var.f14787s;
            boolean z14 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var = h1Var.E;
            if (!k1Var.p() && o1Var.f14864a.f2930b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f14807i.e;
                k0Var.N(k0Var.f14806g.f14687t);
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f14864a.f2930b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14673c.a(true, true);
                        a2.h.f14807i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14807i.l(k0Var);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            int i10 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var2 = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f14864a.f2930b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f14673c.a(true, true);
                        a2.h.f14807i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14807i.r();
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            a2.f14686s = h1Var.b(i10, h1Var.f14791x, z10);
            a2.f14673c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f14807i.e;
                k0Var.N(k0Var.f14806g.f14687t);
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            int i10 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f14864a.f2930b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14673c.a(true, true);
                        k0 k0Var = (k0) a2.h.f14807i.e;
                        k0Var.N(k0Var.f14806g.f14687t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f14807i.e;
                k0Var2.N(k0Var2.f14806g.f14687t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            j1 j1Var = (j1) this.f14940b.get();
            if (j1Var == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 W = j1Var.W();
            int i11 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i12 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i13 = h1Var.h;
            boolean z11 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i14 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i15 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i16 = h1Var.f14789u;
            boolean z14 = h1Var.f14790w;
            int i17 = h1Var.f14791x;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var = h1Var.E;
            boolean z15 = false;
            if (i10 == 3 && z13 && i17 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g((k1Var.p() || o1Var.f14864a.f2930b < k1Var.o()) ? true : true);
            a2.f14686s = new h1(W, i11, o1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
            try {
                i0 i0Var = a2.h.f14807i;
                j1Var.W();
                k0 k0Var = (k0) i0Var.e;
                k0Var.N(k0Var.f14806g.f14687t);
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            a2.f14686s = h1Var.b(h1Var.f14789u, i10, h1Var.f14788t);
            a2.f14673c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f14807i.e;
                k0Var.N(k0Var.f14806g.f14687t);
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            int i10 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f14864a.f2930b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14673c.a(true, true);
                        k0 k0Var = (k0) a2.h.f14807i.e;
                        k0Var.N(k0Var.f14806g.f14687t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f14807i.e;
                k0Var2.N(k0Var2.f14806g.f14687t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
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
        h1 h1Var = a2.f14686s;
        b2.u0 u0Var = h1Var.f14772a;
        int i10 = h1Var.f14773b;
        o1 o1Var = h1Var.f14774c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f14775f;
        b2.v0 v0Var = h1Var.f14776g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f14777i;
        b2.k1 k1Var = h1Var.f14778j;
        int i13 = h1Var.f14779k;
        x1 x1Var = h1Var.f14780l;
        float f7 = h1Var.f14782n;
        b2.e eVar = h1Var.f14783o;
        d2.d dVar = h1Var.f14784p;
        b2.l lVar = h1Var.f14785q;
        int i14 = h1Var.f14786r;
        boolean z12 = h1Var.f14787s;
        boolean z13 = h1Var.f14788t;
        int i15 = h1Var.f14789u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f14790w;
        int i16 = h1Var.f14791x;
        int i17 = h1Var.f14792y;
        b2.n0 n0Var2 = h1Var.f14793z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        if (!k1Var.p() && o1Var.f14864a.f2930b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14673c.a(true, true);
        try {
            a2.h.f14807i.n(n0Var);
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
            oi.f fVar = a2.f14675g.f14732b;
            e9.i0 s10 = fVar.s();
            for (int i10 = 0; i10 < s10.size(); i10++) {
                r rVar = (r) s10.get(i10);
                fVar.v(rVar);
                a2.c(rVar, new j2.e(26));
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            int i11 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i12 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            boolean z11 = h1Var.f14777i;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f14864a.f2930b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f14686s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14673c.a(true, true);
                        a2.h.f14807i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14807i.o(i10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f14686s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f14686s;
            b2.u0 u0Var = h1Var.f14772a;
            int i10 = h1Var.f14773b;
            o1 o1Var = h1Var.f14774c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.e;
            int i11 = h1Var.f14775f;
            b2.v0 v0Var = h1Var.f14776g;
            int i12 = h1Var.h;
            b2.k1 k1Var = h1Var.f14778j;
            int i13 = h1Var.f14779k;
            x1 x1Var = h1Var.f14780l;
            b2.n0 n0Var = h1Var.f14781m;
            float f7 = h1Var.f14782n;
            b2.e eVar = h1Var.f14783o;
            d2.d dVar = h1Var.f14784p;
            b2.l lVar = h1Var.f14785q;
            int i14 = h1Var.f14786r;
            boolean z12 = h1Var.f14787s;
            boolean z13 = h1Var.f14788t;
            int i15 = h1Var.f14789u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f14790w;
            int i16 = h1Var.f14791x;
            int i17 = h1Var.f14792y;
            b2.n0 n0Var2 = h1Var.f14793z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f14864a.f2930b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f14673c.a(true, true);
                        a2.h.f14807i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f14807i.p(z10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f14673c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            j1 j1Var = (j1) this.f14940b.get();
            if (j1Var == null) {
                return;
            }
            a2.f14686s = a2.f14686s.c(k1Var, j1Var.O0(), i10);
            a2.f14673c.a(false, true);
            try {
                a2.h.f14807i.q(k1Var);
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
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            a2.f14686s = a2.f14686s.d(q1Var);
            a2.f14673c.a(true, true);
            a2.d(new j2.e(q1Var, 27));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f14940b.get()) == null) {
                return;
            }
            a2.f14686s = a2.f14686s.a(s1Var);
            a2.f14673c.a(true, false);
            a2.d(new j2.e(s1Var, 25));
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
        h1 h1Var = a2.f14686s;
        b2.u0 u0Var = h1Var.f14772a;
        int i10 = h1Var.f14773b;
        o1 o1Var = h1Var.f14774c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f14775f;
        b2.v0 v0Var = h1Var.f14776g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f14777i;
        b2.k1 k1Var = h1Var.f14778j;
        int i13 = h1Var.f14779k;
        b2.n0 n0Var = h1Var.f14781m;
        float f7 = h1Var.f14782n;
        b2.e eVar = h1Var.f14783o;
        d2.d dVar = h1Var.f14784p;
        b2.l lVar = h1Var.f14785q;
        int i14 = h1Var.f14786r;
        boolean z12 = h1Var.f14787s;
        boolean z13 = h1Var.f14788t;
        int i15 = h1Var.f14789u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f14790w;
        int i16 = h1Var.f14791x;
        int i17 = h1Var.f14792y;
        b2.n0 n0Var2 = h1Var.f14793z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        if (!k1Var.p() && o1Var.f14864a.f2930b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14673c.a(true, true);
        try {
            a2.h.f14807i.getClass();
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
        h1 h1Var = a2.f14686s;
        b2.u0 u0Var = h1Var.f14772a;
        int i10 = h1Var.f14773b;
        o1 o1Var = h1Var.f14774c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f14775f;
        b2.v0 v0Var = h1Var.f14776g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f14777i;
        b2.k1 k1Var = h1Var.f14778j;
        int i13 = h1Var.f14779k;
        x1 x1Var = h1Var.f14780l;
        b2.n0 n0Var = h1Var.f14781m;
        b2.e eVar = h1Var.f14783o;
        d2.d dVar = h1Var.f14784p;
        b2.l lVar = h1Var.f14785q;
        int i14 = h1Var.f14786r;
        boolean z12 = h1Var.f14787s;
        boolean z13 = h1Var.f14788t;
        int i15 = h1Var.f14789u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f14790w;
        int i16 = h1Var.f14791x;
        int i17 = h1Var.f14792y;
        b2.n0 n0Var2 = h1Var.f14793z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        if (!k1Var.p() && o1Var.f14864a.f2930b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14673c.a(true, true);
        try {
            a2.h.f14807i.getClass();
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
        if (((j1) this.f14940b.get()) == null) {
            return;
        }
        h1 h1Var = a2.f14686s;
        b2.u0 u0Var = h1Var.f14772a;
        int i10 = h1Var.f14773b;
        o1 o1Var = h1Var.f14774c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.e;
        int i11 = h1Var.f14775f;
        b2.v0 v0Var = h1Var.f14776g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f14777i;
        b2.k1 k1Var = h1Var.f14778j;
        int i13 = h1Var.f14779k;
        x1 x1Var = h1Var.f14780l;
        b2.n0 n0Var = h1Var.f14781m;
        float f7 = h1Var.f14782n;
        b2.e eVar = h1Var.f14783o;
        b2.l lVar = h1Var.f14785q;
        int i14 = h1Var.f14786r;
        boolean z12 = h1Var.f14787s;
        boolean z13 = h1Var.f14788t;
        int i15 = h1Var.f14789u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f14790w;
        int i16 = h1Var.f14791x;
        int i17 = h1Var.f14792y;
        b2.n0 n0Var2 = h1Var.f14793z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (o1Var.f14864a.f2930b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f14673c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f14686s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14673c.a(true, true);
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
        if (((j1) this.f14940b.get()) == null) {
            return;
        }
        h1 h1Var = a2.f14686s;
        b2.u0 u0Var = h1Var.f14772a;
        int i11 = h1Var.f14773b;
        o1 o1Var = h1Var.f14774c;
        b2.v0 v0Var = h1Var.f14776g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f14777i;
        b2.k1 k1Var = h1Var.f14778j;
        int i13 = h1Var.f14779k;
        x1 x1Var = h1Var.f14780l;
        b2.n0 n0Var = h1Var.f14781m;
        float f7 = h1Var.f14782n;
        b2.e eVar = h1Var.f14783o;
        d2.d dVar = h1Var.f14784p;
        b2.l lVar = h1Var.f14785q;
        int i14 = h1Var.f14786r;
        boolean z12 = h1Var.f14787s;
        boolean z13 = h1Var.f14788t;
        int i15 = h1Var.f14789u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f14790w;
        int i16 = h1Var.f14791x;
        int i17 = h1Var.f14792y;
        b2.n0 n0Var2 = h1Var.f14793z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var2;
            } else {
                q1Var = q1Var2;
                if (o1Var.f14864a.f2930b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f14686s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f14673c.a(true, true);
                    k0 k0Var = (k0) a2.h.f14807i.e;
                    k0Var.N(k0Var.f14806g.f14687t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.f14807i.e;
            k0Var2.N(k0Var2.f14806g.f14687t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f14686s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f14673c.a(true, true);
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
