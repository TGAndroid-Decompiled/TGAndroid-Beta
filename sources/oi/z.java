package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.rk0;
public final class z implements u9 {
    public final int f22581a = 0;
    public final Object f22582b;
    public final Object f22583c;

    public z(Layout layout, Rect rect) {
        this.f22582b = layout;
        this.f22583c = rect;
    }

    @Override
    public final Layout a() {
        switch (this.f22581a) {
            case 0:
                return (Layout) this.f22582b;
            default:
                org.telegram.utils.twidget.t1 t1Var = (org.telegram.utils.twidget.t1) this.f22582b;
                if (t1Var.h == null) {
                    t1Var.h = new org.telegram.utils.twidget.u1(t1Var);
                }
                return t1Var.h;
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22581a) {
            case 0:
                return (Rect) this.f22583c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f22581a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22581a) {
            case 0:
                return 0;
            default:
                return ((rk0) this.f22583c).V;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22581a) {
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
        switch (this.f22581a) {
            case 0:
                return 0;
            default:
                rk0 rk0Var = (rk0) this.f22583c;
                return (rk0Var.T - rk0Var.f39267k0) + ((org.telegram.utils.twidget.t1) this.f22582b).f54988b;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22581a) {
            case 0:
                return 0;
            default:
                return ((rk0) this.f22583c).U + ((org.telegram.utils.twidget.t1) this.f22582b).f54989c;
        }
    }

    public z(rk0 rk0Var, org.telegram.utils.twidget.t1 t1Var) {
        this.f22583c = rk0Var;
        this.f22582b = t1Var;
    }
}
