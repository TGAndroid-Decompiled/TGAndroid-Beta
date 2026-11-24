package defpackage;
public final class nd9 implements Runnable {
    public final byte a;
    public final ye9 b;
    public final int c;

    public nd9(ye9 ye9Var, int i, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                ye9Var.d4(i);
                return;
            case 1:
                ye9Var.f4(i);
                return;
            case 2:
                ye9Var.scrollBy(0, i);
                return;
            default:
                ye9Var.e4(i);
                return;
        }
    }
}
