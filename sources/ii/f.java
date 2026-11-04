package ii;

import android.content.Context;
import org.telegram.ui.ActionBar.k6;
public final class f extends vg.t1 {
    public final int f14924r;

    public f(Context context, int i3) {
        super(context);
        this.f14924r = i3;
    }

    @Override
    public final void a() {
        switch (this.f14924r) {
            case 0:
                super.a();
                vg.s1 s1Var = this.f56857a;
                s1Var.f56843q = true;
                s1Var.K = false;
                s1Var.L = true;
                s1Var.H = true;
                s1Var.c();
                return;
            case 1:
                super.a();
                vg.s1 s1Var2 = this.f56857a;
                s1Var2.f56843q = true;
                s1Var2.K = false;
                s1Var2.L = true;
                s1Var2.H = true;
                s1Var2.c();
                return;
            case 2:
                vg.s1 s1Var3 = new vg.s1(50);
                this.f56857a = s1Var3;
                s1Var3.O = 100;
                s1Var3.M = false;
                s1Var3.G = false;
                s1Var3.K = true;
                s1Var3.H = true;
                s1Var3.J = false;
                s1Var3.f56844r = 4;
                s1Var3.f56848w = 0.98f;
                s1Var3.v = 0.98f;
                s1Var3.f56847u = 0.98f;
                s1Var3.c();
                return;
            case 3:
                vg.s1 s1Var4 = this.f56857a;
                s1Var4.f56843q = true;
                s1Var4.K = false;
                s1Var4.H = true;
                s1Var4.J = true;
                s1Var4.f56837k = org.telegram.messenger.g0.L(-14.0f);
                vg.s1 s1Var5 = this.f56857a;
                s1Var5.f56849x = 2000L;
                s1Var5.f56850y = 3000;
                s1Var5.f56844r = 16;
                s1Var5.G = false;
                s1Var5.O = 28;
                s1Var5.Q = k6.Ak;
                s1Var5.c();
                return;
            case 4:
                vg.s1 s1Var6 = this.f56857a;
                s1Var6.f56843q = true;
                s1Var6.K = false;
                s1Var6.H = true;
                s1Var6.J = true;
                s1Var6.f56837k = org.telegram.messenger.g0.L(-14.0f);
                vg.s1 s1Var7 = this.f56857a;
                s1Var7.f56849x = 2000L;
                s1Var7.f56850y = 3000;
                s1Var7.f56844r = 16;
                s1Var7.G = false;
                s1Var7.O = 28;
                s1Var7.Q = k6.Ak;
                s1Var7.c();
                return;
            default:
                super.a();
                vg.s1 s1Var8 = this.f56857a;
                s1Var8.f56843q = true;
                s1Var8.K = false;
                s1Var8.L = true;
                s1Var8.H = true;
                s1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f14924r) {
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
    public void onMeasure(int i3, int i10) {
        switch (this.f14924r) {
            case 3:
                super.onMeasure(i3, i10);
                this.f56857a.f56830b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 4:
                super.onMeasure(i3, i10);
                this.f56857a.f56830b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 5:
                super.onMeasure(i3, i10);
                this.f56857a.f56830b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }
}
