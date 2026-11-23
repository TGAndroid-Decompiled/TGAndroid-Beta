package hi;

import org.telegram.ui.Components.kr;
public final class o6 implements Runnable {
    public final int f15157a;
    public final s6 f15158b;

    public o6(s6 s6Var, int i7) {
        this.f15157a = i7;
        this.f15158b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f15157a) {
            case 0:
                this.f15158b.c();
                return;
            default:
                s6 s6Var = this.f15158b;
                s6Var.f15386a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(kr.h).setDuration(280L).start();
                s6Var.f15388c = System.currentTimeMillis();
                s6Var.invalidate();
                try {
                    s6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(s6Var.h, 59500L);
                return;
        }
    }
}
