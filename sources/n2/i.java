package n2;
public final class i implements Runnable {
    public final int f17054a;
    public final k f17055b;
    public final Object f17056c;

    public i(k kVar, l lVar, int i10) {
        this.f17054a = i10;
        this.f17055b = kVar;
        this.f17056c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f17054a) {
            case 0:
                k kVar = this.f17055b;
                this.f17056c.h(kVar.f17059a, kVar.f17060b);
                return;
            default:
                k kVar2 = this.f17055b;
                this.f17056c.j(kVar2.f17059a, kVar2.f17060b);
                return;
        }
    }
}
