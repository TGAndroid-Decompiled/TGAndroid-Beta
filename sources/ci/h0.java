package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.os0;
public final class h0 implements lg.e {
    public final int f4745a;
    public final FrameLayout f4746b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f4745a = i10;
        this.f4746b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f4745a;
        FrameLayout frameLayout = this.f4746b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f4807f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                df0 df0Var = ((ef0) frameLayout).f24053a;
                if (df0Var != null) {
                    PhotoViewer photoViewer = ((os0) df0Var).f36249a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f4745a) {
            case 0:
                ((j0) this.f4746b).f4807f.o();
                return;
            case 1:
                ((m0) this.f4746b).h.o();
                return;
            default:
                ((ef0) this.f4746b).f24054b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f4745a) {
            case 0:
                ((j0) this.f4746b).f4807f.f14325a.g(1, true);
                return;
            case 1:
                ((m0) this.f4746b).h.f14325a.g(1, true);
                return;
            default:
                ((ef0) this.f4746b).f24054b.f14325a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f4745a;
        FrameLayout frameLayout = this.f4746b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f4807f;
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
                df0 df0Var = ((ef0) frameLayout).f24053a;
                if (df0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((os0) df0Var).f36249a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f4745a) {
            case 0:
                ((j0) this.f4746b).f4807f.k();
                return;
            case 1:
                ((m0) this.f4746b).h.k();
                return;
            default:
                ((ef0) this.f4746b).f24054b.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f4745a) {
            case 0:
                ((j0) this.f4746b).f4807f.setRotation(f7);
                return;
            case 1:
                ((m0) this.f4746b).h.setRotation(f7);
                return;
            default:
                ef0 ef0Var = (ef0) this.f4746b;
                ef0Var.f24054b.setRotation(f7);
                ef0Var.getClass();
                df0 df0Var = ef0Var.f24053a;
                if (df0Var != null) {
                    ((os0) df0Var).a(false);
                    return;
                }
                return;
        }
    }
}
