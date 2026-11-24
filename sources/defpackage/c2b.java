package defpackage;
public final class c2b implements Runnable {
    public final byte a;
    public final f2b b;

    public c2b(f2b f2bVar, byte b) {
        this.a = b;
        this.b = f2bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f2b f2bVar = this.b;
        switch (b) {
            case 0:
                f2bVar.e();
                return;
            default:
                f2bVar.b();
                return;
        }
    }
}
