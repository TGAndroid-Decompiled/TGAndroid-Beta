package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.y9;
public final class d5 implements y9 {
    public final int f15226a;
    public final Layout f15227b;
    public final int f15228c;
    public final int d;

    public d5(Layout layout, int i10, int i11, int i12) {
        this.f15226a = i12;
        this.f15227b = layout;
        this.f15228c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f15226a) {
            case 0:
                return this.f15227b;
            case 1:
                return this.f15227b;
            default:
                return this.f15227b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f15226a) {
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
        switch (this.f15226a) {
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
        switch (this.f15226a) {
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
        switch (this.f15226a) {
            case 0:
                return this.f15227b.getText();
            case 1:
                return this.f15227b.getText();
            default:
                return this.f15227b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f15226a) {
            case 0:
                return this.f15228c;
            case 1:
                return this.f15228c;
            default:
                return this.f15228c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f15226a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
