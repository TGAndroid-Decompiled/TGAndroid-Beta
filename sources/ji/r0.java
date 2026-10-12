package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class r0 implements z9 {
    public final Layout f13488a;
    public final int f13489b;
    public final int f13490c;
    public final t0 d;

    public r0(t0 t0Var, Layout layout, int i10, int i11) {
        this.d = t0Var;
        this.f13488a = layout;
        this.f13489b = i10;
        this.f13490c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f13488a;
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
        a aVar = this.d.f13521f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13103b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return k6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f13489b;
    }

    @Override
    public final int getY() {
        return this.f13490c;
    }
}
