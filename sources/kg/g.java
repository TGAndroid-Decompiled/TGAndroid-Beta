package kg;

import android.content.Context;
import org.telegram.ui.ActionBar.t6;
public final class g extends g2 {
    public final int f11091r;

    public g(Context context, int i10) {
        super(context);
        this.f11091r = i10;
    }

    @Override
    public final void a() {
        switch (this.f11091r) {
            case 0:
                f2 f2Var = this.f11093a;
                f2Var.f11082q = true;
                f2Var.K = false;
                f2Var.H = true;
                f2Var.J = true;
                f2Var.f11076k = org.telegram.messenger.i0.L(-14.0f);
                f2 f2Var2 = this.f11093a;
                f2Var2.f11088x = 2000L;
                f2Var2.f11089y = 3000;
                f2Var2.f11083r = 16;
                f2Var2.G = false;
                f2Var2.O = 28;
                f2Var2.Q = t6.Ak;
                f2Var2.c();
                return;
            case 1:
                super.a();
                f2 f2Var3 = this.f11093a;
                f2Var3.f11082q = true;
                f2Var3.K = false;
                f2Var3.L = true;
                f2Var3.H = true;
                f2Var3.c();
                return;
            case 2:
                f2 f2Var4 = new f2(50);
                this.f11093a = f2Var4;
                f2Var4.O = 100;
                f2Var4.M = false;
                f2Var4.G = false;
                f2Var4.K = true;
                f2Var4.H = true;
                f2Var4.J = false;
                f2Var4.f11083r = 4;
                f2Var4.f11087w = 0.98f;
                f2Var4.v = 0.98f;
                f2Var4.f11086u = 0.98f;
                f2Var4.c();
                return;
            case 3:
                f2 f2Var5 = this.f11093a;
                f2Var5.f11082q = true;
                f2Var5.K = false;
                f2Var5.H = true;
                f2Var5.J = true;
                f2Var5.f11076k = org.telegram.messenger.i0.L(-14.0f);
                f2 f2Var6 = this.f11093a;
                f2Var6.f11088x = 2000L;
                f2Var6.f11089y = 3000;
                f2Var6.f11083r = 16;
                f2Var6.G = false;
                f2Var6.O = 28;
                f2Var6.Q = t6.Ak;
                f2Var6.c();
                return;
            case 4:
                super.a();
                f2 f2Var7 = this.f11093a;
                f2Var7.f11082q = true;
                f2Var7.K = false;
                f2Var7.L = true;
                f2Var7.H = true;
                f2Var7.c();
                return;
            default:
                super.a();
                f2 f2Var8 = this.f11093a;
                f2Var8.f11082q = true;
                f2Var8.K = false;
                f2Var8.L = true;
                f2Var8.H = true;
                f2Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f11091r) {
            case 2:
                return getMeasuredWidth();
            case 3:
            default:
                return super.getStarsRectWidth();
            case 4:
                return getMeasuredWidth();
            case 5:
                return getMeasuredWidth();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11091r) {
            case 0:
                super.onMeasure(i10, i11);
                this.f11093a.f11070b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(52.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                this.f11093a.f11070b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(52.0f));
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                this.f11093a.f11070b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(52.0f));
                return;
        }
    }
}
