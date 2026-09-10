package hi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;
public final class m5 implements da {
    public final Layout f9746a;
    public final int f9747b;
    public final int f9748c;
    public final r5 d;

    public m5(r5 r5Var, Layout layout, int i10, int i11) {
        this.d = r5Var;
        this.f9746a = layout;
        this.f9747b = i10;
        this.f9748c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f9746a;
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
        a aVar = this.d.f9464a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return i6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f9747b;
    }

    @Override
    public final int getY() {
        return this.f9748c;
    }
}
