package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class h5 implements u9 {
    public final Layout f22123a;
    public final int f22124b;
    public final int f22125c;
    public final int d;
    public final TL_iv.pageTableCell f22126e;

    public h5(Layout layout, int i7, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f22123a = layout;
        this.f22124b = i7;
        this.f22125c = i10;
        this.d = i11;
        this.f22126e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f22123a;
    }

    @Override
    public final Rect c() {
        return null;
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
    public final CharSequence getText() {
        return d6.h(this.f22126e);
    }

    @Override
    public final int getX() {
        return this.f22124b;
    }

    @Override
    public final int getY() {
        return this.f22125c;
    }
}
