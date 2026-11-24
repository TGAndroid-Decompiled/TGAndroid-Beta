package defpackage;
public final class jba implements Runnable {
    public final byte a;
    public final lba b;

    public jba(lba lbaVar, byte b) {
        this.a = b;
        this.b = lbaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lba lbaVar = this.b;
        switch (b) {
            case 0:
                lbaVar.post(new jba(lbaVar, (byte) 1));
                return;
            default:
                lbaVar.c0.N0 = true;
                lbaVar.I.clear();
                lbaVar.J.clear();
                lbaVar.K.clear();
                lbaVar.invalidate();
                return;
        }
    }
}
