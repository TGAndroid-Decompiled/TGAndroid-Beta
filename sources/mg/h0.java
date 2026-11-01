package mg;
public final class h0 implements Runnable {
    public final int f13127a;
    public final o0 f13128b;

    public h0(o0 o0Var, int i10) {
        this.f13127a = i10;
        this.f13128b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f13127a) {
            case 0:
                org.telegram.messenger.i0.g3(new h0(this.f13128b, 1));
                return;
            default:
                this.f13128b.a(null);
                return;
        }
    }
}
