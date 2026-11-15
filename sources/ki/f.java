package ki;

import android.content.Context;
import org.telegram.ui.ActionBar.j6;
public final class f extends ug.s1 {
    public final int f18288r;

    public f(Context context, int i7) {
        super(context);
        this.f18288r = i7;
    }

    @Override
    public final void a() {
        switch (this.f18288r) {
            case 0:
                super.a();
                ug.r1 r1Var = this.f58330a;
                r1Var.f58319q = true;
                r1Var.K = false;
                r1Var.L = true;
                r1Var.H = true;
                r1Var.c();
                return;
            case 1:
                super.a();
                ug.r1 r1Var2 = this.f58330a;
                r1Var2.f58319q = true;
                r1Var2.K = false;
                r1Var2.L = true;
                r1Var2.H = true;
                r1Var2.c();
                return;
            case 2:
                ug.r1 r1Var3 = new ug.r1(50);
                this.f58330a = r1Var3;
                r1Var3.O = 100;
                r1Var3.M = false;
                r1Var3.G = false;
                r1Var3.K = true;
                r1Var3.H = true;
                r1Var3.J = false;
                r1Var3.f58320r = 4;
                r1Var3.f58324w = 0.98f;
                r1Var3.v = 0.98f;
                r1Var3.f58323u = 0.98f;
                r1Var3.c();
                return;
            case 3:
                ug.r1 r1Var4 = this.f58330a;
                r1Var4.f58319q = true;
                r1Var4.K = false;
                r1Var4.H = true;
                r1Var4.J = true;
                r1Var4.f58313k = org.telegram.messenger.g0.L(-14.0f);
                ug.r1 r1Var5 = this.f58330a;
                r1Var5.f58325x = 2000L;
                r1Var5.f58326y = 3000;
                r1Var5.f58320r = 16;
                r1Var5.G = false;
                r1Var5.O = 28;
                r1Var5.Q = j6.Dk;
                r1Var5.c();
                return;
            case 4:
                ug.r1 r1Var6 = this.f58330a;
                r1Var6.f58319q = true;
                r1Var6.K = false;
                r1Var6.H = true;
                r1Var6.J = true;
                r1Var6.f58313k = org.telegram.messenger.g0.L(-14.0f);
                ug.r1 r1Var7 = this.f58330a;
                r1Var7.f58325x = 2000L;
                r1Var7.f58326y = 3000;
                r1Var7.f58320r = 16;
                r1Var7.G = false;
                r1Var7.O = 28;
                r1Var7.Q = j6.Dk;
                r1Var7.c();
                return;
            default:
                super.a();
                ug.r1 r1Var8 = this.f58330a;
                r1Var8.f58319q = true;
                r1Var8.K = false;
                r1Var8.L = true;
                r1Var8.H = true;
                r1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f18288r) {
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
        switch (this.f18288r) {
            case 3:
                super.onMeasure(i7, i10);
                this.f58330a.f58306b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 4:
                super.onMeasure(i7, i10);
                this.f58330a.f58306b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 5:
                super.onMeasure(i7, i10);
                this.f58330a.f58306b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
