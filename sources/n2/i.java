package n2;
public final class i implements Runnable {
    public final int f17048a;
    public final k f17049b;
    public final Object f17050c;

    public i(k kVar, l lVar, int i10) {
        this.f17048a = i10;
        this.f17049b = kVar;
        this.f17050c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f17048a) {
            case 0:
                k kVar = this.f17049b;
                this.f17050c.h(kVar.f17053a, kVar.f17054b);
                return;
            default:
                k kVar2 = this.f17049b;
                this.f17050c.j(kVar2.f17053a, kVar2.f17054b);
                return;
        }
    }
}
