package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class rk0 implements View.OnClickListener {
    public final byte a = 0;
    public final sk0 b;

    public rk0(sk0 sk0Var) {
        this.b = sk0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        sk0 sk0Var = this.b;
        switch (b) {
            case 0:
                int i = sk0Var.w + 1;
                sk0Var.w = i;
                if (i >= 10) {
                    sk0Var.setVisibility(8);
                    xea.f1 = null;
                    xea.x();
                    return;
                }
                return;
            default:
                a.t();
                boolean z = f11.a;
                if (a.a.b(sk0Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = sk0Var.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!a.a.u((Activity) sk0Var.getContext(), sk0Var.n.document)) {
                            xb4.G(sk0Var.s).X(sk0Var.n.document, "update", 3, 1);
                            sk0Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        m01.u(sk0Var.getContext(), sk0Var.n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public rk0(sk0 sk0Var, LaunchActivity launchActivity) {
        this.b = sk0Var;
    }
}
