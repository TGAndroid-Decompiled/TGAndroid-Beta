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
    public Paint[] f12496r;
    public final int f12497s;
    public final int v;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f12497s = i10;
        this.v = i11;
        c();
    }

    @Override
    public final void a() {
        w1 w1Var = new w1(this.f12497s);
        this.f49119a = w1Var;
        w1Var.O = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f49099m = true;
        w1Var.h = true;
        if (this.v == 1) {
            w1Var.f49097k = AndroidUtilities.dp(24.0f);
        }
        this.f12496r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f12496r;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f12496r[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (this.f12496r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                w1 w1Var2 = this.f49119a;
                w1Var2.f49098l = new dc(this, 2);
                w1Var2.f49104r = 17;
                w1Var2.f49105s = 18;
                w1Var2.f49106t = 19;
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
