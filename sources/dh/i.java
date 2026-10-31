package dh;

import android.view.View;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.b50;
import org.telegram.ui.e30;
import s4.c1;
import sg.h0;
import sg.k0;
import sg.o0;
public final class i extends s4.j {
    public final k F;

    public i(k kVar) {
        this.F = kVar;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(c1 c1Var) {
        o0 o0Var;
        j jVar;
        k kVar = this.F;
        h hVar = kVar.S0;
        int b10 = c1Var.b();
        List list = hVar.f5945c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) hVar.f5945c.get(b10);
        }
        if (groupCallMessage != null && (o0Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f47898a;
            if ((view instanceof d) && (jVar = kVar.X0) != null) {
                b50 b50Var = ((e30) jVar).f36902a;
                k0 k0Var = new k0(b50Var.getContext(), null, b50Var.B1, (d) view, null, 0.0f, 0.0f, o0Var, b50Var.f21583a, 1, false);
                k0.B = k0Var;
                h0 h0Var = k0Var.f48370i;
                h0Var.setTag(2131296591, 1);
                b50Var.f21589c.addView(h0Var);
                k0Var.f48380s = true;
                k0Var.f48385y = System.currentTimeMillis();
            }
        }
    }
}
