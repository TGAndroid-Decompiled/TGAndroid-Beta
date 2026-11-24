package defpackage;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class s36 implements Runnable {
    public final byte a;
    public final i46 b;

    public s36(i46 i46Var, byte b) {
        this.a = b;
        this.b = i46Var;
    }

    @Override
    public final void run() {
        String G;
        byte b = this.a;
        i46 i46Var = this.b;
        switch (b) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.a = true;
                    i46Var.F2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                i46Var.s2.h(i46Var.W1, false);
                i46Var.k1();
                return;
            case 2:
                HashSet hashSet = i46Var.t2;
                c41 Y = c41.Y();
                if (Y != null) {
                    if (hashSet.size() == 1) {
                        G = jb6.a0(null, null, 2131748900, bw2.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = jb6.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    b10.u(G, Y, 2131624341, 36);
                    return;
                }
                return;
            case 3:
                b61 b61Var = i46Var.N2;
                TLRPC.ChatFull M0 = oc7.r1(i46Var.a).M0(-i46Var.V1);
                b61Var.c(Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0), false);
                return;
            default:
                if (sd2.N(i46Var.e1())) {
                    if (i46Var.z2.getParent() != null) {
                        ((ViewGroup) i46Var.z2.getParent()).removeView(i46Var.z2);
                    }
                    sb sbVar = i46Var.G2;
                    if (sbVar != null && sbVar.getParent() != null) {
                        ((ViewGroup) i46Var.G2.getParent()).removeView(i46Var.G2);
                    }
                    i46Var.n1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
