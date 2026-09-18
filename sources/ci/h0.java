package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ts0;
public final class h0 implements lg.e {
    public final int f4739a;
    public final FrameLayout f4740b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f4739a = i10;
        this.f4740b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f4739a;
        FrameLayout frameLayout = this.f4740b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f4828f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                cf0 cf0Var = ((df0) frameLayout).f23570a;
                if (cf0Var != null) {
                    PhotoViewer photoViewer = ((ts0) cf0Var).f37802a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f4739a) {
            case 0:
                ((j0) this.f4740b).f4828f.o();
                return;
            case 1:
                ((m0) this.f4740b).h.o();
                return;
            default:
                ((df0) this.f4740b).f23571b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f4739a) {
            case 0:
                ((j0) this.f4740b).f4828f.f14256a.g(1, true);
                return;
            case 1:
                ((m0) this.f4740b).h.f14256a.g(1, true);
                return;
            default:
                ((df0) this.f4740b).f23571b.f14256a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f4739a;
        FrameLayout frameLayout = this.f4740b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f4828f;
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
                cf0 cf0Var = ((df0) frameLayout).f23570a;
                if (cf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ts0) cf0Var).f37802a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f4739a) {
            case 0:
                ((j0) this.f4740b).f4828f.k();
                return;
            case 1:
                ((m0) this.f4740b).h.k();
                return;
            default:
                ((df0) this.f4740b).f23571b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f4739a) {
            case 0:
                ((j0) this.f4740b).f4828f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f4740b).h.setRotation(f7);
                return;
            default:
                df0 df0Var = (df0) this.f4740b;
                df0Var.f23571b.setRotation(f7);
                df0Var.getClass();
                cf0 cf0Var = df0Var.f23570a;
                if (cf0Var != null) {
                    ((ts0) cf0Var).a(false);
                    return;
                }
                return;
        }
    }
}
