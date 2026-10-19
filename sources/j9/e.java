package j9;
public final class e implements Runnable {
    public final o f14339a;
    public final y f14340b;

    public e(o oVar, y yVar) {
        this.f14339a = oVar;
        this.f14340b = yVar;
    }

    @Override
    public final void run() {
        if (this.f14339a.f14353a == this) {
            if (o.f14352f.b(this.f14339a, this, o.j(this.f14340b))) {
                o.g(this.f14339a, false);
            }
        }
    }
}
