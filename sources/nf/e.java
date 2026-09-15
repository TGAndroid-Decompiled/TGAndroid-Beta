package nf;
public class e {
    public Runnable f15209a;
    public Runnable f15210b;
    public Runnable f15211c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15209a = runnable;
        this.f15211c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15210b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15211c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15209a;
        if (runnable != null) {
            runnable.run();
            this.f15209a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15210b = runnable;
    }
}
