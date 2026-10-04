package nf;
public class e {
    public Runnable f16875a;
    public Runnable f16876b;
    public Runnable f16877c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f16875a = runnable;
        this.f16877c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f16876b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f16877c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f16875a;
        if (runnable != null) {
            runnable.run();
            this.f16875a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f16876b = runnable;
    }
}
