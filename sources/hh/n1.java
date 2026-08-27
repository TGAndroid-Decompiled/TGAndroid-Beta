package hh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bp;

public final class n1 implements View.OnClickListener {

    public final int f9771a;

    public final i5 f9772b;

    public n1(i5 i5Var, int i10) {
        this.f9771a = i10;
        this.f9772b = i5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9771a) {
            case 0:
                this.f9772b.onBackPressed();
                break;
            case 1:
                this.f9772b.w1();
                break;
            case 2:
                this.f9772b.onBackPressed();
                break;
            case 3:
                this.f9772b.a2();
                break;
            case 4:
                this.f9772b.dismiss();
                break;
            case 5:
                this.f9772b.a2();
                break;
            case 6:
                this.f9772b.onBackPressed();
                break;
            case 7:
                this.f9772b.Q1();
                break;
            case 8:
                this.f9772b.a2();
                break;
            case 9:
                this.f9772b.onBackPressed();
                break;
            case 10:
                this.f9772b.W1(true);
                break;
            case 11:
                this.f9772b.a2();
                break;
            case 12:
                i5 i5Var = this.f9772b;
                if (!i5Var.f9461f0.J) {
                    bp bpVar = i5Var.f9478r0;
                    bpVar.a(!bpVar.f27188a.f26309q, true);
                    break;
                }
                break;
            case 13:
                i5.T0(this.f9772b, view);
                break;
            case 14:
                this.f9772b.W1(true);
                break;
            case 15:
                float alpha = view.getAlpha();
                i5 i5Var2 = this.f9772b;
                if (alpha >= 0.99f) {
                    i5Var2.Y1();
                } else {
                    i5Var2.u1();
                }
                break;
            case 16:
                i5.b1(this.f9772b);
                break;
            case 17:
                this.f9772b.S1();
                break;
            case 18:
                this.f9772b.R1(view);
                break;
            case 19:
                this.f9772b.U1();
                break;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    i5 i5Var3 = this.f9772b;
                    lh.d dVar = i5Var3.f9461f0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new n1(i5Var3, 22));
                    i5Var3.f9451a0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    i5Var3.q2(3, true, null);
                    break;
                }
                break;
            case 21:
                i5 i5Var4 = this.f9772b;
                i5Var4.R0 = true;
                i5Var4.r2(false);
                break;
            case 22:
                this.f9772b.W1(false);
                break;
            case 23:
                t4 t4Var = this.f9772b.I0;
                t4Var.h.e();
                t4Var.f10062i.e();
                t4Var.f10063j.e();
                t4Var.f10064k.e();
                break;
            case 24:
                this.f9772b.Q1();
                break;
            case 25:
                this.f9772b.onBackPressed();
                break;
            default:
                i5 i5Var5 = this.f9772b;
                i5Var5.R0 = true;
                i5Var5.r2(false);
                break;
        }
    }
}
