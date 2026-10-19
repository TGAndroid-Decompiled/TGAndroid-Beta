package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class k5 implements y9 {
    public final Layout f15367a;
    public final int f15368b;
    public final int f15369c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public k5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f15367a = layout;
        this.f15368b = i10;
        this.f15369c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f15367a;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return this.d;
    }

    @Override
    public final Rect getSelectionBounds() {
        return null;
    }

    @Override
    public final CharSequence getText() {
        return g6.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f15368b;
    }

    @Override
    public final int getY() {
        return this.f15369c;
    }
}
