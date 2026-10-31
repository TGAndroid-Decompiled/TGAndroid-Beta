package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f15190a;
    public final m7 f15191b;
    public final int f15192c;

    public d7(m7 m7Var, int i10, int i11) {
        this.f15190a = i11;
        this.f15191b = m7Var;
        this.f15192c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15190a) {
            case 0:
                this.f15191b.F0.add(Integer.valueOf(this.f15192c));
                return;
            case 1:
                this.f15191b.F0.remove(Integer.valueOf(this.f15192c));
                return;
            case 2:
                this.f15191b.F0.remove(Integer.valueOf(this.f15192c));
                return;
            default:
                m7 m7Var = this.f15191b;
                z7 z7Var = m7Var.f16889g0;
                if (z7Var != null) {
                    z7Var.b(m7Var, this.f15192c);
                }
                m7Var.i();
                return;
        }
    }
}
