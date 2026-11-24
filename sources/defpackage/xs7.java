package defpackage;
public final class xs7 implements Runnable {
    public final byte a;
    public final x6b b;

    public xs7(x6b x6bVar, byte b) {
        this.a = b;
        this.b = x6bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x6b x6bVar = this.b;
        switch (b) {
            case 0:
                mt7 mt7Var = x6bVar.e2;
                if (mt7Var != null) {
                    mt7Var.I0();
                    return;
                }
                return;
            default:
                x6bVar.u2.q1.setVisibility(8);
                return;
        }
    }
}
