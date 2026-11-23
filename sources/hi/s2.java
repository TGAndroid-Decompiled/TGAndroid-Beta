package hi;
public final class s2 implements Runnable {
    public final int f15372a;
    public final w2 f15373b;
    public final c7 f15374c;

    public s2(w2 w2Var, c7 c7Var, int i7) {
        this.f15372a = i7;
        this.f15373b = w2Var;
        this.f15374c = c7Var;
    }

    @Override
    public final void run() {
        switch (this.f15372a) {
            case 0:
                w2 w2Var = this.f15373b;
                w2Var.getClass();
                org.telegram.messenger.g0.h3(new s2(w2Var, this.f15374c, 1), 320L);
                return;
            default:
                w2 w2Var2 = this.f15373b;
                w2Var2.getClass();
                this.f15374c.a(new ai.d0(w2Var2, 24));
                return;
        }
    }
}
