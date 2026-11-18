package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class f0 implements t9 {
    public final Layout f22053a;
    public final int f22054b;
    public final int f22055c;
    public final h0 d;

    public f0(h0 h0Var, Layout layout, int i7, int i10) {
        this.d = h0Var;
        this.f22053a = layout;
        this.f22054b = i7;
        this.f22055c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22053a;
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
        a c12 = this.d.f22082c.c1();
        if (c12 != null && (pageBlock = c12.f21910b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return b6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22054b;
    }

    @Override
    public final int getY() {
        return this.f22055c;
    }
}
