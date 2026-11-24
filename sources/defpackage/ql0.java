package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ql0 implements View.OnClickListener {
    public final byte a = 0;
    public final rl0 b;

    public ql0(rl0 rl0Var) {
        this.b = rl0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rl0 rl0Var = this.b;
        switch (b) {
            case 0:
                int i = rl0Var.w + 1;
                rl0Var.w = i;
                if (i >= 10) {
                    rl0Var.setVisibility(8);
                    gda.f1 = null;
                    gda.x();
                    return;
                }
                return;
            default:
                a.t();
                boolean z = e21.a;
                if (a.a.b(rl0Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = rl0Var.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!a.a.u((Activity) rl0Var.getContext(), rl0Var.n.document)) {
                            bc4.G(rl0Var.s).X(rl0Var.n.document, "update", 3, 1);
                            rl0Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        l11.u(rl0Var.getContext(), rl0Var.n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public ql0(rl0 rl0Var, LaunchActivity launchActivity) {
        this.b = rl0Var;
    }
}
