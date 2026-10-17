package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.y9;
public final class b0 implements y9 {
    public final Layout f15129a;
    public final Rect f15130b;

    public b0(Layout layout, Rect rect) {
        this.f15129a = layout;
        this.f15130b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f15129a;
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
        return this.f15130b;
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
