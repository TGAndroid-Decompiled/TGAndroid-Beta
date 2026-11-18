package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class e1 implements wi.l {
    public static e1 f11871w;
    public wi.n f11872a;
    public c1 f11873b;
    public f9 f11874c;
    public org.telegram.ui.Components.voip.t0 f11875e;
    public hi.r3 f11876f;
    public VideoSink h;
    public LaunchActivity f11878r;
    public boolean f11879s;
    public final d1 d = new d1(this);
    public final f2.a f11877n = new f2.a(this, 5);

    public static boolean a(c1 c1Var) {
        wi.n nVar;
        e1 e1Var = f11871w;
        if (c1Var == null || e1Var == null || e1Var.f11873b != c1Var || (nVar = e1Var.f11872a) == null || !nVar.d() || e1Var.f11872a.f59988c == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void B(View view) {
        hi.r3 r3Var;
        c1 c1Var = this.f11873b;
        if (c1Var != null && view == (r3Var = this.f11876f)) {
            this.h = c1Var.P;
            this.d.f11839a = r3Var.getSink();
            this.f11873b.s(this.d);
            this.f11873b.v(1.0f);
            g(true);
        }
    }

    @Override
    public final void D(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.t0 t0Var = this.f11875e;
        this.f11875e = null;
        this.d.f11839a = null;
        c1 c1Var = this.f11873b;
        if (c1Var != null && (videoSink = this.h) != null) {
            c1Var.s(videoSink);
        }
        this.h = null;
        if (t0Var != null) {
            t0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final View E() {
        return null;
    }

    @Override
    public final boolean G() {
        c1 c1Var;
        f9 f9Var = this.f11874c;
        if (f9Var != null && !f9Var.H0 && (c1Var = this.f11873b) != null && f9Var.B0 == c1Var) {
            return true;
        }
        return false;
    }

    @Override
    public final int J() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        hi.r3 r3Var;
        if (this.d.f11840b > 0) {
            return this.d.f11840b;
        }
        f9 f9Var = this.f11874c;
        if (f9Var != null && (r3Var = f9Var.E0) != null) {
            textureViewRenderer = r3Var.d;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i7 = textureViewRenderer.rotatedFrameWidth) > 0) {
            return i7;
        }
        return 9;
    }

    @Override
    public final boolean N() {
        c1 c1Var = this.f11873b;
        if (c1Var != null && !c1Var.f11802x) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean O() {
        return true;
    }

    @Override
    public final e2.c1 Q() {
        return null;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void U() {
        boolean z10;
        VideoSink videoSink;
        this.f11879s = false;
        c1 c1Var = this.f11873b;
        f9 f9Var = this.f11874c;
        if (this.f11876f == null && this.h == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f11872a = null;
        this.f11873b = null;
        this.d.f11839a = null;
        org.telegram.ui.Components.voip.t0 t0Var = this.f11875e;
        if (t0Var != null) {
            t0Var.a();
            this.f11875e = null;
        }
        if (z10 && f9Var != null) {
            g(false);
            if (c1Var != null && (videoSink = this.h) != null) {
                c1Var.s(videoSink);
            }
            this.h = null;
            this.f11874c = null;
            f9Var.u(false);
            return;
        }
        this.f11874c = null;
        if (c1Var != null && !c1Var.f11802x) {
            if (f9Var == null || f9Var.B0 != c1Var) {
                if (!c1Var.f11798n && c1Var != c1.X) {
                    c1Var.e();
                } else {
                    c1Var.s(null);
                }
            }
        }
    }

    @Override
    public final boolean V(boolean z10, float f10, cn0 cn0Var) {
        return false;
    }

    @Override
    public final void X(View view) {
        this.f11876f = (hi.r3) view;
    }

    @Override
    public final void Z() {
        LaunchActivity launchActivity;
        c1 c1Var = this.f11873b;
        if (c1Var != null) {
            int i7 = c1Var.f11796e;
            if (!c1Var.f11802x) {
                if (i7 != j10.f24773t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = mp.u1(i7).R1().u(c1Var.f11795c, c1Var.f11794b);
                if (u10 == null) {
                    u10 = c1Var.f11793a;
                }
                if (T != null && u10 != null && T.getContext() != null) {
                    T.getOrCreateStoryViewer().G(i7, T.getContext(), u10, null);
                    return;
                }
                wi.n nVar = this.f11872a;
                if (nVar != null) {
                    nVar.b();
                    return;
                }
                return;
            }
        }
        wi.n nVar2 = this.f11872a;
        if (nVar2 != null) {
            nVar2.b();
        }
    }

    @Override
    public final int a0() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        hi.r3 r3Var;
        if (this.d.f11841c > 0) {
            return this.d.f11841c;
        }
        f9 f9Var = this.f11874c;
        if (f9Var != null && (r3Var = f9Var.E0) != null) {
            textureViewRenderer = r3Var.d;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i7 = textureViewRenderer.rotatedFrameHeight) > 0) {
            return i7;
        }
        return 16;
    }

    @Override
    public final void b() {
        if (!this.f11879s) {
            this.f11879s = true;
            c1 c1Var = this.f11873b;
            if (c1Var != null) {
                c1Var.v(0.0f);
            }
        }
    }

    @Override
    public final float b0() {
        return 0.0f;
    }

    @Override
    public final void d(View view) {
        VideoSink videoSink;
        g(false);
        if (view == this.f11876f) {
            this.d.f11839a = null;
            c1 c1Var = this.f11873b;
            if (c1Var != null && (videoSink = this.h) != null) {
                c1Var.s(videoSink);
            }
            this.h = null;
            this.f11876f = null;
        }
    }

    @Override
    public final int e() {
        return 0;
    }

    @Override
    public final void f() {
        if (this.f11879s) {
            this.f11879s = false;
            c1 c1Var = this.f11873b;
            if (c1Var != null) {
                c1Var.v(1.0f);
            }
        }
    }

    public final void g(boolean z10) {
        t8 t8Var;
        int i7;
        f9 f9Var = this.f11874c;
        if (f9Var != null && (t8Var = f9Var.f11995s) != null) {
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            t8Var.setVisibility(i7);
        }
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h() {
        return !this.f11879s;
    }

    @Override
    public final void i(wi.o oVar) {
        if (this.f11873b == null) {
            return;
        }
        org.telegram.ui.Components.voip.t0 t0Var = new org.telegram.ui.Components.voip.t0(oVar);
        this.f11875e = t0Var;
        this.d.f11839a = t0Var;
        c1 c1Var = this.f11873b;
        this.h = c1Var.P;
        c1Var.s(this.d);
    }

    @Override
    public final long l() {
        return 0L;
    }

    @Override
    public final boolean o0() {
        return false;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View v(LaunchActivity launchActivity) {
        int i7;
        c1 c1Var = this.f11873b;
        if (c1Var != null) {
            i7 = c1Var.f11796e;
        } else {
            i7 = j10.f24773t0;
        }
        return new hi.r3(launchActivity, i7);
    }

    @Override
    public final void w(View view) {
        if (view == this.f11876f) {
            this.d.f11839a = null;
            this.f11876f = null;
        }
        hi.r3 r3Var = (hi.r3) view;
        TextureViewRenderer textureViewRenderer = r3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = r3Var.f15316c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        r3Var.f15320r = false;
        r3Var.c(false, false);
    }

    @Override
    public final void H() {
    }

    @Override
    public final void L(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void p0(int i7) {
    }

    @Override
    public final void h0(int i7, ArrayList arrayList) {
    }

    @Override
    public final void j0(Canvas canvas, int i7, int i10) {
    }
}
