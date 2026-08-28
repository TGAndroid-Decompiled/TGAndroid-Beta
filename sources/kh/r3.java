package kh;
public final class r3 implements Runnable {
    public final int f15923a;
    public final u3 f15924b;

    public r3(u3 u3Var, int i9) {
        this.f15923a = i9;
        this.f15924b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f15923a) {
            case 0:
                this.f15924b.dismiss();
                return;
            default:
                u3.m(this.f15924b);
                return;
        }
    }
}
