package defpackage;
public final class cqb implements Runnable {
    public final byte a;
    public final lqb b;

    public cqb(lqb lqbVar, byte b) {
        this.a = b;
        this.b = lqbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lqb lqbVar = this.b;
        switch (b) {
            case 0:
                jqb jqbVar = lqbVar.N;
                if (jqbVar != null) {
                    long j = jqbVar.a;
                    if (j > 0) {
                        lqbVar.I = j;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fqb fqbVar = lqbVar.a;
                if (fqbVar != null) {
                    fqbVar.V1();
                    return;
                }
                return;
            default:
                fqb fqbVar2 = lqbVar.a;
                if (fqbVar2 != null) {
                    fqbVar2.V();
                    return;
                }
                return;
        }
    }
}
