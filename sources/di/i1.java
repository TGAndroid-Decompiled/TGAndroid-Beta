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
    public static i1 f9099w;
    public ti.o f9100a;
    public g1 f9101b;
    public q9 f9102c;
    public org.telegram.ui.Components.voip.q0 f9103e;
    public fi.s3 f9104f;
    public VideoSink h;
    public LaunchActivity f9106r;
    public boolean f9107s;
    public final h1 d = new h1(this);
    public final ab f9105n = new ab(this, 17);

    public static boolean a(g1 g1Var) {
        ti.o oVar;
        i1 i1Var = f9099w;
        if (g1Var == null || i1Var == null || i1Var.f9101b != g1Var || (oVar = i1Var.f9100a) == null || !oVar.d() || i1Var.f9100a.f56136c == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void B(View view) {
        fi.s3 s3Var;
        g1 g1Var = this.f9101b;
        if (g1Var != null && view == (s3Var = this.f9104f)) {
            this.h = g1Var.O;
            this.d.f9060a = s3Var.getSink();
            this.f9101b.s(this.d);
            this.f9101b.v(1.0f);
            d(true);
        }
    }

    @Override
    public final void C(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.q0 q0Var = this.f9103e;
        this.f9103e = null;
        this.d.f9060a = null;
        g1 g1Var = this.f9101b;
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
        q9 q9Var = this.f9102c;
        if (q9Var != null && !q9Var.G0 && (g1Var = this.f9101b) != null && q9Var.A0 == g1Var) {
            return true;
        }
        return false;
    }

    @Override
    public final int I() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        fi.s3 s3Var;
        if (this.d.f9061b > 0) {
            return this.d.f9061b;
        }
        q9 q9Var = this.f9102c;
        if (q9Var != null && (s3Var = q9Var.D0) != null) {
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
        g1 g1Var = this.f9101b;
        if (g1Var != null && !g1Var.f9011x) {
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
        this.f9107s = false;
        g1 g1Var = this.f9101b;
        q9 q9Var = this.f9102c;
        if (this.f9104f == null && this.h == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f9100a = null;
        this.f9101b = null;
        this.d.f9060a = null;
        org.telegram.ui.Components.voip.q0 q0Var = this.f9103e;
        if (q0Var != null) {
            q0Var.a();
            this.f9103e = null;
        }
        if (z9 && q9Var != null) {
            d(false);
            if (g1Var != null && (videoSink = this.h) != null) {
                g1Var.s(videoSink);
            }
            this.h = null;
            this.f9102c = null;
            q9Var.u(false);
            return;
        }
        this.f9102c = null;
        if (g1Var != null && !g1Var.f9011x) {
            if (q9Var == null || q9Var.A0 != g1Var) {
                if (!g1Var.f9007n && g1Var != g1.W) {
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
        this.f9104f = (fi.s3) view;
    }

    @Override
    public final void T() {
        LaunchActivity launchActivity;
        g1 g1Var = this.f9101b;
        if (g1Var != null) {
            int i7 = g1Var.f9005e;
            if (!g1Var.f9011x) {
                if (i7 != p10.f24474s0 && (launchActivity = LaunchActivity.G1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = qp.s1(i7).P1().u(g1Var.f9004c, g1Var.f9003b);
                if (u10 == null) {
                    u10 = g1Var.f9002a;
                }
                if (T != null && u10 != null && T.getContext() != null) {
                    T.getOrCreateStoryViewer().G(i7, T.getContext(), u10, null);
                    return;
                }
                ti.o oVar = this.f9100a;
                if (oVar != null) {
                    oVar.b();
                    return;
                }
                return;
            }
        }
        ti.o oVar2 = this.f9100a;
        if (oVar2 != null) {
            oVar2.b();
        }
    }

    @Override
    public final int U() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        fi.s3 s3Var;
        if (this.d.f9062c > 0) {
            return this.d.f9062c;
        }
        q9 q9Var = this.f9102c;
        if (q9Var != null && (s3Var = q9Var.D0) != null) {
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
        if (!this.f9107s) {
            this.f9107s = true;
            g1 g1Var = this.f9101b;
            if (g1Var != null) {
                g1Var.v(0.0f);
            }
        }
    }

    public final void d(boolean z9) {
        e9 e9Var;
        int i7;
        q9 q9Var = this.f9102c;
        if (q9Var != null && (e9Var = q9Var.f9639s) != null) {
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            e9Var.setVisibility(i7);
        }
    }

    @Override
    public final void e(View view) {
        VideoSink videoSink;
        d(false);
        if (view == this.f9104f) {
            this.d.f9060a = null;
            g1 g1Var = this.f9101b;
            if (g1Var != null && (videoSink = this.h) != null) {
                g1Var.s(videoSink);
            }
            this.h = null;
            this.f9104f = null;
        }
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void f() {
        if (this.f9107s) {
            this.f9107s = false;
            g1 g1Var = this.f9101b;
            if (g1Var != null) {
                g1Var.v(1.0f);
            }
        }
    }

    @Override
    public final void g(ti.p pVar) {
        if (this.f9101b == null) {
            return;
        }
        org.telegram.ui.Components.voip.q0 q0Var = new org.telegram.ui.Components.voip.q0(pVar);
        this.f9103e = q0Var;
        this.d.f9060a = q0Var;
        g1 g1Var = this.f9101b;
        this.h = g1Var.O;
        g1Var.s(this.d);
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h() {
        return !this.f9107s;
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
        g1 g1Var = this.f9101b;
        if (g1Var != null) {
            i7 = g1Var.f9005e;
        } else {
            i7 = p10.f24474s0;
        }
        return new fi.s3(launchActivity, i7);
    }

    @Override
    public final void y(View view) {
        if (view == this.f9104f) {
            this.d.f9060a = null;
            this.f9104f = null;
        }
        fi.s3 s3Var = (fi.s3) view;
        TextureViewRenderer textureViewRenderer = s3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = s3Var.f12782c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        s3Var.f12786r = false;
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
