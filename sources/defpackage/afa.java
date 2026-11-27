package defpackage;
public final class afa implements Runnable {
    public final byte a;
    public final cfa b;

    public afa(cfa cfaVar, byte b) {
        this.a = b;
        this.b = cfaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cfa cfaVar = this.b;
        switch (b) {
            case 0:
                cfaVar.post(new afa(cfaVar, (byte) 1));
                return;
            default:
                cfaVar.c0.N0 = true;
                cfaVar.I.clear();
                cfaVar.J.clear();
                cfaVar.K.clear();
                cfaVar.invalidate();
                return;
        }
    }
}
