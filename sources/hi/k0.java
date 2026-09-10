package hi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class k0 implements da {
    public final Layout f9686a;
    public final int f9687b;
    public final int f9688c;
    public final m0 d;

    public k0(m0 m0Var, Layout layout, int i10, int i11) {
        this.d = m0Var;
        this.f9686a = layout;
        this.f9687b = i10;
        this.f9688c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f9686a;
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
        a O = this.d.f9740c.O();
        if (O != null && (pageBlock = O.f9421b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return i6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f9687b;
    }

    @Override
    public final int getY() {
        return this.f9688c;
    }
}
