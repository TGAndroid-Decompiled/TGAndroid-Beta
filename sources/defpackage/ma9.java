package defpackage;

import android.os.Looper;
public final class ma9 implements Runnable {
    public final byte a;
    public final na9 b;

    public ma9(na9 na9Var, byte b) {
        this.a = b;
        this.b = na9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        na9 na9Var = this.b;
        switch (b) {
            case 0:
                ki7 ki7Var = na9Var.x;
                ma9 ma9Var = na9Var.s;
                if (ma9Var != null) {
                    na9Var.cancelRunnable(ma9Var);
                    na9Var.s = null;
                }
                na9Var.cancelRunnable(ki7Var);
                na9Var.postRunnable(ki7Var);
                return;
            case 1:
                na9Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            default:
                na9Var.s = null;
                na9Var.x.run();
                return;
        }
    }
}
