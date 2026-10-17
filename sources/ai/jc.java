package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class jc extends sg.w1 {
    public Paint[] f1601n;
    public final int f1602r;
    public final int f1603s;

    public jc(Context context, int i10, int i11) {
        super(context);
        this.f1602r = i10;
        this.f1603s = i11;
        c();
    }

    @Override
    public final void a() {
        int i10;
        int f7;
        float f10;
        int i11;
        int i12;
        sg.v1 v1Var = new sg.v1(this.f1602r);
        this.f46499a = v1Var;
        v1Var.O = 105;
        int i13 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f46479m = true;
        v1Var.h = true;
        int i14 = this.f1603s;
        if (i14 == 1) {
            v1Var.f46477k = AndroidUtilities.dp(24.0f);
        }
        if (i14 == 2) {
            i10 = 40;
        } else {
            i10 = 20;
        }
        this.f1601n = new Paint[i10];
        while (true) {
            Paint[] paintArr = this.f1601n;
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
                f7 = i0.b.f(f10, i11, i12);
            } else {
                f7 = i0.b.f(i13 / (this.f1601n.length - 1), -371690, -14281);
            }
            this.f1601n[i13].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
            i13++;
        }
        sg.v1 v1Var2 = this.f46499a;
        v1Var2.f46478l = new ic(this, 0);
        v1Var2.f46484r = 17;
        v1Var2.f46485s = 18;
        v1Var2.f46486t = 19;
        if (i14 == 2) {
            v1Var2.N = true;
            v1Var2.f46484r = 9;
            v1Var2.f46485s = 11;
            v1Var2.f46486t = 13;
            v1Var2.f46481o = 1.6f;
            v1Var2.f46489x = 1400L;
            v1Var2.f46490y = 1600;
            v1Var2.L = true;
        }
        v1Var2.Q = org.telegram.ui.ActionBar.h6.G6;
        v1Var2.c();
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
