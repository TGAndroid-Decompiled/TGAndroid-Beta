package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.gc1;
import org.telegram.ui.Components.hc1;
public final class a0 implements da {
    public final int f17069a = 0;
    public final Object f17070b;
    public final Object f17071c;

    public a0(Layout layout, Rect rect) {
        this.f17070b = layout;
        this.f17071c = rect;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f17069a) {
            case 0:
                return (Layout) this.f17070b;
            default:
                gc1 gc1Var = (gc1) this.f17070b;
                if (gc1Var.h == null) {
                    gc1Var.h = new hc1(gc1Var);
                }
                return gc1Var.h;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f17069a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        int i10;
        switch (this.f17069a) {
            case 0:
                return 0;
            default:
                i10 = ((RichMessageLayout.RichBlock) ((bn0) this.f17071c)).layoutRow;
                return i10;
        }
    }

    @Override
    public final Rect getSelectionBounds() {
        switch (this.f17069a) {
            case 0:
                return (Rect) this.f17071c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f17069a) {
            case 0:
                Layout layout = getLayout();
                if (layout == null) {
                    return null;
                }
                return layout.getText();
            default:
                Layout layout2 = getLayout();
                if (layout2 == null) {
                    return null;
                }
                return layout2.getText();
        }
    }

    @Override
    public final int getX() {
        int i10;
        switch (this.f17069a) {
            case 0:
                return 0;
            default:
                bn0 bn0Var = (bn0) this.f17071c;
                i10 = ((RichMessageLayout.RichBlock) bn0Var).layoutX;
                return (i10 - bn0Var.f26875y) + ((gc1) this.f17070b).f28539b;
        }
    }

    @Override
    public final int getY() {
        int i10;
        switch (this.f17069a) {
            case 0:
                return 0;
            default:
                i10 = ((RichMessageLayout.RichBlock) ((bn0) this.f17071c)).layoutY;
                return i10 + ((gc1) this.f17070b).f28540c;
        }
    }

    public a0(bn0 bn0Var, gc1 gc1Var) {
        this.f17071c = bn0Var;
        this.f17070b = gc1Var;
    }
}
