package ig;

import android.os.Looper;
public final class z0 implements Runnable {
    public final int f8513a;
    public final a1 f8514b;

    public z0(a1 a1Var, int i10) {
        this.f8513a = i10;
        this.f8514b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f8513a) {
            case 0:
                a1 a1Var = this.f8514b;
                androidx.activity.i iVar = a1Var.f8276x;
                z0 z0Var = a1Var.f8274s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.f8274s = null;
                }
                a1Var.cancelRunnable(iVar);
                a1Var.postRunnable(iVar);
                return;
            case 1:
                a1 a1Var2 = this.f8514b;
                a1Var2.f8274s = null;
                a1Var2.f8276x.run();
                return;
            default:
                this.f8514b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
