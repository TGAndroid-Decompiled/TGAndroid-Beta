package hi;
public final class l9 implements Runnable {
    public final int f14966a;
    public final ta f14967b;

    public l9(ta taVar, int i7) {
        this.f14966a = i7;
        this.f14967b = taVar;
    }

    @Override
    public final void run() {
        switch (this.f14966a) {
            case 0:
                ta taVar = this.f14967b;
                taVar.getClass();
                taVar.f(1.0f, true, new s8(taVar, 6));
                taVar.f15433c1.b(true, true);
                return;
            default:
                ta taVar2 = this.f14967b;
                taVar2.e(false);
                taVar2.f15466n2 = null;
                return;
        }
    }
}
