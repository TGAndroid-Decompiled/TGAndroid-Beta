package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class ac8 extends kfc {
    public final byte n0;
    public final fn7 o0;

    public ac8(fn7 fn7Var, byte b) {
        this.n0 = b;
        this.o0 = fn7Var;
    }

    @Override
    public final void f0() {
        byte b = this.n0;
        fn7 fn7Var = this.o0;
        switch (b) {
            case 0:
                super.f0();
                PhotoViewer photoViewer = (PhotoViewer) fn7Var;
                if (photoViewer.t4 == 0) {
                    photoViewer.q1(false);
                }
                if (!photoViewer.T8) {
                    go.F(S());
                    go.z(false);
                    return;
                }
                return;
            default:
                super.f0();
                ((SecretMediaViewer) fn7Var).V.a(false, true);
                return;
        }
    }

    @Override
    public final void g0() {
        byte b = this.n0;
        fn7 fn7Var = this.o0;
        switch (b) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) fn7Var;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.q1(true);
                if (!photoViewer.T8) {
                    go.F(S());
                    go.z(true);
                    return;
                }
                return;
            default:
                super.g0();
                ((SecretMediaViewer) fn7Var).V.a(true, true);
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
                    go.F(j);
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
        of8 f;
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
                if (!go.w() && !photoViewer.r) {
                    z = false;
                }
                s0(z);
                if (!photoViewer.T8) {
                    go.F(S());
                    s64 s64Var = this.d;
                    float f2 = 1.0f;
                    if (s64Var != null && (f = s64Var.f()) != null) {
                        f2 = f.a;
                    }
                    go.B(f2);
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
                    go.B(f);
                    return;
                }
                return;
            default:
                super.u0(f);
                return;
        }
    }
}
