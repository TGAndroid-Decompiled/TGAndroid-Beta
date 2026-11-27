package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class j33 implements s33 {
    public final byte a;
    public final FrameLayout b;

    public j33(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override
    public final boolean a() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                l33 l33Var = (l33) frameLayout;
                l33Var.d.invalidate();
                return l33Var.f.j();
            case 1:
                q33 q33Var = (q33) frameLayout;
                q33Var.e.invalidate();
                return q33Var.h.j();
            default:
                j88 j88Var = ((k88) frameLayout).a;
                if (j88Var != null) {
                    PhotoViewer photoViewer = ((ua8) j88Var).a;
                    Drawable[] drawableArr = PhotoViewer.d9;
                    return photoViewer.J();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.o();
                return;
            case 1:
                ((q33) frameLayout).h.o();
                return;
            default:
                ((k88) frameLayout).b.o();
                return;
        }
    }

    @Override
    public final void c() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.a.g(1, true);
                return;
            case 1:
                ((q33) frameLayout).h.a.g(1, true);
                return;
            default:
                ((k88) frameLayout).b.a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                l33 l33Var = (l33) frameLayout;
                i33 i33Var = l33Var.f;
                boolean m = i33Var.m(-90.0f);
                i33Var.i();
                l33Var.d.invalidate();
                return m;
            case 1:
                q33 q33Var = (q33) frameLayout;
                i33 i33Var2 = q33Var.h;
                boolean m2 = i33Var2.m(-90.0f);
                i33Var2.i();
                q33Var.e.invalidate();
                return m2;
            default:
                j88 j88Var = ((k88) frameLayout).a;
                if (j88Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ua8) j88Var).a;
                Drawable[] drawableArr = PhotoViewer.d9;
                return photoViewer.K(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.k();
                return;
            case 1:
                ((q33) frameLayout).h.k();
                return;
            default:
                ((k88) frameLayout).b.k();
                return;
        }
    }

    @Override
    public final void f(float f) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.setRotation(f);
                return;
            case 1:
                ((q33) frameLayout).h.setRotation(f);
                return;
            default:
                k88 k88Var = (k88) frameLayout;
                k88Var.b.setRotation(f);
                j88 j88Var = k88Var.a;
                if (j88Var != null) {
                    ((ua8) j88Var).b(false);
                    return;
                }
                return;
        }
    }
}
