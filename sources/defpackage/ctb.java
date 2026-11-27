package defpackage;
public final class ctb implements Runnable {
    public final byte a;
    public final ktb b;

    public ctb(ktb ktbVar, byte b) {
        this.a = b;
        this.b = ktbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ktb ktbVar = this.b;
        switch (b) {
            case 0:
                ktbVar.b(false);
                return;
            case 1:
                ktbVar.c();
                return;
            default:
                ktbVar.b(false);
                return;
        }
    }
}
