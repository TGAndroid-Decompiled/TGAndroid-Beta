package ai;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.vp;
public final class c2 implements View.OnClickListener {
    public final int f1070a;
    public final l7 f1071b;

    public c2(l7 l7Var, int i10) {
        this.f1070a = i10;
        this.f1071b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1070a) {
            case 0:
                l7 l7Var = this.f1071b;
                org.telegram.ui.Wallet.v4 v4Var = l7Var.f1725h1;
                if (v4Var != null) {
                    l7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(v4Var, 13), 250L);
                    return;
                }
                return;
            case 1:
                this.f1071b.B2();
                return;
            case 2:
                this.f1071b.q2();
                return;
            case 3:
                l7 l7Var2 = this.f1071b;
                if (l7Var2.e2() != null && l7Var2.e2().host_id != null) {
                    l7Var2.r2();
                    return;
                }
                org.telegram.messenger.v0.p(R.string.Gift2WearWalletHidden, l7Var2.getBulletinFactory(), R.raw.info, 36);
                return;
            case 4:
                l7 l7Var3 = this.f1071b;
                l7Var3.Y0 = true;
                l7Var3.V2(false);
                return;
            case 5:
                this.f1071b.onBackPressed();
                return;
            case 6:
                this.f1071b.Q1();
                return;
            case 7:
                this.f1071b.onBackPressed();
                return;
            case 8:
                this.f1071b.z2();
                return;
            case 9:
                this.f1071b.dismiss();
                return;
            case 10:
                this.f1071b.z2();
                return;
            case 11:
                this.f1071b.onBackPressed();
                return;
            case 12:
                this.f1071b.k2();
                return;
            case 13:
                this.f1071b.z2();
                return;
            case 14:
                this.f1071b.onBackPressed();
                return;
            case 15:
                this.f1071b.t2(true);
                return;
            case 16:
                this.f1071b.z2();
                return;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    l7 l7Var4 = this.f1071b;
                    ei.d dVar = l7Var4.f1730k0;
                    dVar.i(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new c2(l7Var4, 28));
                    l7Var4.f1720f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    l7Var4.U2(3, true, null);
                    return;
                }
                return;
            case 18:
                l7 l7Var5 = this.f1071b;
                if (!l7Var5.f1730k0.Q) {
                    vp vpVar = l7Var5.f1752w0;
                    vpVar.a(!vpVar.f32005a.f24297q, true);
                    return;
                }
                return;
            case 19:
                l7.j1(this.f1071b);
                return;
            case 20:
                l7.Y0(this.f1071b, view);
                return;
            case 21:
                this.f1071b.t2(true);
                return;
            case 22:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                l7 l7Var6 = this.f1071b;
                if (i10 < 0) {
                    l7Var6.N1();
                    return;
                } else {
                    l7Var6.w2();
                    return;
                }
            case 23:
                this.f1071b.r2();
                return;
            case 24:
                this.f1071b.m2();
                return;
            case 25:
                this.f1071b.l2(view);
                return;
            case 26:
                this.f1071b.p2();
                return;
            case 27:
                l7 l7Var7 = this.f1071b;
                l7Var7.Y0 = true;
                l7Var7.V2(false);
                return;
            case 28:
                this.f1071b.t2(false);
                return;
            default:
                this.f1071b.B2();
                return;
        }
    }
}
