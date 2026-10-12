package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class p5 implements z9 {
    public final Layout f13465a;
    public final int f13466b;
    public final int f13467c;
    public final u5 d;

    public p5(u5 u5Var, Layout layout, int i10, int i11) {
        this.d = u5Var;
        this.f13465a = layout;
        this.f13466b = i10;
        this.f13467c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f13465a;
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
        a aVar = this.d.f13119a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13103b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return k6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f13466b;
    }

    @Override
    public final int getY() {
        return this.f13467c;
    }
}
