package nf;
public class e {
    public Runnable f15421a;
    public Runnable f15422b;
    public Runnable f15423c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15421a = runnable;
        this.f15423c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15422b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15423c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15421a;
        if (runnable != null) {
            runnable.run();
            this.f15421a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15422b = runnable;
    }
}
