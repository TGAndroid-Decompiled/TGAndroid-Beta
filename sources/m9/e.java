package m9;
public final class e implements Runnable {
    public final o f20959a;
    public final y f20960b;

    public e(o oVar, y yVar) {
        this.f20959a = oVar;
        this.f20960b = yVar;
    }

    @Override
    public final void run() {
        if (this.f20959a.f20975a == this) {
            if (o.f20974f.b(this.f20959a, this, o.j(this.f20960b))) {
                o.g(this.f20959a, false);
            }
        }
    }
}
