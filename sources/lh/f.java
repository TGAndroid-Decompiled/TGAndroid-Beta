package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.e40;
import org.telegram.ui.g60;
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
        List list = eVar.f15598c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f15598c.get(b10);
        }
        if (groupCallMessage != null && (n0Var = groupCallMessage.visibleReaction) != null) {
            View view = d1Var.f47702a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                g60 g60Var = ((e40) gVar).f37195a;
                Context context = g60Var.getContext();
                ll0 ll0Var = g60Var.K;
                i10 = ((f3) g60Var).currentAccount;
                j0 j0Var = new j0(context, null, ll0Var, (c) view, null, 0.0f, 0.0f, n0Var, i10, 1, false);
                j0.B = j0Var;
                j0Var.f54602i.setTag(R.id.parent_tag, 1);
                g60Var.container.addView(j0Var.f54602i);
                j0Var.f54612s = true;
                j0Var.f54617y = System.currentTimeMillis();
            }
        }
    }
}
