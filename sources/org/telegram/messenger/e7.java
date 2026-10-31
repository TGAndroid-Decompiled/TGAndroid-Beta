package org.telegram.messenger;
public final class e7 implements Runnable {
    public final int f15370a;
    public final m7 f15371b;
    public final l7 f15372c;

    public e7(m7 m7Var, l7 l7Var, int i10) {
        this.f15370a = i10;
        this.f15371b = m7Var;
        this.f15372c = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f15370a) {
            case 0:
                m7 m7Var = this.f15371b;
                m7Var.getClass();
                l7 l7Var = this.f15372c;
                l7Var.f16713l = null;
                m7Var.H0.remove(l7Var);
                l7Var.f16712k = true;
                return;
            default:
                m7 m7Var2 = this.f15371b;
                l7 l7Var2 = this.f15372c;
                m7Var2.m(l7Var2, null);
                l7Var2.f16708f.freeResources();
                return;
        }
    }
}
