package nf;
public class e {
    public Runnable f15184a;
    public Runnable f15185b;
    public Runnable f15186c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15184a = runnable;
        this.f15186c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15185b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15186c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15184a;
        if (runnable != null) {
            runnable.run();
            this.f15184a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15185b = runnable;
    }
}
