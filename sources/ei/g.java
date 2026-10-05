package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
public final class g extends rg.y1 {
    public final int f9053n;

    public g(Context context, int i10) {
        super(context);
        this.f9053n = i10;
    }

    @Override
    public final void a() {
        switch (this.f9053n) {
            case 0:
                super.a();
                rg.x1 x1Var = this.f46407a;
                x1Var.f46386q = true;
                x1Var.K = false;
                x1Var.L = true;
                x1Var.H = true;
                x1Var.c();
                return;
            case 1:
                super.a();
                rg.x1 x1Var2 = this.f46407a;
                x1Var2.f46386q = true;
                x1Var2.K = false;
                x1Var2.L = true;
                x1Var2.H = true;
                x1Var2.c();
                return;
            case 2:
                rg.x1 x1Var3 = new rg.x1(50);
                this.f46407a = x1Var3;
                x1Var3.N = 100;
                x1Var3.M = false;
                x1Var3.G = false;
                x1Var3.K = true;
                x1Var3.H = true;
                x1Var3.J = false;
                x1Var3.f46387r = 4;
                x1Var3.f46391w = 0.98f;
                x1Var3.v = 0.98f;
                x1Var3.f46390u = 0.98f;
                x1Var3.c();
                return;
            case 3:
                rg.x1 x1Var4 = this.f46407a;
                x1Var4.f46386q = true;
                x1Var4.K = false;
                x1Var4.H = true;
                x1Var4.J = true;
                x1Var4.f46380k = AndroidUtilities.dp(-14.0f);
                rg.x1 x1Var5 = this.f46407a;
                x1Var5.f46392x = 2000L;
                x1Var5.f46393y = 3000;
                x1Var5.f46387r = 16;
                x1Var5.G = false;
                x1Var5.N = 28;
                x1Var5.P = i6.Mj;
                x1Var5.c();
                return;
            case 4:
                rg.x1 x1Var6 = this.f46407a;
                x1Var6.f46386q = true;
                x1Var6.K = false;
                x1Var6.H = true;
                x1Var6.J = true;
                x1Var6.f46380k = AndroidUtilities.dp(-14.0f);
                rg.x1 x1Var7 = this.f46407a;
                x1Var7.f46392x = 2000L;
                x1Var7.f46393y = 3000;
                x1Var7.f46387r = 16;
                x1Var7.G = false;
                x1Var7.N = 28;
                x1Var7.P = i6.Mj;
                x1Var7.c();
                return;
            default:
                super.a();
                rg.x1 x1Var8 = this.f46407a;
                x1Var8.f46386q = true;
                x1Var8.K = false;
                x1Var8.L = true;
                x1Var8.H = true;
                x1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f9053n) {
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
        switch (this.f9053n) {
            case 3:
                super.onMeasure(i10, i11);
                this.f46407a.f46373b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i10, i11);
                this.f46407a.f46373b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                this.f46407a.f46373b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
