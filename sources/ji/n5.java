package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class n5 implements ba {
    public final Layout f14105a;
    public final int f14106b;
    public final int f14107c;
    public final s5 d;

    public n5(s5 s5Var, Layout layout, int i10, int i11) {
        this.d = s5Var;
        this.f14105a = layout;
        this.f14106b = i10;
        this.f14107c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f14105a;
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
        a aVar = this.d.f13775a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13758b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return i6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f14106b;
    }

    @Override
    public final int getY() {
        return this.f14107c;
    }
}
