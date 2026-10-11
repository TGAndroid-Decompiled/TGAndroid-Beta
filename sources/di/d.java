package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import rg.v1;
import rg.w1;
public final class d extends w1 {
    public Paint[] f8376n;
    public final int f8377r;
    public final int f8378s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f8377r = i10;
        this.f8378s = i11;
        c();
    }

    @Override
    public final void a() {
        v1 v1Var = new v1(this.f8377r);
        this.f47627a = v1Var;
        v1Var.N = 106;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f47610m = true;
        v1Var.h = true;
        if (this.f8378s == 1) {
            v1Var.f47608k = AndroidUtilities.dp(24.0f);
        }
        this.f8376n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f8376n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f8376n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f8376n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                v1 v1Var2 = this.f47627a;
                v1Var2.f47609l = new x7(this, 1);
                v1Var2.f47615r = 17;
                v1Var2.f47616s = 18;
                v1Var2.f47617t = 19;
                v1Var2.P = h6.G6;
                v1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
