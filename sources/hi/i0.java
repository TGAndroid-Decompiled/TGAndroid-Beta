package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.so0;
public final class i0 implements og.e {
    public final int f14740a;
    public final FrameLayout f14741b;

    public i0(int i7, FrameLayout frameLayout) {
        this.f14740a = i7;
        this.f14741b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i7 = this.f14740a;
        FrameLayout frameLayout = this.f14741b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                k0Var.d.invalidate();
                return k0Var.f14841f.j();
            case 1:
                n0 n0Var = (n0) frameLayout;
                n0Var.f15078e.invalidate();
                return n0Var.h.j();
            default:
                pd0 pd0Var = ((qd0) frameLayout).f38762a;
                if (pd0Var != null) {
                    PhotoViewer photoViewer = ((so0) pd0Var).f52042a;
                    Drawable[] drawableArr = PhotoViewer.Z8;
                    return photoViewer.H0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f14740a) {
            case 0:
                ((k0) this.f14741b).f14841f.o();
                return;
            case 1:
                ((n0) this.f14741b).h.o();
                return;
            default:
                ((qd0) this.f14741b).f38763b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14740a) {
            case 0:
                ((k0) this.f14741b).f14841f.f21893a.g(1, true);
                return;
            case 1:
                ((n0) this.f14741b).h.f21893a.g(1, true);
                return;
            default:
                ((qd0) this.f14741b).f38763b.f21893a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i7 = this.f14740a;
        FrameLayout frameLayout = this.f14741b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                h0 h0Var = k0Var.f14841f;
                boolean m10 = h0Var.m(-90.0f);
                h0Var.i();
                k0Var.d.invalidate();
                return m10;
            case 1:
                n0 n0Var = (n0) frameLayout;
                h0 h0Var2 = n0Var.h;
                boolean m11 = h0Var2.m(-90.0f);
                h0Var2.i();
                n0Var.f15078e.invalidate();
                return m11;
            default:
                pd0 pd0Var = ((qd0) frameLayout).f38762a;
                if (pd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((so0) pd0Var).f52042a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f14740a) {
            case 0:
                ((k0) this.f14741b).f14841f.k();
                return;
            case 1:
                ((n0) this.f14741b).h.k();
                return;
            default:
                ((qd0) this.f14741b).f38763b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f14740a) {
            case 0:
                ((k0) this.f14741b).f14841f.setRotation(f10);
                return;
            case 1:
                ((n0) this.f14741b).h.setRotation(f10);
                return;
            default:
                qd0 qd0Var = (qd0) this.f14741b;
                qd0Var.f38763b.setRotation(f10);
                qd0Var.getClass();
                pd0 pd0Var = qd0Var.f38762a;
                if (pd0Var != null) {
                    ((so0) pd0Var).n(false);
                    return;
                }
                return;
        }
    }
}
