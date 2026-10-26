package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bc1;
import org.telegram.ui.Components.cc1;
public final class a0 implements da {
    public final int f17070a = 0;
    public final Object f17071b;
    public final Object f17072c;

    public a0(Layout layout, Rect rect) {
        this.f17071b = layout;
        this.f17072c = rect;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f17070a) {
            case 0:
                return (Layout) this.f17071b;
            default:
                bc1 bc1Var = (bc1) this.f17071b;
                if (bc1Var.h == null) {
                    bc1Var.h = new cc1(bc1Var);
                }
                return bc1Var.h;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f17070a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        int i10;
        switch (this.f17070a) {
            case 0:
                return 0;
            default:
                i10 = ((RichMessageLayout.RichBlock) ((an0) this.f17072c)).layoutRow;
                return i10;
        }
    }

    @Override
    public final Rect getSelectionBounds() {
        switch (this.f17070a) {
            case 0:
                return (Rect) this.f17072c;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f17070a) {
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
        switch (this.f17070a) {
            case 0:
                return 0;
            default:
                an0 an0Var = (an0) this.f17072c;
                i10 = ((RichMessageLayout.RichBlock) an0Var).layoutX;
                return (i10 - an0Var.f26587y) + ((bc1) this.f17071b).f26825b;
        }
    }

    @Override
    public final int getY() {
        int i10;
        switch (this.f17070a) {
            case 0:
                return 0;
            default:
                i10 = ((RichMessageLayout.RichBlock) ((an0) this.f17072c)).layoutY;
                return i10 + ((bc1) this.f17071b).f26826c;
        }
    }

    public a0(an0 an0Var, bc1 bc1Var) {
        this.f17072c = an0Var;
        this.f17071b = bc1Var;
    }
}
