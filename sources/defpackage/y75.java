package defpackage;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
public final class y75 extends u75 {
    public final b85 h;

    public y75(b85 b85Var) {
        this.h = b85Var;
        this.e = -1;
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        t75 t75Var = new t75(viewGroup.getContext());
        t75Var.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
        s75 s75Var = new s75(t75Var);
        b85 b85Var = this.h;
        View view = b85Var.X0;
        RenderNode renderNode = b85Var.V0;
        float f = b85Var.W0;
        t75 t75Var2 = s75Var.v;
        t75Var2.H = view;
        t75Var2.F = renderNode;
        t75Var2.G = f;
        t75Var2.setDelegate(b85Var.Z0);
        return s75Var;
    }
}
