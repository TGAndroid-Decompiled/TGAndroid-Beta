package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class s0 implements ba {
    public final Layout f11611a;
    public final int f11612b;
    public final int f11613c;
    public final u0 d;

    public s0(u0 u0Var, Layout layout, int i10, int i11) {
        this.d = u0Var;
        this.f11611a = layout;
        this.f11612b = i10;
        this.f11613c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11611a;
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
        a aVar = this.d.f11652f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11204b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return f6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11612b;
    }

    @Override
    public final int getY() {
        return this.f11613c;
    }
}
