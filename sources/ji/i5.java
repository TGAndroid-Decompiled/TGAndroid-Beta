package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;
public final class i5 implements z9 {
    public final int f13331a;
    public final Layout f13332b;
    public final int f13333c;
    public final int d;

    public i5(Layout layout, int i10, int i11, int i12) {
        this.f13331a = i12;
        this.f13332b = layout;
        this.f13333c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f13331a) {
            case 0:
                return this.f13332b;
            case 1:
                return this.f13332b;
            default:
                return this.f13332b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f13331a) {
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
        switch (this.f13331a) {
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
        switch (this.f13331a) {
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
        switch (this.f13331a) {
            case 0:
                return this.f13332b.getText();
            case 1:
                return this.f13332b.getText();
            default:
                return this.f13332b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f13331a) {
            case 0:
                return this.f13333c;
            case 1:
                return this.f13333c;
            default:
                return this.f13333c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f13331a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
