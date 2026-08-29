package ih;

import jh.k7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.j70;
public final class p3 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.ActionBar.w0 f9324a;
    public final long f9325b;
    public final s3 f9326c;

    public p3(s3 s3Var, org.telegram.ui.ActionBar.w0 w0Var, long j10) {
        this.f9326c = s3Var;
        this.f9324a = w0Var;
        this.f9325b = j10;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        s3 s3Var = this.f9326c;
        k7 k7Var = s3Var.U;
        if (i10 == 1) {
            j70 j70Var = s3Var.Y;
            if (j70Var != null) {
                j70Var.u();
            }
            org.telegram.ui.ActionBar.d3 d3Var = s3Var.container;
            c6Var = ((org.telegram.ui.ActionBar.f3) s3Var).resourcesProvider;
            j70 F = j70.F(d3Var, c6Var, this.f9324a);
            s3Var.Y = F;
            i11 = ((org.telegram.ui.ActionBar.f3) s3Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j10 = this.f9325b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) s3Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j10)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, F.f29575e, F.d, false, false);
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
            o3 o3Var = new o3(this, g1Var3, h, h10, h11, h12, canUserDoAction, g1Var, g1Var2);
            o3Var.run();
            g1Var3.setOnClickListener(new ag.n(13, this, o3Var));
            x3.j(h, k7Var, o3Var, 1);
            x3.j(h10, k7Var, o3Var, 2);
            x3.j(h11, k7Var, o3Var, 4);
            x3.j(h12, k7Var, o3Var, 8);
            if (canUserDoAction) {
                x3.j(g1Var, k7Var, o3Var, 256);
                x3.j(g1Var2, k7Var, o3Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f29600s = 0;
            F.Z();
        } else if (i10 == -1) {
            s3Var.dismiss();
        }
    }
}
