package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;
public final class c0 implements z9 {
    public final Layout f12300a;
    public final Rect f12301b;

    public c0(Layout layout, Rect rect) {
        this.f12300a = layout;
        this.f12301b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f12300a;
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
        return this.f12301b;
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
