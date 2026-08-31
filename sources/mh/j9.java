package mh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class j9 extends fg.p2 {
    public Paint[] f14311n;
    public final int f14312r;
    public final int f14313s;

    public j9(Context context, int i10, int i11) {
        super(context);
        this.f14312r = i10;
        this.f14313s = i11;
        b();
    }

    @Override
    public final void a() {
        fg.o2 o2Var = new fg.o2(this.f14312r);
        this.f6501a = o2Var;
        o2Var.N = 105;
        int i10 = 0;
        o2Var.M = false;
        o2Var.G = false;
        o2Var.K = true;
        o2Var.H = true;
        o2Var.J = false;
        o2Var.f6461m = true;
        o2Var.h = true;
        if (this.f14313s == 1) {
            o2Var.f6459k = AndroidUtilities.dp(24.0f);
        }
        this.f14311n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f14311n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f14311n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f14311n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                fg.o2 o2Var2 = this.f6501a;
                o2Var2.f6460l = new eg.y(this, 2);
                o2Var2.f6466r = 17;
                o2Var2.f6467s = 18;
                o2Var2.f6468t = 19;
                o2Var2.P = org.telegram.ui.ActionBar.k6.G6;
                o2Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
