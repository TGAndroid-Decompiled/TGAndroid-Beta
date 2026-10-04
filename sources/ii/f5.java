package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;
public final class f5 implements ba {
    public final int f12364a;
    public final Layout f12365b;
    public final int f12366c;
    public final int d;

    public f5(Layout layout, int i10, int i11, int i12) {
        this.f12364a = i12;
        this.f12365b = layout;
        this.f12366c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f12364a) {
            case 0:
                return this.f12365b;
            case 1:
                return this.f12365b;
            default:
                return this.f12365b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f12364a) {
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
        switch (this.f12364a) {
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
        switch (this.f12364a) {
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
        switch (this.f12364a) {
            case 0:
                return this.f12365b.getText();
            case 1:
                return this.f12365b.getText();
            default:
                return this.f12365b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f12364a) {
            case 0:
                return this.f12366c;
            case 1:
                return this.f12366c;
            default:
                return this.f12366c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f12364a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
