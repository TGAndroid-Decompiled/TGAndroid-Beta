package nf;
public class e {
    public Runnable f16885a;
    public Runnable f16886b;
    public Runnable f16887c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f16885a = runnable;
        this.f16887c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f16886b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f16887c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f16885a;
        if (runnable != null) {
            runnable.run();
            this.f16885a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f16886b = runnable;
    }
}
