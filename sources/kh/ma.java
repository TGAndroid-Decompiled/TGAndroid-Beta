package kh;
public final class ma implements Runnable {
    public final int f15711a;
    public final wb f15712b;

    public ma(wb wbVar, int i9) {
        this.f15711a = i9;
        this.f15712b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f15711a) {
            case 0:
                wb wbVar = this.f15712b;
                wbVar.getClass();
                wbVar.g(1.0f, true, new v9(wbVar, 6));
                wbVar.X0.b(true, true);
                return;
            default:
                wb wbVar2 = this.f15712b;
                wbVar2.f(false);
                wbVar2.f16276i2 = null;
                return;
        }
    }
}
