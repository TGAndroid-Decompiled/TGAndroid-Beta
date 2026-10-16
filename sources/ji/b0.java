package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;
public final class b0 implements z9 {
    public final Layout f13146a;
    public final Rect f13147b;

    public b0(Layout layout, Rect rect) {
        this.f13146a = layout;
        this.f13147b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f13146a;
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
        return this.f13147b;
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
