package o3;
public final class j implements Runnable {
    public final int f16264a;
    public final l f16265b;
    public final Object f16266c;

    public j(l lVar, m mVar, int i10) {
        this.f16264a = i10;
        this.f16265b = lVar;
        this.f16266c = mVar;
    }

    @Override
    public final void run() {
        switch (this.f16264a) {
            case 0:
                l lVar = this.f16265b;
                this.f16266c.k(lVar.f16269a, lVar.f16270b);
                return;
            case 1:
                l lVar2 = this.f16265b;
                this.f16266c.j(lVar2.f16269a, lVar2.f16270b);
                return;
            default:
                l lVar3 = this.f16265b;
                this.f16266c.b(lVar3.f16269a, lVar3.f16270b);
                return;
        }
    }
}
