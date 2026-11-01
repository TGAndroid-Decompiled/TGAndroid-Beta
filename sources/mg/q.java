package mg;
public final class q implements Runnable {
    public final int f13208a;
    public final v f13209b;

    public q(v vVar, int i10) {
        this.f13208a = i10;
        this.f13209b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f13208a) {
            case 0:
                this.f13209b.dismiss();
                return;
            default:
                this.f13209b.onBackPressed();
                return;
        }
    }
}
