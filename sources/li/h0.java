package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class h0 implements da {
    public final Layout f17271a;
    public final int f17272b;
    public final int f17273c;
    public final j0 d;

    public h0(j0 j0Var, Layout layout, int i10, int i11) {
        this.d = j0Var;
        this.f17271a = layout;
        this.f17272b = i10;
        this.f17273c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f17271a;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return 0;
    }

    @Override
    public final Rect getSelectionBounds() {
        return null;
    }

    @Override
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a L = this.d.f17308c.L();
        if (L != null && (pageBlock = L.f17054b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return f6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f17272b;
    }

    @Override
    public final int getY() {
        return this.f17273c;
    }
}
