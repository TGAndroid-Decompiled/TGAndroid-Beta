package lh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class j9 extends eg.q2 {
    public Paint[] f12680n;
    public final int f12681r;
    public final int f12682s;

    public j9(Context context, int i10, int i11) {
        super(context);
        this.f12681r = i10;
        this.f12682s = i11;
        b();
    }

    @Override
    public final void a() {
        eg.p2 p2Var = new eg.p2(this.f12681r);
        this.f5468a = p2Var;
        p2Var.N = 105;
        int i10 = 0;
        p2Var.M = false;
        p2Var.G = false;
        p2Var.K = true;
        p2Var.H = true;
        p2Var.J = false;
        p2Var.f5436m = true;
        p2Var.h = true;
        if (this.f12682s == 1) {
            p2Var.f5434k = AndroidUtilities.dp(24.0f);
        }
        this.f12680n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f12680n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f12680n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f12680n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                eg.p2 p2Var2 = this.f5468a;
                p2Var2.f5435l = new dg.a0(this, 2);
                p2Var2.f5441r = 17;
                p2Var2.f5442s = 18;
                p2Var2.f5443t = 19;
                p2Var2.P = org.telegram.ui.ActionBar.j6.G6;
                p2Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
