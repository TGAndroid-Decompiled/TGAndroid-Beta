package defpackage;
public final class cpb implements Runnable {
    public final byte a;
    public final jpb b;

    public cpb(jpb jpbVar, byte b) {
        this.a = b;
        this.b = jpbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jpb jpbVar = this.b;
        switch (b) {
            case 0:
                jpbVar.b(false);
                return;
            case 1:
                jpbVar.c();
                return;
            default:
                jpbVar.b(false);
                return;
        }
    }
}
