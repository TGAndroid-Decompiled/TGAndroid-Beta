package nh;

import android.content.Context;
import android.view.View;
import bh.s0;
import bh.x0;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.s30;
import org.telegram.ui.v50;
import s4.e1;
import s4.l;
public final class f extends l {
    public final h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(e1 e1Var) {
        x0 x0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.S0;
        int b10 = e1Var.b();
        List list = eVar.f18863c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f18863c.get(b10);
        }
        if (groupCallMessage != null && (x0Var = groupCallMessage.visibleReaction) != null) {
            View view = e1Var.f47738a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                v50 v50Var = ((s30) gVar).f43350a;
                Context context = v50Var.getContext();
                fl0 fl0Var = v50Var.K;
                i10 = ((k3) v50Var).currentAccount;
                s0 s0Var = new s0(context, null, fl0Var, (c) view, null, 0.0f, 0.0f, x0Var, i10, 1, false);
                s0.B = s0Var;
                s0Var.f4130i.setTag(R.id.parent_tag, 1);
                v50Var.container.addView(s0Var.f4130i);
                s0Var.f4140s = true;
                s0Var.f4145y = System.currentTimeMillis();
            }
        }
    }
}
