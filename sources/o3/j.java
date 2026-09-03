package o3;
public final class j implements Runnable {
    public final int f16407a;
    public final l f16408b;
    public final Object f16409c;

    public j(l lVar, m mVar, int i10) {
        this.f16407a = i10;
        this.f16408b = lVar;
        this.f16409c = mVar;
    }

    @Override
    public final void run() {
        switch (this.f16407a) {
            case 0:
                l lVar = this.f16408b;
                this.f16409c.k(lVar.f16412a, lVar.f16413b);
                return;
            case 1:
                l lVar2 = this.f16408b;
                this.f16409c.j(lVar2.f16412a, lVar2.f16413b);
                return;
            default:
                l lVar3 = this.f16408b;
                this.f16409c.b(lVar3.f16412a, lVar3.f16413b);
                return;
        }
    }
}
