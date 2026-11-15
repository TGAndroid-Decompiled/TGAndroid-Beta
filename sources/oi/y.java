package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.hk0;
public final class y implements s9 {
    public final int f22128a = 0;
    public final Object f22129b;
    public final Object f22130c;

    public y(Layout layout, Rect rect) {
        this.f22129b = layout;
        this.f22130c = rect;
    }

    @Override
    public final Layout a() {
        switch (this.f22128a) {
            case 0:
                return (Layout) this.f22129b;
            default:
                org.telegram.utils.twidget.o1 o1Var = (org.telegram.utils.twidget.o1) this.f22129b;
                if (o1Var.h == null) {
                    o1Var.h = new org.telegram.utils.twidget.p1(o1Var);
                }
                return o1Var.h;
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22128a) {
            case 0:
                return (Rect) this.f22130c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f22128a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22128a) {
            case 0:
                return 0;
            default:
                return ((hk0) this.f22130c).V;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22128a) {
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
        switch (this.f22128a) {
            case 0:
                return 0;
            default:
                hk0 hk0Var = (hk0) this.f22130c;
                return (hk0Var.T - hk0Var.f35276k0) + ((org.telegram.utils.twidget.o1) this.f22129b).f54355b;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22128a) {
            case 0:
                return 0;
            default:
                return ((hk0) this.f22130c).U + ((org.telegram.utils.twidget.o1) this.f22129b).f54356c;
        }
    }

    public y(hk0 hk0Var, org.telegram.utils.twidget.o1 o1Var) {
        this.f22130c = hk0Var;
        this.f22129b = o1Var;
    }
}
