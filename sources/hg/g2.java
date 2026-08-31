package hg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;
public final class g2 implements Runnable {
    public final int f7499a;
    public final v2 f7500b;

    public g2(v2 v2Var, int i10) {
        this.f7499a = i10;
        this.f7500b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f7499a) {
            case 0:
                this.f7500b.b0(true);
                return;
            case 1:
                this.f7500b.f7632a0.setVisibility(8);
                return;
            case 2:
                v2 v2Var = this.f7500b;
                v2Var.W();
                v2Var.i0(true, false);
                return;
            case 3:
                q2 q2Var = this.f7500b.W;
                q2Var.f12559b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                q2 q2Var2 = this.f7500b.W;
                q2Var2.f12559b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                v2 v2Var2 = this.f7500b;
                v2Var2.W();
                v2Var2.i0(true, false);
                return;
            case 6:
                this.f7500b.c0(true);
                return;
            case 7:
                this.f7500b.f7632a0.setVisibility(8);
                return;
            case 8:
                v2 v2Var3 = this.f7500b;
                v2Var3.W();
                v2Var3.i0(true, false);
                return;
            case 9:
                org.telegram.ui.ActionBar.p2 p2Var = this.f7500b.f31017n;
                if (p2Var != 0) {
                    ?? obj = new Object();
                    obj.f22156a = true;
                    p2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f7500b.h0(true, true);
                return;
            case 11:
                this.f7500b.dismiss();
                return;
            default:
                v2 v2Var4 = this.f7500b;
                v2Var4.W();
                v2Var4.i0(true, false);
                return;
        }
    }
}
