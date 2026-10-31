package kg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class a0 implements Runnable {
    public final int f10991a;
    public final q0 f10992b;

    public a0(q0 q0Var, int i10) {
        this.f10991a = i10;
        this.f10992b = q0Var;
    }

    @Override
    public final void run() {
        String G;
        int i10 = this.f10991a;
        q0 q0Var = this.f10992b;
        switch (i10) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    ?? obj = new Object();
                    obj.f20389a = true;
                    q0Var.C2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                q0Var.f11239p2.g(q0Var.T1, false);
                q0Var.t1();
                return;
            case 2:
                HashSet hashSet = q0Var.f11240q2;
                cc X = cc.X();
                if (X != null) {
                    if (hashSet.size() == 1) {
                        G = cd.a0(null, null, 2131749153, i5.p((TLRPC.User) hashSet.iterator().next()));
                    } else {
                        G = cd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size()));
                    }
                    z20.s(G, X, 2131624343, 36);
                    return;
                }
                return;
            case 3:
                vh.d dVar = q0Var.K2;
                TLRPC.ChatFull M0 = vp.r1(q0Var.f21583a).M0(-q0Var.S1);
                dVar.c(Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0), false);
                return;
            default:
                if (w3.N(q0Var.n1())) {
                    if (q0Var.f11246w2.getParent() != null) {
                        ((ViewGroup) q0Var.f11246w2.getParent()).removeView(q0Var.f11246w2);
                    }
                    bi.t0 t0Var = q0Var.D2;
                    if (t0Var != null && t0Var.getParent() != null) {
                        ((ViewGroup) q0Var.D2.getParent()).removeView(q0Var.D2);
                    }
                    q0Var.f26666k1.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
