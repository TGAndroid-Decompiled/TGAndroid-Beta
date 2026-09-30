package nf;
public class e {
    public Runnable f15452a;
    public Runnable f15453b;
    public Runnable f15454c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15452a = runnable;
        this.f15454c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15453b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15454c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15452a;
        if (runnable != null) {
            runnable.run();
            this.f15452a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15453b = runnable;
    }
}
