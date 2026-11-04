package oi;
public final class l implements Runnable {
    public final int f21153a;
    public final q f21154b;

    public l(q qVar, int i3) {
        this.f21153a = i3;
        this.f21154b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f21153a) {
            case 0:
                b bVar = this.f21154b.f21169w;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f21154b.a();
                return;
        }
    }
}
