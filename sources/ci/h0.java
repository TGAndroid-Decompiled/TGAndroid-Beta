package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ls0;
public final class h0 implements lg.e {
    public final int f4747a;
    public final FrameLayout f4748b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f4747a = i10;
        this.f4748b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f4747a;
        FrameLayout frameLayout = this.f4748b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f4805f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                df0 df0Var = ((ef0) frameLayout).f23946a;
                if (df0Var != null) {
                    PhotoViewer photoViewer = ((ls0) df0Var).f35409a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f4747a) {
            case 0:
                ((j0) this.f4748b).f4805f.o();
                return;
            case 1:
                ((m0) this.f4748b).h.o();
                return;
            default:
                ((ef0) this.f4748b).f23947b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f4747a) {
            case 0:
                ((j0) this.f4748b).f4805f.f14323a.g(1, true);
                return;
            case 1:
                ((m0) this.f4748b).h.f14323a.g(1, true);
                return;
            default:
                ((ef0) this.f4748b).f23947b.f14323a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f4747a;
        FrameLayout frameLayout = this.f4748b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f4805f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.e.invalidate();
                return m11;
            default:
                df0 df0Var = ((ef0) frameLayout).f23946a;
                if (df0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ls0) df0Var).f35409a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f4747a) {
            case 0:
                ((j0) this.f4748b).f4805f.k();
                return;
            case 1:
                ((m0) this.f4748b).h.k();
                return;
            default:
                ((ef0) this.f4748b).f23947b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f4747a) {
            case 0:
                ((j0) this.f4748b).f4805f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f4748b).h.setRotation(f7);
                return;
            default:
                ef0 ef0Var = (ef0) this.f4748b;
                ef0Var.f23947b.setRotation(f7);
                ef0Var.getClass();
                df0 df0Var = ef0Var.f23946a;
                if (df0Var != null) {
                    ((ls0) df0Var).a(false);
                    return;
                }
                return;
        }
    }
}
