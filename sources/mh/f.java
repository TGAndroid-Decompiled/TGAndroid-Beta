package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class f extends zf.w1 {
    public final int f17826n;

    public f(Context context, int i9) {
        super(context);
        this.f17826n = i9;
    }

    @Override
    public final void a() {
        switch (this.f17826n) {
            case 0:
                super.a();
                zf.v1 v1Var = this.f50764a;
                v1Var.f50747q = true;
                v1Var.K = false;
                v1Var.L = true;
                v1Var.H = true;
                v1Var.c();
                return;
            case 1:
                super.a();
                zf.v1 v1Var2 = this.f50764a;
                v1Var2.f50747q = true;
                v1Var2.K = false;
                v1Var2.L = true;
                v1Var2.H = true;
                v1Var2.c();
                return;
            case 2:
                zf.v1 v1Var3 = new zf.v1(50);
                this.f50764a = v1Var3;
                v1Var3.N = 100;
                v1Var3.M = false;
                v1Var3.G = false;
                v1Var3.K = true;
                v1Var3.H = true;
                v1Var3.J = false;
                v1Var3.f50748r = 4;
                v1Var3.f50752w = 0.98f;
                v1Var3.v = 0.98f;
                v1Var3.f50751u = 0.98f;
                v1Var3.c();
                return;
            case 3:
                zf.v1 v1Var4 = this.f50764a;
                v1Var4.f50747q = true;
                v1Var4.K = false;
                v1Var4.H = true;
                v1Var4.J = true;
                v1Var4.f50741k = AndroidUtilities.dp(-14.0f);
                zf.v1 v1Var5 = this.f50764a;
                v1Var5.f50753x = 2000L;
                v1Var5.f50754y = 3000;
                v1Var5.f50748r = 16;
                v1Var5.G = false;
                v1Var5.N = 28;
                v1Var5.P = f6.Mj;
                v1Var5.c();
                return;
            case 4:
                zf.v1 v1Var6 = this.f50764a;
                v1Var6.f50747q = true;
                v1Var6.K = false;
                v1Var6.H = true;
                v1Var6.J = true;
                v1Var6.f50741k = AndroidUtilities.dp(-14.0f);
                zf.v1 v1Var7 = this.f50764a;
                v1Var7.f50753x = 2000L;
                v1Var7.f50754y = 3000;
                v1Var7.f50748r = 16;
                v1Var7.G = false;
                v1Var7.N = 28;
                v1Var7.P = f6.Mj;
                v1Var7.c();
                return;
            default:
                super.a();
                zf.v1 v1Var8 = this.f50764a;
                v1Var8.f50747q = true;
                v1Var8.K = false;
                v1Var8.L = true;
                v1Var8.H = true;
                v1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f17826n) {
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
    public void onMeasure(int i9, int i10) {
        switch (this.f17826n) {
            case 3:
                super.onMeasure(i9, i10);
                this.f50764a.f50734b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i9, i10);
                this.f50764a.f50734b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i9, i10);
                this.f50764a.f50734b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }
}
