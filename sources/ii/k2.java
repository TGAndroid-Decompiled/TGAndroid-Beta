package ii;
public final class k2 implements Runnable {
    public final int f12486a;
    public final x3 f12487b;
    public final int f12488c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f12486a = i11;
        this.f12487b = x3Var;
        this.f12488c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12486a) {
            case 0:
                this.f12487b.f4(this.f12488c);
                return;
            case 1:
                this.f12487b.h4(this.f12488c);
                return;
            case 2:
                this.f12487b.scrollBy(0, this.f12488c);
                return;
            default:
                this.f12487b.g4(this.f12488c);
                return;
        }
    }
}
