package nf;
public class e {
    public Runnable f16880a;
    public Runnable f16881b;
    public Runnable f16882c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f16880a = runnable;
        this.f16882c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f16881b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f16882c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f16880a;
        if (runnable != null) {
            runnable.run();
            this.f16880a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f16881b = runnable;
    }
}
