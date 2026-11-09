package nh;

import android.view.View;
import ch.h0;
import ch.k0;
import ch.o0;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.e40;
import org.telegram.ui.h20;
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
        List list = eVar.f20605c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f20605c.get(b10);
        }
        if (groupCallMessage != null && (o0Var = groupCallMessage.visibleReaction) != null) {
            View view = d1Var.f57056a;
            if ((view instanceof c) && (gVar = hVar.X0) != null) {
                e40 e40Var = ((h20) gVar).f46132a;
                k0 k0Var = new k0(e40Var.getContext(), null, e40Var.B1, (c) view, null, 0.0f, 0.0f, o0Var, e40Var.f28621a, 1, false);
                k0.B = k0Var;
                h0 h0Var = k0Var.f6286i;
                h0Var.setTag(2131296591, 1);
                e40Var.f28627c.addView(h0Var);
                k0Var.f6296s = true;
                k0Var.f6301y = System.currentTimeMillis();
            }
        }
    }
}
