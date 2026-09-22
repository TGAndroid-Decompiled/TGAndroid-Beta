package nf;
public class e {
    public Runnable f15441a;
    public Runnable f15442b;
    public Runnable f15443c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15441a = runnable;
        this.f15443c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15442b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15443c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15441a;
        if (runnable != null) {
            runnable.run();
            this.f15441a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15442b = runnable;
    }
}
