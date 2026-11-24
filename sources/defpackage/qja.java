package defpackage;
public final class qja implements Runnable {
    public final byte a;
    public final lka b;

    public qja(lka lkaVar, byte b) {
        this.a = b;
        this.b = lkaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lka lkaVar = this.b;
        switch (b) {
            case 0:
                lkaVar.setVisibility(8);
                return;
            default:
                lkaVar.setVisibility(8);
                return;
        }
    }
}
