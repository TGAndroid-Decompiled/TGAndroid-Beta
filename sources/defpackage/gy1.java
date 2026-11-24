package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;
public final class gy1 implements k49, gk {
    public final ChatActivityEnterView a;

    public gy1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a(boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        jd jdVar = chatActivityEnterView.X1;
        l lVar = chatActivityEnterView.E2;
        if (lVar != null) {
            lVar.invalidate();
        }
        if (!z) {
            olc olcVar = chatActivityEnterView.T1;
            if (olcVar != null) {
                l49 l49Var = chatActivityEnterView.i1;
                olcVar.c(Math.round(Math.max(1.0f, (l49Var.w - l49Var.s) * l49Var.r)));
            }
            gm.r(jdVar);
            gm.d3(jdVar, 300L);
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.x1(z, i, i2, 0L, true);
        j67 j67Var = chatActivityEnterView.M0;
        if (j67Var != null) {
            j67Var.g();
            chatActivityEnterView.M0 = null;
        }
    }
}
