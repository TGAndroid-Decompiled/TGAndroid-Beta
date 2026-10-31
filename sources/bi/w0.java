package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class w0 implements u9 {
    public final Layout f3427a;
    public final int f3428b;
    public final int f3429c;
    public final y0 d;

    public w0(y0 y0Var, Layout layout, int i10, int i11) {
        this.d = y0Var;
        this.f3427a = layout;
        this.f3428b = i10;
        this.f3429c = i11;
    }

    @Override
    public final Layout a() {
        return this.f3427a;
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
        a aVar = this.d.f3457f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return s6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f3428b;
    }

    @Override
    public final int getY() {
        return this.f3429c;
    }
}
