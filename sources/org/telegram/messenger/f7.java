package org.telegram.messenger;
public final class f7 implements Runnable {
    public final int f15520a;
    public final l7 f15521b;

    public f7(l7 l7Var, int i10) {
        this.f15520a = i10;
        this.f15521b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f15520a) {
            case 0:
                Runnable runnable = this.f15521b.f16713l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f15521b.f16713l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
