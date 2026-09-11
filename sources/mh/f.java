package mh;

import ah.e1;
import ah.j1;
import android.content.Context;
import android.view.View;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.g40;
import org.telegram.ui.j60;
import s4.c1;
import s4.j;
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
        j1 j1Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.U0;
        int b10 = c1Var.b();
        List list = eVar.f16325c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f16325c.get(b10);
        }
        if (groupCallMessage != null && (j1Var = groupCallMessage.visibleReaction) != null) {
            View view = c1Var.f45738a;
            if ((view instanceof c) && (gVar = hVar.Z0) != null) {
                j60 j60Var = ((g40) gVar).f36558a;
                Context context = j60Var.getContext();
                fk0 fk0Var = j60Var.K;
                i10 = ((f3) j60Var).currentAccount;
                e1 e1Var = new e1(context, null, fk0Var, (c) view, null, 0.0f, 0.0f, j1Var, i10, 1, false);
                e1.B = e1Var;
                e1Var.f512i.setTag(R.id.parent_tag, 1);
                j60Var.container.addView(e1Var.f512i);
                e1Var.f522s = true;
                e1Var.f527y = System.currentTimeMillis();
            }
        }
    }
}
