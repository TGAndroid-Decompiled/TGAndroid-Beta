package defpackage;
public final class c1a implements Runnable {
    public final byte a;
    public final d1a b;

    public c1a(d1a d1aVar, byte b) {
        this.a = b;
        this.b = d1aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d1a d1aVar = this.b;
        switch (b) {
            case 0:
                d1aVar.dismiss();
                return;
            default:
                d1aVar.b();
                return;
        }
    }
}
