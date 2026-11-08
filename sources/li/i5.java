package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class i5 implements t9 {
    public final Layout f18645a;
    public final int f18646b;
    public final int f18647c;
    public final int d;
    public final TL_iv.pageTableCell f18648e;

    public i5(Layout layout, int i7, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f18645a = layout;
        this.f18646b = i7;
        this.f18647c = i10;
        this.d = i11;
        this.f18648e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f18645a;
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
        return e6.h(this.f18648e);
    }

    @Override
    public final int getX() {
        return this.f18646b;
    }

    @Override
    public final int getY() {
        return this.f18647c;
    }
}
