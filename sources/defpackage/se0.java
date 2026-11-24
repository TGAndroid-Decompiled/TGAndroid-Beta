package defpackage;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class se0 implements ve0 {
    public final we0 a;
    public final wpd[] b;
    public final Runnable[] c;
    public final ir5[] d;

    public se0(we0 we0Var, wpd[] wpdVarArr, Runnable[] runnableArr, ir5[] ir5VarArr) {
        this.a = we0Var;
        this.b = wpdVarArr;
        this.c = runnableArr;
        this.d = ir5VarArr;
    }

    @Override
    public final void dispose() {
        we0 we0Var = this.a;
        wpd[] wpdVarArr = this.b;
        Runnable[] runnableArr = this.c;
        ir5[] ir5VarArr = this.d;
        wpdVarArr[0] = null;
        if (we0Var.e.contains(runnableArr)) {
            mp3 mp3Var = Utilities.e;
            mp3Var.getClass();
            for (Runnable runnable : runnableArr) {
                mp3Var.a(runnable);
            }
            we0Var.e.remove(runnableArr);
        }
        for (ir5 ir5Var : ir5VarArr) {
            Bitmap bitmap = (Bitmap) we0Var.b.remove(ir5Var);
            we0Var.c.remove(ir5Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
