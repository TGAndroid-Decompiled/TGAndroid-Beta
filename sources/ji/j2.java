package ji;
public final class j2 implements Runnable {
    public final int f13351a;
    public final x3 f13352b;
    public final int f13353c;

    public j2(x3 x3Var, int i10, int i11) {
        this.f13351a = i11;
        this.f13352b = x3Var;
        this.f13353c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13351a) {
            case 0:
                this.f13352b.e4(this.f13353c);
                return;
            case 1:
                this.f13352b.g4(this.f13353c);
                return;
            case 2:
                this.f13352b.scrollBy(0, this.f13353c);
                return;
            default:
                this.f13352b.f4(this.f13353c);
                return;
        }
    }
}
