package eg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;
public final class h2 implements Runnable {
    public final int f6029a;
    public final w2 f6030b;

    public h2(w2 w2Var, int i10) {
        this.f6029a = i10;
        this.f6030b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f6029a) {
            case 0:
                this.f6030b.b0(true);
                return;
            case 1:
                this.f6030b.Z.setVisibility(8);
                return;
            case 2:
                w2 w2Var = this.f6030b;
                w2Var.W();
                w2Var.i0(true, false);
                return;
            case 3:
                r2 r2Var = this.f6030b.V;
                r2Var.f8994b.setHintText(LocaleController.getString(R.string.Search), true);
                return;
            case 4:
                r2 r2Var2 = this.f6030b.V;
                r2Var2.f8994b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                return;
            case 5:
                w2 w2Var2 = this.f6030b;
                w2Var2.W();
                w2Var2.i0(true, false);
                return;
            case 6:
                this.f6030b.c0(true);
                return;
            case 7:
                this.f6030b.Z.setVisibility(8);
                return;
            case 8:
                w2 w2Var3 = this.f6030b;
                w2Var3.W();
                w2Var3.i0(true, false);
                return;
            case 9:
                org.telegram.ui.ActionBar.o2 o2Var = this.f6030b.f34662n;
                if (o2Var != 0) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    o2Var.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 10:
                this.f6030b.h0(true, true);
                return;
            case 11:
                this.f6030b.dismiss();
                return;
            default:
                w2 w2Var4 = this.f6030b;
                w2Var4.W();
                w2Var4.i0(true, false);
                return;
        }
    }
}
