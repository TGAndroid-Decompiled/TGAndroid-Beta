package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class l5 implements z9 {
    public final Layout f12558a;
    public final int f12559b;
    public final int f12560c;
    public final q5 d;

    public l5(q5 q5Var, Layout layout, int i10, int i11) {
        this.d = q5Var;
        this.f12558a = layout;
        this.f12559b = i10;
        this.f12560c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f12558a;
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
        a aVar = this.d.f12251a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12234b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return h6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f12559b;
    }

    @Override
    public final int getY() {
        return this.f12560c;
    }
}
