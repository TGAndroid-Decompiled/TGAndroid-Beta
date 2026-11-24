package defpackage;

import android.view.View;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
public final class z75 extends gb3 {
    public final b85 F;

    public z75(b85 b85Var) {
        this.F = b85Var;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(s49 s49Var) {
        h19 h19Var;
        a85 a85Var;
        b85 b85Var = this.F;
        y75 y75Var = b85Var.T0;
        int b = s49Var.b();
        List list = y75Var.c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b >= 0 && b < list.size()) {
            groupCallMessage = (GroupCallMessage) y75Var.c.get(b);
        }
        if (groupCallMessage != null && (h19Var = groupCallMessage.visibleReaction) != null) {
            View view = s49Var.a;
            if ((view instanceof t75) && (a85Var = b85Var.Y0) != null) {
                h75 h75Var = ((l55) a85Var).a;
                d19 d19Var = new d19(h75Var.getContext(), null, h75Var.D1, (t75) view, null, 0.0f, 0.0f, h19Var, h75Var.a, 1, false);
                d19.B = d19Var;
                a19 a19Var = d19Var.i;
                a19Var.setTag(2131296593, 1);
                h75Var.c.addView(a19Var);
                d19Var.s = true;
                d19Var.y = System.currentTimeMillis();
            }
        }
    }
}
