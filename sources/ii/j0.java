package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class j0 implements z9 {
    public final Layout f12509a;
    public final int f12510b;
    public final int f12511c;
    public final l0 d;

    public j0(l0 l0Var, Layout layout, int i10, int i11) {
        this.d = l0Var;
        this.f12509a = layout;
        this.f12510b = i10;
        this.f12511c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f12509a;
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
        a N = this.d.f12545c.N();
        if (N != null && (pageBlock = N.f12232b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return g6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f12510b;
    }

    @Override
    public final int getY() {
        return this.f12511c;
    }
}
