package n2;
public final class i implements Runnable {
    public final int f17115a;
    public final k f17116b;
    public final Object f17117c;

    public i(k kVar, l lVar, int i10) {
        this.f17115a = i10;
        this.f17116b = kVar;
        this.f17117c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f17115a) {
            case 0:
                k kVar = this.f17116b;
                this.f17117c.h(kVar.f17120a, kVar.f17121b);
                return;
            default:
                k kVar2 = this.f17116b;
                this.f17117c.j(kVar2.f17120a, kVar2.f17121b);
                return;
        }
    }
}
