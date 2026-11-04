package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class i0 implements s9 {
    public final Layout f19679a;
    public final int f19680b;
    public final int f19681c;
    public final k0 d;

    public i0(k0 k0Var, Layout layout, int i3, int i10) {
        this.d = k0Var;
        this.f19679a = layout;
        this.f19680b = i3;
        this.f19681c = i10;
    }

    @Override
    public final Layout a() {
        return this.f19679a;
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
        a j12 = this.d.f19718c.j1();
        if (j12 != null && (pageBlock = j12.f19431b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return d6.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f19680b;
    }

    @Override
    public final int getY() {
        return this.f19681c;
    }
}
