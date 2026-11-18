package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class g5 implements t9 {
    public final Layout f22075a;
    public final int f22076b;
    public final int f22077c;
    public final l5 d;

    public g5(l5 l5Var, Layout layout, int i7, int i10) {
        this.d = l5Var;
        this.f22075a = layout;
        this.f22076b = i7;
        this.f22077c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22075a;
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
        a aVar = this.d.f22442a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21910b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return b6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22076b;
    }

    @Override
    public final int getY() {
        return this.f22077c;
    }
}
