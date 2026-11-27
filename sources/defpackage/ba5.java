package defpackage;

import android.view.View;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
public final class ba5 extends zb3 {
    public final da5 F;

    public ba5(da5 da5Var) {
        this.F = da5Var;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(f89 f89Var) {
        w49 w49Var;
        ca5 ca5Var;
        da5 da5Var = this.F;
        aa5 aa5Var = da5Var.T0;
        int b = f89Var.b();
        List list = aa5Var.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b >= 0 && b < list.size()) {
            groupCallMessage = (GroupCallMessage) aa5Var.c.get(b);
        }
        if (groupCallMessage != null && (w49Var = groupCallMessage.visibleReaction) != null) {
            View view = f89Var.a;
            if ((view instanceof v95) && (ca5Var = da5Var.Y0) != null) {
                j95 j95Var = ((n75) ca5Var).a;
                s49 s49Var = new s49(j95Var.getContext(), null, j95Var.D1, (v95) view, null, 0.0f, 0.0f, w49Var, j95Var.a, 1, false);
                s49.B = s49Var;
                p49 p49Var = s49Var.i;
                p49Var.setTag(2131296593, 1);
                j95Var.c.addView(p49Var);
                s49Var.s = true;
                s49Var.y = System.currentTimeMillis();
            }
        }
    }
}
