package defpackage;
public final class joc implements Runnable {
    public final byte a;
    public final moc b;

    public joc(moc mocVar, byte b) {
        this.a = b;
        this.b = mocVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        moc mocVar = this.b;
        switch (b) {
            case 0:
                mocVar.performClick();
                return;
            default:
                mocVar.h.invalidate();
                mocVar.n.invalidate();
                mocVar.e.invalidate();
                return;
        }
    }
}
