package hi;

import android.content.Context;
import org.telegram.ui.ActionBar.k6;
public final class e extends ug.q1 {
    public final int f14621r;

    public e(Context context, int i7) {
        super(context);
        this.f14621r = i7;
    }

    @Override
    public final void a() {
        switch (this.f14621r) {
            case 0:
                super.a();
                ug.p1 p1Var = this.f56677a;
                p1Var.f56661q = true;
                p1Var.K = false;
                p1Var.L = true;
                p1Var.H = true;
                p1Var.c();
                return;
            case 1:
                super.a();
                ug.p1 p1Var2 = this.f56677a;
                p1Var2.f56661q = true;
                p1Var2.K = false;
                p1Var2.L = true;
                p1Var2.H = true;
                p1Var2.c();
                return;
            case 2:
                ug.p1 p1Var3 = new ug.p1(50);
                this.f56677a = p1Var3;
                p1Var3.O = 100;
                p1Var3.M = false;
                p1Var3.G = false;
                p1Var3.K = true;
                p1Var3.H = true;
                p1Var3.J = false;
                p1Var3.f56662r = 4;
                p1Var3.f56666w = 0.98f;
                p1Var3.v = 0.98f;
                p1Var3.f56665u = 0.98f;
                p1Var3.c();
                return;
            case 3:
                ug.p1 p1Var4 = this.f56677a;
                p1Var4.f56661q = true;
                p1Var4.K = false;
                p1Var4.H = true;
                p1Var4.J = true;
                p1Var4.f56655k = org.telegram.messenger.g0.L(-14.0f);
                ug.p1 p1Var5 = this.f56677a;
                p1Var5.f56667x = 2000L;
                p1Var5.f56668y = 3000;
                p1Var5.f56662r = 16;
                p1Var5.G = false;
                p1Var5.O = 28;
                p1Var5.Q = k6.Ak;
                p1Var5.c();
                return;
            case 4:
                ug.p1 p1Var6 = this.f56677a;
                p1Var6.f56661q = true;
                p1Var6.K = false;
                p1Var6.H = true;
                p1Var6.J = true;
                p1Var6.f56655k = org.telegram.messenger.g0.L(-14.0f);
                ug.p1 p1Var7 = this.f56677a;
                p1Var7.f56667x = 2000L;
                p1Var7.f56668y = 3000;
                p1Var7.f56662r = 16;
                p1Var7.G = false;
                p1Var7.O = 28;
                p1Var7.Q = k6.Ak;
                p1Var7.c();
                return;
            default:
                super.a();
                ug.p1 p1Var8 = this.f56677a;
                p1Var8.f56661q = true;
                p1Var8.K = false;
                p1Var8.L = true;
                p1Var8.H = true;
                p1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f14621r) {
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
        switch (this.f14621r) {
            case 3:
                super.onMeasure(i7, i10);
                this.f56677a.f56648b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 4:
                super.onMeasure(i7, i10);
                this.f56677a.f56648b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 5:
                super.onMeasure(i7, i10);
                this.f56677a.f56648b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
