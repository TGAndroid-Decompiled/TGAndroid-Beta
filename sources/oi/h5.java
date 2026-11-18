package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class h5 implements t9 {
    public final Layout f22096a;
    public final int f22097b;
    public final int f22098c;
    public final int d;
    public final TL_iv.pageTableCell f22099e;

    public h5(Layout layout, int i7, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f22096a = layout;
        this.f22097b = i7;
        this.f22098c = i10;
        this.d = i11;
        this.f22099e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f22096a;
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
        return d6.h(this.f22099e);
    }

    @Override
    public final int getX() {
        return this.f22097b;
    }

    @Override
    public final int getY() {
        return this.f22098c;
    }
}
