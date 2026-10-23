package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class kc extends sg.x1 {
    public Paint[] f1658n;
    public final int f1659r;
    public final int f1660s;

    public kc(Context context, int i10, int i11) {
        super(context);
        this.f1659r = i10;
        this.f1660s = i11;
        c();
    }

    @Override
    public final void a() {
        int i10;
        int f7;
        float f10;
        int i11;
        int i12;
        sg.w1 w1Var = new sg.w1(this.f1659r);
        this.f46508a = w1Var;
        w1Var.O = 105;
        int i13 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f46488m = true;
        w1Var.h = true;
        int i14 = this.f1660s;
        if (i14 == 1) {
            w1Var.f46486k = AndroidUtilities.dp(24.0f);
        }
        if (i14 == 2) {
            i10 = 40;
        } else {
            i10 = 20;
        }
        this.f1658n = new Paint[i10];
        while (true) {
            Paint[] paintArr = this.f1658n;
            if (i13 >= paintArr.length) {
                break;
            }
            paintArr[i13] = new Paint(1);
            if (i14 == 2) {
                if (i13 >= 20) {
                    f10 = (i13 - 20) / 19.0f;
                    i11 = -1005568;
                    i12 = -2062336;
                } else if (i13 % 5 == 0) {
                    f7 = -2340;
                } else {
                    f10 = i13 / 19.0f;
                    i11 = -10645;
                    i12 = -20165;
                }
                f7 = i0.a.f(f10, i11, i12);
            } else {
                f7 = i0.a.f(i13 / (this.f1658n.length - 1), -371690, -14281);
            }
            this.f1658n[i13].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
            i13++;
        }
        sg.w1 w1Var2 = this.f46508a;
        w1Var2.f46487l = new jc(this, 0);
        w1Var2.f46493r = 17;
        w1Var2.f46494s = 18;
        w1Var2.f46495t = 19;
        if (i14 == 2) {
            w1Var2.N = true;
            w1Var2.f46493r = 9;
            w1Var2.f46494s = 11;
            w1Var2.f46495t = 13;
            w1Var2.f46490o = 1.6f;
            w1Var2.f46498x = 1400L;
            w1Var2.f46499y = 1600;
            w1Var2.L = true;
        }
        w1Var2.Q = org.telegram.ui.ActionBar.h6.G6;
        w1Var2.c();
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
