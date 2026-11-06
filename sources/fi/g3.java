package fi;
public final class g3 implements Runnable {
    public final int f12063a;
    public final j3 f12064b;

    public g3(j3 j3Var, int i7) {
        this.f12063a = i7;
        this.f12064b = j3Var;
    }

    @Override
    public final void run() {
        switch (this.f12063a) {
            case 0:
                this.f12064b.dismiss();
                return;
            default:
                j3.I0(this.f12064b);
                return;
        }
    }
}
