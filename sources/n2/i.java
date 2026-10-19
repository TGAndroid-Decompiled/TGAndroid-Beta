package n2;
public final class i implements Runnable {
    public final int f17052a;
    public final k f17053b;
    public final Object f17054c;

    public i(k kVar, l lVar, int i10) {
        this.f17052a = i10;
        this.f17053b = kVar;
        this.f17054c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f17052a) {
            case 0:
                k kVar = this.f17053b;
                this.f17054c.h(kVar.f17057a, kVar.f17058b);
                return;
            default:
                k kVar2 = this.f17053b;
                this.f17054c.j(kVar2.f17057a, kVar2.f17058b);
                return;
        }
    }
}
