package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class g5 implements u9 {
    public final Layout f22072a;
    public final int f22073b;
    public final int f22074c;
    public final l5 d;

    public g5(l5 l5Var, Layout layout, int i7, int i10) {
        this.d = l5Var;
        this.f22072a = layout;
        this.f22073b = i7;
        this.f22074c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22072a;
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
        a aVar = this.d.f22439a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21907b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return b6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22073b;
    }

    @Override
    public final int getY() {
        return this.f22074c;
    }
}
