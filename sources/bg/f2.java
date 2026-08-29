package bg;

import android.content.Context;
import android.view.ViewGroup;
public final class f2 extends f2.p0 {
    public final Context f2197c;
    public final h2 d;

    public f2(h2 h2Var, Context context) {
        this.d = h2Var;
        this.f2197c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        float f9;
        g2 g2Var = (g2) n1Var.f6432a;
        ViewGroup.LayoutParams layoutParams = g2Var.getLayoutParams();
        h2 h2Var = this.d;
        layoutParams.height = ((h2Var.getHeight() - h2Var.getPaddingTop()) - h2Var.getPaddingBottom()) / 2;
        ag.h1 h1Var = h2Var.W2;
        if (h1Var != null) {
            g2Var.f2262a = h1Var.b(i10);
            g2Var.invalidate();
            if (h2Var.V2 == i10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            g2Var.f2263b = f9;
            g2Var.invalidate();
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new g2(this.d, this.f2197c));
    }
}
