package defpackage;

import android.os.Looper;
public final class z69 implements Runnable {
    public final byte a;
    public final a79 b;

    public z69(a79 a79Var, byte b) {
        this.a = b;
        this.b = a79Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a79 a79Var = this.b;
        switch (b) {
            case 0:
                bg7 bg7Var = a79Var.x;
                z69 z69Var = a79Var.s;
                if (z69Var != null) {
                    a79Var.cancelRunnable(z69Var);
                    a79Var.s = null;
                }
                a79Var.cancelRunnable(bg7Var);
                a79Var.postRunnable(bg7Var);
                return;
            case 1:
                a79Var.s = null;
                a79Var.x.run();
                return;
            default:
                a79Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
