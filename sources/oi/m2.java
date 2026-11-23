package oi;
public final class m2 implements Runnable {
    public final int f22203a;
    public final s3 f22204b;
    public final int f22205c;
    public final int d;

    public m2(s3 s3Var, int i7, int i10, int i11) {
        this.f22203a = i11;
        this.f22204b = s3Var;
        this.f22205c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22203a) {
            case 0:
                this.f22204b.c2(this.f22205c, this.d);
                return;
            default:
                this.f22204b.j4(this.f22205c, this.d);
                return;
        }
    }
}
