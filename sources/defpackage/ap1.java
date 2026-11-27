package defpackage;
public final class ap1 implements Runnable {
    public final byte a = 1;
    public final byte b;
    public final zu1 c;
    public final boolean d;

    public ap1(int i, zu1 zu1Var, boolean z) {
        this.b = i;
        this.c = zu1Var;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        zu1 zu1Var = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                zu1Var.gd(b2, z);
                return;
            default:
                if (b2 != 2) {
                    zu1Var.ka();
                    zu1Var.Dc();
                }
                gp2.f(d31.b0(zu1Var), b2, z);
                return;
        }
    }

    public ap1(zu1 zu1Var, boolean z, int i) {
        this.c = zu1Var;
        this.d = z;
        this.b = i;
    }
}
