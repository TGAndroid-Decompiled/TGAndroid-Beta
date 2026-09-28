package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import rg.v1;
import rg.w1;
public final class d extends w1 {
    public Paint[] f7734n;
    public final int f7735r;
    public final int f7736s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f7735r = i10;
        this.f7736s = i11;
        b();
    }

    @Override
    public final void a() {
        v1 v1Var = new v1(this.f7735r);
        this.f42815a = v1Var;
        v1Var.N = 106;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f42795m = true;
        v1Var.h = true;
        if (this.f7736s == 1) {
            v1Var.f42793k = AndroidUtilities.dp(24.0f);
        }
        this.f7734n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f7734n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f7734n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f7734n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                v1 v1Var2 = this.f42815a;
                v1Var2.f42794l = new x7(this, 1);
                v1Var2.f42800r = 17;
                v1Var2.f42801s = 18;
                v1Var2.f42802t = 19;
                v1Var2.P = h6.G6;
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
