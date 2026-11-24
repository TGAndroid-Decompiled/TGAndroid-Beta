package defpackage;

import android.view.View;
import android.view.Window;
public class xzc extends m0f {
    public final Window a;
    public final x59 b;

    public xzc(Window window, x59 x59Var) {
        this.a = window;
        this.b = x59Var;
    }

    @Override
    public final void a() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 8) {
                            ((et8) this.b.b).o();
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
                            ((et8) this.b.b).r();
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
