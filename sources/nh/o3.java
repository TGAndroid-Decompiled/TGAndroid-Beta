package nh;
public final class o3 implements Runnable {
    public final int f18212a;
    public final r3 f18213b;

    public o3(r3 r3Var, int i10) {
        this.f18212a = i10;
        this.f18213b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f18212a) {
            case 0:
                this.f18213b.dismiss();
                return;
            default:
                r3.m(this.f18213b);
                return;
        }
    }
}
