package fg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class h extends p2 {
    public final int f6320n;

    public h(Context context, int i10) {
        super(context);
        this.f6320n = i10;
    }

    @Override
    public final void a() {
        switch (this.f6320n) {
            case 0:
                o2 o2Var = this.f6501a;
                o2Var.f6465q = true;
                o2Var.K = false;
                o2Var.H = true;
                o2Var.J = true;
                o2Var.f6459k = AndroidUtilities.dp(-14.0f);
                o2 o2Var2 = this.f6501a;
                o2Var2.f6471x = 2000L;
                o2Var2.f6472y = 3000;
                o2Var2.f6466r = 16;
                o2Var2.G = false;
                o2Var2.N = 28;
                o2Var2.P = k6.Mj;
                o2Var2.c();
                return;
            case 1:
                super.a();
                o2 o2Var3 = this.f6501a;
                o2Var3.f6465q = true;
                o2Var3.K = false;
                o2Var3.L = true;
                o2Var3.H = true;
                o2Var3.c();
                return;
            case 2:
                o2 o2Var4 = new o2(50);
                this.f6501a = o2Var4;
                o2Var4.N = 100;
                o2Var4.M = false;
                o2Var4.G = false;
                o2Var4.K = true;
                o2Var4.H = true;
                o2Var4.J = false;
                o2Var4.f6466r = 4;
                o2Var4.f6470w = 0.98f;
                o2Var4.v = 0.98f;
                o2Var4.f6469u = 0.98f;
                o2Var4.c();
                return;
            case 3:
                o2 o2Var5 = this.f6501a;
                o2Var5.f6465q = true;
                o2Var5.K = false;
                o2Var5.H = true;
                o2Var5.J = true;
                o2Var5.f6459k = AndroidUtilities.dp(-14.0f);
                o2 o2Var6 = this.f6501a;
                o2Var6.f6471x = 2000L;
                o2Var6.f6472y = 3000;
                o2Var6.f6466r = 16;
                o2Var6.G = false;
                o2Var6.N = 28;
                o2Var6.P = k6.Mj;
                o2Var6.c();
                return;
            case 4:
                super.a();
                o2 o2Var7 = this.f6501a;
                o2Var7.f6465q = true;
                o2Var7.K = false;
                o2Var7.L = true;
                o2Var7.H = true;
                o2Var7.c();
                return;
            default:
                super.a();
                o2 o2Var8 = this.f6501a;
                o2Var8.f6465q = true;
                o2Var8.K = false;
                o2Var8.L = true;
                o2Var8.H = true;
                o2Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f6320n) {
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
        switch (this.f6320n) {
            case 0:
                super.onMeasure(i10, i11);
                this.f6501a.f6452b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                this.f6501a.f6452b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                this.f6501a.f6452b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
        }
    }
}
