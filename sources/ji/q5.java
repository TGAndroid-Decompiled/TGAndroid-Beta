package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class q5 implements z9 {
    public final Layout f13482a;
    public final int f13483b;
    public final int f13484c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public q5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f13482a = layout;
        this.f13483b = i10;
        this.f13484c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f13482a;
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
        return m6.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f13483b;
    }

    @Override
    public final int getY() {
        return this.f13484c;
    }
}
