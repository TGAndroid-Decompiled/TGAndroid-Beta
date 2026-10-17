package ei;
public final class r3 implements Runnable {
    public final int f9703a;
    public final u3 f9704b;

    public r3(u3 u3Var, int i10) {
        this.f9703a = i10;
        this.f9704b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f9703a) {
            case 0:
                this.f9704b.dismiss();
                return;
            default:
                u3.n(this.f9704b);
                return;
        }
    }
}
