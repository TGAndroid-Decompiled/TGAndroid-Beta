package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class eb2 extends ClickableSpan {
    public final TLRPC.User a;
    public final fb2 b;

    public eb2(fb2 fb2Var, TLRPC.User user) {
        this.b = fb2Var;
        this.a = user;
    }

    @Override
    public final void onClick(View view) {
        wb2 wb2Var = this.b.a;
        rb2 rb2Var = wb2Var.eb;
        if (rb2Var != null) {
            rb2Var.W(wb2Var, this.a, 0.0f, 0.0f);
        }
    }
}
