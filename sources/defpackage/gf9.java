package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
public final class gf9 implements kmb {
    public final Layout a;
    public final int b;
    public final int c;
    public final if9 d;

    public gf9(if9 if9Var, Layout layout, int i, int i2) {
        this.d = if9Var;
        this.a = layout;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final Layout a() {
        return this.a;
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
        mk0 X0 = this.d.c.X0();
        if (X0 != null && (pageBlock = X0.b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return mm9.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.b;
    }

    @Override
    public final int getY() {
        return this.c;
    }
}
