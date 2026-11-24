package defpackage;
public final class bj4 implements Runnable {
    public final byte a;
    public final akb b;

    public bj4(akb akbVar, byte b) {
        this.a = b;
        this.b = akbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        akb akbVar = this.b;
        switch (b) {
            case 0:
                kk7.e().k(273, akbVar, Boolean.TRUE, null, -1);
                return;
            default:
                akbVar.r();
                return;
        }
    }
}
