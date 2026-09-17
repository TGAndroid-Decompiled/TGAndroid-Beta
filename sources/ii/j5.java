package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class j5 implements ba {
    public final Layout f11459a;
    public final int f11460b;
    public final int f11461c;
    public final o5 d;

    public j5(o5 o5Var, Layout layout, int i10, int i11) {
        this.d = o5Var;
        this.f11459a = layout;
        this.f11460b = i10;
        this.f11461c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11459a;
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
        a aVar = this.d.f11220a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11204b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return f6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11460b;
    }

    @Override
    public final int getY() {
        return this.f11461c;
    }
}
