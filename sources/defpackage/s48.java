package defpackage;
public final class s48 implements Runnable {
    public final byte a;
    public final a8b b;

    public s48(a8b a8bVar, byte b) {
        this.a = b;
        this.b = a8bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a8b a8bVar = this.b;
        switch (b) {
            case 0:
                a8bVar.dismiss();
                return;
            case 1:
                a8bVar.dismiss();
                return;
            default:
                a8bVar.onBackPressed();
                return;
        }
    }
}
