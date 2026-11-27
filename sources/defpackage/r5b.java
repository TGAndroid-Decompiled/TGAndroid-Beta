package defpackage;
public final class r5b implements Runnable {
    public final byte a;
    public final u5b b;

    public r5b(u5b u5bVar, byte b) {
        this.a = b;
        this.b = u5bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        u5b u5bVar = this.b;
        switch (b) {
            case 0:
                u5bVar.u = false;
                u5bVar.w = true;
                jn7.f(u5bVar.c).k(330, u5bVar, Boolean.FALSE);
                return;
            case 1:
                u5bVar.z = false;
                return;
            case 2:
                u5bVar.k.clear();
                u5bVar.d(true);
                return;
            default:
                jn7.f(u5bVar.c).k(330, u5bVar);
                return;
        }
    }
}
