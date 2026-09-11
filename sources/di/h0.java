package di;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ss0;
public final class h0 implements mg.e {
    public final int f7311a;
    public final FrameLayout f7312b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f7311a = i10;
        this.f7312b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f7311a;
        FrameLayout frameLayout = this.f7312b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f7414f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.f7623e.invalidate();
                return m0Var.h.j();
            default:
                te0 te0Var = ((ue0) frameLayout).f30868a;
                if (te0Var != null) {
                    PhotoViewer photoViewer = ((ss0) te0Var).f40521a;
                    Drawable[] drawableArr = PhotoViewer.T8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f7311a) {
            case 0:
                ((j0) this.f7312b).f7414f.o();
                return;
            case 1:
                ((m0) this.f7312b).h.o();
                return;
            default:
                ((ue0) this.f7312b).f30869b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f7311a) {
            case 0:
                ((j0) this.f7312b).f7414f.f16303a.g(1, true);
                return;
            case 1:
                ((m0) this.f7312b).h.f16303a.g(1, true);
                return;
            default:
                ((ue0) this.f7312b).f30869b.f16303a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f7311a;
        FrameLayout frameLayout = this.f7312b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f7414f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.f7623e.invalidate();
                return m11;
            default:
                te0 te0Var = ((ue0) frameLayout).f30868a;
                if (te0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ss0) te0Var).f40521a;
                Drawable[] drawableArr = PhotoViewer.T8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f7311a) {
            case 0:
                ((j0) this.f7312b).f7414f.k();
                return;
            case 1:
                ((m0) this.f7312b).h.k();
                return;
            default:
                ((ue0) this.f7312b).f30869b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f7311a) {
            case 0:
                ((j0) this.f7312b).f7414f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f7312b).h.setRotation(f7);
                return;
            default:
                ue0 ue0Var = (ue0) this.f7312b;
                ue0Var.f30869b.setRotation(f7);
                ue0Var.getClass();
                te0 te0Var = ue0Var.f30868a;
                if (te0Var != null) {
                    ((ss0) te0Var).a(false);
                    return;
                }
                return;
        }
    }
}
