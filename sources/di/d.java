package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import rg.v1;
import rg.w1;
public final class d extends w1 {
    public Paint[] f7751n;
    public final int f7752r;
    public final int f7753s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f7752r = i10;
        this.f7753s = i11;
        b();
    }

    @Override
    public final void a() {
        v1 v1Var = new v1(this.f7752r);
        this.f42850a = v1Var;
        v1Var.N = 106;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f42830m = true;
        v1Var.h = true;
        if (this.f7753s == 1) {
            v1Var.f42828k = AndroidUtilities.dp(24.0f);
        }
        this.f7751n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f7751n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f7751n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f7751n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                v1 v1Var2 = this.f42850a;
                v1Var2.f42829l = new a8(this, 1);
                v1Var2.f42835r = 17;
                v1Var2.f42836s = 18;
                v1Var2.f42837t = 19;
                v1Var2.P = j6.G6;
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
