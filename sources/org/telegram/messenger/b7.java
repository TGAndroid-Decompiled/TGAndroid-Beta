package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f22668a;
    public final h7 f22669b;

    public b7(h7 h7Var, int i7) {
        this.f22668a = i7;
        this.f22669b = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f22668a) {
            case 0:
                Runnable runnable = this.f22669b.f24069l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f22669b.f24069l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
