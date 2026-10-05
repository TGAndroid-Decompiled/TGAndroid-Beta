package lh;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.g40;
import org.telegram.ui.h60;
import s4.c1;
import s4.j;
import zg.i0;
import zg.m0;
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
        m0 m0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.U0;
        int b10 = c1Var.b();
        List list = eVar.f15598c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f15598c.get(b10);
        }
        if (groupCallMessage != null && (m0Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f46538a;
            if ((view instanceof c) && (gVar = hVar.Z0) != null) {
                h60 h60Var = ((g40) gVar).f36507a;
                Context context = h60Var.getContext();
                sk0 sk0Var = h60Var.K;
                i10 = ((f3) h60Var).currentAccount;
                i0 i0Var = new i0(context, null, sk0Var, (c) view, null, 0.0f, 0.0f, m0Var, i10, 1, false);
                i0.B = i0Var;
                i0Var.f53413i.setTag(R.id.parent_tag, 1);
                h60Var.container.addView(i0Var.f53413i);
                i0Var.f53423s = true;
                i0Var.f53428y = System.currentTimeMillis();
            }
        }
    }
}
