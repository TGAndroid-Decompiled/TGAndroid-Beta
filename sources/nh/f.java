package nh;

import android.view.View;
import ch.h0;
import ch.k0;
import ch.o0;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.c40;
import org.telegram.ui.f20;
import v4.d1;
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
    public final void w(d1 d1Var) {
        o0 o0Var;
        g gVar;
        h hVar = this.F;
        e eVar = hVar.S0;
        int b10 = d1Var.b();
        List list = eVar.f20602c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f20602c.get(b10);
        }
        if (groupCallMessage != null && (o0Var = groupCallMessage.visibleReaction) != null) {
            View view = d1Var.f56951a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                c40 c40Var = ((f20) gVar).f45467a;
                k0 k0Var = new k0(c40Var.getContext(), null, c40Var.B1, (c) view, null, 0.0f, 0.0f, o0Var, c40Var.f28613a, 1, false);
                k0.B = k0Var;
                h0 h0Var = k0Var.f6288i;
                h0Var.setTag(2131296591, 1);
                c40Var.f28619c.addView(h0Var);
                k0Var.f6298s = true;
                k0Var.f6303y = System.currentTimeMillis();
            }
        }
    }
}
