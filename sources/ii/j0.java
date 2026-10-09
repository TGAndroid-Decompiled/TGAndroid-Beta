package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class j0 implements z9 {
    public final Layout f12500a;
    public final int f12501b;
    public final int f12502c;
    public final l0 d;

    public j0(l0 l0Var, Layout layout, int i10, int i11) {
        this.d = l0Var;
        this.f12500a = layout;
        this.f12501b = i10;
        this.f12502c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f12500a;
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
        a F = this.d.f12548c.F();
        if (F != null && (pageBlock = F.f12234b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return h6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f12501b;
    }

    @Override
    public final int getY() {
        return this.f12502c;
    }
}
