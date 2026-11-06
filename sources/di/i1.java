package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import bi.ab;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class i1 implements ti.m {
    public static i1 f9120w;
    public ti.o f9121a;
    public g1 f9122b;
    public p9 f9123c;
    public org.telegram.ui.Components.voip.q0 f9124e;
    public fi.s3 f9125f;
    public VideoSink h;
    public LaunchActivity f9127r;
    public boolean f9128s;
    public final h1 d = new h1(this);
    public final ab f9126n = new ab(this, 17);

    public static boolean a(g1 g1Var) {
        ti.o oVar;
        i1 i1Var = f9120w;
        if (g1Var == null || i1Var == null || i1Var.f9122b != g1Var || (oVar = i1Var.f9121a) == null || !oVar.d() || i1Var.f9121a.f56033c == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void B(View view) {
        fi.s3 s3Var;
        g1 g1Var = this.f9122b;
        if (g1Var != null && view == (s3Var = this.f9125f)) {
            this.h = g1Var.O;
            this.d.f9065a = s3Var.getSink();
            this.f9122b.s(this.d);
            this.f9122b.v(1.0f);
            d(true);
        }
    }

    @Override
    public final void C(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.q0 q0Var = this.f9124e;
        this.f9124e = null;
        this.d.f9065a = null;
        g1 g1Var = this.f9122b;
        if (g1Var != null && (videoSink = this.h) != null) {
            g1Var.s(videoSink);
        }
        this.h = null;
        if (q0Var != null) {
            q0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final View D() {
        return null;
    }

    @Override
    public final boolean E() {
        g1 g1Var;
        p9 p9Var = this.f9123c;
        if (p9Var != null && !p9Var.G0 && (g1Var = this.f9122b) != null && p9Var.A0 == g1Var) {
            return true;
        }
        return false;
    }

    @Override
    public final int I() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        fi.s3 s3Var;
        if (this.d.f9066b > 0) {
            return this.d.f9066b;
        }
        p9 p9Var = this.f9123c;
        if (p9Var != null && (s3Var = p9Var.D0) != null) {
            textureViewRenderer = s3Var.d;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i7 = textureViewRenderer.rotatedFrameWidth) > 0) {
            return i7;
        }
        return 9;
    }

    @Override
    public final boolean K() {
        g1 g1Var = this.f9122b;
        if (g1Var != null && !g1Var.f9031x) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean L() {
        return true;
    }

    @Override
    public final e2.c1 M() {
        return null;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void Q() {
        boolean z9;
        VideoSink videoSink;
        this.f9128s = false;
        g1 g1Var = this.f9122b;
        p9 p9Var = this.f9123c;
        if (this.f9125f == null && this.h == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f9121a = null;
        this.f9122b = null;
        this.d.f9065a = null;
        org.telegram.ui.Components.voip.q0 q0Var = this.f9124e;
        if (q0Var != null) {
            q0Var.a();
            this.f9124e = null;
        }
        if (z9 && p9Var != null) {
            d(false);
            if (g1Var != null && (videoSink = this.h) != null) {
                g1Var.s(videoSink);
            }
            this.h = null;
            this.f9123c = null;
            p9Var.u(false);
            return;
        }
        this.f9123c = null;
        if (g1Var != null && !g1Var.f9031x) {
            if (p9Var == null || p9Var.A0 != g1Var) {
                if (!g1Var.f9027n && g1Var != g1.W) {
                    g1Var.e();
                } else {
                    g1Var.s(null);
                }
            }
        }
    }

    @Override
    public final boolean R(boolean z9, float f10, qm0 qm0Var) {
        return false;
    }

    @Override
    public final void S(View view) {
        this.f9125f = (fi.s3) view;
    }

    @Override
    public final void T() {
        LaunchActivity launchActivity;
        g1 g1Var = this.f9122b;
        if (g1Var != null) {
            int i7 = g1Var.f9025e;
            if (!g1Var.f9031x) {
                if (i7 != p10.f24459s0 && (launchActivity = LaunchActivity.G1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = qp.s1(i7).P1().u(g1Var.f9024c, g1Var.f9023b);
                if (u10 == null) {
                    u10 = g1Var.f9022a;
                }
                if (T != null && u10 != null && T.getContext() != null) {
                    T.getOrCreateStoryViewer().G(i7, T.getContext(), u10, null);
                    return;
                }
                ti.o oVar = this.f9121a;
                if (oVar != null) {
                    oVar.b();
                    return;
                }
                return;
            }
        }
        ti.o oVar2 = this.f9121a;
        if (oVar2 != null) {
            oVar2.b();
        }
    }

    @Override
    public final int U() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        fi.s3 s3Var;
        if (this.d.f9067c > 0) {
            return this.d.f9067c;
        }
        p9 p9Var = this.f9123c;
        if (p9Var != null && (s3Var = p9Var.D0) != null) {
            textureViewRenderer = s3Var.d;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i7 = textureViewRenderer.rotatedFrameHeight) > 0) {
            return i7;
        }
        return 16;
    }

    @Override
    public final float V() {
        return 0.0f;
    }

    @Override
    public final void b() {
        if (!this.f9128s) {
            this.f9128s = true;
            g1 g1Var = this.f9122b;
            if (g1Var != null) {
                g1Var.v(0.0f);
            }
        }
    }

    public final void d(boolean z9) {
        d9 d9Var;
        int i7;
        p9 p9Var = this.f9123c;
        if (p9Var != null && (d9Var = p9Var.f9569s) != null) {
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            d9Var.setVisibility(i7);
        }
    }

    @Override
    public final void e(View view) {
        VideoSink videoSink;
        d(false);
        if (view == this.f9125f) {
            this.d.f9065a = null;
            g1 g1Var = this.f9122b;
            if (g1Var != null && (videoSink = this.h) != null) {
                g1Var.s(videoSink);
            }
            this.h = null;
            this.f9125f = null;
        }
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void f() {
        if (this.f9128s) {
            this.f9128s = false;
            g1 g1Var = this.f9122b;
            if (g1Var != null) {
                g1Var.v(1.0f);
            }
        }
    }

    @Override
    public final void g(ti.q qVar) {
        if (this.f9122b == null) {
            return;
        }
        org.telegram.ui.Components.voip.q0 q0Var = new org.telegram.ui.Components.voip.q0(qVar);
        this.f9124e = q0Var;
        this.d.f9065a = q0Var;
        g1 g1Var = this.f9122b;
        this.h = g1Var.O;
        g1Var.s(this.d);
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h() {
        return !this.f9128s;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final long l() {
        return 0L;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void v(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View x(LaunchActivity launchActivity) {
        int i7;
        g1 g1Var = this.f9122b;
        if (g1Var != null) {
            i7 = g1Var.f9025e;
        } else {
            i7 = p10.f24459s0;
        }
        return new fi.s3(launchActivity, i7);
    }

    @Override
    public final void y(View view) {
        if (view == this.f9125f) {
            this.d.f9065a = null;
            this.f9125f = null;
        }
        fi.s3 s3Var = (fi.s3) view;
        TextureViewRenderer textureViewRenderer = s3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = s3Var.f12779c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        s3Var.f12783r = false;
        s3Var.c(false, false);
    }

    @Override
    public final void J(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void f0(int i7) {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void Z(int i7, ArrayList arrayList) {
    }

    @Override
    public final void c0(Canvas canvas, int i7, int i10) {
    }
}
