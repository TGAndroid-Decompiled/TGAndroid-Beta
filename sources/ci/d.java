package ci;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import bi.c9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import qg.w1;
import qg.x1;
public final class d extends x1 {
    public Paint[] f4701n;
    public final int f4702r;
    public final int f4703s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f4702r = i10;
        this.f4703s = i11;
        b();
    }

    @Override
    public final void a() {
        w1 w1Var = new w1(this.f4702r);
        this.f40983a = w1Var;
        w1Var.N = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f40964m = true;
        w1Var.h = true;
        if (this.f4703s == 1) {
            w1Var.f40962k = AndroidUtilities.dp(24.0f);
        }
        this.f4701n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f4701n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f4701n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f4701n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                w1 w1Var2 = this.f40983a;
                w1Var2.f40963l = new c9(this, 1);
                w1Var2.f40969r = 17;
                w1Var2.f40970s = 18;
                w1Var2.f40971t = 19;
                w1Var2.P = j6.G6;
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
