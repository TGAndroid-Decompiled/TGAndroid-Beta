package ei;
public final class r3 implements Runnable {
    public final int f9704a;
    public final u3 f9705b;

    public r3(u3 u3Var, int i10) {
        this.f9704a = i10;
        this.f9705b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f9704a) {
            case 0:
                this.f9705b.dismiss();
                return;
            default:
                u3.n(this.f9705b);
                return;
        }
    }
}
