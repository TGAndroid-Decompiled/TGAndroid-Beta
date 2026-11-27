package defpackage;
public final class dnb implements Runnable {
    public final byte a;
    public final fnb b;
    public final enb c;

    public dnb(fnb fnbVar, enb enbVar, byte b) {
        this.a = b;
        this.b = fnbVar;
        this.c = enbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        enb enbVar = this.c;
        fnb fnbVar = this.b;
        switch (b) {
            case 0:
                fnbVar.a(enbVar);
                return;
            case 1:
                fnbVar.a(enbVar);
                return;
            default:
                fnbVar.a(enbVar);
                return;
        }
    }
}
