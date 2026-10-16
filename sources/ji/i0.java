package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class i0 implements z9 {
    public final Layout f13321a;
    public final int f13322b;
    public final int f13323c;
    public final k0 d;

    public i0(k0 k0Var, Layout layout, int i10, int i11) {
        this.d = k0Var;
        this.f13321a = layout;
        this.f13322b = i10;
        this.f13323c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f13321a;
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
        a j02 = this.d.f13372c.j0();
        if (j02 != null && (pageBlock = j02.f13107b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return k6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f13322b;
    }

    @Override
    public final int getY() {
        return this.f13323c;
    }
}
