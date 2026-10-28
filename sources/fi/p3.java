package fi;
public final class p3 implements Runnable {
    public final int f11433a;
    public final s3 f11434b;

    public p3(s3 s3Var, int i10) {
        this.f11433a = i10;
        this.f11434b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f11433a) {
            case 0:
                this.f11434b.dismiss();
                return;
            default:
                s3.m(this.f11434b);
                return;
        }
    }
}
