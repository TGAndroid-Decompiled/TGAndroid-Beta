package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class r0 implements z9 {
    public final Layout f15539a;
    public final int f15540b;
    public final int f15541c;
    public final t0 d;

    public r0(t0 t0Var, Layout layout, int i10, int i11) {
        this.d = t0Var;
        this.f15539a = layout;
        this.f15540b = i10;
        this.f15541c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f15539a;
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
        a aVar = this.d.f15582f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15141b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return e6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f15540b;
    }

    @Override
    public final int getY() {
        return this.f15541c;
    }
}
