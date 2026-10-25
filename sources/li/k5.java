package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class k5 implements da {
    public final Layout f17333a;
    public final int f17334b;
    public final int f17335c;
    public final p5 d;

    public k5(p5 p5Var, Layout layout, int i10, int i11) {
        this.d = p5Var;
        this.f17333a = layout;
        this.f17334b = i10;
        this.f17335c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f17333a;
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
        a aVar = this.d.f17653a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17054b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return f6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f17334b;
    }

    @Override
    public final int getY() {
        return this.f17335c;
    }
}
