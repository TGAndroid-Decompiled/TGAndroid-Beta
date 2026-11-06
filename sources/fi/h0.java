package fi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ro0;
public final class h0 implements og.e {
    public final int f12121a;
    public final FrameLayout f12122b;

    public h0(int i7, FrameLayout frameLayout) {
        this.f12121a = i7;
        this.f12122b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i7 = this.f12121a;
        FrameLayout frameLayout = this.f12122b;
        switch (i7) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f12201f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.f12395e.invalidate();
                return m0Var.h.j();
            default:
                ed0 ed0Var = ((fd0) frameLayout).f33507a;
                if (ed0Var != null) {
                    PhotoViewer photoViewer = ((ro0) ed0Var).f49543a;
                    Drawable[] drawableArr = PhotoViewer.Y8;
                    return photoViewer.H0();
                }
                return false;
        }
    }

    @Override
    public final void b() {
        switch (this.f12121a) {
            case 0:
                ((j0) this.f12122b).f12201f.o();
                return;
            case 1:
                ((m0) this.f12122b).h.o();
                return;
            default:
                ((fd0) this.f12122b).f33508b.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f12121a) {
            case 0:
                ((j0) this.f12122b).f12201f.f21004a.g(1, true);
                return;
            case 1:
                ((m0) this.f12122b).h.f21004a.g(1, true);
                return;
            default:
                ((fd0) this.f12122b).f33508b.f21004a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i7 = this.f12121a;
        FrameLayout frameLayout = this.f12122b;
        switch (i7) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f12201f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.f12395e.invalidate();
                return m11;
            default:
                ed0 ed0Var = ((fd0) frameLayout).f33507a;
                if (ed0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ro0) ed0Var).f49543a;
                Drawable[] drawableArr = PhotoViewer.Y8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override
    public final void e() {
        switch (this.f12121a) {
            case 0:
                ((j0) this.f12122b).f12201f.k();
                return;
            case 1:
                ((m0) this.f12122b).h.k();
                return;
            default:
                ((fd0) this.f12122b).f33508b.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f12121a) {
            case 0:
                ((j0) this.f12122b).f12201f.setRotation(f10);
                return;
            case 1:
                ((m0) this.f12122b).h.setRotation(f10);
                return;
            default:
                fd0 fd0Var = (fd0) this.f12122b;
                fd0Var.f33508b.setRotation(f10);
                fd0Var.getClass();
                ed0 ed0Var = fd0Var.f33507a;
                if (ed0Var != null) {
                    ((ro0) ed0Var).m(false);
                    return;
                }
                return;
        }
    }
}
