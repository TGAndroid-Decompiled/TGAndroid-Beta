package fi;
public final class p3 implements Runnable {
    public final int f11434a;
    public final s3 f11435b;

    public p3(s3 s3Var, int i10) {
        this.f11434a = i10;
        this.f11435b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f11434a) {
            case 0:
                this.f11435b.dismiss();
                return;
            default:
                s3.m(this.f11435b);
                return;
        }
    }
}
