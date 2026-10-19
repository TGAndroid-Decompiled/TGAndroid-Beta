package ei;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zr0;
public final class h0 implements mg.e {
    public final int f9144a;
    public final FrameLayout f9145b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f9144a = i10;
        this.f9145b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f9144a;
        FrameLayout frameLayout = this.f9145b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f9224f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                mf0 mf0Var = ((nf0) frameLayout).f28764a;
                if (mf0Var != null) {
                    PhotoViewer photoViewer = ((zr0) mf0Var).f43790a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.O0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f9144a) {
            case 0:
                ((j0) this.f9145b).f9224f.o();
                return;
            case 1:
                ((m0) this.f9145b).h.o();
                return;
            default:
                ((nf0) this.f9145b).f28765b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f9144a) {
            case 0:
                ((j0) this.f9145b).f9224f.f16919a.g(1, true);
                return;
            case 1:
                ((m0) this.f9145b).h.f16919a.g(1, true);
                return;
            default:
                ((nf0) this.f9145b).f28765b.f16919a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f9144a;
        FrameLayout frameLayout = this.f9145b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f9224f;
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
                mf0 mf0Var = ((nf0) frameLayout).f28764a;
                if (mf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((zr0) mf0Var).f43790a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f9144a) {
            case 0:
                ((j0) this.f9145b).f9224f.k();
                return;
            case 1:
                ((m0) this.f9145b).h.k();
                return;
            default:
                ((nf0) this.f9145b).f28765b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f9144a) {
            case 0:
                ((j0) this.f9145b).f9224f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f9145b).h.setRotation(f7);
                return;
            default:
                nf0 nf0Var = (nf0) this.f9145b;
                nf0Var.f28765b.setRotation(f7);
                nf0Var.getClass();
                mf0 mf0Var = nf0Var.f28764a;
                if (mf0Var != null) {
                    ((zr0) mf0Var).a(false);
                    return;
                }
                return;
        }
    }
}
