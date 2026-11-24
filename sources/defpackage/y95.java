package defpackage;

import android.view.View;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
public final class y95 extends sc3 {
    public final aa5 F;

    public y95(aa5 aa5Var) {
        this.F = aa5Var;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(u69 u69Var) {
        k39 k39Var;
        z95 z95Var;
        aa5 aa5Var = this.F;
        x95 x95Var = aa5Var.T0;
        int b = u69Var.b();
        List list = x95Var.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b >= 0 && b < list.size()) {
            groupCallMessage = (GroupCallMessage) x95Var.c.get(b);
        }
        if (groupCallMessage != null && (k39Var = groupCallMessage.visibleReaction) != null) {
            View view = u69Var.a;
            if ((view instanceof s95) && (z95Var = aa5Var.Y0) != null) {
                g95 g95Var = ((j75) z95Var).a;
                g39 g39Var = new g39(g95Var.getContext(), null, g95Var.D1, (s95) view, null, 0.0f, 0.0f, k39Var, g95Var.a, 1, false);
                g39.B = g39Var;
                d39 d39Var = g39Var.i;
                d39Var.setTag(2131296593, 1);
                g95Var.c.addView(d39Var);
                g39Var.s = true;
                g39Var.y = System.currentTimeMillis();
            }
        }
    }
}
