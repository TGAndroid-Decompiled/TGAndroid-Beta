package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class o5 implements ba {
    public final Layout f14100a;
    public final int f14101b;
    public final int f14102c;
    public final int d;
    public final TL_iv.pageTableCell f14103e;

    public o5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f14100a = layout;
        this.f14101b = i10;
        this.f14102c = i11;
        this.d = i12;
        this.f14103e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f14100a;
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
        return k6.h(this.f14103e);
    }

    @Override
    public final int getX() {
        return this.f14101b;
    }

    @Override
    public final int getY() {
        return this.f14102c;
    }
}
