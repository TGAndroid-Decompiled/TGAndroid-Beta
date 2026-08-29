package jh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class i9 extends cg.s2 {
    public Paint[] f12270n;
    public final int f12271r;
    public final int f12272s;

    public i9(Context context, int i10, int i11) {
        super(context);
        this.f12271r = i10;
        this.f12272s = i11;
        b();
    }

    @Override
    public final void a() {
        cg.r2 r2Var = new cg.r2(this.f12271r);
        this.f3367a = r2Var;
        r2Var.N = 105;
        int i10 = 0;
        r2Var.M = false;
        r2Var.G = false;
        r2Var.K = true;
        r2Var.H = true;
        r2Var.J = false;
        r2Var.f3340m = true;
        r2Var.h = true;
        if (this.f12272s == 1) {
            r2Var.f3338k = AndroidUtilities.dp(24.0f);
        }
        this.f12270n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f12270n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f12270n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f12270n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                cg.r2 r2Var2 = this.f3367a;
                r2Var2.f3339l = new bg.b0(this, 2);
                r2Var2.f3345r = 17;
                r2Var2.f3346s = 18;
                r2Var2.f3347t = 19;
                r2Var2.P = org.telegram.ui.ActionBar.g6.G6;
                r2Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
