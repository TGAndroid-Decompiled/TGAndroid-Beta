package bi;

import android.view.ViewGroup;
public final class w0 implements Runnable {
    public final int f3814a;
    public final x0 f3815b;

    public w0(x0 x0Var, int i10) {
        this.f3814a = i10;
        this.f3815b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f3814a) {
            case 0:
                x0 x0Var = this.f3815b;
                if (x0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            default:
                this.f3815b.a();
                return;
        }
    }
}
