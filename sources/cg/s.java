package cg;

public final class s implements Runnable {

    public final int f2814a;

    public final x f2815b;

    public s(x xVar, int i10) {
        this.f2814a = i10;
        this.f2815b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f2814a) {
            case 0:
                this.f2815b.dismiss();
                break;
            default:
                this.f2815b.onBackPressed();
                break;
        }
    }
}
