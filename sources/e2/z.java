package e2;

import android.os.Handler;
import b2.a1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.f1;
import b2.g1;
import b2.p1;
import b2.u0;
import b2.u1;
import b2.w1;
import b2.z0;
import java.util.List;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.s81;
import vi.s0;
public final class z implements e1 {
    public final int f9738a;
    public final Object f9739b;

    public z(Object obj, int i10) {
        this.f9738a = i10;
        this.f9739b = obj;
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        int i11 = this.f9738a;
    }

    @Override
    public final void onAvailableCommandsChanged(c1 c1Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onCues(d2.c cVar) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onEvents(g1 g1Var, d1 d1Var) {
        switch (this.f9738a) {
            case 0:
                e0 e0Var = (e0) this.f9739b;
                e0Var.f9653g.a();
                e0Var.h.a();
                e0Var.f9654i.a();
                e0Var.f9655j.a();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        switch (this.f9738a) {
            case 0:
            case 1:
                return;
            case 2:
                ui.o oVar = (ui.o) this.f9739b;
                ui.f fVar = oVar.f49949f;
                ui.d dVar = oVar.F;
                Handler handler = oVar.f49951i;
                if (oVar.v != z10) {
                    oVar.v = z10;
                    handler.removeCallbacks(dVar);
                    if (z10) {
                        handler.post(dVar);
                    }
                    fVar.onPreviewPlaybackChanged(z10);
                    fVar.onStateChanged(oVar.e());
                    return;
                }
                return;
            default:
                s0 s0Var = (s0) this.f9739b;
                if (s0Var.W == 5) {
                    s0Var.x(z10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onMediaItemTransition(b2.p0 p0Var, int i10) {
        int i11 = this.f9738a;
    }

    @Override
    public final void onMediaMetadataChanged(b2.s0 s0Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onMetadata(u0 u0Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        int i11 = this.f9738a;
    }

    @Override
    public final void onPlaybackParametersChanged(a1 a1Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        i2.j0 j0Var;
        i2.j0 j0Var2;
        switch (this.f9738a) {
            case 0:
            case 1:
                return;
            case 2:
                ui.o oVar = (ui.o) this.f9739b;
                if (i10 == 4 && oVar.f49956n == ui.m.e && (j0Var = oVar.B) != null) {
                    j0Var.Z0(5, oVar.f49961s);
                    oVar.B.e();
                    return;
                }
                return;
            default:
                s0 s0Var = (s0) this.f9739b;
                vi.n nVar = s0Var.f50589m;
                nVar.b("preview playback state=" + i10);
                if (s0Var.W == 5 && i10 == 4 && (j0Var2 = s0Var.S) != null) {
                    j0Var2.Z0(5, s0Var.G);
                    s0Var.S.i();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        int i11 = this.f9738a;
    }

    @Override
    public final void onPlayerError(z0 z0Var) {
        switch (this.f9738a) {
            case 0:
            case 1:
                return;
            case 2:
                ((ui.o) this.f9739b).g(z0Var);
                return;
            default:
                s0 s0Var = (s0) this.f9739b;
                vi.n nVar = s0Var.f50589m;
                nVar.b("preview player error: code=" + z0Var.f3605a);
                s0Var.h(z0Var);
                return;
        }
    }

    @Override
    public final void onPlayerErrorChanged(z0 z0Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        switch (this.f9738a) {
            case 0:
                return;
            case 1:
                s81 s81Var = (s81) this.f9739b;
                if (!s81Var.H && i10 == 3) {
                    s81Var.H = true;
                    if (s81Var.G && s81Var.I) {
                        s81Var.C();
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
    public final void onPlaylistMetadataChanged(b2.s0 s0Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        int i11 = this.f9738a;
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f9738a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                s0 s0Var = (s0) this.f9739b;
                if (s0Var.W == 5) {
                    n60.m((n60) s0Var.d.f17210b);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        int i11 = this.f9738a;
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        int i12 = this.f9738a;
    }

    @Override
    public final void onTimelineChanged(p1 p1Var, int i10) {
        int i11 = this.f9738a;
    }

    @Override
    public final void onTrackSelectionParametersChanged(u1 u1Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onTracksChanged(w1 w1Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onVideoSizeChanged(b2 b2Var) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onVolumeChanged(float f7) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onCues(List list) {
        int i10 = this.f9738a;
    }

    @Override
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        int i11 = this.f9738a;
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

    private final void L(b2.s0 s0Var) {
    }

    private final void L0(boolean z10) {
    }

    private final void M(b2.s0 s0Var) {
    }

    private final void M0(boolean z10) {
    }

    private final void N(b2.s0 s0Var) {
    }

    private final void N0(boolean z10) {
    }

    private final void O(b2.s0 s0Var) {
    }

    private final void O0(boolean z10) {
    }

    private final void P(u0 u0Var) {
    }

    private final void P0(boolean z10) {
    }

    private final void Q(u0 u0Var) {
    }

    private final void Q0(boolean z10) {
    }

    private final void R(u0 u0Var) {
    }

    private final void S(u0 u0Var) {
    }

    private final void X(a1 a1Var) {
    }

    private final void Y(a1 a1Var) {
    }

    private final void Z(a1 a1Var) {
    }

    private final void Z0(u1 u1Var) {
    }

    private final void a(b2.f fVar) {
    }

    private final void a0(a1 a1Var) {
    }

    private final void a1(u1 u1Var) {
    }

    private final void b(b2.f fVar) {
    }

    private final void b0(int i10) {
    }

    private final void b1(u1 u1Var) {
    }

    private final void c(b2.f fVar) {
    }

    private final void c0(int i10) {
    }

    private final void c1(u1 u1Var) {
    }

    private final void d(b2.f fVar) {
    }

    private final void d0(int i10) {
    }

    private final void d1(w1 w1Var) {
    }

    private final void e(int i10) {
    }

    private final void e0(int i10) {
    }

    private final void e1(w1 w1Var) {
    }

    private final void f(int i10) {
    }

    private final void f0(int i10) {
    }

    private final void f1(w1 w1Var) {
    }

    private final void g(int i10) {
    }

    private final void g0(int i10) {
    }

    private final void g1(w1 w1Var) {
    }

    private final void h(int i10) {
    }

    private final void h0(z0 z0Var) {
    }

    private final void h1(b2 b2Var) {
    }

    private final void i(c1 c1Var) {
    }

    private final void i0(z0 z0Var) {
    }

    private final void i1(b2 b2Var) {
    }

    private final void j(c1 c1Var) {
    }

    private final void j0(z0 z0Var) {
    }

    private final void j1(b2 b2Var) {
    }

    private final void k(c1 c1Var) {
    }

    private final void k0(z0 z0Var) {
    }

    private final void k1(b2 b2Var) {
    }

    private final void l(c1 c1Var) {
    }

    private final void l0(z0 z0Var) {
    }

    private final void l1(float f7) {
    }

    private final void m(d2.c cVar) {
    }

    private final void m0(z0 z0Var) {
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

    private final void q0(b2.s0 s0Var) {
    }

    private final void r(List list) {
    }

    private final void r0(b2.s0 s0Var) {
    }

    private final void s(d2.c cVar) {
    }

    private final void s0(b2.s0 s0Var) {
    }

    private final void t(List list) {
    }

    private final void t0(b2.s0 s0Var) {
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

    private final void H(b2.p0 p0Var, int i10) {
    }

    private final void I(b2.p0 p0Var, int i10) {
    }

    private final void J(b2.p0 p0Var, int i10) {
    }

    private final void K(b2.p0 p0Var, int i10) {
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

    private final void V0(p1 p1Var, int i10) {
    }

    private final void W(int i10, boolean z10) {
    }

    private final void W0(p1 p1Var, int i10) {
    }

    private final void X0(p1 p1Var, int i10) {
    }

    private final void Y0(p1 p1Var, int i10) {
    }

    private final void n0(int i10, boolean z10) {
    }

    private final void o0(int i10, boolean z10) {
    }

    private final void p0(int i10, boolean z10) {
    }

    private final void u(g1 g1Var, d1 d1Var) {
    }

    private final void v(g1 g1Var, d1 d1Var) {
    }

    private final void w(g1 g1Var, d1 d1Var) {
    }

    private final void B0(f1 f1Var, f1 f1Var2, int i10) {
    }

    private final void v0(f1 f1Var, f1 f1Var2, int i10) {
    }

    private final void x0(f1 f1Var, f1 f1Var2, int i10) {
    }

    private final void z0(f1 f1Var, f1 f1Var2, int i10) {
    }
}
