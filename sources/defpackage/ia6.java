package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ia6 implements cea {
    public final qa6 a;

    public ia6(qa6 qa6Var) {
        this.a = qa6Var;
    }

    @Override
    public final void V() {
        int W;
        boolean z;
        qa6 qa6Var = this.a;
        ja6 ja6Var = qa6Var.R0;
        if (ja6Var == null) {
            W = 0;
        } else {
            W = ja6Var.W(8);
        }
        qa6Var.S0.setText(k96.G(W, "LocationStories", new Object[0]));
        ga6 ga6Var = qa6Var.Q;
        if (W > 0) {
            z = true;
        } else {
            z = false;
        }
        if (ga6Var.a0 != z) {
            ga6Var.a0 = z;
            ga6Var.f();
            qa6Var.R.x0(0, gl.L(200.0f), null);
        }
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final o39 e() {
        return this.a.R;
    }

    @Override
    public final TLRPC.Chat f() {
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
