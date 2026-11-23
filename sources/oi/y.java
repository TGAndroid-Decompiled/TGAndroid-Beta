package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.rk0;
public final class y implements u9 {
    public final int f22518a = 0;
    public final Object f22519b;
    public final Object f22520c;

    public y(Layout layout, Rect rect) {
        this.f22519b = layout;
        this.f22520c = rect;
    }

    @Override
    public final Layout a() {
        switch (this.f22518a) {
            case 0:
                return (Layout) this.f22519b;
            default:
                org.telegram.utils.twidget.t1 t1Var = (org.telegram.utils.twidget.t1) this.f22519b;
                if (t1Var.h == null) {
                    t1Var.h = new org.telegram.utils.twidget.u1(t1Var);
                }
                return t1Var.h;
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22518a) {
            case 0:
                return (Rect) this.f22520c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f22518a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22518a) {
            case 0:
                return 0;
            default:
                return ((rk0) this.f22520c).V;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22518a) {
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
        switch (this.f22518a) {
            case 0:
                return 0;
            default:
                rk0 rk0Var = (rk0) this.f22520c;
                return (rk0Var.T - rk0Var.f39222k0) + ((org.telegram.utils.twidget.t1) this.f22519b).f54953b;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22518a) {
            case 0:
                return 0;
            default:
                return ((rk0) this.f22520c).U + ((org.telegram.utils.twidget.t1) this.f22519b).f54954c;
        }
    }

    public y(rk0 rk0Var, org.telegram.utils.twidget.t1 t1Var) {
        this.f22520c = rk0Var;
        this.f22519b = t1Var;
    }
}
