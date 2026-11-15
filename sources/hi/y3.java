package hi;
public final class y3 implements Runnable {
    public final int f15416a;
    public final m5 f15417b;
    public final tg.r1 f15418c;

    public y3(m5 m5Var, tg.r1 r1Var, int i7) {
        this.f15416a = i7;
        this.f15417b = m5Var;
        this.f15418c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f15416a) {
            case 0:
                this.f15417b.A0(this.f15418c, true);
                return;
            default:
                this.f15417b.z0(this.f15418c);
                return;
        }
    }
}
