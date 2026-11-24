package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;
public final class tw1 implements h29, gj {
    public final ChatActivityEnterView a;

    public tw1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a(boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        jc jcVar = chatActivityEnterView.X1;
        l lVar = chatActivityEnterView.E2;
        if (lVar != null) {
            lVar.invalidate();
        }
        if (!z) {
            ojc ojcVar = chatActivityEnterView.T1;
            if (ojcVar != null) {
                i29 i29Var = chatActivityEnterView.i1;
                ojcVar.c(Math.round(Math.max(1.0f, (i29Var.w - i29Var.s) * i29Var.r)));
            }
            gl.r(jcVar);
            gl.d3(jcVar, 300L);
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.v1(z, i, i2, 0L, true);
        j47 j47Var = chatActivityEnterView.M0;
        if (j47Var != null) {
            j47Var.g();
            chatActivityEnterView.M0 = null;
        }
    }
}
