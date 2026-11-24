package defpackage;
public final class v1b implements Runnable {
    public final byte a;
    public final y1b b;

    public v1b(y1b y1bVar, byte b) {
        this.a = b;
        this.b = y1bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        y1b y1bVar = this.b;
        switch (b) {
            case 0:
                kk7.f(y1bVar.c).k(329, y1bVar);
                return;
            case 1:
                y1bVar.u = false;
                y1bVar.w = true;
                kk7.f(y1bVar.c).k(329, y1bVar, Boolean.FALSE);
                return;
            case 2:
                y1bVar.z = false;
                return;
            default:
                y1bVar.k.clear();
                y1bVar.d(true);
                return;
        }
    }
}
