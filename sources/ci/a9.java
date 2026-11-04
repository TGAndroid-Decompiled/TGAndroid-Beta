package ci;

import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
public final class a9 implements Runnable {
    public final int f4836a;
    public final c9 f4837b;

    public a9(c9 c9Var, int i3) {
        this.f4836a = i3;
        this.f4837b = c9Var;
    }

    @Override
    public final void run() {
        int i3 = this.f4836a;
        c9 c9Var = this.f4837b;
        switch (i3) {
            case 0:
                c9Var.b();
                return;
            case 1:
                c9Var.a();
                return;
            default:
                org.telegram.ui.Components.ac acVar = c9Var.d;
                e9 e9Var = c9Var.f4936q;
                a9 a9Var = c9Var.f4935p;
                zi ziVar = c9Var.f4923b;
                if (!c9Var.f4931l) {
                    c9Var.f4931l = true;
                    ziVar.f((int) c9Var.f4930k, c9Var.c(), true);
                    long j10 = e9Var.f5034g;
                    int i10 = e9Var.f5029a;
                    e9Var.f5034g = j10 + c9Var.f4930k;
                    hs.f(i10).k(221, new Object[0]);
                    c9Var.f4930k = 0L;
                    hs.f(i10).k(103, Long.valueOf(zi.B0(ziVar.f26868k)), Integer.valueOf(ziVar.f1()), ziVar.f26868k.reactions);
                }
                if (!c9Var.f4932m) {
                    c9Var.f4932m = true;
                    c9Var.f4926f.f38376b = 5000L;
                    org.telegram.messenger.g0.r(a9Var);
                    org.telegram.messenger.g0.i3(a9Var, 5000L);
                    acVar.k(true);
                    acVar.v = a9Var;
                }
                c9Var.f4925e.f38714b.setText(c9Var.d());
                return;
        }
    }
}
