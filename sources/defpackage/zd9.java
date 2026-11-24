package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
public final class zd9 implements qkb {
    public final Layout a;
    public final int b;
    public final int c;
    public final be9 d;

    public zd9(be9 be9Var, Layout layout, int i, int i2) {
        this.d = be9Var;
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
        ll0 ll0Var = this.d.f;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return zk9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
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
