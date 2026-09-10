package bi;
public final class ra implements Runnable {
    public final int f3611a;
    public final rb f3612b;

    public ra(rb rbVar, int i10) {
        this.f3611a = i10;
        this.f3612b = rbVar;
    }

    @Override
    public final void run() {
        switch (this.f3611a) {
            case 0:
                this.f3612b.dismiss();
                return;
            case 1:
                this.f3612b.onBackPressed();
                return;
            default:
                this.f3612b.dismiss();
                return;
        }
    }
}
