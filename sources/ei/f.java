package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
public final class f extends rg.w1 {
    public final int f9052n;

    public f(Context context, int i10) {
        super(context);
        this.f9052n = i10;
    }

    @Override
    public final void a() {
        switch (this.f9052n) {
            case 0:
                super.a();
                rg.v1 v1Var = this.f47503a;
                v1Var.f47490q = true;
                v1Var.K = false;
                v1Var.L = true;
                v1Var.H = true;
                v1Var.c();
                return;
            case 1:
                super.a();
                rg.v1 v1Var2 = this.f47503a;
                v1Var2.f47490q = true;
                v1Var2.K = false;
                v1Var2.L = true;
                v1Var2.H = true;
                v1Var2.c();
                return;
            case 2:
                rg.v1 v1Var3 = new rg.v1(50);
                this.f47503a = v1Var3;
                v1Var3.N = 100;
                v1Var3.M = false;
                v1Var3.G = false;
                v1Var3.K = true;
                v1Var3.H = true;
                v1Var3.J = false;
                v1Var3.f47491r = 4;
                v1Var3.f47495w = 0.98f;
                v1Var3.v = 0.98f;
                v1Var3.f47494u = 0.98f;
                v1Var3.c();
                return;
            case 3:
                rg.v1 v1Var4 = this.f47503a;
                v1Var4.f47490q = true;
                v1Var4.K = false;
                v1Var4.H = true;
                v1Var4.J = true;
                v1Var4.f47484k = AndroidUtilities.dp(-14.0f);
                rg.v1 v1Var5 = this.f47503a;
                v1Var5.f47496x = 2000L;
                v1Var5.f47497y = 3000;
                v1Var5.f47491r = 16;
                v1Var5.G = false;
                v1Var5.N = 28;
                v1Var5.P = i6.Mj;
                v1Var5.c();
                return;
            case 4:
                rg.v1 v1Var6 = this.f47503a;
                v1Var6.f47490q = true;
                v1Var6.K = false;
                v1Var6.H = true;
                v1Var6.J = true;
                v1Var6.f47484k = AndroidUtilities.dp(-14.0f);
                rg.v1 v1Var7 = this.f47503a;
                v1Var7.f47496x = 2000L;
                v1Var7.f47497y = 3000;
                v1Var7.f47491r = 16;
                v1Var7.G = false;
                v1Var7.N = 28;
                v1Var7.P = i6.Mj;
                v1Var7.c();
                return;
            default:
                super.a();
                rg.v1 v1Var8 = this.f47503a;
                v1Var8.f47490q = true;
                v1Var8.K = false;
                v1Var8.L = true;
                v1Var8.H = true;
                v1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f9052n) {
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
    public void onMeasure(int i10, int i11) {
        switch (this.f9052n) {
            case 3:
                super.onMeasure(i10, i11);
                this.f47503a.f47477b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i10, i11);
                this.f47503a.f47477b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                this.f47503a.f47477b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
