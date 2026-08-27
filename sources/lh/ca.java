package lh;

public final class ca implements Runnable {

    public final int f15758a;

    public final sb f15759b;

    public final boolean f15760c;

    public ca(sb sbVar, boolean z10, int i10) {
        this.f15758a = i10;
        this.f15759b = sbVar;
        this.f15760c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15758a) {
            case 0:
                this.f15759b.f(this.f15760c);
                break;
            case 1:
                sb sbVar = this.f15759b;
                if (!this.f15760c) {
                    sbVar.F0.b(false, false);
                } else {
                    sbVar.getClass();
                }
                break;
            default:
                sb sbVar2 = this.f15759b;
                sbVar2.N = null;
                sbVar2.f16756e = false;
                sbVar2.q(this.f15760c);
                break;
        }
    }
}
