package dg;

import android.content.Context;
import android.view.ViewGroup;
public final class c2 extends f2.o0 {
    public final Context f4432c;
    public final e2 d;

    public c2(e2 e2Var, Context context) {
        this.d = e2Var;
        this.f4432c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        float f10;
        d2 d2Var = (d2) l1Var.f5774a;
        ViewGroup.LayoutParams layoutParams = d2Var.getLayoutParams();
        e2 e2Var = this.d;
        layoutParams.height = ((e2Var.getHeight() - e2Var.getPaddingTop()) - e2Var.getPaddingBottom()) / 2;
        cg.f1 f1Var = e2Var.X2;
        if (f1Var != null) {
            d2Var.f4455a = f1Var.b(i10);
            d2Var.invalidate();
            if (e2Var.W2 == i10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            d2Var.f4456b = f10;
            d2Var.invalidate();
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new d2(this.d, this.f4432c));
    }
}
