package ag;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.y10;

public final class j extends k3 {

    public final int f485n;

    public j(Context context, int i10) {
        super(context);
        this.f485n = i10;
    }

    @Override
    public final void a() {
        switch (this.f485n) {
            case 0:
                j3 j3Var = this.f540a;
                j3Var.f513q = true;
                j3Var.K = false;
                j3Var.H = true;
                j3Var.J = true;
                j3Var.f507k = AndroidUtilities.dp(-14.0f);
                j3 j3Var2 = this.f540a;
                j3Var2.f519x = 2000L;
                j3Var2.f520y = 3000;
                j3Var2.f514r = 16;
                j3Var2.G = false;
                j3Var2.N = 28;
                j3Var2.P = g6.Mj;
                j3Var2.c();
                break;
            case 1:
                super.a();
                j3 j3Var3 = this.f540a;
                j3Var3.f513q = true;
                j3Var3.K = false;
                j3Var3.L = true;
                j3Var3.H = true;
                j3Var3.c();
                break;
            case 2:
                super.a();
                j3 j3Var4 = this.f540a;
                j3Var4.f513q = true;
                j3Var4.K = false;
                j3Var4.L = true;
                j3Var4.H = true;
                j3Var4.c();
                break;
            case 3:
                super.a();
                j3 j3Var5 = this.f540a;
                j3Var5.f513q = true;
                j3Var5.K = false;
                j3Var5.L = true;
                j3Var5.H = true;
                j3Var5.c();
                break;
            case 4:
                y10 y10Var = new y10(50);
                this.f540a = y10Var;
                y10Var.N = 100;
                y10Var.M = false;
                y10Var.G = false;
                y10Var.K = true;
                y10Var.H = true;
                y10Var.J = false;
                y10Var.f514r = 4;
                y10Var.f518w = 0.98f;
                y10Var.v = 0.98f;
                y10Var.f517u = 0.98f;
                y10Var.c();
                break;
            default:
                j3 j3Var6 = this.f540a;
                j3Var6.f513q = true;
                j3Var6.K = false;
                j3Var6.H = true;
                j3Var6.J = true;
                j3Var6.f507k = AndroidUtilities.dp(-14.0f);
                j3 j3Var7 = this.f540a;
                j3Var7.f519x = 2000L;
                j3Var7.f520y = 3000;
                j3Var7.f514r = 16;
                j3Var7.G = false;
                j3Var7.N = 28;
                j3Var7.P = g6.Mj;
                j3Var7.c();
                break;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f485n) {
            case 2:
                return getMeasuredWidth();
            case 3:
                return getMeasuredWidth();
            case 4:
                return getMeasuredWidth();
            default:
                return super.getStarsRectWidth();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f485n) {
            case 0:
                super.onMeasure(i10, i11);
                this.f540a.f500b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                this.f540a.f500b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            case 5:
                super.onMeasure(i10, i11);
                this.f540a.f500b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
