package di;
public final class r8 implements Runnable {
    public final int f9335a;
    public final s8 f9336b;
    public final long f9337c;

    public r8(s8 s8Var, long j3, int i7) {
        this.f9335a = i7;
        this.f9336b = s8Var;
        this.f9337c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9335a) {
            case 0:
                s8 s8Var = this.f9336b;
                s8Var.f9403q.b0(s8Var.f9390b, s8Var.f9391c, this.f9337c, true, true, s8Var.f9400n);
                return;
            default:
                s8 s8Var2 = this.f9336b;
                s8Var2.f9403q.b0(s8Var2.f9390b, s8Var2.f9391c, this.f9337c, true, true, s8Var2.f9400n);
                return;
        }
    }
}
