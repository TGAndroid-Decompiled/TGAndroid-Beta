package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class m5 implements z9 {
    public final Layout f12574a;
    public final int f12575b;
    public final int f12576c;
    public final int d;
    public final TL_iv.pageTableCell f12577e;

    public m5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f12574a = layout;
        this.f12575b = i10;
        this.f12576c = i11;
        this.d = i12;
        this.f12577e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f12574a;
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
        return j6.h(this.f12577e);
    }

    @Override
    public final int getX() {
        return this.f12575b;
    }

    @Override
    public final int getY() {
        return this.f12576c;
    }
}
