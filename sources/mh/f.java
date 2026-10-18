package mh;

import ah.d1;
import ah.i1;
import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.p30;
import org.telegram.ui.s50;
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
        List list = eVar.f16936c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f16936c.get(b10);
        }
        if (groupCallMessage != null && (i1Var = groupCallMessage.visibleReaction) != null) {
            View view = b1Var.f45910a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                s50 s50Var = ((p30) gVar).f39930a;
                Context context = s50Var.getContext();
                cl0 cl0Var = s50Var.K;
                i10 = ((f3) s50Var).currentAccount;
                d1 d1Var = new d1(context, null, cl0Var, (c) view, null, 0.0f, 0.0f, i1Var, i10, 1, false);
                d1.B = d1Var;
                d1Var.f695i.setTag(R.id.parent_tag, 1);
                s50Var.container.addView(d1Var.f695i);
                d1Var.f705s = true;
                d1Var.f710y = System.currentTimeMillis();
            }
        }
    }
}
