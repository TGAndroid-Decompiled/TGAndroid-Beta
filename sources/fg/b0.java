package fg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class b0 implements Runnable {
    public final int f6242a;
    public final v0 f6243b;

    public b0(v0 v0Var, int i10) {
        this.f6242a = i10;
        this.f6243b = v0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6242a;
        v0 v0Var = this.f6243b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    ?? obj = new Object();
                    obj.f22156a = true;
                    v0Var.H0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 1:
                v0Var.f6600u0.e(v0Var.Y, false);
                v0Var.z1();
                return;
            case 2:
                HashSet hashSet = v0Var.f6601v0;
                qc X = qc.X();
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
                qh.d dVar = v0Var.P0;
                TLRPC.ChatFull t12 = v0Var.t1();
                dVar.c(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                return;
            default:
                if (ChatObject.hasAdminRights(v0Var.s1())) {
                    if (v0Var.B0.getParent() != null) {
                        ((ViewGroup) v0Var.B0.getParent()).removeView(v0Var.B0);
                    }
                    h0 h0Var = v0Var.I0;
                    if (h0Var != null && h0Var.getParent() != null) {
                        ((ViewGroup) v0Var.I0.getParent()).removeView(v0Var.I0);
                    }
                    v0Var.d.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
        }
    }
}
