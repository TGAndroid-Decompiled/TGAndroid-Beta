package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import ci.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import rg.x1;
import rg.y1;
public final class g extends y1 {
    public Paint[] f8372n;
    public final int f8373r;
    public final int f8374s;

    public g(Context context, int i10, int i11) {
        super(context);
        this.f8373r = i10;
        this.f8374s = i11;
        b();
    }

    @Override
    public final void a() {
        x1 x1Var = new x1(this.f8373r);
        this.f46400a = x1Var;
        x1Var.N = 106;
        int i10 = 0;
        x1Var.M = false;
        x1Var.G = false;
        x1Var.K = true;
        x1Var.H = true;
        x1Var.J = false;
        x1Var.f46375m = true;
        x1Var.h = true;
        if (this.f8374s == 1) {
            x1Var.f46373k = AndroidUtilities.dp(24.0f);
        }
        this.f8372n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f8372n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f8372n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f8372n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                x1 x1Var2 = this.f46400a;
                x1Var2.f46374l = new y7(this, 1);
                x1Var2.f46380r = 17;
                x1Var2.f46381s = 18;
                x1Var2.f46382t = 19;
                x1Var2.P = i6.G6;
                x1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
