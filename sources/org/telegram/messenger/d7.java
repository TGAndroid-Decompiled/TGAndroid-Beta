package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f15305a;
    public final m7 f15306b;
    public final int f15307c;

    public d7(m7 m7Var, int i10, int i11) {
        this.f15305a = i11;
        this.f15306b = m7Var;
        this.f15307c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15305a) {
            case 0:
                this.f15306b.F0.add(Integer.valueOf(this.f15307c));
                return;
            case 1:
                this.f15306b.F0.remove(Integer.valueOf(this.f15307c));
                return;
            case 2:
                this.f15306b.F0.remove(Integer.valueOf(this.f15307c));
                return;
            default:
                m7 m7Var = this.f15306b;
                z7 z7Var = m7Var.f17059g0;
                if (z7Var != null) {
                    z7Var.b(m7Var, this.f15307c);
                }
                m7Var.i();
                return;
        }
    }
}
