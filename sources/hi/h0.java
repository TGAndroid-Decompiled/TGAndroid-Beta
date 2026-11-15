package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.po0;
public final class h0 implements og.e {
    public final int f14355a;
    public final FrameLayout f14356b;

    public h0(int i7, FrameLayout frameLayout) {
        this.f14355a = i7;
        this.f14356b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i7 = this.f14355a;
        FrameLayout frameLayout = this.f14356b;
        switch (i7) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f14445f.j();
            case 1:
                n0 n0Var = (n0) frameLayout;
                n0Var.f14722e.invalidate();
                return n0Var.h.j();
            default:
                fd0 fd0Var = ((gd0) frameLayout).f34906a;
                if (fd0Var != null) {
                    PhotoViewer photoViewer = ((po0) fd0Var).f50330a;
                    Drawable[] drawableArr = PhotoViewer.Z8;
                    return photoViewer.H0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f14355a) {
            case 0:
                ((j0) this.f14356b).f14445f.o();
                return;
            case 1:
                ((n0) this.f14356b).h.o();
                return;
            default:
                ((gd0) this.f14356b).f34907b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14355a) {
            case 0:
                ((j0) this.f14356b).f14445f.f21530a.g(1, true);
                return;
            case 1:
                ((n0) this.f14356b).h.f21530a.g(1, true);
                return;
            default:
                ((gd0) this.f14356b).f34907b.f21530a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i7 = this.f14355a;
        FrameLayout frameLayout = this.f14356b;
        switch (i7) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f14445f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                n0 n0Var = (n0) frameLayout;
                g0 g0Var2 = n0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                n0Var.f14722e.invalidate();
                return m11;
            default:
                fd0 fd0Var = ((gd0) frameLayout).f34906a;
                if (fd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((po0) fd0Var).f50330a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f14355a) {
            case 0:
                ((j0) this.f14356b).f14445f.k();
                return;
            case 1:
                ((n0) this.f14356b).h.k();
                return;
            default:
                ((gd0) this.f14356b).f34907b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f14355a) {
            case 0:
                ((j0) this.f14356b).f14445f.setRotation(f10);
                return;
            case 1:
                ((n0) this.f14356b).h.setRotation(f10);
                return;
            default:
                gd0 gd0Var = (gd0) this.f14356b;
                gd0Var.f34907b.setRotation(f10);
                gd0Var.getClass();
                fd0 fd0Var = gd0Var.f34906a;
                if (fd0Var != null) {
                    ((po0) fd0Var).n(false);
                    return;
                }
                return;
        }
    }
}
