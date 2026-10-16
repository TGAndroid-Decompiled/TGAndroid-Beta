package m4;

import android.os.RemoteException;
import b2.b2;
import b2.w1;
import java.lang.ref.WeakReference;
import java.util.List;
import v7.u6;
public final class c0 implements b2.e1 {
    public final WeakReference f15135a;
    public final WeakReference f15136b;

    public c0(e0 e0Var, m1 m1Var) {
        this.f15135a = new WeakReference(e0Var);
        this.f15136b = new WeakReference(m1Var);
    }

    public final e0 a() {
        return (e0) this.f15135a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i10 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        p0 p0Var = (p0) a2.h.f15304i.e;
                        p0Var.f15303g.f15170t.J().getClass();
                        ((n4.n) p0Var.f15308m.f15745b).f15728a.setPlaybackToLocal(fVar.b());
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                p0 p0Var2 = (p0) a2.h.f15304i.e;
                p0Var2.f15303g.f15170t.J().getClass();
                ((n4.n) p0Var2.f15308m.f15745b).f15728a.setPlaybackToLocal(fVar.b());
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i11 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i12 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i13 = k1Var.h;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i14 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f15169s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i13, z11, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i10, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        a2.h.f15304i.getClass();
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                a2.h.f15304i.getClass();
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f15169s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i13, z11, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i10, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.c1 c1Var) {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            a2.f(c1Var);
        }
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        boolean z11;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i10 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i12 = k1Var.h;
            boolean z12 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z13 = k1Var.f15271u;
            boolean z14 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z15 = k1Var.f15273x;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var = k1Var.G;
            if (!p1Var.p() && r1Var.f15356a.f2139b >= p1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.p(z11);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z12, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z13, z14, i16, i17, i18, z15, z10, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
            try {
                a2.h.f15304i.getClass();
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
            a2.t();
        }
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        boolean z11;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i10 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i12 = k1Var.h;
            boolean z12 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z13 = k1Var.f15271u;
            boolean z14 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var = k1Var.G;
            if (!p1Var.p() && r1Var.f15356a.f2139b >= p1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.p(z11);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z12, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z13, z14, i16, i17, i18, z10, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
            try {
                p0 p0Var = (p0) a2.h.f15304i.e;
                p0Var.O(p0Var.f15303g.f15170t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
            a2.t();
        }
    }

    @Override
    public final void onMediaItemTransition(b2.p0 p0Var, int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        a2.h.f15304i.l(p0Var);
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                a2.h.f15304i.l(p0Var);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.s0 s0Var) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i10 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var2 = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var2, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        a2.h.f15304i.r();
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                a2.h.f15304i.r();
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var2, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            a2.f15169s = k1Var.b(i10, k1Var.f15275z, z10);
            a2.f15156c.a(true, true);
            try {
                p0 p0Var = (p0) a2.h.f15304i.e;
                p0Var.O(p0Var.f15303g.f15170t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackParametersChanged(b2.a1 a1Var) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i10 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        p0 p0Var = (p0) a2.h.f15304i.e;
                        p0Var.O(p0Var.f15303g.f15170t);
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                p0 p0Var2 = (p0) a2.h.f15304i.e;
                p0Var2.O(p0Var2.f15303g.f15170t);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            m1 m1Var = (m1) this.f15136b.get();
            if (m1Var == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 W = m1Var.W();
            int i11 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i12 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i13 = k1Var.h;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i14 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i15 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i16 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i17 = k1Var.f15272w;
            boolean z14 = k1Var.f15274y;
            int i18 = k1Var.f15275z;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var = k1Var.G;
            boolean z15 = false;
            if (i10 == 3 && z13 && i18 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (p1Var.p() || r1Var.f15356a.f2139b < p1Var.o()) {
                z15 = true;
            }
            u6.p(z15);
            a2.f15169s = new k1(W, i11, r1Var, f1Var, f1Var2, i12, a1Var, i13, z11, b2Var, p1Var, i14, s0Var, f7, f10, fVar, i15, cVar, qVar, i16, z12, z13, i17, i18, i10, z10, z14, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
            try {
                n0 n0Var = a2.h.f15304i;
                m1Var.W();
                p0 p0Var = (p0) n0Var.e;
                p0Var.O(p0Var.f15303g.f15170t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            a2.f15169s = k1Var.b(k1Var.f15272w, i10, k1Var.v);
            a2.f15156c.a(true, true);
            try {
                p0 p0Var = (p0) a2.h.f15304i.e;
                p0Var.O(p0Var.f15303g.f15170t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlayerError(b2.z0 z0Var) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            int i10 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        p0 p0Var = (p0) a2.h.f15304i.e;
                        p0Var.O(p0Var.f15303g.f15170t);
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                p0 p0Var2 = (p0) a2.h.f15304i.e;
                p0Var2.O(p0Var2.f15303g.f15170t);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.s0 s0Var) {
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.f15169s;
        b2.z0 z0Var = k1Var.f15254a;
        int i10 = k1Var.f15255b;
        r1 r1Var = k1Var.f15256c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f15257f;
        b2.a1 a1Var = k1Var.f15258g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f15259i;
        b2.p1 p1Var = k1Var.f15260j;
        int i13 = k1Var.f15261k;
        b2 b2Var = k1Var.f15262l;
        float f7 = k1Var.f15264n;
        float f10 = k1Var.f15265o;
        int i14 = k1Var.f15266p;
        b2.f fVar = k1Var.f15267q;
        d2.c cVar = k1Var.f15268r;
        b2.q qVar = k1Var.f15269s;
        int i15 = k1Var.f15270t;
        boolean z12 = k1Var.f15271u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f15272w;
        boolean z14 = k1Var.f15273x;
        boolean z15 = k1Var.f15274y;
        int i17 = k1Var.f15275z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        if (!p1Var.p() && r1Var.f15356a.f2139b >= p1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.f15156c.a(true, true);
        try {
            a2.h.f15304i.n(s0Var);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame() {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            pi.e eVar = a2.f15158g.f15205b;
            e9.n0 m10 = eVar.m();
            for (int i10 = 0; i10 < m10.size(); i10++) {
                v vVar = (v) m10.get(i10);
                eVar.o(vVar);
                a2.c(vVar, new k2.y0(10));
            }
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i11 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i12 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            boolean z11 = k1Var.f15259i;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f15169s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i10, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        a2.h.f15304i.o(i10);
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                a2.h.f15304i.o(i10);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f15169s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i12, a1Var, i10, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.u1 u1Var;
        boolean z11;
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f15169s;
            b2.z0 z0Var = k1Var.f15254a;
            int i10 = k1Var.f15255b;
            r1 r1Var = k1Var.f15256c;
            b2.f1 f1Var = k1Var.d;
            b2.f1 f1Var2 = k1Var.e;
            int i11 = k1Var.f15257f;
            b2.a1 a1Var = k1Var.f15258g;
            int i12 = k1Var.h;
            b2.p1 p1Var = k1Var.f15260j;
            int i13 = k1Var.f15261k;
            b2 b2Var = k1Var.f15262l;
            b2.s0 s0Var = k1Var.f15263m;
            float f7 = k1Var.f15264n;
            float f10 = k1Var.f15265o;
            int i14 = k1Var.f15266p;
            b2.f fVar = k1Var.f15267q;
            d2.c cVar = k1Var.f15268r;
            b2.q qVar = k1Var.f15269s;
            int i15 = k1Var.f15270t;
            boolean z12 = k1Var.f15271u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f15272w;
            boolean z14 = k1Var.f15273x;
            boolean z15 = k1Var.f15274y;
            int i17 = k1Var.f15275z;
            int i18 = k1Var.A;
            b2.s0 s0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            w1 w1Var = k1Var.F;
            b2.u1 u1Var2 = k1Var.G;
            try {
                if (!p1Var.p()) {
                    u1Var = u1Var2;
                    if (r1Var.f15356a.f2139b >= p1Var.o()) {
                        z11 = false;
                        u6.p(z11);
                        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                        a2.f15156c.a(true, true);
                        a2.h.f15304i.p(z10);
                        return;
                    }
                } else {
                    u1Var = u1Var2;
                }
                a2.h.f15304i.p(z10);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z11 = true;
            u6.p(z11);
            a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z10, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
            a2.f15156c.a(true, true);
        }
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            a2.d(new eh.c(i10, i11, 3));
        }
    }

    @Override
    public final void onTimelineChanged(b2.p1 p1Var, int i10) {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            m1 m1Var = (m1) this.f15136b.get();
            if (m1Var == null) {
                return;
            }
            a2.f15169s = a2.f15169s.c(p1Var, m1Var.R0(), i10);
            a2.f15156c.a(false, true);
            try {
                a2.h.f15304i.q(p1Var);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.u1 u1Var) {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            a2.f15169s = a2.f15169s.d(u1Var);
            a2.f15156c.a(true, true);
            a2.d(new k2.y0(u1Var, 11));
        }
    }

    @Override
    public final void onTracksChanged(w1 w1Var) {
        e0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f15136b.get()) == null) {
                return;
            }
            a2.f15169s = a2.f15169s.a(w1Var);
            a2.f15156c.a(true, false);
            a2.d(new k2.y0(w1Var, 9));
        }
    }

    @Override
    public final void onVideoSizeChanged(b2 b2Var) {
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.f15169s;
        b2.z0 z0Var = k1Var.f15254a;
        int i10 = k1Var.f15255b;
        r1 r1Var = k1Var.f15256c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f15257f;
        b2.a1 a1Var = k1Var.f15258g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f15259i;
        b2.p1 p1Var = k1Var.f15260j;
        int i13 = k1Var.f15261k;
        b2.s0 s0Var = k1Var.f15263m;
        float f7 = k1Var.f15264n;
        float f10 = k1Var.f15265o;
        int i14 = k1Var.f15266p;
        b2.f fVar = k1Var.f15267q;
        d2.c cVar = k1Var.f15268r;
        b2.q qVar = k1Var.f15269s;
        int i15 = k1Var.f15270t;
        boolean z12 = k1Var.f15271u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f15272w;
        boolean z14 = k1Var.f15273x;
        boolean z15 = k1Var.f15274y;
        int i17 = k1Var.f15275z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        if (!p1Var.p() && r1Var.f15356a.f2139b >= p1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.f15156c.a(true, true);
        try {
            a2.h.f15304i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onVolumeChanged(float f7) {
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.f15169s;
        b2.z0 z0Var = k1Var.f15254a;
        int i10 = k1Var.f15255b;
        r1 r1Var = k1Var.f15256c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f15257f;
        b2.a1 a1Var = k1Var.f15258g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f15259i;
        b2.p1 p1Var = k1Var.f15260j;
        int i13 = k1Var.f15261k;
        b2 b2Var = k1Var.f15262l;
        b2.s0 s0Var = k1Var.f15263m;
        float f10 = k1Var.f15264n;
        int i14 = k1Var.f15266p;
        b2.f fVar = k1Var.f15267q;
        d2.c cVar = k1Var.f15268r;
        b2.q qVar = k1Var.f15269s;
        int i15 = k1Var.f15270t;
        boolean z12 = k1Var.f15271u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f15272w;
        boolean z14 = k1Var.f15273x;
        boolean z15 = k1Var.f15274y;
        int i17 = k1Var.f15275z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var = k1Var.G;
        if (f7 != 0.0f) {
            f10 = f7;
        }
        if (!p1Var.p() && r1Var.f15356a.f2139b >= p1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.f15156c.a(true, true);
        try {
            a2.h.f15304i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onCues(d2.c cVar) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.f15136b.get()) == null) {
            return;
        }
        k1 k1Var = a2.f15169s;
        b2.z0 z0Var = k1Var.f15254a;
        int i10 = k1Var.f15255b;
        r1 r1Var = k1Var.f15256c;
        b2.f1 f1Var = k1Var.d;
        b2.f1 f1Var2 = k1Var.e;
        int i11 = k1Var.f15257f;
        b2.a1 a1Var = k1Var.f15258g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f15259i;
        b2.p1 p1Var = k1Var.f15260j;
        int i13 = k1Var.f15261k;
        b2 b2Var = k1Var.f15262l;
        b2.s0 s0Var = k1Var.f15263m;
        float f7 = k1Var.f15264n;
        float f10 = k1Var.f15265o;
        int i14 = k1Var.f15266p;
        b2.f fVar = k1Var.f15267q;
        b2.q qVar = k1Var.f15269s;
        int i15 = k1Var.f15270t;
        boolean z12 = k1Var.f15271u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f15272w;
        boolean z14 = k1Var.f15273x;
        boolean z15 = k1Var.f15274y;
        int i17 = k1Var.f15275z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        if (p1Var.p()) {
            u1Var = u1Var2;
        } else {
            u1Var = u1Var2;
            if (r1Var.f15356a.f2139b >= p1Var.o()) {
                z10 = false;
                u6.p(z10);
                a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                a2.f15156c.a(true, true);
            }
        }
        z10 = true;
        u6.p(z10);
        a2.f15169s = new k1(z0Var, i10, r1Var, f1Var, f1Var2, i11, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.f15156c.a(true, true);
    }

    @Override
    public final void onPositionDiscontinuity(b2.f1 f1Var, b2.f1 f1Var2, int i10) {
        b2.u1 u1Var;
        boolean z10;
        e0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.f15136b.get()) == null) {
            return;
        }
        k1 k1Var = a2.f15169s;
        b2.z0 z0Var = k1Var.f15254a;
        int i11 = k1Var.f15255b;
        r1 r1Var = k1Var.f15256c;
        b2.a1 a1Var = k1Var.f15258g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f15259i;
        b2.p1 p1Var = k1Var.f15260j;
        int i13 = k1Var.f15261k;
        b2 b2Var = k1Var.f15262l;
        b2.s0 s0Var = k1Var.f15263m;
        float f7 = k1Var.f15264n;
        float f10 = k1Var.f15265o;
        int i14 = k1Var.f15266p;
        b2.f fVar = k1Var.f15267q;
        d2.c cVar = k1Var.f15268r;
        b2.q qVar = k1Var.f15269s;
        int i15 = k1Var.f15270t;
        boolean z12 = k1Var.f15271u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f15272w;
        boolean z14 = k1Var.f15273x;
        boolean z15 = k1Var.f15274y;
        int i17 = k1Var.f15275z;
        int i18 = k1Var.A;
        b2.s0 s0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        w1 w1Var = k1Var.F;
        b2.u1 u1Var2 = k1Var.G;
        try {
            if (p1Var.p()) {
                u1Var = u1Var2;
            } else {
                u1Var = u1Var2;
                if (r1Var.f15356a.f2139b >= p1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.f15169s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i10, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
                    a2.f15156c.a(true, true);
                    p0 p0Var = (p0) a2.h.f15304i.e;
                    p0Var.O(p0Var.f15303g.f15170t);
                    return;
                }
            }
            p0 p0Var2 = (p0) a2.h.f15304i.e;
            p0Var2.O(p0Var2.f15303g.f15170t);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.f15169s = new k1(z0Var, i11, r1Var, f1Var, f1Var2, i10, a1Var, i12, z11, b2Var, p1Var, i13, s0Var, f7, f10, fVar, i14, cVar, qVar, i15, z12, z13, i16, i17, i18, z14, z15, s0Var2, j10, j11, j12, w1Var, u1Var);
        a2.f15156c.a(true, true);
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onMetadata(b2.u0 u0Var) {
    }

    @Override
    public final void onPlayerErrorChanged(b2.z0 z0Var) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override
    public final void onEvents(b2.g1 g1Var, b2.d1 d1Var) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
    }
}
