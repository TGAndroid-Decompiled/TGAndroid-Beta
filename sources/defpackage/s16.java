package defpackage;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class s16 implements Runnable {
    public final byte a;
    public final h26 b;

    public s16(h26 h26Var, byte b) {
        this.a = b;
        this.b = h26Var;
    }

    @Override
    public final void run() {
        String G;
        byte b = this.a;
        h26 h26Var = this.b;
        switch (b) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.a = true;
                    h26Var.F2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                h26Var.s2.h(h26Var.W1, false);
                h26Var.k1();
                return;
            case 2:
                HashSet hashSet = h26Var.t2;
                u21 Y = u21.Y();
                if (Y != null) {
                    if (hashSet.size() == 1) {
                        G = k96.a0(null, null, 2131748951, qu2.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = k96.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    b00.u(G, Y, 2131624340, 36);
                    return;
                }
                return;
            case 3:
                u41 u41Var = h26Var.N2;
                TLRPC.ChatFull L0 = na7.q1(h26Var.a).L0(-h26Var.V1);
                u41Var.c(Math.max(L0.boosts_unrestrict - L0.boosts_applied, 0), false);
                return;
            default:
                if (hc2.N(h26Var.e1())) {
                    if (h26Var.z2.getParent() != null) {
                        ((ViewGroup) h26Var.z2.getParent()).removeView(h26Var.z2);
                    }
                    sb sbVar = h26Var.G2;
                    if (sbVar != null && sbVar.getParent() != null) {
                        ((ViewGroup) h26Var.G2.getParent()).removeView(h26Var.G2);
                    }
                    h26Var.n1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
