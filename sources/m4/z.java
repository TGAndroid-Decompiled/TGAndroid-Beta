package m4;

import android.os.RemoteException;
import b2.q1;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class z implements b2.z0 {
    public final WeakReference f16319a;
    public final WeakReference f16320b;

    public z(b0 b0Var, g1 g1Var) {
        this.f16319a = new WeakReference(b0Var);
        this.f16320b = new WeakReference(g1Var);
    }

    public final b0 a() {
        return (b0) this.f16319a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            int i10 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f16223a.f3233b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16043c.a(true, true);
                        a2.h.f16199i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16199i.j(eVar);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f16320b.get()) == null) {
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            int i10 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i12 = e1Var.h;
            boolean z12 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z13 = e1Var.f16113s;
            boolean z14 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z15 = e1Var.v;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var = e1Var.E;
            if (!k1Var.p() && l1Var.f16223a.f3233b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
            try {
                a2.h.f16199i.getClass();
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            int i10 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i12 = e1Var.h;
            boolean z12 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z13 = e1Var.f16113s;
            boolean z14 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var = e1Var.E;
            if (!k1Var.p() && l1Var.f16223a.f3233b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f16199i.f16181e;
                l0Var.N(l0Var.f16198g.f16058t);
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f16223a.f3233b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16043c.a(true, true);
                        a2.h.f16199i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16199i.l(k0Var);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        q1 q1Var;
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            int i10 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var2 = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f16223a.f3233b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f16043c.a(true, true);
                        a2.h.f16199i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16199i.r();
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            a2.f16057s = e1Var.b(i10, e1Var.f16117x, z10);
            a2.f16043c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f16199i.f16181e;
                l0Var.N(l0Var.f16198g.f16058t);
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            int i10 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f16223a.f3233b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16043c.a(true, true);
                        l0 l0Var = (l0) a2.h.f16199i.f16181e;
                        l0Var.N(l0Var.f16198g.f16058t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                l0 l0Var2 = (l0) a2.h.f16199i.f16181e;
                l0Var2.N(l0Var2.f16198g.f16058t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            g1 g1Var = (g1) this.f16320b.get();
            if (g1Var == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 W = g1Var.W();
            int i11 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i12 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i13 = e1Var.h;
            boolean z11 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i14 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i15 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i16 = e1Var.f16115u;
            boolean z14 = e1Var.f16116w;
            int i17 = e1Var.f16117x;
            b2.n0 n0Var2 = e1Var.f16119z;
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
            if (k1Var.p() || l1Var.f16223a.f3233b < k1Var.o()) {
                z15 = true;
            }
            e2.d.g(z15);
            a2.f16057s = new e1(W, i11, l1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, dVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
            try {
                j0 j0Var = a2.h.f16199i;
                g1Var.W();
                l0 l0Var = (l0) j0Var.f16181e;
                l0Var.N(l0Var.f16198g.f16058t);
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            a2.f16057s = e1Var.b(e1Var.f16115u, i10, e1Var.f16114t);
            a2.f16043c.a(true, true);
            try {
                l0 l0Var = (l0) a2.h.f16199i.f16181e;
                l0Var.N(l0Var.f16198g.f16058t);
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            int i10 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i12 = e1Var.h;
            boolean z11 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f16223a.f3233b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16043c.a(true, true);
                        l0 l0Var = (l0) a2.h.f16199i.f16181e;
                        l0Var.N(l0Var.f16198g.f16058t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                l0 l0Var2 = (l0) a2.h.f16199i.f16181e;
                l0Var2.N(l0Var2.f16198g.f16058t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
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
        e1 e1Var = a2.f16057s;
        b2.u0 u0Var = e1Var.f16097a;
        int i10 = e1Var.f16098b;
        l1 l1Var = e1Var.f16099c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f16100e;
        int i11 = e1Var.f16101f;
        b2.v0 v0Var = e1Var.f16102g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f16103i;
        b2.k1 k1Var = e1Var.f16104j;
        int i13 = e1Var.f16105k;
        x1 x1Var = e1Var.f16106l;
        float f7 = e1Var.f16108n;
        b2.e eVar = e1Var.f16109o;
        d2.d dVar = e1Var.f16110p;
        b2.l lVar = e1Var.f16111q;
        int i14 = e1Var.f16112r;
        boolean z12 = e1Var.f16113s;
        boolean z13 = e1Var.f16114t;
        int i15 = e1Var.f16115u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f16116w;
        int i16 = e1Var.f16117x;
        int i17 = e1Var.f16118y;
        b2.n0 n0Var2 = e1Var.f16119z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var = e1Var.E;
        if (!k1Var.p() && l1Var.f16223a.f3233b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16043c.a(true, true);
        try {
            a2.h.f16199i.n(n0Var);
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
            pi.f fVar = a2.f16046g.f16069b;
            e9.i0 s10 = fVar.s();
            for (int i10 = 0; i10 < s10.size(); i10++) {
                r rVar = (r) s10.get(i10);
                fVar.v(rVar);
                a2.c(rVar, new j2.e(20));
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            int i11 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i12 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            boolean z11 = e1Var.f16103i;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f16223a.f3233b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f16057s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16043c.a(true, true);
                        a2.h.f16199i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16199i.o(i10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f16057s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        q1 q1Var;
        boolean z11;
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            e1 e1Var = a2.f16057s;
            b2.u0 u0Var = e1Var.f16097a;
            int i10 = e1Var.f16098b;
            l1 l1Var = e1Var.f16099c;
            b2.a1 a1Var = e1Var.d;
            b2.a1 a1Var2 = e1Var.f16100e;
            int i11 = e1Var.f16101f;
            b2.v0 v0Var = e1Var.f16102g;
            int i12 = e1Var.h;
            b2.k1 k1Var = e1Var.f16104j;
            int i13 = e1Var.f16105k;
            x1 x1Var = e1Var.f16106l;
            b2.n0 n0Var = e1Var.f16107m;
            float f7 = e1Var.f16108n;
            b2.e eVar = e1Var.f16109o;
            d2.d dVar = e1Var.f16110p;
            b2.l lVar = e1Var.f16111q;
            int i14 = e1Var.f16112r;
            boolean z12 = e1Var.f16113s;
            boolean z13 = e1Var.f16114t;
            int i15 = e1Var.f16115u;
            boolean z14 = e1Var.v;
            boolean z15 = e1Var.f16116w;
            int i16 = e1Var.f16117x;
            int i17 = e1Var.f16118y;
            b2.n0 n0Var2 = e1Var.f16119z;
            long j3 = e1Var.A;
            long j10 = e1Var.B;
            long j11 = e1Var.C;
            s1 s1Var = e1Var.D;
            q1 q1Var2 = e1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (l1Var.f16223a.f3233b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f16043c.a(true, true);
                        a2.h.f16199i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f16199i.p(z10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f16043c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            g1 g1Var = (g1) this.f16320b.get();
            if (g1Var == null) {
                return;
            }
            a2.f16057s = a2.f16057s.c(k1Var, g1Var.O0(), i10);
            a2.f16043c.a(false, true);
            try {
                a2.h.f16199i.q(k1Var);
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
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            a2.f16057s = a2.f16057s.d(q1Var);
            a2.f16043c.a(true, true);
            a2.d(new j2.e(q1Var, 21));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        b0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((g1) this.f16320b.get()) == null) {
                return;
            }
            a2.f16057s = a2.f16057s.a(s1Var);
            a2.f16043c.a(true, false);
            a2.d(new j2.e(s1Var, 19));
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
        e1 e1Var = a2.f16057s;
        b2.u0 u0Var = e1Var.f16097a;
        int i10 = e1Var.f16098b;
        l1 l1Var = e1Var.f16099c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f16100e;
        int i11 = e1Var.f16101f;
        b2.v0 v0Var = e1Var.f16102g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f16103i;
        b2.k1 k1Var = e1Var.f16104j;
        int i13 = e1Var.f16105k;
        b2.n0 n0Var = e1Var.f16107m;
        float f7 = e1Var.f16108n;
        b2.e eVar = e1Var.f16109o;
        d2.d dVar = e1Var.f16110p;
        b2.l lVar = e1Var.f16111q;
        int i14 = e1Var.f16112r;
        boolean z12 = e1Var.f16113s;
        boolean z13 = e1Var.f16114t;
        int i15 = e1Var.f16115u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f16116w;
        int i16 = e1Var.f16117x;
        int i17 = e1Var.f16118y;
        b2.n0 n0Var2 = e1Var.f16119z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var = e1Var.E;
        if (!k1Var.p() && l1Var.f16223a.f3233b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16043c.a(true, true);
        try {
            a2.h.f16199i.getClass();
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
        e1 e1Var = a2.f16057s;
        b2.u0 u0Var = e1Var.f16097a;
        int i10 = e1Var.f16098b;
        l1 l1Var = e1Var.f16099c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f16100e;
        int i11 = e1Var.f16101f;
        b2.v0 v0Var = e1Var.f16102g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f16103i;
        b2.k1 k1Var = e1Var.f16104j;
        int i13 = e1Var.f16105k;
        x1 x1Var = e1Var.f16106l;
        b2.n0 n0Var = e1Var.f16107m;
        b2.e eVar = e1Var.f16109o;
        d2.d dVar = e1Var.f16110p;
        b2.l lVar = e1Var.f16111q;
        int i14 = e1Var.f16112r;
        boolean z12 = e1Var.f16113s;
        boolean z13 = e1Var.f16114t;
        int i15 = e1Var.f16115u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f16116w;
        int i16 = e1Var.f16117x;
        int i17 = e1Var.f16118y;
        b2.n0 n0Var2 = e1Var.f16119z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var = e1Var.E;
        if (!k1Var.p() && l1Var.f16223a.f3233b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16043c.a(true, true);
        try {
            a2.h.f16199i.getClass();
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
        if (((g1) this.f16320b.get()) == null) {
            return;
        }
        e1 e1Var = a2.f16057s;
        b2.u0 u0Var = e1Var.f16097a;
        int i10 = e1Var.f16098b;
        l1 l1Var = e1Var.f16099c;
        b2.a1 a1Var = e1Var.d;
        b2.a1 a1Var2 = e1Var.f16100e;
        int i11 = e1Var.f16101f;
        b2.v0 v0Var = e1Var.f16102g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f16103i;
        b2.k1 k1Var = e1Var.f16104j;
        int i13 = e1Var.f16105k;
        x1 x1Var = e1Var.f16106l;
        b2.n0 n0Var = e1Var.f16107m;
        float f7 = e1Var.f16108n;
        b2.e eVar = e1Var.f16109o;
        b2.l lVar = e1Var.f16111q;
        int i14 = e1Var.f16112r;
        boolean z12 = e1Var.f16113s;
        boolean z13 = e1Var.f16114t;
        int i15 = e1Var.f16115u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f16116w;
        int i16 = e1Var.f16117x;
        int i17 = e1Var.f16118y;
        b2.n0 n0Var2 = e1Var.f16119z;
        long j3 = e1Var.A;
        long j10 = e1Var.B;
        long j11 = e1Var.C;
        s1 s1Var = e1Var.D;
        q1 q1Var2 = e1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (l1Var.f16223a.f3233b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f16043c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f16057s = new e1(u0Var, i10, l1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16043c.a(true, true);
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
        if (((g1) this.f16320b.get()) == null) {
            return;
        }
        e1 e1Var = a2.f16057s;
        b2.u0 u0Var = e1Var.f16097a;
        int i11 = e1Var.f16098b;
        l1 l1Var = e1Var.f16099c;
        b2.v0 v0Var = e1Var.f16102g;
        int i12 = e1Var.h;
        boolean z11 = e1Var.f16103i;
        b2.k1 k1Var = e1Var.f16104j;
        int i13 = e1Var.f16105k;
        x1 x1Var = e1Var.f16106l;
        b2.n0 n0Var = e1Var.f16107m;
        float f7 = e1Var.f16108n;
        b2.e eVar = e1Var.f16109o;
        d2.d dVar = e1Var.f16110p;
        b2.l lVar = e1Var.f16111q;
        int i14 = e1Var.f16112r;
        boolean z12 = e1Var.f16113s;
        boolean z13 = e1Var.f16114t;
        int i15 = e1Var.f16115u;
        boolean z14 = e1Var.v;
        boolean z15 = e1Var.f16116w;
        int i16 = e1Var.f16117x;
        int i17 = e1Var.f16118y;
        b2.n0 n0Var2 = e1Var.f16119z;
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
                if (l1Var.f16223a.f3233b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f16057s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f16043c.a(true, true);
                    l0 l0Var = (l0) a2.h.f16199i.f16181e;
                    l0Var.N(l0Var.f16198g.f16058t);
                    return;
                }
            }
            l0 l0Var2 = (l0) a2.h.f16199i.f16181e;
            l0Var2.N(l0Var2.f16198g.f16058t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f16057s = new e1(u0Var, i11, l1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, dVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f16043c.a(true, true);
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
