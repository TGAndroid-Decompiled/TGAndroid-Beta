package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;
public final class g5 implements ba {
    public final int f13926a;
    public final Layout f13927b;
    public final int f13928c;
    public final int d;

    public g5(Layout layout, int i10, int i11, int i12) {
        this.f13926a = i12;
        this.f13927b = layout;
        this.f13928c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f13926a) {
            case 0:
                return this.f13927b;
            case 1:
                return this.f13927b;
            default:
                return this.f13927b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f13926a) {
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
        switch (this.f13926a) {
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
        switch (this.f13926a) {
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
        switch (this.f13926a) {
            case 0:
                return this.f13927b.getText();
            case 1:
                return this.f13927b.getText();
            default:
                return this.f13927b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f13926a) {
            case 0:
                return this.f13928c;
            case 1:
                return this.f13928c;
            default:
                return this.f13928c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f13926a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
