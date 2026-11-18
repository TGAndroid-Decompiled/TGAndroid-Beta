package bi;
public final class y7 implements Runnable {
    public final int f4286a;
    public final f8 f4287b;

    public y7(f8 f8Var, int i7) {
        this.f4286a = i7;
        this.f4287b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f4286a) {
            case 0:
                v7 v7Var = this.f4287b.f3617c;
                if (!v7Var.f4152j.isEmpty()) {
                    v7Var.f4152j.clear();
                    v7Var.m();
                    return;
                }
                return;
            case 1:
                v7 v7Var2 = this.f4287b.f3617c;
                if (!v7Var2.f4153k.isEmpty()) {
                    v7Var2.f4153k.clear();
                    v7Var2.m();
                    return;
                }
                return;
            case 2:
                v7 v7Var3 = this.f4287b.f3617c;
                if (!v7Var3.f4154l.isEmpty()) {
                    v7Var3.f4154l.clear();
                    v7Var3.m();
                    return;
                }
                return;
            case 3:
                this.f4287b.f3617c.p(u7.f4121a);
                return;
            case 4:
                this.f4287b.f3617c.p(u7.f4122b);
                return;
            default:
                this.f4287b.f3617c.p(u7.f4123c);
                return;
        }
    }
}
