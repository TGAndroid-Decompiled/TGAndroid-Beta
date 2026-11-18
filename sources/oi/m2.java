package oi;
public final class m2 implements Runnable {
    public final int f22174a;
    public final s3 f22175b;
    public final int f22176c;
    public final int d;

    public m2(s3 s3Var, int i7, int i10, int i11) {
        this.f22174a = i11;
        this.f22175b = s3Var;
        this.f22176c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22174a) {
            case 0:
                this.f22175b.c2(this.f22176c, this.d);
                return;
            default:
                this.f22175b.j4(this.f22176c, this.d);
                return;
        }
    }
}
