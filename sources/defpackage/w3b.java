package defpackage;
public final class w3b implements Runnable {
    public final byte a;
    public final z3b b;

    public w3b(z3b z3bVar, byte b) {
        this.a = b;
        this.b = z3bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z3b z3bVar = this.b;
        switch (b) {
            case 0:
                nm7.f(z3bVar.c).k(331, z3bVar);
                return;
            case 1:
                z3bVar.u = false;
                z3bVar.w = true;
                nm7.f(z3bVar.c).k(331, z3bVar, Boolean.FALSE);
                return;
            case 2:
                z3bVar.z = false;
                return;
            default:
                z3bVar.k.clear();
                z3bVar.d(true);
                return;
        }
    }
}
