package of;
public class e {
    public Runnable f17167a;
    public Runnable f17168b;
    public Runnable f17169c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f17167a = runnable;
        this.f17169c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f17168b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f17169c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f17167a;
        if (runnable != null) {
            runnable.run();
            this.f17167a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f17168b = runnable;
    }
}
