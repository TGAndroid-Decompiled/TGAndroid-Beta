package defpackage;
public final class s5b implements Runnable {
    public final byte a;
    public final v5b b;

    public s5b(v5b v5bVar, byte b) {
        this.a = b;
        this.b = v5bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v5b v5bVar = this.b;
        switch (b) {
            case 0:
                v5bVar.u = false;
                v5bVar.w = true;
                jn7.f(v5bVar.c).k(330, v5bVar, Boolean.FALSE);
                return;
            case 1:
                v5bVar.z = false;
                return;
            case 2:
                v5bVar.k.clear();
                v5bVar.d(true);
                return;
            default:
                jn7.f(v5bVar.c).k(330, v5bVar);
                return;
        }
    }
}
