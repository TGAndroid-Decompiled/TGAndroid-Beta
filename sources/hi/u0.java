package hi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class u0 implements da {
    public final Layout f9880a;
    public final int f9881b;
    public final int f9882c;
    public final w0 d;

    public u0(w0 w0Var, Layout layout, int i10, int i11) {
        this.d = w0Var;
        this.f9880a = layout;
        this.f9881b = i10;
        this.f9882c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f9880a;
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
        a aVar = this.d.f9921f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return i6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f9881b;
    }

    @Override
    public final int getY() {
        return this.f9882c;
    }
}
