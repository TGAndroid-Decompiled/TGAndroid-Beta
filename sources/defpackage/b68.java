package defpackage;
public final class b68 implements Runnable {
    public final byte a;
    public final w9b b;

    public b68(w9b w9bVar, byte b) {
        this.a = b;
        this.b = w9bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        w9b w9bVar = this.b;
        switch (b) {
            case 0:
                w9bVar.dismiss();
                return;
            case 1:
                w9bVar.dismiss();
                return;
            default:
                w9bVar.onBackPressed();
                return;
        }
    }
}
