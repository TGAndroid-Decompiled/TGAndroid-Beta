package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class j0 implements ba {
    public final Layout f11459a;
    public final int f11460b;
    public final int f11461c;
    public final l0 d;

    public j0(l0 l0Var, Layout layout, int i10, int i11) {
        this.d = l0Var;
        this.f11459a = layout;
        this.f11460b = i10;
        this.f11461c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11459a;
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
        a M = this.d.f11492c.M();
        if (M != null && (pageBlock = M.f11205b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return g6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11460b;
    }

    @Override
    public final int getY() {
        return this.f11461c;
    }
}
