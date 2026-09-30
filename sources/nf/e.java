package nf;
public class e {
    public Runnable f15437a;
    public Runnable f15438b;
    public Runnable f15439c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15437a = runnable;
        this.f15439c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15438b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15439c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15437a;
        if (runnable != null) {
            runnable.run();
            this.f15437a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15438b = runnable;
    }
}
