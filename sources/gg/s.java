package gg;
public final class s implements Runnable {
    public final int f6742a;
    public final x f6743b;

    public s(x xVar, int i10) {
        this.f6742a = i10;
        this.f6743b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f6742a) {
            case 0:
                this.f6743b.dismiss();
                return;
            default:
                this.f6743b.onBackPressed();
                return;
        }
    }
}
