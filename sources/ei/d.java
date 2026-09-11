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
    public Paint[] f9124n;
    public final int f9125r;
    public final int f9126s;

    public d(Context context, int i10, int i11) {
        super(context);
        this.f9125r = i10;
        this.f9126s = i11;
        b();
    }

    @Override
    public final void a() {
        y1 y1Var = new y1(this.f9125r);
        this.f46376a = y1Var;
        y1Var.N = 106;
        int i10 = 0;
        y1Var.M = false;
        y1Var.G = false;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.J = false;
        y1Var.f46354m = true;
        y1Var.h = true;
        if (this.f9126s == 1) {
            y1Var.f46352k = AndroidUtilities.dp(24.0f);
        }
        this.f9124n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f9124n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f9124n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f9124n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                y1 y1Var2 = this.f46376a;
                y1Var2.f46353l = new a8(this, 1);
                y1Var2.f46359r = 17;
                y1Var2.f46360s = 18;
                y1Var2.f46361t = 19;
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
