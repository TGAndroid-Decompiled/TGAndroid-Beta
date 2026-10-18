package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class k5 implements y9 {
    public final Layout f15364a;
    public final int f15365b;
    public final int f15366c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public k5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f15364a = layout;
        this.f15365b = i10;
        this.f15366c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f15364a;
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
        return this.f15365b;
    }

    @Override
    public final int getY() {
        return this.f15366c;
    }
}
