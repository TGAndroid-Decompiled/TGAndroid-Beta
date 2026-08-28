package kh;
public final class fa implements Runnable {
    public final int f15238a;
    public final wb f15239b;
    public final boolean f15240c;

    public fa(wb wbVar, boolean z10, int i9) {
        this.f15238a = i9;
        this.f15239b = wbVar;
        this.f15240c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15238a) {
            case 0:
                this.f15239b.f(this.f15240c);
                return;
            case 1:
                wb wbVar = this.f15239b;
                if (!this.f15240c) {
                    wbVar.F0.b(false, false);
                    return;
                } else {
                    wbVar.getClass();
                    return;
                }
            default:
                wb wbVar2 = this.f15239b;
                wbVar2.N = null;
                wbVar2.f16260e = false;
                wbVar2.q(this.f15240c);
                return;
        }
    }
}
