package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class k5 implements z9 {
    public final Layout f12535a;
    public final int f12536b;
    public final int f12537c;
    public final p5 d;

    public k5(p5 p5Var, Layout layout, int i10, int i11) {
        this.d = p5Var;
        this.f12535a = layout;
        this.f12536b = i10;
        this.f12537c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f12535a;
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
        a aVar = this.d.f12249a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12232b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return g6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f12536b;
    }

    @Override
    public final int getY() {
        return this.f12537c;
    }
}
