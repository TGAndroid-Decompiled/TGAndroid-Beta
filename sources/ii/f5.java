package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;
public final class f5 implements z9 {
    public final int f12411a;
    public final Layout f12412b;
    public final int f12413c;
    public final int d;

    public f5(Layout layout, int i10, int i11, int i12) {
        this.f12411a = i12;
        this.f12412b = layout;
        this.f12413c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f12411a) {
            case 0:
                return this.f12412b;
            case 1:
                return this.f12412b;
            default:
                return this.f12412b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f12411a) {
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
        switch (this.f12411a) {
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
        switch (this.f12411a) {
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
        switch (this.f12411a) {
            case 0:
                return this.f12412b.getText();
            case 1:
                return this.f12412b.getText();
            default:
                return this.f12412b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f12411a) {
            case 0:
                return this.f12413c;
            case 1:
                return this.f12413c;
            default:
                return this.f12413c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f12411a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
