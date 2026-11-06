package bi;
public final class ba implements Runnable {
    public final int f3522a;
    public final ca f3523b;
    public final long f3524c;

    public ba(ca caVar, long j3, int i7) {
        this.f3522a = i7;
        this.f3523b = caVar;
        this.f3524c = j3;
    }

    @Override
    public final void run() {
        switch (this.f3522a) {
            case 0:
                ca caVar = this.f3523b;
                caVar.f3601q.b0(caVar.f3588b, caVar.f3589c, this.f3524c, true, true, caVar.f3598n);
                return;
            default:
                ca caVar2 = this.f3523b;
                caVar2.f3601q.b0(caVar2.f3588b, caVar2.f3589c, this.f3524c, true, true, caVar2.f3598n);
                return;
        }
    }
}
