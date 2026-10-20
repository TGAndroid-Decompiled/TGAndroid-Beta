package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xp;
public final class c2 implements View.OnClickListener {
    public final int f1068a;
    public final l7 f1069b;

    public c2(l7 l7Var, int i10) {
        this.f1068a = i10;
        this.f1069b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1068a) {
            case 0:
                l7 l7Var = this.f1069b;
                org.telegram.ui.Wallet.w4 w4Var = l7Var.f1733h1;
                if (w4Var != null) {
                    l7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(w4Var, 13), 250L);
                    return;
                }
                return;
            case 1:
                this.f1069b.C2();
                return;
            case 2:
                this.f1069b.r2();
                return;
            case 3:
                l7 l7Var2 = this.f1069b;
                if (l7Var2.f2() != null && l7Var2.f2().host_id != null) {
                    l7Var2.s2();
                    return;
                }
                org.telegram.messenger.g0.q(R.string.Gift2WearWalletHidden, l7Var2.getBulletinFactory(), R.raw.info, 36);
                return;
            case 4:
                l7 l7Var3 = this.f1069b;
                l7Var3.Y0 = true;
                l7Var3.W2(false);
                return;
            case 5:
                this.f1069b.onBackPressed();
                return;
            case 6:
                this.f1069b.R1();
                return;
            case 7:
                this.f1069b.onBackPressed();
                return;
            case 8:
                this.f1069b.A2();
                return;
            case 9:
                this.f1069b.dismiss();
                return;
            case 10:
                this.f1069b.A2();
                return;
            case 11:
                this.f1069b.onBackPressed();
                return;
            case 12:
                this.f1069b.l2();
                return;
            case 13:
                this.f1069b.A2();
                return;
            case 14:
                this.f1069b.onBackPressed();
                return;
            case 15:
                this.f1069b.u2(true);
                return;
            case 16:
                this.f1069b.A2();
                return;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    l7 l7Var4 = this.f1069b;
                    ei.d dVar = l7Var4.f1738k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(l7Var4, 28));
                    l7Var4.f1728f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    l7Var4.V2(3, true, null);
                    return;
                }
                return;
            case 18:
                l7 l7Var5 = this.f1069b;
                if (!l7Var5.f1738k0.N) {
                    xp xpVar = l7Var5.f1760w0;
                    xpVar.a(!xpVar.f32458a.f24151q, true);
                    return;
                }
                return;
            case 19:
                l7.k1(this.f1069b);
                return;
            case 20:
                l7.Z0(this.f1069b, view);
                return;
            case 21:
                this.f1069b.u2(true);
                return;
            case 22:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                l7 l7Var6 = this.f1069b;
                if (i10 < 0) {
                    l7Var6.O1();
                    return;
                } else {
                    l7Var6.x2();
                    return;
                }
            case 23:
                this.f1069b.s2();
                return;
            case 24:
                this.f1069b.n2();
                return;
            case 25:
                this.f1069b.m2(view);
                return;
            case 26:
                this.f1069b.q2();
                return;
            case 27:
                l7 l7Var7 = this.f1069b;
                l7Var7.Y0 = true;
                l7Var7.W2(false);
                return;
            case 28:
                this.f1069b.u2(false);
                return;
            default:
                this.f1069b.C2();
                return;
        }
    }
}
