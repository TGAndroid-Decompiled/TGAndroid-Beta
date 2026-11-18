package ki;

import android.content.Context;
import org.telegram.ui.ActionBar.n6;
public final class f extends ug.u1 {
    public final int f18649r;

    public f(Context context, int i7) {
        super(context);
        this.f18649r = i7;
    }

    @Override
    public final void a() {
        switch (this.f18649r) {
            case 0:
                super.a();
                ug.t1 t1Var = this.f58919a;
                t1Var.f58906q = true;
                t1Var.K = false;
                t1Var.L = true;
                t1Var.H = true;
                t1Var.c();
                return;
            case 1:
                super.a();
                ug.t1 t1Var2 = this.f58919a;
                t1Var2.f58906q = true;
                t1Var2.K = false;
                t1Var2.L = true;
                t1Var2.H = true;
                t1Var2.c();
                return;
            case 2:
                ug.t1 t1Var3 = new ug.t1(50);
                this.f58919a = t1Var3;
                t1Var3.O = 100;
                t1Var3.M = false;
                t1Var3.G = false;
                t1Var3.K = true;
                t1Var3.H = true;
                t1Var3.J = false;
                t1Var3.f58907r = 4;
                t1Var3.f58911w = 0.98f;
                t1Var3.v = 0.98f;
                t1Var3.f58910u = 0.98f;
                t1Var3.c();
                return;
            case 3:
                ug.t1 t1Var4 = this.f58919a;
                t1Var4.f58906q = true;
                t1Var4.K = false;
                t1Var4.H = true;
                t1Var4.J = true;
                t1Var4.f58900k = org.telegram.messenger.g0.L(-14.0f);
                ug.t1 t1Var5 = this.f58919a;
                t1Var5.f58912x = 2000L;
                t1Var5.f58913y = 3000;
                t1Var5.f58907r = 16;
                t1Var5.G = false;
                t1Var5.O = 28;
                t1Var5.Q = n6.Dk;
                t1Var5.c();
                return;
            case 4:
                ug.t1 t1Var6 = this.f58919a;
                t1Var6.f58906q = true;
                t1Var6.K = false;
                t1Var6.H = true;
                t1Var6.J = true;
                t1Var6.f58900k = org.telegram.messenger.g0.L(-14.0f);
                ug.t1 t1Var7 = this.f58919a;
                t1Var7.f58912x = 2000L;
                t1Var7.f58913y = 3000;
                t1Var7.f58907r = 16;
                t1Var7.G = false;
                t1Var7.O = 28;
                t1Var7.Q = n6.Dk;
                t1Var7.c();
                return;
            default:
                super.a();
                ug.t1 t1Var8 = this.f58919a;
                t1Var8.f58906q = true;
                t1Var8.K = false;
                t1Var8.L = true;
                t1Var8.H = true;
                t1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f18649r) {
            case 0:
                return getMeasuredWidth();
            case 1:
                return getMeasuredWidth();
            case 2:
                return getMeasuredWidth();
            default:
                return super.getStarsRectWidth();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f18649r) {
            case 3:
                super.onMeasure(i7, i10);
                this.f58919a.f58893b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 4:
                super.onMeasure(i7, i10);
                this.f58919a.f58893b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 5:
                super.onMeasure(i7, i10);
                this.f58919a.f58893b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
