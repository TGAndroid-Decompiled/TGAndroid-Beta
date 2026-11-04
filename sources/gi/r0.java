package gi;

import android.view.ViewGroup;
public final class r0 implements Runnable {
    public final int f13483a;
    public final s0 f13484b;

    public r0(s0 s0Var, int i3) {
        this.f13483a = i3;
        this.f13484b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f13483a) {
            case 0:
                s0 s0Var = this.f13484b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    return;
                }
                return;
            default:
                this.f13484b.a();
                return;
        }
    }
}
