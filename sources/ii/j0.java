package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class j0 implements ba {
    public final Layout f12454a;
    public final int f12455b;
    public final int f12456c;
    public final l0 d;

    public j0(l0 l0Var, Layout layout, int i10, int i11) {
        this.d = l0Var;
        this.f12454a = layout;
        this.f12455b = i10;
        this.f12456c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f12454a;
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
        a T = this.d.f12498c.T();
        if (T != null && (pageBlock = T.f12186b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return h6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f12455b;
    }

    @Override
    public final int getY() {
        return this.f12456c;
    }
}
