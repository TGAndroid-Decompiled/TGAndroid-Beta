package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class zb2 extends ClickableSpan {
    public final TLRPC.User a;
    public final ac2 b;

    public zb2(ac2 ac2Var, TLRPC.User user) {
        this.b = ac2Var;
        this.a = user;
    }

    @Override
    public final void onClick(View view) {
        rc2 rc2Var = this.b.a;
        mc2 mc2Var = rc2Var.eb;
        if (mc2Var != null) {
            mc2Var.W(rc2Var, this.a, 0.0f, 0.0f);
        }
    }
}
