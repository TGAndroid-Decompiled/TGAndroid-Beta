package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class i0 implements ba {
    public final Layout f13974a;
    public final int f13975b;
    public final int f13976c;
    public final k0 d;

    public i0(k0 k0Var, Layout layout, int i10, int i11) {
        this.d = k0Var;
        this.f13974a = layout;
        this.f13975b = i10;
        this.f13976c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f13974a;
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
        a F = this.d.f14009c.F();
        if (F != null && (pageBlock = F.f13732b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return i6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f13975b;
    }

    @Override
    public final int getY() {
        return this.f13976c;
    }
}
