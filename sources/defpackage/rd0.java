package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class rd0 implements Runnable {
    public final byte a = 0;
    public final wd0 b;
    public final Runnable[] c;
    public final ip5 d;
    public final int e;
    public final tnd[] f;

    public rd0(wd0 wd0Var, ip5 ip5Var, Runnable[] runnableArr, int i, tnd[] tndVarArr) {
        this.b = wd0Var;
        this.d = ip5Var;
        this.c = runnableArr;
        this.e = i;
        this.f = tndVarArr;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                wd0 wd0Var = this.b;
                ip5 ip5Var = this.d;
                Runnable[] runnableArr = this.c;
                int i = this.e;
                tnd[] tndVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = wd0Var.getOrientation();
                    int[] iArr = wd0Var.a;
                    int i2 = ip5Var.a;
                    int i3 = ip5Var.b;
                    Rect d = wd0.d(orientation, i2, i3);
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, d.left, d.top, d.right, d.bottom);
                    gl.c3(new jf(wd0Var, runnableArr, createBitmap, ip5Var, i, tndVarArr, (byte) 2));
                    return;
                } catch (Throwable th) {
                    gl.c3(new rd0(wd0Var, runnableArr, ip5Var, i, tndVarArr));
                    throw th;
                }
            default:
                this.b.e(this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public rd0(wd0 wd0Var, Runnable[] runnableArr, ip5 ip5Var, int i, tnd[] tndVarArr) {
        this.b = wd0Var;
        this.c = runnableArr;
        this.d = ip5Var;
        this.e = i;
        this.f = tndVarArr;
    }
}
