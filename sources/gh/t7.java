package gh;
public final class t7 implements Runnable {
    public final int f8920a;
    public final u7 f8921b;
    public final long f8922c;

    public t7(u7 u7Var, long j10, int i9) {
        this.f8920a = i9;
        this.f8921b = u7Var;
        this.f8922c = j10;
    }

    @Override
    public final void run() {
        switch (this.f8920a) {
            case 0:
                u7 u7Var = this.f8921b;
                u7Var.f8977q.d0(u7Var.f8964b, u7Var.f8965c, this.f8922c, true, true, u7Var.f8974n);
                return;
            default:
                u7 u7Var2 = this.f8921b;
                u7Var2.f8977q.d0(u7Var2.f8964b, u7Var2.f8965c, this.f8922c, true, true, u7Var2.f8974n);
                return;
        }
    }
}
