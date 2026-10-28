package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class h0 implements da {
    public final Layout f17270a;
    public final int f17271b;
    public final int f17272c;
    public final j0 d;

    public h0(j0 j0Var, Layout layout, int i10, int i11) {
        this.d = j0Var;
        this.f17270a = layout;
        this.f17271b = i10;
        this.f17272c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f17270a;
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
        a L = this.d.f17307c.L();
        if (L != null && (pageBlock = L.f17053b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return f6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f17271b;
    }

    @Override
    public final int getY() {
        return this.f17272c;
    }
}
