package org.telegram.messenger;
public final class f7 implements Runnable {
    public final int f15704a;
    public final l7 f15705b;

    public f7(l7 l7Var, int i10) {
        this.f15704a = i10;
        this.f15705b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f15704a) {
            case 0:
                Runnable runnable = this.f15705b.f16910l;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f15705b.f16910l;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
