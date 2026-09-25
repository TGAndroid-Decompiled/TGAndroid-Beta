package ki;

import b2.a1;
import b2.b1;
import b2.k1;
import b2.q1;
import b2.s1;
import b2.u0;
import b2.v0;
import b2.x0;
import b2.x1;
import b2.y0;
import b2.z0;
import java.util.List;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.s71;
public final class i0 implements z0 {
    public final int f13745a;
    public final Object f13746b;

    public i0(Object obj, int i10) {
        this.f13745a = i10;
        this.f13746b = obj;
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        int i11 = this.f13745a;
    }

    @Override
    public final void onAvailableCommandsChanged(x0 x0Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onCues(d2.d dVar) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onEvents(b1 b1Var, y0 y0Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        switch (this.f13745a) {
            case 0:
                s0 s0Var = (s0) this.f13746b;
                if (s0Var.V == 5) {
                    s0Var.w(z10);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        int i11 = this.f13745a;
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onMetadata(b2.p0 p0Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        int i11 = this.f13745a;
    }

    @Override
    public final void onPlaybackParametersChanged(v0 v0Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        i2.f0 f0Var;
        switch (this.f13745a) {
            case 0:
                s0 s0Var = (s0) this.f13746b;
                m mVar = s0Var.f13850l;
                mVar.b("preview playback state=" + i10);
                if (s0Var.V == 5 && i10 == 4 && (f0Var = s0Var.R) != null) {
                    f0Var.W0(5, s0Var.F);
                    s0Var.R.i();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        int i11 = this.f13745a;
    }

    @Override
    public final void onPlayerError(u0 u0Var) {
        switch (this.f13745a) {
            case 0:
                s0 s0Var = (s0) this.f13746b;
                m mVar = s0Var.f13850l;
                mVar.b("preview player error: code=" + u0Var.f3324a);
                s0Var.g(u0Var);
                return;
            default:
                return;
        }
    }

    @Override
    public final void onPlayerErrorChanged(u0 u0Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        switch (this.f13745a) {
            case 0:
                return;
            default:
                s71 s71Var = (s71) this.f13746b;
                if (!s71Var.H && i10 == 3) {
                    s71Var.H = true;
                    if (s71Var.G && s71Var.I) {
                        s71Var.C();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        int i11 = this.f13745a;
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f13745a) {
            case 0:
                s0 s0Var = (s0) this.f13746b;
                if (s0Var.V == 5) {
                    b60.l((b60) s0Var.f13844c.f13924a);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        int i11 = this.f13745a;
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        int i12 = this.f13745a;
    }

    @Override
    public final void onTimelineChanged(k1 k1Var, int i10) {
        int i11 = this.f13745a;
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onVolumeChanged(float f7) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onCues(List list) {
        int i10 = this.f13745a;
    }

    @Override
    public final void onPositionDiscontinuity(a1 a1Var, a1 a1Var2, int i10) {
        int i11 = this.f13745a;
    }

    private final void A(v0 v0Var) {
    }

    private final void B(int i10) {
    }

    private final void C(int i10) {
    }

    private final void D(int i10) {
    }

    private final void E(u0 u0Var) {
    }

    private final void F(u0 u0Var) {
    }

    private final void G(u0 u0Var) {
    }

    private final void I(b2.n0 n0Var) {
    }

    private final void J(b2.n0 n0Var) {
    }

    private final void K(int i10) {
    }

    private final void M(int i10) {
    }

    private final void P(int i10) {
    }

    private final void Q(int i10) {
    }

    private final void R(boolean z10) {
    }

    private final void S(boolean z10) {
    }

    private final void T(boolean z10) {
    }

    private final void U(boolean z10) {
    }

    private final void Z(q1 q1Var) {
    }

    private final void a(b2.e eVar) {
    }

    private final void a0(q1 q1Var) {
    }

    private final void b(b2.e eVar) {
    }

    private final void b0(s1 s1Var) {
    }

    private final void c(int i10) {
    }

    private final void c0(s1 s1Var) {
    }

    private final void d(int i10) {
    }

    private final void d0(x1 x1Var) {
    }

    private final void e(x0 x0Var) {
    }

    private final void e0(x1 x1Var) {
    }

    private final void f(x0 x0Var) {
    }

    private final void f0(float f7) {
    }

    private final void g(d2.d dVar) {
    }

    private final void g0(float f7) {
    }

    private final void h(List list) {
    }

    private final void i(d2.d dVar) {
    }

    private final void j(List list) {
    }

    private final void m(boolean z10) {
    }

    private final void n(boolean z10) {
    }

    private final void o(boolean z10) {
    }

    private final void p(boolean z10) {
    }

    private final void q(boolean z10) {
    }

    private final void t(b2.n0 n0Var) {
    }

    private final void u(b2.n0 n0Var) {
    }

    private final void v(b2.p0 p0Var) {
    }

    private final void w(b2.p0 p0Var) {
    }

    private final void z(v0 v0Var) {
    }

    private final void O() {
    }

    private final void H(int i10, boolean z10) {
    }

    private final void V(int i10, int i11) {
    }

    private final void W(int i10, int i11) {
    }

    private final void X(k1 k1Var, int i10) {
    }

    private final void Y(k1 k1Var, int i10) {
    }

    private final void k(b1 b1Var, y0 y0Var) {
    }

    private final void l(b1 b1Var, y0 y0Var) {
    }

    private final void r(b2.k0 k0Var, int i10) {
    }

    private final void s(b2.k0 k0Var, int i10) {
    }

    private final void x(int i10, boolean z10) {
    }

    private final void y(int i10, boolean z10) {
    }

    private final void L(a1 a1Var, a1 a1Var2, int i10) {
    }

    private final void N(a1 a1Var, a1 a1Var2, int i10) {
    }
}
