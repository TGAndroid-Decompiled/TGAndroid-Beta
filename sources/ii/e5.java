package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;
public final class e5 implements ba {
    public final int f11346a;
    public final Layout f11347b;
    public final int f11348c;
    public final int d;

    public e5(Layout layout, int i10, int i11, int i12) {
        this.f11346a = i12;
        this.f11347b = layout;
        this.f11348c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f11346a) {
            case 0:
                return this.f11347b;
            case 1:
                return this.f11347b;
            default:
                return this.f11347b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f11346a) {
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
        switch (this.f11346a) {
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
        switch (this.f11346a) {
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
        switch (this.f11346a) {
            case 0:
                return this.f11347b.getText();
            case 1:
                return this.f11347b.getText();
            default:
                return this.f11347b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f11346a) {
            case 0:
                return this.f11348c;
            case 1:
                return this.f11348c;
            default:
                return this.f11348c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f11346a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
