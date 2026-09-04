package of;
public class e {
    public Runnable f17003a;
    public Runnable f17004b;
    public Runnable f17005c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f17003a = runnable;
        this.f17005c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f17004b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f17005c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f17003a;
        if (runnable != null) {
            runnable.run();
            this.f17003a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f17004b = runnable;
    }
}
