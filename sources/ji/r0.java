package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class r0 implements ba {
    public final Layout f14164a;
    public final int f14165b;
    public final int f14166c;
    public final t0 d;

    public r0(t0 t0Var, Layout layout, int i10, int i11) {
        this.d = t0Var;
        this.f14164a = layout;
        this.f14165b = i10;
        this.f14166c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f14164a;
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
        a aVar = this.d.f14207f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13758b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return i6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f14165b;
    }

    @Override
    public final int getY() {
        return this.f14166c;
    }
}
