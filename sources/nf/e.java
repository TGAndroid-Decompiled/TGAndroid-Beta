package nf;
public class e {
    public Runnable f15393a;
    public Runnable f15394b;
    public Runnable f15395c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15393a = runnable;
        this.f15395c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15394b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15395c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15393a;
        if (runnable != null) {
            runnable.run();
            this.f15393a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15394b = runnable;
    }
}
