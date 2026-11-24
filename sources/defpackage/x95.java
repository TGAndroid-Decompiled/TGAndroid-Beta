package defpackage;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
public final class x95 extends t95 {
    public final aa5 h;

    public x95(aa5 aa5Var) {
        this.h = aa5Var;
        this.e = -1;
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        s95 s95Var = new s95(viewGroup.getContext());
        s95Var.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        r95 r95Var = new r95(s95Var);
        aa5 aa5Var = this.h;
        View view = aa5Var.X0;
        RenderNode renderNode = aa5Var.V0;
        float f = aa5Var.W0;
        s95 s95Var2 = r95Var.v;
        s95Var2.H = view;
        s95Var2.F = renderNode;
        s95Var2.G = f;
        s95Var2.setDelegate(aa5Var.Z0);
        return r95Var;
    }
}
