package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.um0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class g1 implements wi.l {
    public static g1 f11723w;
    public wi.n f11724a;
    public e1 f11725b;
    public i9 f11726c;
    public org.telegram.ui.Components.voip.u0 f11727e;
    public hi.r3 f11728f;
    public VideoSink h;
    public LaunchActivity f11730r;
    public boolean f11731s;
    public final f1 d = new f1(this);
    public final c1 f11729n = new c1(this, 1);

    public static boolean e(e1 e1Var) {
        wi.n nVar;
        g1 g1Var = f11723w;
        if (e1Var == null || g1Var == null || g1Var.f11725b != e1Var || (nVar = g1Var.f11724a) == null || !nVar.d() || g1Var.f11724a.f59424c == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void A(View view) {
        hi.r3 r3Var;
        e1 e1Var = this.f11725b;
        if (e1Var != null && view == (r3Var = this.f11728f)) {
            this.h = e1Var.P;
            this.d.f11691a = r3Var.getSink();
            this.f11725b.s(this.d);
            this.f11725b.v(1.0f);
            g(true);
        }
    }

    @Override
    public final void C(SurfaceTexture surfaceTexture) {
        VideoSink videoSink;
        org.telegram.ui.Components.voip.u0 u0Var = this.f11727e;
        this.f11727e = null;
        this.d.f11691a = null;
        e1 e1Var = this.f11725b;
        if (e1Var != null && (videoSink = this.h) != null) {
            e1Var.s(videoSink);
        }
        this.h = null;
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final View D() {
        return null;
    }

    @Override
    public final boolean F() {
        e1 e1Var;
        i9 i9Var = this.f11726c;
        if (i9Var != null && !i9Var.H0 && (e1Var = this.f11725b) != null && i9Var.B0 == e1Var) {
            return true;
        }
        return false;
    }

    @Override
    public final int L() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        hi.r3 r3Var;
        if (this.d.f11692b > 0) {
            return this.d.f11692b;
        }
        i9 i9Var = this.f11726c;
        if (i9Var != null && (r3Var = i9Var.E0) != null) {
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
        e1 e1Var = this.f11725b;
        if (e1Var != null && !e1Var.f11662x) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean P() {
        return true;
    }

    @Override
    public final e2.c1 R() {
        return null;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void V() {
        boolean z10;
        VideoSink videoSink;
        this.f11731s = false;
        e1 e1Var = this.f11725b;
        i9 i9Var = this.f11726c;
        if (this.f11728f == null && this.h == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f11724a = null;
        this.f11725b = null;
        this.d.f11691a = null;
        org.telegram.ui.Components.voip.u0 u0Var = this.f11727e;
        if (u0Var != null) {
            u0Var.a();
            this.f11727e = null;
        }
        if (z10 && i9Var != null) {
            g(false);
            if (e1Var != null && (videoSink = this.h) != null) {
                e1Var.s(videoSink);
            }
            this.h = null;
            this.f11726c = null;
            i9Var.u(false);
            return;
        }
        this.f11726c = null;
        if (e1Var != null && !e1Var.f11662x) {
            if (i9Var == null || i9Var.B0 != e1Var) {
                if (!e1Var.f11658n && e1Var != e1.X) {
                    e1Var.e();
                } else {
                    e1Var.s(null);
                }
            }
        }
    }

    @Override
    public final boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override
    public final void Y(View view) {
        this.f11728f = (hi.r3) view;
    }

    @Override
    public final void Z() {
        LaunchActivity launchActivity;
        e1 e1Var = this.f11725b;
        if (e1Var != null) {
            int i7 = e1Var.f11656e;
            if (!e1Var.f11662x) {
                if (i7 != m10.f24934t0 && (launchActivity = LaunchActivity.H1) != null) {
                    launchActivity.O0(i7);
                }
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                TL_stories.StoryItem u10 = np.s1(i7).P1().u(e1Var.f11655c, e1Var.f11654b);
                if (u10 == null) {
                    u10 = e1Var.f11653a;
                }
                if (T != null && u10 != null && T.getContext() != null) {
                    T.getOrCreateStoryViewer().G(i7, T.getContext(), u10, null);
                    return;
                }
                wi.n nVar = this.f11724a;
                if (nVar != null) {
                    nVar.b();
                    return;
                }
                return;
            }
        }
        wi.n nVar2 = this.f11724a;
        if (nVar2 != null) {
            nVar2.b();
        }
    }

    @Override
    public final void a(View view) {
        VideoSink videoSink;
        g(false);
        if (view == this.f11728f) {
            this.d.f11691a = null;
            e1 e1Var = this.f11725b;
            if (e1Var != null && (videoSink = this.h) != null) {
                e1Var.s(videoSink);
            }
            this.h = null;
            this.f11728f = null;
        }
    }

    @Override
    public final void b() {
        if (!this.f11731s) {
            this.f11731s = true;
            e1 e1Var = this.f11725b;
            if (e1Var != null) {
                e1Var.v(0.0f);
            }
        }
    }

    @Override
    public final int b0() {
        TextureViewRenderer textureViewRenderer;
        int i7;
        hi.r3 r3Var;
        if (this.d.f11693c > 0) {
            return this.d.f11693c;
        }
        i9 i9Var = this.f11726c;
        if (i9Var != null && (r3Var = i9Var.E0) != null) {
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
    public final float c0() {
        return 0.0f;
    }

    @Override
    public final int d() {
        return 0;
    }

    @Override
    public final void f() {
        if (this.f11731s) {
            this.f11731s = false;
            e1 e1Var = this.f11725b;
            if (e1Var != null) {
                e1Var.v(1.0f);
            }
        }
    }

    public final void g(boolean z10) {
        w8 w8Var;
        int i7;
        i9 i9Var = this.f11726c;
        if (i9Var != null && (w8Var = i9Var.f11870s) != null) {
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            w8Var.setVisibility(i7);
        }
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h() {
        return !this.f11731s;
    }

    @Override
    public final void j(wi.o oVar) {
        if (this.f11725b == null) {
            return;
        }
        org.telegram.ui.Components.voip.u0 u0Var = new org.telegram.ui.Components.voip.u0(oVar);
        this.f11727e = u0Var;
        this.d.f11691a = u0Var;
        e1 e1Var = this.f11725b;
        this.h = e1Var.P;
        e1Var.s(this.d);
    }

    @Override
    public final long l() {
        return 0L;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View w(LaunchActivity launchActivity) {
        int i7;
        e1 e1Var = this.f11725b;
        if (e1Var != null) {
            i7 = e1Var.f11656e;
        } else {
            i7 = m10.f24934t0;
        }
        return new hi.r3(launchActivity, i7);
    }

    @Override
    public final void x(View view) {
        if (view == this.f11728f) {
            this.d.f11691a = null;
            this.f11728f = null;
        }
        hi.r3 r3Var = (hi.r3) view;
        TextureViewRenderer textureViewRenderer = r3Var.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = r3Var.f14974c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        r3Var.f14978r = false;
        r3Var.c(false, false);
    }

    @Override
    public final void M(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void u0(int i7) {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void j0(int i7, ArrayList arrayList) {
    }

    @Override
    public final void o0(Canvas canvas, int i7, int i10) {
    }
}
