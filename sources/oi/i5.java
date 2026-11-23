package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class i5 implements t9 {
    public final Layout f22254a;
    public final int f22255b;
    public final int f22256c;
    public final int d;
    public final TL_iv.pageTableCell f22257e;

    public i5(Layout layout, int i7, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f22254a = layout;
        this.f22255b = i7;
        this.f22256c = i10;
        this.d = i11;
        this.f22257e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f22254a;
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
        return e6.h(this.f22257e);
    }

    @Override
    public final int getX() {
        return this.f22255b;
    }

    @Override
    public final int getY() {
        return this.f22256c;
    }
}
