package e2;

import android.os.Handler;
import b2.a2;
import b2.b1;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.o1;
import b2.r0;
import b2.t1;
import b2.v1;
import b2.y0;
import b2.z0;
import java.util.List;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.l60;
import si.t0;
public final class z implements d1 {
    public final int f8299a;
    public final Object f8300b;

    public z(Object obj, int i10) {
        this.f8299a = i10;
        this.f8300b = obj;
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        int i11 = this.f8299a;
    }

    @Override
    public final void onAvailableCommandsChanged(b1 b1Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onCues(d2.c cVar) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onEvents(f1 f1Var, c1 c1Var) {
        switch (this.f8299a) {
            case 0:
                e0 e0Var = (e0) this.f8300b;
                e0Var.f8220g.a();
                e0Var.h.a();
                e0Var.f8221i.a();
                e0Var.f8222j.a();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        switch (this.f8299a) {
            case 0:
            case 1:
                return;
            case 2:
                ri.p pVar = (ri.p) this.f8300b;
                ri.g gVar = pVar.e;
                ri.e eVar = pVar.E;
                Handler handler = pVar.h;
                if (pVar.f45870u != z10) {
                    pVar.f45870u = z10;
                    handler.removeCallbacks(eVar);
                    if (z10) {
                        handler.post(eVar);
                    }
                    gVar.onPreviewPlaybackChanged(z10);
                    gVar.onStateChanged(pVar.e());
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) this.f8300b;
                if (t0Var.W == 5) {
                    t0Var.x(z10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onMediaItemTransition(b2.o0 o0Var, int i10) {
        int i11 = this.f8299a;
    }

    @Override
    public final void onMediaMetadataChanged(r0 r0Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onMetadata(b2.t0 t0Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        int i11 = this.f8299a;
    }

    @Override
    public final void onPlaybackParametersChanged(z0 z0Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        i2.g0 g0Var;
        i2.g0 g0Var2;
        switch (this.f8299a) {
            case 0:
            case 1:
                return;
            case 2:
                ri.p pVar = (ri.p) this.f8300b;
                if (i10 == 4 && pVar.f45862m == ri.n.e && (g0Var = pVar.A) != null) {
                    g0Var.Z0(5, pVar.f45867r);
                    pVar.A.e();
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) this.f8300b;
                si.o oVar = t0Var.f46795m;
                oVar.b("preview playback state=" + i10);
                if (t0Var.W == 5 && i10 == 4 && (g0Var2 = t0Var.S) != null) {
                    g0Var2.Z0(5, t0Var.G);
                    t0Var.S.i();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        int i11 = this.f8299a;
    }

    @Override
    public final void onPlayerError(y0 y0Var) {
        switch (this.f8299a) {
            case 0:
            case 1:
                return;
            case 2:
                ((ri.p) this.f8300b).g(y0Var);
                return;
            default:
                t0 t0Var = (t0) this.f8300b;
                si.o oVar = t0Var.f46795m;
                oVar.b("preview player error: code=" + y0Var.f4150a);
                t0Var.h(y0Var);
                return;
        }
    }

    @Override
    public final void onPlayerErrorChanged(y0 y0Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        switch (this.f8299a) {
            case 0:
                return;
            case 1:
                a81 a81Var = (a81) this.f8300b;
                if (!a81Var.H && i10 == 3) {
                    a81Var.H = true;
                    if (a81Var.G && a81Var.I) {
                        a81Var.C();
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(r0 r0Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        int i11 = this.f8299a;
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f8299a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                t0 t0Var = (t0) this.f8300b;
                if (t0Var.W == 5) {
                    l60.m((l60) t0Var.d.f15837b);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        int i11 = this.f8299a;
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        int i12 = this.f8299a;
    }

    @Override
    public final void onTimelineChanged(o1 o1Var, int i10) {
        int i11 = this.f8299a;
    }

    @Override
    public final void onTrackSelectionParametersChanged(t1 t1Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onTracksChanged(v1 v1Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onVideoSizeChanged(a2 a2Var) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onVolumeChanged(float f7) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onCues(List list) {
        int i10 = this.f8299a;
    }

    @Override
    public final void onPositionDiscontinuity(e1 e1Var, e1 e1Var2, int i10) {
        int i11 = this.f8299a;
    }

    private final void C0() {
    }

    private final void D0() {
    }

    private final void E0() {
    }

    private final void A(boolean z10) {
    }

    private final void A0(int i10) {
    }

    private final void B(boolean z10) {
    }

    private final void C(boolean z10) {
    }

    private final void D(boolean z10) {
    }

    private final void E(boolean z10) {
    }

    private final void F(boolean z10) {
    }

    private final void F0(int i10) {
    }

    private final void G(boolean z10) {
    }

    private final void G0(int i10) {
    }

    private final void H0(int i10) {
    }

    private final void I0(int i10) {
    }

    private final void J0(boolean z10) {
    }

    private final void K0(boolean z10) {
    }

    private final void L(r0 r0Var) {
    }

    private final void L0(boolean z10) {
    }

    private final void M(r0 r0Var) {
    }

    private final void M0(boolean z10) {
    }

    private final void N(r0 r0Var) {
    }

    private final void N0(boolean z10) {
    }

    private final void O(r0 r0Var) {
    }

    private final void O0(boolean z10) {
    }

    private final void P(b2.t0 t0Var) {
    }

    private final void P0(boolean z10) {
    }

    private final void Q(b2.t0 t0Var) {
    }

    private final void Q0(boolean z10) {
    }

    private final void R(b2.t0 t0Var) {
    }

    private final void S(b2.t0 t0Var) {
    }

    private final void X(z0 z0Var) {
    }

    private final void Y(z0 z0Var) {
    }

    private final void Z(z0 z0Var) {
    }

    private final void Z0(t1 t1Var) {
    }

    private final void a(b2.f fVar) {
    }

    private final void a0(z0 z0Var) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void b(b2.f fVar) {
    }

    private final void b0(int i10) {
    }

    private final void b1(t1 t1Var) {
    }

    private final void c(b2.f fVar) {
    }

    private final void c0(int i10) {
    }

    private final void c1(t1 t1Var) {
    }

    private final void d(b2.f fVar) {
    }

    private final void d0(int i10) {
    }

    private final void d1(v1 v1Var) {
    }

    private final void e(int i10) {
    }

    private final void e0(int i10) {
    }

    private final void e1(v1 v1Var) {
    }

    private final void f(int i10) {
    }

    private final void f0(int i10) {
    }

    private final void f1(v1 v1Var) {
    }

    private final void g(int i10) {
    }

    private final void g0(int i10) {
    }

    private final void g1(v1 v1Var) {
    }

    private final void h(int i10) {
    }

    private final void h0(y0 y0Var) {
    }

    private final void h1(a2 a2Var) {
    }

    private final void i(b1 b1Var) {
    }

    private final void i0(y0 y0Var) {
    }

    private final void i1(a2 a2Var) {
    }

    private final void j(b1 b1Var) {
    }

    private final void j0(y0 y0Var) {
    }

    private final void j1(a2 a2Var) {
    }

    private final void k(b1 b1Var) {
    }

    private final void k0(y0 y0Var) {
    }

    private final void k1(a2 a2Var) {
    }

    private final void l(b1 b1Var) {
    }

    private final void l0(y0 y0Var) {
    }

    private final void l1(float f7) {
    }

    private final void m(d2.c cVar) {
    }

    private final void m0(y0 y0Var) {
    }

    private final void m1(float f7) {
    }

    private final void n(List list) {
    }

    private final void n1(float f7) {
    }

    private final void o(d2.c cVar) {
    }

    private final void o1(float f7) {
    }

    private final void p(List list) {
    }

    private final void q(d2.c cVar) {
    }

    private final void q0(r0 r0Var) {
    }

    private final void r(List list) {
    }

    private final void r0(r0 r0Var) {
    }

    private final void s(d2.c cVar) {
    }

    private final void s0(r0 r0Var) {
    }

    private final void t(List list) {
    }

    private final void t0(r0 r0Var) {
    }

    private final void u0(int i10) {
    }

    private final void w0(int i10) {
    }

    private final void x(boolean z10) {
    }

    private final void y(boolean z10) {
    }

    private final void y0(int i10) {
    }

    private final void z(boolean z10) {
    }

    private final void H(b2.o0 o0Var, int i10) {
    }

    private final void I(b2.o0 o0Var, int i10) {
    }

    private final void J(b2.o0 o0Var, int i10) {
    }

    private final void K(b2.o0 o0Var, int i10) {
    }

    private final void R0(int i10, int i11) {
    }

    private final void S0(int i10, int i11) {
    }

    private final void T(int i10, boolean z10) {
    }

    private final void T0(int i10, int i11) {
    }

    private final void U(int i10, boolean z10) {
    }

    private final void U0(int i10, int i11) {
    }

    private final void V(int i10, boolean z10) {
    }

    private final void V0(o1 o1Var, int i10) {
    }

    private final void W(int i10, boolean z10) {
    }

    private final void W0(o1 o1Var, int i10) {
    }

    private final void X0(o1 o1Var, int i10) {
    }

    private final void Y0(o1 o1Var, int i10) {
    }

    private final void n0(int i10, boolean z10) {
    }

    private final void o0(int i10, boolean z10) {
    }

    private final void p0(int i10, boolean z10) {
    }

    private final void u(f1 f1Var, c1 c1Var) {
    }

    private final void v(f1 f1Var, c1 c1Var) {
    }

    private final void w(f1 f1Var, c1 c1Var) {
    }

    private final void B0(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final void v0(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final void x0(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final void z0(e1 e1Var, e1 e1Var2, int i10) {
    }
}
