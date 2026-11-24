package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zx1 extends p1c {
    public final ay1 p1;

    public zx1(ay1 ay1Var, Context context, d dVar, d2c d2cVar, wjb wjbVar) {
        super(context, dVar, d2cVar, wjbVar);
        this.p1 = ay1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.p1.a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.m(false);
        }
    }
}
