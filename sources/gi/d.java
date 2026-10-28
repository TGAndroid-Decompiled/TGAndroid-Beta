package gi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import bi.dc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import tg.w1;
import tg.x1;
public final class d extends x1 {
    public Paint[] f12495r;
    public final int f12496s;
    public final int v;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f12496s = i10;
        this.v = i11;
        c();
    }

    @Override
    public final void a() {
        w1 w1Var = new w1(this.f12496s);
        this.f49154a = w1Var;
        w1Var.O = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f49134m = true;
        w1Var.h = true;
        if (this.v == 1) {
            w1Var.f49132k = AndroidUtilities.dp(24.0f);
        }
        this.f12495r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f12495r;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f12495r[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (this.f12495r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                w1 w1Var2 = this.f49154a;
                w1Var2.f49133l = new dc(this, 2);
                w1Var2.f49139r = 17;
                w1Var2.f49140s = 18;
                w1Var2.f49141t = 19;
                w1Var2.Q = y6.G6;
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
