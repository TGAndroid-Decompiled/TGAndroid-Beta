package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.os0;
public final class h0 implements lg.e {
    public final int f5126a;
    public final FrameLayout f5127b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f5126a = i10;
        this.f5127b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f5126a;
        FrameLayout frameLayout = this.f5127b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f5192f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.f5547e.invalidate();
                return m0Var.h.j();
            default:
                ff0 ff0Var = ((gf0) frameLayout).f26850a;
                if (ff0Var != null) {
                    PhotoViewer photoViewer = ((os0) ff0Var).f39272a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f5126a) {
            case 0:
                ((j0) this.f5127b).f5192f.o();
                return;
            case 1:
                ((m0) this.f5127b).h.o();
                return;
            default:
                ((gf0) this.f5127b).f26851b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f5126a) {
            case 0:
                ((j0) this.f5127b).f5192f.f15575a.g(1, true);
                return;
            case 1:
                ((m0) this.f5127b).h.f15575a.g(1, true);
                return;
            default:
                ((gf0) this.f5127b).f26851b.f15575a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f5126a;
        FrameLayout frameLayout = this.f5127b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f5192f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.f5547e.invalidate();
                return m11;
            default:
                ff0 ff0Var = ((gf0) frameLayout).f26850a;
                if (ff0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((os0) ff0Var).f39272a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f5126a) {
            case 0:
                ((j0) this.f5127b).f5192f.k();
                return;
            case 1:
                ((m0) this.f5127b).h.k();
                return;
            default:
                ((gf0) this.f5127b).f26851b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f5126a) {
            case 0:
                ((j0) this.f5127b).f5192f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f5127b).h.setRotation(f7);
                return;
            default:
                gf0 gf0Var = (gf0) this.f5127b;
                gf0Var.f26851b.setRotation(f7);
                gf0Var.getClass();
                ff0 ff0Var = gf0Var.f26850a;
                if (ff0Var != null) {
                    ((os0) ff0Var).a(false);
                    return;
                }
                return;
        }
    }
}
