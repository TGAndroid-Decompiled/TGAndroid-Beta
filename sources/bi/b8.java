package bi;
public final class b8 implements Runnable {
    public final int f3447a;
    public final i8 f3448b;

    public b8(i8 i8Var, int i7) {
        this.f3447a = i7;
        this.f3448b = i8Var;
    }

    @Override
    public final void run() {
        switch (this.f3447a) {
            case 0:
                this.f3448b.e1();
                return;
            default:
                i8 i8Var = this.f3448b;
                i8Var.f3737e2.O(true);
                org.telegram.messenger.g0.h3(new b8(i8Var, 0), 150L);
                return;
        }
    }
}
