package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class w96 implements vc8 {
    public static w96 E;
    public ad8 a;
    public s96 b;
    public oab c;
    public v96 d;
    public wc8 e;
    public y96 f;
    public t96 h;
    public VideoSink n;
    public aq9 r;
    public boolean s;
    public final u96 w = new u96(this, (byte) 1);
    public LaunchActivity x;
    public boolean y;

    public static boolean a(s96 s96Var) {
        ad8 ad8Var;
        w96 w96Var = E;
        if (s96Var != null && w96Var != null && w96Var.b == s96Var && (ad8Var = w96Var.a) != null && ad8Var.e() && w96Var.a.c != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean A0() {
        return false;
    }

    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final boolean F(boolean z, float f, lx9 lx9Var) {
        return false;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void I(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View J(LaunchActivity launchActivity) {
        int i;
        s96 s96Var = this.b;
        if (s96Var != null) {
            i = s96Var.e;
        } else {
            i = z8c.t0;
        }
        return new t96(launchActivity, i);
    }

    @Override
    public final void K(View view) {
        if (view == this.h) {
            v96 v96Var = this.d;
            if (v96Var != null) {
                v96Var.a = null;
            }
            this.h = null;
        }
        t96 t96Var = (t96) view;
        TextureViewRenderer textureViewRenderer = t96Var.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        t96Var.y = false;
        t96Var.f(false, false);
    }

    @Override
    public final void M(View view) {
        t96 t96Var;
        s96 s96Var = this.b;
        if (s96Var != null && view == (t96Var = this.h)) {
            if (s96Var instanceof vo9) {
                this.r = ((vo9) s96Var).U;
                this.s = true;
                t96Var.a(s96Var);
            } else {
                oo9 oo9Var = (oo9) s96Var;
                this.n = oo9Var.b0;
                f().a = this.h.getSink();
                oo9Var.L(f());
            }
            this.b.F(1.0f);
            d(true);
        }
    }

    @Override
    public final View O() {
        return null;
    }

    @Override
    public final boolean P() {
        s96 s96Var;
        oab oabVar = this.c;
        if (oabVar != null && !oabVar.H0 && (s96Var = this.b) != null && oabVar.B0 == s96Var) {
            return true;
        }
        return false;
    }

    @Override
    public final void Q(bd8 bd8Var) {
        s96 s96Var = this.b;
        if (s96Var == null) {
            return;
        }
        if (s96Var instanceof vo9) {
            vo9 vo9Var = (vo9) s96Var;
            this.r = vo9Var.U;
            this.s = true;
            y96 y96Var = new y96(bd8Var);
            this.f = y96Var;
            vo9Var.L(y96Var);
            return;
        }
        oo9 oo9Var = (oo9) s96Var;
        this.e = new wc8(bd8Var);
        f().a = this.e;
        this.n = oo9Var.b0;
        oo9Var.L(f());
    }

    @Override
    public final int S() {
        TextureViewRenderer textureViewRenderer;
        int i;
        t96 t96Var;
        s96 s96Var = this.b;
        if (s96Var instanceof vo9) {
            int i2 = ((vo9) s96Var).W;
            if (i2 > 0) {
                return i2;
            }
            return 9;
        }
        v96 v96Var = this.d;
        if (v96Var != null && v96Var.b > 0) {
            return this.d.b;
        }
        oab oabVar = this.c;
        if (oabVar != null && (t96Var = oabVar.E0) != null) {
            textureViewRenderer = t96Var.c;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i = textureViewRenderer.rotatedFrameWidth) > 0) {
            return i;
        }
        return 9;
    }

    @Override
    public final boolean V() {
        s96 s96Var = this.b;
        if (s96Var != null && !s96Var.w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean W() {
        return true;
    }

    @Override
    public final re8 Y() {
        return null;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    public final void b(s96 s96Var) {
        s96 s96Var2 = this.b;
        if (s96Var2 != s96Var) {
            if (s96Var2 instanceof vo9) {
                ((vo9) s96Var2).Y = null;
            }
            this.b = s96Var;
            if (s96Var instanceof vo9) {
                ((vo9) s96Var).Y = new u96(this, (byte) 0);
            }
        }
    }

    @Override
    public final void c() {
        if (!this.y) {
            this.y = true;
            s96 s96Var = this.b;
            if (s96Var != null) {
                s96Var.F(0.0f);
            }
        }
    }

    public final void d(boolean z) {
        cab cabVar;
        int i;
        oab oabVar = this.c;
        if (oabVar != null && (cabVar = oabVar.s) != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            cabVar.setVisibility(i);
        }
    }

    @Override
    public final void e0() {
        boolean z;
        VideoSink videoSink;
        this.y = false;
        s96 s96Var = this.b;
        oab oabVar = this.c;
        if (this.h == null && this.n == null && !this.s) {
            z = false;
        } else {
            z = true;
        }
        this.a = null;
        b(null);
        v96 v96Var = this.d;
        if (v96Var != null) {
            v96Var.a = null;
        }
        wc8 wc8Var = this.e;
        if (wc8Var != null) {
            wc8Var.a();
            this.e = null;
        }
        if (z && oabVar != null) {
            d(false);
            if ((s96Var instanceof oo9) && (videoSink = this.n) != null) {
                ((oo9) s96Var).L(videoSink);
            }
            if ((s96Var instanceof vo9) && this.s) {
                ((vo9) s96Var).L(this.r);
            }
            this.n = null;
            this.r = null;
            this.s = false;
            y96 y96Var = this.f;
            if (y96Var != null) {
                bd8 bd8Var = y96Var.a;
                SurfaceTexture surfaceTexture = bd8Var.a;
                bd8Var.a = null;
                this.f = null;
                y96Var.c(surfaceTexture);
            }
            this.c = null;
            oabVar.o(false);
            return;
        }
        this.c = null;
        if (s96Var != null && !s96Var.w && (oabVar == null || oabVar.B0 != s96Var)) {
            if (!s96Var.n && s96Var != s96.N) {
                s96Var.h();
            } else {
                s96Var.d();
            }
        }
        y96 y96Var2 = this.f;
        if (y96Var2 != null) {
            bd8 bd8Var2 = y96Var2.a;
            SurfaceTexture surfaceTexture2 = bd8Var2.a;
            bd8Var2.a = null;
            this.f = null;
            y96Var2.c(surfaceTexture2);
        }
    }

    public final v96 f() {
        v96 v96Var = this.d;
        if (v96Var == null) {
            v96 v96Var2 = new v96(this);
            this.d = v96Var2;
            return v96Var2;
        }
        return v96Var;
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean i() {
        return !this.y;
    }

    @Override
    public final void j() {
        if (this.y) {
            this.y = false;
            s96 s96Var = this.b;
            if (s96Var != null) {
                s96Var.F(1.0f);
            }
        }
    }

    @Override
    public final long k() {
        return 0L;
    }

    @Override
    public final void l(View view) {
        VideoSink videoSink;
        d(false);
        if (view == this.h) {
            v96 v96Var = this.d;
            if (v96Var != null) {
                v96Var.a = null;
            }
            s96 s96Var = this.b;
            if ((s96Var instanceof oo9) && (videoSink = this.n) != null) {
                ((oo9) s96Var).L(videoSink);
            }
            s96 s96Var2 = this.b;
            if ((s96Var2 instanceof vo9) && this.s) {
                ((vo9) s96Var2).L(this.r);
            }
            this.n = null;
            this.r = null;
            this.s = false;
            this.h = null;
        }
    }

    @Override
    public final void m0(View view) {
        this.h = (t96) view;
    }

    @Override
    public final void n0() {
        LaunchActivity launchActivity;
        s96 s96Var = this.b;
        if (s96Var != null) {
            int i = s96Var.e;
            if (!s96Var.w) {
                if (i != z8c.t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.N0(i);
                }
                d S = LaunchActivity.S();
                TL_stories.StoryItem t = oc7.r1(i).N1().t(s96Var.c, s96Var.b);
                if (t == null) {
                    t = s96Var.a;
                }
                if (S != null && t != null && S.getContext() != null) {
                    S.getOrCreateStoryViewer().E(i, S.getContext(), t, null);
                    return;
                }
                ad8 ad8Var = this.a;
                if (ad8Var != null) {
                    ad8Var.b();
                    return;
                }
                return;
            }
        }
        ad8 ad8Var2 = this.a;
        if (ad8Var2 != null) {
            ad8Var2.b();
        }
    }

    @Override
    public final int o0() {
        TextureViewRenderer textureViewRenderer;
        int i;
        t96 t96Var;
        s96 s96Var = this.b;
        if (s96Var instanceof vo9) {
            int i2 = ((vo9) s96Var).X;
            if (i2 > 0) {
                return i2;
            }
            return 16;
        }
        v96 v96Var = this.d;
        if (v96Var != null && v96Var.c > 0) {
            return this.d.c;
        }
        oab oabVar = this.c;
        if (oabVar != null && (t96Var = oabVar.E0) != null) {
            textureViewRenderer = t96Var.c;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i = textureViewRenderer.rotatedFrameHeight) > 0) {
            return i;
        }
        return 16;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final float p0() {
        return 0.0f;
    }

    @Override
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        VideoSink videoSink;
        if (this.f != null) {
            s96 s96Var = this.b;
            if ((s96Var instanceof vo9) && this.s) {
                ((vo9) s96Var).L(this.r);
            }
            this.r = null;
            this.s = false;
            y96 y96Var = this.f;
            this.f = null;
            if (y96Var != null) {
                y96Var.c(surfaceTexture);
                return;
            } else {
                surfaceTexture.release();
                return;
            }
        }
        wc8 wc8Var = this.e;
        this.e = null;
        v96 v96Var = this.d;
        if (v96Var != null) {
            v96Var.a = null;
        }
        s96 s96Var2 = this.b;
        if ((s96Var2 instanceof oo9) && (videoSink = this.n) != null) {
            ((oo9) s96Var2).L(videoSink);
        }
        this.n = null;
        if (wc8Var != null) {
            wc8Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final void R() {
    }

    @Override
    public final void B0(int i) {
    }

    @Override
    public final void T(float f) {
    }

    @Override
    public final void e(long j) {
    }

    @Override
    public final void q0(int i, ArrayList arrayList) {
    }

    @Override
    public final void u0(Canvas canvas, int i, int i2) {
    }
}
