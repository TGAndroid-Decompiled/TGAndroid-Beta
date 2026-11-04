package ci;
public final class b9 implements Runnable {
    public final int f4884a;
    public final c9 f4885b;
    public final long f4886c;

    public b9(c9 c9Var, long j10, int i3) {
        this.f4884a = i3;
        this.f4885b = c9Var;
        this.f4886c = j10;
    }

    @Override
    public final void run() {
        switch (this.f4884a) {
            case 0:
                c9 c9Var = this.f4885b;
                c9Var.f4936q.b0(c9Var.f4923b, c9Var.f4924c, this.f4886c, true, true, c9Var.f4933n);
                return;
            default:
                c9 c9Var2 = this.f4885b;
                c9Var2.f4936q.b0(c9Var2.f4923b, c9Var2.f4924c, this.f4886c, true, true, c9Var2.f4933n);
                return;
        }
    }
}
