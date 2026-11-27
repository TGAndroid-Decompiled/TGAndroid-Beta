package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoSink;
public final class ba6 implements je8 {
    public static ba6 E;
    public me8 a;
    public w96 b;
    public lcb c;
    public aa6 d;
    public ke8 e;
    public da6 f;
    public x96 h;
    public VideoSink n;
    public qr9 r;
    public boolean s;
    public final y96 w = new y96(this, (byte) 1);
    public LaunchActivity x;
    public boolean y;

    public static boolean a(w96 w96Var) {
        me8 me8Var;
        ba6 ba6Var = E;
        if (w96Var != null && ba6Var != null && ba6Var.b == w96Var && (me8Var = ba6Var.a) != null && me8Var.f() && ba6Var.a.c != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean A0() {
        return true;
    }

    @Override
    public final boolean E() {
        return true;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        return false;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void J(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View K(LaunchActivity launchActivity) {
        int i;
        w96 w96Var = this.b;
        if (w96Var != null) {
            i = w96Var.e;
        } else {
            i = yac.t0;
        }
        return new x96(launchActivity, i);
    }

    @Override
    public final void L(View view) {
        if (view == this.h) {
            aa6 aa6Var = this.d;
            if (aa6Var != null) {
                aa6Var.a = null;
            }
            this.h = null;
        }
        x96 x96Var = (x96) view;
        bnb bnbVar = x96Var.c;
        if (bnbVar != null) {
            bnbVar.e();
        }
        x96Var.y = false;
        x96Var.f(false, false);
    }

    @Override
    public final void N(View view) {
        x96 x96Var;
        w96 w96Var = this.b;
        if (w96Var != null && view == (x96Var = this.h)) {
            if (w96Var instanceof kq9) {
                this.r = ((kq9) w96Var).U;
                this.s = true;
                x96Var.a(w96Var);
            } else {
                dq9 dq9Var = (dq9) w96Var;
                this.n = dq9Var.b0;
                e().a = this.h.getSink();
                dq9Var.L(e());
            }
            this.b.F(1.0f);
            d(true);
        }
    }

    @Override
    public final View P() {
        return null;
    }

    @Override
    public final boolean Q() {
        w96 w96Var;
        lcb lcbVar = this.c;
        if (lcbVar != null && !lcbVar.H0 && (w96Var = this.b) != null && lcbVar.B0 == w96Var) {
            return true;
        }
        return false;
    }

    @Override
    public final void R(ne8 ne8Var) {
        w96 w96Var = this.b;
        if (w96Var == null) {
            return;
        }
        if (w96Var instanceof kq9) {
            kq9 kq9Var = (kq9) w96Var;
            this.r = kq9Var.U;
            this.s = true;
            da6 da6Var = new da6(ne8Var);
            this.f = da6Var;
            kq9Var.L(da6Var);
            return;
        }
        dq9 dq9Var = (dq9) w96Var;
        this.e = new ke8(ne8Var);
        e().a = this.e;
        this.n = dq9Var.b0;
        dq9Var.L(e());
    }

    @Override
    public final int S() {
        return 0;
    }

    @Override
    public final int U() {
        bnb bnbVar;
        int i;
        x96 x96Var;
        w96 w96Var = this.b;
        if (w96Var instanceof kq9) {
            int i2 = ((kq9) w96Var).W;
            if (i2 > 0) {
                return i2;
            }
            return 9;
        }
        aa6 aa6Var = this.d;
        if (aa6Var != null && aa6Var.b > 0) {
            return this.d.b;
        }
        lcb lcbVar = this.c;
        if (lcbVar != null && (x96Var = lcbVar.E0) != null) {
            bnbVar = x96Var.c;
        } else {
            bnbVar = null;
        }
        if (bnbVar != null && (i = bnbVar.e) > 0) {
            return i;
        }
        return 9;
    }

    @Override
    public final boolean X() {
        w96 w96Var = this.b;
        if (w96Var != null && !w96Var.w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y() {
        return true;
    }

    @Override
    public final dg8 a0() {
        return null;
    }

    @Override
    public final void b() {
        if (!this.y) {
            this.y = true;
            w96 w96Var = this.b;
            if (w96Var != null) {
                w96Var.F(0.0f);
            }
        }
    }

    public final void c(w96 w96Var) {
        w96 w96Var2 = this.b;
        if (w96Var2 != w96Var) {
            if (w96Var2 instanceof kq9) {
                ((kq9) w96Var2).Y = null;
            }
            this.b = w96Var;
            if (w96Var instanceof kq9) {
                ((kq9) w96Var).Y = new y96(this, (byte) 0);
            }
        }
    }

    public final void d(boolean z) {
        zbb zbbVar;
        int i;
        lcb lcbVar = this.c;
        if (lcbVar != null && (zbbVar = lcbVar.s) != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            zbbVar.setVisibility(i);
        }
    }

    @Override
    public final boolean d0() {
        return false;
    }

    public final aa6 e() {
        aa6 aa6Var = this.d;
        if (aa6Var == null) {
            aa6 aa6Var2 = new aa6(this);
            this.d = aa6Var2;
            return aa6Var2;
        }
        return aa6Var;
    }

    @Override
    public final void g0() {
        boolean z;
        VideoSink videoSink;
        this.y = false;
        w96 w96Var = this.b;
        lcb lcbVar = this.c;
        if (this.h == null && this.n == null && !this.s) {
            z = false;
        } else {
            z = true;
        }
        this.a = null;
        c(null);
        aa6 aa6Var = this.d;
        if (aa6Var != null) {
            aa6Var.a = null;
        }
        ke8 ke8Var = this.e;
        if (ke8Var != null) {
            ke8Var.a();
            this.e = null;
        }
        if (z && lcbVar != null) {
            d(false);
            if ((w96Var instanceof dq9) && (videoSink = this.n) != null) {
                ((dq9) w96Var).L(videoSink);
            }
            if ((w96Var instanceof kq9) && this.s) {
                ((kq9) w96Var).L(this.r);
            }
            this.n = null;
            this.r = null;
            this.s = false;
            da6 da6Var = this.f;
            if (da6Var != null) {
                ne8 ne8Var = da6Var.a;
                SurfaceTexture surfaceTexture = ne8Var.a;
                ne8Var.a = null;
                this.f = null;
                da6Var.c(surfaceTexture);
            }
            this.c = null;
            lcbVar.o(false);
            return;
        }
        this.c = null;
        if (w96Var != null && !w96Var.w && (lcbVar == null || lcbVar.B0 != w96Var)) {
            if (!w96Var.n && w96Var != w96.N) {
                w96Var.h();
            } else {
                w96Var.d();
            }
        }
        da6 da6Var2 = this.f;
        if (da6Var2 != null) {
            ne8 ne8Var2 = da6Var2.a;
            SurfaceTexture surfaceTexture2 = ne8Var2.a;
            ne8Var2.a = null;
            this.f = null;
            da6Var2.c(surfaceTexture2);
        }
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
            w96 w96Var = this.b;
            if (w96Var != null) {
                w96Var.F(1.0f);
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
            aa6 aa6Var = this.d;
            if (aa6Var != null) {
                aa6Var.a = null;
            }
            w96 w96Var = this.b;
            if ((w96Var instanceof dq9) && (videoSink = this.n) != null) {
                ((dq9) w96Var).L(videoSink);
            }
            w96 w96Var2 = this.b;
            if ((w96Var2 instanceof kq9) && this.s) {
                ((kq9) w96Var2).L(this.r);
            }
            this.n = null;
            this.r = null;
            this.s = false;
            this.h = null;
        }
    }

    @Override
    public final void o0(View view) {
        this.h = (x96) view;
    }

    @Override
    public final void p0() {
        LaunchActivity launchActivity;
        w96 w96Var = this.b;
        if (w96Var != null) {
            int i = w96Var.e;
            if (!w96Var.w) {
                if (i != yac.t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.N0(i);
                }
                e S = LaunchActivity.S();
                TL_stories.StoryItem t = uc7.s1(i).O1().t(w96Var.c, w96Var.b);
                if (t == null) {
                    t = w96Var.a;
                }
                if (S != null && t != null && S.getContext() != null) {
                    S.getOrCreateStoryViewer().E(i, S.getContext(), t, null);
                    return;
                }
                me8 me8Var = this.a;
                if (me8Var != null) {
                    me8Var.b();
                    return;
                }
                return;
            }
        }
        me8 me8Var2 = this.a;
        if (me8Var2 != null) {
            me8Var2.b();
        }
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final int q0() {
        bnb bnbVar;
        int i;
        x96 x96Var;
        w96 w96Var = this.b;
        if (w96Var instanceof kq9) {
            int i2 = ((kq9) w96Var).X;
            if (i2 > 0) {
                return i2;
            }
            return 16;
        }
        aa6 aa6Var = this.d;
        if (aa6Var != null && aa6Var.c > 0) {
            return this.d.c;
        }
        lcb lcbVar = this.c;
        if (lcbVar != null && (x96Var = lcbVar.E0) != null) {
            bnbVar = x96Var.c;
        } else {
            bnbVar = null;
        }
        if (bnbVar != null && (i = bnbVar.f) > 0) {
            return i;
        }
        return 16;
    }

    @Override
    public final float r0() {
        return 0.0f;
    }

    @Override
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        VideoSink videoSink;
        if (this.f != null) {
            w96 w96Var = this.b;
            if ((w96Var instanceof kq9) && this.s) {
                ((kq9) w96Var).L(this.r);
            }
            this.r = null;
            this.s = false;
            da6 da6Var = this.f;
            this.f = null;
            if (da6Var != null) {
                da6Var.c(surfaceTexture);
                return;
            } else {
                surfaceTexture.release();
                return;
            }
        }
        ke8 ke8Var = this.e;
        this.e = null;
        aa6 aa6Var = this.d;
        if (aa6Var != null) {
            aa6Var.a = null;
        }
        w96 w96Var2 = this.b;
        if ((w96Var2 instanceof dq9) && (videoSink = this.n) != null) {
            ((dq9) w96Var2).L(videoSink);
        }
        this.n = null;
        if (ke8Var != null) {
            ke8Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void G0(int i) {
    }

    @Override
    public final void V(float f) {
    }

    @Override
    public final void g(long j) {
    }

    @Override
    public final void u0(int i, ArrayList arrayList) {
    }

    @Override
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
