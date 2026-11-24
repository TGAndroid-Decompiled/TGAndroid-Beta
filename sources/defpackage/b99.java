package defpackage;

import android.os.Looper;
public final class b99 implements Runnable {
    public final byte a;
    public final c99 b;

    public b99(c99 c99Var, byte b) {
        this.a = b;
        this.b = c99Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c99 c99Var = this.b;
        switch (b) {
            case 0:
                ei7 ei7Var = c99Var.x;
                b99 b99Var = c99Var.s;
                if (b99Var != null) {
                    c99Var.cancelRunnable(b99Var);
                    c99Var.s = null;
                }
                c99Var.cancelRunnable(ei7Var);
                c99Var.postRunnable(ei7Var);
                return;
            case 1:
                c99Var.s = null;
                c99Var.x.run();
                return;
            default:
                c99Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
