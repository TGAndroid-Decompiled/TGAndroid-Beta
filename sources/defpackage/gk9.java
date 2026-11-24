package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
public final class gk9 implements qkb {
    public final Layout a;
    public final int b;
    public final int c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public gk9(Layout layout, int i, int i2, int i3, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pagetablecell;
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
        return this.d;
    }

    @Override
    public final CharSequence getText() {
        return fhb.h(this.e);
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
