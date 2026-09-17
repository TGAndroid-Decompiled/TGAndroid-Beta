package m4;

import android.os.RemoteException;
import b2.s1;
import b2.x1;
import java.lang.ref.WeakReference;
import java.util.List;
public final class y implements b2.z0 {
    public final WeakReference f16112a;
    public final WeakReference f16113b;

    public y(a0 a0Var, j1 j1Var) {
        this.f16112a = new WeakReference(a0Var);
        this.f16113b = new WeakReference(j1Var);
    }

    public final a0 a() {
        return (a0) this.f16112a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            int i10 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f16031a.f1960b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15828c.a(true, true);
                        a2.h.f15971i.j(eVar);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15971i.j(eVar);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f16113b.get()) == null) {
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
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            int i10 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i12 = h1Var.h;
            boolean z12 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z13 = h1Var.f15949s;
            boolean z14 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z15 = h1Var.v;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var = h1Var.E;
            if (!k1Var.p() && o1Var.f16031a.f1960b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z13, z14, i15, i16, i17, z15, z10, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
            try {
                a2.h.f15971i.getClass();
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
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            int i10 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i12 = h1Var.h;
            boolean z12 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z13 = h1Var.f15949s;
            boolean z14 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var = h1Var.E;
            if (!k1Var.p() && o1Var.f16031a.f1960b >= k1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.g(z11);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z12, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z13, z14, i15, i16, i17, z10, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f15971i.f15959e;
                k0Var.N(k0Var.f15970g.f15843t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
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
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f16031a.f1960b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15828c.a(true, true);
                        a2.h.f15971i.l(k0Var);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15971i.l(k0Var);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            int i10 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var2 = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f16031a.f1960b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
                        a2.f15828c.a(true, true);
                        a2.h.f15971i.r();
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15971i.r();
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var2, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            a2.f15842s = h1Var.b(i10, h1Var.f15953x, z10);
            a2.f15828c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f15971i.f15959e;
                k0Var.N(k0Var.f15970g.f15843t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
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
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            int i10 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f16031a.f1960b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15828c.a(true, true);
                        k0 k0Var = (k0) a2.h.f15971i.f15959e;
                        k0Var.N(k0Var.f15970g.f15843t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f15971i.f15959e;
                k0Var2.N(k0Var2.f15970g.f15843t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            j1 j1Var = (j1) this.f16113b.get();
            if (j1Var == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 W = j1Var.W();
            int i11 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i12 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i13 = h1Var.h;
            boolean z11 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i14 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i15 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i16 = h1Var.f15951u;
            boolean z14 = h1Var.f15952w;
            int i17 = h1Var.f15953x;
            b2.n0 n0Var2 = h1Var.f15955z;
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
            e2.d.g((k1Var.p() || o1Var.f16031a.f1960b < k1Var.o()) ? true : true);
            a2.f15842s = new h1(W, i11, o1Var, a1Var, a1Var2, i12, v0Var, i13, z11, x1Var, k1Var, i14, n0Var, f7, eVar, cVar, lVar, i15, z12, z13, i16, i17, i10, z10, z14, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
            try {
                i0 i0Var = a2.h.f15971i;
                j1Var.W();
                k0 k0Var = (k0) i0Var.f15959e;
                k0Var.N(k0Var.f15970g.f15843t);
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
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            a2.f15842s = h1Var.b(h1Var.f15951u, i10, h1Var.f15950t);
            a2.f15828c.a(true, true);
            try {
                k0 k0Var = (k0) a2.h.f15971i.f15959e;
                k0Var.N(k0Var.f15970g.f15843t);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
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
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            int i10 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i12 = h1Var.h;
            boolean z11 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f16031a.f1960b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15828c.a(true, true);
                        k0 k0Var = (k0) a2.h.f15971i.f15959e;
                        k0Var.N(k0Var.f15970g.f15843t);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                k0 k0Var2 = (k0) a2.h.f15971i.f15959e;
                k0Var2.N(k0Var2.f15970g.f15843t);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
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
        h1 h1Var = a2.f15842s;
        b2.u0 u0Var = h1Var.f15933a;
        int i10 = h1Var.f15934b;
        o1 o1Var = h1Var.f15935c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.f15936e;
        int i11 = h1Var.f15937f;
        b2.v0 v0Var = h1Var.f15938g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f15939i;
        b2.k1 k1Var = h1Var.f15940j;
        int i13 = h1Var.f15941k;
        x1 x1Var = h1Var.f15942l;
        float f7 = h1Var.f15944n;
        b2.e eVar = h1Var.f15945o;
        d2.c cVar = h1Var.f15946p;
        b2.l lVar = h1Var.f15947q;
        int i14 = h1Var.f15948r;
        boolean z12 = h1Var.f15949s;
        boolean z13 = h1Var.f15950t;
        int i15 = h1Var.f15951u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f15952w;
        int i16 = h1Var.f15953x;
        int i17 = h1Var.f15954y;
        b2.n0 n0Var2 = h1Var.f15955z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        if (!k1Var.p() && o1Var.f16031a.f1960b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15828c.a(true, true);
        try {
            a2.h.f15971i.n(n0Var);
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
            fg.f fVar = a2.f15831g.f15891b;
            e9.i0 t10 = fVar.t();
            for (int i10 = 0; i10 < t10.size(); i10++) {
                r rVar = (r) t10.get(i10);
                fVar.w(rVar);
                a2.c(rVar, new j2.e(21));
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
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            int i11 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i12 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            boolean z11 = h1Var.f15939i;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f16031a.f1960b >= k1Var.o()) {
                        z10 = false;
                        e2.d.g(z10);
                        a2.f15842s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15828c.a(true, true);
                        a2.h.f15971i.o(i10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15971i.o(i10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z10 = true;
            e2.d.g(z10);
            a2.f15842s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i12, v0Var, i10, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.q1 q1Var;
        boolean z11;
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            h1 h1Var = a2.f15842s;
            b2.u0 u0Var = h1Var.f15933a;
            int i10 = h1Var.f15934b;
            o1 o1Var = h1Var.f15935c;
            b2.a1 a1Var = h1Var.d;
            b2.a1 a1Var2 = h1Var.f15936e;
            int i11 = h1Var.f15937f;
            b2.v0 v0Var = h1Var.f15938g;
            int i12 = h1Var.h;
            b2.k1 k1Var = h1Var.f15940j;
            int i13 = h1Var.f15941k;
            x1 x1Var = h1Var.f15942l;
            b2.n0 n0Var = h1Var.f15943m;
            float f7 = h1Var.f15944n;
            b2.e eVar = h1Var.f15945o;
            d2.c cVar = h1Var.f15946p;
            b2.l lVar = h1Var.f15947q;
            int i14 = h1Var.f15948r;
            boolean z12 = h1Var.f15949s;
            boolean z13 = h1Var.f15950t;
            int i15 = h1Var.f15951u;
            boolean z14 = h1Var.v;
            boolean z15 = h1Var.f15952w;
            int i16 = h1Var.f15953x;
            int i17 = h1Var.f15954y;
            b2.n0 n0Var2 = h1Var.f15955z;
            long j3 = h1Var.A;
            long j10 = h1Var.B;
            long j11 = h1Var.C;
            s1 s1Var = h1Var.D;
            b2.q1 q1Var2 = h1Var.E;
            try {
                if (!k1Var.p()) {
                    q1Var = q1Var2;
                    if (o1Var.f16031a.f1960b >= k1Var.o()) {
                        z11 = false;
                        e2.d.g(z11);
                        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                        a2.f15828c.a(true, true);
                        a2.h.f15971i.p(z10);
                        return;
                    }
                } else {
                    q1Var = q1Var2;
                }
                a2.h.f15971i.p(z10);
                return;
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                return;
            }
            z11 = true;
            e2.d.g(z11);
            a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z10, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
            a2.f15828c.a(true, true);
        }
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            j1 j1Var = (j1) this.f16113b.get();
            if (j1Var == null) {
                return;
            }
            a2.f15842s = a2.f15842s.c(k1Var, j1Var.O0(), i10);
            a2.f15828c.a(false, true);
            try {
                a2.h.f15971i.q(k1Var);
            } catch (RemoteException e7) {
                e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            a2.f15842s = a2.f15842s.d(q1Var);
            a2.f15828c.a(true, true);
            a2.d(new j2.e(q1Var, 22));
        }
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        a0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((j1) this.f16113b.get()) == null) {
                return;
            }
            a2.f15842s = a2.f15842s.a(s1Var);
            a2.f15828c.a(true, false);
            a2.d(new j2.e(s1Var, 20));
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
        h1 h1Var = a2.f15842s;
        b2.u0 u0Var = h1Var.f15933a;
        int i10 = h1Var.f15934b;
        o1 o1Var = h1Var.f15935c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.f15936e;
        int i11 = h1Var.f15937f;
        b2.v0 v0Var = h1Var.f15938g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f15939i;
        b2.k1 k1Var = h1Var.f15940j;
        int i13 = h1Var.f15941k;
        b2.n0 n0Var = h1Var.f15943m;
        float f7 = h1Var.f15944n;
        b2.e eVar = h1Var.f15945o;
        d2.c cVar = h1Var.f15946p;
        b2.l lVar = h1Var.f15947q;
        int i14 = h1Var.f15948r;
        boolean z12 = h1Var.f15949s;
        boolean z13 = h1Var.f15950t;
        int i15 = h1Var.f15951u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f15952w;
        int i16 = h1Var.f15953x;
        int i17 = h1Var.f15954y;
        b2.n0 n0Var2 = h1Var.f15955z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        if (!k1Var.p() && o1Var.f16031a.f1960b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15828c.a(true, true);
        try {
            a2.h.f15971i.getClass();
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
        h1 h1Var = a2.f15842s;
        b2.u0 u0Var = h1Var.f15933a;
        int i10 = h1Var.f15934b;
        o1 o1Var = h1Var.f15935c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.f15936e;
        int i11 = h1Var.f15937f;
        b2.v0 v0Var = h1Var.f15938g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f15939i;
        b2.k1 k1Var = h1Var.f15940j;
        int i13 = h1Var.f15941k;
        x1 x1Var = h1Var.f15942l;
        b2.n0 n0Var = h1Var.f15943m;
        b2.e eVar = h1Var.f15945o;
        d2.c cVar = h1Var.f15946p;
        b2.l lVar = h1Var.f15947q;
        int i14 = h1Var.f15948r;
        boolean z12 = h1Var.f15949s;
        boolean z13 = h1Var.f15950t;
        int i15 = h1Var.f15951u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f15952w;
        int i16 = h1Var.f15953x;
        int i17 = h1Var.f15954y;
        b2.n0 n0Var2 = h1Var.f15955z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var = h1Var.E;
        if (!k1Var.p() && o1Var.f16031a.f1960b >= k1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15828c.a(true, true);
        try {
            a2.h.f15971i.getClass();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    @Override
    public final void onCues(d2.c cVar) {
        b2.q1 q1Var;
        boolean z10;
        a0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((j1) this.f16113b.get()) == null) {
            return;
        }
        h1 h1Var = a2.f15842s;
        b2.u0 u0Var = h1Var.f15933a;
        int i10 = h1Var.f15934b;
        o1 o1Var = h1Var.f15935c;
        b2.a1 a1Var = h1Var.d;
        b2.a1 a1Var2 = h1Var.f15936e;
        int i11 = h1Var.f15937f;
        b2.v0 v0Var = h1Var.f15938g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f15939i;
        b2.k1 k1Var = h1Var.f15940j;
        int i13 = h1Var.f15941k;
        x1 x1Var = h1Var.f15942l;
        b2.n0 n0Var = h1Var.f15943m;
        float f7 = h1Var.f15944n;
        b2.e eVar = h1Var.f15945o;
        b2.l lVar = h1Var.f15947q;
        int i14 = h1Var.f15948r;
        boolean z12 = h1Var.f15949s;
        boolean z13 = h1Var.f15950t;
        int i15 = h1Var.f15951u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f15952w;
        int i16 = h1Var.f15953x;
        int i17 = h1Var.f15954y;
        b2.n0 n0Var2 = h1Var.f15955z;
        long j3 = h1Var.A;
        long j10 = h1Var.B;
        long j11 = h1Var.C;
        s1 s1Var = h1Var.D;
        b2.q1 q1Var2 = h1Var.E;
        if (k1Var.p()) {
            q1Var = q1Var2;
        } else {
            q1Var = q1Var2;
            if (o1Var.f16031a.f1960b >= k1Var.o()) {
                z10 = false;
                e2.d.g(z10);
                a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                a2.f15828c.a(true, true);
            }
        }
        z10 = true;
        e2.d.g(z10);
        a2.f15842s = new h1(u0Var, i10, o1Var, a1Var, a1Var2, i11, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15828c.a(true, true);
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
        if (((j1) this.f16113b.get()) == null) {
            return;
        }
        h1 h1Var = a2.f15842s;
        b2.u0 u0Var = h1Var.f15933a;
        int i11 = h1Var.f15934b;
        o1 o1Var = h1Var.f15935c;
        b2.v0 v0Var = h1Var.f15938g;
        int i12 = h1Var.h;
        boolean z11 = h1Var.f15939i;
        b2.k1 k1Var = h1Var.f15940j;
        int i13 = h1Var.f15941k;
        x1 x1Var = h1Var.f15942l;
        b2.n0 n0Var = h1Var.f15943m;
        float f7 = h1Var.f15944n;
        b2.e eVar = h1Var.f15945o;
        d2.c cVar = h1Var.f15946p;
        b2.l lVar = h1Var.f15947q;
        int i14 = h1Var.f15948r;
        boolean z12 = h1Var.f15949s;
        boolean z13 = h1Var.f15950t;
        int i15 = h1Var.f15951u;
        boolean z14 = h1Var.v;
        boolean z15 = h1Var.f15952w;
        int i16 = h1Var.f15953x;
        int i17 = h1Var.f15954y;
        b2.n0 n0Var2 = h1Var.f15955z;
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
                if (o1Var.f16031a.f1960b >= k1Var.o()) {
                    z10 = false;
                    e2.d.g(z10);
                    a2.f15842s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
                    a2.f15828c.a(true, true);
                    k0 k0Var = (k0) a2.h.f15971i.f15959e;
                    k0Var.N(k0Var.f15970g.f15843t);
                    return;
                }
            }
            k0 k0Var2 = (k0) a2.h.f15971i.f15959e;
            k0Var2.N(k0Var2.f15970g.f15843t);
            return;
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
            return;
        }
        z10 = true;
        e2.d.g(z10);
        a2.f15842s = new h1(u0Var, i11, o1Var, a1Var, a1Var2, i10, v0Var, i12, z11, x1Var, k1Var, i13, n0Var, f7, eVar, cVar, lVar, i14, z12, z13, i15, i16, i17, z14, z15, n0Var2, j3, j10, j11, s1Var, q1Var);
        a2.f15828c.a(true, true);
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
