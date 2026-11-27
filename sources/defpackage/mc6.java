package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mc6 implements tha {
    public final uc6 a;

    public mc6(uc6 uc6Var) {
        this.a = uc6Var;
    }

    @Override
    public final void V() {
        int W;
        boolean z;
        uc6 uc6Var = this.a;
        nc6 nc6Var = uc6Var.R0;
        if (nc6Var == null) {
            W = 0;
        } else {
            W = nc6Var.W(8);
        }
        uc6Var.S0.setText(ob6.G(W, "LocationStories", new Object[0]));
        kc6 kc6Var = uc6Var.Q;
        if (W > 0) {
            z = true;
        } else {
            z = false;
        }
        if (kc6Var.a0 != z) {
            kc6Var.a0 = z;
            kc6Var.f();
            uc6Var.R.y0(0, hl.L(200.0f), null);
        }
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final d79 d() {
        return this.a.R;
    }

    @Override
    public final TLRPC.Chat e() {
        return null;
    }

    @Override
    public final boolean g(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        return false;
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final void I() {
    }
}
