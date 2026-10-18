package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xp;
public final class c2 implements View.OnClickListener {
    public final int f1058a;
    public final k7 f1059b;

    public c2(k7 k7Var, int i10) {
        this.f1058a = i10;
        this.f1059b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1058a) {
            case 0:
                k7 k7Var = this.f1059b;
                org.telegram.ui.Wallet.u4 u4Var = k7Var.f1666h1;
                if (u4Var != null) {
                    k7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(u4Var, 13), 250L);
                    return;
                }
                return;
            case 1:
                this.f1059b.v2();
                return;
            case 2:
                this.f1059b.k2();
                return;
            case 3:
                k7 k7Var2 = this.f1059b;
                if (k7Var2.Y1() != null && k7Var2.Y1().host_id != null) {
                    k7Var2.l2();
                    return;
                }
                org.telegram.messenger.g0.q(R.string.Gift2WearWalletHidden, k7Var2.getBulletinFactory(), R.raw.info, 36);
                return;
            case 4:
                k7 k7Var3 = this.f1059b;
                k7Var3.Y0 = true;
                k7Var3.P2(false);
                return;
            case 5:
                this.f1059b.onBackPressed();
                return;
            case 6:
                this.f1059b.K1();
                return;
            case 7:
                this.f1059b.onBackPressed();
                return;
            case 8:
                this.f1059b.dismiss();
                return;
            case 9:
                this.f1059b.t2();
                return;
            case 10:
                this.f1059b.t2();
                return;
            case 11:
                this.f1059b.onBackPressed();
                return;
            case 12:
                this.f1059b.e2();
                return;
            case 13:
                this.f1059b.t2();
                return;
            case 14:
                this.f1059b.onBackPressed();
                return;
            case 15:
                this.f1059b.n2(true);
                return;
            case 16:
                this.f1059b.t2();
                return;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    k7 k7Var4 = this.f1059b;
                    ei.d dVar = k7Var4.f1671k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(k7Var4, 28));
                    k7Var4.f1661f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k7Var4.O2(3, true, null);
                    return;
                }
                return;
            case 18:
                k7 k7Var5 = this.f1059b;
                if (!k7Var5.f1671k0.N) {
                    xp xpVar = k7Var5.f1693w0;
                    xpVar.a(!xpVar.f32435a.f24154q, true);
                    return;
                }
                return;
            case 19:
                k7.k1(this.f1059b);
                return;
            case 20:
                k7.Y0(this.f1059b, view);
                return;
            case 21:
                this.f1059b.n2(true);
                return;
            case 22:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                k7 k7Var6 = this.f1059b;
                if (i10 < 0) {
                    k7Var6.H1();
                    return;
                } else {
                    k7Var6.q2();
                    return;
                }
            case 23:
                this.f1059b.l2();
                return;
            case 24:
                this.f1059b.g2();
                return;
            case 25:
                this.f1059b.f2(view);
                return;
            case 26:
                this.f1059b.j2();
                return;
            case 27:
                k7 k7Var7 = this.f1059b;
                k7Var7.Y0 = true;
                k7Var7.P2(false);
                return;
            case 28:
                this.f1059b.n2(false);
                return;
            default:
                this.f1059b.v2();
                return;
        }
    }
}
