package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;
public final class i5 implements z9 {
    public final int f13334a;
    public final Layout f13335b;
    public final int f13336c;
    public final int d;

    public i5(Layout layout, int i10, int i11, int i12) {
        this.f13334a = i12;
        this.f13335b = layout;
        this.f13336c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f13334a) {
            case 0:
                return this.f13335b;
            case 1:
                return this.f13335b;
            default:
                return this.f13335b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f13334a) {
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
        switch (this.f13334a) {
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
        switch (this.f13334a) {
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
        switch (this.f13334a) {
            case 0:
                return this.f13335b.getText();
            case 1:
                return this.f13335b.getText();
            default:
                return this.f13335b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f13334a) {
            case 0:
                return this.f13336c;
            case 1:
                return this.f13336c;
            default:
                return this.f13336c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f13334a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
