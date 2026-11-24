package defpackage;
public final class ejb implements Runnable {
    public final byte a;
    public final gjb b;
    public final fjb c;

    public ejb(gjb gjbVar, fjb fjbVar, byte b) {
        this.a = b;
        this.b = gjbVar;
        this.c = fjbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fjb fjbVar = this.c;
        gjb gjbVar = this.b;
        switch (b) {
            case 0:
                gjbVar.a(fjbVar);
                return;
            case 1:
                gjbVar.a(fjbVar);
                return;
            default:
                gjbVar.a(fjbVar);
                return;
        }
    }
}
