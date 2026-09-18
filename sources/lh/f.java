package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.g40;
import org.telegram.ui.i60;
import s4.c1;
import s4.j;
import zg.k0;
import zg.o0;
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
        o0 o0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.U0;
        int b10 = c1Var.b();
        List list = eVar.f14276c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f14276c.get(b10);
        }
        if (groupCallMessage != null && (o0Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f42929a;
            if ((view instanceof c) && (gVar = hVar.Z0) != null) {
                i60 i60Var = ((g40) gVar).f33689a;
                Context context = i60Var.getContext();
                qk0 qk0Var = i60Var.K;
                i10 = ((f3) i60Var).currentAccount;
                k0 k0Var = new k0(context, null, qk0Var, (c) view, null, 0.0f, 0.0f, o0Var, i10, 1, false);
                k0.B = k0Var;
                k0Var.f49322i.setTag(R.id.parent_tag, 1);
                i60Var.container.addView(k0Var.f49322i);
                k0Var.f49332s = true;
                k0Var.f49337y = System.currentTimeMillis();
            }
        }
    }
}
