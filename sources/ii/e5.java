package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;
public final class e5 implements z9 {
    public final int f12397a;
    public final Layout f12398b;
    public final int f12399c;
    public final int d;

    public e5(Layout layout, int i10, int i11, int i12) {
        this.f12397a = i12;
        this.f12398b = layout;
        this.f12399c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f12397a) {
            case 0:
                return this.f12398b;
            case 1:
                return this.f12398b;
            default:
                return this.f12398b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f12397a) {
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
        switch (this.f12397a) {
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
        switch (this.f12397a) {
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
        switch (this.f12397a) {
            case 0:
                return this.f12398b.getText();
            case 1:
                return this.f12398b.getText();
            default:
                return this.f12398b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f12397a) {
            case 0:
                return this.f12399c;
            case 1:
                return this.f12399c;
            default:
                return this.f12399c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f12397a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
