package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class y implements b2.z0 {
    public final WeakReference f16311a;
    public final WeakReference f16312b;

    public y(a0 a0Var, e1 e1Var) {
        this.f16311a = new WeakReference(a0Var);
        this.f16312b = new WeakReference(e1Var);
    }

    public final a0 a() {
        return (a0) this.f16311a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            int i10 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16197a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16037c.a(true, true);
                        a2.h.f16209i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16209i.j(eVar);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16312b.get()) == null) {
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            int i10 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i12 = c1Var.h;
            boolean z12 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z13 = c1Var.f16101s;
            boolean z14 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z15 = c1Var.v;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var = c1Var.E;
            if (!k1Var.p() && j1Var.f16197a.f3154b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
            try {
                a2.h.f16209i.getClass();
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            int i10 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i12 = c1Var.h;
            boolean z12 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z13 = c1Var.f16101s;
            boolean z14 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var = c1Var.E;
            if (!k1Var.p() && j1Var.f16197a.f3154b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f16209i.f16180e;
                k0Var.N(k0Var.f16208g.f16052t);
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16197a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16037c.a(true, true);
                        a2.h.f16209i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16209i.l(k0Var);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            int i10 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var2 = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16197a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f16037c.a(true, true);
                        a2.h.f16209i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16209i.r();
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            a2.f16051s = c1Var.b(i10, c1Var.f16105x, z10);
            a2.f16037c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f16209i.f16180e;
                k0Var.N(k0Var.f16208g.f16052t);
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            int i10 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16197a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16037c.a(true, true);
                        k0 k0Var = (k0) a2.h.f16209i.f16180e;
                        k0Var.N(k0Var.f16208g.f16052t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f16209i.f16180e;
                k0Var2.N(k0Var2.f16208g.f16052t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            e1 e1Var = (e1) this.f16312b.get();
            if (e1Var == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 W = e1Var.W();
            int i11 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i12 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i13 = c1Var.h;
            boolean z11 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i14 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i15 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i16 = c1Var.f16103u;
            boolean z14 = c1Var.f16104w;
            int i17 = c1Var.f16105x;
            b2.n0 n0Var2 = c1Var.f16107z;
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
            e2.d.g((k1Var.p() || j1Var.f16197a.f3154b < k1Var.o()) ? true : true);
            a2.f16051s = new c1(W, i11, j1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
            try {
                i0 i0Var = a2.h.f16209i;
                e1Var.W();
                k0 k0Var = (k0) i0Var.f16180e;
                k0Var.N(k0Var.f16208g.f16052t);
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            a2.f16051s = c1Var.b(c1Var.f16103u, i10, c1Var.f16102t);
            a2.f16037c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f16209i.f16180e;
                k0Var.N(k0Var.f16208g.f16052t);
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            int i10 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i12 = c1Var.h;
            boolean z11 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16197a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16037c.a(true, true);
                        k0 k0Var = (k0) a2.h.f16209i.f16180e;
                        k0Var.N(k0Var.f16208g.f16052t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f16209i.f16180e;
                k0Var2.N(k0Var2.f16208g.f16052t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
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
        c1 c1Var = a2.f16051s;
        b2.u0 u0Var = c1Var.f16085a;
        int i10 = c1Var.f16086b;
        j1 j1Var = c1Var.f16087c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16088e;
        int i11 = c1Var.f16089f;
        b2.v0 v0Var = c1Var.f16090g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16091i;
        b2.k1 k1Var = c1Var.f16092j;
        int i13 = c1Var.f16093k;
        x1 x1Var = c1Var.f16094l;
        float f7 = c1Var.f16096n;
        b2.e eVar = c1Var.f16097o;
        d2.d dVar = c1Var.f16098p;
        b2.l lVar = c1Var.f16099q;
        int i14 = c1Var.f16100r;
        boolean z12 = c1Var.f16101s;
        boolean z13 = c1Var.f16102t;
        int i15 = c1Var.f16103u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16104w;
        int i16 = c1Var.f16105x;
        int i17 = c1Var.f16106y;
        b2.n0 n0Var2 = c1Var.f16107z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f16197a.f3154b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16037c.a(true, true);
        try {
            a2.h.f16209i.n(n0Var);
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
            qi.f fVar = a2.f16040g.f16059b;
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            int i11 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i12 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            boolean z11 = c1Var.f16091i;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16197a.f3154b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16051s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16037c.a(true, true);
                        a2.h.f16209i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16209i.o(i10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16051s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            c1 c1Var = a2.f16051s;
            b2.u0 u0Var = c1Var.f16085a;
            int i10 = c1Var.f16086b;
            j1 j1Var = c1Var.f16087c;
            b2.a1 a1Var = c1Var.d;
            b2.a1 a1Var2 = c1Var.f16088e;
            int i11 = c1Var.f16089f;
            b2.v0 v0Var = c1Var.f16090g;
            int i12 = c1Var.h;
            b2.k1 k1Var = c1Var.f16092j;
            int i13 = c1Var.f16093k;
            x1 x1Var = c1Var.f16094l;
            b2.n0 n0Var = c1Var.f16095m;
            float f7 = c1Var.f16096n;
            b2.e eVar = c1Var.f16097o;
            d2.d dVar = c1Var.f16098p;
            b2.l lVar = c1Var.f16099q;
            int i14 = c1Var.f16100r;
            boolean z12 = c1Var.f16101s;
            boolean z13 = c1Var.f16102t;
            int i15 = c1Var.f16103u;
            boolean z14 = c1Var.v;
            boolean z15 = c1Var.f16104w;
            int i16 = c1Var.f16105x;
            int i17 = c1Var.f16106y;
            b2.n0 n0Var2 = c1Var.f16107z;
            long j3 = c1Var.A;
            long j10 = c1Var.B;
            long j11 = c1Var.C;
            s1 s1Var = c1Var.D;
            q1 q1Var2 = c1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (j1Var.f16197a.f3154b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16037c.a(true, true);
                        a2.h.f16209i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16209i.p(z10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16037c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            e1 e1Var = (e1) this.f16312b.get();
            if (e1Var == null) {
                return;
            }
            a2.f16051s = a2.f16051s.c(k1Var, e1Var.O0(), i10);
            a2.f16037c.a(false, true);
            try {
                a2.h.f16209i.q(k1Var);
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
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            a2.f16051s = a2.f16051s.d(q1Var);
            a2.f16037c.a(true, true);
            a2.d(new j2.e(q1Var, 25));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((e1) this.f16312b.get()) == null) {
                return;
            }
            a2.f16051s = a2.f16051s.a(s1Var);
            a2.f16037c.a(true, false);
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
        c1 c1Var = a2.f16051s;
        b2.u0 u0Var = c1Var.f16085a;
        int i10 = c1Var.f16086b;
        j1 j1Var = c1Var.f16087c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16088e;
        int i11 = c1Var.f16089f;
        b2.v0 v0Var = c1Var.f16090g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16091i;
        b2.k1 k1Var = c1Var.f16092j;
        int i13 = c1Var.f16093k;
        b2.n0 n0Var = c1Var.f16095m;
        float f7 = c1Var.f16096n;
        b2.e eVar = c1Var.f16097o;
        d2.d dVar = c1Var.f16098p;
        b2.l lVar = c1Var.f16099q;
        int i14 = c1Var.f16100r;
        boolean z12 = c1Var.f16101s;
        boolean z13 = c1Var.f16102t;
        int i15 = c1Var.f16103u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16104w;
        int i16 = c1Var.f16105x;
        int i17 = c1Var.f16106y;
        b2.n0 n0Var2 = c1Var.f16107z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f16197a.f3154b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16037c.a(true, true);
        try {
            a2.h.f16209i.getClass();
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
        c1 c1Var = a2.f16051s;
        b2.u0 u0Var = c1Var.f16085a;
        int i10 = c1Var.f16086b;
        j1 j1Var = c1Var.f16087c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16088e;
        int i11 = c1Var.f16089f;
        b2.v0 v0Var = c1Var.f16090g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16091i;
        b2.k1 k1Var = c1Var.f16092j;
        int i13 = c1Var.f16093k;
        x1 x1Var = c1Var.f16094l;
        b2.n0 n0Var = c1Var.f16095m;
        b2.e eVar = c1Var.f16097o;
        d2.d dVar = c1Var.f16098p;
        b2.l lVar = c1Var.f16099q;
        int i14 = c1Var.f16100r;
        boolean z12 = c1Var.f16101s;
        boolean z13 = c1Var.f16102t;
        int i15 = c1Var.f16103u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16104w;
        int i16 = c1Var.f16105x;
        int i17 = c1Var.f16106y;
        b2.n0 n0Var2 = c1Var.f16107z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var = c1Var.E;
        if (!k1Var.p() && j1Var.f16197a.f3154b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16037c.a(true, true);
        try {
            a2.h.f16209i.getClass();
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
        if (((e1) this.f16312b.get()) == null) {
            return;
        }
        c1 c1Var = a2.f16051s;
        b2.u0 u0Var = c1Var.f16085a;
        int i10 = c1Var.f16086b;
        j1 j1Var = c1Var.f16087c;
        b2.a1 a1Var = c1Var.d;
        b2.a1 a1Var2 = c1Var.f16088e;
        int i11 = c1Var.f16089f;
        b2.v0 v0Var = c1Var.f16090g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16091i;
        b2.k1 k1Var = c1Var.f16092j;
        int i13 = c1Var.f16093k;
        x1 x1Var = c1Var.f16094l;
        b2.n0 n0Var = c1Var.f16095m;
        float f7 = c1Var.f16096n;
        b2.e eVar = c1Var.f16097o;
        b2.l lVar = c1Var.f16099q;
        int i14 = c1Var.f16100r;
        boolean z12 = c1Var.f16101s;
        boolean z13 = c1Var.f16102t;
        int i15 = c1Var.f16103u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16104w;
        int i16 = c1Var.f16105x;
        int i17 = c1Var.f16106y;
        b2.n0 n0Var2 = c1Var.f16107z;
        long j3 = c1Var.A;
        long j10 = c1Var.B;
        long j11 = c1Var.C;
        s1 s1Var = c1Var.D;
        q1 q1Var2 = c1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (j1Var.f16197a.f3154b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f16037c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f16051s = new c1(u0Var, i10, j1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16037c.a(true, true);
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
        if (((e1) this.f16312b.get()) == null) {
            return;
        }
        c1 c1Var = a2.f16051s;
        b2.u0 u0Var = c1Var.f16085a;
        int i11 = c1Var.f16086b;
        j1 j1Var = c1Var.f16087c;
        b2.v0 v0Var = c1Var.f16090g;
        int i12 = c1Var.h;
        boolean z11 = c1Var.f16091i;
        b2.k1 k1Var = c1Var.f16092j;
        int i13 = c1Var.f16093k;
        x1 x1Var = c1Var.f16094l;
        b2.n0 n0Var = c1Var.f16095m;
        float f7 = c1Var.f16096n;
        b2.e eVar = c1Var.f16097o;
        d2.d dVar = c1Var.f16098p;
        b2.l lVar = c1Var.f16099q;
        int i14 = c1Var.f16100r;
        boolean z12 = c1Var.f16101s;
        boolean z13 = c1Var.f16102t;
        int i15 = c1Var.f16103u;
        boolean z14 = c1Var.v;
        boolean z15 = c1Var.f16104w;
        int i16 = c1Var.f16105x;
        int i17 = c1Var.f16106y;
        b2.n0 n0Var2 = c1Var.f16107z;
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
                if (j1Var.f16197a.f3154b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f16051s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f16037c.a(true, true);
                    k0 k0Var = (k0) a2.h.f16209i.f16180e;
                    k0Var.N(k0Var.f16208g.f16052t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.f16209i.f16180e;
            k0Var2.N(k0Var2.f16208g.f16052t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f16051s = new c1(u0Var, i11, j1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16037c.a(true, true);
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
