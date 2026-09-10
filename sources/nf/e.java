package nf;
public class e {
    public Runnable f14039a;
    public Runnable f14040b;
    public Runnable f14041c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f14039a = runnable;
        this.f14041c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f14040b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f14041c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f14039a;
        if (runnable != null) {
            runnable.run();
            this.f14039a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f14040b = runnable;
    }
}
