package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class j5 implements s9 {
    public final Layout f19707a;
    public final int f19708b;
    public final int f19709c;
    public final int d;
    public final TL_iv.pageTableCell f19710e;

    public j5(Layout layout, int i3, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f19707a = layout;
        this.f19708b = i3;
        this.f19709c = i10;
        this.d = i11;
        this.f19710e = pagetablecell;
    }

    @Override
    public final Layout a() {
        return this.f19707a;
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
        return f6.h(this.f19710e);
    }

    @Override
    public final int getX() {
        return this.f19708b;
    }

    @Override
    public final int getY() {
        return this.f19709c;
    }
}
