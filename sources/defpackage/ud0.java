package defpackage;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class ud0 implements xd0 {
    public final yd0 a;
    public final ksd[] b;
    public final Runnable[] c;
    public final lr5[] d;

    public ud0(yd0 yd0Var, ksd[] ksdVarArr, Runnable[] runnableArr, lr5[] lr5VarArr) {
        this.a = yd0Var;
        this.b = ksdVarArr;
        this.c = runnableArr;
        this.d = lr5VarArr;
    }

    @Override
    public final void dispose() {
        yd0 yd0Var = this.a;
        ksd[] ksdVarArr = this.b;
        Runnable[] runnableArr = this.c;
        lr5[] lr5VarArr = this.d;
        ksdVarArr[0] = null;
        if (yd0Var.e.contains(runnableArr)) {
            to3 to3Var = Utilities.e;
            to3Var.getClass();
            for (Runnable runnable : runnableArr) {
                to3Var.a(runnable);
            }
            yd0Var.e.remove(runnableArr);
        }
        for (lr5 lr5Var : lr5VarArr) {
            Bitmap bitmap = (Bitmap) yd0Var.b.remove(lr5Var);
            yd0Var.c.remove(lr5Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
