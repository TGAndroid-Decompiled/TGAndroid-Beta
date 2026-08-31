package c2;
public final class c implements Runnable {
    public final int f2066a;
    public final androidx.emoji2.text.p f2067b;
    public final int f2068c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f2066a = i11;
        this.f2067b = pVar;
        this.f2068c = i10;
    }

    @Override
    public final void run() {
        switch (this.f2066a) {
            case 0:
                a0 a0Var = ((e) ((androidx.biometric.e) this.f2067b.f851f).d).d;
                if (a0Var != null) {
                    a0Var.j(this.f2068c);
                    return;
                }
                return;
            default:
                a0 a0Var2 = ((e) ((androidx.biometric.e) this.f2067b.f851f).d).d;
                if (a0Var2 != null) {
                    a0Var2.k(this.f2068c);
                    return;
                }
                return;
        }
    }
}
