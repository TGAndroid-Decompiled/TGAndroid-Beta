package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class k5 implements ba {
    public final Layout f11483a;
    public final int f11484b;
    public final int f11485c;
    public final p5 d;

    public k5(p5 p5Var, Layout layout, int i10, int i11) {
        this.d = p5Var;
        this.f11483a = layout;
        this.f11484b = i10;
        this.f11485c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11483a;
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
        a aVar = this.d.f11221a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11205b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return g6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11484b;
    }

    @Override
    public final int getY() {
        return this.f11485c;
    }
}
