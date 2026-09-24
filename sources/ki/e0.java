package ki;

import org.telegram.ui.Components.o01;
public final class e0 implements Runnable {
    public final int f13674a;
    public final r0 f13675b;
    public final n0 f13676c;

    public e0(r0 r0Var, n0 n0Var, int i10, int i11) {
        this.f13674a = i11;
        this.f13675b = r0Var;
        this.f13676c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f13674a) {
            case 0:
                r0 r0Var = this.f13675b;
                n0 n0Var = this.f13676c;
                ((o01) r0Var.d).c(n0Var.f13795a);
                return;
            case 1:
                r0 r0Var2 = this.f13675b;
                n0 n0Var2 = this.f13676c;
                ((o01) r0Var2.d).c(n0Var2.f13795a);
                return;
            default:
                r0 r0Var3 = this.f13675b;
                n0 n0Var3 = this.f13676c;
                o0 o0Var = r0Var3.d;
                long j3 = n0Var3.f13795a;
                o01 o01Var = (o01) o0Var;
                synchronized (o01Var) {
                    o01Var.c(j3);
                }
                return;
        }
    }

    public e0(r0 r0Var, n0 n0Var, Exception exc) {
        this.f13674a = 2;
        this.f13675b = r0Var;
        this.f13676c = n0Var;
    }
}
