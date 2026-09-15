package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
public final class f extends rg.v1 {
    public final int f8318n;

    public f(Context context, int i10) {
        super(context);
        this.f8318n = i10;
    }

    @Override
    public final void a() {
        switch (this.f8318n) {
            case 0:
                super.a();
                rg.u1 u1Var = this.f42522a;
                u1Var.f42509q = true;
                u1Var.K = false;
                u1Var.L = true;
                u1Var.H = true;
                u1Var.c();
                return;
            case 1:
                super.a();
                rg.u1 u1Var2 = this.f42522a;
                u1Var2.f42509q = true;
                u1Var2.K = false;
                u1Var2.L = true;
                u1Var2.H = true;
                u1Var2.c();
                return;
            case 2:
                rg.u1 u1Var3 = new rg.u1(50);
                this.f42522a = u1Var3;
                u1Var3.N = 100;
                u1Var3.M = false;
                u1Var3.G = false;
                u1Var3.K = true;
                u1Var3.H = true;
                u1Var3.J = false;
                u1Var3.f42510r = 4;
                u1Var3.f42514w = 0.98f;
                u1Var3.v = 0.98f;
                u1Var3.f42513u = 0.98f;
                u1Var3.c();
                return;
            case 3:
                rg.u1 u1Var4 = this.f42522a;
                u1Var4.f42509q = true;
                u1Var4.K = false;
                u1Var4.H = true;
                u1Var4.J = true;
                u1Var4.f42503k = AndroidUtilities.dp(-14.0f);
                rg.u1 u1Var5 = this.f42522a;
                u1Var5.f42515x = 2000L;
                u1Var5.f42516y = 3000;
                u1Var5.f42510r = 16;
                u1Var5.G = false;
                u1Var5.N = 28;
                u1Var5.P = i6.Mj;
                u1Var5.c();
                return;
            case 4:
                rg.u1 u1Var6 = this.f42522a;
                u1Var6.f42509q = true;
                u1Var6.K = false;
                u1Var6.H = true;
                u1Var6.J = true;
                u1Var6.f42503k = AndroidUtilities.dp(-14.0f);
                rg.u1 u1Var7 = this.f42522a;
                u1Var7.f42515x = 2000L;
                u1Var7.f42516y = 3000;
                u1Var7.f42510r = 16;
                u1Var7.G = false;
                u1Var7.N = 28;
                u1Var7.P = i6.Mj;
                u1Var7.c();
                return;
            default:
                super.a();
                rg.u1 u1Var8 = this.f42522a;
                u1Var8.f42509q = true;
                u1Var8.K = false;
                u1Var8.L = true;
                u1Var8.H = true;
                u1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f8318n) {
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
        switch (this.f8318n) {
            case 3:
                super.onMeasure(i10, i11);
                this.f42522a.f42497b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i10, i11);
                this.f42522a.f42497b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                this.f42522a.f42497b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
