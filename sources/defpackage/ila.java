package defpackage;
public final class ila implements Runnable {
    public final byte a;
    public final ema b;

    public ila(ema emaVar, byte b) {
        this.a = b;
        this.b = emaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ema emaVar = this.b;
        switch (b) {
            case 0:
                emaVar.setVisibility(8);
                return;
            default:
                emaVar.setVisibility(8);
                return;
        }
    }
}
