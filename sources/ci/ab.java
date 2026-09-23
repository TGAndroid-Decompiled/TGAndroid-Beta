package ci;
public final class ab implements Runnable {
    public final int f4355a;
    public final lc f4356b;

    public ab(lc lcVar, int i10) {
        this.f4355a = i10;
        this.f4356b = lcVar;
    }

    @Override
    public final void run() {
        switch (this.f4355a) {
            case 0:
                lc lcVar = this.f4356b;
                lcVar.getClass();
                lcVar.g(1.0f, true, new ha(lcVar, 6));
                lcVar.f5031b1.b(true, true);
                return;
            default:
                lc lcVar2 = this.f4356b;
                lcVar2.f(false);
                lcVar2.f5065m2 = null;
                return;
        }
    }
}
