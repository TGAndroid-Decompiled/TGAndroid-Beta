package defpackage;
public final class flb implements Runnable {
    public final byte a;
    public final hlb b;
    public final glb c;

    public flb(hlb hlbVar, glb glbVar, byte b) {
        this.a = b;
        this.b = hlbVar;
        this.c = glbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        glb glbVar = this.c;
        hlb hlbVar = this.b;
        switch (b) {
            case 0:
                hlbVar.a(glbVar);
                return;
            case 1:
                hlbVar.a(glbVar);
                return;
            default:
                hlbVar.a(glbVar);
                return;
        }
    }
}
