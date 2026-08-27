package hh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

public final class m9 extends ag.k3 {

    public Paint[] f9761n;

    public final int f9762r;

    public final int f9763s;

    public m9(Context context, int i10, int i11) {
        super(context);
        this.f9762r = i10;
        this.f9763s = i11;
        b();
    }

    @Override
    public final void a() {
        ag.j3 j3Var = new ag.j3(this.f9762r);
        this.f540a = j3Var;
        j3Var.N = 105;
        int i10 = 0;
        j3Var.M = false;
        j3Var.G = false;
        j3Var.K = true;
        j3Var.H = true;
        j3Var.J = false;
        j3Var.f509m = true;
        j3Var.h = true;
        if (this.f9763s == 1) {
            j3Var.f507k = AndroidUtilities.dp(24.0f);
        }
        this.f9761n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f9761n;
            if (i10 >= paintArr.length) {
                ag.j3 j3Var2 = this.f540a;
                j3Var2.f508l = new eg.o(this, 1);
                j3Var2.f514r = 17;
                j3Var2.f515s = 18;
                j3Var2.f516t = 19;
                j3Var2.P = org.telegram.ui.ActionBar.g6.G6;
                j3Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.f9761n[i10].setColorFilter(new PorterDuffColorFilter(i0.b.d(i10 / (this.f9761n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
