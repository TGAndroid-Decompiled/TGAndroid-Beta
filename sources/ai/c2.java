package ai;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xp;
public final class c2 implements View.OnClickListener {
    public final int f1059a;
    public final k7 f1060b;

    public c2(k7 k7Var, int i10) {
        this.f1059a = i10;
        this.f1060b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1059a) {
            case 0:
                this.f1060b.v2();
                return;
            case 1:
                this.f1060b.k2();
                return;
            case 2:
                k7 k7Var = this.f1060b;
                if (k7Var.Y1() != null && k7Var.Y1().host_id != null) {
                    k7Var.l2();
                    return;
                }
                org.telegram.messenger.g0.q(R.string.Gift2WearWalletHidden, k7Var.getBulletinFactory(), R.raw.info, 36);
                return;
            case 3:
                k7 k7Var2 = this.f1060b;
                k7Var2.Y0 = true;
                k7Var2.P2(false);
                return;
            case 4:
                this.f1060b.onBackPressed();
                return;
            case 5:
                this.f1060b.K1();
                return;
            case 6:
                this.f1060b.onBackPressed();
                return;
            case 7:
                this.f1060b.t2();
                return;
            case 8:
                this.f1060b.dismiss();
                return;
            case 9:
                this.f1060b.t2();
                return;
            case 10:
                this.f1060b.onBackPressed();
                return;
            case 11:
                this.f1060b.e2();
                return;
            case 12:
                this.f1060b.t2();
                return;
            case 13:
                this.f1060b.onBackPressed();
                return;
            case 14:
                this.f1060b.n2(true);
                return;
            case 15:
                this.f1060b.t2();
                return;
            case 16:
                if (view.getAlpha() >= 1.0f) {
                    k7 k7Var3 = this.f1060b;
                    ei.d dVar = k7Var3.f1677k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(k7Var3, 27));
                    k7Var3.f1667f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k7Var3.O2(3, true, null);
                    return;
                }
                return;
            case 17:
                k7 k7Var4 = this.f1060b;
                if (!k7Var4.f1677k0.N) {
                    xp xpVar = k7Var4.f1699w0;
                    xpVar.a(!xpVar.f32428a.f24147q, true);
                    return;
                }
                return;
            case 18:
                k7.i1(this.f1060b);
                return;
            case 19:
                k7.W0(this.f1060b, view);
                return;
            case 20:
                this.f1060b.n2(true);
                return;
            case 21:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                k7 k7Var5 = this.f1060b;
                if (i10 < 0) {
                    k7Var5.H1();
                    return;
                } else {
                    k7Var5.q2();
                    return;
                }
            case 22:
                this.f1060b.l2();
                return;
            case 23:
                this.f1060b.g2();
                return;
            case 24:
                this.f1060b.f2(view);
                return;
            case 25:
                this.f1060b.j2();
                return;
            case 26:
                k7 k7Var6 = this.f1060b;
                k7Var6.Y0 = true;
                k7Var6.P2(false);
                return;
            case 27:
                this.f1060b.n2(false);
                return;
            case 28:
                this.f1060b.v2();
                return;
            default:
                this.f1060b.onBackPressed();
                return;
        }
    }
}
