package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
public final class j5 implements ba {
    public final Layout f11458a;
    public final int f11459b;
    public final int f11460c;
    public final o5 d;

    public j5(o5 o5Var, Layout layout, int i10, int i11) {
        this.d = o5Var;
        this.f11458a = layout;
        this.f11459b = i10;
        this.f11460c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f11458a;
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
        a aVar = this.d.f11219a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11203b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return f6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f11459b;
    }

    @Override
    public final int getY() {
        return this.f11460c;
    }
}
