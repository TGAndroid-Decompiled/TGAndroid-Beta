package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ms0;
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
                te0 te0Var = ((ue0) frameLayout).f28467a;
                if (te0Var != null) {
                    PhotoViewer photoViewer = ((ms0) te0Var).f35384a;
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
                ((ue0) this.f4748b).f28468b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f4747a) {
            case 0:
                ((j0) this.f4748b).f4805f.f14088a.g(1, true);
                return;
            case 1:
                ((m0) this.f4748b).h.f14088a.g(1, true);
                return;
            default:
                ((ue0) this.f4748b).f28468b.f14088a.g(1, true);
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
                te0 te0Var = ((ue0) frameLayout).f28467a;
                if (te0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ms0) te0Var).f35384a;
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
                ((ue0) this.f4748b).f28468b.k();
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
                ue0 ue0Var = (ue0) this.f4748b;
                ue0Var.f28468b.setRotation(f7);
                ue0Var.getClass();
                te0 te0Var = ue0Var.f28467a;
                if (te0Var != null) {
                    ((ms0) te0Var).a(false);
                    return;
                }
                return;
        }
    }
}
