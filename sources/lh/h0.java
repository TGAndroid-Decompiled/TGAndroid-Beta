package lh;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.rr0;

public final class h0 implements uf.d {

    public final int f16052a;

    public final FrameLayout f16053b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f16052a = i10;
        this.f16053b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f16052a;
        FrameLayout frameLayout = this.f16053b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f16153f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.f16368e.invalidate();
                return m0Var.h.j();
            default:
                fe0 fe0Var = ((ge0) frameLayout).f28601a;
                if (fe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((rr0) fe0Var).f42322a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.N0();
        }
    }

    @Override
    public final void b() {
        switch (this.f16052a) {
            case 0:
                ((j0) this.f16053b).f16153f.o();
                break;
            case 1:
                ((m0) this.f16053b).h.o();
                break;
            default:
                ((ge0) this.f16053b).f28602b.o();
                break;
        }
    }

    @Override
    public final void c() {
        switch (this.f16052a) {
            case 0:
                ((j0) this.f16053b).f16153f.f48626a.g(1, true);
                break;
            case 1:
                ((m0) this.f16053b).h.f48626a.g(1, true);
                break;
            default:
                ((ge0) this.f16053b).f28602b.f48626a.g(1, true);
                break;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f16052a;
        FrameLayout frameLayout = this.f16053b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f16153f;
                boolean zM = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return zM;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean zM2 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.f16368e.invalidate();
                return zM2;
            default:
                fe0 fe0Var = ((ge0) frameLayout).f28601a;
                if (fe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((rr0) fe0Var).f42322a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f16052a) {
            case 0:
                ((j0) this.f16053b).f16153f.k();
                break;
            case 1:
                ((m0) this.f16053b).h.k();
                break;
            default:
                ((ge0) this.f16053b).f28602b.k();
                break;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f16052a) {
            case 0:
                ((j0) this.f16053b).f16153f.setRotation(f10);
                break;
            case 1:
                ((m0) this.f16053b).h.setRotation(f10);
                break;
            default:
                ge0 ge0Var = (ge0) this.f16053b;
                ge0Var.f28602b.setRotation(f10);
                ge0Var.getClass();
                fe0 fe0Var = ge0Var.f28601a;
                if (fe0Var != null) {
                    ((rr0) fe0Var).a(false);
                }
                break;
        }
    }
}
