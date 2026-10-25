package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.da;
public final class d5 implements da {
    public final int f17190a;
    public final Layout f17191b;
    public final int f17192c;
    public final int d;

    public d5(Layout layout, int i10, int i11, int i12) {
        this.f17190a = i12;
        this.f17191b = layout;
        this.f17192c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f17190a) {
            case 0:
                return this.f17191b;
            case 1:
                return this.f17191b;
            default:
                return this.f17191b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f17190a) {
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
        switch (this.f17190a) {
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
        switch (this.f17190a) {
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
        switch (this.f17190a) {
            case 0:
                return this.f17191b.getText();
            case 1:
                return this.f17191b.getText();
            default:
                return this.f17191b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f17190a) {
            case 0:
                return this.f17192c;
            case 1:
                return this.f17192c;
            default:
                return this.f17192c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f17190a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
