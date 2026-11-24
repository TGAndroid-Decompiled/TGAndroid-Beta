package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class re0 implements Runnable {
    public final byte a = 0;
    public final we0 b;
    public final Runnable[] c;
    public final ir5 d;
    public final int e;
    public final wpd[] f;

    public re0(we0 we0Var, ir5 ir5Var, Runnable[] runnableArr, int i, wpd[] wpdVarArr) {
        this.b = we0Var;
        this.d = ir5Var;
        this.c = runnableArr;
        this.e = i;
        this.f = wpdVarArr;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                we0 we0Var = this.b;
                ir5 ir5Var = this.d;
                Runnable[] runnableArr = this.c;
                int i = this.e;
                wpd[] wpdVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = we0Var.getOrientation();
                    int[] iArr = we0Var.a;
                    int i2 = ir5Var.a;
                    int i3 = ir5Var.b;
                    Rect d = we0.d(orientation, i2, i3);
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, d.left, d.top, d.right, d.bottom);
                    gm.c3(new jg(we0Var, runnableArr, createBitmap, ir5Var, i, wpdVarArr, (byte) 2));
                    return;
                } catch (Throwable th) {
                    gm.c3(new re0(we0Var, runnableArr, ir5Var, i, wpdVarArr));
                    throw th;
                }
            default:
                this.b.e(this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public re0(we0 we0Var, Runnable[] runnableArr, ir5 ir5Var, int i, wpd[] wpdVarArr) {
        this.b = we0Var;
        this.c = runnableArr;
        this.d = ir5Var;
        this.e = i;
        this.f = wpdVarArr;
    }
}
