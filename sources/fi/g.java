package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class g extends sg.z1 {
    public final int f9707n;

    public g(Context context, int i10) {
        super(context);
        this.f9707n = i10;
    }

    @Override
    public final void a() {
        switch (this.f9707n) {
            case 0:
                super.a();
                sg.y1 y1Var = this.f46404a;
                y1Var.f46386q = true;
                y1Var.K = false;
                y1Var.L = true;
                y1Var.H = true;
                y1Var.c();
                return;
            case 1:
                super.a();
                sg.y1 y1Var2 = this.f46404a;
                y1Var2.f46386q = true;
                y1Var2.K = false;
                y1Var2.L = true;
                y1Var2.H = true;
                y1Var2.c();
                return;
            case 2:
                sg.y1 y1Var3 = new sg.y1(50);
                this.f46404a = y1Var3;
                y1Var3.N = 100;
                y1Var3.M = false;
                y1Var3.G = false;
                y1Var3.K = true;
                y1Var3.H = true;
                y1Var3.J = false;
                y1Var3.f46387r = 4;
                y1Var3.f46391w = 0.98f;
                y1Var3.v = 0.98f;
                y1Var3.f46390u = 0.98f;
                y1Var3.c();
                return;
            case 3:
                sg.y1 y1Var4 = this.f46404a;
                y1Var4.f46386q = true;
                y1Var4.K = false;
                y1Var4.H = true;
                y1Var4.J = true;
                y1Var4.f46380k = AndroidUtilities.dp(-14.0f);
                sg.y1 y1Var5 = this.f46404a;
                y1Var5.f46392x = 2000L;
                y1Var5.f46393y = 3000;
                y1Var5.f46387r = 16;
                y1Var5.G = false;
                y1Var5.N = 28;
                y1Var5.P = j6.Mj;
                y1Var5.c();
                return;
            case 4:
                sg.y1 y1Var6 = this.f46404a;
                y1Var6.f46386q = true;
                y1Var6.K = false;
                y1Var6.H = true;
                y1Var6.J = true;
                y1Var6.f46380k = AndroidUtilities.dp(-14.0f);
                sg.y1 y1Var7 = this.f46404a;
                y1Var7.f46392x = 2000L;
                y1Var7.f46393y = 3000;
                y1Var7.f46387r = 16;
                y1Var7.G = false;
                y1Var7.N = 28;
                y1Var7.P = j6.Mj;
                y1Var7.c();
                return;
            default:
                super.a();
                sg.y1 y1Var8 = this.f46404a;
                y1Var8.f46386q = true;
                y1Var8.K = false;
                y1Var8.L = true;
                y1Var8.H = true;
                y1Var8.c();
                return;
        }
    }

    @Override
    public int getStarsRectWidth() {
        switch (this.f9707n) {
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
        switch (this.f9707n) {
            case 3:
                super.onMeasure(i10, i11);
                this.f46404a.f46373b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 4:
                super.onMeasure(i10, i11);
                this.f46404a.f46373b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                this.f46404a.f46373b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
