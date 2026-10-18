package fi;

import ai.jc;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import sg.v1;
import sg.w1;
public final class c extends w1 {
    public Paint[] f10605n;
    public final int f10606r;
    public final int f10607s;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f10606r = i10;
        this.f10607s = i11;
        c();
    }

    @Override
    public final void a() {
        v1 v1Var = new v1(this.f10606r);
        this.f46519a = v1Var;
        v1Var.O = 106;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f46499m = true;
        v1Var.h = true;
        if (this.f10607s == 1) {
            v1Var.f46497k = AndroidUtilities.dp(24.0f);
        }
        this.f10605n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f10605n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f10605n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (this.f10605n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                v1 v1Var2 = this.f46519a;
                v1Var2.f46498l = new jc(this, 2);
                v1Var2.f46504r = 17;
                v1Var2.f46505s = 18;
                v1Var2.f46506t = 19;
                v1Var2.Q = h6.G6;
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
