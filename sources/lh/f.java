package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.b40;
import org.telegram.ui.d60;
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
        List list = eVar.f14343c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f14343c.get(b10);
        }
        if (groupCallMessage != null && (o0Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f42960a;
            if ((view instanceof c) && (gVar = hVar.Z0) != null) {
                d60 d60Var = ((b40) gVar).f32312a;
                Context context = d60Var.getContext();
                qk0 qk0Var = d60Var.K;
                i10 = ((e3) d60Var).currentAccount;
                k0 k0Var = new k0(context, null, qk0Var, (c) view, null, 0.0f, 0.0f, o0Var, i10, 1, false);
                k0.B = k0Var;
                k0Var.f49341i.setTag(R.id.parent_tag, 1);
                d60Var.container.addView(k0Var.f49341i);
                k0Var.f49351s = true;
                k0Var.f49356y = System.currentTimeMillis();
            }
        }
    }
}
