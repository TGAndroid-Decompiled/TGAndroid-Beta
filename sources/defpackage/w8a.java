package defpackage;
public final class w8a implements Runnable {
    public final byte a;
    public final x8a b;

    public w8a(x8a x8aVar, byte b) {
        this.a = b;
        this.b = x8aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x8a x8aVar = this.b;
        switch (b) {
            case 0:
                if (x8aVar.x) {
                    x8aVar.d();
                    return;
                }
                return;
            default:
                x8aVar.invalidateSelf();
                return;
        }
    }
}
