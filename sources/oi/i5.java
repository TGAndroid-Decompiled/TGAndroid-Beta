package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class i5 implements u9 {
    public final Layout f22183a;
    public final int f22184b;
    public final int f22185c;
    public final int d;
    public final TL_iv.pageTableCell f22186e;

    public i5(Layout layout, int i7, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f22183a = layout;
        this.f22184b = i7;
        this.f22185c = i10;
        this.d = i11;
        this.f22186e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f22183a;
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
        return e6.h(this.f22186e);
    }

    @Override
    public final int getX() {
        return this.f22184b;
    }

    @Override
    public final int getY() {
        return this.f22185c;
    }
}
