package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;
public final class f5 implements ba {
    public final int f12365a;
    public final Layout f12366b;
    public final int f12367c;
    public final int d;

    public f5(Layout layout, int i10, int i11, int i12) {
        this.f12365a = i12;
        this.f12366b = layout;
        this.f12367c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f12365a) {
            case 0:
                return this.f12366b;
            case 1:
                return this.f12366b;
            default:
                return this.f12366b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f12365a) {
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
        switch (this.f12365a) {
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
        switch (this.f12365a) {
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
        switch (this.f12365a) {
            case 0:
                return this.f12366b.getText();
            case 1:
                return this.f12366b.getText();
            default:
                return this.f12366b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f12365a) {
            case 0:
                return this.f12367c;
            case 1:
                return this.f12367c;
            default:
                return this.f12367c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f12365a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
