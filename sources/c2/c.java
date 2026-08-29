package c2;
public final class c implements Runnable {
    public final int f2797a;
    public final androidx.emoji2.text.o f2798b;
    public final int f2799c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f2797a = i11;
        this.f2798b = oVar;
        this.f2799c = i10;
    }

    @Override
    public final void run() {
        switch (this.f2797a) {
            case 0:
                b0 b0Var = ((e) ((androidx.biometric.e) this.f2798b.f1369f).d).d;
                if (b0Var != null) {
                    b0Var.j(this.f2799c);
                    return;
                }
                return;
            default:
                b0 b0Var2 = ((e) ((androidx.biometric.e) this.f2798b.f1369f).d).d;
                if (b0Var2 != null) {
                    b0Var2.k(this.f2799c);
                    return;
                }
                return;
        }
    }
}
