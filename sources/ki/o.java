package ki;
public final class o implements Runnable {
    public final int f15061a;
    public final r f15062b;

    public o(r rVar, int i10) {
        this.f15061a = i10;
        this.f15062b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f15061a) {
            case 0:
                this.f15062b.b();
                return;
            default:
                r rVar = this.f15062b;
                if (rVar.G != 0) {
                    rVar.F = true;
                    return;
                }
                return;
        }
    }
}
