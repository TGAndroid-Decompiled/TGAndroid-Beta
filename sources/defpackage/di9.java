package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
public final class di9 implements pib {
    public final Layout a;
    public final int b;
    public final int c;
    public final ii9 d;

    public di9(ii9 ii9Var, Layout layout, int i, int i2) {
        this.d = ii9Var;
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
        lk0 lk0Var = this.d.a;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return yi9.r(richText, null, true);
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
