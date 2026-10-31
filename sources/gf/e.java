package gf;

import org.telegram.messenger.o7;
public class e {
    public Runnable f7484a;
    public Runnable f7485b;
    public Runnable f7486c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f7484a = runnable;
        this.f7486c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f7485b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f7486c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f7484a;
        if (runnable != null) {
            runnable.run();
            this.f7484a = null;
        }
    }

    public final void e(o7 o7Var) {
        this.f7485b = o7Var;
    }
}
