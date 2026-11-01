package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.hl0;
public final class e0 implements u9 {
    public final int f2969a = 0;
    public final Object f2970b;
    public final Object f2971c;

    public e0(Layout layout, Rect rect) {
        this.f2970b = layout;
        this.f2971c = rect;
    }

    @Override
    public final Layout a() {
        switch (this.f2969a) {
            case 0:
                return (Layout) this.f2970b;
            default:
                org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) this.f2970b;
                if (o0Var.h == null) {
                    o0Var.h = new org.telegram.utils.twidget.p0(o0Var);
                }
                return o0Var.h;
        }
    }

    @Override
    public final Rect c() {
        switch (this.f2969a) {
            case 0:
                return (Rect) this.f2971c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f2969a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f2969a) {
            case 0:
                return 0;
            default:
                return ((hl0) this.f2971c).U;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f2969a) {
            case 0:
                Layout a2 = a();
                if (a2 == null) {
                    return null;
                }
                return a2.getText();
            default:
                Layout a10 = a();
                if (a10 == null) {
                    return null;
                }
                return a10.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f2969a) {
            case 0:
                return 0;
            default:
                hl0 hl0Var = (hl0) this.f2971c;
                return (hl0Var.S - hl0Var.f26826j0) + ((org.telegram.utils.twidget.o0) this.f2970b).f44437b;
        }
    }

    @Override
    public final int getY() {
        switch (this.f2969a) {
            case 0:
                return 0;
            default:
                return ((hl0) this.f2971c).T + ((org.telegram.utils.twidget.o0) this.f2970b).f44438c;
        }
    }

    public e0(hl0 hl0Var, org.telegram.utils.twidget.o0 o0Var) {
        this.f2971c = hl0Var;
        this.f2970b = o0Var;
    }
}
