package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zp;
public final class z1 implements View.OnClickListener {
    public final int f5816a;
    public final h7 f5817b;

    public z1(h7 h7Var, int i10) {
        this.f5816a = i10;
        this.f5817b = h7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5816a) {
            case 0:
                h7 h7Var = this.f5817b;
                org.telegram.ui.Wallet.t4 t4Var = h7Var.f4742h1;
                if (t4Var != null) {
                    h7Var.dismiss();
                    AndroidUtilities.runOnUIThread(new a3.d(t4Var, 24), 250L);
                    return;
                }
                return;
            case 1:
                this.f5817b.B2();
                return;
            case 2:
                this.f5817b.q2();
                return;
            case 3:
                h7 h7Var2 = this.f5817b;
                if (h7Var2.e2() != null && h7Var2.e2().host_id != null) {
                    h7Var2.r2();
                    return;
                }
                org.telegram.messenger.t.q(R.string.Gift2WearWalletHidden, h7Var2.getBulletinFactory(), R.raw.info, 36);
                return;
            case 4:
                h7 h7Var3 = this.f5817b;
                h7Var3.Y0 = true;
                h7Var3.V2(false);
                return;
            case 5:
                this.f5817b.onBackPressed();
                return;
            case 6:
                this.f5817b.Q1();
                return;
            case 7:
                this.f5817b.onBackPressed();
                return;
            case 8:
                this.f5817b.z2();
                return;
            case 9:
                this.f5817b.dismiss();
                return;
            case 10:
                this.f5817b.z2();
                return;
            case 11:
                this.f5817b.onBackPressed();
                return;
            case 12:
                this.f5817b.k2();
                return;
            case 13:
                this.f5817b.z2();
                return;
            case 14:
                this.f5817b.onBackPressed();
                return;
            case 15:
                this.f5817b.t2(true);
                return;
            case 16:
                this.f5817b.z2();
                return;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    h7 h7Var4 = this.f5817b;
                    fi.d dVar = h7Var4.f4747k0;
                    dVar.i(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new z1(h7Var4, 28));
                    h7Var4.f4737f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    h7Var4.U2(3, true, null);
                    return;
                }
                return;
            case 18:
                h7 h7Var5 = this.f5817b;
                if (!h7Var5.f4747k0.Q) {
                    zp zpVar = h7Var5.f4769w0;
                    zpVar.a(!zpVar.f35382a.f26089q, true);
                    return;
                }
                return;
            case 19:
                h7.j1(this.f5817b);
                return;
            case 20:
                h7.Y0(this.f5817b, view);
                return;
            case 21:
                this.f5817b.t2(true);
                return;
            case 22:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                h7 h7Var6 = this.f5817b;
                if (i10 < 0) {
                    h7Var6.N1();
                    return;
                } else {
                    h7Var6.w2();
                    return;
                }
            case 23:
                this.f5817b.r2();
                return;
            case 24:
                this.f5817b.m2();
                return;
            case 25:
                this.f5817b.l2(view);
                return;
            case 26:
                this.f5817b.p2();
                return;
            case 27:
                h7 h7Var7 = this.f5817b;
                h7Var7.Y0 = true;
                h7Var7.V2(false);
                return;
            case 28:
                this.f5817b.t2(false);
                return;
            default:
                this.f5817b.B2();
                return;
        }
    }
}
