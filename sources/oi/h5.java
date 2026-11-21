package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class h5 implements u9 {
    public final Layout f22160a;
    public final int f22161b;
    public final int f22162c;
    public final m5 d;

    public h5(m5 m5Var, Layout layout, int i7, int i10) {
        this.d = m5Var;
        this.f22160a = layout;
        this.f22161b = i7;
        this.f22162c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22160a;
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
        a aVar = this.d.f22528a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21932b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return c6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22161b;
    }

    @Override
    public final int getY() {
        return this.f22162c;
    }
}
