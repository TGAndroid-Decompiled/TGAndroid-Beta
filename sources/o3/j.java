package o3;
public final class j implements Runnable {
    public final int f16405a;
    public final l f16406b;
    public final Object f16407c;

    public j(l lVar, m mVar, int i10) {
        this.f16405a = i10;
        this.f16406b = lVar;
        this.f16407c = mVar;
    }

    @Override
    public final void run() {
        switch (this.f16405a) {
            case 0:
                l lVar = this.f16406b;
                this.f16407c.k(lVar.f16410a, lVar.f16411b);
                return;
            case 1:
                l lVar2 = this.f16406b;
                this.f16407c.j(lVar2.f16410a, lVar2.f16411b);
                return;
            default:
                l lVar3 = this.f16406b;
                this.f16407c.b(lVar3.f16410a, lVar3.f16411b);
                return;
        }
    }
}
