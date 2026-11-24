package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class qk0 implements View.OnClickListener {
    public final byte a = 0;
    public final rk0 b;

    public qk0(rk0 rk0Var) {
        this.b = rk0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rk0 rk0Var = this.b;
        switch (b) {
            case 0:
                int i = rk0Var.w + 1;
                rk0Var.w = i;
                if (i >= 10) {
                    rk0Var.setVisibility(8);
                    gba.g1 = null;
                    gba.x();
                    return;
                }
                return;
            default:
                a.t();
                boolean z = w01.a;
                if (a.a.b(rk0Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = rk0Var.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!a.a.u((Activity) rk0Var.getContext(), rk0Var.n.document)) {
                            ba4.G(rk0Var.s).X(rk0Var.n.document, "update", 3, 1);
                            rk0Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        d01.t(rk0Var.getContext(), rk0Var.n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public qk0(rk0 rk0Var, LaunchActivity launchActivity) {
        this.b = rk0Var;
    }
}
