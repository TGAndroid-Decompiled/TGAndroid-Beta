package n2;
public final class i implements Runnable {
    public final int f17055a;
    public final k f17056b;
    public final Object f17057c;

    public i(k kVar, l lVar, int i10) {
        this.f17055a = i10;
        this.f17056b = kVar;
        this.f17057c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f17055a) {
            case 0:
                k kVar = this.f17056b;
                this.f17057c.h(kVar.f17060a, kVar.f17061b);
                return;
            default:
                k kVar2 = this.f17056b;
                this.f17057c.j(kVar2.f17060a, kVar2.f17061b);
                return;
        }
    }
}
