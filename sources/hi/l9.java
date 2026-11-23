package hi;
public final class l9 implements Runnable {
    public final int f14953a;
    public final ta f14954b;

    public l9(ta taVar, int i7) {
        this.f14953a = i7;
        this.f14954b = taVar;
    }

    @Override
    public final void run() {
        switch (this.f14953a) {
            case 0:
                ta taVar = this.f14954b;
                taVar.getClass();
                taVar.f(1.0f, true, new s8(taVar, 6));
                taVar.f15397c1.b(true, true);
                return;
            default:
                ta taVar2 = this.f14954b;
                taVar2.e(false);
                taVar2.f15430n2 = null;
                return;
        }
    }
}
