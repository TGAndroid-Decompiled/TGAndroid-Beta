package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class k5 implements ba {
    public final Layout f11472a;
    public final int f11473b;
    public final int f11474c;
    public final p5 d;

    public k5(p5 p5Var, Layout layout, int i10, int i11) {
        this.d = p5Var;
        this.f11472a = layout;
        this.f11473b = i10;
        this.f11474c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11472a;
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
        TL_iv.RichText richText;
        a aVar = this.d.f11210a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11194b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return g6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11473b;
    }

    @Override
    public final int getY() {
        return this.f11474c;
    }
}
