package eg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class h extends q2 {
    public final int f5284n;

    public h(Context context, int i10) {
        super(context);
        this.f5284n = i10;
    }

    @Override
    public final void a() {
        switch (this.f5284n) {
            case 0:
                p2 p2Var = this.f5457a;
                p2Var.f5429q = true;
                p2Var.K = false;
                p2Var.H = true;
                p2Var.J = true;
                p2Var.f5423k = AndroidUtilities.dp(-14.0f);
                p2 p2Var2 = this.f5457a;
                p2Var2.f5435x = 2000L;
                p2Var2.f5436y = 3000;
                p2Var2.f5430r = 16;
                p2Var2.G = false;
                p2Var2.N = 28;
                p2Var2.P = j6.Mj;
                p2Var2.c();
                return;
            case 1:
                super.a();
                p2 p2Var3 = this.f5457a;
                p2Var3.f5429q = true;
                p2Var3.K = false;
                p2Var3.L = true;
                p2Var3.H = true;
                p2Var3.c();
                return;
            case 2:
                p2 p2Var4 = new p2(50);
                this.f5457a = p2Var4;
                p2Var4.N = 100;
                p2Var4.M = false;
                p2Var4.G = false;
                p2Var4.K = true;
                p2Var4.H = true;
                p2Var4.J = false;
                p2Var4.f5430r = 4;
                p2Var4.f5434w = 0.98f;
                p2Var4.v = 0.98f;
                p2Var4.f5433u = 0.98f;
                p2Var4.c();
                return;
            case 3:
                p2 p2Var5 = this.f5457a;
                p2Var5.f5429q = true;
                p2Var5.K = false;
                p2Var5.H = true;
                p2Var5.J = true;
                p2Var5.f5423k = AndroidUtilities.dp(-14.0f);
                p2 p2Var6 = this.f5457a;
                p2Var6.f5435x = 2000L;
                p2Var6.f5436y = 3000;
                p2Var6.f5430r = 16;
                p2Var6.G = false;
                p2Var6.N = 28;
                p2Var6.P = j6.Mj;
                p2Var6.c();
                return;
            case 4:
                super.a();
                p2 p2Var7 = this.f5457a;
                p2Var7.f5429q = true;
                p2Var7.K = false;
                p2Var7.L = true;
                p2Var7.H = true;
                p2Var7.c();
                return;
            default:
                super.a();
                p2 p2Var8 = this.f5457a;
                p2Var8.f5429q = true;
                p2Var8.K = false;
                p2Var8.L = true;
                p2Var8.H = true;
                p2Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f5284n) {
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
        switch (this.f5284n) {
            case 0:
                super.onMeasure(i10, i11);
                this.f5457a.f5417b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                this.f5457a.f5417b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                this.f5457a.f5417b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
        }
    }
}
