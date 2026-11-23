package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class f0 implements u9 {
    public final Layout f22079a;
    public final int f22080b;
    public final int f22081c;
    public final h0 d;

    public f0(h0 h0Var, Layout layout, int i7, int i10) {
        this.d = h0Var;
        this.f22079a = layout;
        this.f22080b = i7;
        this.f22081c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22079a;
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
        a c12 = this.d.f22108c.c1();
        if (c12 != null && (pageBlock = c12.f21901b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return b6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22080b;
    }

    @Override
    public final int getY() {
        return this.f22081c;
    }
}
