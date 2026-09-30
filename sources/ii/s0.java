package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class s0 implements ba {
    public final Layout f11604a;
    public final int f11605b;
    public final int f11606c;
    public final u0 d;

    public s0(u0 u0Var, Layout layout, int i10, int i11) {
        this.d = u0Var;
        this.f11604a = layout;
        this.f11605b = i10;
        this.f11606c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11604a;
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
        a aVar = this.d.f11647f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11191b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return g6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11605b;
    }

    @Override
    public final int getY() {
        return this.f11606c;
    }
}
