package fi;

import ai.jc;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import sg.w1;
import sg.x1;
public final class c extends x1 {
    public Paint[] f10603n;
    public final int f10604r;
    public final int f10605s;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f10604r = i10;
        this.f10605s = i11;
        c();
    }

    @Override
    public final void a() {
        w1 w1Var = new w1(this.f10604r);
        this.f46497a = w1Var;
        w1Var.O = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f46477m = true;
        w1Var.h = true;
        if (this.f10605s == 1) {
            w1Var.f46475k = AndroidUtilities.dp(24.0f);
        }
        this.f10603n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f10603n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f10603n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (this.f10603n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                w1 w1Var2 = this.f46497a;
                w1Var2.f46476l = new jc(this, 2);
                w1Var2.f46482r = 17;
                w1Var2.f46483s = 18;
                w1Var2.f46484t = 19;
                w1Var2.Q = h6.G6;
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
