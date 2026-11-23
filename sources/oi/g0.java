package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class g0 implements t9 {
    public final Layout f22205a;
    public final int f22206b;
    public final int f22207c;
    public final i0 d;

    public g0(i0 i0Var, Layout layout, int i7, int i10) {
        this.d = i0Var;
        this.f22205a = layout;
        this.f22206b = i7;
        this.f22207c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22205a;
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
        a V = this.d.f22238c.V();
        if (V != null && (pageBlock = V.f22001b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return c6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22206b;
    }

    @Override
    public final int getY() {
        return this.f22207c;
    }
}
