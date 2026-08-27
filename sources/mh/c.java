package mh;

import ag.j3;
import ag.k3;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import eg.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public final class c extends k3 {

    public Paint[] f18059n;

    public final int f18060r;

    public final int f18061s;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f18060r = i10;
        this.f18061s = i11;
        b();
    }

    @Override
    public final void a() {
        j3 j3Var = new j3(this.f18060r);
        this.f540a = j3Var;
        j3Var.N = 106;
        int i10 = 0;
        j3Var.M = false;
        j3Var.G = false;
        j3Var.K = true;
        j3Var.H = true;
        j3Var.J = false;
        j3Var.f509m = true;
        j3Var.h = true;
        if (this.f18061s == 1) {
            j3Var.f507k = AndroidUtilities.dp(24.0f);
        }
        this.f18059n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f18059n;
            if (i10 >= paintArr.length) {
                j3 j3Var2 = this.f540a;
                j3Var2.f508l = new o(this, 3);
                j3Var2.f514r = 17;
                j3Var2.f515s = 18;
                j3Var2.f516t = 19;
                j3Var2.P = g6.G6;
                j3Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.f18059n[i10].setColorFilter(new PorterDuffColorFilter(i0.b.d(i10 / (this.f18059n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
