package nh;

import android.view.View;
import ch.i0;
import ch.l0;
import ch.p0;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.c40;
import org.telegram.ui.e20;
import v4.e1;
import v4.k;
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
    public final void w(e1 e1Var) {
        p0 p0Var;
        g gVar;
        h hVar = this.F;
        e eVar = hVar.T0;
        int b10 = e1Var.b();
        List list = eVar.f21175c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f21175c.get(b10);
        }
        if (groupCallMessage != null && (p0Var = groupCallMessage.visibleReaction) != null) {
            View view = e1Var.f58535a;
            if ((view instanceof c) && (gVar = hVar.Y0) != null) {
                c40 c40Var = ((e20) gVar).f46533a;
                l0 l0Var = new l0(c40Var.getContext(), null, c40Var.F1, (c) view, null, 0.0f, 0.0f, p0Var, c40Var.f29679a, 1, false);
                l0.B = l0Var;
                i0 i0Var = l0Var.f5118i;
                i0Var.setTag(2131296591, 1);
                c40Var.f29685c.addView(i0Var);
                l0Var.f5128s = true;
                l0Var.f5133y = System.currentTimeMillis();
            }
        }
    }
}
