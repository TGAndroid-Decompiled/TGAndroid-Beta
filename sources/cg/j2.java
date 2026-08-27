package cg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PrivacyControlActivity;

public final class j2 implements Runnable {

    public final int f2739a;

    public final y2 f2740b;

    public j2(y2 y2Var, int i10) {
        this.f2739a = i10;
        this.f2740b = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f2739a) {
            case 0:
                this.f2740b.b0(true);
                break;
            case 1:
                this.f2740b.Z.setVisibility(8);
                break;
            case 2:
                y2 y2Var = this.f2740b;
                y2Var.W();
                y2Var.i0(true, false);
                break;
            case 3:
                t2 t2Var = this.f2740b.V;
                t2Var.f7107b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                t2 t2Var2 = this.f2740b.V;
                t2Var2.f7107b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                y2 y2Var2 = this.f2740b;
                y2Var2.W();
                y2Var2.i0(true, false);
                break;
            case 6:
                this.f2740b.c0(true);
                break;
            case 7:
                this.f2740b.Z.setVisibility(8);
                break;
            case 8:
                y2 y2Var3 = this.f2740b;
                y2Var3.W();
                y2Var3.i0(true, false);
                break;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = this.f2740b.f31855n;
                if (n2Var != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                    break;
                }
                break;
            case 10:
                this.f2740b.h0(true, true);
                break;
            case 11:
                this.f2740b.dismiss();
                break;
            default:
                y2 y2Var4 = this.f2740b;
                y2Var4.W();
                y2Var4.i0(true, false);
                break;
        }
    }
}
