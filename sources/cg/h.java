package cg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class h extends s2 {
    public final int f3152n;

    public h(Context context, int i10) {
        super(context);
        this.f3152n = i10;
    }

    @Override
    public final void a() {
        switch (this.f3152n) {
            case 0:
                r2 r2Var = this.f3367a;
                r2Var.f3344q = true;
                r2Var.K = false;
                r2Var.H = true;
                r2Var.J = true;
                r2Var.f3338k = AndroidUtilities.dp(-14.0f);
                r2 r2Var2 = this.f3367a;
                r2Var2.f3350x = 2000L;
                r2Var2.f3351y = 3000;
                r2Var2.f3345r = 16;
                r2Var2.G = false;
                r2Var2.N = 28;
                r2Var2.P = g6.Mj;
                r2Var2.c();
                return;
            case 1:
                super.a();
                r2 r2Var3 = this.f3367a;
                r2Var3.f3344q = true;
                r2Var3.K = false;
                r2Var3.L = true;
                r2Var3.H = true;
                r2Var3.c();
                return;
            case 2:
                r2 r2Var4 = new r2(50);
                this.f3367a = r2Var4;
                r2Var4.N = 100;
                r2Var4.M = false;
                r2Var4.G = false;
                r2Var4.K = true;
                r2Var4.H = true;
                r2Var4.J = false;
                r2Var4.f3345r = 4;
                r2Var4.f3349w = 0.98f;
                r2Var4.v = 0.98f;
                r2Var4.f3348u = 0.98f;
                r2Var4.c();
                return;
            case 3:
                r2 r2Var5 = this.f3367a;
                r2Var5.f3344q = true;
                r2Var5.K = false;
                r2Var5.H = true;
                r2Var5.J = true;
                r2Var5.f3338k = AndroidUtilities.dp(-14.0f);
                r2 r2Var6 = this.f3367a;
                r2Var6.f3350x = 2000L;
                r2Var6.f3351y = 3000;
                r2Var6.f3345r = 16;
                r2Var6.G = false;
                r2Var6.N = 28;
                r2Var6.P = g6.Mj;
                r2Var6.c();
                return;
            case 4:
                super.a();
                r2 r2Var7 = this.f3367a;
                r2Var7.f3344q = true;
                r2Var7.K = false;
                r2Var7.L = true;
                r2Var7.H = true;
                r2Var7.c();
                return;
            default:
                super.a();
                r2 r2Var8 = this.f3367a;
                r2Var8.f3344q = true;
                r2Var8.K = false;
                r2Var8.L = true;
                r2Var8.H = true;
                r2Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f3152n) {
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
        switch (this.f3152n) {
            case 0:
                super.onMeasure(i10, i11);
                this.f3367a.f3331b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                this.f3367a.f3331b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                this.f3367a.f3331b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
        }
    }
}
