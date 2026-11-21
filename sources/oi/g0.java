package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class g0 implements u9 {
    public final Layout f22136a;
    public final int f22137b;
    public final int f22138c;
    public final i0 d;

    public g0(i0 i0Var, Layout layout, int i7, int i10) {
        this.d = i0Var;
        this.f22136a = layout;
        this.f22137b = i7;
        this.f22138c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22136a;
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
        a c12 = this.d.f22167c.c1();
        if (c12 != null && (pageBlock = c12.f21932b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return c6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22137b;
    }

    @Override
    public final int getY() {
        return this.f22138c;
    }
}
