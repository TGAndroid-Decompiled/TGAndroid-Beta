package gh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class n9 extends zf.w1 {
    public Paint[] f8633n;
    public final int f8634r;
    public final int f8635s;

    public n9(Context context, int i9, int i10) {
        super(context);
        this.f8634r = i9;
        this.f8635s = i10;
        b();
    }

    @Override
    public final void a() {
        zf.v1 v1Var = new zf.v1(this.f8634r);
        this.f50764a = v1Var;
        v1Var.N = 105;
        int i9 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f50743m = true;
        v1Var.h = true;
        if (this.f8635s == 1) {
            v1Var.f50741k = AndroidUtilities.dp(24.0f);
        }
        this.f8633n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f8633n;
            if (i9 < paintArr.length) {
                paintArr[i9] = new Paint(1);
                this.f8633n[i9].setColorFilter(new PorterDuffColorFilter(i0.a.d(i9 / (this.f8633n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i9++;
            } else {
                zf.v1 v1Var2 = this.f50764a;
                v1Var2.f50742l = new dg.o(this, 1);
                v1Var2.f50748r = 17;
                v1Var2.f50749s = 18;
                v1Var2.f50750t = 19;
                v1Var2.P = org.telegram.ui.ActionBar.f6.G6;
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
