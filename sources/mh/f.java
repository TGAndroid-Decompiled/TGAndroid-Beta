package mh;

import ah.d1;
import ah.i1;
import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.k40;
import org.telegram.ui.n60;
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
        List list = eVar.f15844c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f15844c.get(b10);
        }
        if (groupCallMessage != null && (i1Var = groupCallMessage.visibleReaction) != null) {
            View view = b1Var.f44838a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                n60 n60Var = ((k40) gVar).f37563a;
                Context context = n60Var.getContext();
                gl0 gl0Var = n60Var.K;
                i10 = ((e3) n60Var).currentAccount;
                d1 d1Var = new d1(context, null, gl0Var, (c) view, null, 0.0f, 0.0f, i1Var, i10, 1, false);
                d1.B = d1Var;
                d1Var.f689i.setTag(R.id.parent_tag, 1);
                n60Var.container.addView(d1Var.f689i);
                d1Var.f699s = true;
                d1Var.f704y = System.currentTimeMillis();
            }
        }
    }
}
