package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ca;
public final class e5 implements ca {
    public final int f11343a;
    public final Layout f11344b;
    public final int f11345c;
    public final int d;

    public e5(Layout layout, int i10, int i11, int i12) {
        this.f11343a = i12;
        this.f11344b = layout;
        this.f11345c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f11343a) {
            case 0:
                return this.f11344b;
            case 1:
                return this.f11344b;
            default:
                return this.f11344b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f11343a) {
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
        switch (this.f11343a) {
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
        switch (this.f11343a) {
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
        switch (this.f11343a) {
            case 0:
                return this.f11344b.getText();
            case 1:
                return this.f11344b.getText();
            default:
                return this.f11344b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f11343a) {
            case 0:
                return this.f11345c;
            case 1:
                return this.f11345c;
            default:
                return this.f11345c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f11343a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
