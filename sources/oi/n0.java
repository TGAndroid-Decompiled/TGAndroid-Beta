package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;
public final class n0 implements t9 {
    public final Layout f22183a;
    public final int f22184b;
    public final int f22185c;
    public final p0 d;

    public n0(p0 p0Var, Layout layout, int i7, int i10) {
        this.d = p0Var;
        this.f22183a = layout;
        this.f22184b = i7;
        this.f22185c = i10;
    }

    @Override
    public final Layout a() {
        return this.f22183a;
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
        a aVar = this.d.f22236f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21910b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return b6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f22184b;
    }

    @Override
    public final int getY() {
        return this.f22185c;
    }
}
