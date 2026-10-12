package of;
public class e {
    public Runnable f16869a;
    public Runnable f16870b;
    public Runnable f16871c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f16869a = runnable;
        this.f16871c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f16870b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f16871c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f16869a;
        if (runnable != null) {
            runnable.run();
            this.f16869a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f16870b = runnable;
    }
}
