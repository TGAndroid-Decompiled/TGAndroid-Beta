package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class f extends sg.x1 {
    public final int f9266n;

    public f(Context context, int i10) {
        super(context);
        this.f9266n = i10;
    }

    @Override
    public final void a() {
        switch (this.f9266n) {
            case 0:
                super.a();
                sg.w1 w1Var = this.f45428a;
                w1Var.f45412q = true;
                w1Var.K = false;
                w1Var.L = true;
                w1Var.H = true;
                w1Var.c();
                return;
            case 1:
                super.a();
                sg.w1 w1Var2 = this.f45428a;
                w1Var2.f45412q = true;
                w1Var2.K = false;
                w1Var2.L = true;
                w1Var2.H = true;
                w1Var2.c();
                return;
            case 2:
                sg.w1 w1Var3 = new sg.w1(50);
                this.f45428a = w1Var3;
                w1Var3.N = 100;
                w1Var3.M = false;
                w1Var3.G = false;
                w1Var3.K = true;
                w1Var3.H = true;
                w1Var3.J = false;
                w1Var3.f45413r = 4;
                w1Var3.f45417w = 0.98f;
                w1Var3.v = 0.98f;
                w1Var3.f45416u = 0.98f;
                w1Var3.c();
                return;
            case 3:
                sg.w1 w1Var4 = this.f45428a;
                w1Var4.f45412q = true;
                w1Var4.K = false;
                w1Var4.H = true;
                w1Var4.J = true;
                w1Var4.f45406k = AndroidUtilities.dp(-14.0f);
                sg.w1 w1Var5 = this.f45428a;
                w1Var5.f45418x = 2000L;
                w1Var5.f45419y = 3000;
                w1Var5.f45413r = 16;
                w1Var5.G = false;
                w1Var5.N = 28;
                w1Var5.P = g6.Mj;
                w1Var5.c();
                return;
            case 4:
                sg.w1 w1Var6 = this.f45428a;
                w1Var6.f45412q = true;
                w1Var6.K = false;
                w1Var6.H = true;
                w1Var6.J = true;
                w1Var6.f45406k = AndroidUtilities.dp(-14.0f);
                sg.w1 w1Var7 = this.f45428a;
                w1Var7.f45418x = 2000L;
                w1Var7.f45419y = 3000;
                w1Var7.f45413r = 16;
                w1Var7.G = false;
                w1Var7.N = 28;
                w1Var7.P = g6.Mj;
                w1Var7.c();
                return;
            default:
                super.a();
                sg.w1 w1Var8 = this.f45428a;
                w1Var8.f45412q = true;
                w1Var8.K = false;
                w1Var8.L = true;
                w1Var8.H = true;
                w1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f9266n) {
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
        switch (this.f9266n) {
            case 3:
                super.onMeasure(i10, i11);
                this.f45428a.f45400b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i10, i11);
                this.f45428a.f45400b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                this.f45428a.f45400b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
