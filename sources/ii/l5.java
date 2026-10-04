package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class l5 implements ba {
    public final Layout f12512a;
    public final int f12513b;
    public final int f12514c;
    public final q5 d;

    public l5(q5 q5Var, Layout layout, int i10, int i11) {
        this.d = q5Var;
        this.f12512a = layout;
        this.f12513b = i10;
        this.f12514c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f12512a;
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
        a aVar = this.d.f12203a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12186b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return h6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f12513b;
    }

    @Override
    public final int getY() {
        return this.f12514c;
    }
}
