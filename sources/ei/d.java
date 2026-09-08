package ei;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import di.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import sg.y1;
import sg.z1;
public final class d extends z1 {
    public Paint[] f9152n;
    public final int f9153r;
    public final int f9154s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f9153r = i10;
        this.f9154s = i11;
        b();
    }

    @Override
    public final void a() {
        y1 y1Var = new y1(this.f9153r);
        this.f46404a = y1Var;
        y1Var.N = 106;
        int i10 = 0;
        y1Var.M = false;
        y1Var.G = false;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.J = false;
        y1Var.f46382m = true;
        y1Var.h = true;
        if (this.f9154s == 1) {
            y1Var.f46380k = AndroidUtilities.dp(24.0f);
        }
        this.f9152n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f9152n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f9152n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f9152n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                y1 y1Var2 = this.f46404a;
                y1Var2.f46381l = new a8(this, 1);
                y1Var2.f46387r = 17;
                y1Var2.f46388s = 18;
                y1Var2.f46389t = 19;
                y1Var2.P = j6.G6;
                y1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
