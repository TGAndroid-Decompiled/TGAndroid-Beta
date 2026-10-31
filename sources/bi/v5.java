package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class v5 implements u9 {
    public final Layout f3411a;
    public final int f3412b;
    public final int f3413c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public v5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f3411a = layout;
        this.f3412b = i10;
        this.f3413c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f3411a;
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
        return w6.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f3412b;
    }

    @Override
    public final int getY() {
        return this.f3413c;
    }
}
