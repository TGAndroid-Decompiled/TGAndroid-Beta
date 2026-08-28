package kh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.dp;
public final class k3 extends dp {
    public final int d;
    public final ViewGroup f15515e;

    public k3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, 21, b6Var);
        this.d = i9;
        this.f15515e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((m3) this.f15515e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.r2) this.f15515e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f15515e).invalidate();
                return;
        }
    }

    public k3(m3 m3Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 24, b6Var);
        this.d = 0;
        this.f15515e = m3Var;
    }
}
