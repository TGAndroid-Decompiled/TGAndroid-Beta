package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.g40;
import org.telegram.ui.i60;
import s4.d1;
import s4.j;
import zg.j0;
import zg.n0;
public final class f extends j {
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
        int i10;
        h hVar = this.F;
        e eVar = hVar.S0;
        int b10 = d1Var.b();
        List list = eVar.f15340c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f15340c.get(b10);
        }
        if (groupCallMessage != null && (n0Var = groupCallMessage.visibleReaction) != null) {
            View view = d1Var.f47889a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                i60 i60Var = ((g40) gVar).f37926a;
                Context context = i60Var.getContext();
                nl0 nl0Var = i60Var.K;
                i10 = ((e3) i60Var).currentAccount;
                j0 j0Var = new j0(context, null, nl0Var, (c) view, null, 0.0f, 0.0f, n0Var, i10, 1, false);
                j0.B = j0Var;
                j0Var.f54782i.setTag(R.id.parent_tag, 1);
                i60Var.container.addView(j0Var.f54782i);
                j0Var.f54792s = true;
                j0Var.f54797y = System.currentTimeMillis();
            }
        }
    }
}
