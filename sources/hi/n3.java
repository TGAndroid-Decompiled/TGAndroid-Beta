package hi;
public final class n3 implements Runnable {
    public final int f15006a;
    public final q3 f15007b;

    public n3(q3 q3Var, int i7) {
        this.f15006a = i7;
        this.f15007b = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f15006a) {
            case 0:
                this.f15007b.dismiss();
                return;
            default:
                q3.J0(this.f15007b);
                return;
        }
    }
}
