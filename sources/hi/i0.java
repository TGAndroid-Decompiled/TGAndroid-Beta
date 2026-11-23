package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.to0;
public final class i0 implements og.e {
    public final int f14699a;
    public final FrameLayout f14700b;

    public i0(int i7, FrameLayout frameLayout) {
        this.f14699a = i7;
        this.f14700b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i7 = this.f14699a;
        FrameLayout frameLayout = this.f14700b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                k0Var.d.invalidate();
                return k0Var.f14798f.j();
            case 1:
                n0 n0Var = (n0) frameLayout;
                n0Var.f15031e.invalidate();
                return n0Var.h.j();
            default:
                qd0 qd0Var = ((rd0) frameLayout).f39117a;
                if (qd0Var != null) {
                    PhotoViewer photoViewer = ((to0) qd0Var).f52312a;
                    Drawable[] drawableArr = PhotoViewer.Z8;
                    return photoViewer.H0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f14699a) {
            case 0:
                ((k0) this.f14700b).f14798f.o();
                return;
            case 1:
                ((n0) this.f14700b).h.o();
                return;
            default:
                ((rd0) this.f14700b).f39118b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14699a) {
            case 0:
                ((k0) this.f14700b).f14798f.f21887a.g(1, true);
                return;
            case 1:
                ((n0) this.f14700b).h.f21887a.g(1, true);
                return;
            default:
                ((rd0) this.f14700b).f39118b.f21887a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i7 = this.f14699a;
        FrameLayout frameLayout = this.f14700b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                h0 h0Var = k0Var.f14798f;
                boolean m10 = h0Var.m(-90.0f);
                h0Var.i();
                k0Var.d.invalidate();
                return m10;
            case 1:
                n0 n0Var = (n0) frameLayout;
                h0 h0Var2 = n0Var.h;
                boolean m11 = h0Var2.m(-90.0f);
                h0Var2.i();
                n0Var.f15031e.invalidate();
                return m11;
            default:
                qd0 qd0Var = ((rd0) frameLayout).f39117a;
                if (qd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((to0) qd0Var).f52312a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f14699a) {
            case 0:
                ((k0) this.f14700b).f14798f.k();
                return;
            case 1:
                ((n0) this.f14700b).h.k();
                return;
            default:
                ((rd0) this.f14700b).f39118b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f14699a) {
            case 0:
                ((k0) this.f14700b).f14798f.setRotation(f10);
                return;
            case 1:
                ((n0) this.f14700b).h.setRotation(f10);
                return;
            default:
                rd0 rd0Var = (rd0) this.f14700b;
                rd0Var.f39118b.setRotation(f10);
                rd0Var.getClass();
                qd0 qd0Var = rd0Var.f39117a;
                if (qd0Var != null) {
                    ((to0) qd0Var).n(false);
                    return;
                }
                return;
        }
    }
}
