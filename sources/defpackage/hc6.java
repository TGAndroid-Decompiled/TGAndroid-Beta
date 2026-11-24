package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class hc6 implements cga {
    public final pc6 a;

    public hc6(pc6 pc6Var) {
        this.a = pc6Var;
    }

    @Override
    public final void W() {
        int W;
        boolean z;
        pc6 pc6Var = this.a;
        ic6 ic6Var = pc6Var.R0;
        if (ic6Var == null) {
            W = 0;
        } else {
            W = ic6Var.W(8);
        }
        pc6Var.S0.setText(jb6.G(W, "LocationStories", new Object[0]));
        fc6 fc6Var = pc6Var.Q;
        if (W > 0) {
            z = true;
        } else {
            z = false;
        }
        if (fc6Var.a0 != z) {
            fc6Var.a0 = z;
            fc6Var.f();
            pc6Var.R.x0(0, gm.L(200.0f), null);
        }
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final r59 e() {
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
    public final boolean t() {
        return true;
    }

    @Override
    public final void I() {
    }
}
