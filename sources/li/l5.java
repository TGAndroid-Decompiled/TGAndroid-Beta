package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class l5 implements da {
    public final Layout f17347a;
    public final int f17348b;
    public final int f17349c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public l5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f17347a = layout;
        this.f17348b = i10;
        this.f17349c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f17347a;
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
        return h6.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f17348b;
    }

    @Override
    public final int getY() {
        return this.f17349c;
    }
}
