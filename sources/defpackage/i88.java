package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class i88 extends lbc {
    public final byte n0;
    public final gk7 o0;

    public i88(gk7 gk7Var, byte b) {
        this.n0 = b;
        this.o0 = gk7Var;
    }

    @Override
    public final void f0() {
        byte b = this.n0;
        gk7 gk7Var = this.o0;
        switch (b) {
            case 0:
                super.f0();
                PhotoViewer photoViewer = (PhotoViewer) gk7Var;
                if (photoViewer.u4 == 0) {
                    photoViewer.p1(false);
                }
                if (!photoViewer.U8) {
                    fo.F(S());
                    fo.z(false);
                    return;
                }
                return;
            default:
                super.f0();
                ((SecretMediaViewer) gk7Var).V.a(false, true);
                return;
        }
    }

    @Override
    public final void g0() {
        byte b = this.n0;
        gk7 gk7Var = this.o0;
        switch (b) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) gk7Var;
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.p1(true);
                if (!photoViewer.U8) {
                    fo.F(S());
                    fo.z(true);
                    return;
                }
                return;
            default:
                super.g0();
                ((SecretMediaViewer) gk7Var).V.a(true, true);
                return;
        }
    }

    @Override
    public final void o0(long j) {
        switch (this.n0) {
            case 0:
                p0(j, false);
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                if (photoViewer.s1) {
                    photoViewer.A1(j);
                }
                if (!photoViewer.U8) {
                    fo.F(j);
                    return;
                }
                return;
            default:
                super.o0(j);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        zb8 g;
        switch (this.n0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                boolean z = true;
                photoViewer.S = true;
                if (photoViewer.E2) {
                    photoViewer.f0.invalidate();
                }
                photoViewer.M2();
                if (!fo.w() && !photoViewer.r) {
                    z = false;
                }
                s0(z);
                if (!photoViewer.U8) {
                    fo.F(S());
                    y54 y54Var = this.d;
                    float f = 1.0f;
                    if (y54Var != null && (g = y54Var.g()) != null) {
                        f = g.a;
                    }
                    fo.B(f);
                    return;
                }
                return;
            default:
                super.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public final void t0(boolean z) {
        switch (this.n0) {
            case 1:
                super.t0(z);
                ((SecretMediaViewer) this.o0).V.a(z, true);
                return;
            default:
                super.t0(z);
                return;
        }
    }

    @Override
    public final void u0(float f) {
        switch (this.n0) {
            case 0:
                super.u0(f);
                if (!((PhotoViewer) this.o0).U8) {
                    fo.B(f);
                    return;
                }
                return;
            default:
                super.u0(f);
                return;
        }
    }
}
