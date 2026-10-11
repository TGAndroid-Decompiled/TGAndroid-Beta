package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class m5 implements z9 {
    public final Layout f12573a;
    public final int f12574b;
    public final int f12575c;
    public final int d;
    public final TL_iv.pageTableCell f12576e;

    public m5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f12573a = layout;
        this.f12574b = i10;
        this.f12575c = i11;
        this.d = i12;
        this.f12576e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f12573a;
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
        return j6.h(this.f12576e);
    }

    @Override
    public final int getX() {
        return this.f12574b;
    }

    @Override
    public final int getY() {
        return this.f12575c;
    }
}
