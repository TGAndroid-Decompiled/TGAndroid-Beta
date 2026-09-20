package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ts0;
public final class h0 implements lg.e {
    public final int f4740a;
    public final FrameLayout f4741b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f4740a = i10;
        this.f4741b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f4740a;
        FrameLayout frameLayout = this.f4741b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f4829f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                bf0 bf0Var = ((cf0) frameLayout).f23277a;
                if (bf0Var != null) {
                    PhotoViewer photoViewer = ((ts0) bf0Var).f37876a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f4740a) {
            case 0:
                ((j0) this.f4741b).f4829f.o();
                return;
            case 1:
                ((m0) this.f4741b).h.o();
                return;
            default:
                ((cf0) this.f4741b).f23278b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f4740a) {
            case 0:
                ((j0) this.f4741b).f4829f.f14292a.g(1, true);
                return;
            case 1:
                ((m0) this.f4741b).h.f14292a.g(1, true);
                return;
            default:
                ((cf0) this.f4741b).f23278b.f14292a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f4740a;
        FrameLayout frameLayout = this.f4741b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f4829f;
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
                bf0 bf0Var = ((cf0) frameLayout).f23277a;
                if (bf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ts0) bf0Var).f37876a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f4740a) {
            case 0:
                ((j0) this.f4741b).f4829f.k();
                return;
            case 1:
                ((m0) this.f4741b).h.k();
                return;
            default:
                ((cf0) this.f4741b).f23278b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f4740a) {
            case 0:
                ((j0) this.f4741b).f4829f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f4741b).h.setRotation(f7);
                return;
            default:
                cf0 cf0Var = (cf0) this.f4741b;
                cf0Var.f23278b.setRotation(f7);
                cf0Var.getClass();
                bf0 bf0Var = cf0Var.f23277a;
                if (bf0Var != null) {
                    ((ts0) bf0Var).a(false);
                    return;
                }
                return;
        }
    }
}
