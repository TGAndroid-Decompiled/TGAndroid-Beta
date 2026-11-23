package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class o0 implements t9 {
    public final Layout f22339a;
    public final int f22340b;
    public final int f22341c;
    public final q0 d;

    public o0(q0 q0Var, Layout layout, int i7, int i10) {
        this.d = q0Var;
        this.f22339a = layout;
        this.f22340b = i7;
        this.f22341c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22339a;
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
        a aVar = this.d.f22391f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f22001b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return c6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22340b;
    }

    @Override
    public final int getY() {
        return this.f22341c;
    }
}
