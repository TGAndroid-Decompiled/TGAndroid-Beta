package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
public final class fk9 implements qkb {
    public final Layout a;
    public final int b;
    public final int c;
    public final kk9 d;

    public fk9(kk9 kk9Var, Layout layout, int i, int i2) {
        this.d = kk9Var;
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
        TL_iv.RichText richText;
        ll0 ll0Var = this.d.a;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return zk9.r(richText, null, true);
            }
            return "";
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
