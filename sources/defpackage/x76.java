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
public final class x76 implements sa8 {
    public static x76 E;
    public xa8 a;
    public t76 b;
    public m8b c;
    public w76 d;
    public ta8 e;
    public z76 f;
    public u76 h;
    public VideoSink n;
    public zn9 r;
    public boolean s;
    public final v76 w = new v76(this, (byte) 1);
    public LaunchActivity x;
    public boolean y;

    public static boolean a(t76 t76Var) {
        xa8 xa8Var;
        x76 x76Var = E;
        if (t76Var != null && x76Var != null && x76Var.b == t76Var && (xa8Var = x76Var.a) != null && xa8Var.e() && x76Var.a.c != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final View C0() {
        return null;
    }

    @Override
    public final boolean F2() {
        return false;
    }

    @Override
    public final boolean G0() {
        t76 t76Var;
        m8b m8bVar = this.c;
        if (m8bVar != null && !m8bVar.H0 && (t76Var = this.b) != null && m8bVar.B0 == t76Var) {
            return true;
        }
        return false;
    }

    @Override
    public final void H0(ya8 ya8Var) {
        t76 t76Var = this.b;
        if (t76Var == null) {
            return;
        }
        if (t76Var instanceof um9) {
            um9 um9Var = (um9) t76Var;
            this.r = um9Var.U;
            this.s = true;
            z76 z76Var = new z76(ya8Var);
            this.f = z76Var;
            um9Var.L(z76Var);
            return;
        }
        nm9 nm9Var = (nm9) t76Var;
        this.e = new ta8(ya8Var);
        d().a = this.e;
        this.n = nm9Var.b0;
        nm9Var.L(d());
    }

    @Override
    public final void L1(View view) {
        this.h = (u76) view;
    }

    @Override
    public final void P1() {
        LaunchActivity launchActivity;
        t76 t76Var = this.b;
        if (t76Var != null) {
            int i = t76Var.e;
            if (!t76Var.w) {
                if (i != y6c.t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.N0(i);
                }
                d S = LaunchActivity.S();
                TL_stories.StoryItem t = na7.q1(i).M1().t(t76Var.c, t76Var.b);
                if (t == null) {
                    t = t76Var.a;
                }
                if (S != null && t != null && S.getContext() != null) {
                    S.getOrCreateStoryViewer().E(i, S.getContext(), t, null);
                    return;
                }
                xa8 xa8Var = this.a;
                if (xa8Var != null) {
                    xa8Var.b();
                    return;
                }
                return;
            }
        }
        xa8 xa8Var2 = this.a;
        if (xa8Var2 != null) {
            xa8Var2.b();
        }
    }

    @Override
    public final int Q0() {
        TextureViewRenderer textureViewRenderer;
        int i;
        u76 u76Var;
        t76 t76Var = this.b;
        if (t76Var instanceof um9) {
            int i2 = ((um9) t76Var).W;
            if (i2 > 0) {
                return i2;
            }
            return 9;
        }
        w76 w76Var = this.d;
        if (w76Var != null && w76Var.b > 0) {
            return this.d.b;
        }
        m8b m8bVar = this.c;
        if (m8bVar != null && (u76Var = m8bVar.E0) != null) {
            textureViewRenderer = u76Var.c;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i = textureViewRenderer.rotatedFrameWidth) > 0) {
            return i;
        }
        return 9;
    }

    @Override
    public final int S1() {
        TextureViewRenderer textureViewRenderer;
        int i;
        u76 u76Var;
        t76 t76Var = this.b;
        if (t76Var instanceof um9) {
            int i2 = ((um9) t76Var).X;
            if (i2 > 0) {
                return i2;
            }
            return 16;
        }
        w76 w76Var = this.d;
        if (w76Var != null && w76Var.c > 0) {
            return this.d.c;
        }
        m8b m8bVar = this.c;
        if (m8bVar != null && (u76Var = m8bVar.E0) != null) {
            textureViewRenderer = u76Var.c;
        } else {
            textureViewRenderer = null;
        }
        if (textureViewRenderer != null && (i = textureViewRenderer.rotatedFrameHeight) > 0) {
            return i;
        }
        return 16;
    }

    @Override
    public final boolean U() {
        return true;
    }

    @Override
    public final boolean a0(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    @Override
    public final boolean a1() {
        t76 t76Var = this.b;
        if (t76Var != null && !t76Var.w) {
            return true;
        }
        return false;
    }

    @Override
    public final float a2() {
        return 0.0f;
    }

    public final void b(t76 t76Var) {
        t76 t76Var2 = this.b;
        if (t76Var2 != t76Var) {
            if (t76Var2 instanceof um9) {
                ((um9) t76Var2).Y = null;
            }
            this.b = t76Var;
            if (t76Var instanceof um9) {
                ((um9) t76Var).Y = new v76(this, (byte) 0);
            }
        }
    }

    @Override
    public final boolean b0() {
        return false;
    }

    public final void c(boolean z) {
        a8b a8bVar;
        int i;
        m8b m8bVar = this.c;
        if (m8bVar != null && (a8bVar = m8bVar.s) != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            a8bVar.setVisibility(i);
        }
    }

    public final w76 d() {
        w76 w76Var = this.d;
        if (w76Var == null) {
            w76 w76Var2 = new w76(this);
            this.d = w76Var2;
            return w76Var2;
        }
        return w76Var;
    }

    @Override
    public final boolean d1() {
        return true;
    }

    @Override
    public final void e() {
        if (!this.y) {
            this.y = true;
            t76 t76Var = this.b;
            if (t76Var != null) {
                t76Var.F(0.0f);
            }
        }
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean j() {
        return !this.y;
    }

    @Override
    public final void k() {
        if (this.y) {
            this.y = false;
            t76 t76Var = this.b;
            if (t76Var != null) {
                t76Var.F(1.0f);
            }
        }
    }

    @Override
    public final oc8 k1() {
        return null;
    }

    @Override
    public final long m() {
        return 0L;
    }

    @Override
    public final void n(View view) {
        VideoSink videoSink;
        c(false);
        if (view == this.h) {
            w76 w76Var = this.d;
            if (w76Var != null) {
                w76Var.a = null;
            }
            t76 t76Var = this.b;
            if ((t76Var instanceof nm9) && (videoSink = this.n) != null) {
                ((nm9) t76Var).L(videoSink);
            }
            t76 t76Var2 = this.b;
            if ((t76Var2 instanceof um9) && this.s) {
                ((um9) t76Var2).L(this.r);
            }
            this.n = null;
            this.r = null;
            this.s = false;
            this.h = null;
        }
    }

    @Override
    public final void n0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View p0(LaunchActivity launchActivity) {
        int i;
        t76 t76Var = this.b;
        if (t76Var != null) {
            i = t76Var.e;
        } else {
            i = y6c.t0;
        }
        return new u76(launchActivity, i);
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final void q0(View view) {
        if (view == this.h) {
            w76 w76Var = this.d;
            if (w76Var != null) {
                w76Var.a = null;
            }
            this.h = null;
        }
        u76 u76Var = (u76) view;
        TextureViewRenderer textureViewRenderer = u76Var.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        u76Var.y = false;
        u76Var.f(false, false);
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final void u1() {
        boolean z;
        VideoSink videoSink;
        this.y = false;
        t76 t76Var = this.b;
        m8b m8bVar = this.c;
        if (this.h == null && this.n == null && !this.s) {
            z = false;
        } else {
            z = true;
        }
        this.a = null;
        b(null);
        w76 w76Var = this.d;
        if (w76Var != null) {
            w76Var.a = null;
        }
        ta8 ta8Var = this.e;
        if (ta8Var != null) {
            ta8Var.a();
            this.e = null;
        }
        if (z && m8bVar != null) {
            c(false);
            if ((t76Var instanceof nm9) && (videoSink = this.n) != null) {
                ((nm9) t76Var).L(videoSink);
            }
            if ((t76Var instanceof um9) && this.s) {
                ((um9) t76Var).L(this.r);
            }
            this.n = null;
            this.r = null;
            this.s = false;
            z76 z76Var = this.f;
            if (z76Var != null) {
                ya8 ya8Var = z76Var.a;
                SurfaceTexture surfaceTexture = ya8Var.a;
                ya8Var.a = null;
                this.f = null;
                z76Var.c(surfaceTexture);
            }
            this.c = null;
            m8bVar.o(false);
            return;
        }
        this.c = null;
        if (t76Var != null && !t76Var.w && (m8bVar == null || m8bVar.B0 != t76Var)) {
            if (!t76Var.n && t76Var != t76.N) {
                t76Var.h();
            } else {
                t76Var.d();
            }
        }
        z76 z76Var2 = this.f;
        if (z76Var2 != null) {
            ya8 ya8Var2 = z76Var2.a;
            SurfaceTexture surfaceTexture2 = ya8Var2.a;
            ya8Var2.a = null;
            this.f = null;
            z76Var2.c(surfaceTexture2);
        }
    }

    @Override
    public final void y(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        VideoSink videoSink;
        if (this.f != null) {
            t76 t76Var = this.b;
            if ((t76Var instanceof um9) && this.s) {
                ((um9) t76Var).L(this.r);
            }
            this.r = null;
            this.s = false;
            z76 z76Var = this.f;
            this.f = null;
            if (z76Var != null) {
                z76Var.c(surfaceTexture);
                return;
            } else {
                surfaceTexture.release();
                return;
            }
        }
        ta8 ta8Var = this.e;
        this.e = null;
        w76 w76Var = this.d;
        if (w76Var != null) {
            w76Var.a = null;
        }
        t76 t76Var2 = this.b;
        if ((t76Var2 instanceof nm9) && (videoSink = this.n) != null) {
            ((nm9) t76Var2).L(videoSink);
        }
        this.n = null;
        if (ta8Var != null) {
            ta8Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final void y0(View view) {
        u76 u76Var;
        t76 t76Var = this.b;
        if (t76Var != null && view == (u76Var = this.h)) {
            if (t76Var instanceof um9) {
                this.r = ((um9) t76Var).U;
                this.s = true;
                u76Var.a(t76Var);
            } else {
                nm9 nm9Var = (nm9) t76Var;
                this.n = nm9Var.b0;
                d().a = this.h.getSink();
                nm9Var.L(d());
            }
            this.b.F(1.0f);
            c(true);
        }
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void G2(int i) {
    }

    @Override
    public final void S0(float f) {
    }

    @Override
    public final void f(long j) {
    }

    @Override
    public final void o2(int i, ArrayList arrayList) {
    }

    @Override
    public final void r2(Canvas canvas, int i, int i2) {
    }
}
