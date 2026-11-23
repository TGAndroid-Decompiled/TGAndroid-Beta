package hi;
public final class m4 implements Runnable {
    public final int f14908a;
    public final pa f14909b;

    public m4(pa paVar, int i7) {
        this.f14908a = i7;
        this.f14909b = paVar;
    }

    @Override
    public final void run() {
        switch (this.f14908a) {
            case 0:
                j5 j5Var = this.f14909b.Y1;
                if (j5Var != null) {
                    j5Var.O0();
                    return;
                }
                return;
            default:
                this.f14909b.f15198o2.f15105q1.setVisibility(8);
                return;
        }
    }
}
