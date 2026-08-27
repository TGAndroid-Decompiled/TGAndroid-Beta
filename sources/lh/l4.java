package lh;

public final class l4 implements Runnable {

    public final int f16308a;

    public final f6 f16309b;

    public final zf.c2 f16310c;

    public l4(f6 f6Var, zf.c2 c2Var, int i10) {
        this.f16308a = i10;
        this.f16309b = f6Var;
        this.f16310c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f16308a) {
            case 0:
                this.f16309b.D0(this.f16310c, true);
                break;
            default:
                this.f16309b.C0(this.f16310c);
                break;
        }
    }
}
