package ki;
public final class c0 implements Runnable {
    public final int f13666a;
    public final r0 f13667b;
    public final Exception f13668c;

    public c0(r0 r0Var, Exception exc, int i10) {
        this.f13666a = i10;
        this.f13667b = r0Var;
        this.f13668c = exc;
    }

    @Override
    public final void run() {
        switch (this.f13666a) {
            case 0:
                this.f13667b.g(this.f13668c);
                return;
            case 1:
                this.f13667b.g(this.f13668c);
                return;
            case 2:
                this.f13667b.g(this.f13668c);
                return;
            default:
                this.f13667b.g(this.f13668c);
                return;
        }
    }
}
