package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class n0 implements s9 {
    public final Layout f21829a;
    public final int f21830b;
    public final int f21831c;
    public final p0 d;

    public n0(p0 p0Var, Layout layout, int i7, int i10) {
        this.d = p0Var;
        this.f21829a = layout;
        this.f21830b = i7;
        this.f21831c = i10;
    }

    @Override
    public final Layout a() {
        return this.f21829a;
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
        a aVar = this.d.f21869f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return a6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f21830b;
    }

    @Override
    public final int getY() {
        return this.f21831c;
    }
}
