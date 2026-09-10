package hi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.da;
public final class d0 implements da {
    public final Layout f9512a;
    public final Rect f9513b;

    public d0(Layout layout, Rect rect) {
        this.f9512a = layout;
        this.f9513b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f9512a;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return 0;
    }

    @Override
    public final Rect getSelectionBounds() {
        return this.f9513b;
    }

    @Override
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override
    public final int getX() {
        return 0;
    }

    @Override
    public final int getY() {
        return 0;
    }
}
