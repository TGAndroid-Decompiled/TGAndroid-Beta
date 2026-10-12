package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class l5 implements z9 {
    public final Layout f12559a;
    public final int f12560b;
    public final int f12561c;
    public final int d;
    public final TL_iv.pageTableCell f12562e;

    public l5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f12559a = layout;
        this.f12560b = i10;
        this.f12561c = i11;
        this.d = i12;
        this.f12562e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f12559a;
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
        return i6.h(this.f12562e);
    }

    @Override
    public final int getX() {
        return this.f12560b;
    }

    @Override
    public final int getY() {
        return this.f12561c;
    }
}
