package ci;
public final class ab implements Runnable {
    public final int f4733a;
    public final lc f4734b;

    public ab(lc lcVar, int i10) {
        this.f4733a = i10;
        this.f4734b = lcVar;
    }

    @Override
    public final void run() {
        switch (this.f4733a) {
            case 0:
                lc lcVar = this.f4734b;
                lcVar.getClass();
                lcVar.f(1.0f, true, new ha(lcVar, 6));
                lcVar.f5463b1.b(true, true);
                return;
            default:
                lc lcVar2 = this.f4734b;
                lcVar2.e(false);
                lcVar2.f5498m2 = null;
                return;
        }
    }
}
