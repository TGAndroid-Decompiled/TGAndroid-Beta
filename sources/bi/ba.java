package bi;
public final class ba implements Runnable {
    public final int f3525a;
    public final ca f3526b;
    public final long f3527c;

    public ba(ca caVar, long j3, int i7) {
        this.f3525a = i7;
        this.f3526b = caVar;
        this.f3527c = j3;
    }

    @Override
    public final void run() {
        switch (this.f3525a) {
            case 0:
                ca caVar = this.f3526b;
                caVar.f3604q.b0(caVar.f3591b, caVar.f3592c, this.f3527c, true, true, caVar.f3601n);
                return;
            default:
                ca caVar2 = this.f3526b;
                caVar2.f3604q.b0(caVar2.f3591b, caVar2.f3592c, this.f3527c, true, true, caVar2.f3601n);
                return;
        }
    }
}
