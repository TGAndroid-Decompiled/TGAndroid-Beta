package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
public class o2d extends c3f {
    public final WindowInsetsController a;
    public final Window b;

    public o2d(Window window, ve9 ve9Var) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override
    public final void a() {
        this.a.hide(519);
    }

    @Override
    public final void b() {
        g(16);
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override
    public final void c(boolean z) {
        if (z) {
            f(8192);
            this.a.setSystemBarsAppearance(8, 8);
            return;
        }
        g(8192);
        this.a.setSystemBarsAppearance(0, 8);
    }

    @Override
    public void d() {
        this.b.getDecorView().setTag(356039078, 2);
        g(2048);
        f(4096);
    }

    @Override
    public final void e() {
        this.a.show(519);
    }

    public final void f(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    public final void g(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
