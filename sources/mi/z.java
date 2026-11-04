package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.gk0;
public final class z implements s9 {
    public final int f20078a = 0;
    public final Object f20079b;
    public final Object f20080c;

    public z(Layout layout, Rect rect) {
        this.f20079b = layout;
        this.f20080c = rect;
    }

    @Override
    public final Layout a() {
        switch (this.f20078a) {
            case 0:
                return (Layout) this.f20079b;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.f20079b;
                if (k0Var.h == null) {
                    k0Var.h = new org.telegram.utils.twidget.l0(k0Var);
                }
                return k0Var.h;
        }
    }

    @Override
    public final Rect c() {
        switch (this.f20078a) {
            case 0:
                return (Rect) this.f20080c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f20078a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f20078a) {
            case 0:
                return 0;
            default:
                return ((gk0) this.f20080c).V;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f20078a) {
            case 0:
                Layout a10 = a();
                if (a10 == null) {
                    return null;
                }
                return a10.getText();
            default:
                Layout a11 = a();
                if (a11 == null) {
                    return null;
                }
                return a11.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f20078a) {
            case 0:
                return 0;
            default:
                gk0 gk0Var = (gk0) this.f20080c;
                return (gk0Var.T - gk0Var.f34138k0) + ((org.telegram.utils.twidget.k0) this.f20079b).f52902b;
        }
    }

    @Override
    public final int getY() {
        switch (this.f20078a) {
            case 0:
                return 0;
            default:
                return ((gk0) this.f20080c).U + ((org.telegram.utils.twidget.k0) this.f20079b).f52903c;
        }
    }

    public z(gk0 gk0Var, org.telegram.utils.twidget.k0 k0Var) {
        this.f20080c = gk0Var;
        this.f20079b = k0Var;
    }
}
