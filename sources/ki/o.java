package ki;
public final class o implements Runnable {
    public final int f15064a;
    public final r f15065b;

    public o(r rVar, int i10) {
        this.f15064a = i10;
        this.f15065b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f15064a) {
            case 0:
                this.f15065b.b();
                return;
            default:
                r rVar = this.f15065b;
                if (rVar.G != 0) {
                    rVar.F = true;
                    return;
                }
                return;
        }
    }
}
