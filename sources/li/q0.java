package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class q0 implements da {
    public final Layout f17422a;
    public final int f17423b;
    public final int f17424c;
    public final s0 d;

    public q0(s0 s0Var, Layout layout, int i10, int i11) {
        this.d = s0Var;
        this.f17422a = layout;
        this.f17423b = i10;
        this.f17424c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f17422a;
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
    public final Rect getSelectionBounds() {
        return null;
    }

    @Override
    public final CharSequence getText() {
        a aVar = this.d.f17462f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17053b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return f6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f17423b;
    }

    @Override
    public final int getY() {
        return this.f17424c;
    }
}
