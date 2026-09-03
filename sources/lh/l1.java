package lh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kp;
public final class l1 implements View.OnClickListener {
    public final int f12725a;
    public final g5 f12726b;

    public l1(g5 g5Var, int i10) {
        this.f12725a = i10;
        this.f12726b = g5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12725a) {
            case 0:
                this.f12726b.onBackPressed();
                return;
            case 1:
                this.f12726b.w1();
                return;
            case 2:
                this.f12726b.onBackPressed();
                return;
            case 3:
                this.f12726b.a2();
                return;
            case 4:
                this.f12726b.dismiss();
                return;
            case 5:
                this.f12726b.a2();
                return;
            case 6:
                this.f12726b.onBackPressed();
                return;
            case 7:
                this.f12726b.Q1();
                return;
            case 8:
                this.f12726b.a2();
                return;
            case 9:
                this.f12726b.onBackPressed();
                return;
            case 10:
                this.f12726b.W1(true);
                return;
            case 11:
                this.f12726b.a2();
                return;
            case 12:
                g5 g5Var = this.f12726b;
                if (!g5Var.f12462g0.K) {
                    kp kpVar = g5Var.f12479s0;
                    kpVar.a(!kpVar.f26377a.f22938q, true);
                    return;
                }
                return;
            case 13:
                g5.T0(this.f12726b, view);
                return;
            case 14:
                this.f12726b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                g5 g5Var2 = this.f12726b;
                if (alpha < 0.99f) {
                    g5Var2.u1();
                    return;
                } else {
                    g5Var2.Y1();
                    return;
                }
            case 16:
                g5.b1(this.f12726b);
                return;
            case 17:
                this.f12726b.S1();
                return;
            case 18:
                this.f12726b.R1(view);
                return;
            case 19:
                this.f12726b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    g5 g5Var3 = this.f12726b;
                    ph.d dVar = g5Var3.f12462g0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new l1(g5Var3, 22));
                    g5Var3.f12452b0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    g5Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                g5 g5Var4 = this.f12726b;
                g5Var4.S0 = true;
                g5Var4.r2(false);
                return;
            case 22:
                this.f12726b.W1(false);
                return;
            case 23:
                r4 r4Var = this.f12726b.J0;
                r4Var.h.e();
                r4Var.f12996i.e();
                r4Var.f12997j.e();
                r4Var.f12998k.e();
                return;
            case 24:
                this.f12726b.Q1();
                return;
            case 25:
                this.f12726b.onBackPressed();
                return;
            default:
                g5 g5Var5 = this.f12726b;
                g5Var5.S0 = true;
                g5Var5.r2(false);
                return;
        }
    }
}
