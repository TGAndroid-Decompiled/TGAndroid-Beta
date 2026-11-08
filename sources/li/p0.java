package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class p0 implements t9 {
    public final Layout f18765a;
    public final int f18766b;
    public final int f18767c;
    public final r0 d;

    public p0(r0 r0Var, Layout layout, int i7, int i10) {
        this.d = r0Var;
        this.f18765a = layout;
        this.f18766b = i7;
        this.f18767c = i10;
    }

    @Override
    public final Layout a() {
        return this.f18765a;
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
        a aVar = this.d.f18806f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18392b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return c6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f18766b;
    }

    @Override
    public final int getY() {
        return this.f18767c;
    }
}
