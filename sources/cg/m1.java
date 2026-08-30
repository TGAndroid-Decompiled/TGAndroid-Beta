package cg;

import android.os.Looper;
public final class m1 implements Runnable {
    public final int f2470a;
    public final n1 f2471b;

    public m1(n1 n1Var, int i10) {
        this.f2470a = i10;
        this.f2471b = n1Var;
    }

    @Override
    public final void run() {
        switch (this.f2470a) {
            case 0:
                n1 n1Var = this.f2471b;
                androidx.activity.i iVar = n1Var.f2483w;
                m1 m1Var = n1Var.f2482s;
                if (m1Var != null) {
                    n1Var.cancelRunnable(m1Var);
                    n1Var.f2482s = null;
                }
                n1Var.cancelRunnable(iVar);
                n1Var.postRunnable(iVar);
                return;
            case 1:
                n1 n1Var2 = this.f2471b;
                n1Var2.f2482s = null;
                n1Var2.f2483w.run();
                return;
            default:
                this.f2471b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
