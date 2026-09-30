package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ls0;
public final class h0 implements lg.e {
    public final int f4755a;
    public final FrameLayout f4756b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f4755a = i10;
        this.f4756b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f4755a;
        FrameLayout frameLayout = this.f4756b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f4813f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                gf0 gf0Var = ((hf0) frameLayout).f24855a;
                if (gf0Var != null) {
                    PhotoViewer photoViewer = ((ls0) gf0Var).f35499a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f4755a) {
            case 0:
                ((j0) this.f4756b).f4813f.o();
                return;
            case 1:
                ((m0) this.f4756b).h.o();
                return;
            default:
                ((hf0) this.f4756b).f24856b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f4755a) {
            case 0:
                ((j0) this.f4756b).f4813f.f14339a.g(1, true);
                return;
            case 1:
                ((m0) this.f4756b).h.f14339a.g(1, true);
                return;
            default:
                ((hf0) this.f4756b).f24856b.f14339a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f4755a;
        FrameLayout frameLayout = this.f4756b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f4813f;
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
                gf0 gf0Var = ((hf0) frameLayout).f24855a;
                if (gf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ls0) gf0Var).f35499a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f4755a) {
            case 0:
                ((j0) this.f4756b).f4813f.k();
                return;
            case 1:
                ((m0) this.f4756b).h.k();
                return;
            default:
                ((hf0) this.f4756b).f24856b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f4755a) {
            case 0:
                ((j0) this.f4756b).f4813f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f4756b).h.setRotation(f7);
                return;
            default:
                hf0 hf0Var = (hf0) this.f4756b;
                hf0Var.f24856b.setRotation(f7);
                hf0Var.getClass();
                gf0 gf0Var = hf0Var.f24855a;
                if (gf0Var != null) {
                    ((ls0) gf0Var).a(false);
                    return;
                }
                return;
        }
    }
}
