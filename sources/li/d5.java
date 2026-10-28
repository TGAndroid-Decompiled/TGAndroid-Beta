package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.da;
public final class d5 implements da {
    public final int f17189a;
    public final Layout f17190b;
    public final int f17191c;
    public final int d;

    public d5(Layout layout, int i10, int i11, int i12) {
        this.f17189a = i12;
        this.f17190b = layout;
        this.f17191c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f17189a) {
            case 0:
                return this.f17190b;
            case 1:
                return this.f17190b;
            default:
                return this.f17190b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f17189a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f17189a) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return 1;
        }
    }

    @Override
    public final Rect getSelectionBounds() {
        switch (this.f17189a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f17189a) {
            case 0:
                return this.f17190b.getText();
            case 1:
                return this.f17190b.getText();
            default:
                return this.f17190b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f17189a) {
            case 0:
                return this.f17191c;
            case 1:
                return this.f17191c;
            default:
                return this.f17191c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f17189a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
