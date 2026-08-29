package nh;
public final class h4 implements Runnable {
    public final int f17839a;
    public final t5 f17840b;
    public final bg.f3 f17841c;

    public h4(t5 t5Var, bg.f3 f3Var, int i10) {
        this.f17839a = i10;
        this.f17840b = t5Var;
        this.f17841c = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f17839a) {
            case 0:
                this.f17840b.D0(this.f17841c, true);
                return;
            default:
                this.f17840b.C0(this.f17841c);
                return;
        }
    }
}
