package ki;
public final class o implements Runnable {
    public final int f15065a;
    public final r f15066b;

    public o(r rVar, int i10) {
        this.f15065a = i10;
        this.f15066b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f15065a) {
            case 0:
                this.f15066b.b();
                return;
            default:
                r rVar = this.f15066b;
                if (rVar.G != 0) {
                    rVar.F = true;
                    return;
                }
                return;
        }
    }
}
