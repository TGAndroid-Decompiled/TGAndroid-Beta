package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class s0 implements z9 {
    public final Layout f12668a;
    public final int f12669b;
    public final int f12670c;
    public final u0 d;

    public s0(u0 u0Var, Layout layout, int i10, int i11) {
        this.d = u0Var;
        this.f12668a = layout;
        this.f12669b = i10;
        this.f12670c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f12668a;
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
        a aVar = this.d.f12726f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12234b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return h6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f12669b;
    }

    @Override
    public final int getY() {
        return this.f12670c;
    }
}
