package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;
public final class e5 implements ba {
    public final int f11357a;
    public final Layout f11358b;
    public final int f11359c;
    public final int d;

    public e5(Layout layout, int i10, int i11, int i12) {
        this.f11357a = i12;
        this.f11358b = layout;
        this.f11359c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f11357a) {
            case 0:
                return this.f11358b;
            case 1:
                return this.f11358b;
            default:
                return this.f11358b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f11357a) {
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
        switch (this.f11357a) {
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
        switch (this.f11357a) {
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
        switch (this.f11357a) {
            case 0:
                return this.f11358b.getText();
            case 1:
                return this.f11358b.getText();
            default:
                return this.f11358b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f11357a) {
            case 0:
                return this.f11359c;
            case 1:
                return this.f11359c;
            default:
                return this.f11359c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f11357a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
