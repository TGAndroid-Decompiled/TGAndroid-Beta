package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xp;
public final class c2 implements View.OnClickListener {
    public final int f1073a;
    public final k7 f1074b;

    public c2(k7 k7Var, int i10) {
        this.f1073a = i10;
        this.f1074b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1073a) {
            case 0:
                k7 k7Var = this.f1074b;
                org.telegram.ui.Wallet.t4 t4Var = k7Var.f1680h1;
                if (t4Var != null) {
                    k7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(t4Var, 13), 250L);
                    return;
                }
                return;
            case 1:
                this.f1074b.t2();
                return;
            case 2:
                this.f1074b.i2();
                return;
            case 3:
                k7 k7Var2 = this.f1074b;
                if (k7Var2.X1() != null && k7Var2.X1().host_id != null) {
                    k7Var2.j2();
                    return;
                }
                org.telegram.messenger.q.q(R.string.Gift2WearWalletHidden, k7Var2.getBulletinFactory(), R.raw.info, 36);
                return;
            case 4:
                k7 k7Var3 = this.f1074b;
                k7Var3.Y0 = true;
                k7Var3.N2(false);
                return;
            case 5:
                this.f1074b.onBackPressed();
                return;
            case 6:
                this.f1074b.J1();
                return;
            case 7:
                this.f1074b.onBackPressed();
                return;
            case 8:
                this.f1074b.dismiss();
                return;
            case 9:
                this.f1074b.r2();
                return;
            case 10:
                this.f1074b.r2();
                return;
            case 11:
                this.f1074b.onBackPressed();
                return;
            case 12:
                this.f1074b.d2();
                return;
            case 13:
                this.f1074b.r2();
                return;
            case 14:
                this.f1074b.onBackPressed();
                return;
            case 15:
                this.f1074b.l2(true);
                return;
            case 16:
                this.f1074b.r2();
                return;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    k7 k7Var4 = this.f1074b;
                    ei.d dVar = k7Var4.f1685k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(k7Var4, 28));
                    k7Var4.f1675f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k7Var4.M2(3, true, null);
                    return;
                }
                return;
            case 18:
                k7 k7Var5 = this.f1074b;
                if (!k7Var5.f1685k0.N) {
                    xp xpVar = k7Var5.f1707w0;
                    xpVar.a(!xpVar.f32428a.f24147q, true);
                    return;
                }
                return;
            case 19:
                k7.h1(this.f1074b);
                return;
            case 20:
                k7.W0(this.f1074b, view);
                return;
            case 21:
                this.f1074b.l2(true);
                return;
            case 22:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                k7 k7Var6 = this.f1074b;
                if (i10 < 0) {
                    k7Var6.G1();
                    return;
                } else {
                    k7Var6.o2();
                    return;
                }
            case 23:
                this.f1074b.j2();
                return;
            case 24:
                this.f1074b.f2();
                return;
            case 25:
                this.f1074b.e2(view);
                return;
            case 26:
                this.f1074b.h2();
                return;
            case 27:
                k7 k7Var7 = this.f1074b;
                k7Var7.Y0 = true;
                k7Var7.N2(false);
                return;
            case 28:
                this.f1074b.l2(false);
                return;
            default:
                this.f1074b.t2();
                return;
        }
    }
}
