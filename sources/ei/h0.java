package ei;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zr0;
public final class h0 implements mg.e {
    public final int f9142a;
    public final FrameLayout f9143b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f9142a = i10;
        this.f9143b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f9142a;
        FrameLayout frameLayout = this.f9143b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f9222f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                nf0 nf0Var = ((of0) frameLayout).f29035a;
                if (nf0Var != null) {
                    PhotoViewer photoViewer = ((zr0) nf0Var).f43798a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.P0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f9142a) {
            case 0:
                ((j0) this.f9143b).f9222f.o();
                return;
            case 1:
                ((m0) this.f9143b).h.o();
                return;
            default:
                ((of0) this.f9143b).f29036b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f9142a) {
            case 0:
                ((j0) this.f9143b).f9222f.f16917a.g(1, true);
                return;
            case 1:
                ((m0) this.f9143b).h.f16917a.g(1, true);
                return;
            default:
                ((of0) this.f9143b).f29036b.f16917a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f9142a;
        FrameLayout frameLayout = this.f9143b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f9222f;
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
                nf0 nf0Var = ((of0) frameLayout).f29035a;
                if (nf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((zr0) nf0Var).f43798a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.Q0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f9142a) {
            case 0:
                ((j0) this.f9143b).f9222f.k();
                return;
            case 1:
                ((m0) this.f9143b).h.k();
                return;
            default:
                ((of0) this.f9143b).f29036b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f9142a) {
            case 0:
                ((j0) this.f9143b).f9222f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f9143b).h.setRotation(f7);
                return;
            default:
                of0 of0Var = (of0) this.f9143b;
                of0Var.f29036b.setRotation(f7);
                of0Var.getClass();
                nf0 nf0Var = of0Var.f29035a;
                if (nf0Var != null) {
                    ((zr0) nf0Var).a(false);
                    return;
                }
                return;
        }
    }
}
