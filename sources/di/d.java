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
    public Paint[] f7746n;
    public final int f7747r;
    public final int f7748s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f7747r = i10;
        this.f7748s = i11;
        b();
    }

    @Override
    public final void a() {
        v1 v1Var = new v1(this.f7747r);
        this.f42923a = v1Var;
        v1Var.N = 106;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f42903m = true;
        v1Var.h = true;
        if (this.f7748s == 1) {
            v1Var.f42901k = AndroidUtilities.dp(24.0f);
        }
        this.f7746n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f7746n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f7746n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f7746n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                v1 v1Var2 = this.f42923a;
                v1Var2.f42902l = new x7(this, 1);
                v1Var2.f42908r = 17;
                v1Var2.f42909s = 18;
                v1Var2.f42910t = 19;
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
