package defpackage;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class w36 implements Runnable {
    public final byte a;
    public final l46 b;

    public w36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override
    public final void run() {
        String G;
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.a = true;
                    l46Var.F2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                l46Var.s2.h(l46Var.W1, false);
                l46Var.l1();
                return;
            case 2:
                HashSet hashSet = l46Var.t2;
                d31 Y = d31.Y();
                if (Y != null) {
                    if (hashSet.size() == 1) {
                        G = ob6.a0(null, null, 2131748897, lv2.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = ob6.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    c00.v(G, Y, 2131624341, 36);
                    return;
                }
                return;
            case 3:
                c51 c51Var = l46Var.N2;
                TLRPC.ChatFull N0 = uc7.s1(l46Var.a).N0(-l46Var.V1);
                c51Var.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                return;
            default:
                if (xc2.N(l46Var.f1())) {
                    if (l46Var.z2.getParent() != null) {
                        ((ViewGroup) l46Var.z2.getParent()).removeView(l46Var.z2);
                    }
                    tb tbVar = l46Var.G2;
                    if (tbVar != null && tbVar.getParent() != null) {
                        ((ViewGroup) l46Var.G2.getParent()).removeView(l46Var.G2);
                    }
                    l46Var.n1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
