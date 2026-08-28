package kh;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.qr0;
public final class i0 implements tf.d {
    public final int f15410a;
    public final FrameLayout f15411b;

    public i0(int i9, FrameLayout frameLayout) {
        this.f15410a = i9;
        this.f15411b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i9 = this.f15410a;
        FrameLayout frameLayout = this.f15411b;
        switch (i9) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                k0Var.d.invalidate();
                return k0Var.f15497f.j();
            case 1:
                n0 n0Var = (n0) frameLayout;
                n0Var.f15723e.invalidate();
                return n0Var.h.j();
            default:
                ae0 ae0Var = ((be0) frameLayout).f27182a;
                if (ae0Var != null) {
                    PhotoViewer photoViewer = ((qr0) ae0Var).f42183a;
                    Drawable[] drawableArr = PhotoViewer.P8;
                    return photoViewer.N0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f15410a) {
            case 0:
                ((k0) this.f15411b).f15497f.o();
                return;
            case 1:
                ((n0) this.f15411b).h.o();
                return;
            default:
                ((be0) this.f15411b).f27183b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f15410a) {
            case 0:
                ((k0) this.f15411b).f15497f.f47904a.g(1, true);
                return;
            case 1:
                ((n0) this.f15411b).h.f47904a.g(1, true);
                return;
            default:
                ((be0) this.f15411b).f27183b.f47904a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i9 = this.f15410a;
        FrameLayout frameLayout = this.f15411b;
        switch (i9) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                h0 h0Var = k0Var.f15497f;
                boolean m10 = h0Var.m(-90.0f);
                h0Var.i();
                k0Var.d.invalidate();
                return m10;
            case 1:
                n0 n0Var = (n0) frameLayout;
                h0 h0Var2 = n0Var.h;
                boolean m11 = h0Var2.m(-90.0f);
                h0Var2.i();
                n0Var.f15723e.invalidate();
                return m11;
            default:
                ae0 ae0Var = ((be0) frameLayout).f27182a;
                if (ae0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((qr0) ae0Var).f42183a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f15410a) {
            case 0:
                ((k0) this.f15411b).f15497f.k();
                return;
            case 1:
                ((n0) this.f15411b).h.k();
                return;
            default:
                ((be0) this.f15411b).f27183b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f15410a) {
            case 0:
                ((k0) this.f15411b).f15497f.setRotation(f10);
                return;
            case 1:
                ((n0) this.f15411b).h.setRotation(f10);
                return;
            default:
                be0 be0Var = (be0) this.f15411b;
                be0Var.f27183b.setRotation(f10);
                be0Var.getClass();
                ae0 ae0Var = be0Var.f27182a;
                if (ae0Var != null) {
                    ((qr0) ae0Var).a(false);
                    return;
                }
                return;
        }
    }
}
