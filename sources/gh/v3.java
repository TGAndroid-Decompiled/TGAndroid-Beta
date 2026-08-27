package gh;

import hh.m7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.b70;

public final class v3 extends org.telegram.ui.ActionBar.j {

    public final org.telegram.ui.ActionBar.v0 f7590a;

    public final long f7591b;

    public final y3 f7592c;

    public v3(y3 y3Var, org.telegram.ui.ActionBar.v0 v0Var, long j10) {
        this.f7592c = y3Var;
        this.f7590a = v0Var;
        this.f7591b = j10;
    }

    @Override
    public final void b(int i10) {
        boolean zCanUserDoAction;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        y3 y3Var = this.f7592c;
        m7 m7Var = y3Var.U;
        if (i10 != 1) {
            if (i10 == -1) {
                y3Var.dismiss();
                return;
            }
            return;
        }
        b70 b70Var = y3Var.Y;
        if (b70Var != null) {
            b70Var.u();
        }
        b70 b70VarF = b70.F(y3Var.container, ((org.telegram.ui.ActionBar.e3) y3Var).resourcesProvider, this.f7590a);
        y3Var.Y = b70VarF;
        long clientUserId = UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) y3Var).currentAccount).getClientUserId();
        long j10 = this.f7591b;
        if (j10 == clientUserId) {
            zCanUserDoAction = true;
        } else {
            zCanUserDoAction = j10 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) y3Var).currentAccount).getChat(Long.valueOf(-j10)), 5);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, b70VarF.f26967e, b70VarF.d, false, false);
        b70VarF.d(f1Var3);
        b70VarF.k();
        org.telegram.ui.ActionBar.f1 f1VarH = b70VarF.h();
        f1VarH.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
        org.telegram.ui.ActionBar.f1 f1VarH2 = b70VarF.h();
        f1VarH2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
        org.telegram.ui.ActionBar.f1 f1VarH3 = b70VarF.h();
        f1VarH3.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
        org.telegram.ui.ActionBar.f1 f1VarH4 = b70VarF.h();
        f1VarH4.setText(LocaleController.getString(R.string.Gift2FilterUnique));
        if (zCanUserDoAction) {
            b70VarF.k();
            org.telegram.ui.ActionBar.f1 f1VarH5 = b70VarF.h();
            f1VarH5.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
            org.telegram.ui.ActionBar.f1 f1VarH6 = b70VarF.h();
            f1VarH6.setText(LocaleController.getString(R.string.Gift2FilterHidden));
            f1Var = f1VarH5;
            f1Var2 = f1VarH6;
        } else {
            f1Var = null;
            f1Var2 = null;
        }
        u3 u3Var = new u3(this, f1Var3, f1VarH, f1VarH2, f1VarH3, f1VarH4, zCanUserDoAction, f1Var, f1Var2);
        u3Var.run();
        f1Var3.setOnClickListener(new ag.q0(10, this, u3Var));
        d4.j(f1VarH, m7Var, u3Var, 1);
        d4.j(f1VarH2, m7Var, u3Var, 2);
        d4.j(f1VarH3, m7Var, u3Var, 4);
        d4.j(f1VarH4, m7Var, u3Var, 8);
        if (zCanUserDoAction) {
            d4.j(f1Var, m7Var, u3Var, 256);
            d4.j(f1Var2, m7Var, u3Var, 512);
        }
        b70VarF.Y = true;
        b70VarF.J = false;
        b70VarF.f26992s = 0;
        b70VarF.Z();
    }
}
