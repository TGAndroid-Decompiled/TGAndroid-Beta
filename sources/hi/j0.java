package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.so0;
public final class j0 implements og.e {
    public final int f14817a;
    public final FrameLayout f14818b;

    public j0(int i7, FrameLayout frameLayout) {
        this.f14817a = i7;
        this.f14818b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i7 = this.f14817a;
        FrameLayout frameLayout = this.f14818b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) frameLayout;
                l0Var.d.invalidate();
                return l0Var.f14956f.j();
            case 1:
                o0 o0Var = (o0) frameLayout;
                o0Var.f15181e.invalidate();
                return o0Var.h.j();
            default:
                qd0 qd0Var = ((rd0) frameLayout).f39163a;
                if (qd0Var != null) {
                    PhotoViewer photoViewer = ((so0) qd0Var).f52091a;
                    Drawable[] drawableArr = PhotoViewer.Z8;
                    return photoViewer.H0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f14817a) {
            case 0:
                ((l0) this.f14818b).f14956f.o();
                return;
            case 1:
                ((o0) this.f14818b).h.o();
                return;
            default:
                ((rd0) this.f14818b).f39164b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14817a) {
            case 0:
                ((l0) this.f14818b).f14956f.f21921a.g(1, true);
                return;
            case 1:
                ((o0) this.f14818b).h.f21921a.g(1, true);
                return;
            default:
                ((rd0) this.f14818b).f39164b.f21921a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i7 = this.f14817a;
        FrameLayout frameLayout = this.f14818b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) frameLayout;
                i0 i0Var = l0Var.f14956f;
                boolean m10 = i0Var.m(-90.0f);
                i0Var.i();
                l0Var.d.invalidate();
                return m10;
            case 1:
                o0 o0Var = (o0) frameLayout;
                i0 i0Var2 = o0Var.h;
                boolean m11 = i0Var2.m(-90.0f);
                i0Var2.i();
                o0Var.f15181e.invalidate();
                return m11;
            default:
                qd0 qd0Var = ((rd0) frameLayout).f39163a;
                if (qd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((so0) qd0Var).f52091a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f14817a) {
            case 0:
                ((l0) this.f14818b).f14956f.k();
                return;
            case 1:
                ((o0) this.f14818b).h.k();
                return;
            default:
                ((rd0) this.f14818b).f39164b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f14817a) {
            case 0:
                ((l0) this.f14818b).f14956f.setRotation(f10);
                return;
            case 1:
                ((o0) this.f14818b).h.setRotation(f10);
                return;
            default:
                rd0 rd0Var = (rd0) this.f14818b;
                rd0Var.f39164b.setRotation(f10);
                rd0Var.getClass();
                qd0 qd0Var = rd0Var.f39163a;
                if (qd0Var != null) {
                    ((so0) qd0Var).n(false);
                    return;
                }
                return;
        }
    }
}
