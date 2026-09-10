package hi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class n5 implements da {
    public final Layout f9761a;
    public final int f9762b;
    public final int f9763c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public n5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f9761a = layout;
        this.f9762b = i10;
        this.f9763c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f9761a;
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
        return l6.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f9762b;
    }

    @Override
    public final int getY() {
        return this.f9763c;
    }
}
