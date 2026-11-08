package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ck0;
public final class a0 implements t9 {
    public final int f18409a = 0;
    public final Object f18410b;
    public final Object f18411c;

    public a0(Layout layout, Rect rect) {
        this.f18410b = layout;
        this.f18411c = rect;
    }

    @Override
    public final Layout a() {
        switch (this.f18409a) {
            case 0:
                return (Layout) this.f18410b;
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.f18410b;
                if (l1Var.h == null) {
                    l1Var.h = new org.telegram.utils.twidget.m1(l1Var);
                }
                return l1Var.h;
        }
    }

    @Override
    public final Rect c() {
        switch (this.f18409a) {
            case 0:
                return (Rect) this.f18411c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f18409a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f18409a) {
            case 0:
                return 0;
            default:
                return ((ck0) this.f18411c).U;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f18409a) {
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
        switch (this.f18409a) {
            case 0:
                return 0;
            default:
                ck0 ck0Var = (ck0) this.f18411c;
                return (ck0Var.S - ck0Var.f32619j0) + ((org.telegram.utils.twidget.l1) this.f18410b).f52896b;
        }
    }

    @Override
    public final int getY() {
        switch (this.f18409a) {
            case 0:
                return 0;
            default:
                return ((ck0) this.f18411c).T + ((org.telegram.utils.twidget.l1) this.f18410b).f52897c;
        }
    }

    public a0(ck0 ck0Var, org.telegram.utils.twidget.l1 l1Var) {
        this.f18411c = ck0Var;
        this.f18410b = l1Var;
    }
}
