package nf;
public class e {
    public Runnable f15207a;
    public Runnable f15208b;
    public Runnable f15209c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15207a = runnable;
        this.f15209c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15208b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15209c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15207a;
        if (runnable != null) {
            runnable.run();
            this.f15207a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15208b = runnable;
    }
}
