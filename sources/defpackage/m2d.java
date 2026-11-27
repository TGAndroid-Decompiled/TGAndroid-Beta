package defpackage;

import android.view.View;
import android.view.Window;
public class m2d extends c3f {
    public final Window a;
    public final ve9 b;

    public m2d(Window window, ve9 ve9Var) {
        this.a = window;
        this.b = ve9Var;
    }

    @Override
    public final void a() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 8) {
                            ((pq8) this.b.b).q();
                        }
                    } else {
                        f(2);
                    }
                } else {
                    f(4);
                }
            }
        }
    }

    @Override
    public final void c(boolean z) {
        if (z) {
            Window window = this.a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            f(8192);
            return;
        }
        g(8192);
    }

    @Override
    public final void d() {
        this.a.getDecorView().setTag(356039078, 2);
        g(2048);
        f(4096);
    }

    @Override
    public final void e() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 8) {
                            ((pq8) this.b.b).t();
                        }
                    } else {
                        g(2);
                    }
                } else {
                    g(4);
                    this.a.clearFlags(1024);
                }
            }
        }
    }

    public final void f(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    public final void g(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
