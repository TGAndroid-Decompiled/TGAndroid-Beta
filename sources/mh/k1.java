package mh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.np;
public final class k1 implements View.OnClickListener {
    public final int f14322a;
    public final g5 f14323b;

    public k1(g5 g5Var, int i10) {
        this.f14322a = i10;
        this.f14323b = g5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14322a) {
            case 0:
                this.f14323b.onBackPressed();
                return;
            case 1:
                this.f14323b.w1();
                return;
            case 2:
                this.f14323b.onBackPressed();
                return;
            case 3:
                this.f14323b.a2();
                return;
            case 4:
                this.f14323b.dismiss();
                return;
            case 5:
                this.f14323b.a2();
                return;
            case 6:
                this.f14323b.onBackPressed();
                return;
            case 7:
                this.f14323b.Q1();
                return;
            case 8:
                this.f14323b.a2();
                return;
            case 9:
                this.f14323b.onBackPressed();
                return;
            case 10:
                this.f14323b.W1(true);
                return;
            case 11:
                this.f14323b.a2();
                return;
            case 12:
                g5 g5Var = this.f14323b;
                if (!g5Var.f14095g0.K) {
                    np npVar = g5Var.f14112s0;
                    npVar.a(!npVar.f29606a.f24809q, true);
                    return;
                }
                return;
            case 13:
                g5.T0(this.f14323b, view);
                return;
            case 14:
                this.f14323b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                g5 g5Var2 = this.f14323b;
                if (alpha < 0.99f) {
                    g5Var2.u1();
                    return;
                } else {
                    g5Var2.Y1();
                    return;
                }
            case 16:
                g5.b1(this.f14323b);
                return;
            case 17:
                this.f14323b.S1();
                return;
            case 18:
                this.f14323b.R1(view);
                return;
            case 19:
                this.f14323b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    g5 g5Var3 = this.f14323b;
                    qh.d dVar = g5Var3.f14095g0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new k1(g5Var3, 22));
                    g5Var3.f14085b0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    g5Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                g5 g5Var4 = this.f14323b;
                g5Var4.S0 = true;
                g5Var4.r2(false);
                return;
            case 22:
                this.f14323b.W1(false);
                return;
            case 23:
                r4 r4Var = this.f14323b.J0;
                r4Var.h.e();
                r4Var.f14675i.e();
                r4Var.f14676j.e();
                r4Var.f14677k.e();
                return;
            case 24:
                this.f14323b.Q1();
                return;
            case 25:
                this.f14323b.onBackPressed();
                return;
            default:
                g5 g5Var5 = this.f14323b;
                g5Var5.S0 = true;
                g5Var5.r2(false);
                return;
        }
    }
}
