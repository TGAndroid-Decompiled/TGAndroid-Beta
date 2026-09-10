package og;

import android.os.Looper;
public final class e1 implements Runnable {
    public final int f14348a;
    public final f1 f14349b;

    public e1(f1 f1Var, int i10) {
        this.f14348a = i10;
        this.f14349b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f14348a) {
            case 0:
                f1 f1Var = this.f14349b;
                androidx.activity.i iVar = f1Var.f14361w;
                e1 e1Var = f1Var.f14360s;
                if (e1Var != null) {
                    f1Var.cancelRunnable(e1Var);
                    f1Var.f14360s = null;
                }
                f1Var.cancelRunnable(iVar);
                f1Var.postRunnable(iVar);
                return;
            case 1:
                f1 f1Var2 = this.f14349b;
                f1Var2.f14360s = null;
                f1Var2.f14361w.run();
                return;
            default:
                this.f14349b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
