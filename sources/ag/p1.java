package ag;

import android.os.Looper;
public final class p1 implements Runnable {
    public final int f629a;
    public final r1 f630b;

    public p1(r1 r1Var, int i10) {
        this.f629a = i10;
        this.f630b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f629a) {
            case 0:
                r1 r1Var = this.f630b;
                q1 q1Var = r1Var.f648w;
                p1 p1Var = r1Var.f647s;
                if (p1Var != null) {
                    r1Var.cancelRunnable(p1Var);
                    r1Var.f647s = null;
                }
                r1Var.cancelRunnable(q1Var);
                r1Var.postRunnable(q1Var);
                return;
            case 1:
                r1 r1Var2 = this.f630b;
                r1Var2.f647s = null;
                r1Var2.f648w.run();
                return;
            default:
                this.f630b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
        }
    }
}
