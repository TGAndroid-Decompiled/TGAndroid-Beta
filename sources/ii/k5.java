package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ca;
public final class k5 implements ca {
    public final Layout f11480a;
    public final int f11481b;
    public final int f11482c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public k5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f11480a = layout;
        this.f11481b = i10;
        this.f11482c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f11480a;
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
        return this.f11481b;
    }

    @Override
    public final int getY() {
        return this.f11482c;
    }
}
