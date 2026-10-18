package n2;
public final class i implements Runnable {
    public final int f17051a;
    public final k f17052b;
    public final Object f17053c;

    public i(k kVar, l lVar, int i10) {
        this.f17051a = i10;
        this.f17052b = kVar;
        this.f17053c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f17051a) {
            case 0:
                k kVar = this.f17052b;
                this.f17053c.h(kVar.f17056a, kVar.f17057b);
                return;
            default:
                k kVar2 = this.f17052b;
                this.f17053c.j(kVar2.f17056a, kVar2.f17057b);
                return;
        }
    }
}
