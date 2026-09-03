package o3;
public final class k implements Runnable {
    public final int f16249a;
    public final m f16250b;
    public final Object f16251c;

    public k(m mVar, n nVar, int i10) {
        this.f16249a = i10;
        this.f16250b = mVar;
        this.f16251c = nVar;
    }

    @Override
    public final void run() {
        switch (this.f16249a) {
            case 0:
                m mVar = this.f16250b;
                this.f16251c.l(mVar.f16254a, mVar.f16255b);
                return;
            case 1:
                m mVar2 = this.f16250b;
                this.f16251c.j(mVar2.f16254a, mVar2.f16255b);
                return;
            default:
                m mVar3 = this.f16250b;
                this.f16251c.b(mVar3.f16254a, mVar3.f16255b);
                return;
        }
    }
}
