package nf;
public class e {
    public Runnable f15428a;
    public Runnable f15429b;
    public Runnable f15430c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15428a = runnable;
        this.f15430c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15429b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15430c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15428a;
        if (runnable != null) {
            runnable.run();
            this.f15428a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15429b = runnable;
    }
}
