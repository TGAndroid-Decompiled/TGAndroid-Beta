package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class td0 implements Runnable {
    public final byte a = 0;
    public final yd0 b;
    public final Runnable[] c;
    public final lr5 d;
    public final int e;
    public final ksd[] f;

    public td0(yd0 yd0Var, lr5 lr5Var, Runnable[] runnableArr, int i, ksd[] ksdVarArr) {
        this.b = yd0Var;
        this.d = lr5Var;
        this.c = runnableArr;
        this.e = i;
        this.f = ksdVarArr;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                yd0 yd0Var = this.b;
                lr5 lr5Var = this.d;
                Runnable[] runnableArr = this.c;
                int i = this.e;
                ksd[] ksdVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = yd0Var.getOrientation();
                    int[] iArr = yd0Var.a;
                    int i2 = lr5Var.a;
                    int i3 = lr5Var.b;
                    Rect d = yd0.d(orientation, i2, i3);
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, d.left, d.top, d.right, d.bottom);
                    hl.c3(new te(yd0Var, runnableArr, createBitmap, lr5Var, i, ksdVarArr, (byte) 2));
                    return;
                } catch (Throwable th) {
                    hl.c3(new td0(yd0Var, runnableArr, lr5Var, i, ksdVarArr));
                    throw th;
                }
            default:
                this.b.e(this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public td0(yd0 yd0Var, Runnable[] runnableArr, lr5 lr5Var, int i, ksd[] ksdVarArr) {
        this.b = yd0Var;
        this.c = runnableArr;
        this.d = lr5Var;
        this.e = i;
        this.f = ksdVarArr;
    }
}
