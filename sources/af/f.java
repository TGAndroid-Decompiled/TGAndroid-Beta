package af;
public class f {
    public Runnable f164a;
    public Runnable f165b;
    public Runnable f166c;

    public f(Runnable runnable, Runnable runnable2) {
        this.f164a = runnable;
        this.f166c = runnable2;
    }

    public final void a(boolean z4) {
        Runnable runnable = this.f165b;
        if (runnable != null) {
            runnable.run();
        }
        c(z4);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z4) {
        Runnable runnable = this.f166c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f164a;
        if (runnable != null) {
            runnable.run();
            this.f164a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f165b = runnable;
    }
}
