package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.g40;
import org.telegram.ui.i60;
import s4.c1;
import s4.j;
import zg.l0;
import zg.p0;
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
    public final void w(c1 c1Var) {
        p0 p0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.U0;
        int b10 = c1Var.b();
        List list = eVar.f14327c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f14327c.get(b10);
        }
        if (groupCallMessage != null && (p0Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f42995a;
            if ((view instanceof c) && (gVar = hVar.Z0) != null) {
                i60 i60Var = ((g40) gVar).f33824a;
                Context context = i60Var.getContext();
                sk0 sk0Var = i60Var.K;
                i10 = ((f3) i60Var).currentAccount;
                l0 l0Var = new l0(context, null, sk0Var, (c) view, null, 0.0f, 0.0f, p0Var, i10, 1, false);
                l0.B = l0Var;
                l0Var.f49392i.setTag(R.id.parent_tag, 1);
                i60Var.container.addView(l0Var.f49392i);
                l0Var.f49402s = true;
                l0Var.f49407y = System.currentTimeMillis();
            }
        }
    }
}
