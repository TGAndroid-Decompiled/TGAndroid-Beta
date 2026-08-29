package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import bg.b0;
import cg.r2;
import cg.s2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class c extends s2 {
    public Paint[] f19569n;
    public final int f19570r;
    public final int f19571s;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f19570r = i10;
        this.f19571s = i11;
        b();
    }

    @Override
    public final void a() {
        r2 r2Var = new r2(this.f19570r);
        this.f3367a = r2Var;
        r2Var.N = 106;
        int i10 = 0;
        r2Var.M = false;
        r2Var.G = false;
        r2Var.K = true;
        r2Var.H = true;
        r2Var.J = false;
        r2Var.f3340m = true;
        r2Var.h = true;
        if (this.f19571s == 1) {
            r2Var.f3338k = AndroidUtilities.dp(24.0f);
        }
        this.f19569n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f19569n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f19569n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f19569n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                r2 r2Var2 = this.f3367a;
                r2Var2.f3339l = new b0(this, 4);
                r2Var2.f3345r = 17;
                r2Var2.f3346s = 18;
                r2Var2.f3347t = 19;
                r2Var2.P = g6.G6;
                r2Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
