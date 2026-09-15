package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import rg.u1;
import rg.v1;
public final class d extends v1 {
    public Paint[] f7747n;
    public final int f7748r;
    public final int f7749s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f7748r = i10;
        this.f7749s = i11;
        b();
    }

    @Override
    public final void a() {
        u1 u1Var = new u1(this.f7748r);
        this.f42522a = u1Var;
        u1Var.N = 106;
        int i10 = 0;
        u1Var.M = false;
        u1Var.G = false;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.J = false;
        u1Var.f42505m = true;
        u1Var.h = true;
        if (this.f7749s == 1) {
            u1Var.f42503k = AndroidUtilities.dp(24.0f);
        }
        this.f7747n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f7747n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f7747n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f7747n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                u1 u1Var2 = this.f42522a;
                u1Var2.f42504l = new a8(this, 1);
                u1Var2.f42510r = 17;
                u1Var2.f42511s = 18;
                u1Var2.f42512t = 19;
                u1Var2.P = i6.G6;
                u1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
