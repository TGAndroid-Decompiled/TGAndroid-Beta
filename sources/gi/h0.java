package gi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.io0;
public final class h0 implements pg.d {
    public final int f12855a;
    public final FrameLayout f12856b;

    public h0(int i3, FrameLayout frameLayout) {
        this.f12855a = i3;
        this.f12856b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i3 = this.f12855a;
        FrameLayout frameLayout = this.f12856b;
        switch (i3) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f12992f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.f13174e.invalidate();
                return m0Var.h.j();
            default:
                zc0 zc0Var = ((ad0) frameLayout).f31807a;
                if (zc0Var != null) {
                    PhotoViewer photoViewer = ((io0) zc0Var).f46322a;
                    Drawable[] drawableArr = PhotoViewer.V8;
                    return photoViewer.O0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f12855a) {
            case 0:
                ((j0) this.f12856b).f12992f.o();
                return;
            case 1:
                ((m0) this.f12856b).h.o();
                return;
            default:
                ((ad0) this.f12856b).f31808b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f12855a) {
            case 0:
                ((j0) this.f12856b).f12992f.f53511a.g(1, true);
                return;
            case 1:
                ((m0) this.f12856b).h.f53511a.g(1, true);
                return;
            default:
                ((ad0) this.f12856b).f31808b.f53511a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i3 = this.f12855a;
        FrameLayout frameLayout = this.f12856b;
        switch (i3) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f12992f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.f13174e.invalidate();
                return m11;
            default:
                zc0 zc0Var = ((ad0) frameLayout).f31807a;
                if (zc0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((io0) zc0Var).f46322a;
                Drawable[] drawableArr = PhotoViewer.V8;
                return photoViewer.P0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f12855a) {
            case 0:
                ((j0) this.f12856b).f12992f.k();
                return;
            case 1:
                ((m0) this.f12856b).h.k();
                return;
            default:
                ((ad0) this.f12856b).f31808b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f12855a) {
            case 0:
                ((j0) this.f12856b).f12992f.setRotation(f10);
                return;
            case 1:
                ((m0) this.f12856b).h.setRotation(f10);
                return;
            default:
                ad0 ad0Var = (ad0) this.f12856b;
                ad0Var.f31808b.setRotation(f10);
                ad0Var.getClass();
                zc0 zc0Var = ad0Var.f31807a;
                if (zc0Var != null) {
                    ((io0) zc0Var).a(false);
                    return;
                }
                return;
        }
    }
}
