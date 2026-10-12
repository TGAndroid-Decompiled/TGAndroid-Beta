package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;
public final class b0 implements z9 {
    public final Layout f13142a;
    public final Rect f13143b;

    public b0(Layout layout, Rect rect) {
        this.f13142a = layout;
        this.f13143b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f13142a;
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
        return this.f13143b;
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
