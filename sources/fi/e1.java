package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.en0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class e1 implements wi.l {
    public static e1 f11874w;
    public wi.n f11875a;
    public c1 f11876b;
    public f9 f11877c;
    public org.telegram.ui.Components.voip.u0 f11878e;
    public hi.z3 f11879f;
    public VideoSink h;
    public LaunchActivity f11881r;
    public boolean f11882s;
    public final d1 d = new d1(this);
    public final f2.a f11880n = new f2.a(this, 4);

    public static boolean a(c1 c1Var) {
        wi.n nVar;
        e1 e1Var = f11874w;
        if (c1Var == null || e1Var == null || e1Var.f11876b != c1Var || (nVar = e1Var.f11875a) == null || !nVar.d() || e1Var.f11875a.f60117c == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override
    public final void B0(View view) {
        hi.z3 z3Var;
        c1 c1Var = this.f11876b;
        if (c1Var != null && view == (z3Var = this.f11879f)) {
            this.h = c1Var.P;
            this.d.f11841a = z3Var.getSink();
            this.f11876b.s(this.d);
            this.f11876b.v(1.0f);
            d(true);
        }
    }

    @Override
    public final boolean C2() {
        return false;
    }

    @Override
    public final void D1(View view) {
        this.f11879f = (hi.z3) view;
    }

    @Override
    public final void E0(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.u0 u0Var = this.f11878e;
        this.f11878e = null;
        this.d.f11841a = null;
        c1 c1Var = this.f11876b;
        if (c1Var != null && (videoSink = this.h) != null) {
            c1Var.s(videoSink);
        }
        this.h = null;
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final void I(wi.o oVar) {
        if (this.f11876b == null) {
            return;
        }
        org.telegram.ui.Components.voip.u0 u0Var = new org.telegram.ui.Components.voip.u0(oVar);
        this.f11878e = u0Var;
        this.d.f11841a = u0Var;
        c1 c1Var = this.f11876b;
        this.h = c1Var.P;
        c1Var.s(this.d);
    }

    @Override
    public final View K0() {
        return null;
    }

    @Override
    public final boolean O0() {
        c1 c1Var;
        f9 f9Var = this.f11877c;
        if (f9Var != null && !f9Var.H0 && (c1Var = this.f11876b) != null && f9Var.B0 == c1Var) {
            return true;
        }
        return false;
    }

    @Override
    public final void P1() {
        LaunchActivity launchActivity;
        c1 c1Var = this.f11876b;
        if (c1Var != null) {
            int i7 = c1Var.f11801e;
            if (!c1Var.f11807x) {
                if (i7 != i10.f24637t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = mp.u1(i7).R1().u(c1Var.f11800c, c1Var.f11799b);
                if (u10 == null) {
                    u10 = c1Var.f11798a;
                }
                if (T != null && u10 != null && T.getContext() != null) {
                    T.getOrCreateStoryViewer().G(i7, T.getContext(), u10, null);
                    return;
                }
                wi.n nVar = this.f11875a;
                if (nVar != null) {
                    nVar.b();
                    return;
                }
                return;
            }
        }
        wi.n nVar2 = this.f11875a;
        if (nVar2 != null) {
            nVar2.b();
        }
    }

    @Override
    public final int V1() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        hi.z3 z3Var;
        if (this.d.f11843c > 0) {
            return this.d.f11843c;
        }
        f9 f9Var = this.f11877c;
        if (f9Var != null && (z3Var = f9Var.E0) != null) {
            textureViewRenderer = z3Var.d;
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
        if (!this.f11882s) {
            this.f11882s = true;
            c1 c1Var = this.f11876b;
            if (c1Var != null) {
                c1Var.v(0.0f);
            }
        }
    }

    @Override
    public final int b1() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        hi.z3 z3Var;
        if (this.d.f11842b > 0) {
            return this.d.f11842b;
        }
        f9 f9Var = this.f11877c;
        if (f9Var != null && (z3Var = f9Var.E0) != null) {
            textureViewRenderer = z3Var.d;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i7 = textureViewRenderer.rotatedFrameWidth) > 0) {
            return i7;
        }
        return 9;
    }

    public final void d(boolean z10) {
        t8 t8Var;
        int i7;
        f9 f9Var = this.f11877c;
        if (f9Var != null && (t8Var = f9Var.f11998s) != null) {
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            t8Var.setVisibility(i7);
        }
    }

    @Override
    public final float d2() {
        return 0.0f;
    }

    @Override
    public final void f() {
        if (this.f11882s) {
            this.f11882s = false;
            c1 c1Var = this.f11876b;
            if (c1Var != null) {
                c1Var.v(1.0f);
            }
        }
    }

    @Override
    public final boolean f0() {
        return true;
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h1() {
        c1 c1Var = this.f11876b;
        if (c1Var != null && !c1Var.f11807x) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i1() {
        return true;
    }

    @Override
    public final boolean j() {
        return !this.f11882s;
    }

    @Override
    public final void l(View view) {
        VideoSink videoSink;
        d(false);
        if (view == this.f11879f) {
            this.d.f11841a = null;
            c1 c1Var = this.f11876b;
            if (c1Var != null && (videoSink = this.h) != null) {
                c1Var.s(videoSink);
            }
            this.h = null;
            this.f11879f = null;
        }
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final long n() {
        return 0L;
    }

    @Override
    public final e2.c1 n1() {
        return null;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void v1() {
        boolean z10;
        VideoSink videoSink;
        this.f11882s = false;
        c1 c1Var = this.f11876b;
        f9 f9Var = this.f11877c;
        if (this.f11879f == null && this.h == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f11875a = null;
        this.f11876b = null;
        this.d.f11841a = null;
        org.telegram.ui.Components.voip.u0 u0Var = this.f11878e;
        if (u0Var != null) {
            u0Var.a();
            this.f11878e = null;
        }
        if (z10 && f9Var != null) {
            d(false);
            if (c1Var != null && (videoSink = this.h) != null) {
                c1Var.s(videoSink);
            }
            this.h = null;
            this.f11877c = null;
            f9Var.u(false);
            return;
        }
        this.f11877c = null;
        if (c1Var != null && !c1Var.f11807x) {
            if (f9Var == null || f9Var.B0 != c1Var) {
                if (!c1Var.f11803n && c1Var != c1.X) {
                    c1Var.e();
                } else {
                    c1Var.s(null);
                }
            }
        }
    }

    @Override
    public final void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final int y() {
        return 0;
    }

    @Override
    public final View y0(LaunchActivity launchActivity) {
        int i7;
        c1 c1Var = this.f11876b;
        if (c1Var != null) {
            i7 = c1Var.f11801e;
        } else {
            i7 = i10.f24637t0;
        }
        return new hi.z3(launchActivity, i7);
    }

    @Override
    public final void z0(View view) {
        if (view == this.f11879f) {
            this.d.f11841a = null;
            this.f11879f = null;
        }
        hi.z3 z3Var = (hi.z3) view;
        TextureViewRenderer textureViewRenderer = z3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = z3Var.f15899c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        z3Var.f15903r = false;
        z3Var.c(false, false);
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void D2(int i7) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void d1(float f10) {
    }

    @Override
    public final void n2(int i7, ArrayList arrayList) {
    }

    @Override
    public final void t2(Canvas canvas, int i7, int i10) {
    }
}
