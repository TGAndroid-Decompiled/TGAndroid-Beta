package nf;
public class e {
    public Runnable f15471a;
    public Runnable f15472b;
    public Runnable f15473c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15471a = runnable;
        this.f15473c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15472b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15473c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15471a;
        if (runnable != null) {
            runnable.run();
            this.f15471a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15472b = runnable;
    }
}
