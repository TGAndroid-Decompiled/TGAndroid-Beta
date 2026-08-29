package eg;
public final class t implements Runnable {
    public final int f6126a;
    public final y f6127b;

    public t(y yVar, int i10) {
        this.f6126a = i10;
        this.f6127b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f6126a) {
            case 0:
                this.f6127b.dismiss();
                return;
            default:
                this.f6127b.onBackPressed();
                return;
        }
    }
}
