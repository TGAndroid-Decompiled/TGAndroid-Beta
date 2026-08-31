package dg;

import android.os.Looper;
public final class l1 implements Runnable {
    public final int f4579a;
    public final m1 f4580b;

    public l1(m1 m1Var, int i10) {
        this.f4579a = i10;
        this.f4580b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f4579a) {
            case 0:
                m1 m1Var = this.f4580b;
                androidx.activity.i iVar = m1Var.f4613w;
                l1 l1Var = m1Var.f4612s;
                if (l1Var != null) {
                    m1Var.cancelRunnable(l1Var);
                    m1Var.f4612s = null;
                }
                m1Var.cancelRunnable(iVar);
                m1Var.postRunnable(iVar);
                return;
            case 1:
                m1 m1Var2 = this.f4580b;
                m1Var2.f4612s = null;
                m1Var2.f4613w.run();
                return;
            default:
                this.f4580b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
