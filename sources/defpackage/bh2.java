package defpackage;
public final class bh2 implements Runnable {
    public final byte a;
    public final ch2 b;

    public bh2(ch2 ch2Var, byte b) {
        this.a = b;
        this.b = ch2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ch2 ch2Var = this.b;
        switch (b) {
            case 0:
                wa waVar = ch2Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
                    return;
                }
                return;
            default:
                wa waVar2 = ch2Var.a;
                if (waVar2 != null) {
                    waVar2.g3.O(true);
                    return;
                }
                return;
        }
    }
}
