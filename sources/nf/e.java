package nf;
public class e {
    public Runnable f16876a;
    public Runnable f16877b;
    public Runnable f16878c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f16876a = runnable;
        this.f16878c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f16877b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f16878c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f16876a;
        if (runnable != null) {
            runnable.run();
            this.f16876a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f16877b = runnable;
    }
}
