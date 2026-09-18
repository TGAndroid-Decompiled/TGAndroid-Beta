package nf;
public class e {
    public Runnable f15219a;
    public Runnable f15220b;
    public Runnable f15221c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f15219a = runnable;
        this.f15221c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f15220b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f15221c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f15219a;
        if (runnable != null) {
            runnable.run();
            this.f15219a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f15220b = runnable;
    }
}
