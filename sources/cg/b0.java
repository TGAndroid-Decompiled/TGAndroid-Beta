package cg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class b0 implements Runnable {
    public final int f3072a;
    public final v0 f3073b;

    public b0(v0 v0Var, int i10) {
        this.f3072a = i10;
        this.f3073b = v0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f3072a;
        v0 v0Var = this.f3073b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    v0Var.G0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                v0Var.f3419t0.e(v0Var.X, false);
                v0Var.z1();
                return;
            case 2:
                HashSet hashSet = v0Var.f3420u0;
                tc X = tc.X();
                if (X != null) {
                    if (hashSet.size() == 1) {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) hashSet.iterator().next())))).j();
                        return;
                    } else {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", hashSet.size(), Integer.valueOf(hashSet.size())))).j();
                        return;
                    }
                }
                return;
            case 3:
                nh.d dVar = v0Var.O0;
                TLRPC.ChatFull t12 = v0Var.t1();
                dVar.c(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(v0Var.s1())) {
                    if (v0Var.A0.getParent() != null) {
                        ((ViewGroup) v0Var.A0.getParent()).removeView(v0Var.A0);
                    }
                    h0 h0Var = v0Var.H0;
                    if (h0Var != null && h0Var.getParent() != null) {
                        ((ViewGroup) v0Var.H0.getParent()).removeView(v0Var.H0);
                    }
                    v0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
