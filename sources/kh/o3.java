package kh;

import lh.l7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.p70;
public final class o3 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.w0 f10846a;
    public final long f10847b;
    public final r3 f10848c;

    public o3(r3 r3Var, org.telegram.ui.ActionBar.w0 w0Var, long j10) {
        this.f10848c = r3Var;
        this.f10846a = w0Var;
        this.f10847b = j10;
    }

    @Override
    public final void b(int i10) {
        f6 f6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        r3 r3Var = this.f10848c;
        l7 l7Var = r3Var.V;
        if (i10 == 1) {
            p70 p70Var = r3Var.Z;
            if (p70Var != null) {
                p70Var.u();
            }
            org.telegram.ui.ActionBar.e3 e3Var = r3Var.container;
            f6Var = ((org.telegram.ui.ActionBar.g3) r3Var).resourcesProvider;
            p70 F = p70.F(e3Var, f6Var, this.f10846a);
            r3Var.Z = F;
            i11 = ((org.telegram.ui.ActionBar.g3) r3Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j10 = this.f10847b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i12 = ((org.telegram.ui.ActionBar.g3) r3Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j10)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, F.e, F.d, false, false);
            F.d(g1Var3);
            F.k();
            org.telegram.ui.ActionBar.g1 h = F.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.g1 h9 = F.h();
            h9.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.g1 h10 = F.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.g1 h11 = F.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                F.k();
                org.telegram.ui.ActionBar.g1 h12 = F.h();
                h12.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.g1 h13 = F.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                g1Var = h12;
                g1Var2 = h13;
            } else {
                g1Var = null;
                g1Var2 = null;
            }
            n3 n3Var = new n3(this, g1Var3, h, h9, h10, h11, canUserDoAction, g1Var, g1Var2);
            n3Var.run();
            g1Var3.setOnClickListener(new cg.n(13, this, n3Var));
            w3.j(h, l7Var, n3Var, 1);
            w3.j(h9, l7Var, n3Var, 2);
            w3.j(h10, l7Var, n3Var, 4);
            w3.j(h11, l7Var, n3Var, 8);
            if (canUserDoAction) {
                w3.j(g1Var, l7Var, n3Var, 256);
                w3.j(g1Var2, l7Var, n3Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f27777s = 0;
            F.Z();
        } else if (i10 == -1) {
            r3Var.dismiss();
        }
    }
}
