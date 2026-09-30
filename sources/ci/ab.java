package ci;
public final class ab implements Runnable {
    public final int f4362a;
    public final lc f4363b;

    public ab(lc lcVar, int i10) {
        this.f4362a = i10;
        this.f4363b = lcVar;
    }

    @Override
    public final void run() {
        switch (this.f4362a) {
            case 0:
                lc lcVar = this.f4363b;
                lcVar.getClass();
                lcVar.g(1.0f, true, new ha(lcVar, 6));
                lcVar.f5038b1.b(true, true);
                return;
            default:
                lc lcVar2 = this.f4363b;
                lcVar2.f(false);
                lcVar2.f5072m2 = null;
                return;
        }
    }
}
