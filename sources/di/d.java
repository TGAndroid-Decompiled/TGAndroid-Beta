package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import rg.u1;
import rg.v1;
public final class d extends v1 {
    public Paint[] f7735n;
    public final int f7736r;
    public final int f7737s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f7736r = i10;
        this.f7737s = i11;
        b();
    }

    @Override
    public final void a() {
        u1 u1Var = new u1(this.f7736r);
        this.f42473a = u1Var;
        u1Var.N = 106;
        int i10 = 0;
        u1Var.M = false;
        u1Var.G = false;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.J = false;
        u1Var.f42456m = true;
        u1Var.h = true;
        if (this.f7737s == 1) {
            u1Var.f42454k = AndroidUtilities.dp(24.0f);
        }
        this.f7735n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f7735n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f7735n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f7735n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                u1 u1Var2 = this.f42473a;
                u1Var2.f42455l = new x7(this, 1);
                u1Var2.f42461r = 17;
                u1Var2.f42462s = 18;
                u1Var2.f42463t = 19;
                u1Var2.P = h6.G6;
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
