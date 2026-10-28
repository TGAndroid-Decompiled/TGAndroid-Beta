package fi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.is0;
public final class h0 implements ng.e {
    public final int f10938a;
    public final FrameLayout f10939b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f10938a = i10;
        this.f10939b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f10938a;
        FrameLayout frameLayout = this.f10939b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f11026f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                of0 of0Var = ((pf0) frameLayout).f31596a;
                if (of0Var != null) {
                    PhotoViewer photoViewer = ((is0) of0Var).f40267a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.O0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f10938a) {
            case 0:
                ((j0) this.f10939b).f11026f.o();
                return;
            case 1:
                ((m0) this.f10939b).h.o();
                return;
            default:
                ((pf0) this.f10939b).f31597b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f10938a) {
            case 0:
                ((j0) this.f10939b).f11026f.f18842a.g(1, true);
                return;
            case 1:
                ((m0) this.f10939b).h.f18842a.g(1, true);
                return;
            default:
                ((pf0) this.f10939b).f31597b.f18842a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f10938a;
        FrameLayout frameLayout = this.f10939b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f11026f;
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
                of0 of0Var = ((pf0) frameLayout).f31596a;
                if (of0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((is0) of0Var).f40267a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f10938a) {
            case 0:
                ((j0) this.f10939b).f11026f.k();
                return;
            case 1:
                ((m0) this.f10939b).h.k();
                return;
            default:
                ((pf0) this.f10939b).f31597b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f10938a) {
            case 0:
                ((j0) this.f10939b).f11026f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f10939b).h.setRotation(f7);
                return;
            default:
                pf0 pf0Var = (pf0) this.f10939b;
                pf0Var.f31597b.setRotation(f7);
                pf0Var.getClass();
                of0 of0Var = pf0Var.f31596a;
                if (of0Var != null) {
                    ((is0) of0Var).d(false);
                    return;
                }
                return;
        }
    }
}
