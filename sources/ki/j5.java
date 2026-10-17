package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class j5 implements y9 {
    public final Layout f15338a;
    public final int f15339b;
    public final int f15340c;
    public final o5 d;

    public j5(o5 o5Var, Layout layout, int i10, int i11) {
        this.d = o5Var;
        this.f15338a = layout;
        this.f15339b = i10;
        this.f15340c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f15338a;
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
        a aVar = this.d.f15105a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15089b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return e6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f15339b;
    }

    @Override
    public final int getY() {
        return this.f15340c;
    }
}
