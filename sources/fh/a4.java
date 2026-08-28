package fh;

import gh.n7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.x60;
public final class a4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.w0 f6353a;
    public final long f6354b;
    public final d4 f6355c;

    public a4(d4 d4Var, org.telegram.ui.ActionBar.w0 w0Var, long j10) {
        this.f6355c = d4Var;
        this.f6353a = w0Var;
        this.f6354b = j10;
    }

    @Override
    public final void b(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        int i11;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        d4 d4Var = this.f6355c;
        n7 n7Var = d4Var.U;
        if (i9 == 1) {
            x60 x60Var = d4Var.Y;
            if (x60Var != null) {
                x60Var.u();
            }
            org.telegram.ui.ActionBar.d3 d3Var = d4Var.container;
            b6Var = ((org.telegram.ui.ActionBar.f3) d4Var).resourcesProvider;
            x60 F = x60.F(d3Var, b6Var, this.f6353a);
            d4Var.Y = F;
            i10 = ((org.telegram.ui.ActionBar.f3) d4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            long j10 = this.f6354b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i11 = ((org.telegram.ui.ActionBar.f3) d4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, F.f34555e, F.d, false, false);
            F.d(g1Var3);
            F.k();
            org.telegram.ui.ActionBar.g1 h = F.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.g1 h10 = F.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.g1 h11 = F.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.g1 h12 = F.h();
            h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                F.k();
                org.telegram.ui.ActionBar.g1 h13 = F.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.g1 h14 = F.h();
                h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                g1Var = h13;
                g1Var2 = h14;
            } else {
                g1Var = null;
                g1Var2 = null;
            }
            z3 z3Var = new z3(this, g1Var3, h, h10, h11, h12, canUserDoAction, g1Var, g1Var2);
            z3Var.run();
            g1Var3.setOnClickListener(new bg.u1(9, this, z3Var));
            j4.j(h, n7Var, z3Var, 1);
            j4.j(h10, n7Var, z3Var, 2);
            j4.j(h11, n7Var, z3Var, 4);
            j4.j(h12, n7Var, z3Var, 8);
            if (canUserDoAction) {
                j4.j(g1Var, n7Var, z3Var, 256);
                j4.j(g1Var2, n7Var, z3Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f34580s = 0;
            F.Z();
        } else if (i9 == -1) {
            d4Var.dismiss();
        }
    }
}
