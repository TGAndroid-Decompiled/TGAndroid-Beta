package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class i0 implements z9 {
    public final Layout f13318a;
    public final int f13319b;
    public final int f13320c;
    public final k0 d;

    public i0(k0 k0Var, Layout layout, int i10, int i11) {
        this.d = k0Var;
        this.f13318a = layout;
        this.f13319b = i10;
        this.f13320c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f13318a;
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
        a O = this.d.f13369c.O();
        if (O != null && (pageBlock = O.f13103b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return k6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f13319b;
    }

    @Override
    public final int getY() {
        return this.f13320c;
    }
}
