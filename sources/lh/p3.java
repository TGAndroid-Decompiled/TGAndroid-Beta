package lh;

import mh.l7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q70;
public final class p3 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.w0 f12893a;
    public final long f12894b;
    public final s3 f12895c;

    public p3(s3 s3Var, org.telegram.ui.ActionBar.w0 w0Var, long j10) {
        this.f12895c = s3Var;
        this.f12893a = w0Var;
        this.f12894b = j10;
    }

    @Override
    public final void b(int i10) {
        g6 g6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        s3 s3Var = this.f12895c;
        l7 l7Var = s3Var.V;
        if (i10 == 1) {
            q70 q70Var = s3Var.Z;
            if (q70Var != null) {
                q70Var.u();
            }
            org.telegram.ui.ActionBar.f3 f3Var = s3Var.container;
            g6Var = ((org.telegram.ui.ActionBar.h3) s3Var).resourcesProvider;
            q70 F = q70.F(f3Var, g6Var, this.f12893a);
            s3Var.Z = F;
            i11 = ((org.telegram.ui.ActionBar.h3) s3Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j10 = this.f12894b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i12 = ((org.telegram.ui.ActionBar.h3) s3Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j10)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, F.f30308e, F.d, false, false);
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
            o3 o3Var = new o3(this, g1Var3, h, h9, h10, h11, canUserDoAction, g1Var, g1Var2);
            o3Var.run();
            g1Var3.setOnClickListener(new dg.n(13, this, o3Var));
            x3.j(h, l7Var, o3Var, 1);
            x3.j(h9, l7Var, o3Var, 2);
            x3.j(h10, l7Var, o3Var, 4);
            x3.j(h11, l7Var, o3Var, 8);
            if (canUserDoAction) {
                x3.j(g1Var, l7Var, o3Var, 256);
                x3.j(g1Var2, l7Var, o3Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f30333s = 0;
            F.Z();
        } else if (i10 == -1) {
            s3Var.dismiss();
        }
    }
}
