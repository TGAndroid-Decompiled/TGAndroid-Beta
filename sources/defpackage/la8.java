package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class la8 extends ndc {
    public final byte n0;
    public final jm7 o0;

    public la8(jm7 jm7Var, byte b) {
        this.n0 = b;
        this.o0 = jm7Var;
    }

    @Override
    public final void f0() {
        byte b = this.n0;
        jm7 jm7Var = this.o0;
        switch (b) {
            case 0:
                super.f0();
                PhotoViewer photoViewer = (PhotoViewer) jm7Var;
                if (photoViewer.t4 == 0) {
                    photoViewer.q1(false);
                }
                if (!photoViewer.T8) {
                    fp.F(S());
                    fp.z(false);
                    return;
                }
                return;
            default:
                super.f0();
                ((SecretMediaViewer) jm7Var).V.a(false, true);
                return;
        }
    }

    @Override
    public final void g0() {
        byte b = this.n0;
        jm7 jm7Var = this.o0;
        switch (b) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) jm7Var;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.q1(true);
                if (!photoViewer.T8) {
                    fp.F(S());
                    fp.z(true);
                    return;
                }
                return;
            default:
                super.g0();
                ((SecretMediaViewer) jm7Var).V.a(true, true);
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
                    photoViewer.B1(j);
                }
                if (!photoViewer.T8) {
                    fp.F(j);
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
        ce8 g;
        switch (this.n0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                boolean z = true;
                photoViewer.S = true;
                if (photoViewer.E2) {
                    photoViewer.f0.invalidate();
                }
                photoViewer.N2();
                if (!fp.w() && !photoViewer.r) {
                    z = false;
                }
                s0(z);
                if (!photoViewer.T8) {
                    fp.F(S());
                    h74 h74Var = this.d;
                    float f = 1.0f;
                    if (h74Var != null && (g = h74Var.g()) != null) {
                        f = g.a;
                    }
                    fp.B(f);
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
                if (!((PhotoViewer) this.o0).T8) {
                    fp.B(f);
                    return;
                }
                return;
            default:
                super.u0(f);
                return;
        }
    }
}
