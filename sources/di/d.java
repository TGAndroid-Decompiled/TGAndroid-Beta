package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import ci.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import rg.v1;
import rg.w1;
public final class d extends w1 {
    public Paint[] f7736n;
    public final int f7737r;
    public final int f7738s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f7737r = i10;
        this.f7738s = i11;
        b();
    }

    @Override
    public final void a() {
        v1 v1Var = new v1(this.f7737r);
        this.f42860a = v1Var;
        v1Var.N = 106;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f42840m = true;
        v1Var.h = true;
        if (this.f7738s == 1) {
            v1Var.f42838k = AndroidUtilities.dp(24.0f);
        }
        this.f7736n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f7736n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f7736n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f7736n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                v1 v1Var2 = this.f42860a;
                v1Var2.f42839l = new y7(this, 1);
                v1Var2.f42845r = 17;
                v1Var2.f42846s = 18;
                v1Var2.f42847t = 19;
                v1Var2.P = i6.G6;
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
