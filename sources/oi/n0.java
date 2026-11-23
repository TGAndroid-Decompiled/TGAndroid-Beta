package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class n0 implements u9 {
    public final Layout f22209a;
    public final int f22210b;
    public final int f22211c;
    public final p0 d;

    public n0(p0 p0Var, Layout layout, int i7, int i10) {
        this.d = p0Var;
        this.f22209a = layout;
        this.f22210b = i7;
        this.f22211c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22209a;
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
        a aVar = this.d.f22263f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21901b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return b6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22210b;
    }

    @Override
    public final int getY() {
        return this.f22211c;
    }
}
