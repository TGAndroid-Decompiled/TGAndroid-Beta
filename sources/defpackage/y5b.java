package defpackage;
public final class y5b implements Runnable {
    public final byte a;
    public final b6b b;

    public y5b(b6b b6bVar, byte b) {
        this.a = b;
        this.b = b6bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        b6b b6bVar = this.b;
        switch (b) {
            case 0:
                b6bVar.e();
                return;
            default:
                b6bVar.b();
                return;
        }
    }
}
