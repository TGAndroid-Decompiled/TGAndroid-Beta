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
    public Paint[] f10602n;
    public final int f10603r;
    public final int f10604s;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f10603r = i10;
        this.f10604s = i11;
        c();
    }

    @Override
    public final void a() {
        w1 w1Var = new w1(this.f10603r);
        this.f46499a = w1Var;
        w1Var.O = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f46479m = true;
        w1Var.h = true;
        if (this.f10604s == 1) {
            w1Var.f46477k = AndroidUtilities.dp(24.0f);
        }
        this.f10602n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f10602n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f10602n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (this.f10602n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                w1 w1Var2 = this.f46499a;
                w1Var2.f46478l = new jc(this, 2);
                w1Var2.f46484r = 17;
                w1Var2.f46485s = 18;
                w1Var2.f46486t = 19;
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
