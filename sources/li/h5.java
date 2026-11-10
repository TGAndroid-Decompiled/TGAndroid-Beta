package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class h5 implements t9 {
    public final Layout f18633a;
    public final int f18634b;
    public final int f18635c;
    public final m5 d;

    public h5(m5 m5Var, Layout layout, int i7, int i10) {
        this.d = m5Var;
        this.f18633a = layout;
        this.f18634b = i7;
        this.f18635c = i10;
    }

    @Override
    public final Layout a() {
        return this.f18633a;
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
        a aVar = this.d.f18994a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18395b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return c6.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f18634b;
    }

    @Override
    public final int getY() {
        return this.f18635c;
    }
}
