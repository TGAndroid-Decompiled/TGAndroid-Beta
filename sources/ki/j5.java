package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class j5 implements y9 {
    public final Layout f15344a;
    public final int f15345b;
    public final int f15346c;
    public final o5 d;

    public j5(o5 o5Var, Layout layout, int i10, int i11) {
        this.d = o5Var;
        this.f15344a = layout;
        this.f15345b = i10;
        this.f15346c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f15344a;
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
        a aVar = this.d.f15111a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15095b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return e6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f15345b;
    }

    @Override
    public final int getY() {
        return this.f15346c;
    }
}
