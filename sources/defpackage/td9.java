package defpackage;
public final class td9 implements Runnable {
    public final byte a;
    public final ye9 b;
    public final int c;
    public final int d;

    public td9(ye9 ye9Var, int i, int i2, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.U1(this.c, this.d);
                return;
            default:
                this.b.g4(this.c, this.d);
                return;
        }
    }
}
