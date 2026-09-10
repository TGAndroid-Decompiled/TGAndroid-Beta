package hi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.da;
public final class g5 implements da {
    public final int f9615a;
    public final Layout f9616b;
    public final int f9617c;
    public final int d;

    public g5(Layout layout, int i10, int i11, int i12) {
        this.f9615a = i12;
        this.f9616b = layout;
        this.f9617c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f9615a) {
            case 0:
                return this.f9616b;
            case 1:
                return this.f9616b;
            default:
                return this.f9616b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f9615a) {
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
        switch (this.f9615a) {
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
        switch (this.f9615a) {
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
        switch (this.f9615a) {
            case 0:
                return this.f9616b.getText();
            case 1:
                return this.f9616b.getText();
            default:
                return this.f9616b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f9615a) {
            case 0:
                return this.f9617c;
            case 1:
                return this.f9617c;
            default:
                return this.f9617c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f9615a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
