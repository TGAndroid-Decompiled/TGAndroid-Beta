package oi;
public final class m2 implements Runnable {
    public final int f22177a;
    public final s3 f22178b;
    public final int f22179c;
    public final int d;

    public m2(s3 s3Var, int i7, int i10, int i11) {
        this.f22177a = i11;
        this.f22178b = s3Var;
        this.f22179c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22177a) {
            case 0:
                this.f22178b.c2(this.f22179c, this.d);
                return;
            default:
                this.f22178b.j4(this.f22179c, this.d);
                return;
        }
    }
}
