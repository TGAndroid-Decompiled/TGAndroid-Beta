package lh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import dg.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import zf.v1;
import zf.w1;
public final class c extends w1 {
    public Paint[] f16875n;
    public final int f16876r;
    public final int f16877s;

    public c(Context context, int i9, int i10) {
        super(context);
        this.f16876r = i9;
        this.f16877s = i10;
        b();
    }

    @Override
    public final void a() {
        v1 v1Var = new v1(this.f16876r);
        this.f50764a = v1Var;
        v1Var.N = 106;
        int i9 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f50743m = true;
        v1Var.h = true;
        if (this.f16877s == 1) {
            v1Var.f50741k = AndroidUtilities.dp(24.0f);
        }
        this.f16875n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f16875n;
            if (i9 < paintArr.length) {
                paintArr[i9] = new Paint(1);
                this.f16875n[i9].setColorFilter(new PorterDuffColorFilter(i0.a.d(i9 / (this.f16875n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i9++;
            } else {
                v1 v1Var2 = this.f50764a;
                v1Var2.f50742l = new o(this, 3);
                v1Var2.f50748r = 17;
                v1Var2.f50749s = 18;
                v1Var2.f50750t = 19;
                v1Var2.P = f6.G6;
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
