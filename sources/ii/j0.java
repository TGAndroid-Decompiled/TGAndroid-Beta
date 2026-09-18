package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class j0 implements ba {
    public final Layout f11451a;
    public final int f11452b;
    public final int f11453c;
    public final l0 d;

    public j0(l0 l0Var, Layout layout, int i10, int i11) {
        this.d = l0Var;
        this.f11451a = layout;
        this.f11452b = i10;
        this.f11453c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11451a;
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
        a M = this.d.f11488c.M();
        if (M != null && (pageBlock = M.f11204b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return f6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11452b;
    }

    @Override
    public final int getY() {
        return this.f11453c;
    }
}
