package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class i0 implements z9 {
    public final Layout f15384a;
    public final int f15385b;
    public final int f15386c;
    public final k0 d;

    public i0(k0 k0Var, Layout layout, int i10, int i11) {
        this.d = k0Var;
        this.f15384a = layout;
        this.f15385b = i10;
        this.f15386c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f15384a;
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
        a F = this.d.f15413c.F();
        if (F != null && (pageBlock = F.f15141b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return e6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f15385b;
    }

    @Override
    public final int getY() {
        return this.f15386c;
    }
}
