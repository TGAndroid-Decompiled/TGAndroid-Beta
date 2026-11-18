package hi;
public final class l9 implements Runnable {
    public final int f14963a;
    public final ta f14964b;

    public l9(ta taVar, int i7) {
        this.f14963a = i7;
        this.f14964b = taVar;
    }

    @Override
    public final void run() {
        switch (this.f14963a) {
            case 0:
                ta taVar = this.f14964b;
                taVar.getClass();
                taVar.f(1.0f, true, new s8(taVar, 6));
                taVar.f15430c1.b(true, true);
                return;
            default:
                ta taVar2 = this.f14964b;
                taVar2.e(false);
                taVar2.f15463n2 = null;
                return;
        }
    }
}
