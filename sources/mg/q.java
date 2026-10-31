package mg;
public final class q implements Runnable {
    public final int f13207a;
    public final v f13208b;

    public q(v vVar, int i10) {
        this.f13207a = i10;
        this.f13208b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f13207a) {
            case 0:
                this.f13208b.dismiss();
                return;
            default:
                this.f13208b.onBackPressed();
                return;
        }
    }
}
