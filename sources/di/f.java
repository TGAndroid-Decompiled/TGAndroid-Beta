package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class f extends qg.x1 {
    public final int f6610n;

    public f(Context context, int i10) {
        super(context);
        this.f6610n = i10;
    }

    @Override
    public final void a() {
        switch (this.f6610n) {
            case 0:
                super.a();
                qg.w1 w1Var = this.f40983a;
                w1Var.f40968q = true;
                w1Var.K = false;
                w1Var.L = true;
                w1Var.H = true;
                w1Var.c();
                return;
            case 1:
                super.a();
                qg.w1 w1Var2 = this.f40983a;
                w1Var2.f40968q = true;
                w1Var2.K = false;
                w1Var2.L = true;
                w1Var2.H = true;
                w1Var2.c();
                return;
            case 2:
                qg.w1 w1Var3 = new qg.w1(50);
                this.f40983a = w1Var3;
                w1Var3.N = 100;
                w1Var3.M = false;
                w1Var3.G = false;
                w1Var3.K = true;
                w1Var3.H = true;
                w1Var3.J = false;
                w1Var3.f40969r = 4;
                w1Var3.f40973w = 0.98f;
                w1Var3.v = 0.98f;
                w1Var3.f40972u = 0.98f;
                w1Var3.c();
                return;
            case 3:
                qg.w1 w1Var4 = this.f40983a;
                w1Var4.f40968q = true;
                w1Var4.K = false;
                w1Var4.H = true;
                w1Var4.J = true;
                w1Var4.f40962k = AndroidUtilities.dp(-14.0f);
                qg.w1 w1Var5 = this.f40983a;
                w1Var5.f40974x = 2000L;
                w1Var5.f40975y = 3000;
                w1Var5.f40969r = 16;
                w1Var5.G = false;
                w1Var5.N = 28;
                w1Var5.P = j6.Mj;
                w1Var5.c();
                return;
            case 4:
                qg.w1 w1Var6 = this.f40983a;
                w1Var6.f40968q = true;
                w1Var6.K = false;
                w1Var6.H = true;
                w1Var6.J = true;
                w1Var6.f40962k = AndroidUtilities.dp(-14.0f);
                qg.w1 w1Var7 = this.f40983a;
                w1Var7.f40974x = 2000L;
                w1Var7.f40975y = 3000;
                w1Var7.f40969r = 16;
                w1Var7.G = false;
                w1Var7.N = 28;
                w1Var7.P = j6.Mj;
                w1Var7.c();
                return;
            default:
                super.a();
                qg.w1 w1Var8 = this.f40983a;
                w1Var8.f40968q = true;
                w1Var8.K = false;
                w1Var8.L = true;
                w1Var8.H = true;
                w1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f6610n) {
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
        switch (this.f6610n) {
            case 3:
                super.onMeasure(i10, i11);
                this.f40983a.f40956b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i10, i11);
                this.f40983a.f40956b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                this.f40983a.f40956b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
