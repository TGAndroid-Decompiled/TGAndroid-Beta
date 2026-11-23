package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fo0;
public final class q0 implements og.e {
    public final int f15201a;
    public final FrameLayout f15202b;

    public q0(int i7, FrameLayout frameLayout) {
        this.f15201a = i7;
        this.f15202b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i7 = this.f15201a;
        FrameLayout frameLayout = this.f15202b;
        switch (i7) {
            case 0:
                s0 s0Var = (s0) frameLayout;
                s0Var.d.invalidate();
                return s0Var.f15356f.j();
            case 1:
                w0 w0Var = (w0) frameLayout;
                w0Var.f15635e.invalidate();
                return w0Var.h.j();
            default:
                pd0 pd0Var = ((qd0) frameLayout).f38810a;
                if (pd0Var != null) {
                    PhotoViewer photoViewer = ((fo0) pd0Var).f47939a;
                    Drawable[] drawableArr = PhotoViewer.f43272f9;
                    return photoViewer.H0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f15201a) {
            case 0:
                ((s0) this.f15202b).f15356f.o();
                return;
            case 1:
                ((w0) this.f15202b).h.o();
                return;
            default:
                ((qd0) this.f15202b).f38811b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f15201a) {
            case 0:
                ((s0) this.f15202b).f15356f.f21987a.g(1, true);
                return;
            case 1:
                ((w0) this.f15202b).h.f21987a.g(1, true);
                return;
            default:
                ((qd0) this.f15202b).f38811b.f21987a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i7 = this.f15201a;
        FrameLayout frameLayout = this.f15202b;
        switch (i7) {
            case 0:
                s0 s0Var = (s0) frameLayout;
                p0 p0Var = s0Var.f15356f;
                boolean m10 = p0Var.m(-90.0f);
                p0Var.i();
                s0Var.d.invalidate();
                return m10;
            case 1:
                w0 w0Var = (w0) frameLayout;
                p0 p0Var2 = w0Var.h;
                boolean m11 = p0Var2.m(-90.0f);
                p0Var2.i();
                w0Var.f15635e.invalidate();
                return m11;
            default:
                pd0 pd0Var = ((qd0) frameLayout).f38810a;
                if (pd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((fo0) pd0Var).f47939a;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f15201a) {
            case 0:
                ((s0) this.f15202b).f15356f.k();
                return;
            case 1:
                ((w0) this.f15202b).h.k();
                return;
            default:
                ((qd0) this.f15202b).f38811b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f15201a) {
            case 0:
                ((s0) this.f15202b).f15356f.setRotation(f10);
                return;
            case 1:
                ((w0) this.f15202b).h.setRotation(f10);
                return;
            default:
                qd0 qd0Var = (qd0) this.f15202b;
                qd0Var.f38811b.setRotation(f10);
                qd0Var.getClass();
                pd0 pd0Var = qd0Var.f38810a;
                if (pd0Var != null) {
                    ((fo0) pd0Var).k(false);
                    return;
                }
                return;
        }
    }
}
