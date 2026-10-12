package ei;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import di.w7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import sg.w1;
import sg.x1;
public final class d extends x1 {
    public Paint[] f8789n;
    public final int f8790r;
    public final int f8791s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f8790r = i10;
        this.f8791s = i11;
        c();
    }

    @Override
    public final void a() {
        w1 w1Var = new w1(this.f8790r);
        this.f45428a = w1Var;
        w1Var.N = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f45408m = true;
        w1Var.h = true;
        if (this.f8791s == 1) {
            w1Var.f45406k = AndroidUtilities.dp(24.0f);
        }
        this.f8789n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f8789n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f8789n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f8789n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                w1 w1Var2 = this.f45428a;
                w1Var2.f45407l = new w7(this, 1);
                w1Var2.f45413r = 17;
                w1Var2.f45414s = 18;
                w1Var2.f45415t = 19;
                w1Var2.P = g6.G6;
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
