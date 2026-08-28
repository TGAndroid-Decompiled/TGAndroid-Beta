package gh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dp;
public final class n1 implements View.OnClickListener {
    public final int f8592a;
    public final k5 f8593b;

    public n1(k5 k5Var, int i9) {
        this.f8592a = i9;
        this.f8593b = k5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8592a) {
            case 0:
                this.f8593b.onBackPressed();
                return;
            case 1:
                this.f8593b.w1();
                return;
            case 2:
                this.f8593b.onBackPressed();
                return;
            case 3:
                this.f8593b.a2();
                return;
            case 4:
                this.f8593b.dismiss();
                return;
            case 5:
                this.f8593b.a2();
                return;
            case 6:
                this.f8593b.onBackPressed();
                return;
            case 7:
                this.f8593b.Q1();
                return;
            case 8:
                this.f8593b.a2();
                return;
            case 9:
                this.f8593b.onBackPressed();
                return;
            case 10:
                this.f8593b.W1(true);
                return;
            case 11:
                this.f8593b.a2();
                return;
            case 12:
                k5 k5Var = this.f8593b;
                if (!k5Var.f8407f0.J) {
                    dp dpVar = k5Var.f8424r0;
                    dpVar.a(!dpVar.f27781a.f26313q, true);
                    return;
                }
                return;
            case 13:
                k5.T0(this.f8593b, view);
                return;
            case 14:
                this.f8593b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                k5 k5Var2 = this.f8593b;
                if (alpha < 0.99f) {
                    k5Var2.u1();
                    return;
                } else {
                    k5Var2.Y1();
                    return;
                }
            case 16:
                k5.b1(this.f8593b);
                return;
            case 17:
                this.f8593b.S1();
                return;
            case 18:
                this.f8593b.R1(view);
                return;
            case 19:
                this.f8593b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    k5 k5Var3 = this.f8593b;
                    kh.d dVar = k5Var3.f8407f0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new n1(k5Var3, 22));
                    k5Var3.f8397a0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    k5Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                k5 k5Var4 = this.f8593b;
                k5Var4.R0 = true;
                k5Var4.r2(false);
                return;
            case 22:
                this.f8593b.W1(false);
                return;
            case 23:
                v4 v4Var = this.f8593b.I0;
                v4Var.h.e();
                v4Var.f9022i.e();
                v4Var.f9023j.e();
                v4Var.f9024k.e();
                return;
            case 24:
                this.f8593b.Q1();
                return;
            case 25:
                this.f8593b.onBackPressed();
                return;
            default:
                k5 k5Var5 = this.f8593b;
                k5Var5.R0 = true;
                k5Var5.r2(false);
                return;
        }
    }
}
