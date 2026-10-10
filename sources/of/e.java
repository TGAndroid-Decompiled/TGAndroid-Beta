package of;
public class e {
    public Runnable f17121a;
    public Runnable f17122b;
    public Runnable f17123c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f17121a = runnable;
        this.f17123c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f17122b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f17123c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f17121a;
        if (runnable != null) {
            runnable.run();
            this.f17121a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f17122b = runnable;
    }
}
