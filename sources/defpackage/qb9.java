package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
public final class qb9 implements pib {
    public final Layout a;
    public final int b;
    public final int c;
    public final sb9 d;

    public qb9(sb9 sb9Var, Layout layout, int i, int i2) {
        this.d = sb9Var;
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
        lk0 I0 = this.d.c.I0();
        if (I0 != null && (pageBlock = I0.b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return yi9.r(richText, null, true);
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
