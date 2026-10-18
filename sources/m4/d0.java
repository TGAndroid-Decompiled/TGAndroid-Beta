package m4;

import android.os.RemoteException;
import b2.a2;
import b2.v1;
import java.lang.ref.WeakReference;
import java.util.List;
import v7.u6;
public final class d0 implements b2.d1 {
    public final WeakReference f16508a;
    public final WeakReference f16509b;

    public d0(f0 f0Var, m1 m1Var) {
        this.f16508a = new WeakReference(f0Var);
        this.f16509b = new WeakReference(m1Var);
    }

    public final f0 a() {
        return (f0) this.f16508a.get();
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i10 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        p0 p0Var = (p0) a2.h.f16661i.e;
                        p0Var.f16660g.f16533t.J().getClass();
                        ((n4.n) p0Var.f16665m.f17124b).f17107a.setPlaybackToLocal(fVar.b());
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                p0 p0Var2 = (p0) a2.h.f16661i.e;
                p0Var2.f16660g.f16533t.J().getClass();
                ((n4.n) p0Var2.f16665m.f17124b).f17107a.setPlaybackToLocal(fVar.b());
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i11 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i12 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i13 = k1Var.h;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i14 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f16532s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i13, z11, a2Var, o1Var, i14, r0Var, f7, f10, fVar, i10, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        a2.h.f16661i.getClass();
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                a2.h.f16661i.getClass();
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f16532s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i13, z11, a2Var, o1Var, i14, r0Var, f7, f10, fVar, i10, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onAvailableCommandsChanged(b2.b1 b1Var) {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            a2.f(b1Var);
        }
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        boolean z11;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i10 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i12 = k1Var.h;
            boolean z12 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z13 = k1Var.f16628u;
            boolean z14 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z15 = k1Var.f16630x;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var = k1Var.G;
            if (!o1Var.p() && r1Var.f16713a.f3736b >= o1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.p(z11);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z12, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z13, z14, i16, i17, i18, z15, z10, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
            try {
                a2.h.f16661i.getClass();
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
            a2.t();
        }
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        boolean z11;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i10 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i12 = k1Var.h;
            boolean z12 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z13 = k1Var.f16628u;
            boolean z14 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var = k1Var.G;
            if (!o1Var.p() && r1Var.f16713a.f3736b >= o1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.p(z11);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z12, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z13, z14, i16, i17, i18, z10, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
            try {
                p0 p0Var = (p0) a2.h.f16661i.e;
                p0Var.O(p0Var.f16660g.f16533t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
            a2.t();
        }
    }

    @Override
    public final void onMediaItemTransition(b2.o0 o0Var, int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        a2.h.f16661i.l(o0Var);
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                a2.h.f16661i.l(o0Var);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onMediaMetadataChanged(b2.r0 r0Var) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i10 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var2 = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var2, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        a2.h.f16661i.r();
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                a2.h.f16661i.r();
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var2, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            a2.f16532s = k1Var.b(i10, k1Var.f16632z, z10);
            a2.f16519c.a(true, true);
            try {
                p0 p0Var = (p0) a2.h.f16661i.e;
                p0Var.O(p0Var.f16660g.f16533t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackParametersChanged(b2.z0 z0Var) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i10 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        p0 p0Var = (p0) a2.h.f16661i.e;
                        p0Var.O(p0Var.f16660g.f16533t);
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                p0 p0Var2 = (p0) a2.h.f16661i.e;
                p0Var2.O(p0Var2.f16660g.f16533t);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            m1 m1Var = (m1) this.f16509b.get();
            if (m1Var == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 W = m1Var.W();
            int i11 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i12 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i13 = k1Var.h;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i14 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i15 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i16 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i17 = k1Var.f16629w;
            boolean z14 = k1Var.f16631y;
            int i18 = k1Var.f16632z;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var = k1Var.G;
            boolean z15 = false;
            if (i10 == 3 && z13 && i18 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (o1Var.p() || r1Var.f16713a.f3736b < o1Var.o()) {
                z15 = true;
            }
            u6.p(z15);
            a2.f16532s = new k1(W, i11, r1Var, e1Var, e1Var2, i12, z0Var, i13, z11, a2Var, o1Var, i14, r0Var, f7, f10, fVar, i15, cVar, pVar, i16, z12, z13, i17, i18, i10, z10, z14, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
            try {
                n0 n0Var = a2.h.f16661i;
                m1Var.W();
                p0 p0Var = (p0) n0Var.e;
                p0Var.O(p0Var.f16660g.f16533t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            a2.f16532s = k1Var.b(k1Var.f16629w, i10, k1Var.v);
            a2.f16519c.a(true, true);
            try {
                p0 p0Var = (p0) a2.h.f16661i.e;
                p0Var.O(p0Var.f16660g.f16533t);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onPlayerError(b2.y0 y0Var) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            int i10 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i12 = k1Var.h;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        p0 p0Var = (p0) a2.h.f16661i.e;
                        p0Var.O(p0Var.f16660g.f16533t);
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                p0 p0Var2 = (p0) a2.h.f16661i.e;
                p0Var2.O(p0Var2.f16660g.f16533t);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.r0 r0Var) {
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.f16532s;
        b2.y0 y0Var = k1Var.f16611a;
        int i10 = k1Var.f16612b;
        r1 r1Var = k1Var.f16613c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f16614f;
        b2.z0 z0Var = k1Var.f16615g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f16616i;
        b2.o1 o1Var = k1Var.f16617j;
        int i13 = k1Var.f16618k;
        a2 a2Var = k1Var.f16619l;
        float f7 = k1Var.f16621n;
        float f10 = k1Var.f16622o;
        int i14 = k1Var.f16623p;
        b2.f fVar = k1Var.f16624q;
        d2.c cVar = k1Var.f16625r;
        b2.p pVar = k1Var.f16626s;
        int i15 = k1Var.f16627t;
        boolean z12 = k1Var.f16628u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f16629w;
        boolean z14 = k1Var.f16630x;
        boolean z15 = k1Var.f16631y;
        int i17 = k1Var.f16632z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        if (!o1Var.p() && r1Var.f16713a.f3736b >= o1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.f16519c.a(true, true);
        try {
            a2.h.f16661i.n(r0Var);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame() {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            qi.e eVar = a2.f16521g.f16563b;
            e9.n0 p5 = eVar.p();
            for (int i10 = 0; i10 < p5.size(); i10++) {
                v vVar = (v) p5.get(i10);
                eVar.r(vVar);
                a2.c(vVar, new k2.f0(10));
            }
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i11 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i12 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            boolean z11 = k1Var.f16616i;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z10 = false;
                        u6.p(z10);
                        a2.f16532s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i10, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        a2.h.f16661i.o(i10);
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                a2.h.f16661i.o(i10);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z10 = true;
            u6.p(z10);
            a2.f16532s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i12, z0Var, i10, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b2.t1 t1Var;
        boolean z11;
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            k1 k1Var = a2.f16532s;
            b2.y0 y0Var = k1Var.f16611a;
            int i10 = k1Var.f16612b;
            r1 r1Var = k1Var.f16613c;
            b2.e1 e1Var = k1Var.d;
            b2.e1 e1Var2 = k1Var.e;
            int i11 = k1Var.f16614f;
            b2.z0 z0Var = k1Var.f16615g;
            int i12 = k1Var.h;
            b2.o1 o1Var = k1Var.f16617j;
            int i13 = k1Var.f16618k;
            a2 a2Var = k1Var.f16619l;
            b2.r0 r0Var = k1Var.f16620m;
            float f7 = k1Var.f16621n;
            float f10 = k1Var.f16622o;
            int i14 = k1Var.f16623p;
            b2.f fVar = k1Var.f16624q;
            d2.c cVar = k1Var.f16625r;
            b2.p pVar = k1Var.f16626s;
            int i15 = k1Var.f16627t;
            boolean z12 = k1Var.f16628u;
            boolean z13 = k1Var.v;
            int i16 = k1Var.f16629w;
            boolean z14 = k1Var.f16630x;
            boolean z15 = k1Var.f16631y;
            int i17 = k1Var.f16632z;
            int i18 = k1Var.A;
            b2.r0 r0Var2 = k1Var.B;
            long j10 = k1Var.C;
            long j11 = k1Var.D;
            long j12 = k1Var.E;
            v1 v1Var = k1Var.F;
            b2.t1 t1Var2 = k1Var.G;
            try {
                if (!o1Var.p()) {
                    t1Var = t1Var2;
                    if (r1Var.f16713a.f3736b >= o1Var.o()) {
                        z11 = false;
                        u6.p(z11);
                        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z10, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                        a2.f16519c.a(true, true);
                        a2.h.f16661i.p(z10);
                        return;
                    }
                } else {
                    t1Var = t1Var2;
                }
                a2.h.f16661i.p(z10);
                return;
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                return;
            }
            z11 = true;
            u6.p(z11);
            a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z10, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
            a2.f16519c.a(true, true);
        }
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            a2.d(new eh.c(i10, i11, 3));
        }
    }

    @Override
    public final void onTimelineChanged(b2.o1 o1Var, int i10) {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            m1 m1Var = (m1) this.f16509b.get();
            if (m1Var == null) {
                return;
            }
            a2.f16532s = a2.f16532s.c(o1Var, m1Var.R0(), i10);
            a2.f16519c.a(false, true);
            try {
                a2.h.f16661i.q(o1Var);
            } catch (RemoteException e) {
                e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.t1 t1Var) {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            a2.f16532s = a2.f16532s.d(t1Var);
            a2.f16519c.a(true, true);
            a2.d(new k2.f0(t1Var, 11));
        }
    }

    @Override
    public final void onTracksChanged(v1 v1Var) {
        f0 a2 = a();
        if (a2 != null) {
            a2.v();
            if (((m1) this.f16509b.get()) == null) {
                return;
            }
            a2.f16532s = a2.f16532s.a(v1Var);
            a2.f16519c.a(true, false);
            a2.d(new k2.f0(v1Var, 9));
        }
    }

    @Override
    public final void onVideoSizeChanged(a2 a2Var) {
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.f16532s;
        b2.y0 y0Var = k1Var.f16611a;
        int i10 = k1Var.f16612b;
        r1 r1Var = k1Var.f16613c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f16614f;
        b2.z0 z0Var = k1Var.f16615g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f16616i;
        b2.o1 o1Var = k1Var.f16617j;
        int i13 = k1Var.f16618k;
        b2.r0 r0Var = k1Var.f16620m;
        float f7 = k1Var.f16621n;
        float f10 = k1Var.f16622o;
        int i14 = k1Var.f16623p;
        b2.f fVar = k1Var.f16624q;
        d2.c cVar = k1Var.f16625r;
        b2.p pVar = k1Var.f16626s;
        int i15 = k1Var.f16627t;
        boolean z12 = k1Var.f16628u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f16629w;
        boolean z14 = k1Var.f16630x;
        boolean z15 = k1Var.f16631y;
        int i17 = k1Var.f16632z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        if (!o1Var.p() && r1Var.f16713a.f3736b >= o1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.f16519c.a(true, true);
        try {
            a2.h.f16661i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onVolumeChanged(float f7) {
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        k1 k1Var = a2.f16532s;
        b2.y0 y0Var = k1Var.f16611a;
        int i10 = k1Var.f16612b;
        r1 r1Var = k1Var.f16613c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f16614f;
        b2.z0 z0Var = k1Var.f16615g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f16616i;
        b2.o1 o1Var = k1Var.f16617j;
        int i13 = k1Var.f16618k;
        a2 a2Var = k1Var.f16619l;
        b2.r0 r0Var = k1Var.f16620m;
        float f10 = k1Var.f16621n;
        int i14 = k1Var.f16623p;
        b2.f fVar = k1Var.f16624q;
        d2.c cVar = k1Var.f16625r;
        b2.p pVar = k1Var.f16626s;
        int i15 = k1Var.f16627t;
        boolean z12 = k1Var.f16628u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f16629w;
        boolean z14 = k1Var.f16630x;
        boolean z15 = k1Var.f16631y;
        int i17 = k1Var.f16632z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var = k1Var.G;
        if (f7 != 0.0f) {
            f10 = f7;
        }
        if (!o1Var.p() && r1Var.f16713a.f3736b >= o1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.f16519c.a(true, true);
        try {
            a2.h.f16661i.getClass();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override
    public final void onCues(d2.c cVar) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.f16509b.get()) == null) {
            return;
        }
        k1 k1Var = a2.f16532s;
        b2.y0 y0Var = k1Var.f16611a;
        int i10 = k1Var.f16612b;
        r1 r1Var = k1Var.f16613c;
        b2.e1 e1Var = k1Var.d;
        b2.e1 e1Var2 = k1Var.e;
        int i11 = k1Var.f16614f;
        b2.z0 z0Var = k1Var.f16615g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f16616i;
        b2.o1 o1Var = k1Var.f16617j;
        int i13 = k1Var.f16618k;
        a2 a2Var = k1Var.f16619l;
        b2.r0 r0Var = k1Var.f16620m;
        float f7 = k1Var.f16621n;
        float f10 = k1Var.f16622o;
        int i14 = k1Var.f16623p;
        b2.f fVar = k1Var.f16624q;
        b2.p pVar = k1Var.f16626s;
        int i15 = k1Var.f16627t;
        boolean z12 = k1Var.f16628u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f16629w;
        boolean z14 = k1Var.f16630x;
        boolean z15 = k1Var.f16631y;
        int i17 = k1Var.f16632z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        if (o1Var.p()) {
            t1Var = t1Var2;
        } else {
            t1Var = t1Var2;
            if (r1Var.f16713a.f3736b >= o1Var.o()) {
                z10 = false;
                u6.p(z10);
                a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                a2.f16519c.a(true, true);
            }
        }
        z10 = true;
        u6.p(z10);
        a2.f16532s = new k1(y0Var, i10, r1Var, e1Var, e1Var2, i11, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.f16519c.a(true, true);
    }

    @Override
    public final void onPositionDiscontinuity(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
        b2.t1 t1Var;
        boolean z10;
        f0 a2 = a();
        if (a2 == null) {
            return;
        }
        a2.v();
        if (((m1) this.f16509b.get()) == null) {
            return;
        }
        k1 k1Var = a2.f16532s;
        b2.y0 y0Var = k1Var.f16611a;
        int i11 = k1Var.f16612b;
        r1 r1Var = k1Var.f16613c;
        b2.z0 z0Var = k1Var.f16615g;
        int i12 = k1Var.h;
        boolean z11 = k1Var.f16616i;
        b2.o1 o1Var = k1Var.f16617j;
        int i13 = k1Var.f16618k;
        a2 a2Var = k1Var.f16619l;
        b2.r0 r0Var = k1Var.f16620m;
        float f7 = k1Var.f16621n;
        float f10 = k1Var.f16622o;
        int i14 = k1Var.f16623p;
        b2.f fVar = k1Var.f16624q;
        d2.c cVar = k1Var.f16625r;
        b2.p pVar = k1Var.f16626s;
        int i15 = k1Var.f16627t;
        boolean z12 = k1Var.f16628u;
        boolean z13 = k1Var.v;
        int i16 = k1Var.f16629w;
        boolean z14 = k1Var.f16630x;
        boolean z15 = k1Var.f16631y;
        int i17 = k1Var.f16632z;
        int i18 = k1Var.A;
        b2.r0 r0Var2 = k1Var.B;
        long j10 = k1Var.C;
        long j11 = k1Var.D;
        long j12 = k1Var.E;
        v1 v1Var = k1Var.F;
        b2.t1 t1Var2 = k1Var.G;
        try {
            if (o1Var.p()) {
                t1Var = t1Var2;
            } else {
                t1Var = t1Var2;
                if (r1Var.f16713a.f3736b >= o1Var.o()) {
                    z10 = false;
                    u6.p(z10);
                    a2.f16532s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i10, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
                    a2.f16519c.a(true, true);
                    p0 p0Var = (p0) a2.h.f16661i.e;
                    p0Var.O(p0Var.f16660g.f16533t);
                    return;
                }
            }
            p0 p0Var2 = (p0) a2.h.f16661i.e;
            p0Var2.O(p0Var2.f16660g.f16533t);
            return;
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z10 = true;
        u6.p(z10);
        a2.f16532s = new k1(y0Var, i11, r1Var, e1Var, e1Var2, i10, z0Var, i12, z11, a2Var, o1Var, i13, r0Var, f7, f10, fVar, i14, cVar, pVar, i15, z12, z13, i16, i17, i18, z14, z15, r0Var2, j10, j11, j12, v1Var, t1Var);
        a2.f16519c.a(true, true);
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onMetadata(b2.t0 t0Var) {
    }

    @Override
    public final void onPlayerErrorChanged(b2.y0 y0Var) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override
    public final void onEvents(b2.f1 f1Var, b2.c1 c1Var) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
    }
}
