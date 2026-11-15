package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class g5 implements s9 {
    public final Layout f21713a;
    public final int f21714b;
    public final int f21715c;
    public final int d;
    public final TL_iv.pageTableCell f21716e;

    public g5(Layout layout, int i7, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f21713a = layout;
        this.f21714b = i7;
        this.f21715c = i10;
        this.d = i11;
        this.f21716e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f21713a;
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
        return c6.h(this.f21716e);
    }

    @Override
    public final int getX() {
        return this.f21714b;
    }

    @Override
    public final int getY() {
        return this.f21715c;
    }
}
