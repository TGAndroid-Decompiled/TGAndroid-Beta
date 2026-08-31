package af;
public class f {
    public Runnable f179a;
    public Runnable f180b;
    public Runnable f181c;

    public f(Runnable runnable, Runnable runnable2) {
        this.f179a = runnable;
        this.f181c = runnable2;
    }

    public final void a(boolean z4) {
        Runnable runnable = this.f180b;
        if (runnable != null) {
            runnable.run();
        }
        c(z4);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z4) {
        Runnable runnable = this.f181c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f179a;
        if (runnable != null) {
            runnable.run();
            this.f179a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f180b = runnable;
    }
}
