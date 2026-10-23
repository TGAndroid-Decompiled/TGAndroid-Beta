package fi;

import ai.kc;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import sg.w1;
import sg.x1;
public final class c extends x1 {
    public Paint[] f10619r;
    public final int f10620s;
    public final int v;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f10620s = i10;
        this.v = i11;
        c();
    }

    @Override
    public final void a() {
        w1 w1Var = new w1(this.f10620s);
        this.f46939a = w1Var;
        w1Var.O = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f46919m = true;
        w1Var.h = true;
        if (this.v == 1) {
            w1Var.f46917k = AndroidUtilities.dp(24.0f);
        }
        this.f10619r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f10619r;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f10619r[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (this.f10619r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                w1 w1Var2 = this.f46939a;
                w1Var2.f46918l = new kc(this, 2);
                w1Var2.f46924r = 17;
                w1Var2.f46925s = 18;
                w1Var2.f46926t = 19;
                w1Var2.Q = k6.G6;
                w1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
