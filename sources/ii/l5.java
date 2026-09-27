package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class l5 implements ba {
    public final Layout f11493a;
    public final int f11494b;
    public final int f11495c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public l5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f11493a = layout;
        this.f11494b = i10;
        this.f11495c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f11493a;
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
        return i6.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f11494b;
    }

    @Override
    public final int getY() {
        return this.f11495c;
    }
}
