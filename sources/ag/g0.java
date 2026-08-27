package ag;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public final class g0 implements Runnable {

    public final int f384a;

    public final i1 f385b;

    public g0(i1 i1Var, int i10) {
        this.f384a = i10;
        this.f385b = i1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f384a;
        i1 i1Var = this.f385b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    i1Var.G0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), l2Var);
                    break;
                }
                break;
            case 1:
                i1Var.f447t0.e(i1Var.X, false);
                i1Var.z1();
                break;
            case 2:
                HashSet hashSet = i1Var.f448u0;
                mc mcVarX = mc.X();
                if (mcVarX != null) {
                    if (hashSet.size() != 1) {
                        mcVarX.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", hashSet.size(), Integer.valueOf(hashSet.size())))).j();
                    } else {
                        mcVarX.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) hashSet.iterator().next())))).j();
                    }
                }
                break;
            case 3:
                lh.d dVar = i1Var.O0;
                TLRPC.ChatFull chatFullT1 = i1Var.t1();
                dVar.c(Math.max(chatFullT1.boosts_unrestrict - chatFullT1.boosts_applied, 0), false);
                break;
            default:
                if (ChatObject.hasAdminRights(i1Var.s1())) {
                    if (i1Var.A0.getParent() != null) {
                        ((ViewGroup) i1Var.A0.getParent()).removeView(i1Var.A0);
                    }
                    s0 s0Var = i1Var.H0;
                    if (s0Var != null && s0Var.getParent() != null) {
                        ((ViewGroup) i1Var.H0.getParent()).removeView(i1Var.H0);
                    }
                    i1Var.d.setPadding(0, 0, 0, 0);
                }
                break;
        }
    }
}
