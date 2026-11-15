package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class f5 implements s9 {
    public final Layout f21701a;
    public final int f21702b;
    public final int f21703c;
    public final k5 d;

    public f5(k5 k5Var, Layout layout, int i7, int i10) {
        this.d = k5Var;
        this.f21701a = layout;
        this.f21702b = i7;
        this.f21703c = i10;
    }

    @Override
    public final Layout a() {
        return this.f21701a;
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
        a aVar = this.d.f22106a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return a6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f21702b;
    }

    @Override
    public final int getY() {
        return this.f21703c;
    }
}
