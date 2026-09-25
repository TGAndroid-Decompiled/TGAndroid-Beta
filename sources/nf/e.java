package nf;
public class e {
    public Runnable f15436a;
    public Runnable f15437b;
    public Runnable f15438c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15436a = runnable;
        this.f15438c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15437b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15438c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15436a;
        if (runnable != null) {
            runnable.run();
            this.f15436a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15437b = runnable;
    }
}
