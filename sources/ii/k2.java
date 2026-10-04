package ii;
public final class k2 implements Runnable {
    public final int f12487a;
    public final x3 f12488b;
    public final int f12489c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f12487a = i11;
        this.f12488b = x3Var;
        this.f12489c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12487a) {
            case 0:
                this.f12488b.f4(this.f12489c);
                return;
            case 1:
                this.f12488b.h4(this.f12489c);
                return;
            case 2:
                this.f12488b.scrollBy(0, this.f12489c);
                return;
            default:
                this.f12488b.g4(this.f12489c);
                return;
        }
    }
}
