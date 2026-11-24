package defpackage;
public final class drb implements Runnable {
    public final byte a;
    public final krb b;

    public drb(krb krbVar, byte b) {
        this.a = b;
        this.b = krbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        krb krbVar = this.b;
        switch (b) {
            case 0:
                krbVar.b(false);
                return;
            case 1:
                krbVar.c();
                return;
            default:
                krbVar.b(false);
                return;
        }
    }
}
