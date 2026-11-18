package nh;

import android.view.View;
import ch.i0;
import ch.l0;
import ch.p0;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.f40;
import org.telegram.ui.h20;
import v4.f1;
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
    public final void w(f1 f1Var) {
        p0 p0Var;
        g gVar;
        h hVar = this.F;
        e eVar = hVar.T0;
        int b10 = f1Var.b();
        List list = eVar.f21539c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f21539c.get(b10);
        }
        if (groupCallMessage != null && (p0Var = groupCallMessage.visibleReaction) != null) {
            View view = f1Var.f59122a;
            if ((view instanceof c) && (gVar = hVar.Y0) != null) {
                f40 f40Var = ((h20) gVar).f48204a;
                l0 l0Var = new l0(f40Var.getContext(), null, f40Var.F1, (c) view, null, 0.0f, 0.0f, p0Var, f40Var.f30189a, 1, false);
                l0.B = l0Var;
                i0 i0Var = l0Var.f5409i;
                i0Var.setTag(2131296591, 1);
                f40Var.f30195c.addView(i0Var);
                l0Var.f5419s = true;
                l0Var.f5424y = System.currentTimeMillis();
            }
        }
    }
}
