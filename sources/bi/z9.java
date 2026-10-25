package bi;
public final class z9 implements Runnable {
    public final int f5859a;
    public final aa f5860b;
    public final long f5861c;

    public z9(aa aaVar, long j10, int i10) {
        this.f5859a = i10;
        this.f5860b = aaVar;
        this.f5861c = j10;
    }

    @Override
    public final void run() {
        switch (this.f5859a) {
            case 0:
                aa aaVar = this.f5860b;
                aaVar.f4283q.d0(aaVar.f4271b, aaVar.f4272c, this.f5861c, true, true, aaVar.f4280n);
                return;
            default:
                aa aaVar2 = this.f5860b;
                aaVar2.f4283q.d0(aaVar2.f4271b, aaVar2.f4272c, this.f5861c, true, true, aaVar2.f4280n);
                return;
        }
    }
}
