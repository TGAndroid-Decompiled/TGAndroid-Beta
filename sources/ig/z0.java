package ig;

import android.os.Looper;
public final class z0 implements Runnable {
    public final int f8514a;
    public final a1 f8515b;

    public z0(a1 a1Var, int i10) {
        this.f8514a = i10;
        this.f8515b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f8514a) {
            case 0:
                a1 a1Var = this.f8515b;
                androidx.activity.i iVar = a1Var.f8277x;
                z0 z0Var = a1Var.f8275s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f8275s = null;
                }
                a1Var.cancelRunnable(iVar);
                a1Var.postRunnable(iVar);
                return;
            case 1:
                a1 a1Var2 = this.f8515b;
                a1Var2.f8275s = null;
                a1Var2.f8277x.run();
                return;
            default:
                this.f8515b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
