package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class q0 implements s9 {
    public final Layout f19827a;
    public final int f19828b;
    public final int f19829c;
    public final s0 d;

    public q0(s0 s0Var, Layout layout, int i3, int i10) {
        this.d = s0Var;
        this.f19827a = layout;
        this.f19828b = i3;
        this.f19829c = i10;
    }

    @Override
    public final Layout a() {
        return this.f19827a;
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
        a aVar = this.d.f19875f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return d6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f19828b;
    }

    @Override
    public final int getY() {
        return this.f19829c;
    }
}
