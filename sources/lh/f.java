package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.e40;
import org.telegram.ui.g60;
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
        List list = eVar.f14345c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f14345c.get(b10);
        }
        if (groupCallMessage != null && (p0Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f43005a;
            if ((view instanceof c) && (gVar = hVar.Z0) != null) {
                g60 g60Var = ((e40) gVar).f33120a;
                Context context = g60Var.getContext();
                sk0 sk0Var = g60Var.K;
                i10 = ((g3) g60Var).currentAccount;
                l0 l0Var = new l0(context, null, sk0Var, (c) view, null, 0.0f, 0.0f, p0Var, i10, 1, false);
                l0.B = l0Var;
                l0Var.f49389i.setTag(R.id.parent_tag, 1);
                g60Var.container.addView(l0Var.f49389i);
                l0Var.f49399s = true;
                l0Var.f49404y = System.currentTimeMillis();
            }
        }
    }
}
