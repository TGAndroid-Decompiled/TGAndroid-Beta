package gg;
public final class s implements Runnable {
    public final int f6729a;
    public final x f6730b;

    public s(x xVar, int i10) {
        this.f6729a = i10;
        this.f6730b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f6729a) {
            case 0:
                this.f6730b.dismiss();
                return;
            default:
                this.f6730b.onBackPressed();
                return;
        }
    }
}
