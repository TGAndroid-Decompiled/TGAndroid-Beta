package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class f extends rg.w1 {
    public final int f8323n;

    public f(Context context, int i10) {
        super(context);
        this.f8323n = i10;
    }

    @Override
    public final void a() {
        switch (this.f8323n) {
            case 0:
                super.a();
                rg.v1 v1Var = this.f42829a;
                v1Var.f42813q = true;
                v1Var.K = false;
                v1Var.L = true;
                v1Var.H = true;
                v1Var.c();
                return;
            case 1:
                super.a();
                rg.v1 v1Var2 = this.f42829a;
                v1Var2.f42813q = true;
                v1Var2.K = false;
                v1Var2.L = true;
                v1Var2.H = true;
                v1Var2.c();
                return;
            case 2:
                rg.v1 v1Var3 = new rg.v1(50);
                this.f42829a = v1Var3;
                v1Var3.N = 100;
                v1Var3.M = false;
                v1Var3.G = false;
                v1Var3.K = true;
                v1Var3.H = true;
                v1Var3.J = false;
                v1Var3.f42814r = 4;
                v1Var3.f42818w = 0.98f;
                v1Var3.v = 0.98f;
                v1Var3.f42817u = 0.98f;
                v1Var3.c();
                return;
            case 3:
                rg.v1 v1Var4 = this.f42829a;
                v1Var4.f42813q = true;
                v1Var4.K = false;
                v1Var4.H = true;
                v1Var4.J = true;
                v1Var4.f42807k = AndroidUtilities.dp(-14.0f);
                rg.v1 v1Var5 = this.f42829a;
                v1Var5.f42819x = 2000L;
                v1Var5.f42820y = 3000;
                v1Var5.f42814r = 16;
                v1Var5.G = false;
                v1Var5.N = 28;
                v1Var5.P = j6.Mj;
                v1Var5.c();
                return;
            case 4:
                rg.v1 v1Var6 = this.f42829a;
                v1Var6.f42813q = true;
                v1Var6.K = false;
                v1Var6.H = true;
                v1Var6.J = true;
                v1Var6.f42807k = AndroidUtilities.dp(-14.0f);
                rg.v1 v1Var7 = this.f42829a;
                v1Var7.f42819x = 2000L;
                v1Var7.f42820y = 3000;
                v1Var7.f42814r = 16;
                v1Var7.G = false;
                v1Var7.N = 28;
                v1Var7.P = j6.Mj;
                v1Var7.c();
                return;
            default:
                super.a();
                rg.v1 v1Var8 = this.f42829a;
                v1Var8.f42813q = true;
                v1Var8.K = false;
                v1Var8.L = true;
                v1Var8.H = true;
                v1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f8323n) {
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
        switch (this.f8323n) {
            case 3:
                super.onMeasure(i10, i11);
                this.f42829a.f42801b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i10, i11);
                this.f42829a.f42801b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                this.f42829a.f42801b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
