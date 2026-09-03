package mh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.np;
public final class k1 implements View.OnClickListener {
    public final int f14324a;
    public final g5 f14325b;

    public k1(g5 g5Var, int i10) {
        this.f14324a = i10;
        this.f14325b = g5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14324a) {
            case 0:
                this.f14325b.onBackPressed();
                return;
            case 1:
                this.f14325b.w1();
                return;
            case 2:
                this.f14325b.onBackPressed();
                return;
            case 3:
                this.f14325b.a2();
                return;
            case 4:
                this.f14325b.dismiss();
                return;
            case 5:
                this.f14325b.a2();
                return;
            case 6:
                this.f14325b.onBackPressed();
                return;
            case 7:
                this.f14325b.Q1();
                return;
            case 8:
                this.f14325b.a2();
                return;
            case 9:
                this.f14325b.onBackPressed();
                return;
            case 10:
                this.f14325b.W1(true);
                return;
            case 11:
                this.f14325b.a2();
                return;
            case 12:
                g5 g5Var = this.f14325b;
                if (!g5Var.f14097g0.K) {
                    np npVar = g5Var.f14114s0;
                    npVar.a(!npVar.f29560a.f24811q, true);
                    return;
                }
                return;
            case 13:
                g5.T0(this.f14325b, view);
                return;
            case 14:
                this.f14325b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                g5 g5Var2 = this.f14325b;
                if (alpha < 0.99f) {
                    g5Var2.u1();
                    return;
                } else {
                    g5Var2.Y1();
                    return;
                }
            case 16:
                g5.b1(this.f14325b);
                return;
            case 17:
                this.f14325b.S1();
                return;
            case 18:
                this.f14325b.R1(view);
                return;
            case 19:
                this.f14325b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    g5 g5Var3 = this.f14325b;
                    qh.d dVar = g5Var3.f14097g0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new k1(g5Var3, 22));
                    g5Var3.f14087b0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    g5Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                g5 g5Var4 = this.f14325b;
                g5Var4.S0 = true;
                g5Var4.r2(false);
                return;
            case 22:
                this.f14325b.W1(false);
                return;
            case 23:
                r4 r4Var = this.f14325b.J0;
                r4Var.h.e();
                r4Var.f14677i.e();
                r4Var.f14678j.e();
                r4Var.f14679k.e();
                return;
            case 24:
                this.f14325b.Q1();
                return;
            case 25:
                this.f14325b.onBackPressed();
                return;
            default:
                g5 g5Var5 = this.f14325b;
                g5Var5.S0 = true;
                g5Var5.r2(false);
                return;
        }
    }
}
