package cg;

import android.os.Looper;
public final class m1 implements Runnable {
    public final int f2453a;
    public final n1 f2454b;

    public m1(n1 n1Var, int i10) {
        this.f2453a = i10;
        this.f2454b = n1Var;
    }

    @Override
    public final void run() {
        switch (this.f2453a) {
            case 0:
                n1 n1Var = this.f2454b;
                androidx.activity.i iVar = n1Var.f2466w;
                m1 m1Var = n1Var.f2465s;
                if (m1Var != null) {
                    n1Var.cancelRunnable(m1Var);
                    n1Var.f2465s = null;
                }
                n1Var.cancelRunnable(iVar);
                n1Var.postRunnable(iVar);
                return;
            case 1:
                n1 n1Var2 = this.f2454b;
                n1Var2.f2465s = null;
                n1Var2.f2466w.run();
                return;
            default:
                this.f2454b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
