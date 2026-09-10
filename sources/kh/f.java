package kh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.h40;
import org.telegram.ui.j60;
import s4.c1;
import s4.j;
import yg.l0;
import yg.p0;
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
        List list = eVar.f12515c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f12515c.get(b10);
        }
        if (groupCallMessage != null && (p0Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f41610a;
            if ((view instanceof c) && (gVar = hVar.Z0) != null) {
                j60 j60Var = ((h40) gVar).f33268a;
                Context context = j60Var.getContext();
                pk0 pk0Var = j60Var.K;
                i10 = ((h3) j60Var).currentAccount;
                l0 l0Var = new l0(context, null, pk0Var, (c) view, null, 0.0f, 0.0f, p0Var, i10, 1, false);
                l0.B = l0Var;
                l0Var.f47046i.setTag(R.id.parent_tag, 1);
                j60Var.container.addView(l0Var.f47046i);
                l0Var.f47056s = true;
                l0Var.f47061y = System.currentTimeMillis();
            }
        }
    }
}
