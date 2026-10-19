package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class i0 implements y9 {
    public final Layout f15324a;
    public final int f15325b;
    public final int f15326c;
    public final k0 d;

    public i0(k0 k0Var, Layout layout, int i10, int i11) {
        this.d = k0Var;
        this.f15324a = layout;
        this.f15325b = i10;
        this.f15326c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f15324a;
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
        a F = this.d.f15353c.F();
        if (F != null && (pageBlock = F.f15095b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return e6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f15325b;
    }

    @Override
    public final int getY() {
        return this.f15326c;
    }
}
