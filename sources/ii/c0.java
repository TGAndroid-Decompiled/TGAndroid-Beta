package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ca;
public final class c0 implements ca {
    public final Layout f11279a;
    public final Rect f11280b;

    public c0(Layout layout, Rect rect) {
        this.f11279a = layout;
        this.f11280b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f11279a;
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
        return this.f11280b;
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
