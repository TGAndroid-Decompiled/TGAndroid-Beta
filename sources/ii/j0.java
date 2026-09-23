package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ca;
public final class j0 implements ca {
    public final Layout f11445a;
    public final int f11446b;
    public final int f11447c;
    public final l0 d;

    public j0(l0 l0Var, Layout layout, int i10, int i11) {
        this.d = l0Var;
        this.f11445a = layout;
        this.f11446b = i10;
        this.f11447c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11445a;
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
        a N = this.d.f11478c.N();
        if (N != null && (pageBlock = N.f11191b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return g6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11446b;
    }

    @Override
    public final int getY() {
        return this.f11447c;
    }
}
