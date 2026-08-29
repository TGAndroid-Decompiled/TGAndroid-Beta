package jh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hp;
public final class l1 implements View.OnClickListener {
    public final int f12402a;
    public final h5 f12403b;

    public l1(h5 h5Var, int i10) {
        this.f12402a = i10;
        this.f12403b = h5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12402a) {
            case 0:
                this.f12403b.onBackPressed();
                return;
            case 1:
                this.f12403b.w1();
                return;
            case 2:
                this.f12403b.onBackPressed();
                return;
            case 3:
                this.f12403b.a2();
                return;
            case 4:
                this.f12403b.dismiss();
                return;
            case 5:
                this.f12403b.a2();
                return;
            case 6:
                this.f12403b.onBackPressed();
                return;
            case 7:
                this.f12403b.Q1();
                return;
            case 8:
                this.f12403b.a2();
                return;
            case 9:
                this.f12403b.onBackPressed();
                return;
            case 10:
                this.f12403b.W1(true);
                return;
            case 11:
                this.f12403b.a2();
                return;
            case 12:
                h5 h5Var = this.f12403b;
                if (!h5Var.f12173f0.J) {
                    hp hpVar = h5Var.f12190r0;
                    hpVar.a(!hpVar.f29211a.f26324q, true);
                    return;
                }
                return;
            case 13:
                h5.T0(this.f12403b, view);
                return;
            case 14:
                this.f12403b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                h5 h5Var2 = this.f12403b;
                if (alpha < 0.99f) {
                    h5Var2.u1();
                    return;
                } else {
                    h5Var2.Y1();
                    return;
                }
            case 16:
                h5.b1(this.f12403b);
                return;
            case 17:
                this.f12403b.S1();
                return;
            case 18:
                this.f12403b.R1(view);
                return;
            case 19:
                this.f12403b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    h5 h5Var3 = this.f12403b;
                    nh.d dVar = h5Var3.f12173f0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new l1(h5Var3, 22));
                    h5Var3.f12163a0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    h5Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                h5 h5Var4 = this.f12403b;
                h5Var4.R0 = true;
                h5Var4.r2(false);
                return;
            case 22:
                this.f12403b.W1(false);
                return;
            case 23:
                s4 s4Var = this.f12403b.I0;
                s4Var.h.e();
                s4Var.f12764i.e();
                s4Var.f12765j.e();
                s4Var.f12766k.e();
                return;
            case 24:
                this.f12403b.Q1();
                return;
            case 25:
                this.f12403b.onBackPressed();
                return;
            default:
                h5 h5Var5 = this.f12403b;
                h5Var5.R0 = true;
                h5Var5.r2(false);
                return;
        }
    }
}
