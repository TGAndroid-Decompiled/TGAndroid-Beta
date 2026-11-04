package oh;

import android.view.View;
import dh.g0;
import dh.j0;
import dh.n0;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.a20;
import org.telegram.ui.x30;
import u4.d1;
import u4.k;
public final class f extends k {
    public final h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(d1 d1Var) {
        n0 n0Var;
        g gVar;
        h hVar = this.F;
        e eVar = hVar.T0;
        int b10 = d1Var.b();
        List list = eVar.f21122c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f21122c.get(b10);
        }
        if (groupCallMessage != null && (n0Var = groupCallMessage.visibleReaction) != null) {
            View view = d1Var.f55540a;
            if ((view instanceof c) && (gVar = hVar.Y0) != null) {
                x30 x30Var = ((a20) gVar).f43568a;
                j0 j0Var = new j0(x30Var.getContext(), null, x30Var.C1, (c) view, null, 0.0f, 0.0f, n0Var, x30Var.f28583a, 1, false);
                j0.B = j0Var;
                g0 g0Var = j0Var.f9040i;
                g0Var.setTag(2131296591, 1);
                x30Var.f28589c.addView(g0Var);
                j0Var.f9050s = true;
                j0Var.f9055y = System.currentTimeMillis();
            }
        }
    }
}
