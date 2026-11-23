package bi;
public final class d8 implements Runnable {
    public final int f3470a;
    public final k8 f3471b;

    public d8(k8 k8Var, int i7) {
        this.f3470a = i7;
        this.f3471b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f3470a) {
            case 0:
                a8 a8Var = this.f3471b.f3766c;
                if (!a8Var.f3368j.isEmpty()) {
                    a8Var.f3368j.clear();
                    a8Var.m();
                    return;
                }
                return;
            case 1:
                a8 a8Var2 = this.f3471b.f3766c;
                if (!a8Var2.f3369k.isEmpty()) {
                    a8Var2.f3369k.clear();
                    a8Var2.m();
                    return;
                }
                return;
            case 2:
                a8 a8Var3 = this.f3471b.f3766c;
                if (!a8Var3.f3370l.isEmpty()) {
                    a8Var3.f3370l.clear();
                    a8Var3.m();
                    return;
                }
                return;
            case 3:
                this.f3471b.f3766c.p(z7.f4308a);
                return;
            case 4:
                this.f3471b.f3766c.p(z7.f4309b);
                return;
            default:
                this.f3471b.f3766c.p(z7.f4310c);
                return;
        }
    }
}
