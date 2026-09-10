package m4;

import android.os.RemoteException;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class z implements b2.z0 {
    public final WeakReference f13564a;
    public final WeakReference f13565b;

    public z(b0 b0Var, l1 l1Var) {
        this.f13564a = new WeakReference(b0Var);
        this.f13565b = new WeakReference(l1Var);
    }

    public final b0 a() {
        return (b0) this.f13564a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            int i10 = j1Var.f13396b;
            q1 q1Var2 = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i12 = j1Var.h;
            boolean z11 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z14 = j1Var.v;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var3 = j1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var3;
                    if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f13293c.a(true, true);
                        a2.h.f13431i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var3;
                }
                a2.h.f13431i.j(eVar);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f13293c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
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
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            int i10 = j1Var.f13396b;
            q1 q1Var = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i12 = j1Var.h;
            boolean z12 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z13 = j1Var.f13410s;
            boolean z14 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z15 = j1Var.v;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var2 = j1Var.E;
            if (!k1Var.p() && q1Var.f13491a.f1623b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f13306s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var2);
            a2.f13293c.a(true, true);
            try {
                a2.h.f13431i.getClass();
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            int i10 = j1Var.f13396b;
            q1 q1Var = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i12 = j1Var.h;
            boolean z12 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z13 = j1Var.f13410s;
            boolean z14 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var2 = j1Var.E;
            if (!k1Var.p() && q1Var.f13491a.f1623b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f13306s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var2);
            a2.f13293c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f13431i.e;
                l0Var.N(l0Var.f13430g.f13307t);
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
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            q1 q1Var2 = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i12 = j1Var.h;
            boolean z11 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z14 = j1Var.v;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var3 = j1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var3;
                    if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f13293c.a(true, true);
                        a2.h.f13431i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var3;
                }
                a2.h.f13431i.l(k0Var);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f13293c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            int i10 = j1Var.f13396b;
            q1 q1Var2 = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i12 = j1Var.h;
            boolean z11 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var2 = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z14 = j1Var.v;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var3 = j1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var3;
                    if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f13293c.a(true, true);
                        a2.h.f13431i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var3;
                }
                a2.h.f13431i.r();
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f13293c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            a2.f13306s = j1Var.b(i10, j1Var.f13414x, z10);
            a2.f13293c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f13431i.e;
                l0Var.N(l0Var.f13430g.f13307t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            int i10 = j1Var.f13396b;
            q1 q1Var2 = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            int i12 = j1Var.h;
            boolean z11 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z14 = j1Var.v;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var3 = j1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var3;
                    if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f13293c.a(true, true);
                        l0 l0Var = (l0) a2.h.f13431i.e;
                        l0Var.N(l0Var.f13430g.f13307t);
                        return;
                    }
                } else {
                    q1Var = q1Var3;
                }
                l0 l0Var2 = (l0) a2.h.f13431i.e;
                l0Var2.N(l0Var2.f13430g.f13307t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f13293c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            l1 l1Var = (l1) this.f13565b.get();
            if (l1Var == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 W = l1Var.W();
            int i11 = j1Var.f13396b;
            q1 q1Var = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i12 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i13 = j1Var.h;
            boolean z11 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i14 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i15 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i16 = j1Var.f13412u;
            boolean z14 = j1Var.f13413w;
            int i17 = j1Var.f13414x;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var2 = j1Var.E;
            boolean z15 = false;
            if (i10 == 3 && z13 && i17 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g((k1Var.p() || q1Var.f13491a.f1623b < k1Var.o()) ? true : true);
            a2.f13306s = new j1(W, i11, q1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, cVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var2);
            a2.f13293c.a(true, true);
            try {
                j0 j0Var = a2.h.f13431i;
                l1Var.W();
                l0 l0Var = (l0) j0Var.e;
                l0Var.N(l0Var.f13430g.f13307t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            a2.f13306s = j1Var.b(j1Var.f13412u, i10, j1Var.f13411t);
            a2.f13293c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f13431i.e;
                l0Var.N(l0Var.f13430g.f13307t);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            int i10 = j1Var.f13396b;
            q1 q1Var2 = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i12 = j1Var.h;
            boolean z11 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z14 = j1Var.v;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var3 = j1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var3;
                    if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f13293c.a(true, true);
                        l0 l0Var = (l0) a2.h.f13431i.e;
                        l0Var.N(l0Var.f13430g.f13307t);
                        return;
                    }
                } else {
                    q1Var = q1Var3;
                }
                l0 l0Var2 = (l0) a2.h.f13431i.e;
                l0Var2.N(l0Var2.f13430g.f13307t);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f13293c.a(true, true);
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
        j1 j1Var = a2.f13306s;
        b2.u0 u0Var = j1Var.f13395a;
        int i10 = j1Var.f13396b;
        q1 q1Var = j1Var.f13397c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f13398f;
        b2.v0 v0Var = j1Var.f13399g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.f13400i;
        b2.k1 k1Var = j1Var.f13401j;
        int i13 = j1Var.f13402k;
        x1 x1Var = j1Var.f13403l;
        float f7 = j1Var.f13405n;
        b2.e eVar = j1Var.f13406o;
        d2.c cVar = j1Var.f13407p;
        b2.l lVar = j1Var.f13408q;
        int i14 = j1Var.f13409r;
        boolean z12 = j1Var.f13410s;
        boolean z13 = j1Var.f13411t;
        int i15 = j1Var.f13412u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.f13413w;
        int i16 = j1Var.f13414x;
        int i17 = j1Var.f13415y;
        b2.n0 n0Var2 = j1Var.f13416z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        if (!k1Var.p() && q1Var.f13491a.f1623b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f13306s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var2);
        a2.f13293c.a(true, true);
        try {
            a2.h.f13431i.n(n0Var);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            ki.f fVar = a2.f13295g.f13376b;
            e9.i0 r10 = fVar.r();
            for (int i10 = 0; i10 < r10.size(); i10++) {
                r rVar = (r) r10.get(i10);
                fVar.u(rVar);
                a2.c(rVar, new j2.h(14));
            }
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            int i11 = j1Var.f13396b;
            q1 q1Var2 = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i12 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            boolean z11 = j1Var.f13400i;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z14 = j1Var.v;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var3 = j1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var3;
                    if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f13306s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f13293c.a(true, true);
                        a2.h.f13431i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var3;
                }
                a2.h.f13431i.o(i10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f13306s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f13293c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.q1 q1Var;
        boolean z11;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            j1 j1Var = a2.f13306s;
            b2.u0 u0Var = j1Var.f13395a;
            int i10 = j1Var.f13396b;
            q1 q1Var2 = j1Var.f13397c;
            b2.a1 a1Var = j1Var.d;
            b2.a1 a1Var2 = j1Var.e;
            int i11 = j1Var.f13398f;
            b2.v0 v0Var = j1Var.f13399g;
            int i12 = j1Var.h;
            b2.k1 k1Var = j1Var.f13401j;
            int i13 = j1Var.f13402k;
            x1 x1Var = j1Var.f13403l;
            b2.n0 n0Var = j1Var.f13404m;
            float f7 = j1Var.f13405n;
            b2.e eVar = j1Var.f13406o;
            d2.c cVar = j1Var.f13407p;
            b2.l lVar = j1Var.f13408q;
            int i14 = j1Var.f13409r;
            boolean z12 = j1Var.f13410s;
            boolean z13 = j1Var.f13411t;
            int i15 = j1Var.f13412u;
            boolean z14 = j1Var.v;
            boolean z15 = j1Var.f13413w;
            int i16 = j1Var.f13414x;
            int i17 = j1Var.f13415y;
            b2.n0 n0Var2 = j1Var.f13416z;
            long j3 = j1Var.A;
            long j10 = j1Var.B;
            long j11 = j1Var.C;
            b2.s1 s1Var = j1Var.D;
            b2.q1 q1Var3 = j1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var3;
                    if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f13293c.a(true, true);
                        a2.h.f13431i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var3;
                }
                a2.h.f13431i.p(z10);
                return;
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f13293c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            l1 l1Var = (l1) this.f13565b.get();
            if (l1Var == null) {
                return;
            }
            a2.f13306s = a2.f13306s.c(k1Var, l1Var.O0(), i10);
            a2.f13293c.a(false, true);
            try {
                a2.h.f13431i.q(k1Var);
            } catch (RemoteException e) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            a2.f13306s = a2.f13306s.d(q1Var);
            a2.f13293c.a(true, true);
            a2.d(new j2.h(q1Var, 15));
        }
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((l1) this.f13565b.get()) == null) {
                return;
            }
            a2.f13306s = a2.f13306s.a(s1Var);
            a2.f13293c.a(true, false);
            a2.d(new j2.h(s1Var, 13));
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
        j1 j1Var = a2.f13306s;
        b2.u0 u0Var = j1Var.f13395a;
        int i10 = j1Var.f13396b;
        q1 q1Var = j1Var.f13397c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f13398f;
        b2.v0 v0Var = j1Var.f13399g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.f13400i;
        b2.k1 k1Var = j1Var.f13401j;
        int i13 = j1Var.f13402k;
        b2.n0 n0Var = j1Var.f13404m;
        float f7 = j1Var.f13405n;
        b2.e eVar = j1Var.f13406o;
        d2.c cVar = j1Var.f13407p;
        b2.l lVar = j1Var.f13408q;
        int i14 = j1Var.f13409r;
        boolean z12 = j1Var.f13410s;
        boolean z13 = j1Var.f13411t;
        int i15 = j1Var.f13412u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.f13413w;
        int i16 = j1Var.f13414x;
        int i17 = j1Var.f13415y;
        b2.n0 n0Var2 = j1Var.f13416z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        if (!k1Var.p() && q1Var.f13491a.f1623b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f13306s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var2);
        a2.f13293c.a(true, true);
        try {
            a2.h.f13431i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
        j1 j1Var = a2.f13306s;
        b2.u0 u0Var = j1Var.f13395a;
        int i10 = j1Var.f13396b;
        q1 q1Var = j1Var.f13397c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f13398f;
        b2.v0 v0Var = j1Var.f13399g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.f13400i;
        b2.k1 k1Var = j1Var.f13401j;
        int i13 = j1Var.f13402k;
        x1 x1Var = j1Var.f13403l;
        b2.n0 n0Var = j1Var.f13404m;
        b2.e eVar = j1Var.f13406o;
        d2.c cVar = j1Var.f13407p;
        b2.l lVar = j1Var.f13408q;
        int i14 = j1Var.f13409r;
        boolean z12 = j1Var.f13410s;
        boolean z13 = j1Var.f13411t;
        int i15 = j1Var.f13412u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.f13413w;
        int i16 = j1Var.f13414x;
        int i17 = j1Var.f13415y;
        b2.n0 n0Var2 = j1Var.f13416z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var2 = j1Var.E;
        if (!k1Var.p() && q1Var.f13491a.f1623b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f13306s = new j1(u0Var, i10, q1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var2);
        a2.f13293c.a(true, true);
        try {
            a2.h.f13431i.getClass();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onCues(d2.c cVar) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.f13565b.get()) == null) {
            return;
        }
        j1 j1Var = a2.f13306s;
        b2.u0 u0Var = j1Var.f13395a;
        int i10 = j1Var.f13396b;
        q1 q1Var2 = j1Var.f13397c;
        b2.a1 a1Var = j1Var.d;
        b2.a1 a1Var2 = j1Var.e;
        int i11 = j1Var.f13398f;
        b2.v0 v0Var = j1Var.f13399g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.f13400i;
        b2.k1 k1Var = j1Var.f13401j;
        int i13 = j1Var.f13402k;
        x1 x1Var = j1Var.f13403l;
        b2.n0 n0Var = j1Var.f13404m;
        float f7 = j1Var.f13405n;
        b2.e eVar = j1Var.f13406o;
        b2.l lVar = j1Var.f13408q;
        int i14 = j1Var.f13409r;
        boolean z12 = j1Var.f13410s;
        boolean z13 = j1Var.f13411t;
        int i15 = j1Var.f13412u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.f13413w;
        int i16 = j1Var.f13414x;
        int i17 = j1Var.f13415y;
        b2.n0 n0Var2 = j1Var.f13416z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var3;
        } else {
            q1Var = q1Var3;
            if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f13293c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f13306s = new j1(u0Var, i10, q1Var2, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f13293c.a(true, true);
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        b2.q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((l1) this.f13565b.get()) == null) {
            return;
        }
        j1 j1Var = a2.f13306s;
        b2.u0 u0Var = j1Var.f13395a;
        int i11 = j1Var.f13396b;
        q1 q1Var2 = j1Var.f13397c;
        b2.v0 v0Var = j1Var.f13399g;
        int i12 = j1Var.h;
        boolean z11 = j1Var.f13400i;
        b2.k1 k1Var = j1Var.f13401j;
        int i13 = j1Var.f13402k;
        x1 x1Var = j1Var.f13403l;
        b2.n0 n0Var = j1Var.f13404m;
        float f7 = j1Var.f13405n;
        b2.e eVar = j1Var.f13406o;
        d2.c cVar = j1Var.f13407p;
        b2.l lVar = j1Var.f13408q;
        int i14 = j1Var.f13409r;
        boolean z12 = j1Var.f13410s;
        boolean z13 = j1Var.f13411t;
        int i15 = j1Var.f13412u;
        boolean z14 = j1Var.v;
        boolean z15 = j1Var.f13413w;
        int i16 = j1Var.f13414x;
        int i17 = j1Var.f13415y;
        b2.n0 n0Var2 = j1Var.f13416z;
        long j3 = j1Var.A;
        long j10 = j1Var.B;
        long j11 = j1Var.C;
        b2.s1 s1Var = j1Var.D;
        b2.q1 q1Var3 = j1Var.E;
        try {
            if (k1Var.p()) {
                q1Var = q1Var3;
            } else {
                q1Var = q1Var3;
                if (q1Var2.f13491a.f1623b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f13306s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f13293c.a(true, true);
                    l0 l0Var = (l0) a2.h.f13431i.e;
                    l0Var.N(l0Var.f13430g.f13307t);
                    return;
                }
            }
            l0 l0Var2 = (l0) a2.h.f13431i.e;
            l0Var2.N(l0Var2.f13430g.f13307t);
            return;
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f13306s = new j1(u0Var, i11, q1Var2, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f13293c.a(true, true);
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
