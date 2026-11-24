package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
public final class qd9 implements qkb {
    public final Layout a;
    public final int b;
    public final int c;
    public final sd9 d;

    public qd9(sd9 sd9Var, Layout layout, int i, int i2) {
        this.d = sd9Var;
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
        ll0 d1 = this.d.c.d1();
        if (d1 != null && (pageBlock = d1.b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return zk9.r(richText, null, true);
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
