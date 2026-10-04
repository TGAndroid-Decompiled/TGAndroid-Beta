package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class m5 implements ba {
    public final Layout f12524a;
    public final int f12525b;
    public final int f12526c;
    public final int d;
    public final TL_iv.pageTableCell f12527e;

    public m5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f12524a = layout;
        this.f12525b = i10;
        this.f12526c = i11;
        this.d = i12;
        this.f12527e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f12524a;
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
        return j6.h(this.f12527e);
    }

    @Override
    public final int getX() {
        return this.f12525b;
    }

    @Override
    public final int getY() {
        return this.f12526c;
    }
}
