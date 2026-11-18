package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.pk0;
public final class y implements u9 {
    public final int f22492a = 0;
    public final Object f22493b;
    public final Object f22494c;

    public y(Layout layout, Rect rect) {
        this.f22493b = layout;
        this.f22494c = rect;
    }

    @Override
    public final Layout a() {
        switch (this.f22492a) {
            case 0:
                return (Layout) this.f22493b;
            default:
                org.telegram.utils.twidget.t1 t1Var = (org.telegram.utils.twidget.t1) this.f22493b;
                if (t1Var.h == null) {
                    t1Var.h = new org.telegram.utils.twidget.u1(t1Var);
                }
                return t1Var.h;
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22492a) {
            case 0:
                return (Rect) this.f22494c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f22492a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22492a) {
            case 0:
                return 0;
            default:
                return ((pk0) this.f22494c).V;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22492a) {
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
        switch (this.f22492a) {
            case 0:
                return 0;
            default:
                pk0 pk0Var = (pk0) this.f22494c;
                return (pk0Var.T - pk0Var.f38474k0) + ((org.telegram.utils.twidget.t1) this.f22493b).f54943b;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22492a) {
            case 0:
                return 0;
            default:
                return ((pk0) this.f22494c).U + ((org.telegram.utils.twidget.t1) this.f22493b).f54944c;
        }
    }

    public y(pk0 pk0Var, org.telegram.utils.twidget.t1 t1Var) {
        this.f22494c = pk0Var;
        this.f22493b = t1Var;
    }
}
