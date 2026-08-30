package c2;
public final class c implements Runnable {
    public final int f1902a;
    public final androidx.emoji2.text.p f1903b;
    public final int f1904c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f1902a = i11;
        this.f1903b = pVar;
        this.f1904c = i10;
    }

    @Override
    public final void run() {
        switch (this.f1902a) {
            case 0:
                a0 a0Var = ((e) ((androidx.biometric.e) this.f1903b.f782f).d).d;
                if (a0Var != null) {
                    a0Var.j(this.f1904c);
                    return;
                }
                return;
            default:
                a0 a0Var2 = ((e) ((androidx.biometric.e) this.f1903b.f782f).d).d;
                if (a0Var2 != null) {
                    a0Var2.k(this.f1904c);
                    return;
                }
                return;
        }
    }
}
