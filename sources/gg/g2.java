package gg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;
public final class g2 implements Runnable {
    public final int f6641a;
    public final v2 f6642b;

    public g2(v2 v2Var, int i10) {
        this.f6641a = i10;
        this.f6642b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f6641a) {
            case 0:
                this.f6642b.b0(true);
                return;
            case 1:
                this.f6642b.f6763a0.setVisibility(8);
                return;
            case 2:
                v2 v2Var = this.f6642b;
                v2Var.W();
                v2Var.i0(true, false);
                return;
            case 3:
                q2 q2Var = this.f6642b.W;
                q2Var.f10546b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                q2 q2Var2 = this.f6642b.W;
                q2Var2.f10546b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                v2 v2Var2 = this.f6642b;
                v2Var2.W();
                v2Var2.i0(true, false);
                return;
            case 6:
                this.f6642b.c0(true);
                return;
            case 7:
                this.f6642b.f6763a0.setVisibility(8);
                return;
            case 8:
                v2 v2Var3 = this.f6642b;
                v2Var3.W();
                v2Var3.i0(true, false);
                return;
            case 9:
                org.telegram.ui.ActionBar.p2 p2Var = this.f6642b.f28701n;
                if (p2Var != 0) {
                    ?? obj = new Object();
                    obj.f20453a = true;
                    p2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f6642b.h0(true, true);
                return;
            case 11:
                this.f6642b.dismiss();
                return;
            default:
                v2 v2Var4 = this.f6642b;
                v2Var4.W();
                v2Var4.i0(true, false);
                return;
        }
    }
}
