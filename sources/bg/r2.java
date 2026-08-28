package bg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;
public final class r2 implements Runnable {
    public final int f1945a;
    public final g3 f1946b;

    public r2(g3 g3Var, int i9) {
        this.f1945a = i9;
        this.f1946b = g3Var;
    }

    @Override
    public final void run() {
        switch (this.f1945a) {
            case 0:
                this.f1946b.a0(true);
                return;
            case 1:
                this.f1946b.Z.setVisibility(8);
                return;
            case 2:
                g3 g3Var = this.f1946b;
                g3Var.V();
                g3Var.h0(true, false);
                return;
            case 3:
                b3 b3Var = this.f1946b.V;
                b3Var.f6310b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                b3 b3Var2 = this.f1946b.V;
                b3Var2.f6310b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                g3 g3Var2 = this.f1946b;
                g3Var2.V();
                g3Var2.h0(true, false);
                return;
            case 6:
                this.f1946b.b0(true);
                return;
            case 7:
                this.f1946b.Z.setVisibility(8);
                return;
            case 8:
                g3 g3Var3 = this.f1946b;
                g3Var3.V();
                g3Var3.h0(true, false);
                return;
            case 9:
                org.telegram.ui.ActionBar.o2 o2Var = this.f1946b.f32410n;
                if (o2Var != 0) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    o2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f1946b.g0(true, true);
                return;
            case 11:
                this.f1946b.dismiss();
                return;
            default:
                g3 g3Var4 = this.f1946b;
                g3Var4.V();
                g3Var4.h0(true, false);
                return;
        }
    }
}
