package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ca;
public final class s0 implements ca {
    public final Layout f11612a;
    public final int f11613b;
    public final int f11614c;
    public final u0 d;

    public s0(u0 u0Var, Layout layout, int i10, int i11) {
        this.d = u0Var;
        this.f11612a = layout;
        this.f11613b = i10;
        this.f11614c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11612a;
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
        a aVar = this.d.f11653f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11205b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return f6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11613b;
    }

    @Override
    public final int getY() {
        return this.f11614c;
    }
}
