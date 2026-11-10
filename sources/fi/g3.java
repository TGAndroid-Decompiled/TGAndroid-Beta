package fi;
public final class g3 implements Runnable {
    public final int f12067a;
    public final j3 f12068b;

    public g3(j3 j3Var, int i7) {
        this.f12067a = i7;
        this.f12068b = j3Var;
    }

    @Override
    public final void run() {
        switch (this.f12067a) {
            case 0:
                this.f12068b.dismiss();
                return;
            default:
                j3.I0(this.f12068b);
                return;
        }
    }
}
