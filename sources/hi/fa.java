package hi;
public final class fa implements Runnable {
    public final int f14506a;
    public final nb f14507b;

    public fa(nb nbVar, int i7) {
        this.f14506a = i7;
        this.f14507b = nbVar;
    }

    @Override
    public final void run() {
        switch (this.f14506a) {
            case 0:
                nb nbVar = this.f14507b;
                nbVar.getClass();
                nbVar.f(1.0f, true, new m9(nbVar, 6));
                nbVar.f15064c1.b(true, true);
                return;
            default:
                nb nbVar2 = this.f14507b;
                nbVar2.e(false);
                nbVar2.f15097n2 = null;
                return;
        }
    }
}
