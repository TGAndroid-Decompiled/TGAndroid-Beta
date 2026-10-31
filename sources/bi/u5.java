package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;
public final class u5 implements u9 {
    public final Layout f3388a;
    public final int f3389b;
    public final int f3390c;
    public final z5 d;

    public u5(z5 z5Var, Layout layout, int i10, int i11) {
        this.d = z5Var;
        this.f3388a = layout;
        this.f3389b = i10;
        this.f3390c = i11;
    }

    @Override
    public final Layout a() {
        return this.f3388a;
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
        a aVar = this.d.f2881a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return s6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f3389b;
    }

    @Override
    public final int getY() {
        return this.f3390c;
    }
}
