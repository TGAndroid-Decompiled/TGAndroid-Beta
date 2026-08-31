package eg;

import android.content.Context;
import android.view.ViewGroup;
public final class a2 extends f2.p0 {
    public final Context f5064c;
    public final c2 d;

    public a2(c2 c2Var, Context context) {
        this.d = c2Var;
        this.f5064c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        float f10;
        b2 b2Var = (b2) m1Var.f5875a;
        ViewGroup.LayoutParams layoutParams = b2Var.getLayoutParams();
        c2 c2Var = this.d;
        layoutParams.height = ((c2Var.getHeight() - c2Var.getPaddingTop()) - c2Var.getPaddingBottom()) / 2;
        dg.e1 e1Var = c2Var.X2;
        if (e1Var != null) {
            b2Var.f5094a = e1Var.b(i10);
            b2Var.invalidate();
            if (c2Var.W2 == i10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            b2Var.f5095b = f10;
            b2Var.invalidate();
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new b2(this.d, this.f5064c));
    }
}
