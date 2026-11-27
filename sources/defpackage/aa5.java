package defpackage;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
public final class aa5 extends w95 {
    public final da5 h;

    public aa5(da5 da5Var) {
        this.h = da5Var;
        this.e = -1;
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        v95 v95Var = new v95(viewGroup.getContext());
        v95Var.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
        u95 u95Var = new u95(v95Var);
        da5 da5Var = this.h;
        View view = da5Var.X0;
        RenderNode renderNode = da5Var.V0;
        float f = da5Var.W0;
        v95 v95Var2 = u95Var.v;
        v95Var2.H = view;
        v95Var2.F = renderNode;
        v95Var2.G = f;
        v95Var2.setDelegate(da5Var.Z0);
        return u95Var;
    }
}
