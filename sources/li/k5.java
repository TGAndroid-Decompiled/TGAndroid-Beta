package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class k5 implements da {
    public final Layout f17332a;
    public final int f17333b;
    public final int f17334c;
    public final p5 d;

    public k5(p5 p5Var, Layout layout, int i10, int i11) {
        this.d = p5Var;
        this.f17332a = layout;
        this.f17333b = i10;
        this.f17334c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f17332a;
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
        a aVar = this.d.f17652a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17053b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return f6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f17333b;
    }

    @Override
    public final int getY() {
        return this.f17334c;
    }
}
