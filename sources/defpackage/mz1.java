package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mz1 extends p3c {
    public final nz1 p1;

    public mz1(nz1 nz1Var, Context context, d dVar, d4c d4cVar, ylb ylbVar) {
        super(context, dVar, d4cVar, ylbVar);
        this.p1 = nz1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.p1.a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.p(false);
        }
    }
}
