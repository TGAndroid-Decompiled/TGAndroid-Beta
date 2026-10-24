package mh;

import ah.d1;
import ah.i1;
import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.q30;
import org.telegram.ui.u50;
import s4.b1;
import s4.k;
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
    public final void w(b1 b1Var) {
        i1 i1Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.S0;
        int b10 = b1Var.b();
        List list = eVar.f17000c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f17000c.get(b10);
        }
        if (groupCallMessage != null && (i1Var = groupCallMessage.visibleReaction) != null) {
            View view = b1Var.f46342a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                u50 u50Var = ((q30) gVar).f40703a;
                Context context = u50Var.getContext();
                fl0 fl0Var = u50Var.K;
                i10 = ((h3) u50Var).currentAccount;
                d1 d1Var = new d1(context, null, fl0Var, (c) view, null, 0.0f, 0.0f, i1Var, i10, 1, false);
                d1.B = d1Var;
                d1Var.f693i.setTag(R.id.parent_tag, 1);
                u50Var.container.addView(d1Var.f693i);
                d1Var.f703s = true;
                d1Var.f708y = System.currentTimeMillis();
            }
        }
    }
}
