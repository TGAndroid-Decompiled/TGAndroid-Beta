package nh;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pr0;
public final class h0 implements wf.d {
    public final int f17825a;
    public final FrameLayout f17826b;

    public h0(int i10, FrameLayout frameLayout) {
        this.f17825a = i10;
        this.f17826b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f17825a;
        FrameLayout frameLayout = this.f17826b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f17920f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.f18106e.invalidate();
                return m0Var.h.j();
            default:
                oe0 oe0Var = ((pe0) frameLayout).f31656a;
                if (oe0Var != null) {
                    PhotoViewer photoViewer = ((pr0) oe0Var).f41455a;
                    Drawable[] drawableArr = PhotoViewer.P8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f17825a) {
            case 0:
                ((j0) this.f17826b).f17920f.o();
                return;
            case 1:
                ((m0) this.f17826b).h.o();
                return;
            default:
                ((pe0) this.f17826b).f31657b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f17825a) {
            case 0:
                ((j0) this.f17826b).f17920f.f49953a.g(1, true);
                return;
            case 1:
                ((m0) this.f17826b).h.f49953a.g(1, true);
                return;
            default:
                ((pe0) this.f17826b).f31657b.f49953a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f17825a;
        FrameLayout frameLayout = this.f17826b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f17920f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.f18106e.invalidate();
                return m11;
            default:
                oe0 oe0Var = ((pe0) frameLayout).f31656a;
                if (oe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((pr0) oe0Var).f41455a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f17825a) {
            case 0:
                ((j0) this.f17826b).f17920f.k();
                return;
            case 1:
                ((m0) this.f17826b).h.k();
                return;
            default:
                ((pe0) this.f17826b).f31657b.k();
                return;
        }
    }

    @Override
    public final void f(float f9) {
        switch (this.f17825a) {
            case 0:
                ((j0) this.f17826b).f17920f.setRotation(f9);
                return;
            case 1:
                ((m0) this.f17826b).h.setRotation(f9);
                return;
            default:
                pe0 pe0Var = (pe0) this.f17826b;
                pe0Var.f31657b.setRotation(f9);
                pe0Var.getClass();
                oe0 oe0Var = pe0Var.f31656a;
                if (oe0Var != null) {
                    ((pr0) oe0Var).a(false);
                    return;
                }
                return;
        }
    }
}
