package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class i5 implements s9 {
    public final Layout f19692a;
    public final int f19693b;
    public final int f19694c;
    public final n5 d;

    public i5(n5 n5Var, Layout layout, int i3, int i10) {
        this.d = n5Var;
        this.f19692a = layout;
        this.f19693b = i3;
        this.f19694c = i10;
    }

    @Override
    public final Layout a() {
        return this.f19692a;
    }

    @Override
    public final Rect c() {
        return null;
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
    public final CharSequence getText() {
        TL_iv.RichText richText;
        a aVar = this.d.f20029a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return d6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f19693b;
    }

    @Override
    public final int getY() {
        return this.f19694c;
    }
}
