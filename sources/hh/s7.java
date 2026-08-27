package hh;

public final class s7 implements Runnable {

    public final int f10025a;

    public final t7 f10026b;

    public final long f10027c;

    public s7(t7 t7Var, long j10, int i10) {
        this.f10025a = i10;
        this.f10026b = t7Var;
        this.f10027c = j10;
    }

    @Override
    public final void run() {
        switch (this.f10025a) {
            case 0:
                t7 t7Var = this.f10026b;
                t7Var.f10100q.d0(t7Var.f10087b, t7Var.f10088c, this.f10027c, true, true, t7Var.f10097n);
                break;
            default:
                t7 t7Var2 = this.f10026b;
                t7Var2.f10100q.d0(t7Var2.f10087b, t7Var2.f10088c, this.f10027c, true, true, t7Var2.f10097n);
                break;
        }
    }
}
