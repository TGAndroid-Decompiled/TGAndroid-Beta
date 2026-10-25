package fi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gs0;
public final class h0 implements ng.e {
    public final int f10939a;
    public final FrameLayout f10940b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f10939a = i10;
        this.f10940b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f10939a;
        FrameLayout frameLayout = this.f10940b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f11027f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                nf0 nf0Var = ((of0) frameLayout).f31282a;
                if (nf0Var != null) {
                    PhotoViewer photoViewer = ((gs0) nf0Var).f39774a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.O0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f10939a) {
            case 0:
                ((j0) this.f10940b).f11027f.o();
                return;
            case 1:
                ((m0) this.f10940b).h.o();
                return;
            default:
                ((of0) this.f10940b).f31283b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f10939a) {
            case 0:
                ((j0) this.f10940b).f11027f.f18843a.g(1, true);
                return;
            case 1:
                ((m0) this.f10940b).h.f18843a.g(1, true);
                return;
            default:
                ((of0) this.f10940b).f31283b.f18843a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f10939a;
        FrameLayout frameLayout = this.f10940b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f11027f;
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
                nf0 nf0Var = ((of0) frameLayout).f31282a;
                if (nf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((gs0) nf0Var).f39774a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f10939a) {
            case 0:
                ((j0) this.f10940b).f11027f.k();
                return;
            case 1:
                ((m0) this.f10940b).h.k();
                return;
            default:
                ((of0) this.f10940b).f31283b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f10939a) {
            case 0:
                ((j0) this.f10940b).f11027f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f10940b).h.setRotation(f7);
                return;
            default:
                of0 of0Var = (of0) this.f10940b;
                of0Var.f31283b.setRotation(f7);
                of0Var.getClass();
                nf0 nf0Var = of0Var.f31282a;
                if (nf0Var != null) {
                    ((gs0) nf0Var).d(false);
                    return;
                }
                return;
        }
    }
}
