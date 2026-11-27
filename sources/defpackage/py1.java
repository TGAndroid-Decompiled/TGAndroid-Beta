package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class py1 extends o5c {
    public final qy1 p1;

    public py1(qy1 qy1Var, Context context, e eVar, d6c d6cVar, vnb vnbVar) {
        super(context, eVar, d6cVar, vnbVar);
        this.p1 = qy1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.p1.a;
        if (chatActivityEnterView.P3 == this) {
            chatActivityEnterView.P3 = null;
        }
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.p(false);
        }
    }
}
