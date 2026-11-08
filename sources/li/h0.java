package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class h0 implements t9 {
    public final Layout f18617a;
    public final int f18618b;
    public final int f18619c;
    public final j0 d;

    public h0(j0 j0Var, Layout layout, int i7, int i10) {
        this.d = j0Var;
        this.f18617a = layout;
        this.f18618b = i7;
        this.f18619c = i10;
    }

    @Override
    public final Layout a() {
        return this.f18617a;
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
        a V0 = this.d.f18653c.V0();
        if (V0 != null && (pageBlock = V0.f18392b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return c6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f18618b;
    }

    @Override
    public final int getY() {
        return this.f18619c;
    }
}
