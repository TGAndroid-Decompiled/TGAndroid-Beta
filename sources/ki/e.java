package ki;

import android.content.Context;
import org.telegram.ui.ActionBar.n6;
public final class e extends ug.t1 {
    public final int f18726r;

    public e(Context context, int i7) {
        super(context);
        this.f18726r = i7;
    }

    @Override
    public final void a() {
        switch (this.f18726r) {
            case 0:
                super.a();
                ug.s1 s1Var = this.f59038a;
                s1Var.f59025q = true;
                s1Var.K = false;
                s1Var.L = true;
                s1Var.H = true;
                s1Var.c();
                return;
            case 1:
                super.a();
                ug.s1 s1Var2 = this.f59038a;
                s1Var2.f59025q = true;
                s1Var2.K = false;
                s1Var2.L = true;
                s1Var2.H = true;
                s1Var2.c();
                return;
            case 2:
                ug.s1 s1Var3 = new ug.s1(50);
                this.f59038a = s1Var3;
                s1Var3.O = 100;
                s1Var3.M = false;
                s1Var3.G = false;
                s1Var3.K = true;
                s1Var3.H = true;
                s1Var3.J = false;
                s1Var3.f59026r = 4;
                s1Var3.f59030w = 0.98f;
                s1Var3.v = 0.98f;
                s1Var3.f59029u = 0.98f;
                s1Var3.c();
                return;
            case 3:
                ug.s1 s1Var4 = this.f59038a;
                s1Var4.f59025q = true;
                s1Var4.K = false;
                s1Var4.H = true;
                s1Var4.J = true;
                s1Var4.f59019k = org.telegram.messenger.g0.L(-14.0f);
                ug.s1 s1Var5 = this.f59038a;
                s1Var5.f59031x = 2000L;
                s1Var5.f59032y = 3000;
                s1Var5.f59026r = 16;
                s1Var5.G = false;
                s1Var5.O = 28;
                s1Var5.Q = n6.Dk;
                s1Var5.c();
                return;
            case 4:
                ug.s1 s1Var6 = this.f59038a;
                s1Var6.f59025q = true;
                s1Var6.K = false;
                s1Var6.H = true;
                s1Var6.J = true;
                s1Var6.f59019k = org.telegram.messenger.g0.L(-14.0f);
                ug.s1 s1Var7 = this.f59038a;
                s1Var7.f59031x = 2000L;
                s1Var7.f59032y = 3000;
                s1Var7.f59026r = 16;
                s1Var7.G = false;
                s1Var7.O = 28;
                s1Var7.Q = n6.Dk;
                s1Var7.c();
                return;
            default:
                super.a();
                ug.s1 s1Var8 = this.f59038a;
                s1Var8.f59025q = true;
                s1Var8.K = false;
                s1Var8.L = true;
                s1Var8.H = true;
                s1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f18726r) {
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
        switch (this.f18726r) {
            case 3:
                super.onMeasure(i7, i10);
                this.f59038a.f59012b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 4:
                super.onMeasure(i7, i10);
                this.f59038a.f59012b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            case 5:
                super.onMeasure(i7, i10);
                this.f59038a.f59012b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(52.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
