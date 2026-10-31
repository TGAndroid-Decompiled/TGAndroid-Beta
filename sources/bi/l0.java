package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class l0 implements u9 {
    public final Layout f3176a;
    public final int f3177b;
    public final int f3178c;
    public final n0 d;

    public l0(n0 n0Var, Layout layout, int i10, int i11) {
        this.d = n0Var;
        this.f3176a = layout;
        this.f3177b = i10;
        this.f3178c = i11;
    }

    @Override
    public final Layout a() {
        return this.f3176a;
    }

    @Override
    public final Rect c() {
        return null;
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
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a L = this.d.f3216c.L();
        if (L != null && (pageBlock = L.f2818b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return s6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f3177b;
    }

    @Override
    public final int getY() {
        return this.f3178c;
    }
}
