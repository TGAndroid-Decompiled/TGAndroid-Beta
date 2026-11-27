package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;
public final class fx1 implements w59, hj {
    public final ChatActivityEnterView a;

    public fx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a(boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        kc kcVar = chatActivityEnterView.W1;
        l lVar = chatActivityEnterView.D2;
        if (lVar != null) {
            lVar.invalidate();
        }
        if (!z) {
            boc bocVar = chatActivityEnterView.S1;
            if (bocVar != null) {
                x59 x59Var = chatActivityEnterView.i1;
                bocVar.c(Math.round(Math.max(1.0f, (x59Var.w - x59Var.s) * x59Var.r)));
            }
            hl.r(kcVar);
            hl.d3(kcVar, 300L);
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F1(z, i, i2, 0L, true);
        q67 q67Var = chatActivityEnterView.M0;
        if (q67Var != null) {
            q67Var.g();
            chatActivityEnterView.M0 = null;
        }
    }
}
