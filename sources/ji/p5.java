package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;
public final class p5 implements z9 {
    public final Layout f13468a;
    public final int f13469b;
    public final int f13470c;
    public final u5 d;

    public p5(u5 u5Var, Layout layout, int i10, int i11) {
        this.d = u5Var;
        this.f13468a = layout;
        this.f13469b = i10;
        this.f13470c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f13468a;
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
        a aVar = this.d.f13123a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13107b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return k6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f13469b;
    }

    @Override
    public final int getY() {
        return this.f13470c;
    }
}
