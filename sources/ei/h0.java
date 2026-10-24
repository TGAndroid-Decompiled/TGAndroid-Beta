package ei;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bs0;
public final class h0 implements mg.e {
    public final int f9152a;
    public final FrameLayout f9153b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f9152a = i10;
        this.f9153b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f9152a;
        FrameLayout frameLayout = this.f9153b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f9233f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                pf0 pf0Var = ((qf0) frameLayout).f29902a;
                if (pf0Var != null) {
                    PhotoViewer photoViewer = ((bs0) pf0Var).f36134a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.P0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f9152a) {
            case 0:
                ((j0) this.f9153b).f9233f.o();
                return;
            case 1:
                ((m0) this.f9153b).h.o();
                return;
            default:
                ((qf0) this.f9153b).f29903b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f9152a) {
            case 0:
                ((j0) this.f9153b).f9233f.f16980a.g(1, true);
                return;
            case 1:
                ((m0) this.f9153b).h.f16980a.g(1, true);
                return;
            default:
                ((qf0) this.f9153b).f29903b.f16980a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f9152a;
        FrameLayout frameLayout = this.f9153b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f9233f;
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
                pf0 pf0Var = ((qf0) frameLayout).f29902a;
                if (pf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((bs0) pf0Var).f36134a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.Q0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f9152a) {
            case 0:
                ((j0) this.f9153b).f9233f.k();
                return;
            case 1:
                ((m0) this.f9153b).h.k();
                return;
            default:
                ((qf0) this.f9153b).f29903b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f9152a) {
            case 0:
                ((j0) this.f9153b).f9233f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f9153b).h.setRotation(f7);
                return;
            default:
                qf0 qf0Var = (qf0) this.f9153b;
                qf0Var.f29903b.setRotation(f7);
                qf0Var.getClass();
                pf0 pf0Var = qf0Var.f29902a;
                if (pf0Var != null) {
                    ((bs0) pf0Var).e(false);
                    return;
                }
                return;
        }
    }
}
