package c2;
public final class c implements Runnable {
    public final int f1931a;
    public final androidx.emoji2.text.p f1932b;
    public final int f1933c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f1931a = i11;
        this.f1932b = pVar;
        this.f1933c = i10;
    }

    @Override
    public final void run() {
        switch (this.f1931a) {
            case 0:
                b0 b0Var = ((e) ((af.d) this.f1932b.f794f).d).d;
                if (b0Var != null) {
                    b0Var.j(this.f1933c);
                    return;
                }
                return;
            default:
                b0 b0Var2 = ((e) ((af.d) this.f1932b.f794f).d).d;
                if (b0Var2 != null) {
                    b0Var2.k(this.f1933c);
                    return;
                }
                return;
        }
    }
}
