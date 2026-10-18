package ei;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bs0;
public final class h0 implements mg.e {
    public final int f9143a;
    public final FrameLayout f9144b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f9143a = i10;
        this.f9144b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f9143a;
        FrameLayout frameLayout = this.f9144b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f9223f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                mf0 mf0Var = ((nf0) frameLayout).f28746a;
                if (mf0Var != null) {
                    PhotoViewer photoViewer = ((bs0) mf0Var).f35709a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.O0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f9143a) {
            case 0:
                ((j0) this.f9144b).f9223f.o();
                return;
            case 1:
                ((m0) this.f9144b).h.o();
                return;
            default:
                ((nf0) this.f9144b).f28747b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f9143a) {
            case 0:
                ((j0) this.f9144b).f9223f.f16916a.g(1, true);
                return;
            case 1:
                ((m0) this.f9144b).h.f16916a.g(1, true);
                return;
            default:
                ((nf0) this.f9144b).f28747b.f16916a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f9143a;
        FrameLayout frameLayout = this.f9144b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f9223f;
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
                mf0 mf0Var = ((nf0) frameLayout).f28746a;
                if (mf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((bs0) mf0Var).f35709a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f9143a) {
            case 0:
                ((j0) this.f9144b).f9223f.k();
                return;
            case 1:
                ((m0) this.f9144b).h.k();
                return;
            default:
                ((nf0) this.f9144b).f28747b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f9143a) {
            case 0:
                ((j0) this.f9144b).f9223f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f9144b).h.setRotation(f7);
                return;
            default:
                nf0 nf0Var = (nf0) this.f9144b;
                nf0Var.f28747b.setRotation(f7);
                nf0Var.getClass();
                mf0 mf0Var = nf0Var.f28746a;
                if (mf0Var != null) {
                    ((bs0) mf0Var).a(false);
                    return;
                }
                return;
        }
    }
}
