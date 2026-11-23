package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class g0 implements u9 {
    public final Layout f22139a;
    public final int f22140b;
    public final int f22141c;
    public final i0 d;

    public g0(i0 i0Var, Layout layout, int i7, int i10) {
        this.d = i0Var;
        this.f22139a = layout;
        this.f22140b = i7;
        this.f22141c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22139a;
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
        a c12 = this.d.f22170c.c1();
        if (c12 != null && (pageBlock = c12.f21935b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return c6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22140b;
    }

    @Override
    public final int getY() {
        return this.f22141c;
    }
}
