package gf;

import org.telegram.messenger.o7;
public class e {
    public Runnable f7485a;
    public Runnable f7486b;
    public Runnable f7487c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f7485a = runnable;
        this.f7487c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f7486b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f7487c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f7485a;
        if (runnable != null) {
            runnable.run();
            this.f7485a = null;
        }
    }

    public final void e(o7 o7Var) {
        this.f7486b = o7Var;
    }
}
