package defpackage;
public final class a1a implements Runnable {
    public final byte a;
    public final qy b;

    public a1a(qy qyVar, byte b) {
        this.a = b;
        this.b = qyVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qy qyVar = this.b;
        switch (b) {
            case 0:
                hl.E3(((e0a) qyVar.g2).h);
                return;
            default:
                qyVar.requestFocus();
                return;
        }
    }
}
