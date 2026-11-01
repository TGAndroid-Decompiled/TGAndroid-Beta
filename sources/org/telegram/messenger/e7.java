package org.telegram.messenger;
public final class e7 implements Runnable {
    public final int f15543a;
    public final m7 f15544b;
    public final l7 f15545c;

    public e7(m7 m7Var, l7 l7Var, int i10) {
        this.f15543a = i10;
        this.f15544b = m7Var;
        this.f15545c = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f15543a) {
            case 0:
                m7 m7Var = this.f15544b;
                m7Var.getClass();
                l7 l7Var = this.f15545c;
                l7Var.f16910l = null;
                m7Var.H0.remove(l7Var);
                l7Var.f16909k = true;
                return;
            default:
                m7 m7Var2 = this.f15544b;
                l7 l7Var2 = this.f15545c;
                m7Var2.m(l7Var2, null);
                l7Var2.f16905f.freeResources();
                return;
        }
    }
}
