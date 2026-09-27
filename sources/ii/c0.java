package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;
public final class c0 implements ba {
    public final Layout f11263a;
    public final Rect f11264b;

    public c0(Layout layout, Rect rect) {
        this.f11263a = layout;
        this.f11264b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f11263a;
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
        return this.f11264b;
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
